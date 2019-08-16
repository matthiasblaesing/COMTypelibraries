
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006302A-0000-0000-C000-000000000046})</p>
 */
public abstract class InspectorEvents_10Handler extends AbstractComEventCallbackListener implements InspectorEvents_10 {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xf001)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Activate();
            
    /**
     * <p>id(0xf006)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Deactivate();
            
    /**
     * <p>id(0xf008)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Close();
            
    /**
     * <p>id(0xfa11)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT BeforeMaximize(VARIANT Cancel);
            
    /**
     * <p>id(0xfa12)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT BeforeMinimize(VARIANT Cancel);
            
    /**
     * <p>id(0xfa13)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT BeforeMove(VARIANT Cancel);
            
    /**
     * <p>id(0xfa14)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT BeforeSize(VARIANT Cancel);
            
    /**
     * <p>id(0xfbf4)</p>
     */
    @Override
    public void PageChange(String ActivePageName){
    }
            
    /**
     * <p>id(0xfc79)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT AttachmentSelectionChange();
            
    
}