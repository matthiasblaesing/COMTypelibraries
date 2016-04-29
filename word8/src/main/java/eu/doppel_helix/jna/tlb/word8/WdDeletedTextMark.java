
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({002686EA-BC17-3B7C-BE4E-ECA572100016})</p>
 */
public enum WdDeletedTextMark implements IComEnum {
    
    /**
     * (0)
     */
    wdDeletedTextMarkHidden(0),
    
    /**
     * (1)
     */
    wdDeletedTextMarkStrikeThrough(1),
    
    /**
     * (2)
     */
    wdDeletedTextMarkCaret(2),
    
    /**
     * (3)
     */
    wdDeletedTextMarkPound(3),
    
    /**
     * (4)
     */
    wdDeletedTextMarkNone(4),
    
    /**
     * (5)
     */
    wdDeletedTextMarkBold(5),
    
    /**
     * (6)
     */
    wdDeletedTextMarkItalic(6),
    
    /**
     * (7)
     */
    wdDeletedTextMarkUnderline(7),
    
    /**
     * (8)
     */
    wdDeletedTextMarkDoubleUnderline(8),
    
    /**
     * (9)
     */
    wdDeletedTextMarkColorOnly(9),
    
    /**
     * (10)
     */
    wdDeletedTextMarkDoubleStrikeThrough(10),
    ;

    private WdDeletedTextMark(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}