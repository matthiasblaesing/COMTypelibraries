
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6502B78D-944A-36EE-BF60-F6B45716C4ED})</p>
 */
public enum WdPreferredWidthType implements IComEnum {
    
    /**
     * (1)
     */
    wdPreferredWidthAuto(1),
    
    /**
     * (2)
     */
    wdPreferredWidthPercent(2),
    
    /**
     * (3)
     */
    wdPreferredWidthPoints(3),
    ;

    private WdPreferredWidthType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}