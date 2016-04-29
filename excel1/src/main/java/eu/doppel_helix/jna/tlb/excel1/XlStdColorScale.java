
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlStdColorScale implements IComEnum {
    
    /**
     * (1)
     */
    xlColorScaleRYG(1),
    
    /**
     * (2)
     */
    xlColorScaleGYR(2),
    
    /**
     * (3)
     */
    xlColorScaleBlackWhite(3),
    
    /**
     * (4)
     */
    xlColorScaleWhiteBlack(4),
    ;

    private XlStdColorScale(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}