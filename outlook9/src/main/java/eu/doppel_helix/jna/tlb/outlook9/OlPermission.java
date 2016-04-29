
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlPermission implements IComEnum {
    
    /**
     * (0)
     */
    olUnrestricted(0),
    
    /**
     * (1)
     */
    olDoNotForward(1),
    
    /**
     * (2)
     */
    olPermissionTemplate(2),
    ;

    private OlPermission(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}