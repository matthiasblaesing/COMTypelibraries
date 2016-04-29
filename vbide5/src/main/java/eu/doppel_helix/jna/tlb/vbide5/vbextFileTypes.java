
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({06A03650-2369-11CE-BFDC-08002B2B8CDA})</p>
 */
public enum vbextFileTypes implements IComEnum {
    
    /**
     * (0)
     */
    vbextFileTypeForm(0),
    
    /**
     * (1)
     */
    vbextFileTypeModule(1),
    
    /**
     * (2)
     */
    vbextFileTypeClass(2),
    
    /**
     * (3)
     */
    vbextFileTypeProject(3),
    
    /**
     * (4)
     */
    vbextFileTypeExe(4),
    
    /**
     * (5)
     */
    vbextFileTypeFrx(5),
    
    /**
     * (6)
     */
    vbextFileTypeRes(6),
    
    /**
     * (7)
     */
    vbextFileTypeUserControl(7),
    
    /**
     * (8)
     */
    vbextFileTypePropertyPage(8),
    
    /**
     * (9)
     */
    vbextFileTypeDocObject(9),
    
    /**
     * (10)
     */
    vbextFileTypeBinary(10),
    
    /**
     * (11)
     */
    vbextFileTypeGroupProject(11),
    
    /**
     * (12)
     */
    vbextFileTypeDesigners(12),
    ;

    private vbextFileTypes(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}