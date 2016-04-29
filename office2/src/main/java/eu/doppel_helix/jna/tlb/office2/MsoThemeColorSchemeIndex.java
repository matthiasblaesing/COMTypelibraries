
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoThemeColorSchemeIndex implements IComEnum {
    
    /**
     * (1)
     */
    msoThemeDark1(1),
    
    /**
     * (2)
     */
    msoThemeLight1(2),
    
    /**
     * (3)
     */
    msoThemeDark2(3),
    
    /**
     * (4)
     */
    msoThemeLight2(4),
    
    /**
     * (5)
     */
    msoThemeAccent1(5),
    
    /**
     * (6)
     */
    msoThemeAccent2(6),
    
    /**
     * (7)
     */
    msoThemeAccent3(7),
    
    /**
     * (8)
     */
    msoThemeAccent4(8),
    
    /**
     * (9)
     */
    msoThemeAccent5(9),
    
    /**
     * (10)
     */
    msoThemeAccent6(10),
    
    /**
     * (11)
     */
    msoThemeHyperlink(11),
    
    /**
     * (12)
     */
    msoThemeFollowedHyperlink(12),
    ;

    private MsoThemeColorSchemeIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}