
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({87364574-CAD0-36FF-AFE6-6106A232443B})</p>
 */
public enum WdTabAlignment implements IComEnum {
    
    /**
     * (0)
     */
    wdAlignTabLeft(0),
    
    /**
     * (1)
     */
    wdAlignTabCenter(1),
    
    /**
     * (2)
     */
    wdAlignTabRight(2),
    
    /**
     * (3)
     */
    wdAlignTabDecimal(3),
    
    /**
     * (4)
     */
    wdAlignTabBar(4),
    
    /**
     * (6)
     */
    wdAlignTabList(6),
    ;

    private WdTabAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}