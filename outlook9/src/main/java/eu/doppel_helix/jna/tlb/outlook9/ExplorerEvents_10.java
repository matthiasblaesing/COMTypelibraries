
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006300F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006300F-0000-0000-C000-000000000046}")
public interface ExplorerEvents_10 {
    /**
     * <p>id(0xf001)</p>
     */
    @ComMethod(name = "Activate", dispId = 0xf001)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate();
            
    /**
     * <p>id(0xf002)</p>
     */
    @ComMethod(name = "FolderSwitch", dispId = 0xf002)
    com.sun.jna.platform.win32.WinNT.HRESULT FolderSwitch();
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComMethod(name = "BeforeFolderSwitch", dispId = 0xf003)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeFolderSwitch(com.sun.jna.platform.win32.COM.util.IDispatch NewFolder,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComMethod(name = "ViewSwitch", dispId = 0xf004)
    com.sun.jna.platform.win32.WinNT.HRESULT ViewSwitch();
            
    /**
     * <p>id(0xf005)</p>
     */
    @ComMethod(name = "BeforeViewSwitch", dispId = 0xf005)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeViewSwitch(Object NewView,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComMethod(name = "Deactivate", dispId = 0xf006)
    com.sun.jna.platform.win32.WinNT.HRESULT Deactivate();
            
    /**
     * <p>id(0xf007)</p>
     */
    @ComMethod(name = "SelectionChange", dispId = 0xf007)
    com.sun.jna.platform.win32.WinNT.HRESULT SelectionChange();
            
    /**
     * <p>id(0xf008)</p>
     */
    @ComMethod(name = "Close", dispId = 0xf008)
    com.sun.jna.platform.win32.WinNT.HRESULT Close();
            
    /**
     * <p>id(0xfa11)</p>
     */
    @ComMethod(name = "BeforeMaximize", dispId = 0xfa11)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeMaximize(VARIANT Cancel);
            
    /**
     * <p>id(0xfa12)</p>
     */
    @ComMethod(name = "BeforeMinimize", dispId = 0xfa12)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeMinimize(VARIANT Cancel);
            
    /**
     * <p>id(0xfa13)</p>
     */
    @ComMethod(name = "BeforeMove", dispId = 0xfa13)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeMove(VARIANT Cancel);
            
    /**
     * <p>id(0xfa14)</p>
     */
    @ComMethod(name = "BeforeSize", dispId = 0xfa14)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeSize(VARIANT Cancel);
            
    /**
     * <p>id(0xfa0e)</p>
     */
    @ComMethod(name = "BeforeItemCopy", dispId = 0xfa0e)
    void BeforeItemCopy(VARIANT Cancel);
            
    /**
     * <p>id(0xfa0f)</p>
     */
    @ComMethod(name = "BeforeItemCut", dispId = 0xfa0f)
    void BeforeItemCut(VARIANT Cancel);
            
    /**
     * <p>id(0xfa10)</p>
     */
    @ComMethod(name = "BeforeItemPaste", dispId = 0xfa10)
    void BeforeItemPaste(Object ClipboardContent,
            MAPIFolder Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfc79)</p>
     */
    @ComMethod(name = "AttachmentSelectionChange", dispId = 0xfc79)
    com.sun.jna.platform.win32.WinNT.HRESULT AttachmentSelectionChange();
            
    /**
     * <p>id(0xfc92)</p>
     */
    @ComMethod(name = "InlineResponse", dispId = 0xfc92)
    void InlineResponse(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xfc96)</p>
     */
    @ComMethod(name = "InlineResponseClose", dispId = 0xfc96)
    void InlineResponseClose();
            
    
}