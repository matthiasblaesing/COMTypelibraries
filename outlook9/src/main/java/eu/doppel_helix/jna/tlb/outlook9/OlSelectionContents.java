
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlSelectionContents implements IComEnum {
    
    /**
     * (1)
     */
    olConversationHeaders(1),
    ;

    private OlSelectionContents(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}