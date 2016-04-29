
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlHtmlType implements IComEnum {
    
    /**
     * (0)
     */
    xlHtmlStatic(0),
    
    /**
     * (1)
     */
    xlHtmlCalc(1),
    
    /**
     * (2)
     */
    xlHtmlList(2),
    
    /**
     * (3)
     */
    xlHtmlChart(3),
    ;

    private XlHtmlType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}