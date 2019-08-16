
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006304B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006304B-0000-0000-C000-000000000046}")
public interface AddressEntry extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3003)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Address", dispId = 0x3003)
    String getAddress();
            
    /**
     * <p>id(0x3003)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Address", dispId = 0x3003)
    void setAddress(String param0);
            
    /**
     * <p>id(0x3900)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "DisplayType", dispId = 0x3900)
    OlDisplayType getDisplayType();
            
    /**
     * <p>id(0xf01e)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ID", dispId = 0xf01e)
    String getID();
            
    /**
     * <p>id(0x303)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Manager", dispId = 0x303)
    AddressEntry getManager();
            
    /**
     * <p>id(0xf100)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "MAPIOBJECT", dispId = 0xf100)
    com.sun.jna.platform.win32.COM.util.IUnknown getMAPIOBJECT();
            
    /**
     * <p>id(0xf100)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComProperty(name = "MAPIOBJECT", dispId = 0xf100)
    void setMAPIOBJECT(com.sun.jna.platform.win32.COM.util.IUnknown param0);
            
    /**
     * <p>id(0x304)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Members", dispId = 0x304)
    AddressEntries getMembers();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    String getName();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    void setName(String param0);
            
    /**
     * <p>id(0x3002)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3002)
    String getType();
            
    /**
     * <p>id(0x3002)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Type", dispId = 0x3002)
    void setType(String param0);
            
    /**
     * <p>id(0x302)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x302)
    void Delete();
            
    /**
     * <p>id(0x301)</p>
     * <p>vtableId(24)</p>
     * @param HWnd [in, optional] {@code Object}
     */
    @ComMethod(name = "Details", dispId = 0x301)
    void Details(Object HWnd);
            
    /**
     * <p>id(0x306)</p>
     * <p>vtableId(25)</p>
     * @param Start [in] {@code java.util.Date}
     * @param MinPerChar [in] {@code Integer}
     * @param CompleteFormat [in, optional] {@code Object}
     */
    @ComMethod(name = "GetFreeBusy", dispId = 0x306)
    String GetFreeBusy(java.util.Date Start,
            Integer MinPerChar,
            Object CompleteFormat);
            
    /**
     * <p>id(0x300)</p>
     * <p>vtableId(26)</p>
     * @param MakePermanent [in, optional] {@code Object}
     * @param Refresh [in, optional] {@code Object}
     */
    @ComMethod(name = "Update", dispId = 0x300)
    void Update(Object MakePermanent,
            Object Refresh);
            
    /**
     * <p>id(0x307)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "UpdateFreeBusy", dispId = 0x307)
    void UpdateFreeBusy();
            
    /**
     * <p>id(0xfaf0)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "GetContact", dispId = 0xfaf0)
    _ContactItem GetContact();
            
    /**
     * <p>id(0xfaf1)</p>
     * <p>vtableId(29)</p>
     */
    @ComMethod(name = "GetExchangeUser", dispId = 0xfaf1)
    ExchangeUser GetExchangeUser();
            
    /**
     * <p>id(0xfaf2)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "AddressEntryUserType", dispId = 0xfaf2)
    OlAddressEntryUserType getAddressEntryUserType();
            
    /**
     * <p>id(0xfaef)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "GetExchangeDistributionList", dispId = 0xfaef)
    ExchangeDistributionList GetExchangeDistributionList();
            
    /**
     * <p>id(0xfafd)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    
}