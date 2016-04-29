
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E9A67A18-2AF6-3495-93A9-82262F18C4E5})</p>
 */
public enum WdPageNumberStyle implements IComEnum {
    
    /**
     * (0)
     */
    wdPageNumberStyleArabic(0),
    
    /**
     * (1)
     */
    wdPageNumberStyleUppercaseRoman(1),
    
    /**
     * (2)
     */
    wdPageNumberStyleLowercaseRoman(2),
    
    /**
     * (3)
     */
    wdPageNumberStyleUppercaseLetter(3),
    
    /**
     * (4)
     */
    wdPageNumberStyleLowercaseLetter(4),
    
    /**
     * (14)
     */
    wdPageNumberStyleArabicFullWidth(14),
    
    /**
     * (10)
     */
    wdPageNumberStyleKanji(10),
    
    /**
     * (11)
     */
    wdPageNumberStyleKanjiDigit(11),
    
    /**
     * (16)
     */
    wdPageNumberStyleKanjiTraditional(16),
    
    /**
     * (18)
     */
    wdPageNumberStyleNumberInCircle(18),
    
    /**
     * (41)
     */
    wdPageNumberStyleHanjaRead(41),
    
    /**
     * (42)
     */
    wdPageNumberStyleHanjaReadDigit(42),
    
    /**
     * (33)
     */
    wdPageNumberStyleTradChinNum1(33),
    
    /**
     * (34)
     */
    wdPageNumberStyleTradChinNum2(34),
    
    /**
     * (37)
     */
    wdPageNumberStyleSimpChinNum1(37),
    
    /**
     * (38)
     */
    wdPageNumberStyleSimpChinNum2(38),
    
    /**
     * (45)
     */
    wdPageNumberStyleHebrewLetter1(45),
    
    /**
     * (46)
     */
    wdPageNumberStyleArabicLetter1(46),
    
    /**
     * (47)
     */
    wdPageNumberStyleHebrewLetter2(47),
    
    /**
     * (48)
     */
    wdPageNumberStyleArabicLetter2(48),
    
    /**
     * (49)
     */
    wdPageNumberStyleHindiLetter1(49),
    
    /**
     * (50)
     */
    wdPageNumberStyleHindiLetter2(50),
    
    /**
     * (51)
     */
    wdPageNumberStyleHindiArabic(51),
    
    /**
     * (52)
     */
    wdPageNumberStyleHindiCardinalText(52),
    
    /**
     * (53)
     */
    wdPageNumberStyleThaiLetter(53),
    
    /**
     * (54)
     */
    wdPageNumberStyleThaiArabic(54),
    
    /**
     * (55)
     */
    wdPageNumberStyleThaiCardinalText(55),
    
    /**
     * (56)
     */
    wdPageNumberStyleVietCardinalText(56),
    
    /**
     * (57)
     */
    wdPageNumberStyleNumberInDash(57),
    ;

    private WdPageNumberStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}