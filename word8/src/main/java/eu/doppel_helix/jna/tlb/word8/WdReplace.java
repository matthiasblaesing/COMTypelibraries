
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({739A8B0A-D71D-3C99-84FF-1E3440263312})</p>
 */
public enum WdReplace implements IComEnum {
    
    /**
     * (0)
     */
    wdReplaceNone(0),
    
    /**
     * (1)
     */
    wdReplaceOne(1),
    
    /**
     * (2)
     */
    wdReplaceAll(2),
    ;

    private WdReplace(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}