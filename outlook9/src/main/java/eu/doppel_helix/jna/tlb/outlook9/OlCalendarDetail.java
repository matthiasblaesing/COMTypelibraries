
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlCalendarDetail implements IComEnum {
    
    /**
     * (0)
     */
    olFreeBusyOnly(0),
    
    /**
     * (1)
     */
    olFreeBusyAndSubject(1),
    
    /**
     * (2)
     */
    olFullDetails(2),
    ;

    private OlCalendarDetail(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}