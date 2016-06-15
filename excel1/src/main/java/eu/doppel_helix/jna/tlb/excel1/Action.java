
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002448F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002448F-0000-0000-C000-000000000046}")
public interface Action extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlActionType getType();
            
    /**
     * <p>id(0xa98)</p>
     */
    @ComProperty(name = "Coordinate", dispId = 0xa98)
    String getCoordinate();
            
    /**
     * <p>id(0xa99)</p>
     */
    @ComProperty(name = "Content", dispId = 0xa99)
    String getContent();
            
    /**
     * <p>id(0x8a3)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x8a3)
    void Execute();
            
    
}