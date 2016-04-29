
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum CertificateDetail implements IComEnum {
    
    /**
     * (0)
     */
    certdetAvailable(0),
    
    /**
     * (1)
     */
    certdetSubject(1),
    
    /**
     * (2)
     */
    certdetIssuer(2),
    
    /**
     * (3)
     */
    certdetExpirationDate(3),
    
    /**
     * (4)
     */
    certdetThumbprint(4),
    ;

    private CertificateDetail(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}