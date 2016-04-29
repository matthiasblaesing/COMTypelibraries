
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6CF7A114-A67B-3B17-AE17-03564598740D})</p>
 */
public enum WdHorizontalLineAlignment implements IComEnum {
    
    /**
     * (0)
     */
    wdHorizontalLineAlignLeft(0),
    
    /**
     * (1)
     */
    wdHorizontalLineAlignCenter(1),
    
    /**
     * (2)
     */
    wdHorizontalLineAlignRight(2),
    ;

    private WdHorizontalLineAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}