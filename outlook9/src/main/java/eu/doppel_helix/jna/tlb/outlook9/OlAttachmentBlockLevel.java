
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlAttachmentBlockLevel implements IComEnum {
    
    /**
     * (0)
     */
    olAttachmentBlockLevelNone(0),
    
    /**
     * (1)
     */
    olAttachmentBlockLevelOpen(1),
    ;

    private OlAttachmentBlockLevel(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}