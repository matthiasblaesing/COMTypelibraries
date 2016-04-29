
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlChartPicturePlacement implements IComEnum {
    
    /**
     * (1)
     */
    xlSides(1),
    
    /**
     * (2)
     */
    xlEnd(2),
    
    /**
     * (3)
     */
    xlEndSides(3),
    
    /**
     * (4)
     */
    xlFront(4),
    
    /**
     * (5)
     */
    xlFrontSides(5),
    
    /**
     * (6)
     */
    xlFrontEnd(6),
    
    /**
     * (7)
     */
    xlAllFaces(7),
    ;

    private XlChartPicturePlacement(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}