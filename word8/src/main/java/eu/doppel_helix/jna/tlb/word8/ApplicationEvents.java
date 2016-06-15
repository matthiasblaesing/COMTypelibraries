
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209F7-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209F7-0000-0000-C000-000000000046}")
public interface ApplicationEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "Startup", dispId = 0x1)
    void Startup();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Quit", dispId = 0x2)
    void Quit();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "DocumentChange", dispId = 0x3)
    void DocumentChange();
            
    
}