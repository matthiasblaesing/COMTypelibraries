
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x81d)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "OLAP", dispId = 0x81d)
    Boolean getOLAP();
            
    /**
     * <p>id(0x2ad)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "SourceType", dispId = 0x2ad)
    XlPivotTableSourceType getSourceType();
            
    /**
     * <p>id(0x9f0)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    WorkbookConnection getWorkbookConnection();
            
    /**
     * <p>id(0xb41)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Slicers", dispId = 0xb41)
    Slicers getSlicers();
            
    /**
     * <p>id(0x2b2)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "PivotTables", dispId = 0x2b2)
    SlicerPivotTables getPivotTables();
            
    /**
     * <p>id(0xb9e)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "SlicerCacheLevels", dispId = 0xb9e)
    SlicerCacheLevels getSlicerCacheLevels();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0xb9f)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "VisibleSlicerItems", dispId = 0xb9f)
    SlicerItems getVisibleSlicerItems();
            
    /**
     * <p>id(0xba0)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "VisibleSlicerItemsList", dispId = 0xba0)
    Object getVisibleSlicerItemsList();
            
    /**
     * <p>id(0xba0)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "VisibleSlicerItemsList", dispId = 0xba0)
    void setVisibleSlicerItemsList(Object param0);
            
    /**
     * <p>id(0xba1)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "SlicerItems", dispId = 0xba1)
    SlicerItems getSlicerItems();
            
    /**
     * <p>id(0xba2)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "CrossFilterType", dispId = 0xba2)
    XlSlicerCrossFilterType getCrossFilterType();
            
    /**
     * <p>id(0xba2)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code XlSlicerCrossFilterType}
     */
    @ComProperty(name = "CrossFilterType", dispId = 0xba2)
    void setCrossFilterType(XlSlicerCrossFilterType param0);
            
    /**
     * <p>id(0xba3)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "SortItems", dispId = 0xba3)
    XlSlicerSort getSortItems();
            
    /**
     * <p>id(0xba3)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code XlSlicerSort}
     */
    @ComProperty(name = "SortItems", dispId = 0xba3)
    void setSortItems(XlSlicerSort param0);
            
    /**
     * <p>id(0x2d1)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    String getSourceName();
            
    /**
     * <p>id(0xa0e)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "SortUsingCustomLists", dispId = 0xa0e)
    Boolean getSortUsingCustomLists();
            
    /**
     * <p>id(0xa0e)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SortUsingCustomLists", dispId = 0xa0e)
    void setSortUsingCustomLists(Boolean param0);
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "ShowAllItems", dispId = 0x1c4)
    Boolean getShowAllItems();
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAllItems", dispId = 0x1c4)
    void setShowAllItems(Boolean param0);
            
    /**
     * <p>id(0xa22)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "ClearManualFilter", dispId = 0xa22)
    void ClearManualFilter();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0xc28)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "TimelineState", dispId = 0xc28)
    TimelineState getTimelineState();
            
    /**
     * <p>id(0xa01)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "ClearAllFilters", dispId = 0xa01)
    void ClearAllFilters();
            
    /**
     * <p>id(0xc27)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "SlicerCacheType", dispId = 0xc27)
    XlSlicerCacheType getSlicerCacheType();
            
    /**
     * <p>id(0xc29)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "FilterCleared", dispId = 0xc29)
    Boolean getFilterCleared();
            
    /**
     * <p>id(0x35d)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "List", dispId = 0x35d)
    Boolean getList();
            
    /**
     * <p>id(0xc2a)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "RequireManualUpdate", dispId = 0xc2a)
    Boolean getRequireManualUpdate();
            
    /**
     * <p>id(0xc2a)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RequireManualUpdate", dispId = 0xc2a)
    void setRequireManualUpdate(Boolean param0);
            
    /**
     * <p>id(0x8d1)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    ListObject getListObject();
            
    /**
     * <p>id(0xc2b)</p>
     * <p>vtableId(42)</p>
     */
    @ComMethod(name = "ClearDateFilter", dispId = 0xc2b)
    void ClearDateFilter();
            
    
}