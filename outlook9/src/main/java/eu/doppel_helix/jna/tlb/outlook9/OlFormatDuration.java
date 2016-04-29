
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormatDuration implements IComEnum {
    
    /**
     * (1)
     */
    olFormatDurationShort(1),
    
    /**
     * (2)
     */
    olFormatDurationLong(2),
    
    /**
     * (3)
     */
    olFormatDurationShortBusiness(3),
    
    /**
     * (4)
     */
    olFormatDurationLongBusiness(4),
    ;

    private OlFormatDuration(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}