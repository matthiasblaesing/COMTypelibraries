
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A921AF37-36D9-30D1-9ABB-FE255AAA60AE})</p>
 */
public enum WdNewDocumentType implements IComEnum {
    
    /**
     * (0)
     */
    wdNewBlankDocument(0),
    
    /**
     * (1)
     */
    wdNewWebPage(1),
    
    /**
     * (2)
     */
    wdNewEmailMessage(2),
    
    /**
     * (3)
     */
    wdNewFrameset(3),
    
    /**
     * (4)
     */
    wdNewXMLDocument(4),
    ;

    private WdNewDocumentType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}