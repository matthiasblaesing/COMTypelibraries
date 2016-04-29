
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSubscribeToFormat implements IComEnum {
    
    /**
     * (-4147)
     */
    xlSubscribeToPicture(-4147),
    
    /**
     * (-4158)
     */
    xlSubscribeToText(-4158),
    ;

    private XlSubscribeToFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}