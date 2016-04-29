
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630C5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630C5-0000-0000-C000-000000000046}")
public interface _Account {
    /**
     * <p>id(0xf000)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xfad2)</p>
     */
    @ComProperty(name = "AccountType", dispId = 0xfad2)
    OlAccountType getAccountType();
            
    /**
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x3001)
    String getDisplayName();
            
    /**
     * <p>id(0xfad3)</p>
     */
    @ComProperty(name = "UserName", dispId = 0xfad3)
    String getUserName();
            
    /**
     * <p>id(0xfad4)</p>
     */
    @ComProperty(name = "SmtpAddress", dispId = 0xfad4)
    String getSmtpAddress();
            
    /**
     * <p>id(0xfc6f)</p>
     */
    @ComProperty(name = "AutoDiscoverConnectionMode", dispId = 0xfc6f)
    OlAutoDiscoverConnectionMode getAutoDiscoverConnectionMode();
            
    /**
     * <p>id(0xfc6e)</p>
     */
    @ComProperty(name = "CurrentUser", dispId = 0xfc6e)
    Recipient getCurrentUser();
            
    /**
     * <p>id(0xfc70)</p>
     */
    @ComProperty(name = "AutoDiscoverXml", dispId = 0xfc70)
    String getAutoDiscoverXml();
            
    /**
     * <p>id(0xfc66)</p>
     */
    @ComProperty(name = "DeliveryStore", dispId = 0xfc66)
    Store getDeliveryStore();
            
    /**
     * <p>id(0xfc67)</p>
     */
    @ComProperty(name = "ExchangeConnectionMode", dispId = 0xfc67)
    OlExchangeConnectionMode getExchangeConnectionMode();
            
    /**
     * <p>id(0xfc68)</p>
     */
    @ComProperty(name = "ExchangeMailboxServerName", dispId = 0xfc68)
    String getExchangeMailboxServerName();
            
    /**
     * <p>id(0xfc69)</p>
     */
    @ComProperty(name = "ExchangeMailboxServerVersion", dispId = 0xfc69)
    String getExchangeMailboxServerVersion();
            
    /**
     * <p>id(0xfc6a)</p>
     */
    @ComMethod(name = "GetAddressEntryFromID", dispId = 0xfc6a)
    AddressEntry GetAddressEntryFromID(String ID);
            
    /**
     * <p>id(0xfc6b)</p>
     */
    @ComMethod(name = "GetRecipientFromID", dispId = 0xfc6b)
    Recipient GetRecipientFromID(String EntryID);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "IOlkAccount", dispId = 0x64)
    com.sun.jna.platform.win32.COM.util.IUnknown getIOlkAccount();
            
    
}