
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTextCaps implements IComEnum {
    
    /**
     * (-2)
     */
    msoCapsMixed(-2),
    
    /**
     * (0)
     */
    msoNoCaps(0),
    
    /**
     * (1)
     */
    msoSmallCaps(1),
    
    /**
     * (2)
     */
    msoAllCaps(2),
    ;

    private MsoTextCaps(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}