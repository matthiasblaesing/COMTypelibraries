
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlFillWith implements IComEnum {
    
    /**
     * (-4104)
     */
    xlFillWithAll(-4104),
    
    /**
     * (2)
     */
    xlFillWithContents(2),
    
    /**
     * (-4122)
     */
    xlFillWithFormats(-4122),
    ;

    private XlFillWith(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}