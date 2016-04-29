
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B14E1D94-EAC6-37D5-80D3-40CF2FC44C22})</p>
 */
public enum WdFramesetType implements IComEnum {
    
    /**
     * (0)
     */
    wdFramesetTypeFrameset(0),
    
    /**
     * (1)
     */
    wdFramesetTypeFrame(1),
    ;

    private WdFramesetType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}