
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006307E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006307E-0000-0000-C000-000000000046}")
public interface PropertyPage extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2100)</p>
     * <p>vtableId(7)</p>
     * @param HelpFile [inout] {@code String}
     * @param HelpContext [inout] {@code Integer}
     */
    @ComMethod(name = "GetPageInfo", dispId = 0x2100)
    com.sun.jna.platform.win32.WinNT.HRESULT GetPageInfo(VARIANT HelpFile,
            VARIANT HelpContext);
            
    /**
     * <p>id(0x2101)</p>
     * <p>vtableId(8)</p>
     * @param Dirty [out] {@code Boolean}
     */
    @ComProperty(name = "Dirty", dispId = 0x2101)
    com.sun.jna.platform.win32.WinNT.HRESULT getDirty(VARIANT Dirty);
            
    /**
     * <p>id(0x2102)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "Apply", dispId = 0x2102)
    com.sun.jna.platform.win32.WinNT.HRESULT Apply();
            
    
}