
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlActionReplyStyle implements IComEnum {
    
    /**
     * (0)
     */
    olOmitOriginalText(0),
    
    /**
     * (1)
     */
    olEmbedOriginalItem(1),
    
    /**
     * (2)
     */
    olIncludeOriginalText(2),
    
    /**
     * (3)
     */
    olIndentOriginalText(3),
    
    /**
     * (4)
     */
    olLinkOriginalItem(4),
    
    /**
     * (5)
     */
    olUserPreference(5),
    
    /**
     * (1000)
     */
    olReplyTickOriginalText(1000),
    ;

    private OlActionReplyStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}