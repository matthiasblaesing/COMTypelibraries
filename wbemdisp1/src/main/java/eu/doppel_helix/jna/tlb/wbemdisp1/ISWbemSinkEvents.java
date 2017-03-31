
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A sink for events arising from asynchronous operations
 *
 * <p>uuid({75718CA0-F029-11D1-A1AC-00C04FB6C223})</p>
 */
@ComInterface(iid="{75718CA0-F029-11D1-A1AC-00C04FB6C223}")
public interface ISWbemSinkEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Event triggered when an Object is available
     *
     * <p>id(0x1)</p>
     * @param objWbemObject [] {@code ISWbemObject}
     * @param objWbemAsyncContext [] {@code ISWbemNamedValueSet}
     */
    @ComMethod(name = "OnObjectReady", dispId = 0x1)
    void OnObjectReady(ISWbemObject objWbemObject,
            ISWbemNamedValueSet objWbemAsyncContext);
            
    /**
     * Event triggered when an asynchronous operation is completed
     *
     * <p>id(0x2)</p>
     * @param iHResult [] {@code WbemErrorEnum}
     * @param objWbemErrorObject [] {@code ISWbemObject}
     * @param objWbemAsyncContext [] {@code ISWbemNamedValueSet}
     */
    @ComMethod(name = "OnCompleted", dispId = 0x2)
    void OnCompleted(WbemErrorEnum iHResult,
            ISWbemObject objWbemErrorObject,
            ISWbemNamedValueSet objWbemAsyncContext);
            
    /**
     * Event triggered to report the progress of an asynchronous operation
     *
     * <p>id(0x3)</p>
     * @param iUpperBound [] {@code Integer}
     * @param iCurrent [] {@code Integer}
     * @param strMessage [] {@code String}
     * @param objWbemAsyncContext [] {@code ISWbemNamedValueSet}
     */
    @ComMethod(name = "OnProgress", dispId = 0x3)
    void OnProgress(Integer iUpperBound,
            Integer iCurrent,
            String strMessage,
            ISWbemNamedValueSet objWbemAsyncContext);
            
    /**
     * Event triggered when an object path is available following a Put operation
     *
     * <p>id(0x4)</p>
     * @param objWbemObjectPath [] {@code ISWbemObjectPath}
     * @param objWbemAsyncContext [] {@code ISWbemNamedValueSet}
     */
    @ComMethod(name = "OnObjectPut", dispId = 0x4)
    void OnObjectPut(ISWbemObjectPath objWbemObjectPath,
            ISWbemNamedValueSet objWbemAsyncContext);
            
    
}