
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlFormControl implements IComEnum {
    
    /**
     * (0)
     */
    xlButtonControl(0),
    
    /**
     * (1)
     */
    xlCheckBox(1),
    
    /**
     * (2)
     */
    xlDropDown(2),
    
    /**
     * (3)
     */
    xlEditBox(3),
    
    /**
     * (4)
     */
    xlGroupBox(4),
    
    /**
     * (5)
     */
    xlLabel(5),
    
    /**
     * (6)
     */
    xlListBox(6),
    
    /**
     * (7)
     */
    xlOptionButton(7),
    
    /**
     * (8)
     */
    xlScrollBar(8),
    
    /**
     * (9)
     */
    xlSpinner(9),
    ;

    private XlFormControl(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}