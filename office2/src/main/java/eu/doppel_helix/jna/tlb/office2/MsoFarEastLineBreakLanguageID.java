
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFarEastLineBreakLanguageID implements IComEnum {
    
    /**
     * (1041)
     */
    MsoFarEastLineBreakLanguageJapanese(1041),
    
    /**
     * (1042)
     */
    MsoFarEastLineBreakLanguageKorean(1042),
    
    /**
     * (2052)
     */
    MsoFarEastLineBreakLanguageSimplifiedChinese(2052),
    
    /**
     * (1028)
     */
    MsoFarEastLineBreakLanguageTraditionalChinese(1028),
    ;

    private MsoFarEastLineBreakLanguageID(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}