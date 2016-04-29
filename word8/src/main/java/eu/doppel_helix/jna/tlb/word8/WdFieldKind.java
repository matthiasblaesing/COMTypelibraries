
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7EB9A8BD-3300-3492-A540-5F3AAF2F55C6})</p>
 */
public enum WdFieldKind implements IComEnum {
    
    /**
     * (0)
     */
    wdFieldKindNone(0),
    
    /**
     * (1)
     */
    wdFieldKindHot(1),
    
    /**
     * (2)
     */
    wdFieldKindWarm(2),
    
    /**
     * (3)
     */
    wdFieldKindCold(3),
    ;

    private WdFieldKind(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}