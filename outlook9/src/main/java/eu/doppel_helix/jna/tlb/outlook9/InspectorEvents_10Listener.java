
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006302A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006302A-0000-0000-C000-000000000046}")
public interface InspectorEvents_10Listener {
    /**
     * <p>id(0xf001)</p>
     */
    @ComEventCallback(dispid = 0xf001)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate();
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComEventCallback(dispid = 0xf006)
    com.sun.jna.platform.win32.WinNT.HRESULT Deactivate();
            
    /**
     * <p>id(0xf008)</p>
     */
    @ComEventCallback(dispid = 0xf008)
    com.sun.jna.platform.win32.WinNT.HRESULT Close();
            
    /**
     * <p>id(0xfa11)</p>
     */
    @ComEventCallback(dispid = 0xfa11)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeMaximize(VARIANT Cancel);
            
    /**
     * <p>id(0xfa12)</p>
     */
    @ComEventCallback(dispid = 0xfa12)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeMinimize(VARIANT Cancel);
            
    /**
     * <p>id(0xfa13)</p>
     */
    @ComEventCallback(dispid = 0xfa13)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeMove(VARIANT Cancel);
            
    /**
     * <p>id(0xfa14)</p>
     */
    @ComEventCallback(dispid = 0xfa14)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeSize(VARIANT Cancel);
            
    /**
     * <p>id(0xfbf4)</p>
     */
    @ComEventCallback(dispid = 0xfbf4)
    void PageChange(String ActivePageName);
            
    /**
     * <p>id(0xfc79)</p>
     */
    @ComEventCallback(dispid = 0xfc79)
    com.sun.jna.platform.win32.WinNT.HRESULT AttachmentSelectionChange();
            
    
}