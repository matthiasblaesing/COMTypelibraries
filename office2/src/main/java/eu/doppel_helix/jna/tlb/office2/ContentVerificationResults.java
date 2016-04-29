
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum ContentVerificationResults implements IComEnum {
    
    /**
     * (0)
     */
    contverresError(0),
    
    /**
     * (1)
     */
    contverresVerifying(1),
    
    /**
     * (2)
     */
    contverresUnverified(2),
    
    /**
     * (3)
     */
    contverresValid(3),
    
    /**
     * (4)
     */
    contverresModified(4),
    ;

    private ContentVerificationResults(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}