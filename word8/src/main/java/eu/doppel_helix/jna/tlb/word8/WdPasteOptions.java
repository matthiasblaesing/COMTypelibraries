
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A34C1A4A-9468-39DD-B46C-C3A6ABD67DFB})</p>
 */
public enum WdPasteOptions implements IComEnum {
    
    /**
     * (0)
     */
    wdKeepSourceFormatting(0),
    
    /**
     * (1)
     */
    wdMatchDestinationFormatting(1),
    
    /**
     * (2)
     */
    wdKeepTextOnly(2),
    
    /**
     * (3)
     */
    wdUseDestinationStyles(3),
    ;

    private WdPasteOptions(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}