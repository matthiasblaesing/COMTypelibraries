
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlLinkInfo implements IComEnum {
    
    /**
     * (2)
     */
    xlEditionDate(2),
    
    /**
     * (1)
     */
    xlUpdateState(1),
    
    /**
     * (3)
     */
    xlLinkInfoStatus(3),
    ;

    private XlLinkInfo(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}