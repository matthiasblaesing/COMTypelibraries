
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C4B07795-AE88-400C-AF72-6F7F75A3EC0B})</p>
 */
public enum MsoPickerField implements IComEnum {
    
    /**
     * (0)
     */
    msoPickerFieldUnknown(0),
    
    /**
     * (1)
     */
    msoPickerFieldDateTime(1),
    
    /**
     * (2)
     */
    msoPickerFieldNumber(2),
    
    /**
     * (3)
     */
    msoPickerFieldText(3),
    
    /**
     * (4)
     */
    msoPickerFieldUser(4),
    
    /**
     * (5)
     */
    msoPickerFieldMax(5),
    ;

    private MsoPickerField(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}