
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E1DBA742-1E0E-3633-B1C2-168561C6F0B0})</p>
 */
public enum WdBuildingBlockTypes implements IComEnum {
    
    /**
     * (1)
     */
    wdTypeQuickParts(1),
    
    /**
     * (2)
     */
    wdTypeCoverPage(2),
    
    /**
     * (3)
     */
    wdTypeEquations(3),
    
    /**
     * (4)
     */
    wdTypeFooters(4),
    
    /**
     * (5)
     */
    wdTypeHeaders(5),
    
    /**
     * (6)
     */
    wdTypePageNumber(6),
    
    /**
     * (7)
     */
    wdTypeTables(7),
    
    /**
     * (8)
     */
    wdTypeWatermarks(8),
    
    /**
     * (9)
     */
    wdTypeAutoText(9),
    
    /**
     * (10)
     */
    wdTypeTextBox(10),
    
    /**
     * (11)
     */
    wdTypePageNumberTop(11),
    
    /**
     * (12)
     */
    wdTypePageNumberBottom(12),
    
    /**
     * (13)
     */
    wdTypePageNumberPage(13),
    
    /**
     * (14)
     */
    wdTypeTableOfContents(14),
    
    /**
     * (15)
     */
    wdTypeCustomQuickParts(15),
    
    /**
     * (16)
     */
    wdTypeCustomCoverPage(16),
    
    /**
     * (17)
     */
    wdTypeCustomEquations(17),
    
    /**
     * (18)
     */
    wdTypeCustomFooters(18),
    
    /**
     * (19)
     */
    wdTypeCustomHeaders(19),
    
    /**
     * (20)
     */
    wdTypeCustomPageNumber(20),
    
    /**
     * (21)
     */
    wdTypeCustomTables(21),
    
    /**
     * (22)
     */
    wdTypeCustomWatermarks(22),
    
    /**
     * (23)
     */
    wdTypeCustomAutoText(23),
    
    /**
     * (24)
     */
    wdTypeCustomTextBox(24),
    
    /**
     * (25)
     */
    wdTypeCustomPageNumberTop(25),
    
    /**
     * (26)
     */
    wdTypeCustomPageNumberBottom(26),
    
    /**
     * (27)
     */
    wdTypeCustomPageNumberPage(27),
    
    /**
     * (28)
     */
    wdTypeCustomTableOfContents(28),
    
    /**
     * (29)
     */
    wdTypeCustom1(29),
    
    /**
     * (30)
     */
    wdTypeCustom2(30),
    
    /**
     * (31)
     */
    wdTypeCustom3(31),
    
    /**
     * (32)
     */
    wdTypeCustom4(32),
    
    /**
     * (33)
     */
    wdTypeCustom5(33),
    
    /**
     * (34)
     */
    wdTypeBibliography(34),
    
    /**
     * (35)
     */
    wdTypeCustomBibliography(35),
    ;

    private WdBuildingBlockTypes(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}