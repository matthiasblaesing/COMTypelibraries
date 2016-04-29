
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8472D0A9-03EA-3253-8BC8-F66718CF09A6})</p>
 */
public enum WdSeekView implements IComEnum {
    
    /**
     * (0)
     */
    wdSeekMainDocument(0),
    
    /**
     * (1)
     */
    wdSeekPrimaryHeader(1),
    
    /**
     * (2)
     */
    wdSeekFirstPageHeader(2),
    
    /**
     * (3)
     */
    wdSeekEvenPagesHeader(3),
    
    /**
     * (4)
     */
    wdSeekPrimaryFooter(4),
    
    /**
     * (5)
     */
    wdSeekFirstPageFooter(5),
    
    /**
     * (6)
     */
    wdSeekEvenPagesFooter(6),
    
    /**
     * (7)
     */
    wdSeekFootnotes(7),
    
    /**
     * (8)
     */
    wdSeekEndnotes(8),
    
    /**
     * (9)
     */
    wdSeekCurrentPageHeader(9),
    
    /**
     * (10)
     */
    wdSeekCurrentPageFooter(10),
    ;

    private WdSeekView(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}