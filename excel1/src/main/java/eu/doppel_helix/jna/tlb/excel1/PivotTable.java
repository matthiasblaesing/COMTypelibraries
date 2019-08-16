
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020872-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020872-0000-0000-C000-000000000046}")
public interface PivotTable extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2c4)</p>
     * <p>vtableId(10)</p>
     * @param RowFields [in, optional] {@code Object}
     * @param ColumnFields [in, optional] {@code Object}
     * @param PageFields [in, optional] {@code Object}
     * @param AddToTable [in, optional] {@code Object}
     */
    @ComMethod(name = "AddFields", dispId = 0x2c4)
    Object AddFields(Object RowFields,
            Object ColumnFields,
            Object PageFields,
            Object AddToTable);
            
    /**
     * <p>id(0x2c9)</p>
     * <p>vtableId(11)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "ColumnFields", dispId = 0x2c9)
    com.sun.jna.platform.win32.COM.util.IDispatch getColumnFields(Object Index);
            
    /**
     * <p>id(0x2b6)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ColumnGrand", dispId = 0x2b6)
    Boolean getColumnGrand();
            
    /**
     * <p>id(0x2b6)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ColumnGrand", dispId = 0x2b6)
    void setColumnGrand(Boolean param0);
            
    /**
     * <p>id(0x2be)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ColumnRange", dispId = 0x2be)
    Range getColumnRange();
            
    /**
     * <p>id(0x2c2)</p>
     * <p>vtableId(15)</p>
     * @param PageField [in, optional] {@code Object}
     */
    @ComMethod(name = "ShowPages", dispId = 0x2c2)
    Object ShowPages(Object PageField);
            
    /**
     * <p>id(0x2c1)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "DataBodyRange", dispId = 0x2c1)
    Range getDataBodyRange();
            
    /**
     * <p>id(0x2cb)</p>
     * <p>vtableId(17)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "DataFields", dispId = 0x2cb)
    com.sun.jna.platform.win32.COM.util.IDispatch getDataFields(Object Index);
            
    /**
     * <p>id(0x2c0)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "DataLabelRange", dispId = 0x2c0)
    Range getDataLabelRange();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(String param0);
            
    /**
     * <p>id(0x2b7)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "HasAutoFormat", dispId = 0x2b7)
    Boolean getHasAutoFormat();
            
    /**
     * <p>id(0x2b7)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasAutoFormat", dispId = 0x2b7)
    void setHasAutoFormat(Boolean param0);
            
    /**
     * <p>id(0x2c7)</p>
     * <p>vtableId(23)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "HiddenFields", dispId = 0x2c7)
    com.sun.jna.platform.win32.COM.util.IDispatch getHiddenFields(Object Index);
            
    /**
     * <p>id(0x2ba)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "InnerDetail", dispId = 0x2ba)
    String getInnerDetail();
            
    /**
     * <p>id(0x2ba)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "InnerDetail", dispId = 0x2ba)
    void setInnerDetail(String param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x2ca)</p>
     * <p>vtableId(28)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "PageFields", dispId = 0x2ca)
    com.sun.jna.platform.win32.COM.util.IDispatch getPageFields(Object Index);
            
    /**
     * <p>id(0x2bf)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "PageRange", dispId = 0x2bf)
    Range getPageRange();
            
    /**
     * <p>id(0x5ca)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "PageRangeCells", dispId = 0x5ca)
    Range getPageRangeCells();
            
    /**
     * <p>id(0x2ce)</p>
     * <p>vtableId(31)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "PivotFields", dispId = 0x2ce)
    com.sun.jna.platform.win32.COM.util.IDispatch PivotFields(Object Index);
            
    /**
     * <p>id(0x2b8)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "RefreshDate", dispId = 0x2b8)
    java.util.Date getRefreshDate();
            
    /**
     * <p>id(0x2b9)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "RefreshName", dispId = 0x2b9)
    String getRefreshName();
            
    /**
     * <p>id(0x2cd)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "RefreshTable", dispId = 0x2cd)
    Boolean RefreshTable();
            
    /**
     * <p>id(0x2c8)</p>
     * <p>vtableId(35)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "RowFields", dispId = 0x2c8)
    com.sun.jna.platform.win32.COM.util.IDispatch getRowFields(Object Index);
            
    /**
     * <p>id(0x2b5)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "RowGrand", dispId = 0x2b5)
    Boolean getRowGrand();
            
    /**
     * <p>id(0x2b5)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RowGrand", dispId = 0x2b5)
    void setRowGrand(Boolean param0);
            
    /**
     * <p>id(0x2bd)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "RowRange", dispId = 0x2bd)
    Range getRowRange();
            
    /**
     * <p>id(0x2b4)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "SaveData", dispId = 0x2b4)
    Boolean getSaveData();
            
    /**
     * <p>id(0x2b4)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SaveData", dispId = 0x2b4)
    void setSaveData(Boolean param0);
            
    /**
     * <p>id(0x2ae)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    Object getSourceData();
            
    /**
     * <p>id(0x2ae)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    void setSourceData(Object param0);
            
    /**
     * <p>id(0x2bb)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "TableRange1", dispId = 0x2bb)
    Range getTableRange1();
            
    /**
     * <p>id(0x2bc)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "TableRange2", dispId = 0x2bc)
    Range getTableRange2();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(String param0);
            
    /**
     * <p>id(0x2c6)</p>
     * <p>vtableId(47)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "VisibleFields", dispId = 0x2c6)
    com.sun.jna.platform.win32.COM.util.IDispatch getVisibleFields(Object Index);
            
    /**
     * <p>id(0x5cb)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "CacheIndex", dispId = 0x5cb)
    Integer getCacheIndex();
            
    /**
     * <p>id(0x5cb)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CacheIndex", dispId = 0x5cb)
    void setCacheIndex(Integer param0);
            
    /**
     * <p>id(0x5cc)</p>
     * <p>vtableId(50)</p>
     */
    @ComMethod(name = "CalculatedFields", dispId = 0x5cc)
    CalculatedFields CalculatedFields();
            
    /**
     * <p>id(0x5cd)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "DisplayErrorString", dispId = 0x5cd)
    Boolean getDisplayErrorString();
            
    /**
     * <p>id(0x5cd)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayErrorString", dispId = 0x5cd)
    void setDisplayErrorString(Boolean param0);
            
    /**
     * <p>id(0x5ce)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "DisplayNullString", dispId = 0x5ce)
    Boolean getDisplayNullString();
            
    /**
     * <p>id(0x5ce)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayNullString", dispId = 0x5ce)
    void setDisplayNullString(Boolean param0);
            
    /**
     * <p>id(0x5cf)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "EnableDrilldown", dispId = 0x5cf)
    Boolean getEnableDrilldown();
            
    /**
     * <p>id(0x5cf)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableDrilldown", dispId = 0x5cf)
    void setEnableDrilldown(Boolean param0);
            
    /**
     * <p>id(0x5d0)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "EnableFieldDialog", dispId = 0x5d0)
    Boolean getEnableFieldDialog();
            
    /**
     * <p>id(0x5d0)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableFieldDialog", dispId = 0x5d0)
    void setEnableFieldDialog(Boolean param0);
            
    /**
     * <p>id(0x5d1)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "EnableWizard", dispId = 0x5d1)
    Boolean getEnableWizard();
            
    /**
     * <p>id(0x5d1)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableWizard", dispId = 0x5d1)
    void setEnableWizard(Boolean param0);
            
    /**
     * <p>id(0x5d2)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "ErrorString", dispId = 0x5d2)
    String getErrorString();
            
    /**
     * <p>id(0x5d2)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ErrorString", dispId = 0x5d2)
    void setErrorString(String param0);
            
    /**
     * <p>id(0x5d3)</p>
     * <p>vtableId(63)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "GetData", dispId = 0x5d3)
    Double GetData(String Name);
            
    /**
     * <p>id(0x5d4)</p>
     * <p>vtableId(64)</p>
     */
    @ComMethod(name = "ListFormulas", dispId = 0x5d4)
    void ListFormulas();
            
    /**
     * <p>id(0x5d5)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "ManualUpdate", dispId = 0x5d5)
    Boolean getManualUpdate();
            
    /**
     * <p>id(0x5d5)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ManualUpdate", dispId = 0x5d5)
    void setManualUpdate(Boolean param0);
            
    /**
     * <p>id(0x5d6)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "MergeLabels", dispId = 0x5d6)
    Boolean getMergeLabels();
            
    /**
     * <p>id(0x5d6)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MergeLabels", dispId = 0x5d6)
    void setMergeLabels(Boolean param0);
            
    /**
     * <p>id(0x5d7)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "NullString", dispId = 0x5d7)
    String getNullString();
            
    /**
     * <p>id(0x5d7)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NullString", dispId = 0x5d7)
    void setNullString(String param0);
            
    /**
     * <p>id(0x5d8)</p>
     * <p>vtableId(71)</p>
     */
    @ComMethod(name = "PivotCache", dispId = 0x5d8)
    PivotCache PivotCache();
            
    /**
     * <p>id(0x5d9)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "PivotFormulas", dispId = 0x5d9)
    PivotFormulas getPivotFormulas();
            
    /**
     * <p>id(0x2ac)</p>
     * <p>vtableId(73)</p>
     * @param SourceType [in, optional] {@code Object}
     * @param SourceData [in, optional] {@code Object}
     * @param TableDestination [in, optional] {@code Object}
     * @param TableName [in, optional] {@code Object}
     * @param RowGrand [in, optional] {@code Object}
     * @param ColumnGrand [in, optional] {@code Object}
     * @param SaveData [in, optional] {@code Object}
     * @param HasAutoFormat [in, optional] {@code Object}
     * @param AutoPage [in, optional] {@code Object}
     * @param Reserved [in, optional] {@code Object}
     * @param BackgroundQuery [in, optional] {@code Object}
     * @param OptimizeCache [in, optional] {@code Object}
     * @param PageFieldOrder [in, optional] {@code Object}
     * @param PageFieldWrapCount [in, optional] {@code Object}
     * @param ReadData [in, optional] {@code Object}
     * @param Connection [in, optional] {@code Object}
     */
    @ComMethod(name = "PivotTableWizard", dispId = 0x2ac)
    void PivotTableWizard(Object SourceType,
            Object SourceData,
            Object TableDestination,
            Object TableName,
            Object RowGrand,
            Object ColumnGrand,
            Object SaveData,
            Object HasAutoFormat,
            Object AutoPage,
            Object Reserved,
            Object BackgroundQuery,
            Object OptimizeCache,
            Object PageFieldOrder,
            Object PageFieldWrapCount,
            Object ReadData,
            Object Connection);
            
    /**
     * <p>id(0x5da)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "SubtotalHiddenPageItems", dispId = 0x5da)
    Boolean getSubtotalHiddenPageItems();
            
    /**
     * <p>id(0x5da)</p>
     * <p>vtableId(75)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SubtotalHiddenPageItems", dispId = 0x5da)
    void setSubtotalHiddenPageItems(Boolean param0);
            
    /**
     * <p>id(0x595)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "PageFieldOrder", dispId = 0x595)
    Integer getPageFieldOrder();
            
    /**
     * <p>id(0x595)</p>
     * <p>vtableId(77)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PageFieldOrder", dispId = 0x595)
    void setPageFieldOrder(Integer param0);
            
    /**
     * <p>id(0x5db)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "PageFieldStyle", dispId = 0x5db)
    String getPageFieldStyle();
            
    /**
     * <p>id(0x5db)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PageFieldStyle", dispId = 0x5db)
    void setPageFieldStyle(String param0);
            
    /**
     * <p>id(0x596)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "PageFieldWrapCount", dispId = 0x596)
    Integer getPageFieldWrapCount();
            
    /**
     * <p>id(0x596)</p>
     * <p>vtableId(81)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PageFieldWrapCount", dispId = 0x596)
    void setPageFieldWrapCount(Integer param0);
            
    /**
     * <p>id(0x5dc)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    Boolean getPreserveFormatting();
            
    /**
     * <p>id(0x5dc)</p>
     * <p>vtableId(83)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    void setPreserveFormatting(Boolean param0);
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(84)</p>
     * @param Name [in] {@code String}
     * @param Mode [in, optional] {@code XlPTSelectionMode}
     */
    @ComMethod(name = "_PivotSelect", dispId = 0x827)
    void _PivotSelect(String Name,
            XlPTSelectionMode Mode);
            
    /**
     * <p>id(0x5de)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "PivotSelection", dispId = 0x5de)
    String getPivotSelection();
            
    /**
     * <p>id(0x5de)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PivotSelection", dispId = 0x5de)
    void setPivotSelection(String param0);
            
    /**
     * <p>id(0x5df)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "SelectionMode", dispId = 0x5df)
    XlPTSelectionMode getSelectionMode();
            
    /**
     * <p>id(0x5df)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code XlPTSelectionMode}
     */
    @ComProperty(name = "SelectionMode", dispId = 0x5df)
    void setSelectionMode(XlPTSelectionMode param0);
            
    /**
     * <p>id(0x5e0)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "TableStyle", dispId = 0x5e0)
    String getTableStyle();
            
    /**
     * <p>id(0x5e0)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TableStyle", dispId = 0x5e0)
    void setTableStyle(String param0);
            
    /**
     * <p>id(0x5e1)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x5e1)
    String getTag();
            
    /**
     * <p>id(0x5e1)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x5e1)
    void setTag(String param0);
            
    /**
     * <p>id(0x2a8)</p>
     * <p>vtableId(93)</p>
     */
    @ComMethod(name = "Update", dispId = 0x2a8)
    void Update();
            
    /**
     * <p>id(0x5e2)</p>
     * <p>vtableId(94)</p>
     */
    @ComProperty(name = "VacatedStyle", dispId = 0x5e2)
    String getVacatedStyle();
            
    /**
     * <p>id(0x5e2)</p>
     * <p>vtableId(95)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "VacatedStyle", dispId = 0x5e2)
    void setVacatedStyle(String param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(96)</p>
     * @param Format [in] {@code XlPivotFormatType}
     */
    @ComMethod(name = "Format", dispId = 0x74)
    void Format(XlPivotFormatType Format);
            
    /**
     * <p>id(0x72e)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "PrintTitles", dispId = 0x72e)
    Boolean getPrintTitles();
            
    /**
     * <p>id(0x72e)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintTitles", dispId = 0x72e)
    void setPrintTitles(Boolean param0);
            
    /**
     * <p>id(0x72f)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "CubeFields", dispId = 0x72f)
    CubeFields getCubeFields();
            
    /**
     * <p>id(0x730)</p>
     * <p>vtableId(100)</p>
     */
    @ComProperty(name = "GrandTotalName", dispId = 0x730)
    String getGrandTotalName();
            
    /**
     * <p>id(0x730)</p>
     * <p>vtableId(101)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "GrandTotalName", dispId = 0x730)
    void setGrandTotalName(String param0);
            
    /**
     * <p>id(0x731)</p>
     * <p>vtableId(102)</p>
     */
    @ComProperty(name = "SmallGrid", dispId = 0x731)
    Boolean getSmallGrid();
            
    /**
     * <p>id(0x731)</p>
     * <p>vtableId(103)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SmallGrid", dispId = 0x731)
    void setSmallGrid(Boolean param0);
            
    /**
     * <p>id(0x732)</p>
     * <p>vtableId(104)</p>
     */
    @ComProperty(name = "RepeatItemsOnEachPrintedPage", dispId = 0x732)
    Boolean getRepeatItemsOnEachPrintedPage();
            
    /**
     * <p>id(0x732)</p>
     * <p>vtableId(105)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RepeatItemsOnEachPrintedPage", dispId = 0x732)
    void setRepeatItemsOnEachPrintedPage(Boolean param0);
            
    /**
     * <p>id(0x733)</p>
     * <p>vtableId(106)</p>
     */
    @ComProperty(name = "TotalsAnnotation", dispId = 0x733)
    Boolean getTotalsAnnotation();
            
    /**
     * <p>id(0x733)</p>
     * <p>vtableId(107)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TotalsAnnotation", dispId = 0x733)
    void setTotalsAnnotation(Boolean param0);
            
    /**
     * <p>id(0x5dd)</p>
     * <p>vtableId(108)</p>
     * @param Name [in] {@code String}
     * @param Mode [in, optional] {@code XlPTSelectionMode}
     * @param UseStandardName [in, optional] {@code Object}
     */
    @ComMethod(name = "PivotSelect", dispId = 0x5dd)
    void PivotSelect(String Name,
            XlPTSelectionMode Mode,
            Object UseStandardName);
            
    /**
     * <p>id(0x829)</p>
     * <p>vtableId(109)</p>
     */
    @ComProperty(name = "PivotSelectionStandard", dispId = 0x829)
    String getPivotSelectionStandard();
            
    /**
     * <p>id(0x829)</p>
     * <p>vtableId(110)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PivotSelectionStandard", dispId = 0x829)
    void setPivotSelectionStandard(String param0);
            
    /**
     * <p>id(0x82a)</p>
     * <p>vtableId(111)</p>
     * @param DataField [in, optional] {@code Object}
     * @param Field1 [in, optional] {@code Object}
     * @param Item1 [in, optional] {@code Object}
     * @param Field2 [in, optional] {@code Object}
     * @param Item2 [in, optional] {@code Object}
     * @param Field3 [in, optional] {@code Object}
     * @param Item3 [in, optional] {@code Object}
     * @param Field4 [in, optional] {@code Object}
     * @param Item4 [in, optional] {@code Object}
     * @param Field5 [in, optional] {@code Object}
     * @param Item5 [in, optional] {@code Object}
     * @param Field6 [in, optional] {@code Object}
     * @param Item6 [in, optional] {@code Object}
     * @param Field7 [in, optional] {@code Object}
     * @param Item7 [in, optional] {@code Object}
     * @param Field8 [in, optional] {@code Object}
     * @param Item8 [in, optional] {@code Object}
     * @param Field9 [in, optional] {@code Object}
     * @param Item9 [in, optional] {@code Object}
     * @param Field10 [in, optional] {@code Object}
     * @param Item10 [in, optional] {@code Object}
     * @param Field11 [in, optional] {@code Object}
     * @param Item11 [in, optional] {@code Object}
     * @param Field12 [in, optional] {@code Object}
     * @param Item12 [in, optional] {@code Object}
     * @param Field13 [in, optional] {@code Object}
     * @param Item13 [in, optional] {@code Object}
     * @param Field14 [in, optional] {@code Object}
     * @param Item14 [in, optional] {@code Object}
     */
    @ComMethod(name = "GetPivotData", dispId = 0x82a)
    Range GetPivotData(Object DataField,
            Object Field1,
            Object Item1,
            Object Field2,
            Object Item2,
            Object Field3,
            Object Item3,
            Object Field4,
            Object Item4,
            Object Field5,
            Object Item5,
            Object Field6,
            Object Item6,
            Object Field7,
            Object Item7,
            Object Field8,
            Object Item8,
            Object Field9,
            Object Item9,
            Object Field10,
            Object Item10,
            Object Field11,
            Object Item11,
            Object Field12,
            Object Item12,
            Object Field13,
            Object Item13,
            Object Field14,
            Object Item14);
            
    /**
     * <p>id(0x848)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "DataPivotField", dispId = 0x848)
    PivotField getDataPivotField();
            
    /**
     * <p>id(0x849)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "EnableDataValueEditing", dispId = 0x849)
    Boolean getEnableDataValueEditing();
            
    /**
     * <p>id(0x849)</p>
     * <p>vtableId(114)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableDataValueEditing", dispId = 0x849)
    void setEnableDataValueEditing(Boolean param0);
            
    /**
     * <p>id(0x84a)</p>
     * <p>vtableId(115)</p>
     * @param Field [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Caption [in, optional] {@code Object}
     * @param Function [in, optional] {@code Object}
     */
    @ComMethod(name = "AddDataField", dispId = 0x84a)
    PivotField AddDataField(com.sun.jna.platform.win32.COM.util.IDispatch Field,
            Object Caption,
            Object Function);
            
    /**
     * <p>id(0x84b)</p>
     * <p>vtableId(116)</p>
     */
    @ComProperty(name = "MDX", dispId = 0x84b)
    String getMDX();
            
    /**
     * <p>id(0x84c)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "ViewCalculatedMembers", dispId = 0x84c)
    Boolean getViewCalculatedMembers();
            
    /**
     * <p>id(0x84c)</p>
     * <p>vtableId(118)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ViewCalculatedMembers", dispId = 0x84c)
    void setViewCalculatedMembers(Boolean param0);
            
    /**
     * <p>id(0x84d)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "CalculatedMembers", dispId = 0x84d)
    CalculatedMembers getCalculatedMembers();
            
    /**
     * <p>id(0x84e)</p>
     * <p>vtableId(120)</p>
     */
    @ComProperty(name = "DisplayImmediateItems", dispId = 0x84e)
    Boolean getDisplayImmediateItems();
            
    /**
     * <p>id(0x84e)</p>
     * <p>vtableId(121)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayImmediateItems", dispId = 0x84e)
    void setDisplayImmediateItems(Boolean param0);
            
    /**
     * <p>id(0x84f)</p>
     * <p>vtableId(122)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
     */
    @ComMethod(name = "Dummy15", dispId = 0x84f)
    Object Dummy15(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x850)</p>
     * <p>vtableId(123)</p>
     */
    @ComProperty(name = "EnableFieldList", dispId = 0x850)
    Boolean getEnableFieldList();
            
    /**
     * <p>id(0x850)</p>
     * <p>vtableId(124)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableFieldList", dispId = 0x850)
    void setEnableFieldList(Boolean param0);
            
    /**
     * <p>id(0x851)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "VisualTotals", dispId = 0x851)
    Boolean getVisualTotals();
            
    /**
     * <p>id(0x851)</p>
     * <p>vtableId(126)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "VisualTotals", dispId = 0x851)
    void setVisualTotals(Boolean param0);
            
    /**
     * <p>id(0x852)</p>
     * <p>vtableId(127)</p>
     */
    @ComProperty(name = "ShowPageMultipleItemLabel", dispId = 0x852)
    Boolean getShowPageMultipleItemLabel();
            
    /**
     * <p>id(0x852)</p>
     * <p>vtableId(128)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowPageMultipleItemLabel", dispId = 0x852)
    void setShowPageMultipleItemLabel(Boolean param0);
            
    /**
     * <p>id(0x188)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "Version", dispId = 0x188)
    XlPivotTableVersionList getVersion();
            
    /**
     * <p>id(0x853)</p>
     * <p>vtableId(130)</p>
     * @param File [in] {@code String}
     * @param Measures [in, optional] {@code Object}
     * @param Levels [in, optional] {@code Object}
     * @param Members [in, optional] {@code Object}
     * @param Properties [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateCubeFile", dispId = 0x853)
    String CreateCubeFile(String File,
            Object Measures,
            Object Levels,
            Object Members,
            Object Properties);
            
    /**
     * <p>id(0x858)</p>
     * <p>vtableId(131)</p>
     */
    @ComProperty(name = "DisplayEmptyRow", dispId = 0x858)
    Boolean getDisplayEmptyRow();
            
    /**
     * <p>id(0x858)</p>
     * <p>vtableId(132)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayEmptyRow", dispId = 0x858)
    void setDisplayEmptyRow(Boolean param0);
            
    /**
     * <p>id(0x859)</p>
     * <p>vtableId(133)</p>
     */
    @ComProperty(name = "DisplayEmptyColumn", dispId = 0x859)
    Boolean getDisplayEmptyColumn();
            
    /**
     * <p>id(0x859)</p>
     * <p>vtableId(134)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayEmptyColumn", dispId = 0x859)
    void setDisplayEmptyColumn(Boolean param0);
            
    /**
     * <p>id(0x85a)</p>
     * <p>vtableId(135)</p>
     */
    @ComProperty(name = "ShowCellBackgroundFromOLAP", dispId = 0x85a)
    Boolean getShowCellBackgroundFromOLAP();
            
    /**
     * <p>id(0x85a)</p>
     * <p>vtableId(136)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowCellBackgroundFromOLAP", dispId = 0x85a)
    void setShowCellBackgroundFromOLAP(Boolean param0);
            
    /**
     * <p>id(0x9f2)</p>
     * <p>vtableId(137)</p>
     */
    @ComProperty(name = "PivotColumnAxis", dispId = 0x9f2)
    PivotAxis getPivotColumnAxis();
            
    /**
     * <p>id(0x9f3)</p>
     * <p>vtableId(138)</p>
     */
    @ComProperty(name = "PivotRowAxis", dispId = 0x9f3)
    PivotAxis getPivotRowAxis();
            
    /**
     * <p>id(0x9f4)</p>
     * <p>vtableId(139)</p>
     */
    @ComProperty(name = "ShowDrillIndicators", dispId = 0x9f4)
    Boolean getShowDrillIndicators();
            
    /**
     * <p>id(0x9f4)</p>
     * <p>vtableId(140)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowDrillIndicators", dispId = 0x9f4)
    void setShowDrillIndicators(Boolean param0);
            
    /**
     * <p>id(0x9f5)</p>
     * <p>vtableId(141)</p>
     */
    @ComProperty(name = "PrintDrillIndicators", dispId = 0x9f5)
    Boolean getPrintDrillIndicators();
            
    /**
     * <p>id(0x9f5)</p>
     * <p>vtableId(142)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintDrillIndicators", dispId = 0x9f5)
    void setPrintDrillIndicators(Boolean param0);
            
    /**
     * <p>id(0x9f6)</p>
     * <p>vtableId(143)</p>
     */
    @ComProperty(name = "DisplayMemberPropertyTooltips", dispId = 0x9f6)
    Boolean getDisplayMemberPropertyTooltips();
            
    /**
     * <p>id(0x9f6)</p>
     * <p>vtableId(144)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayMemberPropertyTooltips", dispId = 0x9f6)
    void setDisplayMemberPropertyTooltips(Boolean param0);
            
    /**
     * <p>id(0x9f7)</p>
     * <p>vtableId(145)</p>
     */
    @ComProperty(name = "DisplayContextTooltips", dispId = 0x9f7)
    Boolean getDisplayContextTooltips();
            
    /**
     * <p>id(0x9f7)</p>
     * <p>vtableId(146)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayContextTooltips", dispId = 0x9f7)
    void setDisplayContextTooltips(Boolean param0);
            
    /**
     * <p>id(0x9f8)</p>
     * <p>vtableId(147)</p>
     */
    @ComMethod(name = "ClearTable", dispId = 0x9f8)
    void ClearTable();
            
    /**
     * <p>id(0x9f9)</p>
     * <p>vtableId(148)</p>
     */
    @ComProperty(name = "CompactRowIndent", dispId = 0x9f9)
    Integer getCompactRowIndent();
            
    /**
     * <p>id(0x9f9)</p>
     * <p>vtableId(149)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CompactRowIndent", dispId = 0x9f9)
    void setCompactRowIndent(Integer param0);
            
    /**
     * <p>id(0x9fa)</p>
     * <p>vtableId(150)</p>
     */
    @ComProperty(name = "LayoutRowDefault", dispId = 0x9fa)
    XlLayoutRowType getLayoutRowDefault();
            
    /**
     * <p>id(0x9fa)</p>
     * <p>vtableId(151)</p>
     * @param param0 [in] {@code XlLayoutRowType}
     */
    @ComProperty(name = "LayoutRowDefault", dispId = 0x9fa)
    void setLayoutRowDefault(XlLayoutRowType param0);
            
    /**
     * <p>id(0x9fb)</p>
     * <p>vtableId(152)</p>
     */
    @ComProperty(name = "DisplayFieldCaptions", dispId = 0x9fb)
    Boolean getDisplayFieldCaptions();
            
    /**
     * <p>id(0x9fb)</p>
     * <p>vtableId(153)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayFieldCaptions", dispId = 0x9fb)
    void setDisplayFieldCaptions(Boolean param0);
            
    /**
     * <p>id(0x9fc)</p>
     * <p>vtableId(154)</p>
     * @param RowLayout [in] {@code XlLayoutRowType}
     */
    @ComMethod(name = "RowAxisLayout", dispId = 0x9fc)
    void RowAxisLayout(XlLayoutRowType RowLayout);
            
    /**
     * <p>id(0x9fe)</p>
     * <p>vtableId(155)</p>
     * @param Location [in] {@code XlSubtototalLocationType}
     */
    @ComMethod(name = "SubtotalLocation", dispId = 0x9fe)
    void SubtotalLocation(XlSubtototalLocationType Location);
            
    /**
     * <p>id(0x9ff)</p>
     * <p>vtableId(156)</p>
     */
    @ComProperty(name = "ActiveFilters", dispId = 0x9ff)
    PivotFilters getActiveFilters();
            
    /**
     * <p>id(0xa00)</p>
     * <p>vtableId(157)</p>
     */
    @ComProperty(name = "InGridDropZones", dispId = 0xa00)
    Boolean getInGridDropZones();
            
    /**
     * <p>id(0xa00)</p>
     * <p>vtableId(158)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InGridDropZones", dispId = 0xa00)
    void setInGridDropZones(Boolean param0);
            
    /**
     * <p>id(0xa01)</p>
     * <p>vtableId(159)</p>
     */
    @ComMethod(name = "ClearAllFilters", dispId = 0xa01)
    void ClearAllFilters();
            
    /**
     * <p>id(0xa02)</p>
     * <p>vtableId(160)</p>
     */
    @ComProperty(name = "TableStyle2", dispId = 0xa02)
    Object getTableStyle2();
            
    /**
     * <p>id(0xa02)</p>
     * <p>vtableId(161)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "TableStyle2", dispId = 0xa02)
    void setTableStyle2(Object param0);
            
    /**
     * <p>id(0xa03)</p>
     * <p>vtableId(162)</p>
     */
    @ComProperty(name = "ShowTableStyleLastColumn", dispId = 0xa03)
    Boolean getShowTableStyleLastColumn();
            
    /**
     * <p>id(0xa03)</p>
     * <p>vtableId(163)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleLastColumn", dispId = 0xa03)
    void setShowTableStyleLastColumn(Boolean param0);
            
    /**
     * <p>id(0xa04)</p>
     * <p>vtableId(164)</p>
     */
    @ComProperty(name = "ShowTableStyleRowStripes", dispId = 0xa04)
    Boolean getShowTableStyleRowStripes();
            
    /**
     * <p>id(0xa04)</p>
     * <p>vtableId(165)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleRowStripes", dispId = 0xa04)
    void setShowTableStyleRowStripes(Boolean param0);
            
    /**
     * <p>id(0xa05)</p>
     * <p>vtableId(166)</p>
     */
    @ComProperty(name = "ShowTableStyleColumnStripes", dispId = 0xa05)
    Boolean getShowTableStyleColumnStripes();
            
    /**
     * <p>id(0xa05)</p>
     * <p>vtableId(167)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleColumnStripes", dispId = 0xa05)
    void setShowTableStyleColumnStripes(Boolean param0);
            
    /**
     * <p>id(0xa06)</p>
     * <p>vtableId(168)</p>
     */
    @ComProperty(name = "ShowTableStyleRowHeaders", dispId = 0xa06)
    Boolean getShowTableStyleRowHeaders();
            
    /**
     * <p>id(0xa06)</p>
     * <p>vtableId(169)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleRowHeaders", dispId = 0xa06)
    void setShowTableStyleRowHeaders(Boolean param0);
            
    /**
     * <p>id(0xa07)</p>
     * <p>vtableId(170)</p>
     */
    @ComProperty(name = "ShowTableStyleColumnHeaders", dispId = 0xa07)
    Boolean getShowTableStyleColumnHeaders();
            
    /**
     * <p>id(0xa07)</p>
     * <p>vtableId(171)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleColumnHeaders", dispId = 0xa07)
    void setShowTableStyleColumnHeaders(Boolean param0);
            
    /**
     * <p>id(0xa08)</p>
     * <p>vtableId(172)</p>
     * @param ConvertFilters [in] {@code Boolean}
     */
    @ComMethod(name = "ConvertToFormulas", dispId = 0xa08)
    void ConvertToFormulas(Boolean ConvertFilters);
            
    /**
     * <p>id(0xa0a)</p>
     * <p>vtableId(173)</p>
     */
    @ComProperty(name = "AllowMultipleFilters", dispId = 0xa0a)
    Boolean getAllowMultipleFilters();
            
    /**
     * <p>id(0xa0a)</p>
     * <p>vtableId(174)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowMultipleFilters", dispId = 0xa0a)
    void setAllowMultipleFilters(Boolean param0);
            
    /**
     * <p>id(0xa0b)</p>
     * <p>vtableId(175)</p>
     */
    @ComProperty(name = "CompactLayoutRowHeader", dispId = 0xa0b)
    String getCompactLayoutRowHeader();
            
    /**
     * <p>id(0xa0b)</p>
     * <p>vtableId(176)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CompactLayoutRowHeader", dispId = 0xa0b)
    void setCompactLayoutRowHeader(String param0);
            
    /**
     * <p>id(0xa0c)</p>
     * <p>vtableId(177)</p>
     */
    @ComProperty(name = "CompactLayoutColumnHeader", dispId = 0xa0c)
    String getCompactLayoutColumnHeader();
            
    /**
     * <p>id(0xa0c)</p>
     * <p>vtableId(178)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CompactLayoutColumnHeader", dispId = 0xa0c)
    void setCompactLayoutColumnHeader(String param0);
            
    /**
     * <p>id(0xa0d)</p>
     * <p>vtableId(179)</p>
     */
    @ComProperty(name = "FieldListSortAscending", dispId = 0xa0d)
    Boolean getFieldListSortAscending();
            
    /**
     * <p>id(0xa0d)</p>
     * <p>vtableId(180)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FieldListSortAscending", dispId = 0xa0d)
    void setFieldListSortAscending(Boolean param0);
            
    /**
     * <p>id(0xa0e)</p>
     * <p>vtableId(181)</p>
     */
    @ComProperty(name = "SortUsingCustomLists", dispId = 0xa0e)
    Boolean getSortUsingCustomLists();
            
    /**
     * <p>id(0xa0e)</p>
     * <p>vtableId(182)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SortUsingCustomLists", dispId = 0xa0e)
    void setSortUsingCustomLists(Boolean param0);
            
    /**
     * <p>id(0xa0f)</p>
     * <p>vtableId(183)</p>
     * @param conn [in] {@code WorkbookConnection}
     */
    @ComMethod(name = "ChangeConnection", dispId = 0xa0f)
    void ChangeConnection(WorkbookConnection conn);
            
    /**
     * <p>id(0xa11)</p>
     * <p>vtableId(184)</p>
     * @param PivotCache [in] {@code Object}
     */
    @ComMethod(name = "ChangePivotCache", dispId = 0xa11)
    void ChangePivotCache(Object PivotCache);
            
    /**
     * <p>id(0x575)</p>
     * <p>vtableId(185)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    String getLocation();
            
    /**
     * <p>id(0x575)</p>
     * <p>vtableId(186)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Location", dispId = 0x575)
    void setLocation(String param0);
            
    /**
     * <p>id(0xb38)</p>
     * <p>vtableId(187)</p>
     */
    @ComProperty(name = "EnableWriteback", dispId = 0xb38)
    Boolean getEnableWriteback();
            
    /**
     * <p>id(0xb38)</p>
     * <p>vtableId(188)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableWriteback", dispId = 0xb38)
    void setEnableWriteback(Boolean param0);
            
    /**
     * <p>id(0xb39)</p>
     * <p>vtableId(189)</p>
     */
    @ComProperty(name = "Allocation", dispId = 0xb39)
    XlAllocation getAllocation();
            
    /**
     * <p>id(0xb39)</p>
     * <p>vtableId(190)</p>
     * @param param0 [in] {@code XlAllocation}
     */
    @ComProperty(name = "Allocation", dispId = 0xb39)
    void setAllocation(XlAllocation param0);
            
    /**
     * <p>id(0xb3a)</p>
     * <p>vtableId(191)</p>
     */
    @ComProperty(name = "AllocationValue", dispId = 0xb3a)
    XlAllocationValue getAllocationValue();
            
    /**
     * <p>id(0xb3a)</p>
     * <p>vtableId(192)</p>
     * @param param0 [in] {@code XlAllocationValue}
     */
    @ComProperty(name = "AllocationValue", dispId = 0xb3a)
    void setAllocationValue(XlAllocationValue param0);
            
    /**
     * <p>id(0xb3b)</p>
     * <p>vtableId(193)</p>
     */
    @ComProperty(name = "AllocationMethod", dispId = 0xb3b)
    XlAllocationMethod getAllocationMethod();
            
    /**
     * <p>id(0xb3b)</p>
     * <p>vtableId(194)</p>
     * @param param0 [in] {@code XlAllocationMethod}
     */
    @ComProperty(name = "AllocationMethod", dispId = 0xb3b)
    void setAllocationMethod(XlAllocationMethod param0);
            
    /**
     * <p>id(0xb3c)</p>
     * <p>vtableId(195)</p>
     */
    @ComProperty(name = "AllocationWeightExpression", dispId = 0xb3c)
    String getAllocationWeightExpression();
            
    /**
     * <p>id(0xb3c)</p>
     * <p>vtableId(196)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AllocationWeightExpression", dispId = 0xb3c)
    void setAllocationWeightExpression(String param0);
            
    /**
     * <p>id(0xb27)</p>
     * <p>vtableId(197)</p>
     */
    @ComMethod(name = "AllocateChanges", dispId = 0xb27)
    void AllocateChanges();
            
    /**
     * <p>id(0xb3d)</p>
     * <p>vtableId(198)</p>
     */
    @ComMethod(name = "CommitChanges", dispId = 0xb3d)
    void CommitChanges();
            
    /**
     * <p>id(0xb28)</p>
     * <p>vtableId(199)</p>
     */
    @ComMethod(name = "DiscardChanges", dispId = 0xb28)
    void DiscardChanges();
            
    /**
     * <p>id(0xb3e)</p>
     * <p>vtableId(200)</p>
     */
    @ComMethod(name = "RefreshDataSourceValues", dispId = 0xb3e)
    void RefreshDataSourceValues();
            
    /**
     * <p>id(0xb3f)</p>
     * <p>vtableId(201)</p>
     * @param Repeat [in] {@code XlPivotFieldRepeatLabels}
     */
    @ComMethod(name = "RepeatAllLabels", dispId = 0xb3f)
    void RepeatAllLabels(XlPivotFieldRepeatLabels Repeat);
            
    /**
     * <p>id(0xb40)</p>
     * <p>vtableId(202)</p>
     */
    @ComProperty(name = "ChangeList", dispId = 0xb40)
    PivotTableChangeList getChangeList();
            
    /**
     * <p>id(0xb41)</p>
     * <p>vtableId(203)</p>
     */
    @ComProperty(name = "Slicers", dispId = 0xb41)
    Slicers getSlicers();
            
    /**
     * <p>id(0x763)</p>
     * <p>vtableId(204)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    String getAlternativeText();
            
    /**
     * <p>id(0x763)</p>
     * <p>vtableId(205)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    void setAlternativeText(String param0);
            
    /**
     * <p>id(0x111)</p>
     * <p>vtableId(206)</p>
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    String getSummary();
            
    /**
     * <p>id(0x111)</p>
     * <p>vtableId(207)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    void setSummary(String param0);
            
    /**
     * <p>id(0xb42)</p>
     * <p>vtableId(208)</p>
     */
    @ComProperty(name = "VisualTotalsForSets", dispId = 0xb42)
    Boolean getVisualTotalsForSets();
            
    /**
     * <p>id(0xb42)</p>
     * <p>vtableId(209)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "VisualTotalsForSets", dispId = 0xb42)
    void setVisualTotalsForSets(Boolean param0);
            
    /**
     * <p>id(0xb43)</p>
     * <p>vtableId(210)</p>
     */
    @ComProperty(name = "ShowValuesRow", dispId = 0xb43)
    Boolean getShowValuesRow();
            
    /**
     * <p>id(0xb43)</p>
     * <p>vtableId(211)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowValuesRow", dispId = 0xb43)
    void setShowValuesRow(Boolean param0);
            
    /**
     * <p>id(0xb44)</p>
     * <p>vtableId(212)</p>
     */
    @ComProperty(name = "CalculatedMembersInFilters", dispId = 0xb44)
    Boolean getCalculatedMembersInFilters();
            
    /**
     * <p>id(0xb44)</p>
     * <p>vtableId(213)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CalculatedMembersInFilters", dispId = 0xb44)
    void setCalculatedMembersInFilters(Boolean param0);
            
    /**
     * <p>id(0xbf8)</p>
     * <p>vtableId(214)</p>
     * @param rowline [in, optional] {@code Object}
     * @param columnline [in, optional] {@code Object}
     */
    @ComMethod(name = "PivotValueCell", dispId = 0xbf8)
    PivotValueCell PivotValueCell(Object rowline,
            Object columnline);
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(215)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    Boolean getHidden();
            
    /**
     * <p>id(0xbfb)</p>
     * <p>vtableId(216)</p>
     */
    @ComProperty(name = "PivotChart", dispId = 0xbfb)
    Shape getPivotChart();
            
    /**
     * <p>id(0xbfc)</p>
     * <p>vtableId(217)</p>
     * @param PivotItem [in] {@code PivotItem}
     * @param PivotLine [in, optional] {@code Object}
     */
    @ComMethod(name = "DrillDown", dispId = 0xbfc)
    void DrillDown(PivotItem PivotItem,
            Object PivotLine);
            
    /**
     * <p>id(0xbfd)</p>
     * <p>vtableId(218)</p>
     * @param PivotItem [in] {@code PivotItem}
     * @param PivotLine [in, optional] {@code Object}
     * @param LevelUniqueName [in, optional] {@code Object}
     */
    @ComMethod(name = "DrillUp", dispId = 0xbfd)
    void DrillUp(PivotItem PivotItem,
            Object PivotLine,
            Object LevelUniqueName);
            
    /**
     * <p>id(0xa14)</p>
     * <p>vtableId(219)</p>
     * @param PivotItem [in] {@code PivotItem}
     * @param CubeField [in] {@code CubeField}
     * @param PivotLine [in, optional] {@code Object}
     */
    @ComMethod(name = "DrillTo", dispId = 0xa14)
    void DrillTo(PivotItem PivotItem,
            CubeField CubeField,
            Object PivotLine);
            
    /**
     * <p>id(0x6f7)</p>
     * <p>vtableId(220)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "Dummy2", dispId = 0x6f7)
    Object Dummy2(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    
}