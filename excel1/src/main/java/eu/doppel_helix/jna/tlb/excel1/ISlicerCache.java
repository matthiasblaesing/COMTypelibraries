
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C4-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C4-0001-0000-C000-000000000046}")
public interface ISlicerCache extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x81d)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "OLAP", dispId = 0x81d)
    com.sun.jna.platform.win32.WinNT.HRESULT getOLAP(VARIANT RHS);
            
    /**
     * <p>id(0x2ad)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code XlPivotTableSourceType}
     */
    @ComProperty(name = "SourceType", dispId = 0x2ad)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceType(VARIANT RHS);
            
    /**
     * <p>id(0x9f0)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorkbookConnection(VARIANT RHS);
            
    /**
     * <p>id(0xb41)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Slicers}
     */
    @ComProperty(name = "Slicers", dispId = 0xb41)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicers(VARIANT RHS);
            
    /**
     * <p>id(0x2b2)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code SlicerPivotTables}
     */
    @ComProperty(name = "PivotTables", dispId = 0x2b2)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotTables(VARIANT RHS);
            
    /**
     * <p>id(0xb9e)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code SlicerCacheLevels}
     */
    @ComProperty(name = "SlicerCacheLevels", dispId = 0xb9e)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerCacheLevels(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0xb9f)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code SlicerItems}
     */
    @ComProperty(name = "VisibleSlicerItems", dispId = 0xb9f)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleSlicerItems(VARIANT RHS);
            
    /**
     * <p>id(0xba0)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "VisibleSlicerItemsList", dispId = 0xba0)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleSlicerItemsList(VARIANT RHS);
            
    /**
     * <p>id(0xba0)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "VisibleSlicerItemsList", dispId = 0xba0)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisibleSlicerItemsList(Object RHS);
            
    /**
     * <p>id(0xba1)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code SlicerItems}
     */
    @ComProperty(name = "SlicerItems", dispId = 0xba1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerItems(VARIANT RHS);
            
    /**
     * <p>id(0xba2)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code XlSlicerCrossFilterType}
     */
    @ComProperty(name = "CrossFilterType", dispId = 0xba2)
    com.sun.jna.platform.win32.WinNT.HRESULT getCrossFilterType(VARIANT RHS);
            
    /**
     * <p>id(0xba2)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code XlSlicerCrossFilterType}
     */
    @ComProperty(name = "CrossFilterType", dispId = 0xba2)
    com.sun.jna.platform.win32.WinNT.HRESULT setCrossFilterType(XlSlicerCrossFilterType RHS);
            
    /**
     * <p>id(0xba3)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code XlSlicerSort}
     */
    @ComProperty(name = "SortItems", dispId = 0xba3)
    com.sun.jna.platform.win32.WinNT.HRESULT getSortItems(VARIANT RHS);
            
    /**
     * <p>id(0xba3)</p>
     * <p>vtableId(26)</p>
     * @param RHS [in] {@code XlSlicerSort}
     */
    @ComProperty(name = "SortItems", dispId = 0xba3)
    com.sun.jna.platform.win32.WinNT.HRESULT setSortItems(XlSlicerSort RHS);
            
    /**
     * <p>id(0x2d1)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceName(VARIANT RHS);
            
    /**
     * <p>id(0xa0e)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SortUsingCustomLists", dispId = 0xa0e)
    com.sun.jna.platform.win32.WinNT.HRESULT getSortUsingCustomLists(VARIANT RHS);
            
    /**
     * <p>id(0xa0e)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "SortUsingCustomLists", dispId = 0xa0e)
    com.sun.jna.platform.win32.WinNT.HRESULT setSortUsingCustomLists(Boolean RHS);
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowAllItems", dispId = 0x1c4)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowAllItems(VARIANT RHS);
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAllItems", dispId = 0x1c4)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowAllItems(Boolean RHS);
            
    /**
     * <p>id(0xa22)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "ClearManualFilter", dispId = 0xa22)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearManualFilter();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0xc28)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code TimelineState}
     */
    @ComProperty(name = "TimelineState", dispId = 0xc28)
    com.sun.jna.platform.win32.WinNT.HRESULT getTimelineState(VARIANT RHS);
            
    /**
     * <p>id(0xa01)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "ClearAllFilters", dispId = 0xa01)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearAllFilters();
            
    /**
     * <p>id(0xc27)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code XlSlicerCacheType}
     */
    @ComProperty(name = "SlicerCacheType", dispId = 0xc27)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerCacheType(VARIANT RHS);
            
    /**
     * <p>id(0xc29)</p>
     * <p>vtableId(37)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "FilterCleared", dispId = 0xc29)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilterCleared(VARIANT RHS);
            
    /**
     * <p>id(0x35d)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "List", dispId = 0x35d)
    com.sun.jna.platform.win32.WinNT.HRESULT getList(VARIANT RHS);
            
    /**
     * <p>id(0xc2a)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RequireManualUpdate", dispId = 0xc2a)
    com.sun.jna.platform.win32.WinNT.HRESULT getRequireManualUpdate(VARIANT RHS);
            
    /**
     * <p>id(0xc2a)</p>
     * <p>vtableId(40)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RequireManualUpdate", dispId = 0xc2a)
    com.sun.jna.platform.win32.WinNT.HRESULT setRequireManualUpdate(Boolean RHS);
            
    /**
     * <p>id(0x8d1)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code ListObject}
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getListObject(VARIANT RHS);
            
    /**
     * <p>id(0xc2b)</p>
     * <p>vtableId(42)</p>
     */
    @ComMethod(name = "ClearDateFilter", dispId = 0xc2b)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearDateFilter();
            
    
}