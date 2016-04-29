
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1A98AA4F-A0F3-3980-9A55-0B958B6C8158})</p>
 */
public enum WdInsertedTextMark implements IComEnum {
    
    /**
     * (0)
     */
    wdInsertedTextMarkNone(0),
    
    /**
     * (1)
     */
    wdInsertedTextMarkBold(1),
    
    /**
     * (2)
     */
    wdInsertedTextMarkItalic(2),
    
    /**
     * (3)
     */
    wdInsertedTextMarkUnderline(3),
    
    /**
     * (4)
     */
    wdInsertedTextMarkDoubleUnderline(4),
    
    /**
     * (5)
     */
    wdInsertedTextMarkColorOnly(5),
    
    /**
     * (6)
     */
    wdInsertedTextMarkStrikeThrough(6),
    
    /**
     * (7)
     */
    wdInsertedTextMarkDoubleStrikeThrough(7),
    ;

    private WdInsertedTextMark(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}