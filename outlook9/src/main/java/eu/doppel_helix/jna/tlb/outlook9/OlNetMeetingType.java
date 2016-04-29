
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlNetMeetingType implements IComEnum {
    
    /**
     * (0)
     */
    olNetMeeting(0),
    
    /**
     * (1)
     */
    olNetShow(1),
    
    /**
     * (2)
     */
    olExchangeConferencing(2),
    ;

    private OlNetMeetingType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}