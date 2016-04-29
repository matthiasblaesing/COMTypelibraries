
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WdPortugueseReform implements IComEnum {
    
    /**
     * (1)
     */
    wdPortuguesePreReform(1),
    
    /**
     * (2)
     */
    wdPortuguesePostReform(2),
    
    /**
     * (3)
     */
    wdPortugueseBoth(3),
    ;

    private WdPortugueseReform(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}