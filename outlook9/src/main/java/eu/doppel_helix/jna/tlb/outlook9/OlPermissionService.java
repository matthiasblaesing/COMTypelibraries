
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlPermissionService implements IComEnum {
    
    /**
     * (0)
     */
    olUnknown(0),
    
    /**
     * (1)
     */
    olWindows(1),
    
    /**
     * (2)
     */
    olPassport(2),
    ;

    private OlPermissionService(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}