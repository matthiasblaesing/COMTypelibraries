
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006304F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006304F-0000-0000-C000-000000000046}")
public interface ExplorerEventsListener {
    /**
     * <p>id(0xf001)</p>
     */
    @ComEventCallback(dispid = 0xf001)
    void Activate();
            
    /**
     * <p>id(0xf002)</p>
     */
    @ComEventCallback(dispid = 0xf002)
    void FolderSwitch();
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComEventCallback(dispid = 0xf003)
    void BeforeFolderSwitch(com.sun.jna.platform.win32.COM.util.IDispatch NewFolder,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComEventCallback(dispid = 0xf004)
    void ViewSwitch();
            
    /**
     * <p>id(0xf005)</p>
     */
    @ComEventCallback(dispid = 0xf005)
    void BeforeViewSwitch(Object NewView,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComEventCallback(dispid = 0xf006)
    void Deactivate();
            
    /**
     * <p>id(0xf007)</p>
     */
    @ComEventCallback(dispid = 0xf007)
    void SelectionChange();
            
    /**
     * <p>id(0xf008)</p>
     */
    @ComEventCallback(dispid = 0xf008)
    void Close();
            
    
}