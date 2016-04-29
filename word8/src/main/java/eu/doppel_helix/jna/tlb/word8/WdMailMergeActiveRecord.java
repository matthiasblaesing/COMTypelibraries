
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1D68A9D2-DC27-300F-8758-AC235B356B05})</p>
 */
public enum WdMailMergeActiveRecord implements IComEnum {
    
    /**
     * (-1)
     */
    wdNoActiveRecord(-1),
    
    /**
     * (-2)
     */
    wdNextRecord(-2),
    
    /**
     * (-3)
     */
    wdPreviousRecord(-3),
    
    /**
     * (-4)
     */
    wdFirstRecord(-4),
    
    /**
     * (-5)
     */
    wdLastRecord(-5),
    
    /**
     * (-6)
     */
    wdFirstDataSourceRecord(-6),
    
    /**
     * (-7)
     */
    wdLastDataSourceRecord(-7),
    
    /**
     * (-8)
     */
    wdNextDataSourceRecord(-8),
    
    /**
     * (-9)
     */
    wdPreviousDataSourceRecord(-9),
    ;

    private WdMailMergeActiveRecord(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}