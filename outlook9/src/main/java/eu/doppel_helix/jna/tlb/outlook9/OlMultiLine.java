
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlMultiLine implements IComEnum {
    
    /**
     * (0)
     */
    olWidthMultiLine(0),
    
    /**
     * (1)
     */
    olAlwaysSingleLine(1),
    
    /**
     * (2)
     */
    olAlwaysMultiLine(2),
    ;

    private OlMultiLine(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}