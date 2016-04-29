
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPivotTableVersionList implements IComEnum {
    
    /**
     * (0)
     */
    xlPivotTableVersion2000(0),
    
    /**
     * (1)
     */
    xlPivotTableVersion10(1),
    
    /**
     * (2)
     */
    xlPivotTableVersion11(2),
    
    /**
     * (3)
     */
    xlPivotTableVersion12(3),
    
    /**
     * (4)
     */
    xlPivotTableVersion14(4),
    
    /**
     * (5)
     */
    xlPivotTableVersion15(5),
    
    /**
     * (-1)
     */
    xlPivotTableVersionCurrent(-1),
    ;

    private XlPivotTableVersionList(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}