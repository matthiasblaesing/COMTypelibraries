
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Defines behavior of various interface calls
 *
 * <p>uuid({4A249B73-FC9A-11D1-8B1E-00600806D9B6})</p>
 */
public enum WbemFlagEnum implements IComEnum {
    
    /**
     * (16)
     */
    wbemFlagReturnImmediately(16),
    
    /**
     * (0)
     */
    wbemFlagReturnWhenComplete(0),
    
    /**
     * (0)
     */
    wbemFlagBidirectional(0),
    
    /**
     * (32)
     */
    wbemFlagForwardOnly(32),
    
    /**
     * (64)
     */
    wbemFlagNoErrorObject(64),
    
    /**
     * (0)
     */
    wbemFlagReturnErrorObject(0),
    
    /**
     * (128)
     */
    wbemFlagSendStatus(128),
    
    /**
     * (0)
     */
    wbemFlagDontSendStatus(0),
    
    /**
     * (256)
     */
    wbemFlagEnsureLocatable(256),
    
    /**
     * (512)
     */
    wbemFlagDirectRead(512),
    
    /**
     * (0)
     */
    wbemFlagSendOnlySelected(0),
    
    /**
     * (131072)
     */
    wbemFlagUseAmendedQualifiers(131072),
    
    /**
     * (0)
     */
    wbemFlagGetDefault(0),
    
    /**
     * (1)
     */
    wbemFlagSpawnInstance(1),
    
    /**
     * (1)
     */
    wbemFlagUseCurrentTime(1),
    ;

    private WbemFlagEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}