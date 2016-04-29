
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630F0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630F0-0000-0000-C000-000000000046}")
public interface _NavigationGroup {
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
     * <p>id(0xfbc0)</p>
     */
    @ComProperty(name = "GroupType", dispId = 0xfbc0)
    OlGroupType getGroupType();
            
    /**
     * <p>id(0xfbc1)</p>
     */
    @ComProperty(name = "NavigationFolders", dispId = 0xfbc1)
    NavigationFolders getNavigationFolders();
            
    /**
     * <p>id(0x2102)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2102)
    String getName();
            
    /**
     * <p>id(0x2102)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2102)
    void setName(String param0);
            
    /**
     * <p>id(0xfbc7)</p>
     */
    @ComProperty(name = "Position", dispId = 0xfbc7)
    Integer getPosition();
            
    /**
     * <p>id(0xfbc7)</p>
     */
    @ComProperty(name = "Position", dispId = 0xfbc7)
    void setPosition(Integer param0);
            
    
}