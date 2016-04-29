
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBevelType implements IComEnum {
    
    /**
     * (-2)
     */
    msoBevelTypeMixed(-2),
    
    /**
     * (1)
     */
    msoBevelNone(1),
    
    /**
     * (2)
     */
    msoBevelRelaxedInset(2),
    
    /**
     * (3)
     */
    msoBevelCircle(3),
    
    /**
     * (4)
     */
    msoBevelSlope(4),
    
    /**
     * (5)
     */
    msoBevelCross(5),
    
    /**
     * (6)
     */
    msoBevelAngle(6),
    
    /**
     * (7)
     */
    msoBevelSoftRound(7),
    
    /**
     * (8)
     */
    msoBevelConvex(8),
    
    /**
     * (9)
     */
    msoBevelCoolSlant(9),
    
    /**
     * (10)
     */
    msoBevelDivot(10),
    
    /**
     * (11)
     */
    msoBevelRiblet(11),
    
    /**
     * (12)
     */
    msoBevelHardEdge(12),
    
    /**
     * (13)
     */
    msoBevelArtDeco(13),
    ;

    private MsoBevelType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}