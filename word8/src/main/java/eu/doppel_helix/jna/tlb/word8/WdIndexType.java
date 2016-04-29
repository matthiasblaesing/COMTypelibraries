
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({80954786-7FCB-3BFD-9F88-94F39D2C7385})</p>
 */
public enum WdIndexType implements IComEnum {
    
    /**
     * (0)
     */
    wdIndexIndent(0),
    
    /**
     * (1)
     */
    wdIndexRunin(1),
    ;

    private WdIndexType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}