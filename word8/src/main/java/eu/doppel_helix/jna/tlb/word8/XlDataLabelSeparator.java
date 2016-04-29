
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDataLabelSeparator implements IComEnum {
    
    /**
     * (1)
     */
    xlDataLabelSeparatorDefault(1),
    ;

    private XlDataLabelSeparator(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}