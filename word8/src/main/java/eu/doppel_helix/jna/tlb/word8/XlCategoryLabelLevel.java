
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7F9993CC-8BD9-4FA0-ABEF-D1AAD3429A14})</p>
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