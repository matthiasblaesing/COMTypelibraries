
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A sink for events arising from asynchronous operations
 *
 * <p>uuid({75718CA0-F029-11D1-A1AC-00C04FB6C223})</p>
 */
public abstract class ISWbemSinkEventsHandler extends AbstractComEventCallbackListener implements ISWbemSinkEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * Event triggered when an Object is available
     *
     * <p>id(0x1)</p>
     */
    @Override
    public void OnObjectReady(ISWbemObject objWbemObject,
            ISWbemNamedValueSet objWbemAsyncContext){
    }
            
    /**
     * Event triggered when an asynchronous operation is completed
     *
     * <p>id(0x2)</p>
     */
    @Override
    public void OnCompleted(WbemErrorEnum iHResult,
            ISWbemObject objWbemErrorObject,
            ISWbemNamedValueSet objWbemAsyncContext){
    }
            
    /**
     * Event triggered to report the progress of an asynchronous operation
     *
     * <p>id(0x3)</p>
     */
    @Override
    public void OnProgress(Integer iUpperBound,
            Integer iCurrent,
            String strMessage,
            ISWbemNamedValueSet objWbemAsyncContext){
    }
            
    /**
     * Event triggered when an object path is available following a Put operation
     *
     * <p>id(0x4)</p>
     */
    @Override
    public void OnObjectPut(ISWbemObjectPath objWbemObjectPath,
            ISWbemNamedValueSet objWbemAsyncContext){
    }
            
    
}