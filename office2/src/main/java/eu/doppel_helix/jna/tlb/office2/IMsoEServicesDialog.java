
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0372-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0372-0000-0000-C000-000000000046}")
public interface IMsoEServicesDialog {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComMethod(name = "Close", dispId = 0x60020000)
    void Close(Boolean ApplyWebComponentChanges);
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComMethod(name = "AddTrustedDomain", dispId = 0x60020001)
    void AddTrustedDomain(String Domain);
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "ApplicationName", dispId = 0x60020002)
    String getApplicationName();
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020003)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "WebComponent", dispId = 0x60020004)
    com.sun.jna.platform.win32.COM.util.IDispatch getWebComponent();
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComProperty(name = "ClipArt", dispId = 0x60020005)
    com.sun.jna.platform.win32.COM.util.IDispatch getClipArt();
            
    
}