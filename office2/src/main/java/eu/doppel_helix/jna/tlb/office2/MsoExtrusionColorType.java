
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoExtrusionColorType implements IComEnum {
    
    /**
     * (-2)
     */
    msoExtrusionColorTypeMixed(-2),
    
    /**
     * (1)
     */
    msoExtrusionColorAutomatic(1),
    
    /**
     * (2)
     */
    msoExtrusionColorCustom(2),
    ;

    private MsoExtrusionColorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}