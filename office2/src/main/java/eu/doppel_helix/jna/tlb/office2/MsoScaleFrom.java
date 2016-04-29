
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoScaleFrom implements IComEnum {
    
    /**
     * (0)
     */
    msoScaleFromTopLeft(0),
    
    /**
     * (1)
     */
    msoScaleFromMiddle(1),
    
    /**
     * (2)
     */
    msoScaleFromBottomRight(2),
    ;

    private MsoScaleFrom(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}