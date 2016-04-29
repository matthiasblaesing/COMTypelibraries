
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPageOrientation implements IComEnum {
    
    /**
     * (2)
     */
    xlLandscape(2),
    
    /**
     * (1)
     */
    xlPortrait(1),
    ;

    private XlPageOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}