
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({183804E4-7307-32E8-8D48-2493383DC46D})</p>
 */
public enum WdEndnoteLocation implements IComEnum {
    
    /**
     * (0)
     */
    wdEndOfSection(0),
    
    /**
     * (1)
     */
    wdEndOfDocument(1),
    ;

    private WdEndnoteLocation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}