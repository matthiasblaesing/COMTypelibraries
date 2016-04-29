
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlMeetingRecipientType implements IComEnum {
    
    /**
     * (0)
     */
    olOrganizer(0),
    
    /**
     * (1)
     */
    olRequired(1),
    
    /**
     * (2)
     */
    olOptional(2),
    
    /**
     * (3)
     */
    olResource(3),
    ;

    private OlMeetingRecipientType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}