
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({BA5537F4-8941-4E26-871E-0D53D647B9FC})</p>
 */
public enum OlAppointmentTimeField implements IComEnum {
    
    /**
     * None (1)
     */
    olAppointmentTimeFieldNone(1),
    
    /**
     * Start (2)
     */
    olAppointmentTimeFieldStart(2),
    
    /**
     * End (3)
     */
    olAppointmentTimeFieldEnd(3),
    ;

    private OlAppointmentTimeField(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}