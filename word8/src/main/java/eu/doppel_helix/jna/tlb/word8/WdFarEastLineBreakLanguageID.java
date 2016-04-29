
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B5F5A962-1BC9-35A4-AC91-C40B9D33ACB9})</p>
 */
public enum WdFarEastLineBreakLanguageID implements IComEnum {
    
    /**
     * (1041)
     */
    wdLineBreakJapanese(1041),
    
    /**
     * (1042)
     */
    wdLineBreakKorean(1042),
    
    /**
     * (2052)
     */
    wdLineBreakSimplifiedChinese(2052),
    
    /**
     * (1028)
     */
    wdLineBreakTraditionalChinese(1028),
    ;

    private WdFarEastLineBreakLanguageID(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}