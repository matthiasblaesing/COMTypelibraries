
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({56E5F138-CFE9-30D3-BC8D-6556D487360D})</p>
 */
public enum WdMergeFormatFrom implements IComEnum {
    
    /**
     * (0)
     */
    wdMergeFormatFromOriginal(0),
    
    /**
     * (1)
     */
    wdMergeFormatFromRevised(1),
    
    /**
     * (2)
     */
    wdMergeFormatFromPrompt(2),
    ;

    private WdMergeFormatFrom(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}