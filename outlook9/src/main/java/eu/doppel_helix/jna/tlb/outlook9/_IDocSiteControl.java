
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({43507DD0-811D-11CE-B565-00AA00608FAA})</p>
 */
@ComInterface(iid="{43507DD0-811D-11CE-B565-00AA00608FAA}")
public interface _IDocSiteControl extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x8001f008)</p>
     * <p>vtableId(7)</p>
     * @param ReadOnly [out] {@code Byte}
     */
    @ComProperty(name = "ReadOnly", dispId = 0x8001f008)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadOnly(VARIANT ReadOnly);
            
    /**
     * <p>id(0x8001f008)</p>
     * <p>vtableId(8)</p>
     * @param ReadOnly [in] {@code Byte}
     */
    @ComProperty(name = "ReadOnly", dispId = 0x8001f008)
    com.sun.jna.platform.win32.WinNT.HRESULT setReadOnly(Byte ReadOnly);
            
    /**
     * <p>id(0xfbe3)</p>
     * <p>vtableId(9)</p>
     * @param SuppressAttachments [out] {@code Byte}
     */
    @ComProperty(name = "SuppressAttachments", dispId = 0xfbe3)
    com.sun.jna.platform.win32.WinNT.HRESULT getSuppressAttachments(VARIANT SuppressAttachments);
            
    /**
     * <p>id(0xfbe3)</p>
     * <p>vtableId(10)</p>
     * @param SuppressAttachments [in] {@code Byte}
     */
    @ComProperty(name = "SuppressAttachments", dispId = 0xfbe3)
    com.sun.jna.platform.win32.WinNT.HRESULT setSuppressAttachments(Byte SuppressAttachments);
            
    
}