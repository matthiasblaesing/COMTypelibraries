
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * The WiaImageIntent enumeration helps specify what type of data the image is intended to represent.
 *
 * <p>uuid({6165F914-C665-442C-B90B-D73DE216BE77})</p>
 */
public enum WiaImageIntent implements IComEnum {
    
    /**
     * No intent specified. (0)
     */
    UnspecifiedIntent(0),
    
    /**
     * The image is a color illustration. (1)
     */
    ColorIntent(1),
    
    /**
     * The image is grayscale data. (2)
     */
    GrayscaleIntent(2),
    
    /**
     * The image is a text image such as a fax or scanned document. (4)
     */
    TextIntent(4),
    ;

    private WiaImageIntent(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}