
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Defines semantics of putting a Class or Instance
 *
 * <p>uuid({4A249B72-FC9A-11D1-8B1E-00600806D9B6})</p>
 */
public enum WbemChangeFlagEnum implements IComEnum {
    
    /**
     * (0)
     */
    wbemChangeFlagCreateOrUpdate(0),
    
    /**
     * (1)
     */
    wbemChangeFlagUpdateOnly(1),
    
    /**
     * (2)
     */
    wbemChangeFlagCreateOnly(2),
    
    /**
     * (0)
     */
    wbemChangeFlagUpdateCompatible(0),
    
    /**
     * (32)
     */
    wbemChangeFlagUpdateSafeMode(32),
    
    /**
     * (64)
     */
    wbemChangeFlagUpdateForceMode(64),
    
    /**
     * (128)
     */
    wbemChangeFlagStrongValidation(128),
    
    /**
     * (65536)
     */
    wbemChangeFlagAdvisory(65536),
    ;

    private WbemChangeFlagEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}