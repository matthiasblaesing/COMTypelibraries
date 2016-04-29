
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({3568EE18-032C-39F9-A32B-179BC05CB782})</p>
 */
public enum WdGoToItem implements IComEnum {
    
    /**
     * (-1)
     */
    wdGoToBookmark(-1),
    
    /**
     * (0)
     */
    wdGoToSection(0),
    
    /**
     * (1)
     */
    wdGoToPage(1),
    
    /**
     * (2)
     */
    wdGoToTable(2),
    
    /**
     * (3)
     */
    wdGoToLine(3),
    
    /**
     * (4)
     */
    wdGoToFootnote(4),
    
    /**
     * (5)
     */
    wdGoToEndnote(5),
    
    /**
     * (6)
     */
    wdGoToComment(6),
    
    /**
     * (7)
     */
    wdGoToField(7),
    
    /**
     * (8)
     */
    wdGoToGraphic(8),
    
    /**
     * (9)
     */
    wdGoToObject(9),
    
    /**
     * (10)
     */
    wdGoToEquation(10),
    
    /**
     * (11)
     */
    wdGoToHeading(11),
    
    /**
     * (12)
     */
    wdGoToPercent(12),
    
    /**
     * (13)
     */
    wdGoToSpellingError(13),
    
    /**
     * (14)
     */
    wdGoToGrammaticalError(14),
    
    /**
     * (15)
     */
    wdGoToProofreadingError(15),
    ;

    private WdGoToItem(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}