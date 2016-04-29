
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({64DC8298-B347-32EE-BB16-96C885822088})</p>
 */
public enum WdPrintOutRange implements IComEnum {
    
    /**
     * (0)
     */
    wdPrintAllDocument(0),
    
    /**
     * (1)
     */
    wdPrintSelection(1),
    
    /**
     * (2)
     */
    wdPrintCurrentPage(2),
    
    /**
     * (3)
     */
    wdPrintFromTo(3),
    
    /**
     * (4)
     */
    wdPrintRangeOfPages(4),
    ;

    private WdPrintOutRange(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}