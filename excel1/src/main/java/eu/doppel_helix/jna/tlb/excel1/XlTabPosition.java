
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlTabPosition implements IComEnum {
    
    /**
     * (0)
     */
    xlTabPositionFirst(0),
    
    /**
     * (1)
     */
    xlTabPositionLast(1),
    ;

    private XlTabPosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}