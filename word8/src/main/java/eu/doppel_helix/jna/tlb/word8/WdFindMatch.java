
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({858EB926-41E4-3509-B9D9-0B62C364228A})</p>
 */
public enum WdFindMatch implements IComEnum {
    
    /**
     * (65551)
     */
    wdMatchParagraphMark(65551),
    
    /**
     * (9)
     */
    wdMatchTabCharacter(9),
    
    /**
     * (5)
     */
    wdMatchCommentMark(5),
    
    /**
     * (65599)
     */
    wdMatchAnyCharacter(65599),
    
    /**
     * (65567)
     */
    wdMatchAnyDigit(65567),
    
    /**
     * (65583)
     */
    wdMatchAnyLetter(65583),
    
    /**
     * (11)
     */
    wdMatchCaretCharacter(11),
    
    /**
     * (14)
     */
    wdMatchColumnBreak(14),
    
    /**
     * (8212)
     */
    wdMatchEmDash(8212),
    
    /**
     * (8211)
     */
    wdMatchEnDash(8211),
    
    /**
     * (65555)
     */
    wdMatchEndnoteMark(65555),
    
    /**
     * (19)
     */
    wdMatchField(19),
    
    /**
     * (65554)
     */
    wdMatchFootnoteMark(65554),
    
    /**
     * (1)
     */
    wdMatchGraphic(1),
    
    /**
     * (65551)
     */
    wdMatchManualLineBreak(65551),
    
    /**
     * (65564)
     */
    wdMatchManualPageBreak(65564),
    
    /**
     * (30)
     */
    wdMatchNonbreakingHyphen(30),
    
    /**
     * (160)
     */
    wdMatchNonbreakingSpace(160),
    
    /**
     * (31)
     */
    wdMatchOptionalHyphen(31),
    
    /**
     * (65580)
     */
    wdMatchSectionBreak(65580),
    
    /**
     * (65655)
     */
    wdMatchWhiteSpace(65655),
    ;

    private WdFindMatch(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}