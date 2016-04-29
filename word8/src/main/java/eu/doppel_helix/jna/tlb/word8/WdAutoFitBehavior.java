
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7A27760C-FFDD-35D3-B12A-85CBEC20AFC8})</p>
 */
public enum WdAutoFitBehavior implements IComEnum {
    
    /**
     * (0)
     */
    wdAutoFitFixed(0),
    
    /**
     * (1)
     */
    wdAutoFitContent(1),
    
    /**
     * (2)
     */
    wdAutoFitWindow(2),
    ;

    private WdAutoFitBehavior(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}