
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlFormulaLabel implements IComEnum {
    
    /**
     * (-4142)
     */
    xlNoLabels(-4142),
    
    /**
     * (1)
     */
    xlRowLabels(1),
    
    /**
     * (2)
     */
    xlColumnLabels(2),
    
    /**
     * (3)
     */
    xlMixedLabels(3),
    ;

    private XlFormulaLabel(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}