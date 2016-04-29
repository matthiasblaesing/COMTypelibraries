
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCopyPictureFormat implements IComEnum {
    
    /**
     * (2)
     */
    xlBitmap(2),
    
    /**
     * (-4147)
     */
    xlPicture(-4147),
    ;

    private XlCopyPictureFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}