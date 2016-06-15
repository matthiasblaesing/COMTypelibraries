
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({7A1BCE11-5783-4C7D-BD02-F3D84AB40E7F})</p>
 */
@ComInterface(iid="{7A1BCE11-5783-4C7D-BD02-F3D84AB40E7F}")
public interface HiLoLines extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60020001)
    String getName();
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComMethod(name = "Select", dispId = 0x60020002)
    void Select();
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComProperty(name = "Border", dispId = 0x60020003)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60020004)
    void Delete();
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020005)
    ChartFormat getFormat();
            
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