
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A92A72D9-6D30-3581-B297-64A4732A6BD3})</p>
 */
public enum WdTaskPanes implements IComEnum {
    
    /**
     * (0)
     */
    wdTaskPaneFormatting(0),
    
    /**
     * (1)
     */
    wdTaskPaneRevealFormatting(1),
    
    /**
     * (2)
     */
    wdTaskPaneMailMerge(2),
    
    /**
     * (3)
     */
    wdTaskPaneTranslate(3),
    
    /**
     * (4)
     */
    wdTaskPaneSearch(4),
    
    /**
     * (5)
     */
    wdTaskPaneXMLStructure(5),
    
    /**
     * (6)
     */
    wdTaskPaneDocumentProtection(6),
    
    /**
     * (7)
     */
    wdTaskPaneDocumentActions(7),
    
    /**
     * (8)
     */
    wdTaskPaneSharedWorkspace(8),
    
    /**
     * (9)
     */
    wdTaskPaneHelp(9),
    
    /**
     * (10)
     */
    wdTaskPaneResearch(10),
    
    /**
     * (11)
     */
    wdTaskPaneFaxService(11),
    
    /**
     * (12)
     */
    wdTaskPaneXMLDocument(12),
    
    /**
     * (13)
     */
    wdTaskPaneDocumentUpdates(13),
    
    /**
     * (14)
     */
    wdTaskPaneSignature(14),
    
    /**
     * (15)
     */
    wdTaskPaneStyleInspector(15),
    
    /**
     * (16)
     */
    wdTaskPaneDocumentManagement(16),
    
    /**
     * (17)
     */
    wdTaskPaneApplyStyles(17),
    
    /**
     * (18)
     */
    wdTaskPaneNav(18),
    
    /**
     * (19)
     */
    wdTaskPaneSelection(19),
    
    /**
     * (20)
     */
    wdTaskPaneProofing(20),
    
    /**
     * (21)
     */
    wdTaskPaneXMLMapping(21),
    
    /**
     * (22)
     */
    wdTaskPaneRevPaneFlex(22),
    
    /**
     * (23)
     */
    wdTaskPaneThesaurus(23),
    ;

    private WdTaskPanes(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}