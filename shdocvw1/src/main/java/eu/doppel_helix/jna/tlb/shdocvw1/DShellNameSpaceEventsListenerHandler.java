
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({55136806-B2DE-11D1-B9F2-00A0C98BC547})</p>
 */
public abstract class DShellNameSpaceEventsListenerHandler extends AbstractComEventCallbackListener implements DShellNameSpaceEventsListener {
    @Override
    public void errorReceivingCallbackEvent(String string, Exception excptn) {
    }

    /**
     * <p>id(0x1)</p>
     */
    @Override
    public void FavoritesSelectionChange(Integer cItems,
            Integer hItem,
            String strName,
            String strUrl,
            Integer cVisits,
            String strDate,
            Integer fAvailableOffline){
    }
            
    /**
     * <p>id(0x2)</p>
     */
    @Override
    public void SelectionChange(){
    }
            
    /**
     * <p>id(0x3)</p>
     */
    @Override
    public void DoubleClick(){
    }
            
    /**
     * <p>id(0x4)</p>
     */
    @Override
    public void Initialized(){
    }
            
    
}