
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum vbext_ProcKind implements IComEnum {
    
    /**
     * (0)
     */
    vbext_pk_Proc(0),
    
    /**
     * (1)
     */
    vbext_pk_Let(1),
    
    /**
     * (2)
     */
    vbext_pk_Set(2),
    
    /**
     * (3)
     */
    vbext_pk_Get(3),
    ;

    private vbext_ProcKind(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}