
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlDisplayType implements IComEnum {
    
    /**
     * (0)
     */
    olUser(0),
    
    /**
     * (1)
     */
    olDistList(1),
    
    /**
     * (2)
     */
    olForum(2),
    
    /**
     * (3)
     */
    olAgent(3),
    
    /**
     * (4)
     */
    olOrganization(4),
    
    /**
     * (5)
     */
    olPrivateDistList(5),
    
    /**
     * (6)
     */
    olRemoteUser(6),
    ;

    private OlDisplayType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}