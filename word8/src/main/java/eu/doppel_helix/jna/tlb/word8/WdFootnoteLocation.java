
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7F3F2ED2-0B48-3FA1-8072-2F9923016ADF})</p>
 */
public enum WdFootnoteLocation implements IComEnum {
    
    /**
     * (0)
     */
    wdBottomOfPage(0),
    
    /**
     * (1)
     */
    wdBeneathText(1),
    ;

    private WdFootnoteLocation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}