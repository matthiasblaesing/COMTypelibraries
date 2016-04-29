
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({FCCB82A4-40EF-3DE0-B972-4A14EBDC2B08})</p>
 */
public enum WdCaptionLabelID implements IComEnum {
    
    /**
     * (-1)
     */
    wdCaptionFigure(-1),
    
    /**
     * (-2)
     */
    wdCaptionTable(-2),
    
    /**
     * (-3)
     */
    wdCaptionEquation(-3),
    ;

    private WdCaptionLabelID(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}