
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSlicerCacheType implements IComEnum {
    
    /**
     * (1)
     */
    xlSlicer(1),
    
    /**
     * (2)
     */
    xlTimeline(2),
    ;

    private XlSlicerCacheType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}