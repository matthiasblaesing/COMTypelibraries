
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlChartGallery implements IComEnum {
    
    /**
     * (21)
     */
    xlBuiltIn(21),
    
    /**
     * (22)
     */
    xlUserDefined(22),
    
    /**
     * (23)
     */
    xlAnyGallery(23),
    ;

    private XlChartGallery(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}