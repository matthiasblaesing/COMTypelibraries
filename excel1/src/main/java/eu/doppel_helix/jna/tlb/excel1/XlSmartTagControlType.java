
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSmartTagControlType implements IComEnum {
    
    /**
     * (1)
     */
    xlSmartTagControlSmartTag(1),
    
    /**
     * (2)
     */
    xlSmartTagControlLink(2),
    
    /**
     * (3)
     */
    xlSmartTagControlHelp(3),
    
    /**
     * (4)
     */
    xlSmartTagControlHelpURL(4),
    
    /**
     * (5)
     */
    xlSmartTagControlSeparator(5),
    
    /**
     * (6)
     */
    xlSmartTagControlButton(6),
    
    /**
     * (7)
     */
    xlSmartTagControlLabel(7),
    
    /**
     * (8)
     */
    xlSmartTagControlImage(8),
    
    /**
     * (9)
     */
    xlSmartTagControlCheckbox(9),
    
    /**
     * (10)
     */
    xlSmartTagControlTextbox(10),
    
    /**
     * (11)
     */
    xlSmartTagControlListbox(11),
    
    /**
     * (12)
     */
    xlSmartTagControlCombo(12),
    
    /**
     * (13)
     */
    xlSmartTagControlActiveX(13),
    
    /**
     * (14)
     */
    xlSmartTagControlRadioGroup(14),
    ;

    private XlSmartTagControlType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}