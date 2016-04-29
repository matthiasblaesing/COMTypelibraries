
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9A004EB1-0626-3809-B753-FAE554E3721B})</p>
 */
public enum WdVisualSelection implements IComEnum {
    
    /**
     * (0)
     */
    wdVisualSelectionBlock(0),
    
    /**
     * (1)
     */
    wdVisualSelectionContinuous(1),
    ;

    private WdVisualSelection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}