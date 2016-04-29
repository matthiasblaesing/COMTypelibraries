
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSheetType implements IComEnum {
    
    /**
     * (-4109)
     */
    xlChart(-4109),
    
    /**
     * (-4116)
     */
    xlDialogSheet(-4116),
    
    /**
     * (4)
     */
    xlExcel4IntlMacroSheet(4),
    
    /**
     * (3)
     */
    xlExcel4MacroSheet(3),
    
    /**
     * (-4167)
     */
    xlWorksheet(-4167),
    ;

    private XlSheetType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}