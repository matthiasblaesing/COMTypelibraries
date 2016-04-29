
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({803E4880-EECA-3830-9186-32B36FA120AB})</p>
 */
public enum WdThemeColorIndex implements IComEnum {
    
    /**
     * (-1)
     */
    wdNotThemeColor(-1),
    
    /**
     * (0)
     */
    wdThemeColorMainDark1(0),
    
    /**
     * (1)
     */
    wdThemeColorMainLight1(1),
    
    /**
     * (2)
     */
    wdThemeColorMainDark2(2),
    
    /**
     * (3)
     */
    wdThemeColorMainLight2(3),
    
    /**
     * (4)
     */
    wdThemeColorAccent1(4),
    
    /**
     * (5)
     */
    wdThemeColorAccent2(5),
    
    /**
     * (6)
     */
    wdThemeColorAccent3(6),
    
    /**
     * (7)
     */
    wdThemeColorAccent4(7),
    
    /**
     * (8)
     */
    wdThemeColorAccent5(8),
    
    /**
     * (9)
     */
    wdThemeColorAccent6(9),
    
    /**
     * (10)
     */
    wdThemeColorHyperlink(10),
    
    /**
     * (11)
     */
    wdThemeColorHyperlinkFollowed(11),
    
    /**
     * (12)
     */
    wdThemeColorBackground1(12),
    
    /**
     * (13)
     */
    wdThemeColorText1(13),
    
    /**
     * (14)
     */
    wdThemeColorBackground2(14),
    
    /**
     * (15)
     */
    wdThemeColorText2(15),
    ;

    private WdThemeColorIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}