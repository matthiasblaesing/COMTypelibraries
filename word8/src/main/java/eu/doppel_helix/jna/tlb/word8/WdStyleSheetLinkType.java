
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({238432DC-D657-37E7-886E-5A155E5FF117})</p>
 */
public enum WdStyleSheetLinkType implements IComEnum {
    
    /**
     * (0)
     */
    wdStyleSheetLinkTypeLinked(0),
    
    /**
     * (1)
     */
    wdStyleSheetLinkTypeImported(1),
    ;

    private WdStyleSheetLinkType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}