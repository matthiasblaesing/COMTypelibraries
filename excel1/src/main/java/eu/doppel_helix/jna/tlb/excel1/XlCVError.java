
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCVError implements IComEnum {
    
    /**
     * (2007)
     */
    xlErrDiv0(2007),
    
    /**
     * (2042)
     */
    xlErrNA(2042),
    
    /**
     * (2029)
     */
    xlErrName(2029),
    
    /**
     * (2000)
     */
    xlErrNull(2000),
    
    /**
     * (2036)
     */
    xlErrNum(2036),
    
    /**
     * (2023)
     */
    xlErrRef(2023),
    
    /**
     * (2015)
     */
    xlErrValue(2015),
    ;

    private XlCVError(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}