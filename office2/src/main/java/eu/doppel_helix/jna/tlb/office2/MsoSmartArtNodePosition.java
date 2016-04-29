
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSmartArtNodePosition implements IComEnum {
    
    /**
     * (1)
     */
    msoSmartArtNodeDefault(1),
    
    /**
     * (2)
     */
    msoSmartArtNodeAfter(2),
    
    /**
     * (3)
     */
    msoSmartArtNodeBefore(3),
    
    /**
     * (4)
     */
    msoSmartArtNodeAbove(4),
    
    /**
     * (5)
     */
    msoSmartArtNodeBelow(5),
    ;

    private MsoSmartArtNodePosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}