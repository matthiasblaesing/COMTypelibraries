
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlBordersIndex implements IComEnum {
    
    /**
     * (12)
     */
    xlInsideHorizontal(12),
    
    /**
     * (11)
     */
    xlInsideVertical(11),
    
    /**
     * (5)
     */
    xlDiagonalDown(5),
    
    /**
     * (6)
     */
    xlDiagonalUp(6),
    
    /**
     * (9)
     */
    xlEdgeBottom(9),
    
    /**
     * (7)
     */
    xlEdgeLeft(7),
    
    /**
     * (10)
     */
    xlEdgeRight(10),
    
    /**
     * (8)
     */
    xlEdgeTop(8),
    ;

    private XlBordersIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}