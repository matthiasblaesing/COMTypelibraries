
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A04EAECD-6433-3994-8B86-4E4D973C4630})</p>
 */
public enum WdSectionStart implements IComEnum {
    
    /**
     * (0)
     */
    wdSectionContinuous(0),
    
    /**
     * (1)
     */
    wdSectionNewColumn(1),
    
    /**
     * (2)
     */
    wdSectionNewPage(2),
    
    /**
     * (3)
     */
    wdSectionEvenPage(3),
    
    /**
     * (4)
     */
    wdSectionOddPage(4),
    ;

    private WdSectionStart(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}