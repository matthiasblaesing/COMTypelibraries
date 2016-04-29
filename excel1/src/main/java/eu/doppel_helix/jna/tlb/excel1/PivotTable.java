
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020872-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020872-0000-0000-C000-000000000046}")
public interface PivotTable {
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
     * <p>id(0x2c4)</p>
     */
    @ComMethod(name = "AddFields", dispId = 0x2c4)
    Object AddFields(Object RowFields,
            Object ColumnFields,
            Object PageFields,
            Object AddToTable);
            
    /**
     * <p>id(0x2c9)</p>
     */
    @ComProperty(name = "ColumnFields", dispId = 0x2c9)
    com.sun.jna.platform.win32.COM.util.IDispatch getColumnFields(Object Index);
            
    /**
     * <p>id(0x2b6)</p>
     */
    @ComProperty(name = "ColumnGrand", dispId = 0x2b6)
    Boolean getColumnGrand();
            
    /**
     * <p>id(0x2b6)</p>
     */
    @ComProperty(name = "ColumnGrand", dispId = 0x2b6)
    void setColumnGrand(Boolean param0);
            
    /**
     * <p>id(0x2be)</p>
     */
    @ComProperty(name = "ColumnRange", dispId = 0x2be)
    Range getColumnRange();
            
    /**
     * <p>id(0x2c2)</p>
     */
    @ComMethod(name = "ShowPages", dispId = 0x2c2)
    Object ShowPages(Object PageField);
            
    /**
     * <p>id(0x2c1)</p>
     */
    @ComProperty(name = "DataBodyRange", dispId = 0x2c1)
    Range getDataBodyRange();
            
    /**
     * <p>id(0x2cb)</p>
     */
    @ComProperty(name = "DataFields", dispId = 0x2cb)
    com.sun.jna.platform.win32.COM.util.IDispatch getDataFields(Object Index);
            
    /**
     * <p>id(0x2c0)</p>
     */
    @ComProperty(name = "DataLabelRange", dispId = 0x2c0)
    Range getDataLabelRange();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(String param0);
            
    /**
     * <p>id(0x2b7)</p>
     */
    @ComProperty(name = "HasAutoFormat", dispId = 0x2b7)
    Boolean getHasAutoFormat();
            
    /**
     * <p>id(0x2b7)</p>
     */
    @ComProperty(name = "HasAutoFormat", dispId = 0x2b7)
    void setHasAutoFormat(Boolean param0);
            
    /**
     * <p>id(0x2c7)</p>
     */
    @ComProperty(name = "HiddenFields", dispId = 0x2c7)
    com.sun.jna.platform.win32.COM.util.IDispatch getHiddenFields(Object Index);
            
    /**
     * <p>id(0x2ba)</p>
     */
    @ComProperty(name = "InnerDetail", dispId = 0x2ba)
    String getInnerDetail();
            
    /**
     * <p>id(0x2ba)</p>
     */
    @ComProperty(name = "InnerDetail", dispId = 0x2ba)
    void setInnerDetail(String param0);
            
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
     * <p>id(0x2ca)</p>
     */
    @ComProperty(name = "PageFields", dispId = 0x2ca)
    com.sun.jna.platform.win32.COM.util.IDispatch getPageFields(Object Index);
            
    /**
     * <p>id(0x2bf)</p>
     */
    @ComProperty(name = "PageRange", dispId = 0x2bf)
    Range getPageRange();
            
    /**
     * <p>id(0x5ca)</p>
     */
    @ComProperty(name = "PageRangeCells", dispId = 0x5ca)
    Range getPageRangeCells();
            
    /**
     * <p>id(0x2ce)</p>
     */
    @ComMethod(name = "PivotFields", dispId = 0x2ce)
    com.sun.jna.platform.win32.COM.util.IDispatch PivotFields(Object Index);
            
    /**
     * <p>id(0x2b8)</p>
     */
    @ComProperty(name = "RefreshDate", dispId = 0x2b8)
    java.util.Date getRefreshDate();
            
    /**
     * <p>id(0x2b9)</p>
     */
    @ComProperty(name = "RefreshName", dispId = 0x2b9)
    String getRefreshName();
            
    /**
     * <p>id(0x2cd)</p>
     */
    @ComMethod(name = "RefreshTable", dispId = 0x2cd)
    Boolean RefreshTable();
            
    /**
     * <p>id(0x2c8)</p>
     */
    @ComProperty(name = "RowFields", dispId = 0x2c8)
    com.sun.jna.platform.win32.COM.util.IDispatch getRowFields(Object Index);
            
    /**
     * <p>id(0x2b5)</p>
     */
    @ComProperty(name = "RowGrand", dispId = 0x2b5)
    Boolean getRowGrand();
            
    /**
     * <p>id(0x2b5)</p>
     */
    @ComProperty(name = "RowGrand", dispId = 0x2b5)
    void setRowGrand(Boolean param0);
            
    /**
     * <p>id(0x2bd)</p>
     */
    @ComProperty(name = "RowRange", dispId = 0x2bd)
    Range getRowRange();
            
    /**
     * <p>id(0x2b4)</p>
     */
    @ComProperty(name = "SaveData", dispId = 0x2b4)
    Boolean getSaveData();
            
    /**
     * <p>id(0x2b4)</p>
     */
    @ComProperty(name = "SaveData", dispId = 0x2b4)
    void setSaveData(Boolean param0);
            
    /**
     * <p>id(0x2ae)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    Object getSourceData();
            
    /**
     * <p>id(0x2ae)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    void setSourceData(Object param0);
            
    /**
     * <p>id(0x2bb)</p>
     */
    @ComProperty(name = "TableRange1", dispId = 0x2bb)
    Range getTableRange1();
            
    /**
     * <p>id(0x2bc)</p>
     */
    @ComProperty(name = "TableRange2", dispId = 0x2bc)
    Range getTableRange2();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(String param0);
            
    /**
     * <p>id(0x2c6)</p>
     */
    @ComProperty(name = "VisibleFields", dispId = 0x2c6)
    com.sun.jna.platform.win32.COM.util.IDispatch getVisibleFields(Object Index);
            
    /**
     * <p>id(0x5cb)</p>
     */
    @ComProperty(name = "CacheIndex", dispId = 0x5cb)
    Integer getCacheIndex();
            
    /**
     * <p>id(0x5cb)</p>
     */
    @ComProperty(name = "CacheIndex", dispId = 0x5cb)
    void setCacheIndex(Integer param0);
            
    /**
     * <p>id(0x5cc)</p>
     */
    @ComMethod(name = "CalculatedFields", dispId = 0x5cc)
    CalculatedFields CalculatedFields();
            
    /**
     * <p>id(0x5cd)</p>
     */
    @ComProperty(name = "DisplayErrorString", dispId = 0x5cd)
    Boolean getDisplayErrorString();
            
    /**
     * <p>id(0x5cd)</p>
     */
    @ComProperty(name = "DisplayErrorString", dispId = 0x5cd)
    void setDisplayErrorString(Boolean param0);
            
    /**
     * <p>id(0x5ce)</p>
     */
    @ComProperty(name = "DisplayNullString", dispId = 0x5ce)
    Boolean getDisplayNullString();
            
    /**
     * <p>id(0x5ce)</p>
     */
    @ComProperty(name = "DisplayNullString", dispId = 0x5ce)
    void setDisplayNullString(Boolean param0);
            
    /**
     * <p>id(0x5cf)</p>
     */
    @ComProperty(name = "EnableDrilldown", dispId = 0x5cf)
    Boolean getEnableDrilldown();
            
    /**
     * <p>id(0x5cf)</p>
     */
    @ComProperty(name = "EnableDrilldown", dispId = 0x5cf)
    void setEnableDrilldown(Boolean param0);
            
    /**
     * <p>id(0x5d0)</p>
     */
    @ComProperty(name = "EnableFieldDialog", dispId = 0x5d0)
    Boolean getEnableFieldDialog();
            
    /**
     * <p>id(0x5d0)</p>
     */
    @ComProperty(name = "EnableFieldDialog", dispId = 0x5d0)
    void setEnableFieldDialog(Boolean param0);
            
    /**
     * <p>id(0x5d1)</p>
     */
    @ComProperty(name = "EnableWizard", dispId = 0x5d1)
    Boolean getEnableWizard();
            
    /**
     * <p>id(0x5d1)</p>
     */
    @ComProperty(name = "EnableWizard", dispId = 0x5d1)
    void setEnableWizard(Boolean param0);
            
    /**
     * <p>id(0x5d2)</p>
     */
    @ComProperty(name = "ErrorString", dispId = 0x5d2)
    String getErrorString();
            
    /**
     * <p>id(0x5d2)</p>
     */
    @ComProperty(name = "ErrorString", dispId = 0x5d2)
    void setErrorString(String param0);
            
    /**
     * <p>id(0x5d3)</p>
     */
    @ComMethod(name = "GetData", dispId = 0x5d3)
    Double GetData(String Name);
            
    /**
     * <p>id(0x5d4)</p>
     */
    @ComMethod(name = "ListFormulas", dispId = 0x5d4)
    void ListFormulas();
            
    /**
     * <p>id(0x5d5)</p>
     */
    @ComProperty(name = "ManualUpdate", dispId = 0x5d5)
    Boolean getManualUpdate();
            
    /**
     * <p>id(0x5d5)</p>
     */
    @ComProperty(name = "ManualUpdate", dispId = 0x5d5)
    void setManualUpdate(Boolean param0);
            
    /**
     * <p>id(0x5d6)</p>
     */
    @ComProperty(name = "MergeLabels", dispId = 0x5d6)
    Boolean getMergeLabels();
            
    /**
     * <p>id(0x5d6)</p>
     */
    @ComProperty(name = "MergeLabels", dispId = 0x5d6)
    void setMergeLabels(Boolean param0);
            
    /**
     * <p>id(0x5d7)</p>
     */
    @ComProperty(name = "NullString", dispId = 0x5d7)
    String getNullString();
            
    /**
     * <p>id(0x5d7)</p>
     */
    @ComProperty(name = "NullString", dispId = 0x5d7)
    void setNullString(String param0);
            
    /**
     * <p>id(0x5d8)</p>
     */
    @ComMethod(name = "PivotCache", dispId = 0x5d8)
    PivotCache PivotCache();
            
    /**
     * <p>id(0x5d9)</p>
     */
    @ComProperty(name = "PivotFormulas", dispId = 0x5d9)
    PivotFormulas getPivotFormulas();
            
    /**
     * <p>id(0x2ac)</p>
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
     */
    @ComProperty(name = "SubtotalHiddenPageItems", dispId = 0x5da)
    Boolean getSubtotalHiddenPageItems();
            
    /**
     * <p>id(0x5da)</p>
     */
    @ComProperty(name = "SubtotalHiddenPageItems", dispId = 0x5da)
    void setSubtotalHiddenPageItems(Boolean param0);
            
    /**
     * <p>id(0x595)</p>
     */
    @ComProperty(name = "PageFieldOrder", dispId = 0x595)
    Integer getPageFieldOrder();
            
    /**
     * <p>id(0x595)</p>
     */
    @ComProperty(name = "PageFieldOrder", dispId = 0x595)
    void setPageFieldOrder(Integer param0);
            
    /**
     * <p>id(0x5db)</p>
     */
    @ComProperty(name = "PageFieldStyle", dispId = 0x5db)
    String getPageFieldStyle();
            
    /**
     * <p>id(0x5db)</p>
     */
    @ComProperty(name = "PageFieldStyle", dispId = 0x5db)
    void setPageFieldStyle(String param0);
            
    /**
     * <p>id(0x596)</p>
     */
    @ComProperty(name = "PageFieldWrapCount", dispId = 0x596)
    Integer getPageFieldWrapCount();
            
    /**
     * <p>id(0x596)</p>
     */
    @ComProperty(name = "PageFieldWrapCount", dispId = 0x596)
    void setPageFieldWrapCount(Integer param0);
            
    /**
     * <p>id(0x5dc)</p>
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    Boolean getPreserveFormatting();
            
    /**
     * <p>id(0x5dc)</p>
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    void setPreserveFormatting(Boolean param0);
            
    /**
     * <p>id(0x827)</p>
     */
    @ComMethod(name = "_PivotSelect", dispId = 0x827)
    void _PivotSelect(String Name,
            XlPTSelectionMode Mode);
            
    /**
     * <p>id(0x5de)</p>
     */
    @ComProperty(name = "PivotSelection", dispId = 0x5de)
    String getPivotSelection();
            
    /**
     * <p>id(0x5de)</p>
     */
    @ComProperty(name = "PivotSelection", dispId = 0x5de)
    void setPivotSelection(String param0);
            
    /**
     * <p>id(0x5df)</p>
     */
    @ComProperty(name = "SelectionMode", dispId = 0x5df)
    XlPTSelectionMode getSelectionMode();
            
    /**
     * <p>id(0x5df)</p>
     */
    @ComProperty(name = "SelectionMode", dispId = 0x5df)
    void setSelectionMode(XlPTSelectionMode param0);
            
    /**
     * <p>id(0x5e0)</p>
     */
    @ComProperty(name = "TableStyle", dispId = 0x5e0)
    String getTableStyle();
            
    /**
     * <p>id(0x5e0)</p>
     */
    @ComProperty(name = "TableStyle", dispId = 0x5e0)
    void setTableStyle(String param0);
            
    /**
     * <p>id(0x5e1)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x5e1)
    String getTag();
            
    /**
     * <p>id(0x5e1)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x5e1)
    void setTag(String param0);
            
    /**
     * <p>id(0x2a8)</p>
     */
    @ComMethod(name = "Update", dispId = 0x2a8)
    void Update();
            
    /**
     * <p>id(0x5e2)</p>
     */
    @ComProperty(name = "VacatedStyle", dispId = 0x5e2)
    String getVacatedStyle();
            
    /**
     * <p>id(0x5e2)</p>
     */
    @ComProperty(name = "VacatedStyle", dispId = 0x5e2)
    void setVacatedStyle(String param0);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComMethod(name = "Format", dispId = 0x74)
    void Format(XlPivotFormatType Format);
            
    /**
     * <p>id(0x72e)</p>
     */
    @ComProperty(name = "PrintTitles", dispId = 0x72e)
    Boolean getPrintTitles();
            
    /**
     * <p>id(0x72e)</p>
     */
    @ComProperty(name = "PrintTitles", dispId = 0x72e)
    void setPrintTitles(Boolean param0);
            
    /**
     * <p>id(0x72f)</p>
     */
    @ComProperty(name = "CubeFields", dispId = 0x72f)
    CubeFields getCubeFields();
            
    /**
     * <p>id(0x730)</p>
     */
    @ComProperty(name = "GrandTotalName", dispId = 0x730)
    String getGrandTotalName();
            
    /**
     * <p>id(0x730)</p>
     */
    @ComProperty(name = "GrandTotalName", dispId = 0x730)
    void setGrandTotalName(String param0);
            
    /**
     * <p>id(0x731)</p>
     */
    @ComProperty(name = "SmallGrid", dispId = 0x731)
    Boolean getSmallGrid();
            
    /**
     * <p>id(0x731)</p>
     */
    @ComProperty(name = "SmallGrid", dispId = 0x731)
    void setSmallGrid(Boolean param0);
            
    /**
     * <p>id(0x732)</p>
     */
    @ComProperty(name = "RepeatItemsOnEachPrintedPage", dispId = 0x732)
    Boolean getRepeatItemsOnEachPrintedPage();
            
    /**
     * <p>id(0x732)</p>
     */
    @ComProperty(name = "RepeatItemsOnEachPrintedPage", dispId = 0x732)
    void setRepeatItemsOnEachPrintedPage(Boolean param0);
            
    /**
     * <p>id(0x733)</p>
     */
    @ComProperty(name = "TotalsAnnotation", dispId = 0x733)
    Boolean getTotalsAnnotation();
            
    /**
     * <p>id(0x733)</p>
     */
    @ComProperty(name = "TotalsAnnotation", dispId = 0x733)
    void setTotalsAnnotation(Boolean param0);
            
    /**
     * <p>id(0x5dd)</p>
     */
    @ComMethod(name = "PivotSelect", dispId = 0x5dd)
    void PivotSelect(String Name,
            XlPTSelectionMode Mode,
            Object UseStandardName);
            
    /**
     * <p>id(0x829)</p>
     */
    @ComProperty(name = "PivotSelectionStandard", dispId = 0x829)
    String getPivotSelectionStandard();
            
    /**
     * <p>id(0x829)</p>
     */
    @ComProperty(name = "PivotSelectionStandard", dispId = 0x829)
    void setPivotSelectionStandard(String param0);
            
    /**
     * <p>id(0x82a)</p>
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
     */
    @ComProperty(name = "DataPivotField", dispId = 0x848)
    PivotField getDataPivotField();
            
    /**
     * <p>id(0x849)</p>
     */
    @ComProperty(name = "EnableDataValueEditing", dispId = 0x849)
    Boolean getEnableDataValueEditing();
            
    /**
     * <p>id(0x849)</p>
     */
    @ComProperty(name = "EnableDataValueEditing", dispId = 0x849)
    void setEnableDataValueEditing(Boolean param0);
            
    /**
     * <p>id(0x84a)</p>
     */
    @ComMethod(name = "AddDataField", dispId = 0x84a)
    PivotField AddDataField(com.sun.jna.platform.win32.COM.util.IDispatch Field,
            Object Caption,
            Object Function);
            
    /**
     * <p>id(0x84b)</p>
     */
    @ComProperty(name = "MDX", dispId = 0x84b)
    String getMDX();
            
    /**
     * <p>id(0x84c)</p>
     */
    @ComProperty(name = "ViewCalculatedMembers", dispId = 0x84c)
    Boolean getViewCalculatedMembers();
            
    /**
     * <p>id(0x84c)</p>
     */
    @ComProperty(name = "ViewCalculatedMembers", dispId = 0x84c)
    void setViewCalculatedMembers(Boolean param0);
            
    /**
     * <p>id(0x84d)</p>
     */
    @ComProperty(name = "CalculatedMembers", dispId = 0x84d)
    CalculatedMembers getCalculatedMembers();
            
    /**
     * <p>id(0x84e)</p>
     */
    @ComProperty(name = "DisplayImmediateItems", dispId = 0x84e)
    Boolean getDisplayImmediateItems();
            
    /**
     * <p>id(0x84e)</p>
     */
    @ComProperty(name = "DisplayImmediateItems", dispId = 0x84e)
    void setDisplayImmediateItems(Boolean param0);
            
    /**
     * <p>id(0x84f)</p>
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
     */
    @ComProperty(name = "EnableFieldList", dispId = 0x850)
    Boolean getEnableFieldList();
            
    /**
     * <p>id(0x850)</p>
     */
    @ComProperty(name = "EnableFieldList", dispId = 0x850)
    void setEnableFieldList(Boolean param0);
            
    /**
     * <p>id(0x851)</p>
     */
    @ComProperty(name = "VisualTotals", dispId = 0x851)
    Boolean getVisualTotals();
            
    /**
     * <p>id(0x851)</p>
     */
    @ComProperty(name = "VisualTotals", dispId = 0x851)
    void setVisualTotals(Boolean param0);
            
    /**
     * <p>id(0x852)</p>
     */
    @ComProperty(name = "ShowPageMultipleItemLabel", dispId = 0x852)
    Boolean getShowPageMultipleItemLabel();
            
    /**
     * <p>id(0x852)</p>
     */
    @ComProperty(name = "ShowPageMultipleItemLabel", dispId = 0x852)
    void setShowPageMultipleItemLabel(Boolean param0);
            
    /**
     * <p>id(0x188)</p>
     */
    @ComProperty(name = "Version", dispId = 0x188)
    XlPivotTableVersionList getVersion();
            
    /**
     * <p>id(0x853)</p>
     */
    @ComMethod(name = "CreateCubeFile", dispId = 0x853)
    String CreateCubeFile(String File,
            Object Measures,
            Object Levels,
            Object Members,
            Object Properties);
            
    /**
     * <p>id(0x858)</p>
     */
    @ComProperty(name = "DisplayEmptyRow", dispId = 0x858)
    Boolean getDisplayEmptyRow();
            
    /**
     * <p>id(0x858)</p>
     */
    @ComProperty(name = "DisplayEmptyRow", dispId = 0x858)
    void setDisplayEmptyRow(Boolean param0);
            
    /**
     * <p>id(0x859)</p>
     */
    @ComProperty(name = "DisplayEmptyColumn", dispId = 0x859)
    Boolean getDisplayEmptyColumn();
            
    /**
     * <p>id(0x859)</p>
     */
    @ComProperty(name = "DisplayEmptyColumn", dispId = 0x859)
    void setDisplayEmptyColumn(Boolean param0);
            
    /**
     * <p>id(0x85a)</p>
     */
    @ComProperty(name = "ShowCellBackgroundFromOLAP", dispId = 0x85a)
    Boolean getShowCellBackgroundFromOLAP();
            
    /**
     * <p>id(0x85a)</p>
     */
    @ComProperty(name = "ShowCellBackgroundFromOLAP", dispId = 0x85a)
    void setShowCellBackgroundFromOLAP(Boolean param0);
            
    /**
     * <p>id(0x9f2)</p>
     */
    @ComProperty(name = "PivotColumnAxis", dispId = 0x9f2)
    PivotAxis getPivotColumnAxis();
            
    /**
     * <p>id(0x9f3)</p>
     */
    @ComProperty(name = "PivotRowAxis", dispId = 0x9f3)
    PivotAxis getPivotRowAxis();
            
    /**
     * <p>id(0x9f4)</p>
     */
    @ComProperty(name = "ShowDrillIndicators", dispId = 0x9f4)
    Boolean getShowDrillIndicators();
            
    /**
     * <p>id(0x9f4)</p>
     */
    @ComProperty(name = "ShowDrillIndicators", dispId = 0x9f4)
    void setShowDrillIndicators(Boolean param0);
            
    /**
     * <p>id(0x9f5)</p>
     */
    @ComProperty(name = "PrintDrillIndicators", dispId = 0x9f5)
    Boolean getPrintDrillIndicators();
            
    /**
     * <p>id(0x9f5)</p>
     */
    @ComProperty(name = "PrintDrillIndicators", dispId = 0x9f5)
    void setPrintDrillIndicators(Boolean param0);
            
    /**
     * <p>id(0x9f6)</p>
     */
    @ComProperty(name = "DisplayMemberPropertyTooltips", dispId = 0x9f6)
    Boolean getDisplayMemberPropertyTooltips();
            
    /**
     * <p>id(0x9f6)</p>
     */
    @ComProperty(name = "DisplayMemberPropertyTooltips", dispId = 0x9f6)
    void setDisplayMemberPropertyTooltips(Boolean param0);
            
    /**
     * <p>id(0x9f7)</p>
     */
    @ComProperty(name = "DisplayContextTooltips", dispId = 0x9f7)
    Boolean getDisplayContextTooltips();
            
    /**
     * <p>id(0x9f7)</p>
     */
    @ComProperty(name = "DisplayContextTooltips", dispId = 0x9f7)
    void setDisplayContextTooltips(Boolean param0);
            
    /**
     * <p>id(0x9f8)</p>
     */
    @ComMethod(name = "ClearTable", dispId = 0x9f8)
    void ClearTable();
            
    /**
     * <p>id(0x9f9)</p>
     */
    @ComProperty(name = "CompactRowIndent", dispId = 0x9f9)
    Integer getCompactRowIndent();
            
    /**
     * <p>id(0x9f9)</p>
     */
    @ComProperty(name = "CompactRowIndent", dispId = 0x9f9)
    void setCompactRowIndent(Integer param0);
            
    /**
     * <p>id(0x9fa)</p>
     */
    @ComProperty(name = "LayoutRowDefault", dispId = 0x9fa)
    XlLayoutRowType getLayoutRowDefault();
            
    /**
     * <p>id(0x9fa)</p>
     */
    @ComProperty(name = "LayoutRowDefault", dispId = 0x9fa)
    void setLayoutRowDefault(XlLayoutRowType param0);
            
    /**
     * <p>id(0x9fb)</p>
     */
    @ComProperty(name = "DisplayFieldCaptions", dispId = 0x9fb)
    Boolean getDisplayFieldCaptions();
            
    /**
     * <p>id(0x9fb)</p>
     */
    @ComProperty(name = "DisplayFieldCaptions", dispId = 0x9fb)
    void setDisplayFieldCaptions(Boolean param0);
            
    /**
     * <p>id(0x9fc)</p>
     */
    @ComMethod(name = "RowAxisLayout", dispId = 0x9fc)
    void RowAxisLayout(XlLayoutRowType RowLayout);
            
    /**
     * <p>id(0x9fe)</p>
     */
    @ComMethod(name = "SubtotalLocation", dispId = 0x9fe)
    void SubtotalLocation(XlSubtototalLocationType Location);
            
    /**
     * <p>id(0x9ff)</p>
     */
    @ComProperty(name = "ActiveFilters", dispId = 0x9ff)
    PivotFilters getActiveFilters();
            
    /**
     * <p>id(0xa00)</p>
     */
    @ComProperty(name = "InGridDropZones", dispId = 0xa00)
    Boolean getInGridDropZones();
            
    /**
     * <p>id(0xa00)</p>
     */
    @ComProperty(name = "InGridDropZones", dispId = 0xa00)
    void setInGridDropZones(Boolean param0);
            
    /**
     * <p>id(0xa01)</p>
     */
    @ComMethod(name = "ClearAllFilters", dispId = 0xa01)
    void ClearAllFilters();
            
    /**
     * <p>id(0xa02)</p>
     */
    @ComProperty(name = "TableStyle2", dispId = 0xa02)
    Object getTableStyle2();
            
    /**
     * <p>id(0xa02)</p>
     */
    @ComProperty(name = "TableStyle2", dispId = 0xa02)
    void setTableStyle2(Object param0);
            
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
     * <p>id(0xa06)</p>
     */
    @ComProperty(name = "ShowTableStyleRowHeaders", dispId = 0xa06)
    Boolean getShowTableStyleRowHeaders();
            
    /**
     * <p>id(0xa06)</p>
     */
    @ComProperty(name = "ShowTableStyleRowHeaders", dispId = 0xa06)
    void setShowTableStyleRowHeaders(Boolean param0);
            
    /**
     * <p>id(0xa07)</p>
     */
    @ComProperty(name = "ShowTableStyleColumnHeaders", dispId = 0xa07)
    Boolean getShowTableStyleColumnHeaders();
            
    /**
     * <p>id(0xa07)</p>
     */
    @ComProperty(name = "ShowTableStyleColumnHeaders", dispId = 0xa07)
    void setShowTableStyleColumnHeaders(Boolean param0);
            
    /**
     * <p>id(0xa08)</p>
     */
    @ComMethod(name = "ConvertToFormulas", dispId = 0xa08)
    void ConvertToFormulas(Boolean ConvertFilters);
            
    /**
     * <p>id(0xa0a)</p>
     */
    @ComProperty(name = "AllowMultipleFilters", dispId = 0xa0a)
    Boolean getAllowMultipleFilters();
            
    /**
     * <p>id(0xa0a)</p>
     */
    @ComProperty(name = "AllowMultipleFilters", dispId = 0xa0a)
    void setAllowMultipleFilters(Boolean param0);
            
    /**
     * <p>id(0xa0b)</p>
     */
    @ComProperty(name = "CompactLayoutRowHeader", dispId = 0xa0b)
    String getCompactLayoutRowHeader();
            
    /**
     * <p>id(0xa0b)</p>
     */
    @ComProperty(name = "CompactLayoutRowHeader", dispId = 0xa0b)
    void setCompactLayoutRowHeader(String param0);
            
    /**
     * <p>id(0xa0c)</p>
     */
    @ComProperty(name = "CompactLayoutColumnHeader", dispId = 0xa0c)
    String getCompactLayoutColumnHeader();
            
    /**
     * <p>id(0xa0c)</p>
     */
    @ComProperty(name = "CompactLayoutColumnHeader", dispId = 0xa0c)
    void setCompactLayoutColumnHeader(String param0);
            
    /**
     * <p>id(0xa0d)</p>
     */
    @ComProperty(name = "FieldListSortAscending", dispId = 0xa0d)
    Boolean getFieldListSortAscending();
            
    /**
     * <p>id(0xa0d)</p>
     */
    @ComProperty(name = "FieldListSortAscending", dispId = 0xa0d)
    void setFieldListSortAscending(Boolean param0);
            
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
     * <p>id(0xa0f)</p>
     */
    @ComMethod(name = "ChangeConnection", dispId = 0xa0f)
    void ChangeConnection(WorkbookConnection conn);
            
    /**
     * <p>id(0xa11)</p>
     */
    @ComMethod(name = "ChangePivotCache", dispId = 0xa11)
    void ChangePivotCache(Object PivotCache);
            
    /**
     * <p>id(0x575)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    String getLocation();
            
    /**
     * <p>id(0x575)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    void setLocation(String param0);
            
    /**
     * <p>id(0xb38)</p>
     */
    @ComProperty(name = "EnableWriteback", dispId = 0xb38)
    Boolean getEnableWriteback();
            
    /**
     * <p>id(0xb38)</p>
     */
    @ComProperty(name = "EnableWriteback", dispId = 0xb38)
    void setEnableWriteback(Boolean param0);
            
    /**
     * <p>id(0xb39)</p>
     */
    @ComProperty(name = "Allocation", dispId = 0xb39)
    XlAllocation getAllocation();
            
    /**
     * <p>id(0xb39)</p>
     */
    @ComProperty(name = "Allocation", dispId = 0xb39)
    void setAllocation(XlAllocation param0);
            
    /**
     * <p>id(0xb3a)</p>
     */
    @ComProperty(name = "AllocationValue", dispId = 0xb3a)
    XlAllocationValue getAllocationValue();
            
    /**
     * <p>id(0xb3a)</p>
     */
    @ComProperty(name = "AllocationValue", dispId = 0xb3a)
    void setAllocationValue(XlAllocationValue param0);
            
    /**
     * <p>id(0xb3b)</p>
     */
    @ComProperty(name = "AllocationMethod", dispId = 0xb3b)
    XlAllocationMethod getAllocationMethod();
            
    /**
     * <p>id(0xb3b)</p>
     */
    @ComProperty(name = "AllocationMethod", dispId = 0xb3b)
    void setAllocationMethod(XlAllocationMethod param0);
            
    /**
     * <p>id(0xb3c)</p>
     */
    @ComProperty(name = "AllocationWeightExpression", dispId = 0xb3c)
    String getAllocationWeightExpression();
            
    /**
     * <p>id(0xb3c)</p>
     */
    @ComProperty(name = "AllocationWeightExpression", dispId = 0xb3c)
    void setAllocationWeightExpression(String param0);
            
    /**
     * <p>id(0xb27)</p>
     */
    @ComMethod(name = "AllocateChanges", dispId = 0xb27)
    void AllocateChanges();
            
    /**
     * <p>id(0xb3d)</p>
     */
    @ComMethod(name = "CommitChanges", dispId = 0xb3d)
    void CommitChanges();
            
    /**
     * <p>id(0xb28)</p>
     */
    @ComMethod(name = "DiscardChanges", dispId = 0xb28)
    void DiscardChanges();
            
    /**
     * <p>id(0xb3e)</p>
     */
    @ComMethod(name = "RefreshDataSourceValues", dispId = 0xb3e)
    void RefreshDataSourceValues();
            
    /**
     * <p>id(0xb3f)</p>
     */
    @ComMethod(name = "RepeatAllLabels", dispId = 0xb3f)
    void RepeatAllLabels(XlPivotFieldRepeatLabels Repeat);
            
    /**
     * <p>id(0xb40)</p>
     */
    @ComProperty(name = "ChangeList", dispId = 0xb40)
    PivotTableChangeList getChangeList();
            
    /**
     * <p>id(0xb41)</p>
     */
    @ComProperty(name = "Slicers", dispId = 0xb41)
    Slicers getSlicers();
            
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
     * <p>id(0xb42)</p>
     */
    @ComProperty(name = "VisualTotalsForSets", dispId = 0xb42)
    Boolean getVisualTotalsForSets();
            
    /**
     * <p>id(0xb42)</p>
     */
    @ComProperty(name = "VisualTotalsForSets", dispId = 0xb42)
    void setVisualTotalsForSets(Boolean param0);
            
    /**
     * <p>id(0xb43)</p>
     */
    @ComProperty(name = "ShowValuesRow", dispId = 0xb43)
    Boolean getShowValuesRow();
            
    /**
     * <p>id(0xb43)</p>
     */
    @ComProperty(name = "ShowValuesRow", dispId = 0xb43)
    void setShowValuesRow(Boolean param0);
            
    /**
     * <p>id(0xb44)</p>
     */
    @ComProperty(name = "CalculatedMembersInFilters", dispId = 0xb44)
    Boolean getCalculatedMembersInFilters();
            
    /**
     * <p>id(0xb44)</p>
     */
    @ComProperty(name = "CalculatedMembersInFilters", dispId = 0xb44)
    void setCalculatedMembersInFilters(Boolean param0);
            
    /**
     * <p>id(0xbf8)</p>
     */
    @ComMethod(name = "PivotValueCell", dispId = 0xbf8)
    PivotValueCell PivotValueCell(Object rowline,
            Object columnline);
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    Boolean getHidden();
            
    /**
     * <p>id(0xbfb)</p>
     */
    @ComProperty(name = "PivotChart", dispId = 0xbfb)
    Shape getPivotChart();
            
    /**
     * <p>id(0xbfc)</p>
     */
    @ComMethod(name = "DrillDown", dispId = 0xbfc)
    void DrillDown(PivotItem PivotItem,
            Object PivotLine);
            
    /**
     * <p>id(0xbfd)</p>
     */
    @ComMethod(name = "DrillUp", dispId = 0xbfd)
    void DrillUp(PivotItem PivotItem,
            Object PivotLine,
            Object LevelUniqueName);
            
    /**
     * <p>id(0xa14)</p>
     */
    @ComMethod(name = "DrillTo", dispId = 0xa14)
    void DrillTo(PivotItem PivotItem,
            CubeField CubeField,
            Object PivotLine);
            
    /**
     * <p>id(0x6f7)</p>
     */
    @ComMethod(name = "Dummy2", dispId = 0x6f7)
    Object Dummy2(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    
}