
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({23EE5CED-FE35-3D2E-A069-8D44CD012D99})</p>
 */
public enum WdHorizontalInVerticalType implements IComEnum {
    
    /**
     * (0)
     */
    wdHorizontalInVerticalNone(0),
    
    /**
     * (1)
     */
    wdHorizontalInVerticalFitInLine(1),
    
    /**
     * (2)
     */
    wdHorizontalInVerticalResizeLine(2),
    ;

    private WdHorizontalInVerticalType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}