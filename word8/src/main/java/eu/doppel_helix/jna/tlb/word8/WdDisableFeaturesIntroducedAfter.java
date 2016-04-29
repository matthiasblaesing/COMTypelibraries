
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({71DD90C6-1BC0-3963-89F6-CB8AF3F73610})</p>
 */
public enum WdDisableFeaturesIntroducedAfter implements IComEnum {
    
    /**
     * (0)
     */
    wd70(0),
    
    /**
     * (1)
     */
    wd70FE(1),
    
    /**
     * (2)
     */
    wd80(2),
    ;

    private WdDisableFeaturesIntroducedAfter(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}