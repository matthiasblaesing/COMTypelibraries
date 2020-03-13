
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006300F-0000-0000-C000-000000000046})</p>
 */
public abstract class ExplorerEvents_10ListenerHandler extends AbstractComEventCallbackListener implements ExplorerEvents_10Listener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xf001)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Activate();
            
    /**
     * <p>id(0xf002)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT FolderSwitch();
            
    /**
     * <p>id(0xf003)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT BeforeFolderSwitch(com.sun.jna.platform.win32.COM.util.IDispatch NewFolder,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf004)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT ViewSwitch();
            
    /**
     * <p>id(0xf005)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT BeforeViewSwitch(Object NewView,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf006)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Deactivate();
            
    /**
     * <p>id(0xf007)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT SelectionChange();
            
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
     * <p>id(0xfa0e)</p>
     */
    @Override
    public void BeforeItemCopy(VARIANT Cancel){
    }
            
    /**
     * <p>id(0xfa0f)</p>
     */
    @Override
    public void BeforeItemCut(VARIANT Cancel){
    }
            
    /**
     * <p>id(0xfa10)</p>
     */
    @Override
    public void BeforeItemPaste(Object ClipboardContent,
            MAPIFolder Target,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xfc79)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT AttachmentSelectionChange();
            
    /**
     * <p>id(0xfc92)</p>
     */
    @Override
    public void InlineResponse(com.sun.jna.platform.win32.COM.util.IDispatch Item){
    }
            
    /**
     * <p>id(0xfc96)</p>
     */
    @Override
    public void InlineResponseClose(){
    }
            
    
}