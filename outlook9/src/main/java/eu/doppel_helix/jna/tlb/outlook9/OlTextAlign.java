
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({03FADFE8-2527-46C3-9CCD-DBBBCD05156B})</p>
 */
public enum OlTextAlign implements IComEnum {
    
    /**
     * Left (1)
     */
    olTextAlignLeft(1),
    
    /**
     * Center (2)
     */
    olTextAlignCenter(2),
    
    /**
     * Right (3)
     */
    olTextAlignRight(3),
    ;

    private OlTextAlign(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}