
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A761B997-6F90-3C4E-9677-EA06329D5926})</p>
 */
public enum WdPageFit implements IComEnum {
    
    /**
     * (0)
     */
    wdPageFitNone(0),
    
    /**
     * (1)
     */
    wdPageFitFullPage(1),
    
    /**
     * (2)
     */
    wdPageFitBestFit(2),
    
    /**
     * (3)
     */
    wdPageFitTextFit(3),
    ;

    private WdPageFit(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}