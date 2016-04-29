
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Constants for WebBrowser security icon notification
 *
 * <p>uuid({65507BE0-91A8-11D3-A845-009027220E6D})</p>
 */
public enum SecureLockIconConstants implements IComEnum {
    
    /**
     * (0)
     */
    secureLockIconUnsecure(0),
    
    /**
     * (1)
     */
    secureLockIconMixed(1),
    
    /**
     * (2)
     */
    secureLockIconSecureUnknownBits(2),
    
    /**
     * (3)
     */
    secureLockIconSecure40Bit(3),
    
    /**
     * (4)
     */
    secureLockIconSecure56Bit(4),
    
    /**
     * (5)
     */
    secureLockIconSecureFortezza(5),
    
    /**
     * (6)
     */
    secureLockIconSecure128Bit(6),
    ;

    private SecureLockIconConstants(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}