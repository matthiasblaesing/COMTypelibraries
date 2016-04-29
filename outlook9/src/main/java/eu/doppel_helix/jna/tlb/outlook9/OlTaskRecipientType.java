
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlTaskRecipientType implements IComEnum {
    
    /**
     * (2)
     */
    olUpdate(2),
    
    /**
     * (3)
     */
    olFinalStatus(3),
    ;

    private OlTaskRecipientType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}