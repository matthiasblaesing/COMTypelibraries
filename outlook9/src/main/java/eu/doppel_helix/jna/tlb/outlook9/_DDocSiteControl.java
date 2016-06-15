
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006F026-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006F026-0000-0000-C000-000000000046}")
public interface _DDocSiteControl extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x8001f008)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x8001f008)
    Byte getReadOnly();
            
    /**
     * <p>id(0x8001f008)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x8001f008)
    void setReadOnly(Byte param0);
            
    /**
     * <p>id(0xfbe3)</p>
     */
    @ComProperty(name = "SuppressAttachments", dispId = 0xfbe3)
    Byte getSuppressAttachments();
            
    /**
     * <p>id(0xfbe3)</p>
     */
    @ComProperty(name = "SuppressAttachments", dispId = 0xfbe3)
    void setSuppressAttachments(Byte param0);
            
    
}