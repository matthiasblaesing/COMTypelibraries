
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFileType implements IComEnum {
    
    /**
     * (1)
     */
    msoFileTypeAllFiles(1),
    
    /**
     * (2)
     */
    msoFileTypeOfficeFiles(2),
    
    /**
     * (3)
     */
    msoFileTypeWordDocuments(3),
    
    /**
     * (4)
     */
    msoFileTypeExcelWorkbooks(4),
    
    /**
     * (5)
     */
    msoFileTypePowerPointPresentations(5),
    
    /**
     * (6)
     */
    msoFileTypeBinders(6),
    
    /**
     * (7)
     */
    msoFileTypeDatabases(7),
    
    /**
     * (8)
     */
    msoFileTypeTemplates(8),
    
    /**
     * (9)
     */
    msoFileTypeOutlookItems(9),
    
    /**
     * (10)
     */
    msoFileTypeMailItem(10),
    
    /**
     * (11)
     */
    msoFileTypeCalendarItem(11),
    
    /**
     * (12)
     */
    msoFileTypeContactItem(12),
    
    /**
     * (13)
     */
    msoFileTypeNoteItem(13),
    
    /**
     * (14)
     */
    msoFileTypeJournalItem(14),
    
    /**
     * (15)
     */
    msoFileTypeTaskItem(15),
    
    /**
     * (16)
     */
    msoFileTypePhotoDrawFiles(16),
    
    /**
     * (17)
     */
    msoFileTypeDataConnectionFiles(17),
    
    /**
     * (18)
     */
    msoFileTypePublisherFiles(18),
    
    /**
     * (19)
     */
    msoFileTypeProjectFiles(19),
    
    /**
     * (20)
     */
    msoFileTypeDocumentImagingFiles(20),
    
    /**
     * (21)
     */
    msoFileTypeVisioFiles(21),
    
    /**
     * (22)
     */
    msoFileTypeDesignerFiles(22),
    
    /**
     * (23)
     */
    msoFileTypeWebPages(23),
    ;

    private MsoFileType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}