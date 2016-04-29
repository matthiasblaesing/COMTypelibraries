
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlSensitivity implements IComEnum {
    
    /**
     * (0)
     */
    olNormal(0),
    
    /**
     * (1)
     */
    olPersonal(1),
    
    /**
     * (2)
     */
    olPrivate(2),
    
    /**
     * (3)
     */
    olConfidential(3),
    ;

    private OlSensitivity(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}