
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({04B3C697-9F96-361C-A490-1D381C325429})</p>
 */
public enum WdRevisionsBalloonMargin implements IComEnum {
    
    /**
     * (0)
     */
    wdLeftMargin(0),
    
    /**
     * (1)
     */
    wdRightMargin(1),
    ;

    private WdRevisionsBalloonMargin(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}