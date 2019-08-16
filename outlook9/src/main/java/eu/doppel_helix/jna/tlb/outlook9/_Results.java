
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006300C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006300C-0000-0000-C000-000000000046}")
public interface _Results extends IUnknown, IRawDispatchHandle, IDispatch {
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
    com.sun.jna.platform.win32.COM.util.IDispatch Item(Object Index);
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "RawTable", dispId = 0x5a)
    com.sun.jna.platform.win32.COM.util.IUnknown getRawTable();
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "GetFirst", dispId = 0x56)
    com.sun.jna.platform.win32.COM.util.IDispatch GetFirst();
            
    /**
     * <p>id(0x58)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "GetLast", dispId = 0x58)
    com.sun.jna.platform.win32.COM.util.IDispatch GetLast();
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "GetNext", dispId = 0x57)
    com.sun.jna.platform.win32.COM.util.IDispatch GetNext();
            
    /**
     * <p>id(0x59)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "GetPrevious", dispId = 0x59)
    com.sun.jna.platform.win32.COM.util.IDispatch GetPrevious();
            
    /**
     * <p>id(0x5d)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "ResetColumns", dispId = 0x5d)
    void ResetColumns();
            
    /**
     * <p>id(0x5c)</p>
     * <p>vtableId(19)</p>
     * @param Columns [in] {@code String}
     */
    @ComMethod(name = "SetColumns", dispId = 0x5c)
    void SetColumns(String Columns);
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(20)</p>
     * @param Property [in] {@code String}
     * @param Descending [in, optional] {@code Object}
     */
    @ComMethod(name = "Sort", dispId = 0x61)
    void Sort(String Property,
            Object Descending);
            
    /**
     * <p>id(0xfa8f)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "DefaultItemType", dispId = 0xfa8f)
    OlItemType getDefaultItemType();
            
    /**
     * <p>id(0xfa8f)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code OlItemType}
     */
    @ComProperty(name = "DefaultItemType", dispId = 0xfa8f)
    void setDefaultItemType(OlItemType param0);
            
    
}