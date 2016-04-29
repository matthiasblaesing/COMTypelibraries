
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlDefaultExpandCollapseSetting implements IComEnum {
    
    /**
     * (0)
     */
    olAllExpanded(0),
    
    /**
     * (1)
     */
    olAllCollapsed(1),
    
    /**
     * (2)
     */
    olLastViewed(2),
    ;

    private OlDefaultExpandCollapseSetting(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}