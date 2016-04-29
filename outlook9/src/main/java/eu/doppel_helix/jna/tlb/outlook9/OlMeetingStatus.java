
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlMeetingStatus implements IComEnum {
    
    /**
     * (0)
     */
    olNonMeeting(0),
    
    /**
     * (1)
     */
    olMeeting(1),
    
    /**
     * (3)
     */
    olMeetingReceived(3),
    
    /**
     * (5)
     */
    olMeetingCanceled(5),
    
    /**
     * (7)
     */
    olMeetingReceivedAndCanceled(7),
    ;

    private OlMeetingStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}