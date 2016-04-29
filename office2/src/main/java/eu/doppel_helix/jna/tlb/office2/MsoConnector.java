
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoConnector implements IComEnum {
    
    /**
     * (1)
     */
    msoConnectorAnd(1),
    
    /**
     * (2)
     */
    msoConnectorOr(2),
    ;

    private MsoConnector(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}