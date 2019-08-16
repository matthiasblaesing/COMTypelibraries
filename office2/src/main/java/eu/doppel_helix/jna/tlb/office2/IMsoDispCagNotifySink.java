
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0359-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0359-0000-0000-C000-000000000046}")
public interface IMsoDispCagNotifySink extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param pClipMoniker [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param pItemMoniker [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "InsertClip", dispId = 0x1)
    void InsertClip(com.sun.jna.platform.win32.COM.util.IUnknown pClipMoniker,
            com.sun.jna.platform.win32.COM.util.IUnknown pItemMoniker);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "WindowIsClosing", dispId = 0x2)
    void WindowIsClosing();
            
    
}