
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A51000B6-7B41-3E7A-813E-DB7BE56C71B8})</p>
 */
public enum WdStyleSheetPrecedence implements IComEnum {
    
    /**
     * (-1)
     */
    wdStyleSheetPrecedenceHigher(-1),
    
    /**
     * (-2)
     */
    wdStyleSheetPrecedenceLower(-2),
    
    /**
     * (1)
     */
    wdStyleSheetPrecedenceHighest(1),
    
    /**
     * (0)
     */
    wdStyleSheetPrecedenceLowest(0),
    ;

    private WdStyleSheetPrecedence(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}