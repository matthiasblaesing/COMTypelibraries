
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({BFA3BC72-BCD9-31CC-9F78-1AE867DF9840})</p>
 */
public enum WdDocumentType implements IComEnum {
    
    /**
     * (0)
     */
    wdTypeDocument(0),
    
    /**
     * (1)
     */
    wdTypeTemplate(1),
    
    /**
     * (2)
     */
    wdTypeFrameset(2),
    ;

    private WdDocumentType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}