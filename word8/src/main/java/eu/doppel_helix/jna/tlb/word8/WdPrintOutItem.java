
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({96E15CCE-75AA-3E47-9B68-410E9A544CD6})</p>
 */
public enum WdPrintOutItem implements IComEnum {
    
    /**
     * (0)
     */
    wdPrintDocumentContent(0),
    
    /**
     * (1)
     */
    wdPrintProperties(1),
    
    /**
     * (2)
     */
    wdPrintComments(2),
    
    /**
     * (2)
     */
    wdPrintMarkup(2),
    
    /**
     * (3)
     */
    wdPrintStyles(3),
    
    /**
     * (4)
     */
    wdPrintAutoTextEntries(4),
    
    /**
     * (5)
     */
    wdPrintKeyAssignments(5),
    
    /**
     * (6)
     */
    wdPrintEnvelope(6),
    
    /**
     * (7)
     */
    wdPrintDocumentWithMarkup(7),
    ;

    private WdPrintOutItem(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}