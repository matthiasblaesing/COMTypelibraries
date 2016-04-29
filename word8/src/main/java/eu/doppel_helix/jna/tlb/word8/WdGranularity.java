
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({AAAF85A7-31AF-3EE3-B5AA-99ECEDEEBAFF})</p>
 */
public enum WdGranularity implements IComEnum {
    
    /**
     * (0)
     */
    wdGranularityCharLevel(0),
    
    /**
     * (1)
     */
    wdGranularityWordLevel(1),
    ;

    private WdGranularity(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}