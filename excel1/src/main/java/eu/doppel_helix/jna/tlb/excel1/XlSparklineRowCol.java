
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSparklineRowCol implements IComEnum {
    
    /**
     * (0)
     */
    xlSparklineNonSquare(0),
    
    /**
     * (1)
     */
    xlSparklineRowsSquare(1),
    
    /**
     * (2)
     */
    xlSparklineColumnsSquare(2),
    ;

    private XlSparklineRowCol(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}