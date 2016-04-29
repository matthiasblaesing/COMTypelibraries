
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WdNumberForm implements IComEnum {
    
    /**
     * (0)
     */
    wdNumberFormDefault(0),
    
    /**
     * (1)
     */
    wdNumberFormLining(1),
    
    /**
     * (2)
     */
    wdNumberFormOldStyle(2),
    ;

    private WdNumberForm(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}