
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoControlType implements IComEnum {
    
    /**
     * (0)
     */
    msoControlCustom(0),
    
    /**
     * (1)
     */
    msoControlButton(1),
    
    /**
     * (2)
     */
    msoControlEdit(2),
    
    /**
     * (3)
     */
    msoControlDropdown(3),
    
    /**
     * (4)
     */
    msoControlComboBox(4),
    
    /**
     * (5)
     */
    msoControlButtonDropdown(5),
    
    /**
     * (6)
     */
    msoControlSplitDropdown(6),
    
    /**
     * (7)
     */
    msoControlOCXDropdown(7),
    
    /**
     * (8)
     */
    msoControlGenericDropdown(8),
    
    /**
     * (9)
     */
    msoControlGraphicDropdown(9),
    
    /**
     * (10)
     */
    msoControlPopup(10),
    
    /**
     * (11)
     */
    msoControlGraphicPopup(11),
    
    /**
     * (12)
     */
    msoControlButtonPopup(12),
    
    /**
     * (13)
     */
    msoControlSplitButtonPopup(13),
    
    /**
     * (14)
     */
    msoControlSplitButtonMRUPopup(14),
    
    /**
     * (15)
     */
    msoControlLabel(15),
    
    /**
     * (16)
     */
    msoControlExpandingGrid(16),
    
    /**
     * (17)
     */
    msoControlSplitExpandingGrid(17),
    
    /**
     * (18)
     */
    msoControlGrid(18),
    
    /**
     * (19)
     */
    msoControlGauge(19),
    
    /**
     * (20)
     */
    msoControlGraphicCombo(20),
    
    /**
     * (21)
     */
    msoControlPane(21),
    
    /**
     * (22)
     */
    msoControlActiveX(22),
    
    /**
     * (23)
     */
    msoControlSpinner(23),
    
    /**
     * (24)
     */
    msoControlLabelEx(24),
    
    /**
     * (25)
     */
    msoControlWorkPane(25),
    
    /**
     * (26)
     */
    msoControlAutoCompleteCombo(26),
    ;

    private MsoControlType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}