
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024471-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024471-0001-0000-C000-000000000046}")
public interface IListObject {
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
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x767)</p>
     */
    @ComMethod(name = "Publish", dispId = 0x767)
    com.sun.jna.platform.win32.WinNT.HRESULT Publish(Object Target,
            Boolean LinkSource,
            VARIANT RHS);
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    com.sun.jna.platform.win32.WinNT.HRESULT Refresh();
            
    /**
     * <p>id(0x904)</p>
     */
    @ComMethod(name = "Unlink", dispId = 0x904)
    com.sun.jna.platform.win32.WinNT.HRESULT Unlink();
            
    /**
     * <p>id(0x905)</p>
     */
    @ComMethod(name = "Unlist", dispId = 0x905)
    com.sun.jna.platform.win32.WinNT.HRESULT Unlist();
            
    /**
     * <p>id(0x906)</p>
     */
    @ComMethod(name = "UpdateChanges", dispId = 0x906)
    com.sun.jna.platform.win32.WinNT.HRESULT UpdateChanges(XlListConflict iConflictType);
            
    /**
     * <p>id(0x100)</p>
     */
    @ComMethod(name = "Resize", dispId = 0x100)
    com.sun.jna.platform.win32.WinNT.HRESULT Resize(Range Range);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x908)</p>
     */
    @ComProperty(name = "Active", dispId = 0x908)
    com.sun.jna.platform.win32.WinNT.HRESULT getActive(VARIANT RHS);
            
    /**
     * <p>id(0x2c1)</p>
     */
    @ComProperty(name = "DataBodyRange", dispId = 0x2c1)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataBodyRange(VARIANT RHS);
            
    /**
     * <p>id(0x6ee)</p>
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayRightToLeft(VARIANT RHS);
            
    /**
     * <p>id(0x909)</p>
     */
    @ComProperty(name = "HeaderRowRange", dispId = 0x909)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeaderRowRange(VARIANT RHS);
            
    /**
     * <p>id(0x90a)</p>
     */
    @ComProperty(name = "InsertRowRange", dispId = 0x90a)
    com.sun.jna.platform.win32.WinNT.HRESULT getInsertRowRange(VARIANT RHS);
            
    /**
     * <p>id(0x90b)</p>
     */
    @ComProperty(name = "ListColumns", dispId = 0x90b)
    com.sun.jna.platform.win32.WinNT.HRESULT getListColumns(VARIANT RHS);
            
    /**
     * <p>id(0x90c)</p>
     */
    @ComProperty(name = "ListRows", dispId = 0x90c)
    com.sun.jna.platform.win32.WinNT.HRESULT getListRows(VARIANT RHS);
            
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
     * <p>id(0x56a)</p>
     */
    @ComProperty(name = "QueryTable", dispId = 0x56a)
    com.sun.jna.platform.win32.WinNT.HRESULT getQueryTable(VARIANT RHS);
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(VARIANT RHS);
            
    /**
     * <p>id(0x90d)</p>
     */
    @ComProperty(name = "ShowAutoFilter", dispId = 0x90d)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowAutoFilter(VARIANT RHS);
            
    /**
     * <p>id(0x90d)</p>
     */
    @ComProperty(name = "ShowAutoFilter", dispId = 0x90d)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowAutoFilter(Boolean RHS);
            
    /**
     * <p>id(0x90e)</p>
     */
    @ComProperty(name = "ShowTotals", dispId = 0x90e)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowTotals(VARIANT RHS);
            
    /**
     * <p>id(0x90e)</p>
     */
    @ComProperty(name = "ShowTotals", dispId = 0x90e)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowTotals(Boolean RHS);
            
    /**
     * <p>id(0x2ad)</p>
     */
    @ComProperty(name = "SourceType", dispId = 0x2ad)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceType(VARIANT RHS);
            
    /**
     * <p>id(0x90f)</p>
     */
    @ComProperty(name = "TotalsRowRange", dispId = 0x90f)
    com.sun.jna.platform.win32.WinNT.HRESULT getTotalsRowRange(VARIANT RHS);
            
    /**
     * <p>id(0x910)</p>
     */
    @ComProperty(name = "SharePointURL", dispId = 0x910)
    com.sun.jna.platform.win32.WinNT.HRESULT getSharePointURL(VARIANT RHS);
            
    /**
     * <p>id(0x8cd)</p>
     */
    @ComProperty(name = "XmlMap", dispId = 0x8cd)
    com.sun.jna.platform.win32.WinNT.HRESULT getXmlMap(VARIANT RHS);
            
    /**
     * <p>id(0xa75)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0xa75)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayName(VARIANT RHS);
            
    /**
     * <p>id(0xa75)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0xa75)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayName(String RHS);
            
    /**
     * <p>id(0xa76)</p>
     */
    @ComProperty(name = "ShowHeaders", dispId = 0xa76)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowHeaders(VARIANT RHS);
            
    /**
     * <p>id(0xa76)</p>
     */
    @ComProperty(name = "ShowHeaders", dispId = 0xa76)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowHeaders(Boolean RHS);
            
    /**
     * <p>id(0x319)</p>
     */
    @ComProperty(name = "AutoFilter", dispId = 0x319)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoFilter(VARIANT RHS);
            
    /**
     * <p>id(0x5e0)</p>
     */
    @ComProperty(name = "TableStyle", dispId = 0x5e0)
    com.sun.jna.platform.win32.WinNT.HRESULT getTableStyle(VARIANT RHS);
            
    /**
     * <p>id(0x5e0)</p>
     */
    @ComProperty(name = "TableStyle", dispId = 0x5e0)
    com.sun.jna.platform.win32.WinNT.HRESULT setTableStyle(Object RHS);
            
    /**
     * <p>id(0xa77)</p>
     */
    @ComProperty(name = "ShowTableStyleFirstColumn", dispId = 0xa77)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowTableStyleFirstColumn(VARIANT RHS);
            
    /**
     * <p>id(0xa77)</p>
     */
    @ComProperty(name = "ShowTableStyleFirstColumn", dispId = 0xa77)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowTableStyleFirstColumn(Boolean RHS);
            
    /**
     * <p>id(0xa03)</p>
     */
    @ComProperty(name = "ShowTableStyleLastColumn", dispId = 0xa03)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowTableStyleLastColumn(VARIANT RHS);
            
    /**
     * <p>id(0xa03)</p>
     */
    @ComProperty(name = "ShowTableStyleLastColumn", dispId = 0xa03)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowTableStyleLastColumn(Boolean RHS);
            
    /**
     * <p>id(0xa04)</p>
     */
    @ComProperty(name = "ShowTableStyleRowStripes", dispId = 0xa04)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowTableStyleRowStripes(VARIANT RHS);
            
    /**
     * <p>id(0xa04)</p>
     */
    @ComProperty(name = "ShowTableStyleRowStripes", dispId = 0xa04)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowTableStyleRowStripes(Boolean RHS);
            
    /**
     * <p>id(0xa05)</p>
     */
    @ComProperty(name = "ShowTableStyleColumnStripes", dispId = 0xa05)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowTableStyleColumnStripes(VARIANT RHS);
            
    /**
     * <p>id(0xa05)</p>
     */
    @ComProperty(name = "ShowTableStyleColumnStripes", dispId = 0xa05)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowTableStyleColumnStripes(Boolean RHS);
            
    /**
     * <p>id(0x370)</p>
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    com.sun.jna.platform.win32.WinNT.HRESULT getSort(VARIANT RHS);
            
    /**
     * <p>id(0x38e)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    com.sun.jna.platform.win32.WinNT.HRESULT getComment(VARIANT RHS);
            
    /**
     * <p>id(0x38e)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    com.sun.jna.platform.win32.WinNT.HRESULT setComment(String RHS);
            
    /**
     * <p>id(0xa78)</p>
     */
    @ComMethod(name = "ExportToVisio", dispId = 0xa78)
    com.sun.jna.platform.win32.WinNT.HRESULT ExportToVisio();
            
    /**
     * <p>id(0x763)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    com.sun.jna.platform.win32.WinNT.HRESULT getAlternativeText(VARIANT RHS);
            
    /**
     * <p>id(0x763)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    com.sun.jna.platform.win32.WinNT.HRESULT setAlternativeText(String RHS);
            
    /**
     * <p>id(0x111)</p>
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    com.sun.jna.platform.win32.WinNT.HRESULT getSummary(VARIANT RHS);
            
    /**
     * <p>id(0x111)</p>
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    com.sun.jna.platform.win32.WinNT.HRESULT setSummary(String RHS);
            
    /**
     * <p>id(0xc17)</p>
     */
    @ComProperty(name = "TableObject", dispId = 0xc17)
    com.sun.jna.platform.win32.WinNT.HRESULT getTableObject(VARIANT RHS);
            
    /**
     * <p>id(0xb41)</p>
     */
    @ComProperty(name = "Slicers", dispId = 0xb41)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicers(VARIANT RHS);
            
    /**
     * <p>id(0xc18)</p>
     */
    @ComProperty(name = "ShowAutoFilterDropDown", dispId = 0xc18)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowAutoFilterDropDown(VARIANT RHS);
            
    /**
     * <p>id(0xc18)</p>
     */
    @ComProperty(name = "ShowAutoFilterDropDown", dispId = 0xc18)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowAutoFilterDropDown(Boolean RHS);
            
    
}