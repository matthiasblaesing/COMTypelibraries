
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({4FD8B708-E730-49B5-BDD3-B807F48E5B83})</p>
 */
public enum OlTimeStyle implements IComEnum {
    
    /**
     * TimeOnly (0)
     */
    olTimeStyleTimeOnly(0),
    
    /**
     * TimeDuration (1)
     */
    olTimeStyleTimeDuration(1),
    
    /**
     * ShortDuration (4)
     */
    olTimeStyleShortDuration(4),
    ;

    private OlTimeStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}