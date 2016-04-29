
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum EncryptionProviderDetail implements IComEnum {
    
    /**
     * (0)
     */
    encprovdetUrl(0),
    
    /**
     * (1)
     */
    encprovdetAlgorithm(1),
    
    /**
     * (2)
     */
    encprovdetBlockCipher(2),
    
    /**
     * (3)
     */
    encprovdetCipherBlockSize(3),
    
    /**
     * (4)
     */
    encprovdetCipherMode(4),
    ;

    private EncryptionProviderDetail(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}