
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006304A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006304A-0000-0000-C000-000000000046}")
public interface AddressEntries extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x50)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x50)
    Integer getCount();
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x51)
    AddressEntry Item(Object Index);
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "RawTable", dispId = 0x5a)
    com.sun.jna.platform.win32.COM.util.IUnknown getRawTable();
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(14)</p>
     * @param Type [in] {@code String}
     * @param Name [in, optional] {@code Object}
     * @param Address [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x5f)
    AddressEntry Add(String Type,
            Object Name,
            Object Address);
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "GetFirst", dispId = 0x56)
    AddressEntry GetFirst();
            
    /**
     * <p>id(0x58)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "GetLast", dispId = 0x58)
    AddressEntry GetLast();
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "GetNext", dispId = 0x57)
    AddressEntry GetNext();
            
    /**
     * <p>id(0x59)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "GetPrevious", dispId = 0x59)
    AddressEntry GetPrevious();
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(19)</p>
     * @param Property [in, optional] {@code Object}
     * @param Order [in, optional] {@code Object}
     */
    @ComMethod(name = "Sort", dispId = 0x61)
    void Sort(Object Property,
            Object Order);
            
    
}