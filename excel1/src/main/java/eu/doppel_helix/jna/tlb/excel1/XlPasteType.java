
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPasteType implements IComEnum {
    
    /**
     * (-4104)
     */
    xlPasteAll(-4104),
    
    /**
     * (13)
     */
    xlPasteAllUsingSourceTheme(13),
    
    /**
     * (14)
     */
    xlPasteAllMergingConditionalFormats(14),
    
    /**
     * (7)
     */
    xlPasteAllExceptBorders(7),
    
    /**
     * (-4122)
     */
    xlPasteFormats(-4122),
    
    /**
     * (-4123)
     */
    xlPasteFormulas(-4123),
    
    /**
     * (-4144)
     */
    xlPasteComments(-4144),
    
    /**
     * (-4163)
     */
    xlPasteValues(-4163),
    
    /**
     * (8)
     */
    xlPasteColumnWidths(8),
    
    /**
     * (6)
     */
    xlPasteValidation(6),
    
    /**
     * (11)
     */
    xlPasteFormulasAndNumberFormats(11),
    
    /**
     * (12)
     */
    xlPasteValuesAndNumberFormats(12),
    ;

    private XlPasteType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}