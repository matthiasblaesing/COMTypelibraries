
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({83857847-1A45-3BD4-8ECB-576D355911EE})</p>
 */
public enum WdSelectionFlags implements IComEnum {
    
    /**
     * (1)
     */
    wdSelStartActive(1),
    
    /**
     * (2)
     */
    wdSelAtEOL(2),
    
    /**
     * (4)
     */
    wdSelOvertype(4),
    
    /**
     * (8)
     */
    wdSelActive(8),
    
    /**
     * (16)
     */
    wdSelReplace(16),
    ;

    private WdSelectionFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}