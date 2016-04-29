
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C033C-0000-0000-C000-000000000046})</p>
 */
public abstract class _CustomTaskPaneEventsListenerHandler extends AbstractComEventCallbackListener implements _CustomTaskPaneEventsListener {
    @Override
    public void errorReceivingCallbackEvent(String string, Exception excptn) {
    }

    /**
     * <p>id(0x1)</p>
     */
    @Override
    public void VisibleStateChange(_CustomTaskPane CustomTaskPaneInst){
    }
            
    /**
     * <p>id(0x2)</p>
     */
    @Override
    public void DockPositionStateChange(_CustomTaskPane CustomTaskPaneInst){
    }
            
    
}