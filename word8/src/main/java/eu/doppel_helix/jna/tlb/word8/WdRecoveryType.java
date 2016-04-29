
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({CD2C303A-F5BB-3414-A740-57FB0618169A})</p>
 */
public enum WdRecoveryType implements IComEnum {
    
    /**
     * (0)
     */
    wdPasteDefault(0),
    
    /**
     * (5)
     */
    wdSingleCellText(5),
    
    /**
     * (6)
     */
    wdSingleCellTable(6),
    
    /**
     * (7)
     */
    wdListContinueNumbering(7),
    
    /**
     * (8)
     */
    wdListRestartNumbering(8),
    
    /**
     * (11)
     */
    wdTableInsertAsRows(11),
    
    /**
     * (10)
     */
    wdTableAppendTable(10),
    
    /**
     * (12)
     */
    wdTableOriginalFormatting(12),
    
    /**
     * (13)
     */
    wdChartPicture(13),
    
    /**
     * (14)
     */
    wdChart(14),
    
    /**
     * (15)
     */
    wdChartLinked(15),
    
    /**
     * (16)
     */
    wdFormatOriginalFormatting(16),
    
    /**
     * (20)
     */
    wdFormatSurroundingFormattingWithEmphasis(20),
    
    /**
     * (22)
     */
    wdFormatPlainText(22),
    
    /**
     * (23)
     */
    wdTableOverwriteCells(23),
    
    /**
     * (24)
     */
    wdListCombineWithExistingList(24),
    
    /**
     * (25)
     */
    wdListDontMerge(25),
    
    /**
     * (19)
     */
    wdUseDestinationStylesRecovery(19),
    ;

    private WdRecoveryType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}