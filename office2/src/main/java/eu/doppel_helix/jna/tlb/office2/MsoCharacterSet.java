
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoCharacterSet implements IComEnum {
    
    /**
     * (1)
     */
    msoCharacterSetArabic(1),
    
    /**
     * (2)
     */
    msoCharacterSetCyrillic(2),
    
    /**
     * (3)
     */
    msoCharacterSetEnglishWesternEuropeanOtherLatinScript(3),
    
    /**
     * (4)
     */
    msoCharacterSetGreek(4),
    
    /**
     * (5)
     */
    msoCharacterSetHebrew(5),
    
    /**
     * (6)
     */
    msoCharacterSetJapanese(6),
    
    /**
     * (7)
     */
    msoCharacterSetKorean(7),
    
    /**
     * (8)
     */
    msoCharacterSetMultilingualUnicode(8),
    
    /**
     * (9)
     */
    msoCharacterSetSimplifiedChinese(9),
    
    /**
     * (10)
     */
    msoCharacterSetThai(10),
    
    /**
     * (11)
     */
    msoCharacterSetTraditionalChinese(11),
    
    /**
     * (12)
     */
    msoCharacterSetVietnamese(12),
    ;

    private MsoCharacterSet(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}