
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8F1C83EA-C44E-332C-96CB-AA583DE5FA82})</p>
 */
public enum WdJustificationMode implements IComEnum {
    
    /**
     * (0)
     */
    wdJustificationModeExpand(0),
    
    /**
     * (1)
     */
    wdJustificationModeCompress(1),
    
    /**
     * (2)
     */
    wdJustificationModeCompressKana(2),
    ;

    private WdJustificationMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}