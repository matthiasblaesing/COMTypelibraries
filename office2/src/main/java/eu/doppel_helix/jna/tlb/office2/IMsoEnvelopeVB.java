
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672AC-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000672AC-0000-0000-C000-000000000046}")
public interface IMsoEnvelopeVB extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Introduction", dispId = 0x1)
    String getIntroduction();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Introduction", dispId = 0x1)
    void setIntroduction(String param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Item", dispId = 0x2)
    com.sun.jna.platform.win32.COM.util.IDispatch getItem();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x4)
    com.sun.jna.platform.win32.COM.util.IDispatch getCommandBars();
            
    
}