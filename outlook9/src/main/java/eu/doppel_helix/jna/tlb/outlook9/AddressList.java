
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063049-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063049-0000-0000-C000-000000000046}")
public interface AddressList extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x100)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "AddressEntries", dispId = 0x100)
    AddressEntries getAddressEntries();
            
    /**
     * <p>id(0xf01e)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ID", dispId = 0xf01e)
    String getID();
            
    /**
     * <p>id(0x5b)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Index", dispId = 0x5b)
    Integer getIndex();
            
    /**
     * <p>id(0xf017)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "IsReadOnly", dispId = 0xf017)
    Boolean getIsReadOnly();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    String getName();
            
    /**
     * <p>id(0xfafa)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "GetContactsFolder", dispId = 0xfafa)
    MAPIFolder GetContactsFolder();
            
    /**
     * <p>id(0xfaed)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "AddressListType", dispId = 0xfaed)
    OlAddressListType getAddressListType();
            
    /**
     * <p>id(0xfaee)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ResolutionOrder", dispId = 0xfaee)
    Integer getResolutionOrder();
            
    /**
     * <p>id(0xfaf8)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "IsInitialAddressList", dispId = 0xfaf8)
    Boolean getIsInitialAddressList();
            
    /**
     * <p>id(0xfafd)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    
}