
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({F5505753-856C-33A5-9129-291F3E9F441D})</p>
 */
public enum WdEnclosureType implements IComEnum {
    
    /**
     * (0)
     */
    wdEnclosureCircle(0),
    
    /**
     * (1)
     */
    wdEnclosureSquare(1),
    
    /**
     * (2)
     */
    wdEnclosureTriangle(2),
    
    /**
     * (3)
     */
    wdEnclosureDiamond(3),
    ;

    private WdEnclosureType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}