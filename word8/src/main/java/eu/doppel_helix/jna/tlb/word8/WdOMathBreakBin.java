
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8105E2B5-53C4-31C9-9EBD-75706288B16A})</p>
 */
public enum WdOMathBreakBin implements IComEnum {
    
    /**
     * (0)
     */
    wdOMathBreakBinBefore(0),
    
    /**
     * (1)
     */
    wdOMathBreakBinAfter(1),
    
    /**
     * (2)
     */
    wdOMathBreakBinRepeat(2),
    ;

    private WdOMathBreakBin(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}