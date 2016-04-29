
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTextureType implements IComEnum {
    
    /**
     * (-2)
     */
    msoTextureTypeMixed(-2),
    
    /**
     * (1)
     */
    msoTexturePreset(1),
    
    /**
     * (2)
     */
    msoTextureUserDefined(2),
    ;

    private MsoTextureType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}