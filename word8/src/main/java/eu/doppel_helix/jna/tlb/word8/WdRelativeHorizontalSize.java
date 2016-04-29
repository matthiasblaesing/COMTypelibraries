
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C7D9681C-4F5C-3840-BFCE-C91510B56181})</p>
 */
public enum WdRelativeHorizontalSize implements IComEnum {
    
    /**
     * (0)
     */
    wdRelativeHorizontalSizeMargin(0),
    
    /**
     * (1)
     */
    wdRelativeHorizontalSizePage(1),
    
    /**
     * (2)
     */
    wdRelativeHorizontalSizeLeftMarginArea(2),
    
    /**
     * (3)
     */
    wdRelativeHorizontalSizeRightMarginArea(3),
    
    /**
     * (4)
     */
    wdRelativeHorizontalSizeInnerMarginArea(4),
    
    /**
     * (5)
     */
    wdRelativeHorizontalSizeOuterMarginArea(5),
    ;

    private WdRelativeHorizontalSize(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}