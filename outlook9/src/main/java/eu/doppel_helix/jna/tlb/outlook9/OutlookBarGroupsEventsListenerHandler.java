
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006307B-0000-0000-C000-000000000046})</p>
 */
public abstract class OutlookBarGroupsEventsListenerHandler extends AbstractComEventCallbackListener implements OutlookBarGroupsEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xf001)</p>
     */
    @Override
    public void GroupAdd(OutlookBarGroup NewGroup){
    }
            
    /**
     * <p>id(0xf002)</p>
     */
    @Override
    public void BeforeGroupAdd(VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf003)</p>
     */
    @Override
    public void BeforeGroupRemove(OutlookBarGroup Group,
            VARIANT Cancel){
    }
            
    
}