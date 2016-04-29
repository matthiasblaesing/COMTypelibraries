
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({22EE5D98-3D02-3761-AD43-435C8CF763B0})</p>
 */
public enum WdRevisionType implements IComEnum {
    
    /**
     * (0)
     */
    wdNoRevision(0),
    
    /**
     * (1)
     */
    wdRevisionInsert(1),
    
    /**
     * (2)
     */
    wdRevisionDelete(2),
    
    /**
     * (3)
     */
    wdRevisionProperty(3),
    
    /**
     * (4)
     */
    wdRevisionParagraphNumber(4),
    
    /**
     * (5)
     */
    wdRevisionDisplayField(5),
    
    /**
     * (6)
     */
    wdRevisionReconcile(6),
    
    /**
     * (7)
     */
    wdRevisionConflict(7),
    
    /**
     * (8)
     */
    wdRevisionStyle(8),
    
    /**
     * (9)
     */
    wdRevisionReplace(9),
    
    /**
     * (10)
     */
    wdRevisionParagraphProperty(10),
    
    /**
     * (11)
     */
    wdRevisionTableProperty(11),
    
    /**
     * (12)
     */
    wdRevisionSectionProperty(12),
    
    /**
     * (13)
     */
    wdRevisionStyleDefinition(13),
    
    /**
     * (14)
     */
    wdRevisionMovedFrom(14),
    
    /**
     * (15)
     */
    wdRevisionMovedTo(15),
    
    /**
     * (16)
     */
    wdRevisionCellInsertion(16),
    
    /**
     * (17)
     */
    wdRevisionCellDeletion(17),
    
    /**
     * (18)
     */
    wdRevisionCellMerge(18),
    
    /**
     * (19)
     */
    wdRevisionCellSplit(19),
    
    /**
     * (20)
     */
    wdRevisionConflictInsert(20),
    
    /**
     * (21)
     */
    wdRevisionConflictDelete(21),
    ;

    private WdRevisionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}