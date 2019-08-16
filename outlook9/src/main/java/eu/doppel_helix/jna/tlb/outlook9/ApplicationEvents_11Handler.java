
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006302C-0000-0000-C000-000000000046})</p>
 */
public abstract class ApplicationEvents_11Handler extends AbstractComEventCallbackListener implements ApplicationEvents_11 {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xf002)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT ItemSend(com.sun.jna.platform.win32.COM.util.IDispatch Item,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf003)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT NewMail();
            
    /**
     * <p>id(0xf004)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Reminder(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xf005)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT OptionsPagesAdd(PropertyPages Pages);
            
    /**
     * <p>id(0xf006)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Startup();
            
    /**
     * <p>id(0xf007)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Quit();
            
    /**
     * <p>id(0xfa6a)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT AdvancedSearchComplete(Search SearchObject);
            
    /**
     * <p>id(0xfa6b)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT AdvancedSearchStopped(Search SearchObject);
            
    /**
     * <p>id(0xfa90)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT MAPILogonComplete();
            
    /**
     * <p>id(0xfab5)</p>
     */
    @Override
    public void NewMailEx(String EntryIDCollection){
    }
            
    /**
     * <p>id(0xfb3e)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT AttachmentContextMenuDisplay(eu.doppel_helix.jna.tlb.office2.CommandBar CommandBar,
            AttachmentSelection Attachments);
            
    /**
     * <p>id(0xfb42)</p>
     */
    @Override
    public void FolderContextMenuDisplay(eu.doppel_helix.jna.tlb.office2.CommandBar CommandBar,
            Folder Folder){
    }
            
    /**
     * <p>id(0xfb43)</p>
     */
    @Override
    public void StoreContextMenuDisplay(eu.doppel_helix.jna.tlb.office2.CommandBar CommandBar,
            Store Store){
    }
            
    /**
     * <p>id(0xfb44)</p>
     */
    @Override
    public void ShortcutContextMenuDisplay(eu.doppel_helix.jna.tlb.office2.CommandBar CommandBar,
            OutlookBarShortcut Shortcut){
    }
            
    /**
     * <p>id(0xfb40)</p>
     */
    @Override
    public void ViewContextMenuDisplay(eu.doppel_helix.jna.tlb.office2.CommandBar CommandBar,
            View View){
    }
            
    /**
     * <p>id(0xfb41)</p>
     */
    @Override
    public void ItemContextMenuDisplay(eu.doppel_helix.jna.tlb.office2.CommandBar CommandBar,
            Selection Selection){
    }
            
    /**
     * <p>id(0xfba6)</p>
     */
    @Override
    public void ContextMenuClose(OlContextMenu ContextMenu){
    }
            
    /**
     * <p>id(0xfba7)</p>
     */
    @Override
    public void ItemLoad(com.sun.jna.platform.win32.COM.util.IDispatch Item){
    }
            
    /**
     * <p>id(0xfc01)</p>
     */
    @Override
    public void BeforeFolderSharingDialog(MAPIFolder FolderToShare,
            VARIANT Cancel){
    }
            
    
}