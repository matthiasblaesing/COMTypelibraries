
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum BackstageGroupStyle implements IComEnum {
    
    /**
     * (0)
     */
    BackstageGroupStyleNormal(0),
    
    /**
     * (1)
     */
    BackstageGroupStyleWarning(1),
    
    /**
     * (2)
     */
    BackstageGroupStyleError(2),
    ;

    private BackstageGroupStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}