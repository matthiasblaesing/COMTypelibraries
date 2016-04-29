
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCategoryLabelLevel implements IComEnum {
    
    /**
     * (-3)
     */
    xlCategoryLabelLevelNone(-3),
    
    /**
     * (-2)
     */
    xlCategoryLabelLevelCustom(-2),
    
    /**
     * (-1)
     */
    xlCategoryLabelLevelAll(-1),
    ;

    private XlCategoryLabelLevel(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}