
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlUpdateLinks implements IComEnum {
    
    /**
     * (1)
     */
    xlUpdateLinksUserSetting(1),
    
    /**
     * (2)
     */
    xlUpdateLinksNever(2),
    
    /**
     * (3)
     */
    xlUpdateLinksAlways(3),
    ;

    private XlUpdateLinks(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}