
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlMailingAddress implements IComEnum {
    
    /**
     * (0)
     */
    olNone(0),
    
    /**
     * (1)
     */
    olHome(1),
    
    /**
     * (2)
     */
    olBusiness(2),
    
    /**
     * (3)
     */
    olOther(3),
    ;

    private OlMailingAddress(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}