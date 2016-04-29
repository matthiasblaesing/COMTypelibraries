
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({54679592-3E68-3EC3-93E5-22564D0388E7})</p>
 */
public enum WdListApplyTo implements IComEnum {
    
    /**
     * (0)
     */
    wdListApplyToWholeList(0),
    
    /**
     * (1)
     */
    wdListApplyToThisPointForward(1),
    
    /**
     * (2)
     */
    wdListApplyToSelection(2),
    ;

    private WdListApplyTo(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}