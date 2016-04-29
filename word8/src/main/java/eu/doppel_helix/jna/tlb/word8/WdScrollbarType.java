
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0E37EEFA-84BD-300E-8AB4-7CFC2C8C3F38})</p>
 */
public enum WdScrollbarType implements IComEnum {
    
    /**
     * (0)
     */
    wdScrollbarTypeAuto(0),
    
    /**
     * (1)
     */
    wdScrollbarTypeYes(1),
    
    /**
     * (2)
     */
    wdScrollbarTypeNo(2),
    ;

    private WdScrollbarType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}