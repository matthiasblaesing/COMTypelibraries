
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B0174301-3877-3296-9551-0D01D6CAD020})</p>
 */
public enum WdMultipleWordConversionsMode implements IComEnum {
    
    /**
     * (0)
     */
    wdHangulToHanja(0),
    
    /**
     * (1)
     */
    wdHanjaToHangul(1),
    ;

    private WdMultipleWordConversionsMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}