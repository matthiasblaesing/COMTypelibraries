
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlMailRecipientType implements IComEnum {
    
    /**
     * (0)
     */
    olOriginator(0),
    
    /**
     * (1)
     */
    olTo(1),
    
    /**
     * (2)
     */
    olCC(2),
    
    /**
     * (3)
     */
    olBCC(3),
    ;

    private OlMailRecipientType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}