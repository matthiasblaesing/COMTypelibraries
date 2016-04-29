
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlLegendPosition implements IComEnum {
    
    /**
     * (-4107)
     */
    xlLegendPositionBottom(-4107),
    
    /**
     * (2)
     */
    xlLegendPositionCorner(2),
    
    /**
     * (-4131)
     */
    xlLegendPositionLeft(-4131),
    
    /**
     * (-4152)
     */
    xlLegendPositionRight(-4152),
    
    /**
     * (-4160)
     */
    xlLegendPositionTop(-4160),
    
    /**
     * (-4161)
     */
    xlLegendPositionCustom(-4161),
    ;

    private XlLegendPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}