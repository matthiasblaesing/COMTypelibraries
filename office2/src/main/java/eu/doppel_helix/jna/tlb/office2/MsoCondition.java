
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoCondition implements IComEnum {
    
    /**
     * (1)
     */
    msoConditionFileTypeAllFiles(1),
    
    /**
     * (2)
     */
    msoConditionFileTypeOfficeFiles(2),
    
    /**
     * (3)
     */
    msoConditionFileTypeWordDocuments(3),
    
    /**
     * (4)
     */
    msoConditionFileTypeExcelWorkbooks(4),
    
    /**
     * (5)
     */
    msoConditionFileTypePowerPointPresentations(5),
    
    /**
     * (6)
     */
    msoConditionFileTypeBinders(6),
    
    /**
     * (7)
     */
    msoConditionFileTypeDatabases(7),
    
    /**
     * (8)
     */
    msoConditionFileTypeTemplates(8),
    
    /**
     * (9)
     */
    msoConditionIncludes(9),
    
    /**
     * (10)
     */
    msoConditionIncludesPhrase(10),
    
    /**
     * (11)
     */
    msoConditionBeginsWith(11),
    
    /**
     * (12)
     */
    msoConditionEndsWith(12),
    
    /**
     * (13)
     */
    msoConditionIncludesNearEachOther(13),
    
    /**
     * (14)
     */
    msoConditionIsExactly(14),
    
    /**
     * (15)
     */
    msoConditionIsNot(15),
    
    /**
     * (16)
     */
    msoConditionYesterday(16),
    
    /**
     * (17)
     */
    msoConditionToday(17),
    
    /**
     * (18)
     */
    msoConditionTomorrow(18),
    
    /**
     * (19)
     */
    msoConditionLastWeek(19),
    
    /**
     * (20)
     */
    msoConditionThisWeek(20),
    
    /**
     * (21)
     */
    msoConditionNextWeek(21),
    
    /**
     * (22)
     */
    msoConditionLastMonth(22),
    
    /**
     * (23)
     */
    msoConditionThisMonth(23),
    
    /**
     * (24)
     */
    msoConditionNextMonth(24),
    
    /**
     * (25)
     */
    msoConditionAnytime(25),
    
    /**
     * (26)
     */
    msoConditionAnytimeBetween(26),
    
    /**
     * (27)
     */
    msoConditionOn(27),
    
    /**
     * (28)
     */
    msoConditionOnOrAfter(28),
    
    /**
     * (29)
     */
    msoConditionOnOrBefore(29),
    
    /**
     * (30)
     */
    msoConditionInTheNext(30),
    
    /**
     * (31)
     */
    msoConditionInTheLast(31),
    
    /**
     * (32)
     */
    msoConditionEquals(32),
    
    /**
     * (33)
     */
    msoConditionDoesNotEqual(33),
    
    /**
     * (34)
     */
    msoConditionAnyNumberBetween(34),
    
    /**
     * (35)
     */
    msoConditionAtMost(35),
    
    /**
     * (36)
     */
    msoConditionAtLeast(36),
    
    /**
     * (37)
     */
    msoConditionMoreThan(37),
    
    /**
     * (38)
     */
    msoConditionLessThan(38),
    
    /**
     * (39)
     */
    msoConditionIsYes(39),
    
    /**
     * (40)
     */
    msoConditionIsNo(40),
    
    /**
     * (41)
     */
    msoConditionIncludesFormsOf(41),
    
    /**
     * (42)
     */
    msoConditionFreeText(42),
    
    /**
     * (43)
     */
    msoConditionFileTypeOutlookItems(43),
    
    /**
     * (44)
     */
    msoConditionFileTypeMailItem(44),
    
    /**
     * (45)
     */
    msoConditionFileTypeCalendarItem(45),
    
    /**
     * (46)
     */
    msoConditionFileTypeContactItem(46),
    
    /**
     * (47)
     */
    msoConditionFileTypeNoteItem(47),
    
    /**
     * (48)
     */
    msoConditionFileTypeJournalItem(48),
    
    /**
     * (49)
     */
    msoConditionFileTypeTaskItem(49),
    
    /**
     * (50)
     */
    msoConditionFileTypePhotoDrawFiles(50),
    
    /**
     * (51)
     */
    msoConditionFileTypeDataConnectionFiles(51),
    
    /**
     * (52)
     */
    msoConditionFileTypePublisherFiles(52),
    
    /**
     * (53)
     */
    msoConditionFileTypeProjectFiles(53),
    
    /**
     * (54)
     */
    msoConditionFileTypeDocumentImagingFiles(54),
    
    /**
     * (55)
     */
    msoConditionFileTypeVisioFiles(55),
    
    /**
     * (56)
     */
    msoConditionFileTypeDesignerFiles(56),
    
    /**
     * (57)
     */
    msoConditionFileTypeWebPages(57),
    
    /**
     * (58)
     */
    msoConditionEqualsLow(58),
    
    /**
     * (59)
     */
    msoConditionEqualsNormal(59),
    
    /**
     * (60)
     */
    msoConditionEqualsHigh(60),
    
    /**
     * (61)
     */
    msoConditionNotEqualToLow(61),
    
    /**
     * (62)
     */
    msoConditionNotEqualToNormal(62),
    
    /**
     * (63)
     */
    msoConditionNotEqualToHigh(63),
    
    /**
     * (64)
     */
    msoConditionEqualsNotStarted(64),
    
    /**
     * (65)
     */
    msoConditionEqualsInProgress(65),
    
    /**
     * (66)
     */
    msoConditionEqualsCompleted(66),
    
    /**
     * (67)
     */
    msoConditionEqualsWaitingForSomeoneElse(67),
    
    /**
     * (68)
     */
    msoConditionEqualsDeferred(68),
    
    /**
     * (69)
     */
    msoConditionNotEqualToNotStarted(69),
    
    /**
     * (70)
     */
    msoConditionNotEqualToInProgress(70),
    
    /**
     * (71)
     */
    msoConditionNotEqualToCompleted(71),
    
    /**
     * (72)
     */
    msoConditionNotEqualToWaitingForSomeoneElse(72),
    
    /**
     * (73)
     */
    msoConditionNotEqualToDeferred(73),
    ;

    private MsoCondition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}