
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFontLanguageIndex implements IComEnum {
    
    /**
     * (1)
     */
    msoThemeLatin(1),
    
    /**
     * (2)
     */
    msoThemeComplexScript(2),
    
    /**
     * (3)
     */
    msoThemeEastAsian(3),
    ;

    private MsoFontLanguageIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}