
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({BD0E5FD4-BCC4-3913-82EF-19EE05B56F04})</p>
 */
public enum WdReferenceType implements IComEnum {
    
    /**
     * (0)
     */
    wdRefTypeNumberedItem(0),
    
    /**
     * (1)
     */
    wdRefTypeHeading(1),
    
    /**
     * (2)
     */
    wdRefTypeBookmark(2),
    
    /**
     * (3)
     */
    wdRefTypeFootnote(3),
    
    /**
     * (4)
     */
    wdRefTypeEndnote(4),
    ;

    private WdReferenceType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}