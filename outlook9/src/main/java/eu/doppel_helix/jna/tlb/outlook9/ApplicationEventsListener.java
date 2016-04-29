
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006304E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006304E-0000-0000-C000-000000000046}")
public interface ApplicationEventsListener {
    /**
     * <p>id(0xf002)</p>
     */
    @ComEventCallback(dispid = 0xf002)
    void ItemSend(com.sun.jna.platform.win32.COM.util.IDispatch Item,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComEventCallback(dispid = 0xf003)
    void NewMail();
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComEventCallback(dispid = 0xf004)
    void Reminder(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xf005)</p>
     */
    @ComEventCallback(dispid = 0xf005)
    void OptionsPagesAdd(PropertyPages Pages);
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComEventCallback(dispid = 0xf006)
    void Startup();
            
    /**
     * <p>id(0xf007)</p>
     */
    @ComEventCallback(dispid = 0xf007)
    void Quit();
            
    
}