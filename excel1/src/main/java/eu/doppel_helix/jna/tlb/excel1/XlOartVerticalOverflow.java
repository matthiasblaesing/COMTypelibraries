
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlOartVerticalOverflow implements IComEnum {
    
    /**
     * (0)
     */
    xlOartVerticalOverflowOverflow(0),
    
    /**
     * (1)
     */
    xlOartVerticalOverflowClip(1),
    
    /**
     * (2)
     */
    xlOartVerticalOverflowEllipsis(2),
    ;

    private XlOartVerticalOverflow(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}