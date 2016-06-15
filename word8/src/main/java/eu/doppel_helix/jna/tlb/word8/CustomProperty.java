
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({B923FDE0-F08C-11D3-91B0-00105A0A19FD})</p>
 */
@ComInterface(iid="{B923FDE0-F08C-11D3-91B0-00105A0A19FD}")
public interface CustomProperty extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    String getValue();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(String param0);
            
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
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xb)
    void Delete();
            
    
}