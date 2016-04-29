
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlShowItemCount implements IComEnum {
    
    /**
     * (0)
     */
    olNoItemCount(0),
    
    /**
     * (1)
     */
    olShowUnreadItemCount(1),
    
    /**
     * (2)
     */
    olShowTotalItemCount(2),
    ;

    private OlShowItemCount(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}