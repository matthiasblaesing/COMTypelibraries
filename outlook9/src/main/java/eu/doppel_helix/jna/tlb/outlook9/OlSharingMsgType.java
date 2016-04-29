
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlSharingMsgType implements IComEnum {
    
    /**
     * (0)
     */
    olSharingMsgTypeUnknown(0),
    
    /**
     * (1)
     */
    olSharingMsgTypeRequest(1),
    
    /**
     * (2)
     */
    olSharingMsgTypeInvite(2),
    
    /**
     * (3)
     */
    olSharingMsgTypeInviteAndRequest(3),
    
    /**
     * (4)
     */
    olSharingMsgTypeResponseAllow(4),
    
    /**
     * (5)
     */
    olSharingMsgTypeResponseDeny(5),
    ;

    private OlSharingMsgType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}