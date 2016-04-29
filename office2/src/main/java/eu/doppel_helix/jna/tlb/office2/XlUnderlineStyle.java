
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9B1665EA-5EA9-4D9B-9B61-D6D1E7C087E2})</p>
 */
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