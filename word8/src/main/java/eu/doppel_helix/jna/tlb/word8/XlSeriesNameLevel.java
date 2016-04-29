
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({336C75F2-4E4C-47C7-B4A9-D99AA7F81591})</p>
 */
public enum XlSeriesNameLevel implements IComEnum {
    
    /**
     * (-3)
     */
    xlSeriesNameLevelNone(-3),
    
    /**
     * (-2)
     */
    xlSeriesNameLevelCustom(-2),
    
    /**
     * (-1)
     */
    xlSeriesNameLevelAll(-1),
    ;

    private XlSeriesNameLevel(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}