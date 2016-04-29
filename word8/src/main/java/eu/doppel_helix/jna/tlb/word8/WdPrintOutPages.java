
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({359EAB69-7EA9-3179-B5D8-808A3CA74365})</p>
 */
public enum WdPrintOutPages implements IComEnum {
    
    /**
     * (0)
     */
    wdPrintAllPages(0),
    
    /**
     * (1)
     */
    wdPrintOddPagesOnly(1),
    
    /**
     * (2)
     */
    wdPrintEvenPagesOnly(2),
    ;

    private WdPrintOutPages(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}