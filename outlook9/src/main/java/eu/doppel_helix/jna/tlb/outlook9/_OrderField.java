
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006309B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006309B-0000-0000-C000-000000000046}")
public interface _OrderField extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2102)</p>
     */
    @ComProperty(name = "ViewXMLSchemaName", dispId = 0x2102)
    String getViewXMLSchemaName();
            
    /**
     * <p>id(0xfb8a)</p>
     */
    @ComProperty(name = "IsDescending", dispId = 0xfb8a)
    Boolean getIsDescending();
            
    /**
     * <p>id(0xfb8a)</p>
     */
    @ComProperty(name = "IsDescending", dispId = 0xfb8a)
    void setIsDescending(Boolean param0);
            
    
}