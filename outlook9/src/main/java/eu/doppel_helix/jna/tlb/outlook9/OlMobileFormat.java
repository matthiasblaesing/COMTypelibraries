
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlMobileFormat implements IComEnum {
    
    /**
     * (0)
     */
    olSMS(0),
    
    /**
     * (1)
     */
    olMMS(1),
    ;

    private OlMobileFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}