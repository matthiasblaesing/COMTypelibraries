
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSubtototalLocationType implements IComEnum {
    
    /**
     * (1)
     */
    xlAtTop(1),
    
    /**
     * (2)
     */
    xlAtBottom(2),
    ;

    private XlSubtototalLocationType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}