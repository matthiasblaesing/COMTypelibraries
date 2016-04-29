
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormRegionSize implements IComEnum {
    
    /**
     * (0)
     */
    olFormRegionTypeSeparate(0),
    
    /**
     * (1)
     */
    olFormRegionTypeAdjoining(1),
    ;

    private OlFormRegionSize(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}