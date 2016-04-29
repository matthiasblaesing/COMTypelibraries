
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({F3AE6A1B-BB9F-3258-AAB9-87D6BAF4C3A3})</p>
 */
public enum WdMoveToTextMark implements IComEnum {
    
    /**
     * (0)
     */
    wdMoveToTextMarkNone(0),
    
    /**
     * (1)
     */
    wdMoveToTextMarkBold(1),
    
    /**
     * (2)
     */
    wdMoveToTextMarkItalic(2),
    
    /**
     * (3)
     */
    wdMoveToTextMarkUnderline(3),
    
    /**
     * (4)
     */
    wdMoveToTextMarkDoubleUnderline(4),
    
    /**
     * (5)
     */
    wdMoveToTextMarkColorOnly(5),
    
    /**
     * (6)
     */
    wdMoveToTextMarkStrikeThrough(6),
    
    /**
     * (7)
     */
    wdMoveToTextMarkDoubleStrikeThrough(7),
    ;

    private WdMoveToTextMark(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}