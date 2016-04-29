
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({AF2FC7DB-2E3E-3BF2-B1D0-6426945B15E0})</p>
 */
public enum WdMoveFromTextMark implements IComEnum {
    
    /**
     * (0)
     */
    wdMoveFromTextMarkHidden(0),
    
    /**
     * (1)
     */
    wdMoveFromTextMarkDoubleStrikeThrough(1),
    
    /**
     * (2)
     */
    wdMoveFromTextMarkStrikeThrough(2),
    
    /**
     * (3)
     */
    wdMoveFromTextMarkCaret(3),
    
    /**
     * (4)
     */
    wdMoveFromTextMarkPound(4),
    
    /**
     * (5)
     */
    wdMoveFromTextMarkNone(5),
    
    /**
     * (6)
     */
    wdMoveFromTextMarkBold(6),
    
    /**
     * (7)
     */
    wdMoveFromTextMarkItalic(7),
    
    /**
     * (8)
     */
    wdMoveFromTextMarkUnderline(8),
    
    /**
     * (9)
     */
    wdMoveFromTextMarkDoubleUnderline(9),
    
    /**
     * (10)
     */
    wdMoveFromTextMarkColorOnly(10),
    ;

    private WdMoveFromTextMark(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}