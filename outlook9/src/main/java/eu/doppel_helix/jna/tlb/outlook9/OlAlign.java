
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlAlign implements IComEnum {
    
    /**
     * (0)
     */
    olAlignLeft(0),
    
    /**
     * (1)
     */
    olAlignCenter(1),
    
    /**
     * (2)
     */
    olAlignRight(2),
    ;

    private OlAlign(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}