
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D0323CE3-E503-3E8E-815F-17E83F2EFF60})</p>
 */
public enum WdMailMergeDataSource implements IComEnum {
    
    /**
     * (-1)
     */
    wdNoMergeInfo(-1),
    
    /**
     * (0)
     */
    wdMergeInfoFromWord(0),
    
    /**
     * (1)
     */
    wdMergeInfoFromAccessDDE(1),
    
    /**
     * (2)
     */
    wdMergeInfoFromExcelDDE(2),
    
    /**
     * (3)
     */
    wdMergeInfoFromMSQueryDDE(3),
    
    /**
     * (4)
     */
    wdMergeInfoFromODBC(4),
    
    /**
     * (5)
     */
    wdMergeInfoFromODSO(5),
    ;

    private WdMailMergeDataSource(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}