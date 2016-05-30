
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * The WiaImageBias enumeration helps specify what type of data the image is intended to represent.
 *
 * <p>uuid({19E509B8-519E-48DE-90DC-D732144F7B9A})</p>
 */
public enum WiaImageBias implements IComEnum {
    
    /**
     * Use a lower quality scan to minimize the size of the file that contains the image. (65536)
     */
    MinimizeSize(65536),
    
    /**
     * Use a higher quality scan to maximize the quality of the image. (131072)
     */
    MaximizeQuality(131072),
    ;

    private WiaImageBias(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}