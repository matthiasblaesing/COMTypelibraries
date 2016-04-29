
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({AF00A39F-BCAC-333A-9A95-32724B7057C3})</p>
 */
public enum WdFindWrap implements IComEnum {
    
    /**
     * (0)
     */
    wdFindStop(0),
    
    /**
     * (1)
     */
    wdFindContinue(1),
    
    /**
     * (2)
     */
    wdFindAsk(2),
    ;

    private WdFindWrap(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}