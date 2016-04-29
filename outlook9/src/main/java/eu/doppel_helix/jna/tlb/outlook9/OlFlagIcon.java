
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFlagIcon implements IComEnum {
    
    /**
     * (0)
     */
    olNoFlagIcon(0),
    
    /**
     * (1)
     */
    olPurpleFlagIcon(1),
    
    /**
     * (2)
     */
    olOrangeFlagIcon(2),
    
    /**
     * (3)
     */
    olGreenFlagIcon(3),
    
    /**
     * (4)
     */
    olYellowFlagIcon(4),
    
    /**
     * (5)
     */
    olBlueFlagIcon(5),
    
    /**
     * (6)
     */
    olRedFlagIcon(6),
    ;

    private OlFlagIcon(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}