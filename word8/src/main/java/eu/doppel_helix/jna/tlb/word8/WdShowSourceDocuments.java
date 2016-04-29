
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({57AB7683-4274-37C0-944C-6F14A1980B4D})</p>
 */
public enum WdShowSourceDocuments implements IComEnum {
    
    /**
     * (0)
     */
    wdShowSourceDocumentsNone(0),
    
    /**
     * (1)
     */
    wdShowSourceDocumentsOriginal(1),
    
    /**
     * (2)
     */
    wdShowSourceDocumentsRevised(2),
    
    /**
     * (3)
     */
    wdShowSourceDocumentsBoth(3),
    ;

    private WdShowSourceDocuments(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}