
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum SignatureProviderDetail implements IComEnum {
    
    /**
     * (0)
     */
    sigprovdetUrl(0),
    
    /**
     * (1)
     */
    sigprovdetHashAlgorithm(1),
    
    /**
     * (2)
     */
    sigprovdetUIOnly(2),
    
    /**
     * (3)
     */
    sigprovdetUseOfficeUI(3),
    
    /**
     * (4)
     */
    sigprovdetUseOfficeStampUI(4),
    ;

    private SignatureProviderDetail(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}