
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D73D319D-BB39-3BFC-BC01-509855F4C15F})</p>
 */
public enum WdDefaultListBehavior implements IComEnum {
    
    /**
     * (0)
     */
    wdWord8ListBehavior(0),
    
    /**
     * (1)
     */
    wdWord9ListBehavior(1),
    
    /**
     * (2)
     */
    wdWord10ListBehavior(2),
    ;

    private WdDefaultListBehavior(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}