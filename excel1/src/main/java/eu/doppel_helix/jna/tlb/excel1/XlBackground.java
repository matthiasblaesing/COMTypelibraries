
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlBackground implements IComEnum {
    
    /**
     * (-4105)
     */
    xlBackgroundAutomatic(-4105),
    
    /**
     * (3)
     */
    xlBackgroundOpaque(3),
    
    /**
     * (2)
     */
    xlBackgroundTransparent(2),
    ;

    private XlBackground(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}