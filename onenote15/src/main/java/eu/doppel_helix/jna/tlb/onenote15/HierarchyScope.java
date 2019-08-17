
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({552E0E02-B287-4EC6-9CC0-4BA019EE5EA1})</p>
 */
public enum HierarchyScope implements IComEnum {
    
    /**
     * (0)
     */
    hsSelf(0),
    
    /**
     * (1)
     */
    hsChildren(1),
    
    /**
     * (2)
     */
    hsNotebooks(2),
    
    /**
     * (3)
     */
    hsSections(3),
    
    /**
     * (4)
     */
    hsPages(4),
    ;

    private HierarchyScope(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}