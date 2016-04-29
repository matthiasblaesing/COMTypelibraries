
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlOartHorizontalOverflow implements IComEnum {
    
    /**
     * (0)
     */
    xlOartHorizontalOverflowOverflow(0),
    
    /**
     * (1)
     */
    xlOartHorizontalOverflowClip(1),
    ;

    private XlOartHorizontalOverflow(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}