
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({3D416AF9-AA8F-3864-89B8-6C2082744F95})</p>
 */
public enum WdLineType implements IComEnum {
    
    /**
     * (0)
     */
    wdTextLine(0),
    
    /**
     * (1)
     */
    wdTableRow(1),
    ;

    private WdLineType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}