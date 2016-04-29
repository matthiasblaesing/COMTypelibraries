
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFlagStatus implements IComEnum {
    
    /**
     * (0)
     */
    olNoFlag(0),
    
    /**
     * (1)
     */
    olFlagComplete(1),
    
    /**
     * (2)
     */
    olFlagMarked(2),
    ;

    private OlFlagStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}