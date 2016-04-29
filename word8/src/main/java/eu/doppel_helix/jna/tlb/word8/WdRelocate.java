
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({867B8394-0450-32AE-80A9-8861CB6AC618})</p>
 */
public enum WdRelocate implements IComEnum {
    
    /**
     * (0)
     */
    wdRelocateUp(0),
    
    /**
     * (1)
     */
    wdRelocateDown(1),
    ;

    private WdRelocate(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}