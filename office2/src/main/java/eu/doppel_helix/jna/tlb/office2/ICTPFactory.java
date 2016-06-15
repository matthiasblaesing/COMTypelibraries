
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C033D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C033D-0000-0000-C000-000000000046}")
public interface ICTPFactory extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "CreateCTP", dispId = 0x1)
    _CustomTaskPane CreateCTP(String CTPAxID,
            String CTPTitle,
            Object CTPParentWindow);
            
    
}