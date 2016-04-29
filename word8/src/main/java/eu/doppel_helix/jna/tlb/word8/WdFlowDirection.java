
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C2ADF35B-D18A-351B-B61F-79D9E874DE1D})</p>
 */
public enum WdFlowDirection implements IComEnum {
    
    /**
     * (0)
     */
    wdFlowLtr(0),
    
    /**
     * (1)
     */
    wdFlowRtl(1),
    ;

    private WdFlowDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}