
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7E29FD73-540B-4F03-A890-53C6B0AE7DD1})</p>
 */
public enum OlEnterFieldBehavior implements IComEnum {
    
    /**
     * SelectAll (0)
     */
    olEnterFieldBehaviorSelectAll(0),
    
    /**
     * RecallSelection (1)
     */
    olEnterFieldBehaviorRecallSelection(1),
    ;

    private OlEnterFieldBehavior(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}