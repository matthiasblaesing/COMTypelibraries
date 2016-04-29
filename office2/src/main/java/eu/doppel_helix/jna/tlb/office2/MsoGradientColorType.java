
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoGradientColorType implements IComEnum {
    
    /**
     * (-2)
     */
    msoGradientColorMixed(-2),
    
    /**
     * (1)
     */
    msoGradientOneColor(1),
    
    /**
     * (2)
     */
    msoGradientTwoColors(2),
    
    /**
     * (3)
     */
    msoGradientPresetColors(3),
    
    /**
     * (4)
     */
    msoGradientMultiColor(4),
    ;

    private MsoGradientColorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}