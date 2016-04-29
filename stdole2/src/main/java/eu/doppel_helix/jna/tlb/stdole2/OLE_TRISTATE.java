
package eu.doppel_helix.jna.tlb.stdole2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6650430A-BE0F-101A-8BBB-00AA00300CAB})</p>
 */
public enum OLE_TRISTATE implements IComEnum {
    
    /**
     * (0)
     */
    Unchecked(0),
    
    /**
     * (1)
     */
    Checked(1),
    
    /**
     * (2)
     */
    Gray(2),
    ;

    private OLE_TRISTATE(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}