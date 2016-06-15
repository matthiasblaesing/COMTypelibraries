
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C6-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C6-0000-0000-C000-000000000046}")
public interface SlicerCacheLevel extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xba1)</p>
     */
    @ComProperty(name = "SlicerItems", dispId = 0xba1)
    SlicerItems getSlicerItems();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xba5)</p>
     */
    @ComProperty(name = "Ordinal", dispId = 0xba5)
    Integer getOrdinal();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xba2)</p>
     */
    @ComProperty(name = "CrossFilterType", dispId = 0xba2)
    XlSlicerCrossFilterType getCrossFilterType();
            
    /**
     * <p>id(0xba2)</p>
     */
    @ComProperty(name = "CrossFilterType", dispId = 0xba2)
    void setCrossFilterType(XlSlicerCrossFilterType param0);
            
    /**
     * <p>id(0xba3)</p>
     */
    @ComProperty(name = "SortItems", dispId = 0xba3)
    XlSlicerSort getSortItems();
            
    /**
     * <p>id(0xba3)</p>
     */
    @ComProperty(name = "SortItems", dispId = 0xba3)
    void setSortItems(XlSlicerSort param0);
            
    /**
     * <p>id(0xba0)</p>
     */
    @ComProperty(name = "VisibleSlicerItemsList", dispId = 0xba0)
    Object getVisibleSlicerItemsList();
            
    
}