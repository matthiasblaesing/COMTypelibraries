
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0BEAB7D8-3BA8-4960-899B-096FCE2EE60F})</p>
 */
public enum OlPictureAlignment implements IComEnum {
    
    /**
     * Left (0)
     */
    olPictureAlignmentLeft(0),
    
    /**
     * Top (1)
     */
    olPictureAlignmentTop(1),
    ;

    private OlPictureAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}