
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({BFFE8F80-6A67-4B7A-AEAA-8823E7932C87})</p>
 */
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