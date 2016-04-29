
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063083-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063083-0000-0000-C000-000000000046}")
public interface _SyncObject {
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
     * <p>id(0x2100)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2100)
    String getName();
            
    /**
     * <p>id(0x2101)</p>
     */
    @ComMethod(name = "Start", dispId = 0x2101)
    void Start();
            
    /**
     * <p>id(0x2102)</p>
     */
    @ComMethod(name = "Stop", dispId = 0x2102)
    void Stop();
            
    
}