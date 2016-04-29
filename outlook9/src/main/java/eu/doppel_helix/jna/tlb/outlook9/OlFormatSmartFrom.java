
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormatSmartFrom implements IComEnum {
    
    /**
     * (1)
     */
    olFormatSmartFromFromTo(1),
    
    /**
     * (2)
     */
    olFormatSmartFromFromOnly(2),
    ;

    private OlFormatSmartFrom(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}