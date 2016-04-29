
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6BF1F6C4-9D73-3BF1-A9AF-16E3BA44D471})</p>
 */
public enum WdRevisionsBalloonPrintOrientation implements IComEnum {
    
    /**
     * (0)
     */
    wdBalloonPrintOrientationAuto(0),
    
    /**
     * (1)
     */
    wdBalloonPrintOrientationPreserve(1),
    
    /**
     * (2)
     */
    wdBalloonPrintOrientationForceLandscape(2),
    ;

    private WdRevisionsBalloonPrintOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}