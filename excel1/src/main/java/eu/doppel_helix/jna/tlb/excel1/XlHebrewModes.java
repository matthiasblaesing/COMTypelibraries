
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlHebrewModes implements IComEnum {
    
    /**
     * (0)
     */
    xlHebrewFullScript(0),
    
    /**
     * (1)
     */
    xlHebrewPartialScript(1),
    
    /**
     * (2)
     */
    xlHebrewMixedScript(2),
    
    /**
     * (3)
     */
    xlHebrewMixedAuthorizedScript(3),
    ;

    private XlHebrewModes(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}