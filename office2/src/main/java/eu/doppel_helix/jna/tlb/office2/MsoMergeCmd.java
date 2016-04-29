
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoMergeCmd implements IComEnum {
    
    /**
     * (1)
     */
    msoMergeUnion(1),
    
    /**
     * (2)
     */
    msoMergeCombine(2),
    
    /**
     * (3)
     */
    msoMergeIntersect(3),
    
    /**
     * (4)
     */
    msoMergeSubtract(4),
    
    /**
     * (5)
     */
    msoMergeFragment(5),
    ;

    private MsoMergeCmd(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}