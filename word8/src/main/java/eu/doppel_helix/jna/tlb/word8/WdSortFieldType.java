
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({80EB5D8F-AF97-3E3F-9EBD-1B1C645CBCC4})</p>
 */
public enum WdSortFieldType implements IComEnum {
    
    /**
     * (0)
     */
    wdSortFieldAlphanumeric(0),
    
    /**
     * (1)
     */
    wdSortFieldNumeric(1),
    
    /**
     * (2)
     */
    wdSortFieldDate(2),
    
    /**
     * (3)
     */
    wdSortFieldSyllable(3),
    
    /**
     * (4)
     */
    wdSortFieldJapanJIS(4),
    
    /**
     * (5)
     */
    wdSortFieldStroke(5),
    
    /**
     * (6)
     */
    wdSortFieldKoreaKS(6),
    ;

    private WdSortFieldType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}