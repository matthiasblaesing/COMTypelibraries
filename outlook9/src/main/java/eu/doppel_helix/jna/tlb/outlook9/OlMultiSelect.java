
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({5A0FB768-AAF4-4E8C-9C57-89ACA8B6249F})</p>
 */
public enum OlMultiSelect implements IComEnum {
    
    /**
     * Single (0)
     */
    olMultiSelectSingle(0),
    
    /**
     * Multi (1)
     */
    olMultiSelectMulti(1),
    
    /**
     * Extended (2)
     */
    olMultiSelectExtended(2),
    ;

    private OlMultiSelect(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}