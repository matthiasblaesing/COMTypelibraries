
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoLineDashStyle implements IComEnum {
    
    /**
     * (-2)
     */
    msoLineDashStyleMixed(-2),
    
    /**
     * (1)
     */
    msoLineSolid(1),
    
    /**
     * (2)
     */
    msoLineSquareDot(2),
    
    /**
     * (3)
     */
    msoLineRoundDot(3),
    
    /**
     * (4)
     */
    msoLineDash(4),
    
    /**
     * (5)
     */
    msoLineDashDot(5),
    
    /**
     * (6)
     */
    msoLineDashDotDot(6),
    
    /**
     * (7)
     */
    msoLineLongDash(7),
    
    /**
     * (8)
     */
    msoLineLongDashDot(8),
    
    /**
     * (9)
     */
    msoLineLongDashDotDot(9),
    
    /**
     * (10)
     */
    msoLineSysDash(10),
    
    /**
     * (11)
     */
    msoLineSysDot(11),
    
    /**
     * (12)
     */
    msoLineSysDashDot(12),
    ;

    private MsoLineDashStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}