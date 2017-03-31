
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Defines timeout constants
 *
 * <p>uuid({BF078C2A-07D9-11D2-8B21-00600806D9B6})</p>
 */
public enum WbemTimeout implements IComEnum {
    
    /**
     * (-1)
     */
    wbemTimeoutInfinite(-1),
    ;

    private WbemTimeout(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}