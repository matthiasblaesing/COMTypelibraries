
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlOutlookBarViewType implements IComEnum {
    
    /**
     * (0)
     */
    olLargeIcon(0),
    
    /**
     * (1)
     */
    olSmallIcon(1),
    ;

    private OlOutlookBarViewType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}