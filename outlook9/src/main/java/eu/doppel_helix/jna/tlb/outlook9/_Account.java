
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630C5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630C5-0000-0000-C000-000000000046}")
public interface _Account extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xfad2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "AccountType", dispId = 0xfad2)
    OlAccountType getAccountType();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x3001)
    String getDisplayName();
            
    /**
     * <p>id(0xfad3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "UserName", dispId = 0xfad3)
    String getUserName();
            
    /**
     * <p>id(0xfad4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "SmtpAddress", dispId = 0xfad4)
    String getSmtpAddress();
            
    /**
     * <p>id(0xfc6f)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "AutoDiscoverConnectionMode", dispId = 0xfc6f)
    OlAutoDiscoverConnectionMode getAutoDiscoverConnectionMode();
            
    /**
     * <p>id(0xfc6e)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "CurrentUser", dispId = 0xfc6e)
    Recipient getCurrentUser();
            
    /**
     * <p>id(0xfc70)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "AutoDiscoverXml", dispId = 0xfc70)
    String getAutoDiscoverXml();
            
    /**
     * <p>id(0xfc66)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "DeliveryStore", dispId = 0xfc66)
    Store getDeliveryStore();
            
    /**
     * <p>id(0xfc67)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "ExchangeConnectionMode", dispId = 0xfc67)
    OlExchangeConnectionMode getExchangeConnectionMode();
            
    /**
     * <p>id(0xfc68)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "ExchangeMailboxServerName", dispId = 0xfc68)
    String getExchangeMailboxServerName();
            
    /**
     * <p>id(0xfc69)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ExchangeMailboxServerVersion", dispId = 0xfc69)
    String getExchangeMailboxServerVersion();
            
    /**
     * <p>id(0xfc6a)</p>
     * <p>vtableId(22)</p>
     * @param ID [in] {@code String}
     */
    @ComMethod(name = "GetAddressEntryFromID", dispId = 0xfc6a)
    AddressEntry GetAddressEntryFromID(String ID);
            
    /**
     * <p>id(0xfc6b)</p>
     * <p>vtableId(23)</p>
     * @param EntryID [in] {@code String}
     */
    @ComMethod(name = "GetRecipientFromID", dispId = 0xfc6b)
    Recipient GetRecipientFromID(String EntryID);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "IOlkAccount", dispId = 0x64)
    com.sun.jna.platform.win32.COM.util.IUnknown getIOlkAccount();
            
    
}