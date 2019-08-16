
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Web Browser Control Events (old)
 *
 * <p>uuid({EAB22AC2-30C1-11CF-A7EB-0000C05BAE0B})</p>
 */
public abstract class DWebBrowserEventsHandler extends AbstractComEventCallbackListener implements DWebBrowserEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * Fired when a new hyperlink is being navigated to.
     *
     * <p>id(0x64)</p>
     */
    @Override
    public void BeforeNavigate(String URL,
            Integer Flags,
            String TargetFrameName,
            Object PostData,
            String Headers,
            VARIANT Cancel){
    }
            
    /**
     * Fired when the document being navigated to becomes visible and enters the navigation stack.
     *
     * <p>id(0x65)</p>
     */
    @Override
    public void NavigateComplete(String URL){
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
     * Download of page complete.
     *
     * <p>id(0x68)</p>
     */
    @Override
    public void DownloadComplete(){
    }
            
    /**
     * The enabled state of a command changed
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
     * Fired when a new window should be created.
     *
     * <p>id(0x6b)</p>
     */
    @Override
    public void NewWindow(String URL,
            Integer Flags,
            String TargetFrameName,
            Object PostData,
            String Headers,
            VARIANT Processed){
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
     * Fired when a new hyperlink is being navigated to in a frame.
     *
     * <p>id(0xc8)</p>
     */
    @Override
    public void FrameBeforeNavigate(String URL,
            Integer Flags,
            String TargetFrameName,
            Object PostData,
            String Headers,
            VARIANT Cancel){
    }
            
    /**
     * Fired when a new hyperlink is being navigated to in a frame.
     *
     * <p>id(0xc9)</p>
     */
    @Override
    public void FrameNavigateComplete(String URL){
    }
            
    /**
     * Fired when a new window should be created.
     *
     * <p>id(0xcc)</p>
     */
    @Override
    public void FrameNewWindow(String URL,
            Integer Flags,
            String TargetFrameName,
            Object PostData,
            String Headers,
            VARIANT Processed){
    }
            
    /**
     * Fired when application is quiting.
     *
     * <p>id(0x67)</p>
     */
    @Override
    public void Quit(VARIANT Cancel){
    }
            
    /**
     * Fired when window has been moved.
     *
     * <p>id(0x6d)</p>
     */
    @Override
    public void WindowMove(){
    }
            
    /**
     * Fired when window has been sized.
     *
     * <p>id(0x6e)</p>
     */
    @Override
    public void WindowResize(){
    }
            
    /**
     * Fired when window has been activated.
     *
     * <p>id(0x6f)</p>
     */
    @Override
    public void WindowActivate(){
    }
            
    /**
     * Fired when the PutProperty method has been called.
     *
     * <p>id(0x70)</p>
     */
    @Override
    public void PropertyChange(String Property){
    }
            
    
}