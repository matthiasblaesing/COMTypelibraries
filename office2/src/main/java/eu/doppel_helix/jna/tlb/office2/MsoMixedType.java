
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoMixedType implements IComEnum {
    
    /**
     * (32768)
     */
    msoIntegerMixed(32768),
    
    /**
     * (-2147483648)
     */
    msoSingleMixed(-2147483648),
    ;

    private MsoMixedType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}