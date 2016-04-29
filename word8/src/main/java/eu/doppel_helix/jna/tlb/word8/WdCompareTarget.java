
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({86A89091-D6FC-3A6F-A172-7776C718E362})</p>
 */
public enum WdCompareTarget implements IComEnum {
    
    /**
     * (0)
     */
    wdCompareTargetSelected(0),
    
    /**
     * (1)
     */
    wdCompareTargetCurrent(1),
    
    /**
     * (2)
     */
    wdCompareTargetNew(2),
    ;

    private WdCompareTarget(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}