
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlStoreType implements IComEnum {
    
    /**
     * (1)
     */
    olStoreDefault(1),
    
    /**
     * (2)
     */
    olStoreUnicode(2),
    
    /**
     * (3)
     */
    olStoreANSI(3),
    ;

    private OlStoreType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}