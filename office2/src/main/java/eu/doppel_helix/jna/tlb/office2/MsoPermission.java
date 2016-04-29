
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPermission implements IComEnum {
    
    /**
     * (1)
     */
    msoPermissionView(1),
    
    /**
     * (1)
     */
    msoPermissionRead(1),
    
    /**
     * (2)
     */
    msoPermissionEdit(2),
    
    /**
     * (4)
     */
    msoPermissionSave(4),
    
    /**
     * (8)
     */
    msoPermissionExtract(8),
    
    /**
     * (15)
     */
    msoPermissionChange(15),
    
    /**
     * (16)
     */
    msoPermissionPrint(16),
    
    /**
     * (32)
     */
    msoPermissionObjModel(32),
    
    /**
     * (64)
     */
    msoPermissionFullControl(64),
    
    /**
     * (127)
     */
    msoPermissionAllCommon(127),
    ;

    private MsoPermission(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}