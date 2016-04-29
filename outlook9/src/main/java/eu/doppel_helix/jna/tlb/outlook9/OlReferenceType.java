
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlReferenceType implements IComEnum {
    
    /**
     * (0)
     */
    olWeak(0),
    
    /**
     * (1)
     */
    olStrong(1),
    ;

    private OlReferenceType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}