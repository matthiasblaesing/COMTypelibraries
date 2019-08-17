
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({226CC8E6-1ED0-4770-A7F1-A80BB4DDF07B})</p>
 */
public enum NewPageStyle implements IComEnum {
    
    /**
     * (0)
     */
    npsDefault(0),
    
    /**
     * (1)
     */
    npsBlankPageWithTitle(1),
    
    /**
     * (2)
     */
    npsBlankPageNoTitle(2),
    ;

    private NewPageStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}