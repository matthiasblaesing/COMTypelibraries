
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630C3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630C3-0000-0000-C000-000000000046}")
public interface Conflict extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xfab8)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Item", dispId = 0xfab8)
    com.sun.jna.platform.win32.COM.util.IDispatch getItem();
            
    /**
     * <p>id(0xfab9)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Name", dispId = 0xfab9)
    String getName();
            
    /**
     * <p>id(0xfabc)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Type", dispId = 0xfabc)
    OlObjectClass getType();
            
    
}