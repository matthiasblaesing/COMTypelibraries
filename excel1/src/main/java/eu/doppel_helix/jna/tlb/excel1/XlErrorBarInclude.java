
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlErrorBarInclude implements IComEnum {
    
    /**
     * (1)
     */
    xlErrorBarIncludeBoth(1),
    
    /**
     * (3)
     */
    xlErrorBarIncludeMinusValues(3),
    
    /**
     * (-4142)
     */
    xlErrorBarIncludeNone(-4142),
    
    /**
     * (2)
     */
    xlErrorBarIncludePlusValues(2),
    ;

    private XlErrorBarInclude(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}