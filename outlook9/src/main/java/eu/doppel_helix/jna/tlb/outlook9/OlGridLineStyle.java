
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlGridLineStyle implements IComEnum {
    
    /**
     * (0)
     */
    olGridLineNone(0),
    
    /**
     * (1)
     */
    olGridLineSmallDots(1),
    
    /**
     * (2)
     */
    olGridLineLargeDots(2),
    
    /**
     * (3)
     */
    olGridLineDashes(3),
    
    /**
     * (4)
     */
    olGridLineSolid(4),
    ;

    private OlGridLineStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}