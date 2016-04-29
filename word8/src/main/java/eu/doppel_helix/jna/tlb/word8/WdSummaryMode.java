
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({4F925449-10C2-34BA-81AB-6EB5C8F82F3E})</p>
 */
public enum WdSummaryMode implements IComEnum {
    
    /**
     * (0)
     */
    wdSummaryModeHighlight(0),
    
    /**
     * (1)
     */
    wdSummaryModeHideAllButSummary(1),
    
    /**
     * (2)
     */
    wdSummaryModeInsert(2),
    
    /**
     * (3)
     */
    wdSummaryModeCreateNew(3),
    ;

    private WdSummaryMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}