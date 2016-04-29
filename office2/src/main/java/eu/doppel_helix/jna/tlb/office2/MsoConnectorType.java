
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoConnectorType implements IComEnum {
    
    /**
     * (-2)
     */
    msoConnectorTypeMixed(-2),
    
    /**
     * (1)
     */
    msoConnectorStraight(1),
    
    /**
     * (2)
     */
    msoConnectorElbow(2),
    
    /**
     * (3)
     */
    msoConnectorCurve(3),
    ;

    private MsoConnectorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}