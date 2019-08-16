
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630E9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630E9-0000-0000-C000-000000000046}")
public interface _MailModule extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xfbb9)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "NavigationModuleType", dispId = 0xfbb9)
    OlNavigationModuleType getNavigationModuleType();
            
    /**
     * <p>id(0x2102)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2102)
    String getName();
            
    /**
     * <p>id(0xfbba)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Position", dispId = 0xfbba)
    Integer getPosition();
            
    /**
     * <p>id(0xfbba)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Position", dispId = 0xfbba)
    void setPosition(Integer param0);
            
    /**
     * <p>id(0xfbbb)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Visible", dispId = 0xfbbb)
    Boolean getVisible();
            
    /**
     * <p>id(0xfbbb)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0xfbbb)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0xfbbc)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "NavigationGroups", dispId = 0xfbbc)
    _NavigationGroups getNavigationGroups();
            
    
}