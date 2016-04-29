
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A478B3F3-3885-3C52-B12F-AAF22E58D380})</p>
 */
public enum WdRelativeVerticalSize implements IComEnum {
    
    /**
     * (0)
     */
    wdRelativeVerticalSizeMargin(0),
    
    /**
     * (1)
     */
    wdRelativeVerticalSizePage(1),
    
    /**
     * (2)
     */
    wdRelativeVerticalSizeTopMarginArea(2),
    
    /**
     * (3)
     */
    wdRelativeVerticalSizeBottomMarginArea(3),
    
    /**
     * (4)
     */
    wdRelativeVerticalSizeInnerMarginArea(4),
    
    /**
     * (5)
     */
    wdRelativeVerticalSizeOuterMarginArea(5),
    ;

    private WdRelativeVerticalSize(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}