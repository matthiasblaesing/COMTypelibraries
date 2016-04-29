
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum CertificateVerificationResults implements IComEnum {
    
    /**
     * (0)
     */
    certverresError(0),
    
    /**
     * (1)
     */
    certverresVerifying(1),
    
    /**
     * (2)
     */
    certverresUnverified(2),
    
    /**
     * (3)
     */
    certverresValid(3),
    
    /**
     * (4)
     */
    certverresInvalid(4),
    
    /**
     * (5)
     */
    certverresExpired(5),
    
    /**
     * (6)
     */
    certverresRevoked(6),
    
    /**
     * (7)
     */
    certverresUntrusted(7),
    ;

    private CertificateVerificationResults(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}