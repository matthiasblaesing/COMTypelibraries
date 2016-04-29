
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6840CE86-6CE5-3724-8961-31802690E713})</p>
 */
public enum WdSeparatorType implements IComEnum {
    
    /**
     * (0)
     */
    wdSeparatorHyphen(0),
    
    /**
     * (1)
     */
    wdSeparatorPeriod(1),
    
    /**
     * (2)
     */
    wdSeparatorColon(2),
    
    /**
     * (3)
     */
    wdSeparatorEmDash(3),
    
    /**
     * (4)
     */
    wdSeparatorEnDash(4),
    ;

    private WdSeparatorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}