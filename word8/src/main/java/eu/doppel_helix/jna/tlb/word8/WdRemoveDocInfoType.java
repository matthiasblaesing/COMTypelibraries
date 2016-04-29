
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({F52DEE7F-8295-3A23-9DB3-37609770B6B2})</p>
 */
public enum WdRemoveDocInfoType implements IComEnum {
    
    /**
     * (1)
     */
    wdRDIComments(1),
    
    /**
     * (2)
     */
    wdRDIRevisions(2),
    
    /**
     * (3)
     */
    wdRDIVersions(3),
    
    /**
     * (4)
     */
    wdRDIRemovePersonalInformation(4),
    
    /**
     * (5)
     */
    wdRDIEmailHeader(5),
    
    /**
     * (6)
     */
    wdRDIRoutingSlip(6),
    
    /**
     * (7)
     */
    wdRDISendForReview(7),
    
    /**
     * (8)
     */
    wdRDIDocumentProperties(8),
    
    /**
     * (9)
     */
    wdRDITemplate(9),
    
    /**
     * (10)
     */
    wdRDIDocumentWorkspace(10),
    
    /**
     * (11)
     */
    wdRDIInkAnnotations(11),
    
    /**
     * (14)
     */
    wdRDIDocumentServerProperties(14),
    
    /**
     * (15)
     */
    wdRDIDocumentManagementPolicy(15),
    
    /**
     * (16)
     */
    wdRDIContentType(16),
    
    /**
     * (17)
     */
    wdRDITaskpaneWebExtensions(17),
    
    /**
     * (99)
     */
    wdRDIAll(99),
    ;

    private WdRemoveDocInfoType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}