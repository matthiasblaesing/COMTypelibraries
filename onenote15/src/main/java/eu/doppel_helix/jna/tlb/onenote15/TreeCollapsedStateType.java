
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1ECC88B3-6D2B-4EDD-8DD5-BB11E5D34C09})</p>
 */
public enum TreeCollapsedStateType implements IComEnum {
    
    /**
     * (0)
     */
    tcsExpanded(0),
    
    /**
     * (1)
     */
    tcsCollapsed(1),
    ;

    private TreeCollapsedStateType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}