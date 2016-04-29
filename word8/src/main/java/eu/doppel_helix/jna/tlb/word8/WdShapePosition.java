
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({21E8E5B2-DCF5-3825-9F43-1DA651E79C64})</p>
 */
public enum WdShapePosition implements IComEnum {
    
    /**
     * (-999999)
     */
    wdShapeTop(-999999),
    
    /**
     * (-999998)
     */
    wdShapeLeft(-999998),
    
    /**
     * (-999997)
     */
    wdShapeBottom(-999997),
    
    /**
     * (-999996)
     */
    wdShapeRight(-999996),
    
    /**
     * (-999995)
     */
    wdShapeCenter(-999995),
    
    /**
     * (-999994)
     */
    wdShapeInside(-999994),
    
    /**
     * (-999993)
     */
    wdShapeOutside(-999993),
    ;

    private WdShapePosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}