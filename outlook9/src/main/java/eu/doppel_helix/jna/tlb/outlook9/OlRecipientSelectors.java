
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlRecipientSelectors implements IComEnum {
    
    /**
     * (0)
     */
    olShowNone(0),
    
    /**
     * (1)
     */
    olShowTo(1),
    
    /**
     * (2)
     */
    olShowToCc(2),
    
    /**
     * (3)
     */
    olShowToCcBcc(3),
    ;

    private OlRecipientSelectors(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}