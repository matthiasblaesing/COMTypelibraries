
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006304E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006304E-0000-0000-C000-000000000046}")
public interface ApplicationEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf002)</p>
     */
    @ComMethod(name = "ItemSend", dispId = 0xf002)
    void ItemSend(com.sun.jna.platform.win32.COM.util.IDispatch Item,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComMethod(name = "NewMail", dispId = 0xf003)
    void NewMail();
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComMethod(name = "Reminder", dispId = 0xf004)
    void Reminder(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xf005)</p>
     */
    @ComMethod(name = "OptionsPagesAdd", dispId = 0xf005)
    void OptionsPagesAdd(PropertyPages Pages);
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComMethod(name = "Startup", dispId = 0xf006)
    void Startup();
            
    /**
     * <p>id(0xf007)</p>
     */
    @ComMethod(name = "Quit", dispId = 0xf007)
    void Quit();
            
    
}