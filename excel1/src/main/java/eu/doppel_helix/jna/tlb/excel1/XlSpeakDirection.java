
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSpeakDirection implements IComEnum {
    
    /**
     * (0)
     */
    xlSpeakByRows(0),
    
    /**
     * (1)
     */
    xlSpeakByColumns(1),
    ;

    private XlSpeakDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}