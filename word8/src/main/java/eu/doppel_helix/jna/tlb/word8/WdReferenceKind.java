
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({394033AF-E0BA-30E7-B099-A79873E55634})</p>
 */
public enum WdReferenceKind implements IComEnum {
    
    /**
     * (-1)
     */
    wdContentText(-1),
    
    /**
     * (-2)
     */
    wdNumberRelativeContext(-2),
    
    /**
     * (-3)
     */
    wdNumberNoContext(-3),
    
    /**
     * (-4)
     */
    wdNumberFullContext(-4),
    
    /**
     * (2)
     */
    wdEntireCaption(2),
    
    /**
     * (3)
     */
    wdOnlyLabelAndNumber(3),
    
    /**
     * (4)
     */
    wdOnlyCaptionText(4),
    
    /**
     * (5)
     */
    wdFootnoteNumber(5),
    
    /**
     * (6)
     */
    wdEndnoteNumber(6),
    
    /**
     * (7)
     */
    wdPageNumber(7),
    
    /**
     * (15)
     */
    wdPosition(15),
    
    /**
     * (16)
     */
    wdFootnoteNumberFormatted(16),
    
    /**
     * (17)
     */
    wdEndnoteNumberFormatted(17),
    ;

    private WdReferenceKind(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}