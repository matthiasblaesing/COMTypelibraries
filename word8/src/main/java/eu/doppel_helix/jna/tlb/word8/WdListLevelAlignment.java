
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({73849DC1-4ECB-31BD-824C-BBDAB04CF830})</p>
 */
public enum WdListLevelAlignment implements IComEnum {
    
    /**
     * (0)
     */
    wdListLevelAlignLeft(0),
    
    /**
     * (1)
     */
    wdListLevelAlignCenter(1),
    
    /**
     * (2)
     */
    wdListLevelAlignRight(2),
    ;

    private WdListLevelAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}