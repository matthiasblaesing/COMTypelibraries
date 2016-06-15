
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630E6-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630E6-0000-0000-C000-000000000046}")
public interface _NavigationPane extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xfbb4)</p>
     */
    @ComProperty(name = "IsCollapsed", dispId = 0xfbb4)
    Boolean getIsCollapsed();
            
    /**
     * <p>id(0xfbb4)</p>
     */
    @ComProperty(name = "IsCollapsed", dispId = 0xfbb4)
    void setIsCollapsed(Boolean param0);
            
    /**
     * <p>id(0xfbb5)</p>
     */
    @ComProperty(name = "CurrentModule", dispId = 0xfbb5)
    NavigationModule getCurrentModule();
            
    /**
     * <p>id(0xfbb5)</p>
     */
    @ComProperty(name = "CurrentModule", dispId = 0xfbb5)
    void setCurrentModule(NavigationModule param0);
            
    /**
     * <p>id(0xfbb6)</p>
     */
    @ComProperty(name = "DisplayedModuleCount", dispId = 0xfbb6)
    Integer getDisplayedModuleCount();
            
    /**
     * <p>id(0xfbb6)</p>
     */
    @ComProperty(name = "DisplayedModuleCount", dispId = 0xfbb6)
    void setDisplayedModuleCount(Integer param0);
            
    /**
     * <p>id(0xfbb7)</p>
     */
    @ComProperty(name = "Modules", dispId = 0xfbb7)
    NavigationModules getModules();
            
    
}