
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Defines the security authentication level
 *
 * <p>uuid({B54D66E7-2287-11D2-8B33-00600806D9B6})</p>
 */
public enum WbemAuthenticationLevelEnum implements IComEnum {
    
    /**
     * (0)
     */
    wbemAuthenticationLevelDefault(0),
    
    /**
     * (1)
     */
    wbemAuthenticationLevelNone(1),
    
    /**
     * (2)
     */
    wbemAuthenticationLevelConnect(2),
    
    /**
     * (3)
     */
    wbemAuthenticationLevelCall(3),
    
    /**
     * (4)
     */
    wbemAuthenticationLevelPkt(4),
    
    /**
     * (5)
     */
    wbemAuthenticationLevelPktIntegrity(5),
    
    /**
     * (6)
     */
    wbemAuthenticationLevelPktPrivacy(6),
    ;

    private WbemAuthenticationLevelEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}