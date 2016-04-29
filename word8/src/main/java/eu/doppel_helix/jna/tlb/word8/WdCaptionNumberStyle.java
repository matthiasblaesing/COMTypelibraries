
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D6F59885-2962-305C-AA83-BBAB24CDB85E})</p>
 */
public enum WdCaptionNumberStyle implements IComEnum {
    
    /**
     * (0)
     */
    wdCaptionNumberStyleArabic(0),
    
    /**
     * (1)
     */
    wdCaptionNumberStyleUppercaseRoman(1),
    
    /**
     * (2)
     */
    wdCaptionNumberStyleLowercaseRoman(2),
    
    /**
     * (3)
     */
    wdCaptionNumberStyleUppercaseLetter(3),
    
    /**
     * (4)
     */
    wdCaptionNumberStyleLowercaseLetter(4),
    
    /**
     * (14)
     */
    wdCaptionNumberStyleArabicFullWidth(14),
    
    /**
     * (10)
     */
    wdCaptionNumberStyleKanji(10),
    
    /**
     * (11)
     */
    wdCaptionNumberStyleKanjiDigit(11),
    
    /**
     * (16)
     */
    wdCaptionNumberStyleKanjiTraditional(16),
    
    /**
     * (18)
     */
    wdCaptionNumberStyleNumberInCircle(18),
    
    /**
     * (24)
     */
    wdCaptionNumberStyleGanada(24),
    
    /**
     * (25)
     */
    wdCaptionNumberStyleChosung(25),
    
    /**
     * (30)
     */
    wdCaptionNumberStyleZodiac1(30),
    
    /**
     * (31)
     */
    wdCaptionNumberStyleZodiac2(31),
    
    /**
     * (41)
     */
    wdCaptionNumberStyleHanjaRead(41),
    
    /**
     * (42)
     */
    wdCaptionNumberStyleHanjaReadDigit(42),
    
    /**
     * (34)
     */
    wdCaptionNumberStyleTradChinNum2(34),
    
    /**
     * (35)
     */
    wdCaptionNumberStyleTradChinNum3(35),
    
    /**
     * (38)
     */
    wdCaptionNumberStyleSimpChinNum2(38),
    
    /**
     * (39)
     */
    wdCaptionNumberStyleSimpChinNum3(39),
    
    /**
     * (45)
     */
    wdCaptionNumberStyleHebrewLetter1(45),
    
    /**
     * (46)
     */
    wdCaptionNumberStyleArabicLetter1(46),
    
    /**
     * (47)
     */
    wdCaptionNumberStyleHebrewLetter2(47),
    
    /**
     * (48)
     */
    wdCaptionNumberStyleArabicLetter2(48),
    
    /**
     * (49)
     */
    wdCaptionNumberStyleHindiLetter1(49),
    
    /**
     * (50)
     */
    wdCaptionNumberStyleHindiLetter2(50),
    
    /**
     * (51)
     */
    wdCaptionNumberStyleHindiArabic(51),
    
    /**
     * (52)
     */
    wdCaptionNumberStyleHindiCardinalText(52),
    
    /**
     * (53)
     */
    wdCaptionNumberStyleThaiLetter(53),
    
    /**
     * (54)
     */
    wdCaptionNumberStyleThaiArabic(54),
    
    /**
     * (55)
     */
    wdCaptionNumberStyleThaiCardinalText(55),
    
    /**
     * (56)
     */
    wdCaptionNumberStyleVietCardinalText(56),
    ;

    private WdCaptionNumberStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}