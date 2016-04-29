
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoThemeColorIndex implements IComEnum {
    
    /**
     * (-2)
     */
    msoThemeColorMixed(-2),
    
    /**
     * (0)
     */
    msoNotThemeColor(0),
    
    /**
     * (1)
     */
    msoThemeColorDark1(1),
    
    /**
     * (2)
     */
    msoThemeColorLight1(2),
    
    /**
     * (3)
     */
    msoThemeColorDark2(3),
    
    /**
     * (4)
     */
    msoThemeColorLight2(4),
    
    /**
     * (5)
     */
    msoThemeColorAccent1(5),
    
    /**
     * (6)
     */
    msoThemeColorAccent2(6),
    
    /**
     * (7)
     */
    msoThemeColorAccent3(7),
    
    /**
     * (8)
     */
    msoThemeColorAccent4(8),
    
    /**
     * (9)
     */
    msoThemeColorAccent5(9),
    
    /**
     * (10)
     */
    msoThemeColorAccent6(10),
    
    /**
     * (11)
     */
    msoThemeColorHyperlink(11),
    
    /**
     * (12)
     */
    msoThemeColorFollowedHyperlink(12),
    
    /**
     * (13)
     */
    msoThemeColorText1(13),
    
    /**
     * (14)
     */
    msoThemeColorBackground1(14),
    
    /**
     * (15)
     */
    msoThemeColorText2(15),
    
    /**
     * (16)
     */
    msoThemeColorBackground2(16),
    ;

    private MsoThemeColorIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}