
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024402-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024402-0000-0000-C000-000000000046}")
public interface VPageBreak extends IUnknown, IRawDispatchHandle, IDispatch {
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
    Worksheet getParent();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x58c)</p>
     */
    @ComMethod(name = "DragOff", dispId = 0x58c)
    void DragOff(XlDirection Direction,
            Integer RegionIndex);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlPageBreak getType();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(XlPageBreak param0);
            
    /**
     * <p>id(0x58e)</p>
     */
    @ComProperty(name = "Extent", dispId = 0x58e)
    XlPageBreakExtent getExtent();
            
    /**
     * <p>id(0x575)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    Range getLocation();
            
    /**
     * <p>id(0x575)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    void setLocation(Range param0);
            
    
}