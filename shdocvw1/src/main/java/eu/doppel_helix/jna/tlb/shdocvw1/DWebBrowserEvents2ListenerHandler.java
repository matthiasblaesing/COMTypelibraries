
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Web Browser Control events interface
 *
 * <p>uuid({34A715A0-6587-11D0-924A-0020AFC7AC4D})</p>
 */
public abstract class DWebBrowserEvents2ListenerHandler extends AbstractComEventCallbackListener implements DWebBrowserEvents2Listener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * Statusbar text changed.
     *
     * <p>id(0x66)</p>
     */
    @Override
    public void StatusTextChange(String Text){
    }
            
    /**
     * Fired when download progress is updated.
     *
     * <p>id(0x6c)</p>
     */
    @Override
    public void ProgressChange(Integer Progress,
            Integer ProgressMax){
    }
            
    /**
     * The enabled state of a command changed.
     *
     * <p>id(0x69)</p>
     */
    @Override
    public void CommandStateChange(Integer Command,
            Boolean Enable){
    }
            
    /**
     * Download of a page started.
     *
     * <p>id(0x6a)</p>
     */
    @Override
    public void DownloadBegin(){
    }
            
    /**
     * Download of page complete.
     *
     * <p>id(0x68)</p>
     */
    @Override
    public void DownloadComplete(){
    }
            
    /**
     * Document title changed.
     *
     * <p>id(0x71)</p>
     */
    @Override
    public void TitleChange(String Text){
    }
            
    /**
     * Fired when the PutProperty method has been called.
     *
     * <p>id(0x70)</p>
     */
    @Override
    public void PropertyChange(String szProperty){
    }
            
    /**
     * Fired before navigate occurs in the given WebBrowser (window or frameset element). The processing of this navigation may be modified.
     *
     * <p>id(0xfa)</p>
     */
    @Override
    public void BeforeNavigate2(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL,
            Object Flags,
            Object TargetFrameName,
            Object PostData,
            Object Headers,
            VARIANT Cancel){
    }
            
    /**
     * A new, hidden, non-navigated WebBrowser window is needed.
     *
     * <p>id(0xfb)</p>
     */
    @Override
    public void NewWindow2(VARIANT ppDisp,
            VARIANT Cancel){
    }
            
    /**
     * Fired when the document being navigated to becomes visible and enters the navigation stack.
     *
     * <p>id(0xfc)</p>
     */
    @Override
    public void NavigateComplete2(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL){
    }
            
    /**
     * Fired when the document being navigated to reaches ReadyState_Complete.
     *
     * <p>id(0x103)</p>
     */
    @Override
    public void DocumentComplete(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL){
    }
            
    /**
     * Fired when application is quiting.
     *
     * <p>id(0xfd)</p>
     */
    @Override
    public void OnQuit(){
    }
            
    /**
     * Fired when the window should be shown/hidden
     *
     * <p>id(0xfe)</p>
     */
    @Override
    public void OnVisible(Boolean Visible){
    }
            
    /**
     * Fired when the toolbar  should be shown/hidden
     *
     * <p>id(0xff)</p>
     */
    @Override
    public void OnToolBar(Boolean ToolBar){
    }
            
    /**
     * Fired when the menubar should be shown/hidden
     *
     * <p>id(0x100)</p>
     */
    @Override
    public void OnMenuBar(Boolean MenuBar){
    }
            
    /**
     * Fired when the statusbar should be shown/hidden
     *
     * <p>id(0x101)</p>
     */
    @Override
    public void OnStatusBar(Boolean StatusBar){
    }
            
    /**
     * Fired when fullscreen mode should be on/off
     *
     * <p>id(0x102)</p>
     */
    @Override
    public void OnFullScreen(Boolean FullScreen){
    }
            
    /**
     * Fired when theater mode should be on/off
     *
     * <p>id(0x104)</p>
     */
    @Override
    public void OnTheaterMode(Boolean TheaterMode){
    }
            
    /**
     * Fired when the host window should allow/disallow resizing
     *
     * <p>id(0x106)</p>
     */
    @Override
    public void WindowSetResizable(Boolean Resizable){
    }
            
    /**
     * Fired when the host window should change its Left coordinate
     *
     * <p>id(0x108)</p>
     */
    @Override
    public void WindowSetLeft(Integer Left){
    }
            
    /**
     * Fired when the host window should change its Top coordinate
     *
     * <p>id(0x109)</p>
     */
    @Override
    public void WindowSetTop(Integer Top){
    }
            
    /**
     * Fired when the host window should change its width
     *
     * <p>id(0x10a)</p>
     */
    @Override
    public void WindowSetWidth(Integer Width){
    }
            
    /**
     * Fired when the host window should change its height
     *
     * <p>id(0x10b)</p>
     */
    @Override
    public void WindowSetHeight(Integer Height){
    }
            
    /**
     * Fired when the WebBrowser is about to be closed by script
     *
     * <p>id(0x107)</p>
     */
    @Override
    public void WindowClosing(Boolean IsChildWindow,
            VARIANT Cancel){
    }
            
    /**
     * Fired to request client sizes be converted to host window sizes
     *
     * <p>id(0x10c)</p>
     */
    @Override
    public void ClientToHostWindow(VARIANT CX,
            VARIANT CY){
    }
            
    /**
     * Fired to indicate the security level of the current web page contents
     *
     * <p>id(0x10d)</p>
     */
    @Override
    public void SetSecureLockIcon(Integer SecureLockIcon){
    }
            
    /**
     * Fired to indicate the File Download dialog is opening
     *
     * <p>id(0x10e)</p>
     */
    @Override
    public void FileDownload(Boolean ActiveDocument,
            VARIANT Cancel){
    }
            
    /**
     * Fired when a binding error occurs (window or frameset element).
     *
     * <p>id(0x10f)</p>
     */
    @Override
    public void NavigateError(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL,
            Object Frame,
            Object StatusCode,
            VARIANT Cancel){
    }
            
    /**
     * Fired when a print template is instantiated.
     *
     * <p>id(0xe1)</p>
     */
    @Override
    public void PrintTemplateInstantiation(com.sun.jna.platform.win32.COM.util.IDispatch pDisp){
    }
            
    /**
     * Fired when a print template destroyed.
     *
     * <p>id(0xe2)</p>
     */
    @Override
    public void PrintTemplateTeardown(com.sun.jna.platform.win32.COM.util.IDispatch pDisp){
    }
            
    /**
     * Fired when a page is spooled. When it is fired can be changed by a custom template.
     *
     * <p>id(0xe3)</p>
     */
    @Override
    public void UpdatePageStatus(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object nPage,
            Object fDone){
    }
            
    /**
     * Fired when the global privacy impacted state changes
     *
     * <p>id(0x110)</p>
     */
    @Override
    public void PrivacyImpactedStateChange(Boolean bImpacted){
    }
            
    /**
     * A new, hidden, non-navigated WebBrowser window is needed.
     *
     * <p>id(0x111)</p>
     */
    @Override
    public void NewWindow3(VARIANT ppDisp,
            VARIANT Cancel,
            Integer dwFlags,
            String bstrUrlContext,
            String bstrUrl){
    }
            
    /**
     * Fired to indicate the progress and status of the Phishing Filter analysis of the current web page
     *
     * <p>id(0x11a)</p>
     */
    @Override
    public void SetPhishingFilterStatus(Integer PhishingFilterStatus){
    }
            
    /**
     * Fired to indicate that the browser window's visibility or enabled state has changed.
     *
     * <p>id(0x11b)</p>
     */
    @Override
    public void WindowStateChanged(Integer dwWindowStateFlags,
            Integer dwValidFlagsMask){
    }
            
    /**
     * A new, hidden, non-navigated process is created to handle the navigation.
     *
     * <p>id(0x11c)</p>
     */
    @Override
    public void NewProcess(Integer lCauseFlag,
            com.sun.jna.platform.win32.COM.util.IDispatch pWB2,
            VARIANT Cancel){
    }
            
    /**
     * Fired when a third-party URL is blocked.
     *
     * <p>id(0x11d)</p>
     */
    @Override
    public void ThirdPartyUrlBlocked(Object URL,
            Integer dwCount){
    }
            
    /**
     * Fired when a x-domain redirect is blocked.
     *
     * <p>id(0x11e)</p>
     */
    @Override
    public void RedirectXDomainBlocked(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object StartURL,
            Object RedirectURL,
            Object Frame,
            Object StatusCode){
    }
            
    /**
     * Fired prior to the first script execution.
     *
     * <p>id(0x122)</p>
     */
    @Override
    public void BeforeScriptExecute(com.sun.jna.platform.win32.COM.util.IDispatch pDispWindow){
    }
            
    /**
     * Fired after a Web Worker has been started.
     *
     * <p>id(0x120)</p>
     */
    @Override
    public void WebWorkerStarted(Integer dwUniqueID,
            String bstrWorkerLabel){
    }
            
    /**
     * Fired after a Web Worker has closed
     *
     * <p>id(0x121)</p>
     */
    @Override
    public void WebWorkerFinsihed(Integer dwUniqueID){
    }
            
    
}