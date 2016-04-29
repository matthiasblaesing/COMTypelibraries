
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({062752C8-C44D-3CBD-A146-0DCD9544BA52})</p>
 */
public enum WdPageNumberAlignment implements IComEnum {
    
    /**
     * (0)
     */
    wdAlignPageNumberLeft(0),
    
    /**
     * (1)
     */
    wdAlignPageNumberCenter(1),
    
    /**
     * (2)
     */
    wdAlignPageNumberRight(2),
    
    /**
     * (3)
     */
    wdAlignPageNumberInside(3),
    
    /**
     * (4)
     */
    wdAlignPageNumberOutside(4),
    ;

    private WdPageNumberAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}