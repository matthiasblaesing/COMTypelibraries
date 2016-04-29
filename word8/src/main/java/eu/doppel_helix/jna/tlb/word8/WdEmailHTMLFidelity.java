
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({35793B96-E562-3051-AB25-0AFCBCC95492})</p>
 */
public enum WdEmailHTMLFidelity implements IComEnum {
    
    /**
     * (1)
     */
    wdEmailHTMLFidelityLow(1),
    
    /**
     * (2)
     */
    wdEmailHTMLFidelityMedium(2),
    
    /**
     * (3)
     */
    wdEmailHTMLFidelityHigh(3),
    ;

    private WdEmailHTMLFidelity(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}