
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006304A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006304A-0000-0000-C000-000000000046}")
public interface AddressEntries {
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
    AddressEntry Item(Object Index);
            
    /**
     * <p>id(0x5a)</p>
     */
    @ComProperty(name = "RawTable", dispId = 0x5a)
    com.sun.jna.platform.win32.COM.util.IUnknown getRawTable();
            
    /**
     * <p>id(0x5f)</p>
     */
    @ComMethod(name = "Add", dispId = 0x5f)
    AddressEntry Add(String Type,
            Object Name,
            Object Address);
            
    /**
     * <p>id(0x56)</p>
     */
    @ComMethod(name = "GetFirst", dispId = 0x56)
    AddressEntry GetFirst();
            
    /**
     * <p>id(0x58)</p>
     */
    @ComMethod(name = "GetLast", dispId = 0x58)
    AddressEntry GetLast();
            
    /**
     * <p>id(0x57)</p>
     */
    @ComMethod(name = "GetNext", dispId = 0x57)
    AddressEntry GetNext();
            
    /**
     * <p>id(0x59)</p>
     */
    @ComMethod(name = "GetPrevious", dispId = 0x59)
    AddressEntry GetPrevious();
            
    /**
     * <p>id(0x61)</p>
     */
    @ComMethod(name = "Sort", dispId = 0x61)
    void Sort(Object Property,
            Object Order);
            
    
}