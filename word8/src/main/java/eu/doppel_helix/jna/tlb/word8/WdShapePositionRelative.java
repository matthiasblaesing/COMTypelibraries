
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({069470C7-2FC7-3561-8F3F-B4A4510D2A53})</p>
 */
public enum WdShapePositionRelative implements IComEnum {
    
    /**
     * (-999999)
     */
    wdShapePositionRelativeNone(-999999),
    ;

    private WdShapePositionRelative(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}