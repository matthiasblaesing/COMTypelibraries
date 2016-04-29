
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPictureAppearance implements IComEnum {
    
    /**
     * (2)
     */
    xlPrinter(2),
    
    /**
     * (1)
     */
    xlScreen(1),
    ;

    private XlPictureAppearance(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}