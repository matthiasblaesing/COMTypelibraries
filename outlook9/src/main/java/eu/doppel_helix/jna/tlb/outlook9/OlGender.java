
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlGender implements IComEnum {
    
    /**
     * (0)
     */
    olUnspecified(0),
    
    /**
     * (1)
     */
    olFemale(1),
    
    /**
     * (2)
     */
    olMale(2),
    ;

    private OlGender(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}