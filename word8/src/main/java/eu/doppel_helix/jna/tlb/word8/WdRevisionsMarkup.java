
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E775B5AE-2434-4F43-8F25-A9A4BBB2243D})</p>
 */
public enum WdRevisionsMarkup implements IComEnum {
    
    /**
     * (0)
     */
    wdRevisionsMarkupNone(0),
    
    /**
     * (1)
     */
    wdRevisionsMarkupSimple(1),
    
    /**
     * (2)
     */
    wdRevisionsMarkupAll(2),
    ;

    private WdRevisionsMarkup(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}