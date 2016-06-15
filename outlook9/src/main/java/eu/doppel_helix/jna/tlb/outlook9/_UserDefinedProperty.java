
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006305C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006305C-0000-0000-C000-000000000046}")
public interface _UserDefinedProperty extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x67)
    String getFormula();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "Name", dispId = 0x70)
    String getName();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6d)
    OlUserPropertyType getType();
            
    /**
     * <p>id(0xfa27)</p>
     */
    @ComProperty(name = "DisplayFormat", dispId = 0xfa27)
    Integer getDisplayFormat();
            
    /**
     * <p>id(0xfc0b)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xfc0b)
    void Delete();
            
    
}