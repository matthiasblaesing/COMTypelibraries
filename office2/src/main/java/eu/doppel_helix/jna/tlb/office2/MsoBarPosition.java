
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBarPosition implements IComEnum {
    
    /**
     * (0)
     */
    msoBarLeft(0),
    
    /**
     * (1)
     */
    msoBarTop(1),
    
    /**
     * (2)
     */
    msoBarRight(2),
    
    /**
     * (3)
     */
    msoBarBottom(3),
    
    /**
     * (4)
     */
    msoBarFloating(4),
    
    /**
     * (5)
     */
    msoBarPopup(5),
    
    /**
     * (6)
     */
    msoBarMenuBar(6),
    ;

    private MsoBarPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}