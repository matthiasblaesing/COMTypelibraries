
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({167B59A9-DBBD-34AF-AFDB-57AC30C2CE58})</p>
 */
public enum WdSpecialPane implements IComEnum {
    
    /**
     * (0)
     */
    wdPaneNone(0),
    
    /**
     * (1)
     */
    wdPanePrimaryHeader(1),
    
    /**
     * (2)
     */
    wdPaneFirstPageHeader(2),
    
    /**
     * (3)
     */
    wdPaneEvenPagesHeader(3),
    
    /**
     * (4)
     */
    wdPanePrimaryFooter(4),
    
    /**
     * (5)
     */
    wdPaneFirstPageFooter(5),
    
    /**
     * (6)
     */
    wdPaneEvenPagesFooter(6),
    
    /**
     * (7)
     */
    wdPaneFootnotes(7),
    
    /**
     * (8)
     */
    wdPaneEndnotes(8),
    
    /**
     * (9)
     */
    wdPaneFootnoteContinuationNotice(9),
    
    /**
     * (10)
     */
    wdPaneFootnoteContinuationSeparator(10),
    
    /**
     * (11)
     */
    wdPaneFootnoteSeparator(11),
    
    /**
     * (12)
     */
    wdPaneEndnoteContinuationNotice(12),
    
    /**
     * (13)
     */
    wdPaneEndnoteContinuationSeparator(13),
    
    /**
     * (14)
     */
    wdPaneEndnoteSeparator(14),
    
    /**
     * (15)
     */
    wdPaneComments(15),
    
    /**
     * (16)
     */
    wdPaneCurrentPageHeader(16),
    
    /**
     * (17)
     */
    wdPaneCurrentPageFooter(17),
    
    /**
     * (18)
     */
    wdPaneRevisions(18),
    
    /**
     * (19)
     */
    wdPaneRevisionsHoriz(19),
    
    /**
     * (20)
     */
    wdPaneRevisionsVert(20),
    ;

    private WdSpecialPane(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}