
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBarProtection implements IComEnum {
    
    /**
     * (0)
     */
    msoBarNoProtection(0),
    
    /**
     * (1)
     */
    msoBarNoCustomize(1),
    
    /**
     * (2)
     */
    msoBarNoResize(2),
    
    /**
     * (4)
     */
    msoBarNoMove(4),
    
    /**
     * (8)
     */
    msoBarNoChangeVisible(8),
    
    /**
     * (16)
     */
    msoBarNoChangeDock(16),
    
    /**
     * (32)
     */
    msoBarNoVerticalDock(32),
    
    /**
     * (64)
     */
    msoBarNoHorizontalDock(64),
    ;

    private MsoBarProtection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}