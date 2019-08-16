
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006302A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006302A-0000-0000-C000-000000000046}")
public interface InspectorEvents_10 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf001)</p>
     */
    @ComMethod(name = "Activate", dispId = 0xf001)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate();
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComMethod(name = "Deactivate", dispId = 0xf006)
    com.sun.jna.platform.win32.WinNT.HRESULT Deactivate();
            
    /**
     * <p>id(0xf008)</p>
     */
    @ComMethod(name = "Close", dispId = 0xf008)
    com.sun.jna.platform.win32.WinNT.HRESULT Close();
            
    /**
     * <p>id(0xfa11)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeMaximize", dispId = 0xfa11)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeMaximize(VARIANT Cancel);
            
    /**
     * <p>id(0xfa12)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeMinimize", dispId = 0xfa12)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeMinimize(VARIANT Cancel);
            
    /**
     * <p>id(0xfa13)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeMove", dispId = 0xfa13)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeMove(VARIANT Cancel);
            
    /**
     * <p>id(0xfa14)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeSize", dispId = 0xfa14)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeSize(VARIANT Cancel);
            
    /**
     * <p>id(0xfbf4)</p>
     * @param ActivePageName [in] {@code String}
     */
    @ComMethod(name = "PageChange", dispId = 0xfbf4)
    void PageChange(String ActivePageName);
            
    /**
     * <p>id(0xfc79)</p>
     */
    @ComMethod(name = "AttachmentSelectionChange", dispId = 0xfc79)
    com.sun.jna.platform.win32.WinNT.HRESULT AttachmentSelectionChange();
            
    
}