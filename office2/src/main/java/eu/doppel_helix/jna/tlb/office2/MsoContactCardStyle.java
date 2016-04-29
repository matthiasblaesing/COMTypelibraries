
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0739EEEF-D856-414C-9494-F2F791FD1F22})</p>
 */
public enum MsoContactCardStyle implements IComEnum {
    
    /**
     * (0)
     */
    msoContactCardHover(0),
    
    /**
     * (1)
     */
    msoContactCardFull(1),
    ;

    private MsoContactCardStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}