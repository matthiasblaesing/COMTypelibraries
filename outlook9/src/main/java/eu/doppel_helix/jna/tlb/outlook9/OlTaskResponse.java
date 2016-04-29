
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlTaskResponse implements IComEnum {
    
    /**
     * (0)
     */
    olTaskSimple(0),
    
    /**
     * (1)
     */
    olTaskAssign(1),
    
    /**
     * (2)
     */
    olTaskAccept(2),
    
    /**
     * (3)
     */
    olTaskDecline(3),
    ;

    private OlTaskResponse(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}