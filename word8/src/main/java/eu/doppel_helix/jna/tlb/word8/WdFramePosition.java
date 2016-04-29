
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({96C35218-1F30-3B6B-B8E9-1955DDFD52C3})</p>
 */
public enum WdFramePosition implements IComEnum {
    
    /**
     * (-999999)
     */
    wdFrameTop(-999999),
    
    /**
     * (-999998)
     */
    wdFrameLeft(-999998),
    
    /**
     * (-999997)
     */
    wdFrameBottom(-999997),
    
    /**
     * (-999996)
     */
    wdFrameRight(-999996),
    
    /**
     * (-999995)
     */
    wdFrameCenter(-999995),
    
    /**
     * (-999994)
     */
    wdFrameInside(-999994),
    
    /**
     * (-999993)
     */
    wdFrameOutside(-999993),
    ;

    private WdFramePosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}