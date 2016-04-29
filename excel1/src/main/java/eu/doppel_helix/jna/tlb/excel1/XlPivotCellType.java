
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPivotCellType implements IComEnum {
    
    /**
     * (0)
     */
    xlPivotCellValue(0),
    
    /**
     * (1)
     */
    xlPivotCellPivotItem(1),
    
    /**
     * (2)
     */
    xlPivotCellSubtotal(2),
    
    /**
     * (3)
     */
    xlPivotCellGrandTotal(3),
    
    /**
     * (4)
     */
    xlPivotCellDataField(4),
    
    /**
     * (5)
     */
    xlPivotCellPivotField(5),
    
    /**
     * (6)
     */
    xlPivotCellPageFieldItem(6),
    
    /**
     * (7)
     */
    xlPivotCellCustomSubtotal(7),
    
    /**
     * (8)
     */
    xlPivotCellDataPivotField(8),
    
    /**
     * (9)
     */
    xlPivotCellBlankCell(9),
    ;

    private XlPivotCellType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}