
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSourceType implements IComEnum {
    
    /**
     * (0)
     */
    xlSourceWorkbook(0),
    
    /**
     * (1)
     */
    xlSourceSheet(1),
    
    /**
     * (2)
     */
    xlSourcePrintArea(2),
    
    /**
     * (3)
     */
    xlSourceAutoFilter(3),
    
    /**
     * (4)
     */
    xlSourceRange(4),
    
    /**
     * (5)
     */
    xlSourceChart(5),
    
    /**
     * (6)
     */
    xlSourcePivotTable(6),
    
    /**
     * (7)
     */
    xlSourceQuery(7),
    ;

    private XlSourceType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}