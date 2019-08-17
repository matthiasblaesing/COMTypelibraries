
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E195F3E3-8EC3-4A67-81FE-DDBEC2B42D3F})</p>
 */
public enum SpecialLocation implements IComEnum {
    
    /**
     * (0)
     */
    slBackUpFolder(0),
    
    /**
     * (1)
     */
    slUnfiledNotesSection(1),
    
    /**
     * (2)
     */
    slDefaultNotebookFolder(2),
    ;

    private SpecialLocation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}