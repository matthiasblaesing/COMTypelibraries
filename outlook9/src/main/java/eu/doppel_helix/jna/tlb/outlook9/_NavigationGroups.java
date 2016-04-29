
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630EF-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630EF-0000-0000-C000-000000000046}")
public interface _NavigationGroups {
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
    _NavigationGroup Item(Object Index);
            
    /**
     * <p>id(0xfbbd)</p>
     */
    @ComMethod(name = "Create", dispId = 0xfbbd)
    NavigationGroup Create(String GroupDisplayName);
            
    /**
     * <p>id(0xfbbe)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xfbbe)
    void Delete(NavigationGroup Group);
            
    /**
     * <p>id(0xfbbf)</p>
     */
    @ComMethod(name = "GetDefaultNavigationGroup", dispId = 0xfbbf)
    NavigationGroup GetDefaultNavigationGroup(OlGroupType DefaultFolderGroup);
            
    
}