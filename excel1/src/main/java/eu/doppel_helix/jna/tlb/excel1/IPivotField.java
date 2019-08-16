
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020874-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020874-0001-0000-C000-000000000046}")
public interface IPivotField extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x13c)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code XlPivotFieldCalculation}
     */
    @ComProperty(name = "Calculation", dispId = 0x13c)
    com.sun.jna.platform.win32.WinNT.HRESULT getCalculation(VARIANT RHS);
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code XlPivotFieldCalculation}
     */
    @ComProperty(name = "Calculation", dispId = 0x13c)
    com.sun.jna.platform.win32.WinNT.HRESULT setCalculation(XlPivotFieldCalculation RHS);
            
    /**
     * <p>id(0x2e0)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code PivotField}
     */
    @ComProperty(name = "ChildField", dispId = 0x2e0)
    com.sun.jna.platform.win32.WinNT.HRESULT getChildField(VARIANT RHS);
            
    /**
     * <p>id(0x2da)</p>
     * <p>vtableId(13)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "ChildItems", dispId = 0x2da)
    com.sun.jna.platform.win32.WinNT.HRESULT getChildItems(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2e2)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "CurrentPage", dispId = 0x2e2)
    com.sun.jna.platform.win32.WinNT.HRESULT getCurrentPage(VARIANT RHS);
            
    /**
     * <p>id(0x2e2)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "CurrentPage", dispId = 0x2e2)
    com.sun.jna.platform.win32.WinNT.HRESULT setCurrentPage(Object RHS);
            
    /**
     * <p>id(0x2d0)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "DataRange", dispId = 0x2d0)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataRange(VARIANT RHS);
            
    /**
     * <p>id(0x2d2)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code XlPivotFieldDataType}
     */
    @ComProperty(name = "DataType", dispId = 0x2d2)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataType(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT set_Default(String RHS);
            
    /**
     * <p>id(0x383)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code XlConsolidationFunction}
     */
    @ComProperty(name = "Function", dispId = 0x383)
    com.sun.jna.platform.win32.WinNT.HRESULT getFunction(VARIANT RHS);
            
    /**
     * <p>id(0x383)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code XlConsolidationFunction}
     */
    @ComProperty(name = "Function", dispId = 0x383)
    com.sun.jna.platform.win32.WinNT.HRESULT setFunction(XlConsolidationFunction RHS);
            
    /**
     * <p>id(0x2d3)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "GroupLevel", dispId = 0x2d3)
    com.sun.jna.platform.win32.WinNT.HRESULT getGroupLevel(VARIANT RHS);
            
    /**
     * <p>id(0x2d8)</p>
     * <p>vtableId(23)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "HiddenItems", dispId = 0x2d8)
    com.sun.jna.platform.win32.WinNT.HRESULT getHiddenItems(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2cf)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "LabelRange", dispId = 0x2cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getLabelRange(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(26)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(28)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormat(String RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code XlPivotFieldOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(30)</p>
     * @param RHS [in] {@code XlPivotFieldOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(XlPivotFieldOrientation RHS);
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowAllItems", dispId = 0x1c4)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowAllItems(VARIANT RHS);
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(32)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAllItems", dispId = 0x1c4)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowAllItems(Boolean RHS);
            
    /**
     * <p>id(0x2dc)</p>
     * <p>vtableId(33)</p>
     * @param RHS [out] {@code PivotField}
     */
    @ComProperty(name = "ParentField", dispId = 0x2dc)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentField(VARIANT RHS);
            
    /**
     * <p>id(0x2d9)</p>
     * <p>vtableId(34)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "ParentItems", dispId = 0x2d9)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentItems(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2e1)</p>
     * <p>vtableId(35)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "PivotItems", dispId = 0x2e1)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotItems(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT getPosition(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(37)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT setPosition(Object RHS);
            
    /**
     * <p>id(0x2d1)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceName(VARIANT RHS);
            
    /**
     * <p>id(0x2dd)</p>
     * <p>vtableId(39)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Subtotals", dispId = 0x2dd)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubtotals(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2dd)</p>
     * <p>vtableId(40)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Subtotals", dispId = 0x2dd)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubtotals(Object Index,
            Object RHS);
            
    /**
     * <p>id(0x2de)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "BaseField", dispId = 0x2de)
    com.sun.jna.platform.win32.WinNT.HRESULT getBaseField(VARIANT RHS);
            
    /**
     * <p>id(0x2de)</p>
     * <p>vtableId(42)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "BaseField", dispId = 0x2de)
    com.sun.jna.platform.win32.WinNT.HRESULT setBaseField(Object RHS);
            
    /**
     * <p>id(0x2df)</p>
     * <p>vtableId(43)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "BaseItem", dispId = 0x2df)
    com.sun.jna.platform.win32.WinNT.HRESULT getBaseItem(VARIANT RHS);
            
    /**
     * <p>id(0x2df)</p>
     * <p>vtableId(44)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "BaseItem", dispId = 0x2df)
    com.sun.jna.platform.win32.WinNT.HRESULT setBaseItem(Object RHS);
            
    /**
     * <p>id(0x2d4)</p>
     * <p>vtableId(45)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "TotalLevels", dispId = 0x2d4)
    com.sun.jna.platform.win32.WinNT.HRESULT getTotalLevels(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(47)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(String RHS);
            
    /**
     * <p>id(0x2d7)</p>
     * <p>vtableId(48)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "VisibleItems", dispId = 0x2d7)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleItems(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x5e3)</p>
     * <p>vtableId(49)</p>
     * @param RHS [out] {@code CalculatedItems}
     */
    @ComMethod(name = "CalculatedItems", dispId = 0x5e3)
    com.sun.jna.platform.win32.WinNT.HRESULT CalculatedItems(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(50)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x5e4)</p>
     * <p>vtableId(51)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DragToColumn", dispId = 0x5e4)
    com.sun.jna.platform.win32.WinNT.HRESULT getDragToColumn(VARIANT RHS);
            
    /**
     * <p>id(0x5e4)</p>
     * <p>vtableId(52)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DragToColumn", dispId = 0x5e4)
    com.sun.jna.platform.win32.WinNT.HRESULT setDragToColumn(Boolean RHS);
            
    /**
     * <p>id(0x5e5)</p>
     * <p>vtableId(53)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DragToHide", dispId = 0x5e5)
    com.sun.jna.platform.win32.WinNT.HRESULT getDragToHide(VARIANT RHS);
            
    /**
     * <p>id(0x5e5)</p>
     * <p>vtableId(54)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DragToHide", dispId = 0x5e5)
    com.sun.jna.platform.win32.WinNT.HRESULT setDragToHide(Boolean RHS);
            
    /**
     * <p>id(0x5e6)</p>
     * <p>vtableId(55)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DragToPage", dispId = 0x5e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getDragToPage(VARIANT RHS);
            
    /**
     * <p>id(0x5e6)</p>
     * <p>vtableId(56)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DragToPage", dispId = 0x5e6)
    com.sun.jna.platform.win32.WinNT.HRESULT setDragToPage(Boolean RHS);
            
    /**
     * <p>id(0x5e7)</p>
     * <p>vtableId(57)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DragToRow", dispId = 0x5e7)
    com.sun.jna.platform.win32.WinNT.HRESULT getDragToRow(VARIANT RHS);
            
    /**
     * <p>id(0x5e7)</p>
     * <p>vtableId(58)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DragToRow", dispId = 0x5e7)
    com.sun.jna.platform.win32.WinNT.HRESULT setDragToRow(Boolean RHS);
            
    /**
     * <p>id(0x734)</p>
     * <p>vtableId(59)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DragToData", dispId = 0x734)
    com.sun.jna.platform.win32.WinNT.HRESULT getDragToData(VARIANT RHS);
            
    /**
     * <p>id(0x734)</p>
     * <p>vtableId(60)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DragToData", dispId = 0x734)
    com.sun.jna.platform.win32.WinNT.HRESULT setDragToData(Boolean RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(61)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(62)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormula(String RHS);
            
    /**
     * <p>id(0x5e8)</p>
     * <p>vtableId(63)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "IsCalculated", dispId = 0x5e8)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsCalculated(VARIANT RHS);
            
    /**
     * <p>id(0x174)</p>
     * <p>vtableId(64)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MemoryUsed", dispId = 0x174)
    com.sun.jna.platform.win32.WinNT.HRESULT getMemoryUsed(VARIANT RHS);
            
    /**
     * <p>id(0x5e9)</p>
     * <p>vtableId(65)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ServerBased", dispId = 0x5e9)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerBased(VARIANT RHS);
            
    /**
     * <p>id(0x5e9)</p>
     * <p>vtableId(66)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ServerBased", dispId = 0x5e9)
    com.sun.jna.platform.win32.WinNT.HRESULT setServerBased(Boolean RHS);
            
    /**
     * <p>id(0xa13)</p>
     * <p>vtableId(67)</p>
     * @param Order [in] {@code Integer}
     * @param Field [in] {@code String}
     */
    @ComMethod(name = "_AutoSort", dispId = 0xa13)
    com.sun.jna.platform.win32.WinNT.HRESULT _AutoSort(Integer Order,
            String Field);
            
    /**
     * <p>id(0x5eb)</p>
     * <p>vtableId(68)</p>
     * @param Type [in] {@code Integer}
     * @param Range [in] {@code Integer}
     * @param Count [in] {@code Integer}
     * @param Field [in] {@code String}
     */
    @ComMethod(name = "AutoShow", dispId = 0x5eb)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoShow(Integer Type,
            Integer Range,
            Integer Count,
            String Field);
            
    /**
     * <p>id(0x5ec)</p>
     * <p>vtableId(69)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "AutoSortOrder", dispId = 0x5ec)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoSortOrder(VARIANT RHS);
            
    /**
     * <p>id(0x5ed)</p>
     * <p>vtableId(70)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "AutoSortField", dispId = 0x5ed)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoSortField(VARIANT RHS);
            
    /**
     * <p>id(0x5ee)</p>
     * <p>vtableId(71)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "AutoShowType", dispId = 0x5ee)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoShowType(VARIANT RHS);
            
    /**
     * <p>id(0x5ef)</p>
     * <p>vtableId(72)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "AutoShowRange", dispId = 0x5ef)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoShowRange(VARIANT RHS);
            
    /**
     * <p>id(0x5f0)</p>
     * <p>vtableId(73)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "AutoShowCount", dispId = 0x5f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoShowCount(VARIANT RHS);
            
    /**
     * <p>id(0x5f1)</p>
     * <p>vtableId(74)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "AutoShowField", dispId = 0x5f1)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoShowField(VARIANT RHS);
            
    /**
     * <p>id(0x735)</p>
     * <p>vtableId(75)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "LayoutBlankLine", dispId = 0x735)
    com.sun.jna.platform.win32.WinNT.HRESULT getLayoutBlankLine(VARIANT RHS);
            
    /**
     * <p>id(0x735)</p>
     * <p>vtableId(76)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "LayoutBlankLine", dispId = 0x735)
    com.sun.jna.platform.win32.WinNT.HRESULT setLayoutBlankLine(Boolean RHS);
            
    /**
     * <p>id(0x736)</p>
     * <p>vtableId(77)</p>
     * @param RHS [out] {@code XlSubtototalLocationType}
     */
    @ComProperty(name = "LayoutSubtotalLocation", dispId = 0x736)
    com.sun.jna.platform.win32.WinNT.HRESULT getLayoutSubtotalLocation(VARIANT RHS);
            
    /**
     * <p>id(0x736)</p>
     * <p>vtableId(78)</p>
     * @param RHS [in] {@code XlSubtototalLocationType}
     */
    @ComProperty(name = "LayoutSubtotalLocation", dispId = 0x736)
    com.sun.jna.platform.win32.WinNT.HRESULT setLayoutSubtotalLocation(XlSubtototalLocationType RHS);
            
    /**
     * <p>id(0x737)</p>
     * <p>vtableId(79)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "LayoutPageBreak", dispId = 0x737)
    com.sun.jna.platform.win32.WinNT.HRESULT getLayoutPageBreak(VARIANT RHS);
            
    /**
     * <p>id(0x737)</p>
     * <p>vtableId(80)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "LayoutPageBreak", dispId = 0x737)
    com.sun.jna.platform.win32.WinNT.HRESULT setLayoutPageBreak(Boolean RHS);
            
    /**
     * <p>id(0x738)</p>
     * <p>vtableId(81)</p>
     * @param RHS [out] {@code XlLayoutFormType}
     */
    @ComProperty(name = "LayoutForm", dispId = 0x738)
    com.sun.jna.platform.win32.WinNT.HRESULT getLayoutForm(VARIANT RHS);
            
    /**
     * <p>id(0x738)</p>
     * <p>vtableId(82)</p>
     * @param RHS [in] {@code XlLayoutFormType}
     */
    @ComProperty(name = "LayoutForm", dispId = 0x738)
    com.sun.jna.platform.win32.WinNT.HRESULT setLayoutForm(XlLayoutFormType RHS);
            
    /**
     * <p>id(0x739)</p>
     * <p>vtableId(83)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SubtotalName", dispId = 0x739)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubtotalName(VARIANT RHS);
            
    /**
     * <p>id(0x739)</p>
     * <p>vtableId(84)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "SubtotalName", dispId = 0x739)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubtotalName(String RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(85)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(86)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x73a)</p>
     * <p>vtableId(87)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    com.sun.jna.platform.win32.WinNT.HRESULT getDrilledDown(VARIANT RHS);
            
    /**
     * <p>id(0x73a)</p>
     * <p>vtableId(88)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    com.sun.jna.platform.win32.WinNT.HRESULT setDrilledDown(Boolean RHS);
            
    /**
     * <p>id(0x73b)</p>
     * <p>vtableId(89)</p>
     * @param RHS [out] {@code CubeField}
     */
    @ComProperty(name = "CubeField", dispId = 0x73b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCubeField(VARIANT RHS);
            
    /**
     * <p>id(0x73c)</p>
     * <p>vtableId(90)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "CurrentPageName", dispId = 0x73c)
    com.sun.jna.platform.win32.WinNT.HRESULT getCurrentPageName(VARIANT RHS);
            
    /**
     * <p>id(0x73c)</p>
     * <p>vtableId(91)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "CurrentPageName", dispId = 0x73c)
    com.sun.jna.platform.win32.WinNT.HRESULT setCurrentPageName(String RHS);
            
    /**
     * <p>id(0x824)</p>
     * <p>vtableId(92)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    com.sun.jna.platform.win32.WinNT.HRESULT getStandardFormula(VARIANT RHS);
            
    /**
     * <p>id(0x824)</p>
     * <p>vtableId(93)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    com.sun.jna.platform.win32.WinNT.HRESULT setStandardFormula(String RHS);
            
    /**
     * <p>id(0x85b)</p>
     * <p>vtableId(94)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "HiddenItemsList", dispId = 0x85b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHiddenItemsList(VARIANT RHS);
            
    /**
     * <p>id(0x85b)</p>
     * <p>vtableId(95)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "HiddenItemsList", dispId = 0x85b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHiddenItemsList(Object RHS);
            
    /**
     * <p>id(0x85c)</p>
     * <p>vtableId(96)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DatabaseSort", dispId = 0x85c)
    com.sun.jna.platform.win32.WinNT.HRESULT getDatabaseSort(VARIANT RHS);
            
    /**
     * <p>id(0x85c)</p>
     * <p>vtableId(97)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DatabaseSort", dispId = 0x85c)
    com.sun.jna.platform.win32.WinNT.HRESULT setDatabaseSort(Boolean RHS);
            
    /**
     * <p>id(0x85d)</p>
     * <p>vtableId(98)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "IsMemberProperty", dispId = 0x85d)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsMemberProperty(VARIANT RHS);
            
    /**
     * <p>id(0x85e)</p>
     * <p>vtableId(99)</p>
     * @param RHS [out] {@code PivotField}
     */
    @ComProperty(name = "PropertyParentField", dispId = 0x85e)
    com.sun.jna.platform.win32.WinNT.HRESULT getPropertyParentField(VARIANT RHS);
            
    /**
     * <p>id(0x85f)</p>
     * <p>vtableId(100)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "PropertyOrder", dispId = 0x85f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPropertyOrder(VARIANT RHS);
            
    /**
     * <p>id(0x85f)</p>
     * <p>vtableId(101)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "PropertyOrder", dispId = 0x85f)
    com.sun.jna.platform.win32.WinNT.HRESULT setPropertyOrder(Integer RHS);
            
    /**
     * <p>id(0x860)</p>
     * <p>vtableId(102)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableItemSelection", dispId = 0x860)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableItemSelection(VARIANT RHS);
            
    /**
     * <p>id(0x860)</p>
     * <p>vtableId(103)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableItemSelection", dispId = 0x860)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableItemSelection(Boolean RHS);
            
    /**
     * <p>id(0x861)</p>
     * <p>vtableId(104)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "CurrentPageList", dispId = 0x861)
    com.sun.jna.platform.win32.WinNT.HRESULT getCurrentPageList(VARIANT RHS);
            
    /**
     * <p>id(0x861)</p>
     * <p>vtableId(105)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "CurrentPageList", dispId = 0x861)
    com.sun.jna.platform.win32.WinNT.HRESULT setCurrentPageList(Object RHS);
            
    /**
     * <p>id(0x862)</p>
     * <p>vtableId(106)</p>
     * @param Item [in] {@code String}
     * @param ClearList [in, optional] {@code Object}
     */
    @ComMethod(name = "AddPageItem", dispId = 0x862)
    com.sun.jna.platform.win32.WinNT.HRESULT AddPageItem(String Item,
            Object ClearList);
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(107)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    com.sun.jna.platform.win32.WinNT.HRESULT getHidden(VARIANT RHS);
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(108)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    com.sun.jna.platform.win32.WinNT.HRESULT setHidden(Boolean RHS);
            
    /**
     * <p>id(0xa14)</p>
     * <p>vtableId(109)</p>
     * @param Field [in] {@code String}
     */
    @ComMethod(name = "DrillTo", dispId = 0xa14)
    com.sun.jna.platform.win32.WinNT.HRESULT DrillTo(String Field);
            
    /**
     * <p>id(0xa15)</p>
     * <p>vtableId(110)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "UseMemberPropertyAsCaption", dispId = 0xa15)
    com.sun.jna.platform.win32.WinNT.HRESULT getUseMemberPropertyAsCaption(VARIANT RHS);
            
    /**
     * <p>id(0xa15)</p>
     * <p>vtableId(111)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "UseMemberPropertyAsCaption", dispId = 0xa15)
    com.sun.jna.platform.win32.WinNT.HRESULT setUseMemberPropertyAsCaption(Boolean RHS);
            
    /**
     * <p>id(0xa16)</p>
     * <p>vtableId(112)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "MemberPropertyCaption", dispId = 0xa16)
    com.sun.jna.platform.win32.WinNT.HRESULT getMemberPropertyCaption(VARIANT RHS);
            
    /**
     * <p>id(0xa16)</p>
     * <p>vtableId(113)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "MemberPropertyCaption", dispId = 0xa16)
    com.sun.jna.platform.win32.WinNT.HRESULT setMemberPropertyCaption(String RHS);
            
    /**
     * <p>id(0xa17)</p>
     * <p>vtableId(114)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayAsTooltip", dispId = 0xa17)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayAsTooltip(VARIANT RHS);
            
    /**
     * <p>id(0xa17)</p>
     * <p>vtableId(115)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayAsTooltip", dispId = 0xa17)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayAsTooltip(Boolean RHS);
            
    /**
     * <p>id(0xa18)</p>
     * <p>vtableId(116)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayInReport", dispId = 0xa18)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayInReport(VARIANT RHS);
            
    /**
     * <p>id(0xa18)</p>
     * <p>vtableId(117)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayInReport", dispId = 0xa18)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayInReport(Boolean RHS);
            
    /**
     * <p>id(0xa19)</p>
     * <p>vtableId(118)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayAsCaption", dispId = 0xa19)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayAsCaption(VARIANT RHS);
            
    /**
     * <p>id(0xa1a)</p>
     * <p>vtableId(119)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "LayoutCompactRow", dispId = 0xa1a)
    com.sun.jna.platform.win32.WinNT.HRESULT getLayoutCompactRow(VARIANT RHS);
            
    /**
     * <p>id(0xa1a)</p>
     * <p>vtableId(120)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "LayoutCompactRow", dispId = 0xa1a)
    com.sun.jna.platform.win32.WinNT.HRESULT setLayoutCompactRow(Boolean RHS);
            
    /**
     * <p>id(0xa1b)</p>
     * <p>vtableId(121)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "IncludeNewItemsInFilter", dispId = 0xa1b)
    com.sun.jna.platform.win32.WinNT.HRESULT getIncludeNewItemsInFilter(VARIANT RHS);
            
    /**
     * <p>id(0xa1b)</p>
     * <p>vtableId(122)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeNewItemsInFilter", dispId = 0xa1b)
    com.sun.jna.platform.win32.WinNT.HRESULT setIncludeNewItemsInFilter(Boolean RHS);
            
    /**
     * <p>id(0xa1c)</p>
     * <p>vtableId(123)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "VisibleItemsList", dispId = 0xa1c)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleItemsList(VARIANT RHS);
            
    /**
     * <p>id(0xa1c)</p>
     * <p>vtableId(124)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "VisibleItemsList", dispId = 0xa1c)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisibleItemsList(Object RHS);
            
    /**
     * <p>id(0xa1d)</p>
     * <p>vtableId(125)</p>
     * @param RHS [out] {@code PivotFilters}
     */
    @ComProperty(name = "PivotFilters", dispId = 0xa1d)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotFilters(VARIANT RHS);
            
    /**
     * <p>id(0xa1e)</p>
     * <p>vtableId(126)</p>
     * @param RHS [out] {@code PivotLine}
     */
    @ComProperty(name = "AutoSortPivotLine", dispId = 0xa1e)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoSortPivotLine(VARIANT RHS);
            
    /**
     * <p>id(0xa1f)</p>
     * <p>vtableId(127)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "AutoSortCustomSubtotal", dispId = 0xa1f)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoSortCustomSubtotal(VARIANT RHS);
            
    /**
     * <p>id(0xa20)</p>
     * <p>vtableId(128)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowingInAxis", dispId = 0xa20)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowingInAxis(VARIANT RHS);
            
    /**
     * <p>id(0x888)</p>
     * <p>vtableId(129)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableMultiplePageItems", dispId = 0x888)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableMultiplePageItems(VARIANT RHS);
            
    /**
     * <p>id(0x888)</p>
     * <p>vtableId(130)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableMultiplePageItems", dispId = 0x888)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableMultiplePageItems(Boolean RHS);
            
    /**
     * <p>id(0xa21)</p>
     * <p>vtableId(131)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllItemsVisible", dispId = 0xa21)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllItemsVisible(VARIANT RHS);
            
    /**
     * <p>id(0xa22)</p>
     * <p>vtableId(132)</p>
     */
    @ComMethod(name = "ClearManualFilter", dispId = 0xa22)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearManualFilter();
            
    /**
     * <p>id(0xa01)</p>
     * <p>vtableId(133)</p>
     */
    @ComMethod(name = "ClearAllFilters", dispId = 0xa01)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearAllFilters();
            
    /**
     * <p>id(0xa23)</p>
     * <p>vtableId(134)</p>
     */
    @ComMethod(name = "ClearValueFilters", dispId = 0xa23)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearValueFilters();
            
    /**
     * <p>id(0xa24)</p>
     * <p>vtableId(135)</p>
     */
    @ComMethod(name = "ClearLabelFilters", dispId = 0xa24)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearLabelFilters();
            
    /**
     * <p>id(0x5ea)</p>
     * <p>vtableId(136)</p>
     * @param Order [in] {@code Integer}
     * @param Field [in] {@code String}
     * @param PivotLine [in, optional] {@code Object}
     * @param CustomSubtotal [in, optional] {@code Object}
     */
    @ComMethod(name = "AutoSort", dispId = 0x5ea)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoSort(Integer Order,
            String Field,
            Object PivotLine,
            Object CustomSubtotal);
            
    /**
     * <p>id(0xa27)</p>
     * <p>vtableId(137)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceCaption", dispId = 0xa27)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceCaption(VARIANT RHS);
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(138)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowDetail(VARIANT RHS);
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(139)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowDetail(Boolean RHS);
            
    /**
     * <p>id(0xb45)</p>
     * <p>vtableId(140)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RepeatLabels", dispId = 0xb45)
    com.sun.jna.platform.win32.WinNT.HRESULT getRepeatLabels(VARIANT RHS);
            
    /**
     * <p>id(0xb45)</p>
     * <p>vtableId(141)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RepeatLabels", dispId = 0xb45)
    com.sun.jna.platform.win32.WinNT.HRESULT setRepeatLabels(Boolean RHS);
            
    
}