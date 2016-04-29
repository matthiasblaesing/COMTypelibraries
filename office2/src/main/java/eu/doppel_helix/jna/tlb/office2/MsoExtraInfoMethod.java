
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoExtraInfoMethod implements IComEnum {
    
    /**
     * (0)
     */
    msoMethodGet(0),
    
    /**
     * (1)
     */
    msoMethodPost(1),
    ;

    private MsoExtraInfoMethod(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}