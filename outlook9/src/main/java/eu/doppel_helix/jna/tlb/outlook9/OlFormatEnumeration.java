
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormatEnumeration implements IComEnum {
    
    /**
     * (1)
     */
    olFormatEnumBitmap(1),
    
    /**
     * (2)
     */
    olFormatEnumText(2),
    ;

    private OlFormatEnumeration(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}