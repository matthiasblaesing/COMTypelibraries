
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({FFCF3247-DEBF-11D1-BAFF-00C04FB6C4A6})</p>
 */
public enum vbext_ProjectType implements IComEnum {
    
    /**
     * (100)
     */
    vbext_pt_HostProject(100),
    
    /**
     * (101)
     */
    vbext_pt_StandAlone(101),
    ;

    private vbext_ProjectType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}