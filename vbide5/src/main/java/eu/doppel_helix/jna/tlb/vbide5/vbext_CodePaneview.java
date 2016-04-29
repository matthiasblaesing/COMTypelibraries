
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum vbext_CodePaneview implements IComEnum {
    
    /**
     * (0)
     */
    vbext_cv_ProcedureView(0),
    
    /**
     * (1)
     */
    vbext_cv_FullModuleView(1),
    ;

    private vbext_CodePaneview(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}