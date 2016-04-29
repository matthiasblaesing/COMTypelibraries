
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1C4E96C0-3BEB-37A7-8B5B-ED303F90F6EA})</p>
 */
public enum WdReadingLayoutMargin implements IComEnum {
    
    /**
     * (0)
     */
    wdAutomaticMargin(0),
    
    /**
     * (1)
     */
    wdSuppressMargin(1),
    
    /**
     * (2)
     */
    wdFullMargin(2),
    ;

    private WdReadingLayoutMargin(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}