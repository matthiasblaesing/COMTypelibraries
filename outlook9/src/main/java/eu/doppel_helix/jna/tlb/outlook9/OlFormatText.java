
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormatText implements IComEnum {
    
    /**
     * (1)
     */
    olFormatTextText(1),
    ;

    private OlFormatText(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}