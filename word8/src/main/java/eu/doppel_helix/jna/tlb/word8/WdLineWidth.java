
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A33A1A8C-A17C-31FF-B651-1E748E509DE2})</p>
 */
public enum WdLineWidth implements IComEnum {
    
    /**
     * (2)
     */
    wdLineWidth025pt(2),
    
    /**
     * (4)
     */
    wdLineWidth050pt(4),
    
    /**
     * (6)
     */
    wdLineWidth075pt(6),
    
    /**
     * (8)
     */
    wdLineWidth100pt(8),
    
    /**
     * (12)
     */
    wdLineWidth150pt(12),
    
    /**
     * (18)
     */
    wdLineWidth225pt(18),
    
    /**
     * (24)
     */
    wdLineWidth300pt(24),
    
    /**
     * (36)
     */
    wdLineWidth450pt(36),
    
    /**
     * (48)
     */
    wdLineWidth600pt(48),
    ;

    private WdLineWidth(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}