
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlUnderlineStyle implements IComEnum {
    
    /**
     * (-4119)
     */
    xlUnderlineStyleDouble(-4119),
    
    /**
     * (5)
     */
    xlUnderlineStyleDoubleAccounting(5),
    
    /**
     * (-4142)
     */
    xlUnderlineStyleNone(-4142),
    
    /**
     * (2)
     */
    xlUnderlineStyleSingle(2),
    
    /**
     * (4)
     */
    xlUnderlineStyleSingleAccounting(4),
    ;

    private XlUnderlineStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}