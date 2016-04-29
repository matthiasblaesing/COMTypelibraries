
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({DB697253-EFC0-3AE8-818D-308F530CD32F})</p>
 */
public enum WdAlertLevel implements IComEnum {
    
    /**
     * (0)
     */
    wdAlertsNone(0),
    
    /**
     * (-2)
     */
    wdAlertsMessageBox(-2),
    
    /**
     * (-1)
     */
    wdAlertsAll(-1),
    ;

    private WdAlertLevel(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}