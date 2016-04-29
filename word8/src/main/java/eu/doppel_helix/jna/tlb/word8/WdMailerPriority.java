
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({27D51657-6EA9-3956-A11C-C6303EC9A3AD})</p>
 */
public enum WdMailerPriority implements IComEnum {
    
    /**
     * (1)
     */
    wdPriorityNormal(1),
    
    /**
     * (2)
     */
    wdPriorityLow(2),
    
    /**
     * (3)
     */
    wdPriorityHigh(3),
    ;

    private WdMailerPriority(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}