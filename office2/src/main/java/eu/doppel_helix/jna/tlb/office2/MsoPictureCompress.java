
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPictureCompress implements IComEnum {
    
    /**
     * (-1)
     */
    msoPictureCompressDocDefault(-1),
    
    /**
     * (0)
     */
    msoPictureCompressFalse(0),
    
    /**
     * (1)
     */
    msoPictureCompressTrue(1),
    ;

    private MsoPictureCompress(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}