
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9C46779B-5D34-399B-8F02-1FD193FDE323})</p>
 */
public enum WdWrapSideType implements IComEnum {
    
    /**
     * (0)
     */
    wdWrapBoth(0),
    
    /**
     * (1)
     */
    wdWrapLeft(1),
    
    /**
     * (2)
     */
    wdWrapRight(2),
    
    /**
     * (3)
     */
    wdWrapLargest(3),
    ;

    private WdWrapSideType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}