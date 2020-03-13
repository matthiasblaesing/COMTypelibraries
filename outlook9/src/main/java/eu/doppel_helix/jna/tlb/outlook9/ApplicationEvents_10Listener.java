
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
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
    @ComMethod(name = "ItemSend", dispId = 0xf002)
    com.sun.jna.platform.win32.WinNT.HRESULT ItemSend(com.sun.jna.platform.win32.COM.util.IDispatch Item,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComMethod(name = "NewMail", dispId = 0xf003)
    com.sun.jna.platform.win32.WinNT.HRESULT NewMail();
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComMethod(name = "Reminder", dispId = 0xf004)
    com.sun.jna.platform.win32.WinNT.HRESULT Reminder(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xf005)</p>
     */
    @ComMethod(name = "OptionsPagesAdd", dispId = 0xf005)
    com.sun.jna.platform.win32.WinNT.HRESULT OptionsPagesAdd(PropertyPages Pages);
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComMethod(name = "Startup", dispId = 0xf006)
    com.sun.jna.platform.win32.WinNT.HRESULT Startup();
            
    /**
     * <p>id(0xf007)</p>
     */
    @ComMethod(name = "Quit", dispId = 0xf007)
    com.sun.jna.platform.win32.WinNT.HRESULT Quit();
            
    /**
     * <p>id(0xfa6a)</p>
     */
    @ComMethod(name = "AdvancedSearchComplete", dispId = 0xfa6a)
    void AdvancedSearchComplete(Search SearchObject);
            
    /**
     * <p>id(0xfa6b)</p>
     */
    @ComMethod(name = "AdvancedSearchStopped", dispId = 0xfa6b)
    void AdvancedSearchStopped(Search SearchObject);
            
    /**
     * <p>id(0xfa90)</p>
     */
    @ComMethod(name = "MAPILogonComplete", dispId = 0xfa90)
    void MAPILogonComplete();
            
    
}