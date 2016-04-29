
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormRegionMode implements IComEnum {
    
    /**
     * (0)
     */
    olFormRegionRead(0),
    
    /**
     * (1)
     */
    olFormRegionCompose(1),
    
    /**
     * (2)
     */
    olFormRegionPreview(2),
    ;

    private OlFormRegionMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}