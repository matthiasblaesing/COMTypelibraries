
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlIconViewPlacement implements IComEnum {
    
    /**
     * (0)
     */
    olIconDoNotArrange(0),
    
    /**
     * (1)
     */
    olIconLineUp(1),
    
    /**
     * (2)
     */
    olIconAutoArrange(2),
    
    /**
     * (3)
     */
    olIconSortAndAutoArrange(3),
    ;

    private OlIconViewPlacement(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}