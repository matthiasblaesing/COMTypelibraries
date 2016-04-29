
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoAlignCmd implements IComEnum {
    
    /**
     * (0)
     */
    msoAlignLefts(0),
    
    /**
     * (1)
     */
    msoAlignCenters(1),
    
    /**
     * (2)
     */
    msoAlignRights(2),
    
    /**
     * (3)
     */
    msoAlignTops(3),
    
    /**
     * (4)
     */
    msoAlignMiddles(4),
    
    /**
     * (5)
     */
    msoAlignBottoms(5),
    ;

    private MsoAlignCmd(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}