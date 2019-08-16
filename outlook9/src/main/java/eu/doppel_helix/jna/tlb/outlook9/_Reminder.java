
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630B0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630B0-0000-0000-C000-000000000046}")
public interface _Reminder extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xfa9a)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Dismiss", dispId = 0xfa9a)
    void Dismiss();
            
    /**
     * <p>id(0xfa9b)</p>
     * <p>vtableId(12)</p>
     * @param SnoozeTime [in, optional] {@code Object}
     */
    @ComMethod(name = "Snooze", dispId = 0xfa9b)
    void Snooze(Object SnoozeTime);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x0)
    String getCaption();
            
    /**
     * <p>id(0xfa9d)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "IsVisible", dispId = 0xfa9d)
    Boolean getIsVisible();
            
    /**
     * <p>id(0xfa9e)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Item", dispId = 0xfa9e)
    com.sun.jna.platform.win32.COM.util.IDispatch getItem();
            
    /**
     * <p>id(0xfa9f)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "NextReminderDate", dispId = 0xfa9f)
    java.util.Date getNextReminderDate();
            
    /**
     * <p>id(0xfaa0)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "OriginalReminderDate", dispId = 0xfaa0)
    java.util.Date getOriginalReminderDate();
            
    
}