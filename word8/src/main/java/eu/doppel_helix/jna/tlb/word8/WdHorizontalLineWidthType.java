
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6BE99866-55FF-336C-9719-681E7E04E74E})</p>
 */
public enum WdHorizontalLineWidthType implements IComEnum {
    
    /**
     * (-1)
     */
    wdHorizontalLinePercentWidth(-1),
    
    /**
     * (-2)
     */
    wdHorizontalLineFixedWidth(-2),
    ;

    private WdHorizontalLineWidthType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}