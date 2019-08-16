
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244A1-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244A1-0001-0000-C000-000000000046}")
public interface IHeaderFooter extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getText(VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(8)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT setText(String RHS);
            
    /**
     * <p>id(0x1df)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code Graphic}
     */
    @ComProperty(name = "Picture", dispId = 0x1df)
    com.sun.jna.platform.win32.WinNT.HRESULT getPicture(VARIANT RHS);
            
    
}