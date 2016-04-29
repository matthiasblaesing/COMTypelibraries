
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({07E8576F-FD92-3F44-8DCE-00C46F71A56C})</p>
 */
public enum WdMailMergeState implements IComEnum {
    
    /**
     * (0)
     */
    wdNormalDocument(0),
    
    /**
     * (1)
     */
    wdMainDocumentOnly(1),
    
    /**
     * (2)
     */
    wdMainAndDataSource(2),
    
    /**
     * (3)
     */
    wdMainAndHeader(3),
    
    /**
     * (4)
     */
    wdMainAndSourceAndHeader(4),
    
    /**
     * (5)
     */
    wdDataSource(5),
    ;

    private WdMailMergeState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}