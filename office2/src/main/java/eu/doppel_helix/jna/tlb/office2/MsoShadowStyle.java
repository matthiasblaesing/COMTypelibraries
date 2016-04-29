
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoShadowStyle implements IComEnum {
    
    /**
     * (-2)
     */
    msoShadowStyleMixed(-2),
    
    /**
     * (1)
     */
    msoShadowStyleInnerShadow(1),
    
    /**
     * (2)
     */
    msoShadowStyleOuterShadow(2),
    ;

    private MsoShadowStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}