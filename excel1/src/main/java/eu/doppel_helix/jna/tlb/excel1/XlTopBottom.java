
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlTopBottom implements IComEnum {
    
    /**
     * (1)
     */
    xlTop10Top(1),
    
    /**
     * (0)
     */
    xlTop10Bottom(0),
    ;

    private XlTopBottom(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}