
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({F9AC6CAA-EAA0-3A0A-A87E-1CC2A60AA19F})</p>
 */
public enum WdRevisionsBalloonWidthType implements IComEnum {
    
    /**
     * (0)
     */
    wdBalloonWidthPercent(0),
    
    /**
     * (1)
     */
    wdBalloonWidthPoints(1),
    ;

    private WdRevisionsBalloonWidthType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}