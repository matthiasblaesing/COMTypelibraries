
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({76D9466C-84C2-4355-81FE-CB1B9CB03C19})</p>
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