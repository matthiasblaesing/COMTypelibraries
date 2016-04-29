
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C9C18CC3-9DA7-3869-9B10-283F57937F60})</p>
 */
public enum WdOMathBreakSub implements IComEnum {
    
    /**
     * (0)
     */
    wdOMathBreakSubMinusMinus(0),
    
    /**
     * (1)
     */
    wdOMathBreakSubPlusMinus(1),
    
    /**
     * (2)
     */
    wdOMathBreakSubMinusPlus(2),
    ;

    private WdOMathBreakSub(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}