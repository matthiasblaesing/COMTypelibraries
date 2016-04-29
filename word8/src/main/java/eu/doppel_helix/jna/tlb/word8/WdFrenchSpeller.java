
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({EBFB6414-51CD-374A-9A96-5C2B0BB128CC})</p>
 */
public enum WdFrenchSpeller implements IComEnum {
    
    /**
     * (0)
     */
    wdFrenchBoth(0),
    
    /**
     * (1)
     */
    wdFrenchPreReform(1),
    
    /**
     * (2)
     */
    wdFrenchPostReform(2),
    ;

    private WdFrenchSpeller(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}