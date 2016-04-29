
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoVerticalAnchor implements IComEnum {
    
    /**
     * (-2)
     */
    msoVerticalAnchorMixed(-2),
    
    /**
     * (1)
     */
    msoAnchorTop(1),
    
    /**
     * (2)
     */
    msoAnchorTopBaseline(2),
    
    /**
     * (3)
     */
    msoAnchorMiddle(3),
    
    /**
     * (4)
     */
    msoAnchorBottom(4),
    
    /**
     * (5)
     */
    msoAnchorBottomBaseLine(5),
    ;

    private MsoVerticalAnchor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}