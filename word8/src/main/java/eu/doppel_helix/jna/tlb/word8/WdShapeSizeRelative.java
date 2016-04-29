
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A7F03ADF-2249-3554-ABA1-BDE806AD5EFE})</p>
 */
public enum WdShapeSizeRelative implements IComEnum {
    
    /**
     * (-999999)
     */
    wdShapeSizeRelativeNone(-999999),
    ;

    private WdShapeSizeRelative(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}