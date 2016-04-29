
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFeatureInstall implements IComEnum {
    
    /**
     * (0)
     */
    msoFeatureInstallNone(0),
    
    /**
     * (1)
     */
    msoFeatureInstallOnDemand(1),
    
    /**
     * (2)
     */
    msoFeatureInstallOnDemandWithUI(2),
    ;

    private MsoFeatureInstall(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}