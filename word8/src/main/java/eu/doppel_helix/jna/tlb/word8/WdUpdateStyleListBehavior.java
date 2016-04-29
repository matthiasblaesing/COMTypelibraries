
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E9F1477D-EBE4-3E52-8171-6D2E3AEF58CD})</p>
 */
public enum WdUpdateStyleListBehavior implements IComEnum {
    
    /**
     * (0)
     */
    wdListBehaviorKeepPreviousPattern(0),
    
    /**
     * (1)
     */
    wdListBehaviorAddBulletsNumbering(1),
    ;

    private WdUpdateStyleListBehavior(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}