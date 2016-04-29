
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({BFB32608-3F71-3941-964A-959AD6D57A8A})</p>
 */
public enum WdListType implements IComEnum {
    
    /**
     * (0)
     */
    wdListNoNumbering(0),
    
    /**
     * (1)
     */
    wdListListNumOnly(1),
    
    /**
     * (2)
     */
    wdListBullet(2),
    
    /**
     * (3)
     */
    wdListSimpleNumbering(3),
    
    /**
     * (4)
     */
    wdListOutlineNumbering(4),
    
    /**
     * (5)
     */
    wdListMixedNumbering(5),
    
    /**
     * (6)
     */
    wdListPictureBullet(6),
    ;

    private WdListType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}