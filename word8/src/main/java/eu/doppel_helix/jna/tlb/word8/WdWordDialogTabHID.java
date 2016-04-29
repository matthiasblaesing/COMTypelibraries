
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({14A3993D-4639-3665-B2DF-68D5C76E407B})</p>
 */
public enum WdWordDialogTabHID implements IComEnum {
    
    /**
     * (150001)
     */
    wdDialogFilePageSetupTabPaperSize(150001),
    
    /**
     * (150002)
     */
    wdDialogFilePageSetupTabPaperSource(150002),
    ;

    private WdWordDialogTabHID(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}