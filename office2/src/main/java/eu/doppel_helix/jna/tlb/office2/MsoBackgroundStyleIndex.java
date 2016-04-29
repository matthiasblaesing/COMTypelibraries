
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBackgroundStyleIndex implements IComEnum {
    
    /**
     * (-2)
     */
    msoBackgroundStyleMixed(-2),
    
    /**
     * (0)
     */
    msoBackgroundStyleNotAPreset(0),
    
    /**
     * (1)
     */
    msoBackgroundStylePreset1(1),
    
    /**
     * (2)
     */
    msoBackgroundStylePreset2(2),
    
    /**
     * (3)
     */
    msoBackgroundStylePreset3(3),
    
    /**
     * (4)
     */
    msoBackgroundStylePreset4(4),
    
    /**
     * (5)
     */
    msoBackgroundStylePreset5(5),
    
    /**
     * (6)
     */
    msoBackgroundStylePreset6(6),
    
    /**
     * (7)
     */
    msoBackgroundStylePreset7(7),
    
    /**
     * (8)
     */
    msoBackgroundStylePreset8(8),
    
    /**
     * (9)
     */
    msoBackgroundStylePreset9(9),
    
    /**
     * (10)
     */
    msoBackgroundStylePreset10(10),
    
    /**
     * (11)
     */
    msoBackgroundStylePreset11(11),
    
    /**
     * (12)
     */
    msoBackgroundStylePreset12(12),
    ;

    private MsoBackgroundStyleIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}