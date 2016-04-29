
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B9D5B662-C047-3EF3-97EC-B6BED7499BC9})</p>
 */
public enum WdLayoutMode implements IComEnum {
    
    /**
     * (0)
     */
    wdLayoutModeDefault(0),
    
    /**
     * (1)
     */
    wdLayoutModeGrid(1),
    
    /**
     * (2)
     */
    wdLayoutModeLineGrid(2),
    
    /**
     * (3)
     */
    wdLayoutModeGenko(3),
    ;

    private WdLayoutMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}