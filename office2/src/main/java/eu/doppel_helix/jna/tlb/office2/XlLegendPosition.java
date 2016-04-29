
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({04D217CD-1859-4786-B583-07BA2092A552})</p>
 */
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