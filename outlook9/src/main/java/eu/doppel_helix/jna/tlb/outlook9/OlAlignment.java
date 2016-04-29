
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({35A805A1-009F-4307-A6D9-3654104862B5})</p>
 */
public enum OlAlignment implements IComEnum {
    
    /**
     * Left (0)
     */
    olAlignmentLeft(0),
    
    /**
     * Right (1)
     */
    olAlignmentRight(1),
    ;

    private OlAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}