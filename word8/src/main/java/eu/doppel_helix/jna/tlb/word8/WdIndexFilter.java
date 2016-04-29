
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({FB2904FB-ACC0-36C0-8D06-AEE924D88A08})</p>
 */
public enum WdIndexFilter implements IComEnum {
    
    /**
     * (0)
     */
    wdIndexFilterNone(0),
    
    /**
     * (1)
     */
    wdIndexFilterAiueo(1),
    
    /**
     * (2)
     */
    wdIndexFilterAkasatana(2),
    
    /**
     * (3)
     */
    wdIndexFilterChosung(3),
    
    /**
     * (4)
     */
    wdIndexFilterLow(4),
    
    /**
     * (5)
     */
    wdIndexFilterMedium(5),
    
    /**
     * (6)
     */
    wdIndexFilterFull(6),
    ;

    private WdIndexFilter(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}