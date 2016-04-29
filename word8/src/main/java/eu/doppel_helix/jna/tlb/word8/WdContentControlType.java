
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D837E0A6-EB0E-3F7F-B8BE-9C0F05401CCD})</p>
 */
public enum WdContentControlType implements IComEnum {
    
    /**
     * (0)
     */
    wdContentControlRichText(0),
    
    /**
     * (1)
     */
    wdContentControlText(1),
    
    /**
     * (2)
     */
    wdContentControlPicture(2),
    
    /**
     * (3)
     */
    wdContentControlComboBox(3),
    
    /**
     * (4)
     */
    wdContentControlDropdownList(4),
    
    /**
     * (5)
     */
    wdContentControlBuildingBlockGallery(5),
    
    /**
     * (6)
     */
    wdContentControlDate(6),
    
    /**
     * (7)
     */
    wdContentControlGroup(7),
    
    /**
     * (8)
     */
    wdContentControlCheckBox(8),
    
    /**
     * (9)
     */
    wdContentControlRepeatingSection(9),
    ;

    private WdContentControlType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}