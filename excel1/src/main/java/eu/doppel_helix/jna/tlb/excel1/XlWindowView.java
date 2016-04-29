
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlWindowView implements IComEnum {
    
    /**
     * (1)
     */
    xlNormalView(1),
    
    /**
     * (2)
     */
    xlPageBreakPreview(2),
    
    /**
     * (3)
     */
    xlPageLayoutView(3),
    ;

    private XlWindowView(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}