
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D6166973-3665-4EDB-94B0-77C65C34B51C})</p>
 */
public enum PublishFormat implements IComEnum {
    
    /**
     * (0)
     */
    pfOneNote(0),
    
    /**
     * (1)
     */
    pfOneNotePackage(1),
    
    /**
     * (2)
     */
    pfMHTML(2),
    
    /**
     * (3)
     */
    pfPDF(3),
    
    /**
     * (4)
     */
    pfXPS(4),
    
    /**
     * (5)
     */
    pfWord(5),
    
    /**
     * (6)
     */
    pfEMF(6),
    
    /**
     * (7)
     */
    pfHTML(7),
    
    /**
     * (8)
     */
    pfOneNote2007(8),
    ;

    private PublishFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}