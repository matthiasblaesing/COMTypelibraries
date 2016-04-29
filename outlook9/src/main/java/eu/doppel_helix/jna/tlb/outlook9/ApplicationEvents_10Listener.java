
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006300E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006300E-0000-0000-C000-000000000046}")
public interface ApplicationEvents_10Listener {
    /**
     * <p>id(0xf002)</p>
     */
    @ComEventCallback(dispid = 0xf002)
    com.sun.jna.platform.win32.WinNT.HRESULT ItemSend(com.sun.jna.platform.win32.COM.util.IDispatch Item,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComEventCallback(dispid = 0xf003)
    com.sun.jna.platform.win32.WinNT.HRESULT NewMail();
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComEventCallback(dispid = 0xf004)
    com.sun.jna.platform.win32.WinNT.HRESULT Reminder(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xf005)</p>
     */
    @ComEventCallback(dispid = 0xf005)
    com.sun.jna.platform.win32.WinNT.HRESULT OptionsPagesAdd(PropertyPages Pages);
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComEventCallback(dispid = 0xf006)
    com.sun.jna.platform.win32.WinNT.HRESULT Startup();
            
    /**
     * <p>id(0xf007)</p>
     */
    @ComEventCallback(dispid = 0xf007)
    com.sun.jna.platform.win32.WinNT.HRESULT Quit();
            
    /**
     * <p>id(0xfa6a)</p>
     */
    @ComEventCallback(dispid = 0xfa6a)
    void AdvancedSearchComplete(Search SearchObject);
            
    /**
     * <p>id(0xfa6b)</p>
     */
    @ComEventCallback(dispid = 0xfa6b)
    void AdvancedSearchStopped(Search SearchObject);
            
    /**
     * <p>id(0xfa90)</p>
     */
    @ComEventCallback(dispid = 0xfa90)
    void MAPILogonComplete();
            
    
}