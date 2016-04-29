
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlErrorBarType implements IComEnum {
    
    /**
     * (-4114)
     */
    xlErrorBarTypeCustom(-4114),
    
    /**
     * (1)
     */
    xlErrorBarTypeFixedValue(1),
    
    /**
     * (2)
     */
    xlErrorBarTypePercent(2),
    
    /**
     * (-4155)
     */
    xlErrorBarTypeStDev(-4155),
    
    /**
     * (4)
     */
    xlErrorBarTypeStError(4),
    ;

    private XlErrorBarType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}