
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9E20280E-224E-3492-B547-0055D8DB19E8})</p>
 */
public enum WdRevisedPropertiesMark implements IComEnum {
    
    /**
     * (0)
     */
    wdRevisedPropertiesMarkNone(0),
    
    /**
     * (1)
     */
    wdRevisedPropertiesMarkBold(1),
    
    /**
     * (2)
     */
    wdRevisedPropertiesMarkItalic(2),
    
    /**
     * (3)
     */
    wdRevisedPropertiesMarkUnderline(3),
    
    /**
     * (4)
     */
    wdRevisedPropertiesMarkDoubleUnderline(4),
    
    /**
     * (5)
     */
    wdRevisedPropertiesMarkColorOnly(5),
    
    /**
     * (6)
     */
    wdRevisedPropertiesMarkStrikeThrough(6),
    
    /**
     * (7)
     */
    wdRevisedPropertiesMarkDoubleStrikeThrough(7),
    ;

    private WdRevisedPropertiesMark(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}