
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlWBATemplate implements IComEnum {
    
    /**
     * (-4109)
     */
    xlWBATChart(-4109),
    
    /**
     * (4)
     */
    xlWBATExcel4IntlMacroSheet(4),
    
    /**
     * (3)
     */
    xlWBATExcel4MacroSheet(3),
    
    /**
     * (-4167)
     */
    xlWBATWorksheet(-4167),
    ;

    private XlWBATemplate(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}