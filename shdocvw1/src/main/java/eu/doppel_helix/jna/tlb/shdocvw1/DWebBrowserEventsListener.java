
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Web Browser Control Events (old)
 *
 * <p>uuid({EAB22AC2-30C1-11CF-A7EB-0000C05BAE0B})</p>
 */
@ComInterface(iid="{EAB22AC2-30C1-11CF-A7EB-0000C05BAE0B}")
public interface DWebBrowserEventsListener {
    /**
     * Fired when a new hyperlink is being navigated to.
     *
     * <p>id(0x64)</p>
     */
    @ComEventCallback(dispid = 0x64)
    void BeforeNavigate(String URL,
            Integer Flags,
            String TargetFrameName,
            Object PostData,
            String Headers,
            VARIANT Cancel);
            
    /**
     * Fired when the document being navigated to becomes visible and enters the navigation stack.
     *
     * <p>id(0x65)</p>
     */
    @ComEventCallback(dispid = 0x65)
    void NavigateComplete(String URL);
            
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
     * Download of page complete.
     *
     * <p>id(0x68)</p>
     */
    @ComEventCallback(dispid = 0x68)
    void DownloadComplete();
            
    /**
     * The enabled state of a command changed
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
     * Fired when a new window should be created.
     *
     * <p>id(0x6b)</p>
     */
    @ComEventCallback(dispid = 0x6b)
    void NewWindow(String URL,
            Integer Flags,
            String TargetFrameName,
            Object PostData,
            String Headers,
            VARIANT Processed);
            
    /**
     * Document title changed.
     *
     * <p>id(0x71)</p>
     */
    @ComEventCallback(dispid = 0x71)
    void TitleChange(String Text);
            
    /**
     * Fired when a new hyperlink is being navigated to in a frame.
     *
     * <p>id(0xc8)</p>
     */
    @ComEventCallback(dispid = 0xc8)
    void FrameBeforeNavigate(String URL,
            Integer Flags,
            String TargetFrameName,
            Object PostData,
            String Headers,
            VARIANT Cancel);
            
    /**
     * Fired when a new hyperlink is being navigated to in a frame.
     *
     * <p>id(0xc9)</p>
     */
    @ComEventCallback(dispid = 0xc9)
    void FrameNavigateComplete(String URL);
            
    /**
     * Fired when a new window should be created.
     *
     * <p>id(0xcc)</p>
     */
    @ComEventCallback(dispid = 0xcc)
    void FrameNewWindow(String URL,
            Integer Flags,
            String TargetFrameName,
            Object PostData,
            String Headers,
            VARIANT Processed);
            
    /**
     * Fired when application is quiting.
     *
     * <p>id(0x67)</p>
     */
    @ComEventCallback(dispid = 0x67)
    void Quit(VARIANT Cancel);
            
    /**
     * Fired when window has been moved.
     *
     * <p>id(0x6d)</p>
     */
    @ComEventCallback(dispid = 0x6d)
    void WindowMove();
            
    /**
     * Fired when window has been sized.
     *
     * <p>id(0x6e)</p>
     */
    @ComEventCallback(dispid = 0x6e)
    void WindowResize();
            
    /**
     * Fired when window has been activated.
     *
     * <p>id(0x6f)</p>
     */
    @ComEventCallback(dispid = 0x6f)
    void WindowActivate();
            
    /**
     * Fired when the PutProperty method has been called.
     *
     * <p>id(0x70)</p>
     */
    @ComEventCallback(dispid = 0x70)
    void PropertyChange(String Property);
            
    
}