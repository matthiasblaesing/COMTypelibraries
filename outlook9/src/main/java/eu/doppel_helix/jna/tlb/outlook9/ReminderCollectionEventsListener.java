
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630B2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630B2-0000-0000-C000-000000000046}")
public interface ReminderCollectionEventsListener {
    /**
     * <p>id(0xfa93)</p>
     */
    @ComEventCallback(dispid = 0xfa93)
    void BeforeReminderShow(VARIANT Cancel);
            
    /**
     * <p>id(0xfa94)</p>
     */
    @ComEventCallback(dispid = 0xfa94)
    void ReminderAdd(_Reminder ReminderObject);
            
    /**
     * <p>id(0xfa95)</p>
     */
    @ComEventCallback(dispid = 0xfa95)
    void ReminderChange(_Reminder ReminderObject);
            
    /**
     * <p>id(0xfa96)</p>
     */
    @ComEventCallback(dispid = 0xfa96)
    void ReminderFire(_Reminder ReminderObject);
            
    /**
     * <p>id(0xfa97)</p>
     */
    @ComEventCallback(dispid = 0xfa97)
    void ReminderRemove();
            
    /**
     * <p>id(0xfa98)</p>
     */
    @ComEventCallback(dispid = 0xfa98)
    void Snooze(_Reminder ReminderObject);
            
    
}