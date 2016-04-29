
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCalculationInterruptKey implements IComEnum {
    
    /**
     * (0)
     */
    xlNoKey(0),
    
    /**
     * (1)
     */
    xlEscKey(1),
    
    /**
     * (2)
     */
    xlAnyKey(2),
    ;

    private XlCalculationInterruptKey(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}