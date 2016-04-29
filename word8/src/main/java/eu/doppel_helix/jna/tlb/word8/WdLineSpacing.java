
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({296716CF-7239-3CD0-B338-23B6BDDC1BCE})</p>
 */
public enum WdLineSpacing implements IComEnum {
    
    /**
     * (0)
     */
    wdLineSpaceSingle(0),
    
    /**
     * (1)
     */
    wdLineSpace1pt5(1),
    
    /**
     * (2)
     */
    wdLineSpaceDouble(2),
    
    /**
     * (3)
     */
    wdLineSpaceAtLeast(3),
    
    /**
     * (4)
     */
    wdLineSpaceExactly(4),
    
    /**
     * (5)
     */
    wdLineSpaceMultiple(5),
    ;

    private WdLineSpacing(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}