
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D05EB81F-37A2-3F3E-AE25-A672C0D2D502})</p>
 */
public enum WdTextboxTightWrap implements IComEnum {
    
    /**
     * (0)
     */
    wdTightNone(0),
    
    /**
     * (1)
     */
    wdTightAll(1),
    
    /**
     * (2)
     */
    wdTightFirstAndLastLines(2),
    
    /**
     * (3)
     */
    wdTightFirstLineOnly(3),
    
    /**
     * (4)
     */
    wdTightLastLineOnly(4),
    ;

    private WdTextboxTightWrap(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}