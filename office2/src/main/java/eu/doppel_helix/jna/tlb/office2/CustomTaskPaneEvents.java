
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({8A64A872-FC6B-4D4A-926E-3A3689562C1C})</p>
 */
@ComInterface(iid="{8A64A872-FC6B-4D4A-926E-3A3689562C1C}")
public interface CustomTaskPaneEvents {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "VisibleStateChange", dispId = 0x1)
    void VisibleStateChange(_CustomTaskPane CustomTaskPaneInst);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "DockPositionStateChange", dispId = 0x2)
    void DockPositionStateChange(_CustomTaskPane CustomTaskPaneInst);
            
    
}