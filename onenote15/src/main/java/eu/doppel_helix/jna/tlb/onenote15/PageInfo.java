
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D6E78E55-7EE7-4A31-BF3E-B01E819599BA})</p>
 */
public enum PageInfo implements IComEnum {
    
    /**
     * (0)
     */
    piBasic(0),
    
    /**
     * (1)
     */
    piBinaryData(1),
    
    /**
     * (2)
     */
    piSelection(2),
    
    /**
     * (4)
     */
    piFileType(4),
    
    /**
     * (3)
     */
    piBinaryDataSelection(3),
    
    /**
     * (5)
     */
    piBinaryDataFileType(5),
    
    /**
     * (6)
     */
    piSelectionFileType(6),
    
    /**
     * (7)
     */
    piAll(7),
    ;

    private PageInfo(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}