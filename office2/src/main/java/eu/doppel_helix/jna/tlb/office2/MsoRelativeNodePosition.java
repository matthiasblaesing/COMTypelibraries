
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoRelativeNodePosition implements IComEnum {
    
    /**
     * (1)
     */
    msoBeforeNode(1),
    
    /**
     * (2)
     */
    msoAfterNode(2),
    
    /**
     * (3)
     */
    msoBeforeFirstSibling(3),
    
    /**
     * (4)
     */
    msoAfterLastSibling(4),
    ;

    private MsoRelativeNodePosition(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}