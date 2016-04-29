
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1DC9A70E-A0EB-34AF-8A29-FE9C2032FC79})</p>
 */
public enum WdDocumentMedium implements IComEnum {
    
    /**
     * (0)
     */
    wdEmailMessage(0),
    
    /**
     * (1)
     */
    wdDocument(1),
    
    /**
     * (2)
     */
    wdWebPage(2),
    ;

    private WdDocumentMedium(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}