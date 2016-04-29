
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({35D15973-23ED-4504-866B-C0B5C937A058})</p>
 */
public enum OlPageType implements IComEnum {
    
    /**
     * Planner (0)
     */
    olPageTypePlanner(0),
    
    /**
     * Tracker (1)
     */
    olPageTypeTracker(1),
    ;

    private OlPageType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}