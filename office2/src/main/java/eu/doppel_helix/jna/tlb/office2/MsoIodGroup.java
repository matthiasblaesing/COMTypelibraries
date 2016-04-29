
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({750D0562-9930-40DD-9DA7-887B50F2111F})</p>
 */
public enum MsoIodGroup implements IComEnum {
    
    /**
     * (0)
     */
    msoIodGroupPIAs(0),
    
    /**
     * (1)
     */
    msoIodGroupVSTOR35Mgd(1),
    
    /**
     * (2)
     */
    msoIodGroupVSTOR40Mgd(2),
    ;

    private MsoIodGroup(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}