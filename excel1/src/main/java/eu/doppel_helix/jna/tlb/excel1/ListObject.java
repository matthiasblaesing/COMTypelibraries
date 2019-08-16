
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024471-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024471-0000-0000-C000-000000000046}")
public interface ListObject extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x75)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x767)</p>
     * <p>vtableId(11)</p>
     * @param Target [in] {@code Object}
     * @param LinkSource [in] {@code Boolean}
     */
    @ComMethod(name = "Publish", dispId = 0x767)
    String Publish(Object Target,
            Boolean LinkSource);
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    void Refresh();
            
    /**
     * <p>id(0x904)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Unlink", dispId = 0x904)
    void Unlink();
            
    /**
     * <p>id(0x905)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Unlist", dispId = 0x905)
    void Unlist();
            
    /**
     * <p>id(0x906)</p>
     * <p>vtableId(15)</p>
     * @param iConflictType [in, optional] {@code XlListConflict}
     */
    @ComMethod(name = "UpdateChanges", dispId = 0x906)
    void UpdateChanges(XlListConflict iConflictType);
            
    /**
     * <p>id(0x100)</p>
     * <p>vtableId(16)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "Resize", dispId = 0x100)
    void Resize(Range Range);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x908)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Active", dispId = 0x908)
    Boolean getActive();
            
    /**
     * <p>id(0x2c1)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "DataBodyRange", dispId = 0x2c1)
    Range getDataBodyRange();
            
    /**
     * <p>id(0x6ee)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    Boolean getDisplayRightToLeft();
            
    /**
     * <p>id(0x909)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "HeaderRowRange", dispId = 0x909)
    Range getHeaderRowRange();
            
    /**
     * <p>id(0x90a)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "InsertRowRange", dispId = 0x90a)
    Range getInsertRowRange();
            
    /**
     * <p>id(0x90b)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ListColumns", dispId = 0x90b)
    ListColumns getListColumns();
            
    /**
     * <p>id(0x90c)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "ListRows", dispId = 0x90c)
    ListRows getListRows();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x56a)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "QueryTable", dispId = 0x56a)
    QueryTable getQueryTable();
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange();
            
    /**
     * <p>id(0x90d)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "ShowAutoFilter", dispId = 0x90d)
    Boolean getShowAutoFilter();
            
    /**
     * <p>id(0x90d)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAutoFilter", dispId = 0x90d)
    void setShowAutoFilter(Boolean param0);
            
    /**
     * <p>id(0x90e)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "ShowTotals", dispId = 0x90e)
    Boolean getShowTotals();
            
    /**
     * <p>id(0x90e)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTotals", dispId = 0x90e)
    void setShowTotals(Boolean param0);
            
    /**
     * <p>id(0x2ad)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "SourceType", dispId = 0x2ad)
    XlListObjectSourceType getSourceType();
            
    /**
     * <p>id(0x90f)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "TotalsRowRange", dispId = 0x90f)
    Range getTotalsRowRange();
            
    /**
     * <p>id(0x910)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "SharePointURL", dispId = 0x910)
    String getSharePointURL();
            
    /**
     * <p>id(0x8cd)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "XmlMap", dispId = 0x8cd)
    XmlMap getXmlMap();
            
    /**
     * <p>id(0xa75)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0xa75)
    String getDisplayName();
            
    /**
     * <p>id(0xa75)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DisplayName", dispId = 0xa75)
    void setDisplayName(String param0);
            
    /**
     * <p>id(0xa76)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "ShowHeaders", dispId = 0xa76)
    Boolean getShowHeaders();
            
    /**
     * <p>id(0xa76)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowHeaders", dispId = 0xa76)
    void setShowHeaders(Boolean param0);
            
    /**
     * <p>id(0x319)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "AutoFilter", dispId = 0x319)
    AutoFilter getAutoFilter();
            
    /**
     * <p>id(0x5e0)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "TableStyle", dispId = 0x5e0)
    Object getTableStyle();
            
    /**
     * <p>id(0x5e0)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "TableStyle", dispId = 0x5e0)
    void setTableStyle(Object param0);
            
    /**
     * <p>id(0xa77)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "ShowTableStyleFirstColumn", dispId = 0xa77)
    Boolean getShowTableStyleFirstColumn();
            
    /**
     * <p>id(0xa77)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleFirstColumn", dispId = 0xa77)
    void setShowTableStyleFirstColumn(Boolean param0);
            
    /**
     * <p>id(0xa03)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "ShowTableStyleLastColumn", dispId = 0xa03)
    Boolean getShowTableStyleLastColumn();
            
    /**
     * <p>id(0xa03)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleLastColumn", dispId = 0xa03)
    void setShowTableStyleLastColumn(Boolean param0);
            
    /**
     * <p>id(0xa04)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "ShowTableStyleRowStripes", dispId = 0xa04)
    Boolean getShowTableStyleRowStripes();
            
    /**
     * <p>id(0xa04)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleRowStripes", dispId = 0xa04)
    void setShowTableStyleRowStripes(Boolean param0);
            
    /**
     * <p>id(0xa05)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "ShowTableStyleColumnStripes", dispId = 0xa05)
    Boolean getShowTableStyleColumnStripes();
            
    /**
     * <p>id(0xa05)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleColumnStripes", dispId = 0xa05)
    void setShowTableStyleColumnStripes(Boolean param0);
            
    /**
     * <p>id(0x370)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    Sort getSort();
            
    /**
     * <p>id(0x38e)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    String getComment();
            
    /**
     * <p>id(0x38e)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    void setComment(String param0);
            
    /**
     * <p>id(0xa78)</p>
     * <p>vtableId(55)</p>
     */
    @ComMethod(name = "ExportToVisio", dispId = 0xa78)
    void ExportToVisio();
            
    /**
     * <p>id(0x763)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    String getAlternativeText();
            
    /**
     * <p>id(0x763)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    void setAlternativeText(String param0);
            
    /**
     * <p>id(0x111)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    String getSummary();
            
    /**
     * <p>id(0x111)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    void setSummary(String param0);
            
    /**
     * <p>id(0xc17)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "TableObject", dispId = 0xc17)
    TableObject getTableObject();
            
    /**
     * <p>id(0xb41)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Slicers", dispId = 0xb41)
    Slicers getSlicers();
            
    /**
     * <p>id(0xc18)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "ShowAutoFilterDropDown", dispId = 0xc18)
    Boolean getShowAutoFilterDropDown();
            
    /**
     * <p>id(0xc18)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAutoFilterDropDown", dispId = 0xc18)
    void setShowAutoFilterDropDown(Boolean param0);
            
    
}