
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C4-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C4-0001-0000-C000-000000000046}")
public interface ISlicerCache {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x81d)</p>
     */
    @ComProperty(name = "OLAP", dispId = 0x81d)
    com.sun.jna.platform.win32.WinNT.HRESULT getOLAP(VARIANT RHS);
            
    /**
     * <p>id(0x2ad)</p>
     */
    @ComProperty(name = "SourceType", dispId = 0x2ad)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceType(VARIANT RHS);
            
    /**
     * <p>id(0x9f0)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorkbookConnection(VARIANT RHS);
            
    /**
     * <p>id(0xb41)</p>
     */
    @ComProperty(name = "Slicers", dispId = 0xb41)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicers(VARIANT RHS);
            
    /**
     * <p>id(0x2b2)</p>
     */
    @ComProperty(name = "PivotTables", dispId = 0x2b2)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotTables(VARIANT RHS);
            
    /**
     * <p>id(0xb9e)</p>
     */
    @ComProperty(name = "SlicerCacheLevels", dispId = 0xb9e)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerCacheLevels(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0xb9f)</p>
     */
    @ComProperty(name = "VisibleSlicerItems", dispId = 0xb9f)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleSlicerItems(VARIANT RHS);
            
    /**
     * <p>id(0xba0)</p>
     */
    @ComProperty(name = "VisibleSlicerItemsList", dispId = 0xba0)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleSlicerItemsList(VARIANT RHS);
            
    /**
     * <p>id(0xba0)</p>
     */
    @ComProperty(name = "VisibleSlicerItemsList", dispId = 0xba0)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisibleSlicerItemsList(Object RHS);
            
    /**
     * <p>id(0xba1)</p>
     */
    @ComProperty(name = "SlicerItems", dispId = 0xba1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerItems(VARIANT RHS);
            
    /**
     * <p>id(0xba2)</p>
     */
    @ComProperty(name = "CrossFilterType", dispId = 0xba2)
    com.sun.jna.platform.win32.WinNT.HRESULT getCrossFilterType(VARIANT RHS);
            
    /**
     * <p>id(0xba2)</p>
     */
    @ComProperty(name = "CrossFilterType", dispId = 0xba2)
    com.sun.jna.platform.win32.WinNT.HRESULT setCrossFilterType(XlSlicerCrossFilterType RHS);
            
    /**
     * <p>id(0xba3)</p>
     */
    @ComProperty(name = "SortItems", dispId = 0xba3)
    com.sun.jna.platform.win32.WinNT.HRESULT getSortItems(VARIANT RHS);
            
    /**
     * <p>id(0xba3)</p>
     */
    @ComProperty(name = "SortItems", dispId = 0xba3)
    com.sun.jna.platform.win32.WinNT.HRESULT setSortItems(XlSlicerSort RHS);
            
    /**
     * <p>id(0x2d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceName(VARIANT RHS);
            
    /**
     * <p>id(0xa0e)</p>
     */
    @ComProperty(name = "SortUsingCustomLists", dispId = 0xa0e)
    com.sun.jna.platform.win32.WinNT.HRESULT getSortUsingCustomLists(VARIANT RHS);
            
    /**
     * <p>id(0xa0e)</p>
     */
    @ComProperty(name = "SortUsingCustomLists", dispId = 0xa0e)
    com.sun.jna.platform.win32.WinNT.HRESULT setSortUsingCustomLists(Boolean RHS);
            
    /**
     * <p>id(0x1c4)</p>
     */
    @ComProperty(name = "ShowAllItems", dispId = 0x1c4)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowAllItems(VARIANT RHS);
            
    /**
     * <p>id(0x1c4)</p>
     */
    @ComProperty(name = "ShowAllItems", dispId = 0x1c4)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowAllItems(Boolean RHS);
            
    /**
     * <p>id(0xa22)</p>
     */
    @ComMethod(name = "ClearManualFilter", dispId = 0xa22)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearManualFilter();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0xc28)</p>
     */
    @ComProperty(name = "TimelineState", dispId = 0xc28)
    com.sun.jna.platform.win32.WinNT.HRESULT getTimelineState(VARIANT RHS);
            
    /**
     * <p>id(0xa01)</p>
     */
    @ComMethod(name = "ClearAllFilters", dispId = 0xa01)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearAllFilters();
            
    /**
     * <p>id(0xc27)</p>
     */
    @ComProperty(name = "SlicerCacheType", dispId = 0xc27)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicerCacheType(VARIANT RHS);
            
    /**
     * <p>id(0xc29)</p>
     */
    @ComProperty(name = "FilterCleared", dispId = 0xc29)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilterCleared(VARIANT RHS);
            
    /**
     * <p>id(0x35d)</p>
     */
    @ComProperty(name = "List", dispId = 0x35d)
    com.sun.jna.platform.win32.WinNT.HRESULT getList(VARIANT RHS);
            
    /**
     * <p>id(0xc2a)</p>
     */
    @ComProperty(name = "RequireManualUpdate", dispId = 0xc2a)
    com.sun.jna.platform.win32.WinNT.HRESULT getRequireManualUpdate(VARIANT RHS);
            
    /**
     * <p>id(0xc2a)</p>
     */
    @ComProperty(name = "RequireManualUpdate", dispId = 0xc2a)
    com.sun.jna.platform.win32.WinNT.HRESULT setRequireManualUpdate(Boolean RHS);
            
    /**
     * <p>id(0x8d1)</p>
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getListObject(VARIANT RHS);
            
    /**
     * <p>id(0xc2b)</p>
     */
    @ComMethod(name = "ClearDateFilter", dispId = 0xc2b)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearDateFilter();
            
    
}