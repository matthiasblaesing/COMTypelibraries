
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlAppointmentCopyOptions implements IComEnum {
    
    /**
     * (0)
     */
    olPromptUser(0),
    
    /**
     * (1)
     */
    olCreateAppointment(1),
    
    /**
     * (2)
     */
    olCopyAsAccept(2),
    ;

    private OlAppointmentCopyOptions(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}