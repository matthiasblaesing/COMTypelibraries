
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630B2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630B2-0000-0000-C000-000000000046}")
public interface ReminderCollectionEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfa93)</p>
     */
    @ComMethod(name = "BeforeReminderShow", dispId = 0xfa93)
    void BeforeReminderShow(VARIANT Cancel);
            
    /**
     * <p>id(0xfa94)</p>
     */
    @ComMethod(name = "ReminderAdd", dispId = 0xfa94)
    void ReminderAdd(_Reminder ReminderObject);
            
    /**
     * <p>id(0xfa95)</p>
     */
    @ComMethod(name = "ReminderChange", dispId = 0xfa95)
    void ReminderChange(_Reminder ReminderObject);
            
    /**
     * <p>id(0xfa96)</p>
     */
    @ComMethod(name = "ReminderFire", dispId = 0xfa96)
    void ReminderFire(_Reminder ReminderObject);
            
    /**
     * <p>id(0xfa97)</p>
     */
    @ComMethod(name = "ReminderRemove", dispId = 0xfa97)
    void ReminderRemove();
            
    /**
     * <p>id(0xfa98)</p>
     */
    @ComMethod(name = "Snooze", dispId = 0xfa98)
    void Snooze(_Reminder ReminderObject);
            
    
}