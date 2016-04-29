
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlIconViewType implements IComEnum {
    
    /**
     * (0)
     */
    olIconViewLarge(0),
    
    /**
     * (1)
     */
    olIconViewSmall(1),
    
    /**
     * (2)
     */
    olIconViewList(2),
    ;

    private OlIconViewType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}