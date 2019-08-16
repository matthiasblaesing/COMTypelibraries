
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630F4-0000-0000-C000-000000000046})</p>
 */
public abstract class NavigationGroupsEvents_12Handler extends AbstractComEventCallbackListener implements NavigationGroupsEvents_12 {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xfbca)</p>
     */
    @Override
    public void SelectedChange(NavigationFolder NavigationFolder){
    }
            
    /**
     * <p>id(0xfbcb)</p>
     */
    @Override
    public void NavigationFolderAdd(NavigationFolder NavigationFolder){
    }
            
    /**
     * <p>id(0xfbcc)</p>
     */
    @Override
    public void NavigationFolderRemove(){
    }
            
    
}