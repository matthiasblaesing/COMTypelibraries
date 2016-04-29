
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({020F399E-EFC7-372F-A323-679C84CAEFCE})</p>
 */
public enum WdCompareDestination implements IComEnum {
    
    /**
     * (0)
     */
    wdCompareDestinationOriginal(0),
    
    /**
     * (1)
     */
    wdCompareDestinationRevised(1),
    
    /**
     * (2)
     */
    wdCompareDestinationNew(2),
    ;

    private WdCompareDestination(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}