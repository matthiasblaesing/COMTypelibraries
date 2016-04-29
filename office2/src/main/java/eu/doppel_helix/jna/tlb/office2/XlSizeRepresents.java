
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8B544093-ECC1-43E3-80EF-25D6FBCC7540})</p>
 */
public enum XlSizeRepresents implements IComEnum {
    
    /**
     * (2)
     */
    xlSizeIsWidth(2),
    
    /**
     * (1)
     */
    xlSizeIsArea(1),
    ;

    private XlSizeRepresents(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}