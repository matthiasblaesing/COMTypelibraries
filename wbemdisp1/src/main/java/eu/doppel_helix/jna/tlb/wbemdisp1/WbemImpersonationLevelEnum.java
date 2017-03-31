
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Defines the security impersonation level
 *
 * <p>uuid({B54D66E8-2287-11D2-8B33-00600806D9B6})</p>
 */
public enum WbemImpersonationLevelEnum implements IComEnum {
    
    /**
     * (1)
     */
    wbemImpersonationLevelAnonymous(1),
    
    /**
     * (2)
     */
    wbemImpersonationLevelIdentify(2),
    
    /**
     * (3)
     */
    wbemImpersonationLevelImpersonate(3),
    
    /**
     * (4)
     */
    wbemImpersonationLevelDelegate(4),
    ;

    private WbemImpersonationLevelEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}