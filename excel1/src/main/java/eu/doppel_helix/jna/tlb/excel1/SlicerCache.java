
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C4-0000-0000-C000-000000000046}")
public interface SlicerCache extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x81d)</p>
     */
    @ComProperty(name = "OLAP", dispId = 0x81d)
    Boolean getOLAP();
            
    /**
     * <p>id(0x2ad)</p>
     */
    @ComProperty(name = "SourceType", dispId = 0x2ad)
    XlPivotTableSourceType getSourceType();
            
    /**
     * <p>id(0x9f0)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    WorkbookConnection getWorkbookConnection();
            
    /**
     * <p>id(0xb41)</p>
     */
    @ComProperty(name = "Slicers", dispId = 0xb41)
    Slicers getSlicers();
            
    /**
     * <p>id(0x2b2)</p>
     */
    @ComProperty(name = "PivotTables", dispId = 0x2b2)
    SlicerPivotTables getPivotTables();
            
    /**
     * <p>id(0xb9e)</p>
     */
    @ComProperty(name = "SlicerCacheLevels", dispId = 0xb9e)
    SlicerCacheLevels getSlicerCacheLevels();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0xb9f)</p>
     */
    @ComProperty(name = "VisibleSlicerItems", dispId = 0xb9f)
    SlicerItems getVisibleSlicerItems();
            
    /**
     * <p>id(0xba0)</p>
     */
    @ComProperty(name = "VisibleSlicerItemsList", dispId = 0xba0)
    Object getVisibleSlicerItemsList();
            
    /**
     * <p>id(0xba0)</p>
     */
    @ComProperty(name = "VisibleSlicerItemsList", dispId = 0xba0)
    void setVisibleSlicerItemsList(Object param0);
            
    /**
     * <p>id(0xba1)</p>
     */
    @ComProperty(name = "SlicerItems", dispId = 0xba1)
    SlicerItems getSlicerItems();
            
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
     * <p>id(0x2d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    String getSourceName();
            
    /**
     * <p>id(0xa0e)</p>
     */
    @ComProperty(name = "SortUsingCustomLists", dispId = 0xa0e)
    Boolean getSortUsingCustomLists();
            
    /**
     * <p>id(0xa0e)</p>
     */
    @ComProperty(name = "SortUsingCustomLists", dispId = 0xa0e)
    void setSortUsingCustomLists(Boolean param0);
            
    /**
     * <p>id(0x1c4)</p>
     */
    @ComProperty(name = "ShowAllItems", dispId = 0x1c4)
    Boolean getShowAllItems();
            
    /**
     * <p>id(0x1c4)</p>
     */
    @ComProperty(name = "ShowAllItems", dispId = 0x1c4)
    void setShowAllItems(Boolean param0);
            
    /**
     * <p>id(0xa22)</p>
     */
    @ComMethod(name = "ClearManualFilter", dispId = 0xa22)
    void ClearManualFilter();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0xc28)</p>
     */
    @ComProperty(name = "TimelineState", dispId = 0xc28)
    TimelineState getTimelineState();
            
    /**
     * <p>id(0xa01)</p>
     */
    @ComMethod(name = "ClearAllFilters", dispId = 0xa01)
    void ClearAllFilters();
            
    /**
     * <p>id(0xc27)</p>
     */
    @ComProperty(name = "SlicerCacheType", dispId = 0xc27)
    XlSlicerCacheType getSlicerCacheType();
            
    /**
     * <p>id(0xc29)</p>
     */
    @ComProperty(name = "FilterCleared", dispId = 0xc29)
    Boolean getFilterCleared();
            
    /**
     * <p>id(0x35d)</p>
     */
    @ComProperty(name = "List", dispId = 0x35d)
    Boolean getList();
            
    /**
     * <p>id(0xc2a)</p>
     */
    @ComProperty(name = "RequireManualUpdate", dispId = 0xc2a)
    Boolean getRequireManualUpdate();
            
    /**
     * <p>id(0xc2a)</p>
     */
    @ComProperty(name = "RequireManualUpdate", dispId = 0xc2a)
    void setRequireManualUpdate(Boolean param0);
            
    /**
     * <p>id(0x8d1)</p>
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    ListObject getListObject();
            
    /**
     * <p>id(0xc2b)</p>
     */
    @ComMethod(name = "ClearDateFilter", dispId = 0xc2b)
    void ClearDateFilter();
            
    
}