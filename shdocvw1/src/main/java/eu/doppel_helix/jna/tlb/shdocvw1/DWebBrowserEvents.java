
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Web Browser Control Events (old)
 *
 * <p>uuid({EAB22AC2-30C1-11CF-A7EB-0000C05BAE0B})</p>
 */
@ComInterface(iid="{EAB22AC2-30C1-11CF-A7EB-0000C05BAE0B}")
public interface DWebBrowserEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Fired when a new hyperlink is being navigated to.
     *
     * <p>id(0x64)</p>
     * @param URL [in] {@code String}
     * @param Flags [] {@code Integer}
     * @param TargetFrameName [] {@code String}
     * @param PostData [] {@code Object}
     * @param Headers [] {@code String}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeNavigate", dispId = 0x64)
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
     * @param URL [in] {@code String}
     */
    @ComMethod(name = "NavigateComplete", dispId = 0x65)
    void NavigateComplete(String URL);
            
    /**
     * Statusbar text changed.
     *
     * <p>id(0x66)</p>
     * @param Text [in] {@code String}
     */
    @ComMethod(name = "StatusTextChange", dispId = 0x66)
    void StatusTextChange(String Text);
            
    /**
     * Fired when download progress is updated.
     *
     * <p>id(0x6c)</p>
     * @param Progress [in] {@code Integer}
     * @param ProgressMax [in] {@code Integer}
     */
    @ComMethod(name = "ProgressChange", dispId = 0x6c)
    void ProgressChange(Integer Progress,
            Integer ProgressMax);
            
    /**
     * Download of page complete.
     *
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "DownloadComplete", dispId = 0x68)
    void DownloadComplete();
            
    /**
     * The enabled state of a command changed
     *
     * <p>id(0x69)</p>
     * @param Command [in] {@code Integer}
     * @param Enable [in] {@code Boolean}
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
     * Fired when a new window should be created.
     *
     * <p>id(0x6b)</p>
     * @param URL [in] {@code String}
     * @param Flags [in] {@code Integer}
     * @param TargetFrameName [in] {@code String}
     * @param PostData [in] {@code Object}
     * @param Headers [in] {@code String}
     * @param Processed [inout] {@code Boolean}
     */
    @ComMethod(name = "NewWindow", dispId = 0x6b)
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
     * @param Text [in] {@code String}
     */
    @ComMethod(name = "TitleChange", dispId = 0x71)
    void TitleChange(String Text);
            
    /**
     * Fired when a new hyperlink is being navigated to in a frame.
     *
     * <p>id(0xc8)</p>
     * @param URL [in] {@code String}
     * @param Flags [] {@code Integer}
     * @param TargetFrameName [] {@code String}
     * @param PostData [] {@code Object}
     * @param Headers [] {@code String}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "FrameBeforeNavigate", dispId = 0xc8)
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
     * @param URL [in] {@code String}
     */
    @ComMethod(name = "FrameNavigateComplete", dispId = 0xc9)
    void FrameNavigateComplete(String URL);
            
    /**
     * Fired when a new window should be created.
     *
     * <p>id(0xcc)</p>
     * @param URL [in] {@code String}
     * @param Flags [in] {@code Integer}
     * @param TargetFrameName [in] {@code String}
     * @param PostData [in] {@code Object}
     * @param Headers [in] {@code String}
     * @param Processed [inout] {@code Boolean}
     */
    @ComMethod(name = "FrameNewWindow", dispId = 0xcc)
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
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "Quit", dispId = 0x67)
    void Quit(VARIANT Cancel);
            
    /**
     * Fired when window has been moved.
     *
     * <p>id(0x6d)</p>
     */
    @ComMethod(name = "WindowMove", dispId = 0x6d)
    void WindowMove();
            
    /**
     * Fired when window has been sized.
     *
     * <p>id(0x6e)</p>
     */
    @ComMethod(name = "WindowResize", dispId = 0x6e)
    void WindowResize();
            
    /**
     * Fired when window has been activated.
     *
     * <p>id(0x6f)</p>
     */
    @ComMethod(name = "WindowActivate", dispId = 0x6f)
    void WindowActivate();
            
    /**
     * Fired when the PutProperty method has been called.
     *
     * <p>id(0x70)</p>
     * @param Property [in] {@code String}
     */
    @ComMethod(name = "PropertyChange", dispId = 0x70)
    void PropertyChange(String Property);
            
    
}