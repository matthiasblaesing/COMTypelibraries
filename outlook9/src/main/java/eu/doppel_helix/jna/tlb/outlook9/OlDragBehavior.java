
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({25B06F72-02C5-4AF8-8366-28C2C65CB035})</p>
 */
public enum OlDragBehavior implements IComEnum {
    
    /**
     * Disabled (0)
     */
    olDragBehaviorDisabled(0),
    
    /**
     * Enabled (1)
     */
    olDragBehaviorEnabled(1),
    ;

    private OlDragBehavior(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}