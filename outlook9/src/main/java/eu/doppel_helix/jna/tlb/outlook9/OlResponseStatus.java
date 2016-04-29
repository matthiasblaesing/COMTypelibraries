
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlResponseStatus implements IComEnum {
    
    /**
     * (0)
     */
    olResponseNone(0),
    
    /**
     * (1)
     */
    olResponseOrganized(1),
    
    /**
     * (2)
     */
    olResponseTentative(2),
    
    /**
     * (3)
     */
    olResponseAccepted(3),
    
    /**
     * (4)
     */
    olResponseDeclined(4),
    
    /**
     * (5)
     */
    olResponseNotResponded(5),
    ;

    private OlResponseStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}