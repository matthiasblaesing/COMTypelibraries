
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002093E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002093E-0000-0000-C000-000000000046}")
public interface Endnote extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Range", dispId = 0x4)
    Range getRange();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Reference", dispId = 0x5)
    Range getReference();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x6)
    Integer getIndex();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xa)
    void Delete();
            
    
}