
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({38B309AF-090C-47BB-8CFA-8CF758ECA76F})</p>
 */
public enum WdContentControlLevel implements IComEnum {
    
    /**
     * (0)
     */
    wdContentControlLevelInline(0),
    
    /**
     * (1)
     */
    wdContentControlLevelParagraph(1),
    
    /**
     * (2)
     */
    wdContentControlLevelRow(2),
    
    /**
     * (3)
     */
    wdContentControlLevelCell(3),
    ;

    private WdContentControlLevel(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}