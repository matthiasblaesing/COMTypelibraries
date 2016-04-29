
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({62694D53-8F38-33E2-8753-E19D97489C30})</p>
 */
public enum WdOriginalFormat implements IComEnum {
    
    /**
     * (0)
     */
    wdWordDocument(0),
    
    /**
     * (1)
     */
    wdOriginalDocumentFormat(1),
    
    /**
     * (2)
     */
    wdPromptUser(2),
    ;

    private WdOriginalFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}