
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlActionShowOn implements IComEnum {
    
    /**
     * (0)
     */
    olDontShow(0),
    
    /**
     * (1)
     */
    olMenu(1),
    
    /**
     * (2)
     */
    olMenuAndToolbar(2),
    ;

    private OlActionShowOn(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}