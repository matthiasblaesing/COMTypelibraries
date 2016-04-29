
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630EB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630EB-0000-0000-C000-000000000046}")
public interface _ContactsModule {
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
     * <p>id(0xfbb9)</p>
     */
    @ComProperty(name = "NavigationModuleType", dispId = 0xfbb9)
    OlNavigationModuleType getNavigationModuleType();
            
    /**
     * <p>id(0x2102)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2102)
    String getName();
            
    /**
     * <p>id(0xfbba)</p>
     */
    @ComProperty(name = "Position", dispId = 0xfbba)
    Integer getPosition();
            
    /**
     * <p>id(0xfbba)</p>
     */
    @ComProperty(name = "Position", dispId = 0xfbba)
    void setPosition(Integer param0);
            
    /**
     * <p>id(0xfbbb)</p>
     */
    @ComProperty(name = "Visible", dispId = 0xfbbb)
    Boolean getVisible();
            
    /**
     * <p>id(0xfbbb)</p>
     */
    @ComProperty(name = "Visible", dispId = 0xfbbb)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0xfbbc)</p>
     */
    @ComProperty(name = "NavigationGroups", dispId = 0xfbbc)
    _NavigationGroups getNavigationGroups();
            
    
}