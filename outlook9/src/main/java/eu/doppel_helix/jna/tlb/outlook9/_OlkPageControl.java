
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672F8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000672F8-0000-0000-C000-000000000046}")
public interface _OlkPageControl extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfbd1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Page", dispId = 0xfbd1)
    OlPageType getPage();
            
    /**
     * <p>id(0xfbd1)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code OlPageType}
     */
    @ComProperty(name = "Page", dispId = 0xfbd1)
    void setPage(OlPageType param0);
            
    
}