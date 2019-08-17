
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({4DB67B4F-CC7D-45B5-88FE-569AE5798FF2})</p>
 */
public enum RecentResultType implements IComEnum {
    
    /**
     * (0)
     */
    rrtNone(0),
    
    /**
     * (1)
     */
    rrtFiling(1),
    
    /**
     * (2)
     */
    rrtSearch(2),
    
    /**
     * (3)
     */
    rrtLinks(3),
    ;

    private RecentResultType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}