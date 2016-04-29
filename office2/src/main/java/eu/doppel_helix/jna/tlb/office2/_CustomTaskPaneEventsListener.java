
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C033C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C033C-0000-0000-C000-000000000046}")
public interface _CustomTaskPaneEventsListener {
    /**
     * <p>id(0x1)</p>
     */
    @ComEventCallback(dispid = 0x1)
    void VisibleStateChange(_CustomTaskPane CustomTaskPaneInst);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComEventCallback(dispid = 0x2)
    void DockPositionStateChange(_CustomTaskPane CustomTaskPaneInst);
            
    
}