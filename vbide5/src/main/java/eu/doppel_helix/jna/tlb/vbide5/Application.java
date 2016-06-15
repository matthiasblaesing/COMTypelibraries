
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E158-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E158-0000-0000-C000-000000000046}")
public interface Application extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Version", dispId = 0x64)
    String getVersion();
            
    
}