
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006302C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006302C-0000-0000-C000-000000000046}")
public interface ApplicationEvents_11 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf002)</p>
     */
    @ComMethod(name = "ItemSend", dispId = 0xf002)
    com.sun.jna.platform.win32.WinNT.HRESULT ItemSend(com.sun.jna.platform.win32.COM.util.IDispatch Item,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComMethod(name = "NewMail", dispId = 0xf003)
    com.sun.jna.platform.win32.WinNT.HRESULT NewMail();
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComMethod(name = "Reminder", dispId = 0xf004)
    com.sun.jna.platform.win32.WinNT.HRESULT Reminder(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xf005)</p>
     */
    @ComMethod(name = "OptionsPagesAdd", dispId = 0xf005)
    com.sun.jna.platform.win32.WinNT.HRESULT OptionsPagesAdd(PropertyPages Pages);
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComMethod(name = "Startup", dispId = 0xf006)
    com.sun.jna.platform.win32.WinNT.HRESULT Startup();
            
    /**
     * <p>id(0xf007)</p>
     */
    @ComMethod(name = "Quit", dispId = 0xf007)
    com.sun.jna.platform.win32.WinNT.HRESULT Quit();
            
    /**
     * <p>id(0xfa6a)</p>
     */
    @ComMethod(name = "AdvancedSearchComplete", dispId = 0xfa6a)
    com.sun.jna.platform.win32.WinNT.HRESULT AdvancedSearchComplete(Search SearchObject);
            
    /**
     * <p>id(0xfa6b)</p>
     */
    @ComMethod(name = "AdvancedSearchStopped", dispId = 0xfa6b)
    com.sun.jna.platform.win32.WinNT.HRESULT AdvancedSearchStopped(Search SearchObject);
            
    /**
     * <p>id(0xfa90)</p>
     */
    @ComMethod(name = "MAPILogonComplete", dispId = 0xfa90)
    com.sun.jna.platform.win32.WinNT.HRESULT MAPILogonComplete();
            
    /**
     * <p>id(0xfab5)</p>
     */
    @ComMethod(name = "NewMailEx", dispId = 0xfab5)
    void NewMailEx(String EntryIDCollection);
            
    /**
     * <p>id(0xfb3e)</p>
     */
    @ComMethod(name = "AttachmentContextMenuDisplay", dispId = 0xfb3e)
    com.sun.jna.platform.win32.WinNT.HRESULT AttachmentContextMenuDisplay(eu.doppel_helix.jna.tlb.office2.CommandBar CommandBar,
            AttachmentSelection Attachments);
            
    /**
     * <p>id(0xfb42)</p>
     */
    @ComMethod(name = "FolderContextMenuDisplay", dispId = 0xfb42)
    void FolderContextMenuDisplay(eu.doppel_helix.jna.tlb.office2.CommandBar CommandBar,
            Folder Folder);
            
    /**
     * <p>id(0xfb43)</p>
     */
    @ComMethod(name = "StoreContextMenuDisplay", dispId = 0xfb43)
    void StoreContextMenuDisplay(eu.doppel_helix.jna.tlb.office2.CommandBar CommandBar,
            Store Store);
            
    /**
     * <p>id(0xfb44)</p>
     */
    @ComMethod(name = "ShortcutContextMenuDisplay", dispId = 0xfb44)
    void ShortcutContextMenuDisplay(eu.doppel_helix.jna.tlb.office2.CommandBar CommandBar,
            OutlookBarShortcut Shortcut);
            
    /**
     * <p>id(0xfb40)</p>
     */
    @ComMethod(name = "ViewContextMenuDisplay", dispId = 0xfb40)
    void ViewContextMenuDisplay(eu.doppel_helix.jna.tlb.office2.CommandBar CommandBar,
            View View);
            
    /**
     * <p>id(0xfb41)</p>
     */
    @ComMethod(name = "ItemContextMenuDisplay", dispId = 0xfb41)
    void ItemContextMenuDisplay(eu.doppel_helix.jna.tlb.office2.CommandBar CommandBar,
            Selection Selection);
            
    /**
     * <p>id(0xfba6)</p>
     */
    @ComMethod(name = "ContextMenuClose", dispId = 0xfba6)
    void ContextMenuClose(OlContextMenu ContextMenu);
            
    /**
     * <p>id(0xfba7)</p>
     */
    @ComMethod(name = "ItemLoad", dispId = 0xfba7)
    void ItemLoad(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xfc01)</p>
     */
    @ComMethod(name = "BeforeFolderSharingDialog", dispId = 0xfc01)
    void BeforeFolderSharingDialog(MAPIFolder FolderToShare,
            VARIANT Cancel);
            
    
}