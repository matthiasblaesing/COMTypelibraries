
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({54AFDECB-0EC4-397D-96AB-8E2A64FD7C3A})</p>
 */
public enum WdLineStyle implements IComEnum {
    
    /**
     * (0)
     */
    wdLineStyleNone(0),
    
    /**
     * (1)
     */
    wdLineStyleSingle(1),
    
    /**
     * (2)
     */
    wdLineStyleDot(2),
    
    /**
     * (3)
     */
    wdLineStyleDashSmallGap(3),
    
    /**
     * (4)
     */
    wdLineStyleDashLargeGap(4),
    
    /**
     * (5)
     */
    wdLineStyleDashDot(5),
    
    /**
     * (6)
     */
    wdLineStyleDashDotDot(6),
    
    /**
     * (7)
     */
    wdLineStyleDouble(7),
    
    /**
     * (8)
     */
    wdLineStyleTriple(8),
    
    /**
     * (9)
     */
    wdLineStyleThinThickSmallGap(9),
    
    /**
     * (10)
     */
    wdLineStyleThickThinSmallGap(10),
    
    /**
     * (11)
     */
    wdLineStyleThinThickThinSmallGap(11),
    
    /**
     * (12)
     */
    wdLineStyleThinThickMedGap(12),
    
    /**
     * (13)
     */
    wdLineStyleThickThinMedGap(13),
    
    /**
     * (14)
     */
    wdLineStyleThinThickThinMedGap(14),
    
    /**
     * (15)
     */
    wdLineStyleThinThickLargeGap(15),
    
    /**
     * (16)
     */
    wdLineStyleThickThinLargeGap(16),
    
    /**
     * (17)
     */
    wdLineStyleThinThickThinLargeGap(17),
    
    /**
     * (18)
     */
    wdLineStyleSingleWavy(18),
    
    /**
     * (19)
     */
    wdLineStyleDoubleWavy(19),
    
    /**
     * (20)
     */
    wdLineStyleDashDotStroked(20),
    
    /**
     * (21)
     */
    wdLineStyleEmboss3D(21),
    
    /**
     * (22)
     */
    wdLineStyleEngrave3D(22),
    
    /**
     * (23)
     */
    wdLineStyleOutset(23),
    
    /**
     * (24)
     */
    wdLineStyleInset(24),
    ;

    private WdLineStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}