
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OLECMDF implements IComEnum {
    
    /**
     * (1)
     */
    OLECMDF_SUPPORTED(1),
    
    /**
     * (2)
     */
    OLECMDF_ENABLED(2),
    
    /**
     * (4)
     */
    OLECMDF_LATCHED(4),
    
    /**
     * (8)
     */
    OLECMDF_NINCHED(8),
    
    /**
     * (16)
     */
    OLECMDF_INVISIBLE(16),
    
    /**
     * (32)
     */
    OLECMDF_DEFHIDEONCTXTMENU(32),
    ;

    private OLECMDF(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}