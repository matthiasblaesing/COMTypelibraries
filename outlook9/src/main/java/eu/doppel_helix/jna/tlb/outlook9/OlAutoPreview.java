
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlAutoPreview implements IComEnum {
    
    /**
     * (0)
     */
    olAutoPreviewAll(0),
    
    /**
     * (1)
     */
    olAutoPreviewUnread(1),
    
    /**
     * (2)
     */
    olAutoPreviewNone(2),
    ;

    private OlAutoPreview(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}