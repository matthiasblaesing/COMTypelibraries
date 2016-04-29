
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({3F179DBA-7622-3837-B18E-E295477260CC})</p>
 */
public enum WdOMathShapeType implements IComEnum {
    
    /**
     * (0)
     */
    wdOMathShapeCentered(0),
    
    /**
     * (1)
     */
    wdOMathShapeMatch(1),
    ;

    private WdOMathShapeType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}