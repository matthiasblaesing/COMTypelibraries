
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({82FC5A95-FEB7-4242-95E1-369C5DFE3F49})</p>
 */
public enum FilingLocationType implements IComEnum {
    
    /**
     * (0)
     */
    fltNamedSectionNewPage(0),
    
    /**
     * (1)
     */
    fltCurrentSectionNewPage(1),
    
    /**
     * (2)
     */
    fltCurrentPage(2),
    
    /**
     * (4)
     */
    fltNamedPage(4),
    ;

    private FilingLocationType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}