
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlActionCopyLike implements IComEnum {
    
    /**
     * (0)
     */
    olReply(0),
    
    /**
     * (1)
     */
    olReplyAll(1),
    
    /**
     * (2)
     */
    olForward(2),
    
    /**
     * (3)
     */
    olReplyFolder(3),
    
    /**
     * (4)
     */
    olRespond(4),
    ;

    private OlActionCopyLike(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}