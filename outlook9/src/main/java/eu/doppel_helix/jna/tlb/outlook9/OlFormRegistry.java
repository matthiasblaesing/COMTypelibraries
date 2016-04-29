
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormRegistry implements IComEnum {
    
    /**
     * (0)
     */
    olDefaultRegistry(0),
    
    /**
     * (2)
     */
    olPersonalRegistry(2),
    
    /**
     * (3)
     */
    olFolderRegistry(3),
    
    /**
     * (4)
     */
    olOrganizationRegistry(4),
    ;

    private OlFormRegistry(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}