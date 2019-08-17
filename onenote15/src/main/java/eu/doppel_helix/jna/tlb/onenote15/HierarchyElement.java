
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({41C8F6EA-0AF0-4A4F-99E9-5EB01EBFC9A3})</p>
 */
public enum HierarchyElement implements IComEnum {
    
    /**
     * (0)
     */
    heNone(0),
    
    /**
     * (1)
     */
    heNotebooks(1),
    
    /**
     * (2)
     */
    heSectionGroups(2),
    
    /**
     * (4)
     */
    heSections(4),
    
    /**
     * (8)
     */
    hePages(8),
    ;

    private HierarchyElement(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}