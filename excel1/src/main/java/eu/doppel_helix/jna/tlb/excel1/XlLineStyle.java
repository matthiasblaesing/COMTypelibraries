
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlLineStyle implements IComEnum {
    
    /**
     * (1)
     */
    xlContinuous(1),
    
    /**
     * (-4115)
     */
    xlDash(-4115),
    
    /**
     * (4)
     */
    xlDashDot(4),
    
    /**
     * (5)
     */
    xlDashDotDot(5),
    
    /**
     * (-4118)
     */
    xlDot(-4118),
    
    /**
     * (-4119)
     */
    xlDouble(-4119),
    
    /**
     * (13)
     */
    xlSlantDashDot(13),
    
    /**
     * (-4142)
     */
    xlLineStyleNone(-4142),
    ;

    private XlLineStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}