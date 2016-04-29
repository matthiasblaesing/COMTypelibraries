
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlMeetingResponse implements IComEnum {
    
    /**
     * (2)
     */
    olMeetingTentative(2),
    
    /**
     * (3)
     */
    olMeetingAccepted(3),
    
    /**
     * (4)
     */
    olMeetingDeclined(4),
    ;

    private OlMeetingResponse(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}