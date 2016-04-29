
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({79C569A5-0A9F-3922-BC4D-908835FFED05})</p>
 */
public enum WdDocumentViewDirection implements IComEnum {
    
    /**
     * (0)
     */
    wdDocumentViewRtl(0),
    
    /**
     * (1)
     */
    wdDocumentViewLtr(1),
    ;

    private WdDocumentViewDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}