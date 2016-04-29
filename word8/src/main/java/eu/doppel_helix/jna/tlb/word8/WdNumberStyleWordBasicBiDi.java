
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E3D0438D-D284-31C5-A2BF-A4AF6A1BD014})</p>
 */
public enum WdNumberStyleWordBasicBiDi implements IComEnum {
    
    /**
     * (49)
     */
    wdListNumberStyleBidi1(49),
    
    /**
     * (50)
     */
    wdListNumberStyleBidi2(50),
    
    /**
     * (49)
     */
    wdCaptionNumberStyleBidiLetter1(49),
    
    /**
     * (50)
     */
    wdCaptionNumberStyleBidiLetter2(50),
    
    /**
     * (49)
     */
    wdNoteNumberStyleBidiLetter1(49),
    
    /**
     * (50)
     */
    wdNoteNumberStyleBidiLetter2(50),
    
    /**
     * (49)
     */
    wdPageNumberStyleBidiLetter1(49),
    
    /**
     * (50)
     */
    wdPageNumberStyleBidiLetter2(50),
    ;

    private WdNumberStyleWordBasicBiDi(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}