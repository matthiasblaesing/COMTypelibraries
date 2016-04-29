
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlSortOrder implements IComEnum {
    
    /**
     * (0)
     */
    olSortNone(0),
    
    /**
     * (1)
     */
    olAscending(1),
    
    /**
     * (2)
     */
    olDescending(2),
    ;

    private OlSortOrder(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}