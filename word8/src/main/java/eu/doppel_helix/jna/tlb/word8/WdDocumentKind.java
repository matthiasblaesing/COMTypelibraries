
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({FCC2234D-E8C2-3676-AF72-8589E043FB64})</p>
 */
public enum WdDocumentKind implements IComEnum {
    
    /**
     * (0)
     */
    wdDocumentNotSpecified(0),
    
    /**
     * (1)
     */
    wdDocumentLetter(1),
    
    /**
     * (2)
     */
    wdDocumentEmail(2),
    ;

    private WdDocumentKind(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}