
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSlicerCrossFilterType implements IComEnum {
    
    /**
     * (1)
     */
    xlSlicerNoCrossFilter(1),
    
    /**
     * (2)
     */
    xlSlicerCrossFilterShowItemsWithDataAtTop(2),
    
    /**
     * (3)
     */
    xlSlicerCrossFilterShowItemsWithNoData(3),
    
    /**
     * (4)
     */
    xlSlicerCrossFilterHideButtonsWithNoData(4),
    ;

    private XlSlicerCrossFilterType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}