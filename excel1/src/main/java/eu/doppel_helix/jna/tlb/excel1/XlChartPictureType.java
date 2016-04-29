
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlChartPictureType implements IComEnum {
    
    /**
     * (3)
     */
    xlStackScale(3),
    
    /**
     * (2)
     */
    xlStack(2),
    
    /**
     * (1)
     */
    xlStretch(1),
    ;

    private XlChartPictureType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}