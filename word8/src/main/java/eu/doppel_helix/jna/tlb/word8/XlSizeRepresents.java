
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSizeRepresents implements IComEnum {
    
    /**
     * (2)
     */
    xlSizeIsWidth(2),
    
    /**
     * (1)
     */
    xlSizeIsArea(1),
    ;

    private XlSizeRepresents(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}