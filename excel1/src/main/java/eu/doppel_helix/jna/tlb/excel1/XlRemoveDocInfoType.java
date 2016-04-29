
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlRemoveDocInfoType implements IComEnum {
    
    /**
     * (1)
     */
    xlRDIComments(1),
    
    /**
     * (4)
     */
    xlRDIRemovePersonalInformation(4),
    
    /**
     * (5)
     */
    xlRDIEmailHeader(5),
    
    /**
     * (6)
     */
    xlRDIRoutingSlip(6),
    
    /**
     * (7)
     */
    xlRDISendForReview(7),
    
    /**
     * (8)
     */
    xlRDIDocumentProperties(8),
    
    /**
     * (10)
     */
    xlRDIDocumentWorkspace(10),
    
    /**
     * (11)
     */
    xlRDIInkAnnotations(11),
    
    /**
     * (12)
     */
    xlRDIScenarioComments(12),
    
    /**
     * (13)
     */
    xlRDIPublishInfo(13),
    
    /**
     * (14)
     */
    xlRDIDocumentServerProperties(14),
    
    /**
     * (15)
     */
    xlRDIDocumentManagementPolicy(15),
    
    /**
     * (16)
     */
    xlRDIContentType(16),
    
    /**
     * (18)
     */
    xlRDIDefinedNameComments(18),
    
    /**
     * (19)
     */
    xlRDIInactiveDataConnections(19),
    
    /**
     * (20)
     */
    xlRDIPrinterPath(20),
    
    /**
     * (21)
     */
    xlRDIInlineWebExtensions(21),
    
    /**
     * (22)
     */
    xlRDITaskpaneWebExtensions(22),
    
    /**
     * (23)
     */
    xlRDIExcelDataModel(23),
    
    /**
     * (99)
     */
    xlRDIAll(99),
    ;

    private XlRemoveDocInfoType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}