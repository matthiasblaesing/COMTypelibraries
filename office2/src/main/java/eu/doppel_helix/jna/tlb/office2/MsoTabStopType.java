
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTabStopType implements IComEnum {
    
    /**
     * (-2)
     */
    msoTabStopMixed(-2),
    
    /**
     * (1)
     */
    msoTabStopLeft(1),
    
    /**
     * (2)
     */
    msoTabStopCenter(2),
    
    /**
     * (3)
     */
    msoTabStopRight(3),
    
    /**
     * (4)
     */
    msoTabStopDecimal(4),
    ;

    private MsoTabStopType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}