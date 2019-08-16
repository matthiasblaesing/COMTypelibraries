
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CD101-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CD101-0000-0000-C000-000000000046}")
public interface WebComponentWindowExternal extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "InterfaceVersion", dispId = 0x1)
    Integer getInterfaceVersion();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "ApplicationName", dispId = 0x2)
    String getApplicationName();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "ApplicationVersion", dispId = 0x3)
    Integer getApplicationVersion();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Application", dispId = 0x4)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "CloseWindow", dispId = 0x5)
    void CloseWindow();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "WebComponent", dispId = 0x6)
    WebComponent getWebComponent();
            
    
}