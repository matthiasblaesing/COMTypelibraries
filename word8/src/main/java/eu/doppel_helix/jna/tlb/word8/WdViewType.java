
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({32FB36EF-2E57-345C-98BA-051FB07F8F6C})</p>
 */
public enum WdViewType implements IComEnum {
    
    /**
     * (1)
     */
    wdNormalView(1),
    
    /**
     * (2)
     */
    wdOutlineView(2),
    
    /**
     * (3)
     */
    wdPrintView(3),
    
    /**
     * (4)
     */
    wdPrintPreview(4),
    
    /**
     * (5)
     */
    wdMasterView(5),
    
    /**
     * (6)
     */
    wdWebView(6),
    
    /**
     * (7)
     */
    wdReadingView(7),
    
    /**
     * (8)
     */
    wdConflictView(8),
    ;

    private WdViewType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}