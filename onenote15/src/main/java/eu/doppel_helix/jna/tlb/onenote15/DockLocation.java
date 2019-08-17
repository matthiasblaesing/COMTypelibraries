
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B67BC7E1-91B9-4F50-8471-77C76F8D63D6})</p>
 */
public enum DockLocation implements IComEnum {
    
    /**
     * (-1)
     */
    dlDefault(-1),
    
    /**
     * (0)
     */
    dlNone(0),
    
    /**
     * (1)
     */
    dlLeft(1),
    
    /**
     * (2)
     */
    dlRight(2),
    
    /**
     * (3)
     */
    dlTop(3),
    
    /**
     * (4)
     */
    dlBottom(4),
    ;

    private DockLocation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}