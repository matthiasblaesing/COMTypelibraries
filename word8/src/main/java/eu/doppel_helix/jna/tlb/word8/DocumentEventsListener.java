
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209F6-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209F6-0000-0000-C000-000000000046}")
public interface DocumentEventsListener {
    /**
     * <p>id(0x4)</p>
     */
    @ComEventCallback(dispid = 0x4)
    void New();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComEventCallback(dispid = 0x5)
    void Open();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComEventCallback(dispid = 0x6)
    void Close();
            
    
}