
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({68555133-B62F-4490-9D66-9E9BFC68F6C6})</p>
 */
public enum XMLSchema implements IComEnum {
    
    /**
     * (0)
     */
    xs2007(0),
    
    /**
     * (1)
     */
    xs2010(1),
    
    /**
     * (2)
     */
    xs2013(2),
    
    /**
     * (2)
     */
    xsCurrent(2),
    ;

    private XMLSchema(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}