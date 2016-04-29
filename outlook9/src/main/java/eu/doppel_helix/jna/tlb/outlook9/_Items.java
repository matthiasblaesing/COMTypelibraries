
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063041-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063041-0000-0000-C000-000000000046}")
public interface _Items {
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
     * <p>id(0x50)</p>
     */
    @ComProperty(name = "Count", dispId = 0x50)
    Integer getCount();
            
    /**
     * <p>id(0x51)</p>
     */
    @ComMethod(name = "Item", dispId = 0x51)
    com.sun.jna.platform.win32.COM.util.IDispatch Item(Object Index);
            
    /**
     * <p>id(0x5a)</p>
     */
    @ComProperty(name = "RawTable", dispId = 0x5a)
    com.sun.jna.platform.win32.COM.util.IUnknown getRawTable();
            
    /**
     * <p>id(0xce)</p>
     */
    @ComProperty(name = "IncludeRecurrences", dispId = 0xce)
    Boolean getIncludeRecurrences();
            
    /**
     * <p>id(0xce)</p>
     */
    @ComProperty(name = "IncludeRecurrences", dispId = 0xce)
    void setIncludeRecurrences(Boolean param0);
            
    /**
     * <p>id(0x5f)</p>
     */
    @ComMethod(name = "Add", dispId = 0x5f)
    com.sun.jna.platform.win32.COM.util.IDispatch Add(Object Type);
            
    /**
     * <p>id(0x62)</p>
     */
    @ComMethod(name = "Find", dispId = 0x62)
    com.sun.jna.platform.win32.COM.util.IDispatch Find(String Filter);
            
    /**
     * <p>id(0x63)</p>
     */
    @ComMethod(name = "FindNext", dispId = 0x63)
    com.sun.jna.platform.win32.COM.util.IDispatch FindNext();
            
    /**
     * <p>id(0x56)</p>
     */
    @ComMethod(name = "GetFirst", dispId = 0x56)
    com.sun.jna.platform.win32.COM.util.IDispatch GetFirst();
            
    /**
     * <p>id(0x58)</p>
     */
    @ComMethod(name = "GetLast", dispId = 0x58)
    com.sun.jna.platform.win32.COM.util.IDispatch GetLast();
            
    /**
     * <p>id(0x57)</p>
     */
    @ComMethod(name = "GetNext", dispId = 0x57)
    com.sun.jna.platform.win32.COM.util.IDispatch GetNext();
            
    /**
     * <p>id(0x59)</p>
     */
    @ComMethod(name = "GetPrevious", dispId = 0x59)
    com.sun.jna.platform.win32.COM.util.IDispatch GetPrevious();
            
    /**
     * <p>id(0x54)</p>
     */
    @ComMethod(name = "Remove", dispId = 0x54)
    void Remove(Integer Index);
            
    /**
     * <p>id(0x5d)</p>
     */
    @ComMethod(name = "ResetColumns", dispId = 0x5d)
    void ResetColumns();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Restrict", dispId = 0x64)
    _Items Restrict(String Filter);
            
    /**
     * <p>id(0x5c)</p>
     */
    @ComMethod(name = "SetColumns", dispId = 0x5c)
    void SetColumns(String Columns);
            
    /**
     * <p>id(0x61)</p>
     */
    @ComMethod(name = "Sort", dispId = 0x61)
    void Sort(String Property,
            Object Descending);
            
    
}