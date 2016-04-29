
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({AF2102B9-8C24-358E-B851-05D1803A4356})</p>
 */
public enum WdTablePosition implements IComEnum {
    
    /**
     * (-999999)
     */
    wdTableTop(-999999),
    
    /**
     * (-999998)
     */
    wdTableLeft(-999998),
    
    /**
     * (-999997)
     */
    wdTableBottom(-999997),
    
    /**
     * (-999996)
     */
    wdTableRight(-999996),
    
    /**
     * (-999995)
     */
    wdTableCenter(-999995),
    
    /**
     * (-999994)
     */
    wdTableInside(-999994),
    
    /**
     * (-999993)
     */
    wdTableOutside(-999993),
    ;

    private WdTablePosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}