
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

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