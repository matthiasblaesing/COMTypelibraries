
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDirection implements IComEnum {
    
    /**
     * (-4121)
     */
    xlDown(-4121),
    
    /**
     * (-4159)
     */
    xlToLeft(-4159),
    
    /**
     * (-4161)
     */
    xlToRight(-4161),
    
    /**
     * (-4162)
     */
    xlUp(-4162),
    ;

    private XlDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}