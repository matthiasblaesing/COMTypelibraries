
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0002E129-0000-0000-C000-000000000046})</p>
 */
public enum vbext_ProjectProtection implements IComEnum {
    
    /**
     * (0)
     */
    vbext_pp_none(0),
    
    /**
     * (1)
     */
    vbext_pp_locked(1),
    ;

    private vbext_ProjectProtection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}