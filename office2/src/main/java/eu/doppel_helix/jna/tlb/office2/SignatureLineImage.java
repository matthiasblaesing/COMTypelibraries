
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum SignatureLineImage implements IComEnum {
    
    /**
     * (0)
     */
    siglnimgSoftwareRequired(0),
    
    /**
     * (1)
     */
    siglnimgUnsigned(1),
    
    /**
     * (2)
     */
    siglnimgSignedValid(2),
    
    /**
     * (3)
     */
    siglnimgSignedInvalid(3),
    
    /**
     * (4)
     */
    siglnimgSigned(4),
    ;

    private SignatureLineImage(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}