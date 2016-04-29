
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFileFindOptions implements IComEnum {
    
    /**
     * (1)
     */
    msoOptionsNew(1),
    
    /**
     * (2)
     */
    msoOptionsAdd(2),
    
    /**
     * (3)
     */
    msoOptionsWithin(3),
    ;

    private MsoFileFindOptions(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}