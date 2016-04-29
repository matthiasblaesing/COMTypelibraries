
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1316B834-201F-39AA-B4C8-7F63A3431A33})</p>
 */
public enum WdMergeSubType implements IComEnum {
    
    /**
     * (0)
     */
    wdMergeSubTypeOther(0),
    
    /**
     * (1)
     */
    wdMergeSubTypeAccess(1),
    
    /**
     * (2)
     */
    wdMergeSubTypeOAL(2),
    
    /**
     * (3)
     */
    wdMergeSubTypeOLEDBWord(3),
    
    /**
     * (4)
     */
    wdMergeSubTypeWorks(4),
    
    /**
     * (5)
     */
    wdMergeSubTypeOLEDBText(5),
    
    /**
     * (6)
     */
    wdMergeSubTypeOutlook(6),
    
    /**
     * (7)
     */
    wdMergeSubTypeWord(7),
    
    /**
     * (8)
     */
    wdMergeSubTypeWord2000(8),
    ;

    private WdMergeSubType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}