
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2811B866-578B-37F2-B7FB-927DD993AB19})</p>
 */
public enum WdOMathFracType implements IComEnum {
    
    /**
     * (0)
     */
    wdOMathFracBar(0),
    
    /**
     * (1)
     */
    wdOMathFracNoBar(1),
    
    /**
     * (2)
     */
    wdOMathFracSkw(2),
    
    /**
     * (3)
     */
    wdOMathFracLin(3),
    ;

    private WdOMathFracType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}