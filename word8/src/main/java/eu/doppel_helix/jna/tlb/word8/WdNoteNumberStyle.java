
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({ACA7717A-16C6-370B-80DD-55F440008A67})</p>
 */
public enum WdNoteNumberStyle implements IComEnum {
    
    /**
     * (0)
     */
    wdNoteNumberStyleArabic(0),
    
    /**
     * (1)
     */
    wdNoteNumberStyleUppercaseRoman(1),
    
    /**
     * (2)
     */
    wdNoteNumberStyleLowercaseRoman(2),
    
    /**
     * (3)
     */
    wdNoteNumberStyleUppercaseLetter(3),
    
    /**
     * (4)
     */
    wdNoteNumberStyleLowercaseLetter(4),
    
    /**
     * (9)
     */
    wdNoteNumberStyleSymbol(9),
    
    /**
     * (14)
     */
    wdNoteNumberStyleArabicFullWidth(14),
    
    /**
     * (10)
     */
    wdNoteNumberStyleKanji(10),
    
    /**
     * (11)
     */
    wdNoteNumberStyleKanjiDigit(11),
    
    /**
     * (16)
     */
    wdNoteNumberStyleKanjiTraditional(16),
    
    /**
     * (18)
     */
    wdNoteNumberStyleNumberInCircle(18),
    
    /**
     * (41)
     */
    wdNoteNumberStyleHanjaRead(41),
    
    /**
     * (42)
     */
    wdNoteNumberStyleHanjaReadDigit(42),
    
    /**
     * (33)
     */
    wdNoteNumberStyleTradChinNum1(33),
    
    /**
     * (34)
     */
    wdNoteNumberStyleTradChinNum2(34),
    
    /**
     * (37)
     */
    wdNoteNumberStyleSimpChinNum1(37),
    
    /**
     * (38)
     */
    wdNoteNumberStyleSimpChinNum2(38),
    
    /**
     * (45)
     */
    wdNoteNumberStyleHebrewLetter1(45),
    
    /**
     * (46)
     */
    wdNoteNumberStyleArabicLetter1(46),
    
    /**
     * (47)
     */
    wdNoteNumberStyleHebrewLetter2(47),
    
    /**
     * (48)
     */
    wdNoteNumberStyleArabicLetter2(48),
    
    /**
     * (49)
     */
    wdNoteNumberStyleHindiLetter1(49),
    
    /**
     * (50)
     */
    wdNoteNumberStyleHindiLetter2(50),
    
    /**
     * (51)
     */
    wdNoteNumberStyleHindiArabic(51),
    
    /**
     * (52)
     */
    wdNoteNumberStyleHindiCardinalText(52),
    
    /**
     * (53)
     */
    wdNoteNumberStyleThaiLetter(53),
    
    /**
     * (54)
     */
    wdNoteNumberStyleThaiArabic(54),
    
    /**
     * (55)
     */
    wdNoteNumberStyleThaiCardinalText(55),
    
    /**
     * (56)
     */
    wdNoteNumberStyleVietCardinalText(56),
    ;

    private WdNoteNumberStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}