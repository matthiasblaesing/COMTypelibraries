
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlArrowHeadStyle implements IComEnum {
    
    /**
     * (3)
     */
    xlArrowHeadStyleClosed(3),
    
    /**
     * (5)
     */
    xlArrowHeadStyleDoubleClosed(5),
    
    /**
     * (4)
     */
    xlArrowHeadStyleDoubleOpen(4),
    
    /**
     * (-4142)
     */
    xlArrowHeadStyleNone(-4142),
    
    /**
     * (2)
     */
    xlArrowHeadStyleOpen(2),
    ;

    private XlArrowHeadStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}