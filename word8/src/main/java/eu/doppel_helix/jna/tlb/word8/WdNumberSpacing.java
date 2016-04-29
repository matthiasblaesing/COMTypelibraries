
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WdNumberSpacing implements IComEnum {
    
    /**
     * (0)
     */
    wdNumberSpacingDefault(0),
    
    /**
     * (1)
     */
    wdNumberSpacingProportional(1),
    
    /**
     * (2)
     */
    wdNumberSpacingTabular(2),
    ;

    private WdNumberSpacing(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}