
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002092E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002092E-0000-0000-C000-000000000046}")
public interface Browser extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Target", dispId = 0x1)
    WdBrowseTarget getTarget();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Target", dispId = 0x1)
    void setTarget(WdBrowseTarget param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Next", dispId = 0x65)
    void Next();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Previous", dispId = 0x66)
    void Previous();
            
    
}