
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6AA9DBAF-EDDB-31DA-88C3-FFF0FBA0FC96})</p>
 */
public enum WdDictionaryType implements IComEnum {
    
    /**
     * (0)
     */
    wdSpelling(0),
    
    /**
     * (1)
     */
    wdGrammar(1),
    
    /**
     * (2)
     */
    wdThesaurus(2),
    
    /**
     * (3)
     */
    wdHyphenation(3),
    
    /**
     * (4)
     */
    wdSpellingComplete(4),
    
    /**
     * (5)
     */
    wdSpellingCustom(5),
    
    /**
     * (6)
     */
    wdSpellingLegal(6),
    
    /**
     * (7)
     */
    wdSpellingMedical(7),
    
    /**
     * (8)
     */
    wdHangulHanjaConversion(8),
    
    /**
     * (9)
     */
    wdHangulHanjaConversionCustom(9),
    ;

    private WdDictionaryType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}