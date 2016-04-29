
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlTableStyleElementType implements IComEnum {
    
    /**
     * (0)
     */
    xlWholeTable(0),
    
    /**
     * (1)
     */
    xlHeaderRow(1),
    
    /**
     * (2)
     */
    xlTotalRow(2),
    
    /**
     * (2)
     */
    xlGrandTotalRow(2),
    
    /**
     * (3)
     */
    xlFirstColumn(3),
    
    /**
     * (4)
     */
    xlLastColumn(4),
    
    /**
     * (4)
     */
    xlGrandTotalColumn(4),
    
    /**
     * (5)
     */
    xlRowStripe1(5),
    
    /**
     * (6)
     */
    xlRowStripe2(6),
    
    /**
     * (7)
     */
    xlColumnStripe1(7),
    
    /**
     * (8)
     */
    xlColumnStripe2(8),
    
    /**
     * (9)
     */
    xlFirstHeaderCell(9),
    
    /**
     * (10)
     */
    xlLastHeaderCell(10),
    
    /**
     * (11)
     */
    xlFirstTotalCell(11),
    
    /**
     * (12)
     */
    xlLastTotalCell(12),
    
    /**
     * (13)
     */
    xlSubtotalColumn1(13),
    
    /**
     * (14)
     */
    xlSubtotalColumn2(14),
    
    /**
     * (15)
     */
    xlSubtotalColumn3(15),
    
    /**
     * (16)
     */
    xlSubtotalRow1(16),
    
    /**
     * (17)
     */
    xlSubtotalRow2(17),
    
    /**
     * (18)
     */
    xlSubtotalRow3(18),
    
    /**
     * (19)
     */
    xlBlankRow(19),
    
    /**
     * (20)
     */
    xlColumnSubheading1(20),
    
    /**
     * (21)
     */
    xlColumnSubheading2(21),
    
    /**
     * (22)
     */
    xlColumnSubheading3(22),
    
    /**
     * (23)
     */
    xlRowSubheading1(23),
    
    /**
     * (24)
     */
    xlRowSubheading2(24),
    
    /**
     * (25)
     */
    xlRowSubheading3(25),
    
    /**
     * (26)
     */
    xlPageFieldLabels(26),
    
    /**
     * (27)
     */
    xlPageFieldValues(27),
    
    /**
     * (28)
     */
    xlSlicerUnselectedItemWithData(28),
    
    /**
     * (29)
     */
    xlSlicerUnselectedItemWithNoData(29),
    
    /**
     * (30)
     */
    xlSlicerSelectedItemWithData(30),
    
    /**
     * (31)
     */
    xlSlicerSelectedItemWithNoData(31),
    
    /**
     * (32)
     */
    xlSlicerHoveredUnselectedItemWithData(32),
    
    /**
     * (33)
     */
    xlSlicerHoveredSelectedItemWithData(33),
    
    /**
     * (34)
     */
    xlSlicerHoveredUnselectedItemWithNoData(34),
    
    /**
     * (35)
     */
    xlSlicerHoveredSelectedItemWithNoData(35),
    
    /**
     * (36)
     */
    xlTimelineSelectionLabel(36),
    
    /**
     * (37)
     */
    xlTimelineTimeLevel(37),
    
    /**
     * (38)
     */
    xlTimelinePeriodLabels1(38),
    
    /**
     * (39)
     */
    xlTimelinePeriodLabels2(39),
    
    /**
     * (40)
     */
    xlTimelineSelectedTimeBlock(40),
    
    /**
     * (41)
     */
    xlTimelineUnselectedTimeBlock(41),
    
    /**
     * (42)
     */
    xlTimelineSelectedTimeBlockSpace(42),
    ;

    private XlTableStyleElementType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}