
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Web Browser Control events interface
 *
 * <p>uuid({34A715A0-6587-11D0-924A-0020AFC7AC4D})</p>
 */
@ComInterface(iid="{34A715A0-6587-11D0-924A-0020AFC7AC4D}")
public interface DWebBrowserEvents2 {
    /**
     * Statusbar text changed.
     *
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "StatusTextChange", dispId = 0x66)
    void StatusTextChange(String Text);
            
    /**
     * Fired when download progress is updated.
     *
     * <p>id(0x6c)</p>
     */
    @ComMethod(name = "ProgressChange", dispId = 0x6c)
    void ProgressChange(Integer Progress,
            Integer ProgressMax);
            
    /**
     * The enabled state of a command changed.
     *
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "CommandStateChange", dispId = 0x69)
    void CommandStateChange(Integer Command,
            Boolean Enable);
            
    /**
     * Download of a page started.
     *
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "DownloadBegin", dispId = 0x6a)
    void DownloadBegin();
            
    /**
     * Download of page complete.
     *
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "DownloadComplete", dispId = 0x68)
    void DownloadComplete();
            
    /**
     * Document title changed.
     *
     * <p>id(0x71)</p>
     */
    @ComMethod(name = "TitleChange", dispId = 0x71)
    void TitleChange(String Text);
            
    /**
     * Fired when the PutProperty method has been called.
     *
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "PropertyChange", dispId = 0x70)
    void PropertyChange(String szProperty);
            
    /**
     * Fired before navigate occurs in the given WebBrowser (window or frameset element). The processing of this navigation may be modified.
     *
     * <p>id(0xfa)</p>
     */
    @ComMethod(name = "BeforeNavigate2", dispId = 0xfa)
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
    @ComMethod(name = "NewWindow2", dispId = 0xfb)
    void NewWindow2(VARIANT ppDisp,
            VARIANT Cancel);
            
    /**
     * Fired when the document being navigated to becomes visible and enters the navigation stack.
     *
     * <p>id(0xfc)</p>
     */
    @ComMethod(name = "NavigateComplete2", dispId = 0xfc)
    void NavigateComplete2(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL);
            
    /**
     * Fired when the document being navigated to reaches ReadyState_Complete.
     *
     * <p>id(0x103)</p>
     */
    @ComMethod(name = "DocumentComplete", dispId = 0x103)
    void DocumentComplete(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL);
            
    /**
     * Fired when application is quiting.
     *
     * <p>id(0xfd)</p>
     */
    @ComMethod(name = "OnQuit", dispId = 0xfd)
    void OnQuit();
            
    /**
     * Fired when the window should be shown/hidden
     *
     * <p>id(0xfe)</p>
     */
    @ComMethod(name = "OnVisible", dispId = 0xfe)
    void OnVisible(Boolean Visible);
            
    /**
     * Fired when the toolbar  should be shown/hidden
     *
     * <p>id(0xff)</p>
     */
    @ComMethod(name = "OnToolBar", dispId = 0xff)
    void OnToolBar(Boolean ToolBar);
            
    /**
     * Fired when the menubar should be shown/hidden
     *
     * <p>id(0x100)</p>
     */
    @ComMethod(name = "OnMenuBar", dispId = 0x100)
    void OnMenuBar(Boolean MenuBar);
            
    /**
     * Fired when the statusbar should be shown/hidden
     *
     * <p>id(0x101)</p>
     */
    @ComMethod(name = "OnStatusBar", dispId = 0x101)
    void OnStatusBar(Boolean StatusBar);
            
    /**
     * Fired when fullscreen mode should be on/off
     *
     * <p>id(0x102)</p>
     */
    @ComMethod(name = "OnFullScreen", dispId = 0x102)
    void OnFullScreen(Boolean FullScreen);
            
    /**
     * Fired when theater mode should be on/off
     *
     * <p>id(0x104)</p>
     */
    @ComMethod(name = "OnTheaterMode", dispId = 0x104)
    void OnTheaterMode(Boolean TheaterMode);
            
    /**
     * Fired when the host window should allow/disallow resizing
     *
     * <p>id(0x106)</p>
     */
    @ComMethod(name = "WindowSetResizable", dispId = 0x106)
    void WindowSetResizable(Boolean Resizable);
            
    /**
     * Fired when the host window should change its Left coordinate
     *
     * <p>id(0x108)</p>
     */
    @ComMethod(name = "WindowSetLeft", dispId = 0x108)
    void WindowSetLeft(Integer Left);
            
    /**
     * Fired when the host window should change its Top coordinate
     *
     * <p>id(0x109)</p>
     */
    @ComMethod(name = "WindowSetTop", dispId = 0x109)
    void WindowSetTop(Integer Top);
            
    /**
     * Fired when the host window should change its width
     *
     * <p>id(0x10a)</p>
     */
    @ComMethod(name = "WindowSetWidth", dispId = 0x10a)
    void WindowSetWidth(Integer Width);
            
    /**
     * Fired when the host window should change its height
     *
     * <p>id(0x10b)</p>
     */
    @ComMethod(name = "WindowSetHeight", dispId = 0x10b)
    void WindowSetHeight(Integer Height);
            
    /**
     * Fired when the WebBrowser is about to be closed by script
     *
     * <p>id(0x107)</p>
     */
    @ComMethod(name = "WindowClosing", dispId = 0x107)
    void WindowClosing(Boolean IsChildWindow,
            VARIANT Cancel);
            
    /**
     * Fired to request client sizes be converted to host window sizes
     *
     * <p>id(0x10c)</p>
     */
    @ComMethod(name = "ClientToHostWindow", dispId = 0x10c)
    void ClientToHostWindow(VARIANT CX,
            VARIANT CY);
            
    /**
     * Fired to indicate the security level of the current web page contents
     *
     * <p>id(0x10d)</p>
     */
    @ComMethod(name = "SetSecureLockIcon", dispId = 0x10d)
    void SetSecureLockIcon(Integer SecureLockIcon);
            
    /**
     * Fired to indicate the File Download dialog is opening
     *
     * <p>id(0x10e)</p>
     */
    @ComMethod(name = "FileDownload", dispId = 0x10e)
    void FileDownload(Boolean ActiveDocument,
            VARIANT Cancel);
            
    /**
     * Fired when a binding error occurs (window or frameset element).
     *
     * <p>id(0x10f)</p>
     */
    @ComMethod(name = "NavigateError", dispId = 0x10f)
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
    @ComMethod(name = "PrintTemplateInstantiation", dispId = 0xe1)
    void PrintTemplateInstantiation(com.sun.jna.platform.win32.COM.util.IDispatch pDisp);
            
    /**
     * Fired when a print template destroyed.
     *
     * <p>id(0xe2)</p>
     */
    @ComMethod(name = "PrintTemplateTeardown", dispId = 0xe2)
    void PrintTemplateTeardown(com.sun.jna.platform.win32.COM.util.IDispatch pDisp);
            
    /**
     * Fired when a page is spooled. When it is fired can be changed by a custom template.
     *
     * <p>id(0xe3)</p>
     */
    @ComMethod(name = "UpdatePageStatus", dispId = 0xe3)
    void UpdatePageStatus(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object nPage,
            Object fDone);
            
    /**
     * Fired when the global privacy impacted state changes
     *
     * <p>id(0x110)</p>
     */
    @ComMethod(name = "PrivacyImpactedStateChange", dispId = 0x110)
    void PrivacyImpactedStateChange(Boolean bImpacted);
            
    /**
     * A new, hidden, non-navigated WebBrowser window is needed.
     *
     * <p>id(0x111)</p>
     */
    @ComMethod(name = "NewWindow3", dispId = 0x111)
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
    @ComMethod(name = "SetPhishingFilterStatus", dispId = 0x11a)
    void SetPhishingFilterStatus(Integer PhishingFilterStatus);
            
    /**
     * Fired to indicate that the browser window's visibility or enabled state has changed.
     *
     * <p>id(0x11b)</p>
     */
    @ComMethod(name = "WindowStateChanged", dispId = 0x11b)
    void WindowStateChanged(Integer dwWindowStateFlags,
            Integer dwValidFlagsMask);
            
    /**
     * A new, hidden, non-navigated process is created to handle the navigation.
     *
     * <p>id(0x11c)</p>
     */
    @ComMethod(name = "NewProcess", dispId = 0x11c)
    void NewProcess(Integer lCauseFlag,
            com.sun.jna.platform.win32.COM.util.IDispatch pWB2,
            VARIANT Cancel);
            
    /**
     * Fired when a third-party URL is blocked.
     *
     * <p>id(0x11d)</p>
     */
    @ComMethod(name = "ThirdPartyUrlBlocked", dispId = 0x11d)
    void ThirdPartyUrlBlocked(Object URL,
            Integer dwCount);
            
    /**
     * Fired when a x-domain redirect is blocked.
     *
     * <p>id(0x11e)</p>
     */
    @ComMethod(name = "RedirectXDomainBlocked", dispId = 0x11e)
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
    @ComMethod(name = "BeforeScriptExecute", dispId = 0x122)
    void BeforeScriptExecute(com.sun.jna.platform.win32.COM.util.IDispatch pDispWindow);
            
    /**
     * Fired after a Web Worker has been started.
     *
     * <p>id(0x120)</p>
     */
    @ComMethod(name = "WebWorkerStarted", dispId = 0x120)
    void WebWorkerStarted(Integer dwUniqueID,
            String bstrWorkerLabel);
            
    /**
     * Fired after a Web Worker has closed
     *
     * <p>id(0x121)</p>
     */
    @ComMethod(name = "WebWorkerFinsihed", dispId = 0x121)
    void WebWorkerFinsihed(Integer dwUniqueID);
            
    
}