
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({634EE3C4-6BCB-4BD6-8997-30C9DB02E223})</p>
 */
public enum OlHorizontalLayout implements IComEnum {
    
    /**
     * AlignLeft (0)
     */
    olHorizontalLayoutAlignLeft(0),
    
    /**
     * AlignCenter (1)
     */
    olHorizontalLayoutAlignCenter(1),
    
    /**
     * AlignRight (2)
     */
    olHorizontalLayoutAlignRight(2),
    
    /**
     * Grow (3)
     */
    olHorizontalLayoutGrow(3),
    ;

    private OlHorizontalLayout(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}