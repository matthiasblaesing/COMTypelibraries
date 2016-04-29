
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSearchIn implements IComEnum {
    
    /**
     * (0)
     */
    msoSearchInMyComputer(0),
    
    /**
     * (1)
     */
    msoSearchInOutlook(1),
    
    /**
     * (2)
     */
    msoSearchInMyNetworkPlaces(2),
    
    /**
     * (3)
     */
    msoSearchInCustom(3),
    ;

    private MsoSearchIn(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}