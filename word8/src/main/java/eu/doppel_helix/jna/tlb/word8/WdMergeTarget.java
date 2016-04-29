
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({577F8B82-4D9C-3461-9045-C379319A9185})</p>
 */
public enum WdMergeTarget implements IComEnum {
    
    /**
     * (0)
     */
    wdMergeTargetSelected(0),
    
    /**
     * (1)
     */
    wdMergeTargetCurrent(1),
    
    /**
     * (2)
     */
    wdMergeTargetNew(2),
    ;

    private WdMergeTarget(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}