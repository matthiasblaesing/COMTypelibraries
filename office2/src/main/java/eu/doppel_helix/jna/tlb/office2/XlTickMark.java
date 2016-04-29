
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E5EAD0BB-3A16-48F3-BECD-5839F6B552CA})</p>
 */
public enum XlTickMark implements IComEnum {
    
    /**
     * (4)
     */
    xlTickMarkCross(4),
    
    /**
     * (2)
     */
    xlTickMarkInside(2),
    
    /**
     * (-4142)
     */
    xlTickMarkNone(-4142),
    
    /**
     * (3)
     */
    xlTickMarkOutside(3),
    ;

    private XlTickMark(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}