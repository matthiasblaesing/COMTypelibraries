
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlAlwaysDeleteConversation implements IComEnum {
    
    /**
     * (0)
     */
    olDoNotDelete(0),
    
    /**
     * (1)
     */
    olAlwaysDelete(1),
    
    /**
     * (2)
     */
    olAlwaysDeleteUnsupported(2),
    ;

    private OlAlwaysDeleteConversation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}