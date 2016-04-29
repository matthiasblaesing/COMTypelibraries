
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlBodyFormat implements IComEnum {
    
    /**
     * (0)
     */
    olFormatUnspecified(0),
    
    /**
     * (1)
     */
    olFormatPlain(1),
    
    /**
     * (2)
     */
    olFormatHTML(2),
    
    /**
     * (3)
     */
    olFormatRichText(3),
    ;

    private OlBodyFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}