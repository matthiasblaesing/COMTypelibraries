
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlImportance implements IComEnum {
    
    /**
     * (0)
     */
    olImportanceLow(0),
    
    /**
     * (1)
     */
    olImportanceNormal(1),
    
    /**
     * (2)
     */
    olImportanceHigh(2),
    ;

    private OlImportance(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}