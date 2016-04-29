
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoControlOLEUsage implements IComEnum {
    
    /**
     * (0)
     */
    msoControlOLEUsageNeither(0),
    
    /**
     * (1)
     */
    msoControlOLEUsageServer(1),
    
    /**
     * (2)
     */
    msoControlOLEUsageClient(2),
    
    /**
     * (3)
     */
    msoControlOLEUsageBoth(3),
    ;

    private MsoControlOLEUsage(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}