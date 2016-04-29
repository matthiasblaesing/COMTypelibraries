
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A1D2A478-67C7-3491-9E7E-64C6E8D43738})</p>
 */
public enum WdGoToDirection implements IComEnum {
    
    /**
     * (1)
     */
    wdGoToFirst(1),
    
    /**
     * (-1)
     */
    wdGoToLast(-1),
    
    /**
     * (2)
     */
    wdGoToNext(2),
    
    /**
     * (2)
     */
    wdGoToRelative(2),
    
    /**
     * (3)
     */
    wdGoToPrevious(3),
    
    /**
     * (1)
     */
    wdGoToAbsolute(1),
    ;

    private WdGoToDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}