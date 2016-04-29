
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFolderDisplayMode implements IComEnum {
    
    /**
     * (0)
     */
    olFolderDisplayNormal(0),
    
    /**
     * (1)
     */
    olFolderDisplayFolderOnly(1),
    
    /**
     * (2)
     */
    olFolderDisplayNoNavigation(2),
    ;

    private OlFolderDisplayMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}