
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDataSeriesType implements IComEnum {
    
    /**
     * (4)
     */
    xlAutoFill(4),
    
    /**
     * (3)
     */
    xlChronological(3),
    
    /**
     * (2)
     */
    xlGrowth(2),
    
    /**
     * (-4132)
     */
    xlDataSeriesLinear(-4132),
    ;

    private XlDataSeriesType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}