
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({42CE0331-0571-3322-AEB3-2309B4794847})</p>
 */
public enum WdRevisionsView implements IComEnum {
    
    /**
     * (0)
     */
    wdRevisionsViewFinal(0),
    
    /**
     * (1)
     */
    wdRevisionsViewOriginal(1),
    ;

    private WdRevisionsView(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}