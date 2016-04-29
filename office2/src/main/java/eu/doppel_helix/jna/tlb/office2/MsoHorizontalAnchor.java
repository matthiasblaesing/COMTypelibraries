
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoHorizontalAnchor implements IComEnum {
    
    /**
     * (-2)
     */
    msoHorizontalAnchorMixed(-2),
    
    /**
     * (1)
     */
    msoAnchorNone(1),
    
    /**
     * (2)
     */
    msoAnchorCenter(2),
    ;

    private MsoHorizontalAnchor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}