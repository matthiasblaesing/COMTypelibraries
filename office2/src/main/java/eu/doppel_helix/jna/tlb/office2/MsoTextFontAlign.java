
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTextFontAlign implements IComEnum {
    
    /**
     * (-2)
     */
    msoFontAlignMixed(-2),
    
    /**
     * (0)
     */
    msoFontAlignAuto(0),
    
    /**
     * (1)
     */
    msoFontAlignTop(1),
    
    /**
     * (2)
     */
    msoFontAlignCenter(2),
    
    /**
     * (3)
     */
    msoFontAlignBaseline(3),
    
    /**
     * (4)
     */
    msoFontAlignBottom(4),
    ;

    private MsoTextFontAlign(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}