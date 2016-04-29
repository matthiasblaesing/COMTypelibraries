
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPrintErrors implements IComEnum {
    
    /**
     * (0)
     */
    xlPrintErrorsDisplayed(0),
    
    /**
     * (1)
     */
    xlPrintErrorsBlank(1),
    
    /**
     * (2)
     */
    xlPrintErrorsDash(2),
    
    /**
     * (3)
     */
    xlPrintErrorsNA(3),
    ;

    private XlPrintErrors(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}