
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({397C8DF3-B689-3DB6-BEC0-2525B93DF811})</p>
 */
public enum WdTableFormatApply implements IComEnum {
    
    /**
     * (1)
     */
    wdTableFormatApplyBorders(1),
    
    /**
     * (2)
     */
    wdTableFormatApplyShading(2),
    
    /**
     * (4)
     */
    wdTableFormatApplyFont(4),
    
    /**
     * (8)
     */
    wdTableFormatApplyColor(8),
    
    /**
     * (16)
     */
    wdTableFormatApplyAutoFit(16),
    
    /**
     * (32)
     */
    wdTableFormatApplyHeadingRows(32),
    
    /**
     * (64)
     */
    wdTableFormatApplyLastRow(64),
    
    /**
     * (128)
     */
    wdTableFormatApplyFirstColumn(128),
    
    /**
     * (256)
     */
    wdTableFormatApplyLastColumn(256),
    ;

    private WdTableFormatApply(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}