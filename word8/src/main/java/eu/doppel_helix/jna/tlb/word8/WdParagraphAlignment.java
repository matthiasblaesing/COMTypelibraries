
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B46D9062-1DB3-34C7-93D1-5E575E00B829})</p>
 */
public enum WdParagraphAlignment implements IComEnum {
    
    /**
     * (0)
     */
    wdAlignParagraphLeft(0),
    
    /**
     * (1)
     */
    wdAlignParagraphCenter(1),
    
    /**
     * (2)
     */
    wdAlignParagraphRight(2),
    
    /**
     * (3)
     */
    wdAlignParagraphJustify(3),
    
    /**
     * (4)
     */
    wdAlignParagraphDistribute(4),
    
    /**
     * (5)
     */
    wdAlignParagraphJustifyMed(5),
    
    /**
     * (7)
     */
    wdAlignParagraphJustifyHi(7),
    
    /**
     * (8)
     */
    wdAlignParagraphJustifyLow(8),
    
    /**
     * (9)
     */
    wdAlignParagraphThaiJustify(9),
    ;

    private WdParagraphAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}