
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlDefaultSelectNamesDisplayMode implements IComEnum {
    
    /**
     * (1)
     */
    olDefaultMail(1),
    
    /**
     * (2)
     */
    olDefaultMeeting(2),
    
    /**
     * (4)
     */
    olDefaultSharingRequest(4),
    
    /**
     * (3)
     */
    olDefaultTask(3),
    
    /**
     * (5)
     */
    olDefaultMembers(5),
    
    /**
     * (6)
     */
    olDefaultDelegates(6),
    
    /**
     * (7)
     */
    olDefaultSingleName(7),
    
    /**
     * (8)
     */
    olDefaultPickRooms(8),
    ;

    private OlDefaultSelectNamesDisplayMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}