
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024471-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024471-0000-0000-C000-000000000046}")
public interface ListObject {
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
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x767)</p>
     */
    @ComMethod(name = "Publish", dispId = 0x767)
    String Publish(Object Target,
            Boolean LinkSource);
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    void Refresh();
            
    /**
     * <p>id(0x904)</p>
     */
    @ComMethod(name = "Unlink", dispId = 0x904)
    void Unlink();
            
    /**
     * <p>id(0x905)</p>
     */
    @ComMethod(name = "Unlist", dispId = 0x905)
    void Unlist();
            
    /**
     * <p>id(0x906)</p>
     */
    @ComMethod(name = "UpdateChanges", dispId = 0x906)
    void UpdateChanges(XlListConflict iConflictType);
            
    /**
     * <p>id(0x100)</p>
     */
    @ComMethod(name = "Resize", dispId = 0x100)
    void Resize(Range Range);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x908)</p>
     */
    @ComProperty(name = "Active", dispId = 0x908)
    Boolean getActive();
            
    /**
     * <p>id(0x2c1)</p>
     */
    @ComProperty(name = "DataBodyRange", dispId = 0x2c1)
    Range getDataBodyRange();
            
    /**
     * <p>id(0x6ee)</p>
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    Boolean getDisplayRightToLeft();
            
    /**
     * <p>id(0x909)</p>
     */
    @ComProperty(name = "HeaderRowRange", dispId = 0x909)
    Range getHeaderRowRange();
            
    /**
     * <p>id(0x90a)</p>
     */
    @ComProperty(name = "InsertRowRange", dispId = 0x90a)
    Range getInsertRowRange();
            
    /**
     * <p>id(0x90b)</p>
     */
    @ComProperty(name = "ListColumns", dispId = 0x90b)
    ListColumns getListColumns();
            
    /**
     * <p>id(0x90c)</p>
     */
    @ComProperty(name = "ListRows", dispId = 0x90c)
    ListRows getListRows();
            
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
     * <p>id(0x56a)</p>
     */
    @ComProperty(name = "QueryTable", dispId = 0x56a)
    QueryTable getQueryTable();
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange();
            
    /**
     * <p>id(0x90d)</p>
     */
    @ComProperty(name = "ShowAutoFilter", dispId = 0x90d)
    Boolean getShowAutoFilter();
            
    /**
     * <p>id(0x90d)</p>
     */
    @ComProperty(name = "ShowAutoFilter", dispId = 0x90d)
    void setShowAutoFilter(Boolean param0);
            
    /**
     * <p>id(0x90e)</p>
     */
    @ComProperty(name = "ShowTotals", dispId = 0x90e)
    Boolean getShowTotals();
            
    /**
     * <p>id(0x90e)</p>
     */
    @ComProperty(name = "ShowTotals", dispId = 0x90e)
    void setShowTotals(Boolean param0);
            
    /**
     * <p>id(0x2ad)</p>
     */
    @ComProperty(name = "SourceType", dispId = 0x2ad)
    XlListObjectSourceType getSourceType();
            
    /**
     * <p>id(0x90f)</p>
     */
    @ComProperty(name = "TotalsRowRange", dispId = 0x90f)
    Range getTotalsRowRange();
            
    /**
     * <p>id(0x910)</p>
     */
    @ComProperty(name = "SharePointURL", dispId = 0x910)
    String getSharePointURL();
            
    /**
     * <p>id(0x8cd)</p>
     */
    @ComProperty(name = "XmlMap", dispId = 0x8cd)
    XmlMap getXmlMap();
            
    /**
     * <p>id(0xa75)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0xa75)
    String getDisplayName();
            
    /**
     * <p>id(0xa75)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0xa75)
    void setDisplayName(String param0);
            
    /**
     * <p>id(0xa76)</p>
     */
    @ComProperty(name = "ShowHeaders", dispId = 0xa76)
    Boolean getShowHeaders();
            
    /**
     * <p>id(0xa76)</p>
     */
    @ComProperty(name = "ShowHeaders", dispId = 0xa76)
    void setShowHeaders(Boolean param0);
            
    /**
     * <p>id(0x319)</p>
     */
    @ComProperty(name = "AutoFilter", dispId = 0x319)
    AutoFilter getAutoFilter();
            
    /**
     * <p>id(0x5e0)</p>
     */
    @ComProperty(name = "TableStyle", dispId = 0x5e0)
    Object getTableStyle();
            
    /**
     * <p>id(0x5e0)</p>
     */
    @ComProperty(name = "TableStyle", dispId = 0x5e0)
    void setTableStyle(Object param0);
            
    /**
     * <p>id(0xa77)</p>
     */
    @ComProperty(name = "ShowTableStyleFirstColumn", dispId = 0xa77)
    Boolean getShowTableStyleFirstColumn();
            
    /**
     * <p>id(0xa77)</p>
     */
    @ComProperty(name = "ShowTableStyleFirstColumn", dispId = 0xa77)
    void setShowTableStyleFirstColumn(Boolean param0);
            
    /**
     * <p>id(0xa03)</p>
     */
    @ComProperty(name = "ShowTableStyleLastColumn", dispId = 0xa03)
    Boolean getShowTableStyleLastColumn();
            
    /**
     * <p>id(0xa03)</p>
     */
    @ComProperty(name = "ShowTableStyleLastColumn", dispId = 0xa03)
    void setShowTableStyleLastColumn(Boolean param0);
            
    /**
     * <p>id(0xa04)</p>
     */
    @ComProperty(name = "ShowTableStyleRowStripes", dispId = 0xa04)
    Boolean getShowTableStyleRowStripes();
            
    /**
     * <p>id(0xa04)</p>
     */
    @ComProperty(name = "ShowTableStyleRowStripes", dispId = 0xa04)
    void setShowTableStyleRowStripes(Boolean param0);
            
    /**
     * <p>id(0xa05)</p>
     */
    @ComProperty(name = "ShowTableStyleColumnStripes", dispId = 0xa05)
    Boolean getShowTableStyleColumnStripes();
            
    /**
     * <p>id(0xa05)</p>
     */
    @ComProperty(name = "ShowTableStyleColumnStripes", dispId = 0xa05)
    void setShowTableStyleColumnStripes(Boolean param0);
            
    /**
     * <p>id(0x370)</p>
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    Sort getSort();
            
    /**
     * <p>id(0x38e)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    String getComment();
            
    /**
     * <p>id(0x38e)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    void setComment(String param0);
            
    /**
     * <p>id(0xa78)</p>
     */
    @ComMethod(name = "ExportToVisio", dispId = 0xa78)
    void ExportToVisio();
            
    /**
     * <p>id(0x763)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    String getAlternativeText();
            
    /**
     * <p>id(0x763)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    void setAlternativeText(String param0);
            
    /**
     * <p>id(0x111)</p>
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    String getSummary();
            
    /**
     * <p>id(0x111)</p>
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    void setSummary(String param0);
            
    /**
     * <p>id(0xc17)</p>
     */
    @ComProperty(name = "TableObject", dispId = 0xc17)
    TableObject getTableObject();
            
    /**
     * <p>id(0xb41)</p>
     */
    @ComProperty(name = "Slicers", dispId = 0xb41)
    Slicers getSlicers();
            
    /**
     * <p>id(0xc18)</p>
     */
    @ComProperty(name = "ShowAutoFilterDropDown", dispId = 0xc18)
    Boolean getShowAutoFilterDropDown();
            
    /**
     * <p>id(0xc18)</p>
     */
    @ComProperty(name = "ShowAutoFilterDropDown", dispId = 0xc18)
    void setShowAutoFilterDropDown(Boolean param0);
            
    
}