
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209F3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209F3-0000-0000-C000-000000000046}")
public interface OCXEvents {
    /**
     * <p>id(0x800100e0)</p>
     */
    @ComMethod(name = "GotFocus", dispId = 0x800100e0)
    void GotFocus();
            
    /**
     * <p>id(0x800100e1)</p>
     */
    @ComMethod(name = "LostFocus", dispId = 0x800100e1)
    void LostFocus();
            
    
}