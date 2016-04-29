
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPresetLightingSoftness implements IComEnum {
    
    /**
     * (-2)
     */
    msoPresetLightingSoftnessMixed(-2),
    
    /**
     * (1)
     */
    msoLightingDim(1),
    
    /**
     * (2)
     */
    msoLightingNormal(2),
    
    /**
     * (3)
     */
    msoLightingBright(3),
    ;

    private MsoPresetLightingSoftness(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}