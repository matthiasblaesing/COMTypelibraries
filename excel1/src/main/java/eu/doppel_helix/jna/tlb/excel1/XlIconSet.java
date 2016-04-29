
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlIconSet implements IComEnum {
    
    /**
     * (-1)
     */
    xlCustomSet(-1),
    
    /**
     * (1)
     */
    xl3Arrows(1),
    
    /**
     * (2)
     */
    xl3ArrowsGray(2),
    
    /**
     * (3)
     */
    xl3Flags(3),
    
    /**
     * (4)
     */
    xl3TrafficLights1(4),
    
    /**
     * (5)
     */
    xl3TrafficLights2(5),
    
    /**
     * (6)
     */
    xl3Signs(6),
    
    /**
     * (7)
     */
    xl3Symbols(7),
    
    /**
     * (8)
     */
    xl3Symbols2(8),
    
    /**
     * (9)
     */
    xl4Arrows(9),
    
    /**
     * (10)
     */
    xl4ArrowsGray(10),
    
    /**
     * (11)
     */
    xl4RedToBlack(11),
    
    /**
     * (12)
     */
    xl4CRV(12),
    
    /**
     * (13)
     */
    xl4TrafficLights(13),
    
    /**
     * (14)
     */
    xl5Arrows(14),
    
    /**
     * (15)
     */
    xl5ArrowsGray(15),
    
    /**
     * (16)
     */
    xl5CRV(16),
    
    /**
     * (17)
     */
    xl5Quarters(17),
    
    /**
     * (18)
     */
    xl3Stars(18),
    
    /**
     * (19)
     */
    xl3Triangles(19),
    
    /**
     * (20)
     */
    xl5Boxes(20),
    ;

    private XlIconSet(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}