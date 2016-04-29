
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlAttachmentType implements IComEnum {
    
    /**
     * (1)
     */
    olByValue(1),
    
    /**
     * (4)
     */
    olByReference(4),
    
    /**
     * (5)
     */
    olEmbeddeditem(5),
    
    /**
     * (6)
     */
    olOLE(6),
    ;

    private OlAttachmentType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}