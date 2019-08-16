
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020872-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020872-0001-0000-C000-000000000046}")
public interface IPivotTable extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2c4)</p>
     * <p>vtableId(10)</p>
     * @param RowFields [in, optional] {@code Object}
     * @param ColumnFields [in, optional] {@code Object}
     * @param PageFields [in, optional] {@code Object}
     * @param AddToTable [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "AddFields", dispId = 0x2c4)
    com.sun.jna.platform.win32.WinNT.HRESULT AddFields(Object RowFields,
            Object ColumnFields,
            Object PageFields,
            Object AddToTable,
            VARIANT RHS);
            
    /**
     * <p>id(0x2c9)</p>
     * <p>vtableId(11)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "ColumnFields", dispId = 0x2c9)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2b6)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ColumnGrand", dispId = 0x2b6)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnGrand(VARIANT RHS);
            
    /**
     * <p>id(0x2b6)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ColumnGrand", dispId = 0x2b6)
    com.sun.jna.platform.win32.WinNT.HRESULT setColumnGrand(Boolean RHS);
            
    /**
     * <p>id(0x2be)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "ColumnRange", dispId = 0x2be)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnRange(VARIANT RHS);
            
    /**
     * <p>id(0x2c2)</p>
     * <p>vtableId(15)</p>
     * @param PageField [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ShowPages", dispId = 0x2c2)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowPages(Object PageField,
            VARIANT RHS);
            
    /**
     * <p>id(0x2c1)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "DataBodyRange", dispId = 0x2c1)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataBodyRange(VARIANT RHS);
            
    /**
     * <p>id(0x2cb)</p>
     * <p>vtableId(17)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "DataFields", dispId = 0x2cb)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2c0)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "DataLabelRange", dispId = 0x2c0)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataLabelRange(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT set_Default(String RHS);
            
    /**
     * <p>id(0x2b7)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasAutoFormat", dispId = 0x2b7)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasAutoFormat(VARIANT RHS);
            
    /**
     * <p>id(0x2b7)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasAutoFormat", dispId = 0x2b7)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasAutoFormat(Boolean RHS);
            
    /**
     * <p>id(0x2c7)</p>
     * <p>vtableId(23)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "HiddenFields", dispId = 0x2c7)
    com.sun.jna.platform.win32.WinNT.HRESULT getHiddenFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2ba)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "InnerDetail", dispId = 0x2ba)
    com.sun.jna.platform.win32.WinNT.HRESULT getInnerDetail(VARIANT RHS);
            
    /**
     * <p>id(0x2ba)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "InnerDetail", dispId = 0x2ba)
    com.sun.jna.platform.win32.WinNT.HRESULT setInnerDetail(String RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x2ca)</p>
     * <p>vtableId(28)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "PageFields", dispId = 0x2ca)
    com.sun.jna.platform.win32.WinNT.HRESULT getPageFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2bf)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "PageRange", dispId = 0x2bf)
    com.sun.jna.platform.win32.WinNT.HRESULT getPageRange(VARIANT RHS);
            
    /**
     * <p>id(0x5ca)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "PageRangeCells", dispId = 0x5ca)
    com.sun.jna.platform.win32.WinNT.HRESULT getPageRangeCells(VARIANT RHS);
            
    /**
     * <p>id(0x2ce)</p>
     * <p>vtableId(31)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "PivotFields", dispId = 0x2ce)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2b8)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code java.util.Date}
     */
    @ComProperty(name = "RefreshDate", dispId = 0x2b8)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshDate(VARIANT RHS);
            
    /**
     * <p>id(0x2b9)</p>
     * <p>vtableId(33)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "RefreshName", dispId = 0x2b9)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshName(VARIANT RHS);
            
    /**
     * <p>id(0x2cd)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComMethod(name = "RefreshTable", dispId = 0x2cd)
    com.sun.jna.platform.win32.WinNT.HRESULT RefreshTable(VARIANT RHS);
            
    /**
     * <p>id(0x2c8)</p>
     * <p>vtableId(35)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "RowFields", dispId = 0x2c8)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2b5)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RowGrand", dispId = 0x2b5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowGrand(VARIANT RHS);
            
    /**
     * <p>id(0x2b5)</p>
     * <p>vtableId(37)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RowGrand", dispId = 0x2b5)
    com.sun.jna.platform.win32.WinNT.HRESULT setRowGrand(Boolean RHS);
            
    /**
     * <p>id(0x2bd)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "RowRange", dispId = 0x2bd)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowRange(VARIANT RHS);
            
    /**
     * <p>id(0x2b4)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SaveData", dispId = 0x2b4)
    com.sun.jna.platform.win32.WinNT.HRESULT getSaveData(VARIANT RHS);
            
    /**
     * <p>id(0x2b4)</p>
     * <p>vtableId(40)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "SaveData", dispId = 0x2b4)
    com.sun.jna.platform.win32.WinNT.HRESULT setSaveData(Boolean RHS);
            
    /**
     * <p>id(0x2ae)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceData(VARIANT RHS);
            
    /**
     * <p>id(0x2ae)</p>
     * <p>vtableId(42)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceData(Object RHS);
            
    /**
     * <p>id(0x2bb)</p>
     * <p>vtableId(43)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "TableRange1", dispId = 0x2bb)
    com.sun.jna.platform.win32.WinNT.HRESULT getTableRange1(VARIANT RHS);
            
    /**
     * <p>id(0x2bc)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "TableRange2", dispId = 0x2bc)
    com.sun.jna.platform.win32.WinNT.HRESULT getTableRange2(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(45)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(46)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(String RHS);
            
    /**
     * <p>id(0x2c6)</p>
     * <p>vtableId(47)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "VisibleFields", dispId = 0x2c6)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleFields(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x5cb)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "CacheIndex", dispId = 0x5cb)
    com.sun.jna.platform.win32.WinNT.HRESULT getCacheIndex(VARIANT RHS);
            
    /**
     * <p>id(0x5cb)</p>
     * <p>vtableId(49)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "CacheIndex", dispId = 0x5cb)
    com.sun.jna.platform.win32.WinNT.HRESULT setCacheIndex(Integer RHS);
            
    /**
     * <p>id(0x5cc)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code CalculatedFields}
     */
    @ComMethod(name = "CalculatedFields", dispId = 0x5cc)
    com.sun.jna.platform.win32.WinNT.HRESULT CalculatedFields(VARIANT RHS);
            
    /**
     * <p>id(0x5cd)</p>
     * <p>vtableId(51)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayErrorString", dispId = 0x5cd)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayErrorString(VARIANT RHS);
            
    /**
     * <p>id(0x5cd)</p>
     * <p>vtableId(52)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayErrorString", dispId = 0x5cd)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayErrorString(Boolean RHS);
            
    /**
     * <p>id(0x5ce)</p>
     * <p>vtableId(53)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayNullString", dispId = 0x5ce)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayNullString(VARIANT RHS);
            
    /**
     * <p>id(0x5ce)</p>
     * <p>vtableId(54)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayNullString", dispId = 0x5ce)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayNullString(Boolean RHS);
            
    /**
     * <p>id(0x5cf)</p>
     * <p>vtableId(55)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableDrilldown", dispId = 0x5cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableDrilldown(VARIANT RHS);
            
    /**
     * <p>id(0x5cf)</p>
     * <p>vtableId(56)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableDrilldown", dispId = 0x5cf)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableDrilldown(Boolean RHS);
            
    /**
     * <p>id(0x5d0)</p>
     * <p>vtableId(57)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableFieldDialog", dispId = 0x5d0)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableFieldDialog(VARIANT RHS);
            
    /**
     * <p>id(0x5d0)</p>
     * <p>vtableId(58)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableFieldDialog", dispId = 0x5d0)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableFieldDialog(Boolean RHS);
            
    /**
     * <p>id(0x5d1)</p>
     * <p>vtableId(59)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableWizard", dispId = 0x5d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableWizard(VARIANT RHS);
            
    /**
     * <p>id(0x5d1)</p>
     * <p>vtableId(60)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableWizard", dispId = 0x5d1)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableWizard(Boolean RHS);
            
    /**
     * <p>id(0x5d2)</p>
     * <p>vtableId(61)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ErrorString", dispId = 0x5d2)
    com.sun.jna.platform.win32.WinNT.HRESULT getErrorString(VARIANT RHS);
            
    /**
     * <p>id(0x5d2)</p>
     * <p>vtableId(62)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "ErrorString", dispId = 0x5d2)
    com.sun.jna.platform.win32.WinNT.HRESULT setErrorString(String RHS);
            
    /**
     * <p>id(0x5d3)</p>
     * <p>vtableId(63)</p>
     * @param Name [in] {@code String}
     * @param RHS [out] {@code Double}
     */
    @ComMethod(name = "GetData", dispId = 0x5d3)
    com.sun.jna.platform.win32.WinNT.HRESULT GetData(String Name,
            VARIANT RHS);
            
    /**
     * <p>id(0x5d4)</p>
     * <p>vtableId(64)</p>
     */
    @ComMethod(name = "ListFormulas", dispId = 0x5d4)
    com.sun.jna.platform.win32.WinNT.HRESULT ListFormulas();
            
    /**
     * <p>id(0x5d5)</p>
     * <p>vtableId(65)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ManualUpdate", dispId = 0x5d5)
    com.sun.jna.platform.win32.WinNT.HRESULT getManualUpdate(VARIANT RHS);
            
    /**
     * <p>id(0x5d5)</p>
     * <p>vtableId(66)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ManualUpdate", dispId = 0x5d5)
    com.sun.jna.platform.win32.WinNT.HRESULT setManualUpdate(Boolean RHS);
            
    /**
     * <p>id(0x5d6)</p>
     * <p>vtableId(67)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "MergeLabels", dispId = 0x5d6)
    com.sun.jna.platform.win32.WinNT.HRESULT getMergeLabels(VARIANT RHS);
            
    /**
     * <p>id(0x5d6)</p>
     * <p>vtableId(68)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "MergeLabels", dispId = 0x5d6)
    com.sun.jna.platform.win32.WinNT.HRESULT setMergeLabels(Boolean RHS);
            
    /**
     * <p>id(0x5d7)</p>
     * <p>vtableId(69)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "NullString", dispId = 0x5d7)
    com.sun.jna.platform.win32.WinNT.HRESULT getNullString(VARIANT RHS);
            
    /**
     * <p>id(0x5d7)</p>
     * <p>vtableId(70)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "NullString", dispId = 0x5d7)
    com.sun.jna.platform.win32.WinNT.HRESULT setNullString(String RHS);
            
    /**
     * <p>id(0x5d8)</p>
     * <p>vtableId(71)</p>
     * @param RHS [out] {@code PivotCache}
     */
    @ComMethod(name = "PivotCache", dispId = 0x5d8)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotCache(VARIANT RHS);
            
    /**
     * <p>id(0x5d9)</p>
     * <p>vtableId(72)</p>
     * @param RHS [out] {@code PivotFormulas}
     */
    @ComProperty(name = "PivotFormulas", dispId = 0x5d9)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotFormulas(VARIANT RHS);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT PivotTableWizard(Object SourceType,
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
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SubtotalHiddenPageItems", dispId = 0x5da)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubtotalHiddenPageItems(VARIANT RHS);
            
    /**
     * <p>id(0x5da)</p>
     * <p>vtableId(75)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "SubtotalHiddenPageItems", dispId = 0x5da)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubtotalHiddenPageItems(Boolean RHS);
            
    /**
     * <p>id(0x595)</p>
     * <p>vtableId(76)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "PageFieldOrder", dispId = 0x595)
    com.sun.jna.platform.win32.WinNT.HRESULT getPageFieldOrder(VARIANT RHS);
            
    /**
     * <p>id(0x595)</p>
     * <p>vtableId(77)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "PageFieldOrder", dispId = 0x595)
    com.sun.jna.platform.win32.WinNT.HRESULT setPageFieldOrder(Integer RHS);
            
    /**
     * <p>id(0x5db)</p>
     * <p>vtableId(78)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "PageFieldStyle", dispId = 0x5db)
    com.sun.jna.platform.win32.WinNT.HRESULT getPageFieldStyle(VARIANT RHS);
            
    /**
     * <p>id(0x5db)</p>
     * <p>vtableId(79)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "PageFieldStyle", dispId = 0x5db)
    com.sun.jna.platform.win32.WinNT.HRESULT setPageFieldStyle(String RHS);
            
    /**
     * <p>id(0x596)</p>
     * <p>vtableId(80)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "PageFieldWrapCount", dispId = 0x596)
    com.sun.jna.platform.win32.WinNT.HRESULT getPageFieldWrapCount(VARIANT RHS);
            
    /**
     * <p>id(0x596)</p>
     * <p>vtableId(81)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "PageFieldWrapCount", dispId = 0x596)
    com.sun.jna.platform.win32.WinNT.HRESULT setPageFieldWrapCount(Integer RHS);
            
    /**
     * <p>id(0x5dc)</p>
     * <p>vtableId(82)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    com.sun.jna.platform.win32.WinNT.HRESULT getPreserveFormatting(VARIANT RHS);
            
    /**
     * <p>id(0x5dc)</p>
     * <p>vtableId(83)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    com.sun.jna.platform.win32.WinNT.HRESULT setPreserveFormatting(Boolean RHS);
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(84)</p>
     * @param Name [in] {@code String}
     * @param Mode [in, optional] {@code XlPTSelectionMode}
     */
    @ComMethod(name = "_PivotSelect", dispId = 0x827)
    com.sun.jna.platform.win32.WinNT.HRESULT _PivotSelect(String Name,
            XlPTSelectionMode Mode);
            
    /**
     * <p>id(0x5de)</p>
     * <p>vtableId(85)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "PivotSelection", dispId = 0x5de)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotSelection(VARIANT RHS);
            
    /**
     * <p>id(0x5de)</p>
     * <p>vtableId(86)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "PivotSelection", dispId = 0x5de)
    com.sun.jna.platform.win32.WinNT.HRESULT setPivotSelection(String RHS);
            
    /**
     * <p>id(0x5df)</p>
     * <p>vtableId(87)</p>
     * @param RHS [out] {@code XlPTSelectionMode}
     */
    @ComProperty(name = "SelectionMode", dispId = 0x5df)
    com.sun.jna.platform.win32.WinNT.HRESULT getSelectionMode(VARIANT RHS);
            
    /**
     * <p>id(0x5df)</p>
     * <p>vtableId(88)</p>
     * @param RHS [in] {@code XlPTSelectionMode}
     */
    @ComProperty(name = "SelectionMode", dispId = 0x5df)
    com.sun.jna.platform.win32.WinNT.HRESULT setSelectionMode(XlPTSelectionMode RHS);
            
    /**
     * <p>id(0x5e0)</p>
     * <p>vtableId(89)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "TableStyle", dispId = 0x5e0)
    com.sun.jna.platform.win32.WinNT.HRESULT getTableStyle(VARIANT RHS);
            
    /**
     * <p>id(0x5e0)</p>
     * <p>vtableId(90)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "TableStyle", dispId = 0x5e0)
    com.sun.jna.platform.win32.WinNT.HRESULT setTableStyle(String RHS);
            
    /**
     * <p>id(0x5e1)</p>
     * <p>vtableId(91)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x5e1)
    com.sun.jna.platform.win32.WinNT.HRESULT getTag(VARIANT RHS);
            
    /**
     * <p>id(0x5e1)</p>
     * <p>vtableId(92)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x5e1)
    com.sun.jna.platform.win32.WinNT.HRESULT setTag(String RHS);
            
    /**
     * <p>id(0x2a8)</p>
     * <p>vtableId(93)</p>
     */
    @ComMethod(name = "Update", dispId = 0x2a8)
    com.sun.jna.platform.win32.WinNT.HRESULT Update();
            
    /**
     * <p>id(0x5e2)</p>
     * <p>vtableId(94)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "VacatedStyle", dispId = 0x5e2)
    com.sun.jna.platform.win32.WinNT.HRESULT getVacatedStyle(VARIANT RHS);
            
    /**
     * <p>id(0x5e2)</p>
     * <p>vtableId(95)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "VacatedStyle", dispId = 0x5e2)
    com.sun.jna.platform.win32.WinNT.HRESULT setVacatedStyle(String RHS);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(96)</p>
     * @param Format [in] {@code XlPivotFormatType}
     */
    @ComMethod(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT Format(XlPivotFormatType Format);
            
    /**
     * <p>id(0x72e)</p>
     * <p>vtableId(97)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PrintTitles", dispId = 0x72e)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintTitles(VARIANT RHS);
            
    /**
     * <p>id(0x72e)</p>
     * <p>vtableId(98)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PrintTitles", dispId = 0x72e)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintTitles(Boolean RHS);
            
    /**
     * <p>id(0x72f)</p>
     * <p>vtableId(99)</p>
     * @param RHS [out] {@code CubeFields}
     */
    @ComProperty(name = "CubeFields", dispId = 0x72f)
    com.sun.jna.platform.win32.WinNT.HRESULT getCubeFields(VARIANT RHS);
            
    /**
     * <p>id(0x730)</p>
     * <p>vtableId(100)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "GrandTotalName", dispId = 0x730)
    com.sun.jna.platform.win32.WinNT.HRESULT getGrandTotalName(VARIANT RHS);
            
    /**
     * <p>id(0x730)</p>
     * <p>vtableId(101)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "GrandTotalName", dispId = 0x730)
    com.sun.jna.platform.win32.WinNT.HRESULT setGrandTotalName(String RHS);
            
    /**
     * <p>id(0x731)</p>
     * <p>vtableId(102)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SmallGrid", dispId = 0x731)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmallGrid(VARIANT RHS);
            
    /**
     * <p>id(0x731)</p>
     * <p>vtableId(103)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "SmallGrid", dispId = 0x731)
    com.sun.jna.platform.win32.WinNT.HRESULT setSmallGrid(Boolean RHS);
            
    /**
     * <p>id(0x732)</p>
     * <p>vtableId(104)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RepeatItemsOnEachPrintedPage", dispId = 0x732)
    com.sun.jna.platform.win32.WinNT.HRESULT getRepeatItemsOnEachPrintedPage(VARIANT RHS);
            
    /**
     * <p>id(0x732)</p>
     * <p>vtableId(105)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RepeatItemsOnEachPrintedPage", dispId = 0x732)
    com.sun.jna.platform.win32.WinNT.HRESULT setRepeatItemsOnEachPrintedPage(Boolean RHS);
            
    /**
     * <p>id(0x733)</p>
     * <p>vtableId(106)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "TotalsAnnotation", dispId = 0x733)
    com.sun.jna.platform.win32.WinNT.HRESULT getTotalsAnnotation(VARIANT RHS);
            
    /**
     * <p>id(0x733)</p>
     * <p>vtableId(107)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "TotalsAnnotation", dispId = 0x733)
    com.sun.jna.platform.win32.WinNT.HRESULT setTotalsAnnotation(Boolean RHS);
            
    /**
     * <p>id(0x5dd)</p>
     * <p>vtableId(108)</p>
     * @param Name [in] {@code String}
     * @param Mode [in, optional] {@code XlPTSelectionMode}
     * @param UseStandardName [in, optional] {@code Object}
     */
    @ComMethod(name = "PivotSelect", dispId = 0x5dd)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotSelect(String Name,
            XlPTSelectionMode Mode,
            Object UseStandardName);
            
    /**
     * <p>id(0x829)</p>
     * <p>vtableId(109)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "PivotSelectionStandard", dispId = 0x829)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotSelectionStandard(VARIANT RHS);
            
    /**
     * <p>id(0x829)</p>
     * <p>vtableId(110)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "PivotSelectionStandard", dispId = 0x829)
    com.sun.jna.platform.win32.WinNT.HRESULT setPivotSelectionStandard(String RHS);
            
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
     * @param RHS [out] {@code Range}
     */
    @ComMethod(name = "GetPivotData", dispId = 0x82a)
    com.sun.jna.platform.win32.WinNT.HRESULT GetPivotData(Object DataField,
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
            Object Item14,
            VARIANT RHS);
            
    /**
     * <p>id(0x848)</p>
     * <p>vtableId(112)</p>
     * @param RHS [out] {@code PivotField}
     */
    @ComProperty(name = "DataPivotField", dispId = 0x848)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataPivotField(VARIANT RHS);
            
    /**
     * <p>id(0x849)</p>
     * <p>vtableId(113)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableDataValueEditing", dispId = 0x849)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableDataValueEditing(VARIANT RHS);
            
    /**
     * <p>id(0x849)</p>
     * <p>vtableId(114)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableDataValueEditing", dispId = 0x849)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableDataValueEditing(Boolean RHS);
            
    /**
     * <p>id(0x84a)</p>
     * <p>vtableId(115)</p>
     * @param Field [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Caption [in, optional] {@code Object}
     * @param Function [in, optional] {@code Object}
     * @param RHS [out] {@code PivotField}
     */
    @ComMethod(name = "AddDataField", dispId = 0x84a)
    com.sun.jna.platform.win32.WinNT.HRESULT AddDataField(com.sun.jna.platform.win32.COM.util.IDispatch Field,
            Object Caption,
            Object Function,
            VARIANT RHS);
            
    /**
     * <p>id(0x84b)</p>
     * <p>vtableId(116)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "MDX", dispId = 0x84b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMDX(VARIANT RHS);
            
    /**
     * <p>id(0x84c)</p>
     * <p>vtableId(117)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ViewCalculatedMembers", dispId = 0x84c)
    com.sun.jna.platform.win32.WinNT.HRESULT getViewCalculatedMembers(VARIANT RHS);
            
    /**
     * <p>id(0x84c)</p>
     * <p>vtableId(118)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ViewCalculatedMembers", dispId = 0x84c)
    com.sun.jna.platform.win32.WinNT.HRESULT setViewCalculatedMembers(Boolean RHS);
            
    /**
     * <p>id(0x84d)</p>
     * <p>vtableId(119)</p>
     * @param RHS [out] {@code CalculatedMembers}
     */
    @ComProperty(name = "CalculatedMembers", dispId = 0x84d)
    com.sun.jna.platform.win32.WinNT.HRESULT getCalculatedMembers(VARIANT RHS);
            
    /**
     * <p>id(0x84e)</p>
     * <p>vtableId(120)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayImmediateItems", dispId = 0x84e)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayImmediateItems(VARIANT RHS);
            
    /**
     * <p>id(0x84e)</p>
     * <p>vtableId(121)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayImmediateItems", dispId = 0x84e)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayImmediateItems(Boolean RHS);
            
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
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Dummy15", dispId = 0x84f)
    com.sun.jna.platform.win32.WinNT.HRESULT Dummy15(Object Arg1,
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
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0x850)</p>
     * <p>vtableId(123)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableFieldList", dispId = 0x850)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableFieldList(VARIANT RHS);
            
    /**
     * <p>id(0x850)</p>
     * <p>vtableId(124)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableFieldList", dispId = 0x850)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableFieldList(Boolean RHS);
            
    /**
     * <p>id(0x851)</p>
     * <p>vtableId(125)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "VisualTotals", dispId = 0x851)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisualTotals(VARIANT RHS);
            
    /**
     * <p>id(0x851)</p>
     * <p>vtableId(126)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "VisualTotals", dispId = 0x851)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisualTotals(Boolean RHS);
            
    /**
     * <p>id(0x852)</p>
     * <p>vtableId(127)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowPageMultipleItemLabel", dispId = 0x852)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowPageMultipleItemLabel(VARIANT RHS);
            
    /**
     * <p>id(0x852)</p>
     * <p>vtableId(128)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowPageMultipleItemLabel", dispId = 0x852)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowPageMultipleItemLabel(Boolean RHS);
            
    /**
     * <p>id(0x188)</p>
     * <p>vtableId(129)</p>
     * @param RHS [out] {@code XlPivotTableVersionList}
     */
    @ComProperty(name = "Version", dispId = 0x188)
    com.sun.jna.platform.win32.WinNT.HRESULT getVersion(VARIANT RHS);
            
    /**
     * <p>id(0x853)</p>
     * <p>vtableId(130)</p>
     * @param File [in] {@code String}
     * @param Measures [in, optional] {@code Object}
     * @param Levels [in, optional] {@code Object}
     * @param Members [in, optional] {@code Object}
     * @param Properties [in, optional] {@code Object}
     * @param RHS [out] {@code String}
     */
    @ComMethod(name = "CreateCubeFile", dispId = 0x853)
    com.sun.jna.platform.win32.WinNT.HRESULT CreateCubeFile(String File,
            Object Measures,
            Object Levels,
            Object Members,
            Object Properties,
            VARIANT RHS);
            
    /**
     * <p>id(0x858)</p>
     * <p>vtableId(131)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayEmptyRow", dispId = 0x858)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayEmptyRow(VARIANT RHS);
            
    /**
     * <p>id(0x858)</p>
     * <p>vtableId(132)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayEmptyRow", dispId = 0x858)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayEmptyRow(Boolean RHS);
            
    /**
     * <p>id(0x859)</p>
     * <p>vtableId(133)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayEmptyColumn", dispId = 0x859)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayEmptyColumn(VARIANT RHS);
            
    /**
     * <p>id(0x859)</p>
     * <p>vtableId(134)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayEmptyColumn", dispId = 0x859)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayEmptyColumn(Boolean RHS);
            
    /**
     * <p>id(0x85a)</p>
     * <p>vtableId(135)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowCellBackgroundFromOLAP", dispId = 0x85a)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowCellBackgroundFromOLAP(VARIANT RHS);
            
    /**
     * <p>id(0x85a)</p>
     * <p>vtableId(136)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowCellBackgroundFromOLAP", dispId = 0x85a)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowCellBackgroundFromOLAP(Boolean RHS);
            
    /**
     * <p>id(0x9f2)</p>
     * <p>vtableId(137)</p>
     * @param RHS [out] {@code PivotAxis}
     */
    @ComProperty(name = "PivotColumnAxis", dispId = 0x9f2)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotColumnAxis(VARIANT RHS);
            
    /**
     * <p>id(0x9f3)</p>
     * <p>vtableId(138)</p>
     * @param RHS [out] {@code PivotAxis}
     */
    @ComProperty(name = "PivotRowAxis", dispId = 0x9f3)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotRowAxis(VARIANT RHS);
            
    /**
     * <p>id(0x9f4)</p>
     * <p>vtableId(139)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowDrillIndicators", dispId = 0x9f4)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowDrillIndicators(VARIANT RHS);
            
    /**
     * <p>id(0x9f4)</p>
     * <p>vtableId(140)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowDrillIndicators", dispId = 0x9f4)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowDrillIndicators(Boolean RHS);
            
    /**
     * <p>id(0x9f5)</p>
     * <p>vtableId(141)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PrintDrillIndicators", dispId = 0x9f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintDrillIndicators(VARIANT RHS);
            
    /**
     * <p>id(0x9f5)</p>
     * <p>vtableId(142)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PrintDrillIndicators", dispId = 0x9f5)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintDrillIndicators(Boolean RHS);
            
    /**
     * <p>id(0x9f6)</p>
     * <p>vtableId(143)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayMemberPropertyTooltips", dispId = 0x9f6)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayMemberPropertyTooltips(VARIANT RHS);
            
    /**
     * <p>id(0x9f6)</p>
     * <p>vtableId(144)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayMemberPropertyTooltips", dispId = 0x9f6)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayMemberPropertyTooltips(Boolean RHS);
            
    /**
     * <p>id(0x9f7)</p>
     * <p>vtableId(145)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayContextTooltips", dispId = 0x9f7)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayContextTooltips(VARIANT RHS);
            
    /**
     * <p>id(0x9f7)</p>
     * <p>vtableId(146)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayContextTooltips", dispId = 0x9f7)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayContextTooltips(Boolean RHS);
            
    /**
     * <p>id(0x9f8)</p>
     * <p>vtableId(147)</p>
     */
    @ComMethod(name = "ClearTable", dispId = 0x9f8)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearTable();
            
    /**
     * <p>id(0x9f9)</p>
     * <p>vtableId(148)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "CompactRowIndent", dispId = 0x9f9)
    com.sun.jna.platform.win32.WinNT.HRESULT getCompactRowIndent(VARIANT RHS);
            
    /**
     * <p>id(0x9f9)</p>
     * <p>vtableId(149)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "CompactRowIndent", dispId = 0x9f9)
    com.sun.jna.platform.win32.WinNT.HRESULT setCompactRowIndent(Integer RHS);
            
    /**
     * <p>id(0x9fa)</p>
     * <p>vtableId(150)</p>
     * @param RHS [out] {@code XlLayoutRowType}
     */
    @ComProperty(name = "LayoutRowDefault", dispId = 0x9fa)
    com.sun.jna.platform.win32.WinNT.HRESULT getLayoutRowDefault(VARIANT RHS);
            
    /**
     * <p>id(0x9fa)</p>
     * <p>vtableId(151)</p>
     * @param RHS [in] {@code XlLayoutRowType}
     */
    @ComProperty(name = "LayoutRowDefault", dispId = 0x9fa)
    com.sun.jna.platform.win32.WinNT.HRESULT setLayoutRowDefault(XlLayoutRowType RHS);
            
    /**
     * <p>id(0x9fb)</p>
     * <p>vtableId(152)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayFieldCaptions", dispId = 0x9fb)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayFieldCaptions(VARIANT RHS);
            
    /**
     * <p>id(0x9fb)</p>
     * <p>vtableId(153)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayFieldCaptions", dispId = 0x9fb)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayFieldCaptions(Boolean RHS);
            
    /**
     * <p>id(0x9fc)</p>
     * <p>vtableId(154)</p>
     * @param RowLayout [in] {@code XlLayoutRowType}
     */
    @ComMethod(name = "RowAxisLayout", dispId = 0x9fc)
    com.sun.jna.platform.win32.WinNT.HRESULT RowAxisLayout(XlLayoutRowType RowLayout);
            
    /**
     * <p>id(0x9fe)</p>
     * <p>vtableId(155)</p>
     * @param Location [in] {@code XlSubtototalLocationType}
     */
    @ComMethod(name = "SubtotalLocation", dispId = 0x9fe)
    com.sun.jna.platform.win32.WinNT.HRESULT SubtotalLocation(XlSubtototalLocationType Location);
            
    /**
     * <p>id(0x9ff)</p>
     * <p>vtableId(156)</p>
     * @param RHS [out] {@code PivotFilters}
     */
    @ComProperty(name = "ActiveFilters", dispId = 0x9ff)
    com.sun.jna.platform.win32.WinNT.HRESULT getActiveFilters(VARIANT RHS);
            
    /**
     * <p>id(0xa00)</p>
     * <p>vtableId(157)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "InGridDropZones", dispId = 0xa00)
    com.sun.jna.platform.win32.WinNT.HRESULT getInGridDropZones(VARIANT RHS);
            
    /**
     * <p>id(0xa00)</p>
     * <p>vtableId(158)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "InGridDropZones", dispId = 0xa00)
    com.sun.jna.platform.win32.WinNT.HRESULT setInGridDropZones(Boolean RHS);
            
    /**
     * <p>id(0xa01)</p>
     * <p>vtableId(159)</p>
     */
    @ComMethod(name = "ClearAllFilters", dispId = 0xa01)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearAllFilters();
            
    /**
     * <p>id(0xa02)</p>
     * <p>vtableId(160)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "TableStyle2", dispId = 0xa02)
    com.sun.jna.platform.win32.WinNT.HRESULT getTableStyle2(VARIANT RHS);
            
    /**
     * <p>id(0xa02)</p>
     * <p>vtableId(161)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "TableStyle2", dispId = 0xa02)
    com.sun.jna.platform.win32.WinNT.HRESULT setTableStyle2(Object RHS);
            
    /**
     * <p>id(0xa03)</p>
     * <p>vtableId(162)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleLastColumn", dispId = 0xa03)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowTableStyleLastColumn(VARIANT RHS);
            
    /**
     * <p>id(0xa03)</p>
     * <p>vtableId(163)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleLastColumn", dispId = 0xa03)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowTableStyleLastColumn(Boolean RHS);
            
    /**
     * <p>id(0xa04)</p>
     * <p>vtableId(164)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleRowStripes", dispId = 0xa04)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowTableStyleRowStripes(VARIANT RHS);
            
    /**
     * <p>id(0xa04)</p>
     * <p>vtableId(165)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleRowStripes", dispId = 0xa04)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowTableStyleRowStripes(Boolean RHS);
            
    /**
     * <p>id(0xa05)</p>
     * <p>vtableId(166)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleColumnStripes", dispId = 0xa05)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowTableStyleColumnStripes(VARIANT RHS);
            
    /**
     * <p>id(0xa05)</p>
     * <p>vtableId(167)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleColumnStripes", dispId = 0xa05)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowTableStyleColumnStripes(Boolean RHS);
            
    /**
     * <p>id(0xa06)</p>
     * <p>vtableId(168)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleRowHeaders", dispId = 0xa06)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowTableStyleRowHeaders(VARIANT RHS);
            
    /**
     * <p>id(0xa06)</p>
     * <p>vtableId(169)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleRowHeaders", dispId = 0xa06)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowTableStyleRowHeaders(Boolean RHS);
            
    /**
     * <p>id(0xa07)</p>
     * <p>vtableId(170)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleColumnHeaders", dispId = 0xa07)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowTableStyleColumnHeaders(VARIANT RHS);
            
    /**
     * <p>id(0xa07)</p>
     * <p>vtableId(171)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTableStyleColumnHeaders", dispId = 0xa07)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowTableStyleColumnHeaders(Boolean RHS);
            
    /**
     * <p>id(0xa08)</p>
     * <p>vtableId(172)</p>
     * @param ConvertFilters [in] {@code Boolean}
     */
    @ComMethod(name = "ConvertToFormulas", dispId = 0xa08)
    com.sun.jna.platform.win32.WinNT.HRESULT ConvertToFormulas(Boolean ConvertFilters);
            
    /**
     * <p>id(0xa0a)</p>
     * <p>vtableId(173)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowMultipleFilters", dispId = 0xa0a)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowMultipleFilters(VARIANT RHS);
            
    /**
     * <p>id(0xa0a)</p>
     * <p>vtableId(174)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AllowMultipleFilters", dispId = 0xa0a)
    com.sun.jna.platform.win32.WinNT.HRESULT setAllowMultipleFilters(Boolean RHS);
            
    /**
     * <p>id(0xa0b)</p>
     * <p>vtableId(175)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "CompactLayoutRowHeader", dispId = 0xa0b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCompactLayoutRowHeader(VARIANT RHS);
            
    /**
     * <p>id(0xa0b)</p>
     * <p>vtableId(176)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "CompactLayoutRowHeader", dispId = 0xa0b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCompactLayoutRowHeader(String RHS);
            
    /**
     * <p>id(0xa0c)</p>
     * <p>vtableId(177)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "CompactLayoutColumnHeader", dispId = 0xa0c)
    com.sun.jna.platform.win32.WinNT.HRESULT getCompactLayoutColumnHeader(VARIANT RHS);
            
    /**
     * <p>id(0xa0c)</p>
     * <p>vtableId(178)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "CompactLayoutColumnHeader", dispId = 0xa0c)
    com.sun.jna.platform.win32.WinNT.HRESULT setCompactLayoutColumnHeader(String RHS);
            
    /**
     * <p>id(0xa0d)</p>
     * <p>vtableId(179)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "FieldListSortAscending", dispId = 0xa0d)
    com.sun.jna.platform.win32.WinNT.HRESULT getFieldListSortAscending(VARIANT RHS);
            
    /**
     * <p>id(0xa0d)</p>
     * <p>vtableId(180)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "FieldListSortAscending", dispId = 0xa0d)
    com.sun.jna.platform.win32.WinNT.HRESULT setFieldListSortAscending(Boolean RHS);
            
    /**
     * <p>id(0xa0e)</p>
     * <p>vtableId(181)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SortUsingCustomLists", dispId = 0xa0e)
    com.sun.jna.platform.win32.WinNT.HRESULT getSortUsingCustomLists(VARIANT RHS);
            
    /**
     * <p>id(0xa0e)</p>
     * <p>vtableId(182)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "SortUsingCustomLists", dispId = 0xa0e)
    com.sun.jna.platform.win32.WinNT.HRESULT setSortUsingCustomLists(Boolean RHS);
            
    /**
     * <p>id(0xa0f)</p>
     * <p>vtableId(183)</p>
     * @param conn [in] {@code WorkbookConnection}
     */
    @ComMethod(name = "ChangeConnection", dispId = 0xa0f)
    com.sun.jna.platform.win32.WinNT.HRESULT ChangeConnection(WorkbookConnection conn);
            
    /**
     * <p>id(0xa11)</p>
     * <p>vtableId(184)</p>
     * @param PivotCache [in] {@code Object}
     */
    @ComMethod(name = "ChangePivotCache", dispId = 0xa11)
    com.sun.jna.platform.win32.WinNT.HRESULT ChangePivotCache(Object PivotCache);
            
    /**
     * <p>id(0x575)</p>
     * <p>vtableId(185)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Location", dispId = 0x575)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocation(VARIANT RHS);
            
    /**
     * <p>id(0x575)</p>
     * <p>vtableId(186)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Location", dispId = 0x575)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocation(String RHS);
            
    /**
     * <p>id(0xb38)</p>
     * <p>vtableId(187)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableWriteback", dispId = 0xb38)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableWriteback(VARIANT RHS);
            
    /**
     * <p>id(0xb38)</p>
     * <p>vtableId(188)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableWriteback", dispId = 0xb38)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableWriteback(Boolean RHS);
            
    /**
     * <p>id(0xb39)</p>
     * <p>vtableId(189)</p>
     * @param RHS [out] {@code XlAllocation}
     */
    @ComProperty(name = "Allocation", dispId = 0xb39)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllocation(VARIANT RHS);
            
    /**
     * <p>id(0xb39)</p>
     * <p>vtableId(190)</p>
     * @param RHS [in] {@code XlAllocation}
     */
    @ComProperty(name = "Allocation", dispId = 0xb39)
    com.sun.jna.platform.win32.WinNT.HRESULT setAllocation(XlAllocation RHS);
            
    /**
     * <p>id(0xb3a)</p>
     * <p>vtableId(191)</p>
     * @param RHS [out] {@code XlAllocationValue}
     */
    @ComProperty(name = "AllocationValue", dispId = 0xb3a)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllocationValue(VARIANT RHS);
            
    /**
     * <p>id(0xb3a)</p>
     * <p>vtableId(192)</p>
     * @param RHS [in] {@code XlAllocationValue}
     */
    @ComProperty(name = "AllocationValue", dispId = 0xb3a)
    com.sun.jna.platform.win32.WinNT.HRESULT setAllocationValue(XlAllocationValue RHS);
            
    /**
     * <p>id(0xb3b)</p>
     * <p>vtableId(193)</p>
     * @param RHS [out] {@code XlAllocationMethod}
     */
    @ComProperty(name = "AllocationMethod", dispId = 0xb3b)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllocationMethod(VARIANT RHS);
            
    /**
     * <p>id(0xb3b)</p>
     * <p>vtableId(194)</p>
     * @param RHS [in] {@code XlAllocationMethod}
     */
    @ComProperty(name = "AllocationMethod", dispId = 0xb3b)
    com.sun.jna.platform.win32.WinNT.HRESULT setAllocationMethod(XlAllocationMethod RHS);
            
    /**
     * <p>id(0xb3c)</p>
     * <p>vtableId(195)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "AllocationWeightExpression", dispId = 0xb3c)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllocationWeightExpression(VARIANT RHS);
            
    /**
     * <p>id(0xb3c)</p>
     * <p>vtableId(196)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "AllocationWeightExpression", dispId = 0xb3c)
    com.sun.jna.platform.win32.WinNT.HRESULT setAllocationWeightExpression(String RHS);
            
    /**
     * <p>id(0xb27)</p>
     * <p>vtableId(197)</p>
     */
    @ComMethod(name = "AllocateChanges", dispId = 0xb27)
    com.sun.jna.platform.win32.WinNT.HRESULT AllocateChanges();
            
    /**
     * <p>id(0xb3d)</p>
     * <p>vtableId(198)</p>
     */
    @ComMethod(name = "CommitChanges", dispId = 0xb3d)
    com.sun.jna.platform.win32.WinNT.HRESULT CommitChanges();
            
    /**
     * <p>id(0xb28)</p>
     * <p>vtableId(199)</p>
     */
    @ComMethod(name = "DiscardChanges", dispId = 0xb28)
    com.sun.jna.platform.win32.WinNT.HRESULT DiscardChanges();
            
    /**
     * <p>id(0xb3e)</p>
     * <p>vtableId(200)</p>
     */
    @ComMethod(name = "RefreshDataSourceValues", dispId = 0xb3e)
    com.sun.jna.platform.win32.WinNT.HRESULT RefreshDataSourceValues();
            
    /**
     * <p>id(0xb3f)</p>
     * <p>vtableId(201)</p>
     * @param Repeat [in] {@code XlPivotFieldRepeatLabels}
     */
    @ComMethod(name = "RepeatAllLabels", dispId = 0xb3f)
    com.sun.jna.platform.win32.WinNT.HRESULT RepeatAllLabels(XlPivotFieldRepeatLabels Repeat);
            
    /**
     * <p>id(0xb40)</p>
     * <p>vtableId(202)</p>
     * @param RHS [out] {@code PivotTableChangeList}
     */
    @ComProperty(name = "ChangeList", dispId = 0xb40)
    com.sun.jna.platform.win32.WinNT.HRESULT getChangeList(VARIANT RHS);
            
    /**
     * <p>id(0xb41)</p>
     * <p>vtableId(203)</p>
     * @param RHS [out] {@code Slicers}
     */
    @ComProperty(name = "Slicers", dispId = 0xb41)
    com.sun.jna.platform.win32.WinNT.HRESULT getSlicers(VARIANT RHS);
            
    /**
     * <p>id(0x763)</p>
     * <p>vtableId(204)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    com.sun.jna.platform.win32.WinNT.HRESULT getAlternativeText(VARIANT RHS);
            
    /**
     * <p>id(0x763)</p>
     * <p>vtableId(205)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "AlternativeText", dispId = 0x763)
    com.sun.jna.platform.win32.WinNT.HRESULT setAlternativeText(String RHS);
            
    /**
     * <p>id(0x111)</p>
     * <p>vtableId(206)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    com.sun.jna.platform.win32.WinNT.HRESULT getSummary(VARIANT RHS);
            
    /**
     * <p>id(0x111)</p>
     * <p>vtableId(207)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    com.sun.jna.platform.win32.WinNT.HRESULT setSummary(String RHS);
            
    /**
     * <p>id(0xb42)</p>
     * <p>vtableId(208)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "VisualTotalsForSets", dispId = 0xb42)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisualTotalsForSets(VARIANT RHS);
            
    /**
     * <p>id(0xb42)</p>
     * <p>vtableId(209)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "VisualTotalsForSets", dispId = 0xb42)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisualTotalsForSets(Boolean RHS);
            
    /**
     * <p>id(0xb43)</p>
     * <p>vtableId(210)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowValuesRow", dispId = 0xb43)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowValuesRow(VARIANT RHS);
            
    /**
     * <p>id(0xb43)</p>
     * <p>vtableId(211)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowValuesRow", dispId = 0xb43)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowValuesRow(Boolean RHS);
            
    /**
     * <p>id(0xb44)</p>
     * <p>vtableId(212)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "CalculatedMembersInFilters", dispId = 0xb44)
    com.sun.jna.platform.win32.WinNT.HRESULT getCalculatedMembersInFilters(VARIANT RHS);
            
    /**
     * <p>id(0xb44)</p>
     * <p>vtableId(213)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "CalculatedMembersInFilters", dispId = 0xb44)
    com.sun.jna.platform.win32.WinNT.HRESULT setCalculatedMembersInFilters(Boolean RHS);
            
    /**
     * <p>id(0xbf8)</p>
     * <p>vtableId(214)</p>
     * @param rowline [in, optional] {@code Object}
     * @param columnline [in, optional] {@code Object}
     * @param RHS [out] {@code PivotValueCell}
     */
    @ComMethod(name = "PivotValueCell", dispId = 0xbf8)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotValueCell(Object rowline,
            Object columnline,
            VARIANT RHS);
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(215)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    com.sun.jna.platform.win32.WinNT.HRESULT getHidden(VARIANT RHS);
            
    /**
     * <p>id(0xbfb)</p>
     * <p>vtableId(216)</p>
     * @param RHS [out] {@code Shape}
     */
    @ComProperty(name = "PivotChart", dispId = 0xbfb)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotChart(VARIANT RHS);
            
    /**
     * <p>id(0xbfc)</p>
     * <p>vtableId(217)</p>
     * @param PivotItem [in] {@code PivotItem}
     * @param PivotLine [in, optional] {@code Object}
     */
    @ComMethod(name = "DrillDown", dispId = 0xbfc)
    com.sun.jna.platform.win32.WinNT.HRESULT DrillDown(PivotItem PivotItem,
            Object PivotLine);
            
    /**
     * <p>id(0xbfd)</p>
     * <p>vtableId(218)</p>
     * @param PivotItem [in] {@code PivotItem}
     * @param PivotLine [in, optional] {@code Object}
     * @param LevelUniqueName [in, optional] {@code Object}
     */
    @ComMethod(name = "DrillUp", dispId = 0xbfd)
    com.sun.jna.platform.win32.WinNT.HRESULT DrillUp(PivotItem PivotItem,
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
    com.sun.jna.platform.win32.WinNT.HRESULT DrillTo(PivotItem PivotItem,
            CubeField CubeField,
            Object PivotLine);
            
    /**
     * <p>id(0x6f7)</p>
     * <p>vtableId(220)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Dummy2", dispId = 0x6f7)
    com.sun.jna.platform.win32.WinNT.HRESULT Dummy2(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            VARIANT RHS);
            
    
}