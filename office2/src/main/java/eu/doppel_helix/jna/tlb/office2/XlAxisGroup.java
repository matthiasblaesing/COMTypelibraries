
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7D8D95F5-EFE7-4189-8D68-0B3BCCEA097A})</p>
 */
public enum XlAxisGroup implements IComEnum {
    
    /**
     * (1)
     */
    xlPrimary(1),
    
    /**
     * (2)
     */
    xlSecondary(2),
    ;

    private XlAxisGroup(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}