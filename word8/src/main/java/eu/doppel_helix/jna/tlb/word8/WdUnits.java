
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D66B392B-BDA5-3778-A812-F6EEA5A96C2F})</p>
 */
public enum WdUnits implements IComEnum {
    
    /**
     * (1)
     */
    wdCharacter(1),
    
    /**
     * (2)
     */
    wdWord(2),
    
    /**
     * (3)
     */
    wdSentence(3),
    
    /**
     * (4)
     */
    wdParagraph(4),
    
    /**
     * (5)
     */
    wdLine(5),
    
    /**
     * (6)
     */
    wdStory(6),
    
    /**
     * (7)
     */
    wdScreen(7),
    
    /**
     * (8)
     */
    wdSection(8),
    
    /**
     * (9)
     */
    wdColumn(9),
    
    /**
     * (10)
     */
    wdRow(10),
    
    /**
     * (11)
     */
    wdWindow(11),
    
    /**
     * (12)
     */
    wdCell(12),
    
    /**
     * (13)
     */
    wdCharacterFormatting(13),
    
    /**
     * (14)
     */
    wdParagraphFormatting(14),
    
    /**
     * (15)
     */
    wdTable(15),
    
    /**
     * (16)
     */
    wdItem(16),
    ;

    private WdUnits(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}