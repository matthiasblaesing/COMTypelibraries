
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WdCompatibilityMode implements IComEnum {
    
    /**
     * (11)
     */
    wdWord2003(11),
    
    /**
     * (12)
     */
    wdWord2007(12),
    
    /**
     * (14)
     */
    wdWord2010(14),
    
    /**
     * (15)
     */
    wdWord2013(15),
    
    /**
     * (65535)
     */
    wdCurrent(65535),
    ;

    private WdCompatibilityMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}