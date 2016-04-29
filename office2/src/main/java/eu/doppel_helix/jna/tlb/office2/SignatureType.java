
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum SignatureType implements IComEnum {
    
    /**
     * (0)
     */
    sigtypeUnknown(0),
    
    /**
     * (1)
     */
    sigtypeNonVisible(1),
    
    /**
     * (2)
     */
    sigtypeSignatureLine(2),
    
    /**
     * (3)
     */
    sigtypeMax(3),
    ;

    private SignatureType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}