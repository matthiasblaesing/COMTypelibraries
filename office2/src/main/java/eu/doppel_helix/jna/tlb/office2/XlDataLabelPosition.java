
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDataLabelPosition implements IComEnum {
    
    /**
     * (-4108)
     */
    xlLabelPositionCenter(-4108),
    
    /**
     * (0)
     */
    xlLabelPositionAbove(0),
    
    /**
     * (1)
     */
    xlLabelPositionBelow(1),
    
    /**
     * (-4131)
     */
    xlLabelPositionLeft(-4131),
    
    /**
     * (-4152)
     */
    xlLabelPositionRight(-4152),
    
    /**
     * (2)
     */
    xlLabelPositionOutsideEnd(2),
    
    /**
     * (3)
     */
    xlLabelPositionInsideEnd(3),
    
    /**
     * (4)
     */
    xlLabelPositionInsideBase(4),
    
    /**
     * (5)
     */
    xlLabelPositionBestFit(5),
    
    /**
     * (6)
     */
    xlLabelPositionMixed(6),
    
    /**
     * (7)
     */
    xlLabelPositionCustom(7),
    ;

    private XlDataLabelPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}