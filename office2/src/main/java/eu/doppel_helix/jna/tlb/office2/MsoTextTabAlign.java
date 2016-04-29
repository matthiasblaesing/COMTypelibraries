
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTextTabAlign implements IComEnum {
    
    /**
     * (-2)
     */
    msoTabAlignMixed(-2),
    
    /**
     * (0)
     */
    msoTabAlignLeft(0),
    
    /**
     * (1)
     */
    msoTabAlignCenter(1),
    
    /**
     * (2)
     */
    msoTabAlignRight(2),
    
    /**
     * (3)
     */
    msoTabAlignDecimal(3),
    ;

    private MsoTextTabAlign(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}