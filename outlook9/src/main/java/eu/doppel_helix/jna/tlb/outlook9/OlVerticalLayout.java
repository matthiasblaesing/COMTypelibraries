
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({EA33F29D-6159-4E76-8A14-BCEAA808FA91})</p>
 */
public enum OlVerticalLayout implements IComEnum {
    
    /**
     * AlignTop (0)
     */
    olVerticalLayoutAlignTop(0),
    
    /**
     * AlignMiddle (1)
     */
    olVerticalLayoutAlignMiddle(1),
    
    /**
     * AlignBottom (2)
     */
    olVerticalLayoutAlignBottom(2),
    
    /**
     * Grow (3)
     */
    olVerticalLayoutGrow(3),
    ;

    private OlVerticalLayout(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}