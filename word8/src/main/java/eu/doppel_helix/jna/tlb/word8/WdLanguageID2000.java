
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B47743D0-B1EC-3BFE-944D-183B51D50FB5})</p>
 */
public enum WdLanguageID2000 implements IComEnum {
    
    /**
     * (3076)
     */
    wdChineseHongKong(3076),
    
    /**
     * (5124)
     */
    wdChineseMacao(5124),
    
    /**
     * (11273)
     */
    wdEnglishTrinidad(11273),
    ;

    private WdLanguageID2000(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}