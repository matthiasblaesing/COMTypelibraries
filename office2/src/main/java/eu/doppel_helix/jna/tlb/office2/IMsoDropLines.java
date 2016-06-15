
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C172C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C172C-0000-0000-C000-000000000046}")
public interface IMsoDropLines extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60020000)
    String getName();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComMethod(name = "Select", dispId = 0x60020001)
    void Select();
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60020002)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComProperty(name = "Border", dispId = 0x60020003)
    IMsoBorder getBorder();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60020004)
    void Delete();
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020005)
    IMsoChartFormat getFormat();
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    
}