
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D81E8221-7427-3223-8220-0022778B7C3E})</p>
 */
public enum WdDocPartInsertOptions implements IComEnum {
    
    /**
     * (0)
     */
    wdInsertContent(0),
    
    /**
     * (1)
     */
    wdInsertParagraph(1),
    
    /**
     * (2)
     */
    wdInsertPage(2),
    ;

    private WdDocPartInsertOptions(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}