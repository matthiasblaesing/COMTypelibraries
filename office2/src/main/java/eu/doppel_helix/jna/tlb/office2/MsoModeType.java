
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoModeType implements IComEnum {
    
    /**
     * (0)
     */
    msoModeModal(0),
    
    /**
     * (1)
     */
    msoModeAutoDown(1),
    
    /**
     * (2)
     */
    msoModeModeless(2),
    ;

    private MsoModeType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}