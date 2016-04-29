
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Web Browser Control events interface
 *
 * <p>uuid({34A715A0-6587-11D0-924A-0020AFC7AC4D})</p>
 */
@ComInterface(iid="{34A715A0-6587-11D0-924A-0020AFC7AC4D}")
public interface DWebBrowserEvents2Listener {
    /**
     * Statusbar text changed.
     *
     * <p>id(0x66)</p>
     */
    @ComEventCallback(dispid = 0x66)
    void StatusTextChange(String Text);
            
    /**
     * Fired when download progress is updated.
     *
     * <p>id(0x6c)</p>
     */
    @ComEventCallback(dispid = 0x6c)
    void ProgressChange(Integer Progress,
            Integer ProgressMax);
            
    /**
     * The enabled state of a command changed.
     *
     * <p>id(0x69)</p>
     */
    @ComEventCallback(dispid = 0x69)
    void CommandStateChange(Integer Command,
            Boolean Enable);
            
    /**
     * Download of a page started.
     *
     * <p>id(0x6a)</p>
     */
    @ComEventCallback(dispid = 0x6a)
    void DownloadBegin();
            
    /**
     * Download of page complete.
     *
     * <p>id(0x68)</p>
     */
    @ComEventCallback(dispid = 0x68)
    void DownloadComplete();
            
    /**
     * Document title changed.
     *
     * <p>id(0x71)</p>
     */
    @ComEventCallback(dispid = 0x71)
    void TitleChange(String Text);
            
    /**
     * Fired when the PutProperty method has been called.
     *
     * <p>id(0x70)</p>
     */
    @ComEventCallback(dispid = 0x70)
    void PropertyChange(String szProperty);
            
    /**
     * Fired before navigate occurs in the given WebBrowser (window or frameset element). The processing of this navigation may be modified.
     *
     * <p>id(0xfa)</p>
     */
    @ComEventCallback(dispid = 0xfa)
    void BeforeNavigate2(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL,
            Object Flags,
            Object TargetFrameName,
            Object PostData,
            Object Headers,
            VARIANT Cancel);
            
    /**
     * A new, hidden, non-navigated WebBrowser window is needed.
     *
     * <p>id(0xfb)</p>
     */
    @ComEventCallback(dispid = 0xfb)
    void NewWindow2(VARIANT ppDisp,
            VARIANT Cancel);
            
    /**
     * Fired when the document being navigated to becomes visible and enters the navigation stack.
     *
     * <p>id(0xfc)</p>
     */
    @ComEventCallback(dispid = 0xfc)
    void NavigateComplete2(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL);
            
    /**
     * Fired when the document being navigated to reaches ReadyState_Complete.
     *
     * <p>id(0x103)</p>
     */
    @ComEventCallback(dispid = 0x103)
    void DocumentComplete(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL);
            
    /**
     * Fired when application is quiting.
     *
     * <p>id(0xfd)</p>
     */
    @ComEventCallback(dispid = 0xfd)
    void OnQuit();
            
    /**
     * Fired when the window should be shown/hidden
     *
     * <p>id(0xfe)</p>
     */
    @ComEventCallback(dispid = 0xfe)
    void OnVisible(Boolean Visible);
            
    /**
     * Fired when the toolbar  should be shown/hidden
     *
     * <p>id(0xff)</p>
     */
    @ComEventCallback(dispid = 0xff)
    void OnToolBar(Boolean ToolBar);
            
    /**
     * Fired when the menubar should be shown/hidden
     *
     * <p>id(0x100)</p>
     */
    @ComEventCallback(dispid = 0x100)
    void OnMenuBar(Boolean MenuBar);
            
    /**
     * Fired when the statusbar should be shown/hidden
     *
     * <p>id(0x101)</p>
     */
    @ComEventCallback(dispid = 0x101)
    void OnStatusBar(Boolean StatusBar);
            
    /**
     * Fired when fullscreen mode should be on/off
     *
     * <p>id(0x102)</p>
     */
    @ComEventCallback(dispid = 0x102)
    void OnFullScreen(Boolean FullScreen);
            
    /**
     * Fired when theater mode should be on/off
     *
     * <p>id(0x104)</p>
     */
    @ComEventCallback(dispid = 0x104)
    void OnTheaterMode(Boolean TheaterMode);
            
    /**
     * Fired when the host window should allow/disallow resizing
     *
     * <p>id(0x106)</p>
     */
    @ComEventCallback(dispid = 0x106)
    void WindowSetResizable(Boolean Resizable);
            
    /**
     * Fired when the host window should change its Left coordinate
     *
     * <p>id(0x108)</p>
     */
    @ComEventCallback(dispid = 0x108)
    void WindowSetLeft(Integer Left);
            
    /**
     * Fired when the host window should change its Top coordinate
     *
     * <p>id(0x109)</p>
     */
    @ComEventCallback(dispid = 0x109)
    void WindowSetTop(Integer Top);
            
    /**
     * Fired when the host window should change its width
     *
     * <p>id(0x10a)</p>
     */
    @ComEventCallback(dispid = 0x10a)
    void WindowSetWidth(Integer Width);
            
    /**
     * Fired when the host window should change its height
     *
     * <p>id(0x10b)</p>
     */
    @ComEventCallback(dispid = 0x10b)
    void WindowSetHeight(Integer Height);
            
    /**
     * Fired when the WebBrowser is about to be closed by script
     *
     * <p>id(0x107)</p>
     */
    @ComEventCallback(dispid = 0x107)
    void WindowClosing(Boolean IsChildWindow,
            VARIANT Cancel);
            
    /**
     * Fired to request client sizes be converted to host window sizes
     *
     * <p>id(0x10c)</p>
     */
    @ComEventCallback(dispid = 0x10c)
    void ClientToHostWindow(VARIANT CX,
            VARIANT CY);
            
    /**
     * Fired to indicate the security level of the current web page contents
     *
     * <p>id(0x10d)</p>
     */
    @ComEventCallback(dispid = 0x10d)
    void SetSecureLockIcon(Integer SecureLockIcon);
            
    /**
     * Fired to indicate the File Download dialog is opening
     *
     * <p>id(0x10e)</p>
     */
    @ComEventCallback(dispid = 0x10e)
    void FileDownload(Boolean ActiveDocument,
            VARIANT Cancel);
            
    /**
     * Fired when a binding error occurs (window or frameset element).
     *
     * <p>id(0x10f)</p>
     */
    @ComEventCallback(dispid = 0x10f)
    void NavigateError(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL,
            Object Frame,
            Object StatusCode,
            VARIANT Cancel);
            
    /**
     * Fired when a print template is instantiated.
     *
     * <p>id(0xe1)</p>
     */
    @ComEventCallback(dispid = 0xe1)
    void PrintTemplateInstantiation(com.sun.jna.platform.win32.COM.util.IDispatch pDisp);
            
    /**
     * Fired when a print template destroyed.
     *
     * <p>id(0xe2)</p>
     */
    @ComEventCallback(dispid = 0xe2)
    void PrintTemplateTeardown(com.sun.jna.platform.win32.COM.util.IDispatch pDisp);
            
    /**
     * Fired when a page is spooled. When it is fired can be changed by a custom template.
     *
     * <p>id(0xe3)</p>
     */
    @ComEventCallback(dispid = 0xe3)
    void UpdatePageStatus(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object nPage,
            Object fDone);
            
    /**
     * Fired when the global privacy impacted state changes
     *
     * <p>id(0x110)</p>
     */
    @ComEventCallback(dispid = 0x110)
    void PrivacyImpactedStateChange(Boolean bImpacted);
            
    /**
     * A new, hidden, non-navigated WebBrowser window is needed.
     *
     * <p>id(0x111)</p>
     */
    @ComEventCallback(dispid = 0x111)
    void NewWindow3(VARIANT ppDisp,
            VARIANT Cancel,
            Integer dwFlags,
            String bstrUrlContext,
            String bstrUrl);
            
    /**
     * Fired to indicate the progress and status of the Phishing Filter analysis of the current web page
     *
     * <p>id(0x11a)</p>
     */
    @ComEventCallback(dispid = 0x11a)
    void SetPhishingFilterStatus(Integer PhishingFilterStatus);
            
    /**
     * Fired to indicate that the browser window's visibility or enabled state has changed.
     *
     * <p>id(0x11b)</p>
     */
    @ComEventCallback(dispid = 0x11b)
    void WindowStateChanged(Integer dwWindowStateFlags,
            Integer dwValidFlagsMask);
            
    /**
     * A new, hidden, non-navigated process is created to handle the navigation.
     *
     * <p>id(0x11c)</p>
     */
    @ComEventCallback(dispid = 0x11c)
    void NewProcess(Integer lCauseFlag,
            com.sun.jna.platform.win32.COM.util.IDispatch pWB2,
            VARIANT Cancel);
            
    /**
     * Fired when a third-party URL is blocked.
     *
     * <p>id(0x11d)</p>
     */
    @ComEventCallback(dispid = 0x11d)
    void ThirdPartyUrlBlocked(Object URL,
            Integer dwCount);
            
    /**
     * Fired when a x-domain redirect is blocked.
     *
     * <p>id(0x11e)</p>
     */
    @ComEventCallback(dispid = 0x11e)
    void RedirectXDomainBlocked(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object StartURL,
            Object RedirectURL,
            Object Frame,
            Object StatusCode);
            
    /**
     * Fired prior to the first script execution.
     *
     * <p>id(0x122)</p>
     */
    @ComEventCallback(dispid = 0x122)
    void BeforeScriptExecute(com.sun.jna.platform.win32.COM.util.IDispatch pDispWindow);
            
    /**
     * Fired after a Web Worker has been started.
     *
     * <p>id(0x120)</p>
     */
    @ComEventCallback(dispid = 0x120)
    void WebWorkerStarted(Integer dwUniqueID,
            String bstrWorkerLabel);
            
    /**
     * Fired after a Web Worker has closed
     *
     * <p>id(0x121)</p>
     */
    @ComEventCallback(dispid = 0x121)
    void WebWorkerFinsihed(Integer dwUniqueID);
            
    
}