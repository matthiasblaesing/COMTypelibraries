
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({BE39F3DB-1B13-11D0-887F-00A0C90F2744})</p>
 */
public enum vbext_WindowType implements IComEnum {
    
    /**
     * (0)
     */
    vbext_wt_CodeWindow(0),
    
    /**
     * (1)
     */
    vbext_wt_Designer(1),
    
    /**
     * (2)
     */
    vbext_wt_Browser(2),
    
    /**
     * (3)
     */
    vbext_wt_Watch(3),
    
    /**
     * (4)
     */
    vbext_wt_Locals(4),
    
    /**
     * (5)
     */
    vbext_wt_Immediate(5),
    
    /**
     * (6)
     */
    vbext_wt_ProjectWindow(6),
    
    /**
     * (7)
     */
    vbext_wt_PropertyWindow(7),
    
    /**
     * (8)
     */
    vbext_wt_Find(8),
    
    /**
     * (9)
     */
    vbext_wt_FindReplace(9),
    
    /**
     * (10)
     */
    vbext_wt_Toolbox(10),
    
    /**
     * (11)
     */
    vbext_wt_LinkedWindowFrame(11),
    
    /**
     * (12)
     */
    vbext_wt_MainWindow(12),
    
    /**
     * (15)
     */
    vbext_wt_ToolWindow(15),
    ;

    private vbext_WindowType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}