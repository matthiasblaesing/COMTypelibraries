
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006300F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006300F-0000-0000-C000-000000000046}")
public interface ExplorerEvents_10Listener {
    /**
     * <p>id(0xf001)</p>
     */
    @ComEventCallback(dispid = 0xf001)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate();
            
    /**
     * <p>id(0xf002)</p>
     */
    @ComEventCallback(dispid = 0xf002)
    com.sun.jna.platform.win32.WinNT.HRESULT FolderSwitch();
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComEventCallback(dispid = 0xf003)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeFolderSwitch(com.sun.jna.platform.win32.COM.util.IDispatch NewFolder,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComEventCallback(dispid = 0xf004)
    com.sun.jna.platform.win32.WinNT.HRESULT ViewSwitch();
            
    /**
     * <p>id(0xf005)</p>
     */
    @ComEventCallback(dispid = 0xf005)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeViewSwitch(Object NewView,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComEventCallback(dispid = 0xf006)
    com.sun.jna.platform.win32.WinNT.HRESULT Deactivate();
            
    /**
     * <p>id(0xf007)</p>
     */
    @ComEventCallback(dispid = 0xf007)
    com.sun.jna.platform.win32.WinNT.HRESULT SelectionChange();
            
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
     * <p>id(0xfa0e)</p>
     */
    @ComEventCallback(dispid = 0xfa0e)
    void BeforeItemCopy(VARIANT Cancel);
            
    /**
     * <p>id(0xfa0f)</p>
     */
    @ComEventCallback(dispid = 0xfa0f)
    void BeforeItemCut(VARIANT Cancel);
            
    /**
     * <p>id(0xfa10)</p>
     */
    @ComEventCallback(dispid = 0xfa10)
    void BeforeItemPaste(Object ClipboardContent,
            MAPIFolder Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfc79)</p>
     */
    @ComEventCallback(dispid = 0xfc79)
    com.sun.jna.platform.win32.WinNT.HRESULT AttachmentSelectionChange();
            
    /**
     * <p>id(0xfc92)</p>
     */
    @ComEventCallback(dispid = 0xfc92)
    void InlineResponse(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xfc96)</p>
     */
    @ComEventCallback(dispid = 0xfc96)
    void InlineResponseClose();
            
    
}