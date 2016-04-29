
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({5BE83446-698C-3E28-A887-023C64E9DC57})</p>
 */
public enum WdSmartTagControlType implements IComEnum {
    
    /**
     * (1)
     */
    wdControlSmartTag(1),
    
    /**
     * (2)
     */
    wdControlLink(2),
    
    /**
     * (3)
     */
    wdControlHelp(3),
    
    /**
     * (4)
     */
    wdControlHelpURL(4),
    
    /**
     * (5)
     */
    wdControlSeparator(5),
    
    /**
     * (6)
     */
    wdControlButton(6),
    
    /**
     * (7)
     */
    wdControlLabel(7),
    
    /**
     * (8)
     */
    wdControlImage(8),
    
    /**
     * (9)
     */
    wdControlCheckbox(9),
    
    /**
     * (10)
     */
    wdControlTextbox(10),
    
    /**
     * (11)
     */
    wdControlListbox(11),
    
    /**
     * (12)
     */
    wdControlCombo(12),
    
    /**
     * (13)
     */
    wdControlActiveX(13),
    
    /**
     * (14)
     */
    wdControlDocumentFragment(14),
    
    /**
     * (15)
     */
    wdControlDocumentFragmentURL(15),
    
    /**
     * (16)
     */
    wdControlRadioGroup(16),
    ;

    private WdSmartTagControlType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}