
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({63917A75-8674-34FC-A80B-988B0D019B25})</p>
 */
public enum WdOMathType implements IComEnum {
    
    /**
     * (0)
     */
    wdOMathDisplay(0),
    
    /**
     * (1)
     */
    wdOMathInline(1),
    ;

    private WdOMathType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}