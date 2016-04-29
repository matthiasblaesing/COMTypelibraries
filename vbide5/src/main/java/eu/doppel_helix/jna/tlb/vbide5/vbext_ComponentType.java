
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({BE39F3D5-1B13-11D0-887F-00A0C90F2744})</p>
 */
public enum vbext_ComponentType implements IComEnum {
    
    /**
     * (1)
     */
    vbext_ct_StdModule(1),
    
    /**
     * (2)
     */
    vbext_ct_ClassModule(2),
    
    /**
     * (3)
     */
    vbext_ct_MSForm(3),
    
    /**
     * (11)
     */
    vbext_ct_ActiveXDesigner(11),
    
    /**
     * (100)
     */
    vbext_ct_Document(100),
    ;

    private vbext_ComponentType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}