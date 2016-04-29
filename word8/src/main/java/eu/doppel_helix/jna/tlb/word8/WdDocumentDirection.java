
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({F59BB1C3-B1CA-33C4-AA64-F411DD654E19})</p>
 */
public enum WdDocumentDirection implements IComEnum {
    
    /**
     * (0)
     */
    wdLeftToRight(0),
    
    /**
     * (1)
     */
    wdRightToLeft(1),
    ;

    private WdDocumentDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}