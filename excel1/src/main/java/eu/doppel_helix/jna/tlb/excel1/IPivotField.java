
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
     * <p>id(0x13c)</p>
     */
    @ComProperty(name = "Calculation", dispId = 0x13c)
    com.sun.jna.platform.win32.WinNT.HRESULT getCalculation(VARIANT RHS);
            
    /**
     * <p>id(0x13c)</p>
     */
    @ComProperty(name = "Calculation", dispId = 0x13c)
    com.sun.jna.platform.win32.WinNT.HRESULT setCalculation(XlPivotFieldCalculation RHS);
            
    /**
     * <p>id(0x2e0)</p>
     */
    @ComProperty(name = "ChildField", dispId = 0x2e0)
    com.sun.jna.platform.win32.WinNT.HRESULT getChildField(VARIANT RHS);
            
    /**
     * <p>id(0x2da)</p>
     */
    @ComProperty(name = "ChildItems", dispId = 0x2da)
    com.sun.jna.platform.win32.WinNT.HRESULT getChildItems(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2e2)</p>
     */
    @ComProperty(name = "CurrentPage", dispId = 0x2e2)
    com.sun.jna.platform.win32.WinNT.HRESULT getCurrentPage(VARIANT RHS);
            
    /**
     * <p>id(0x2e2)</p>
     */
    @ComProperty(name = "CurrentPage", dispId = 0x2e2)
    com.sun.jna.platform.win32.WinNT.HRESULT setCurrentPage(Object RHS);
            
    /**
     * <p>id(0x2d0)</p>
     */
    @ComProperty(name = "DataRange", dispId = 0x2d0)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataRange(VARIANT RHS);
            
    /**
     * <p>id(0x2d2)</p>
     */
    @ComProperty(name = "DataType", dispId = 0x2d2)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataType(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT set_Default(String RHS);
            
    /**
     * <p>id(0x383)</p>
     */
    @ComProperty(name = "Function", dispId = 0x383)
    com.sun.jna.platform.win32.WinNT.HRESULT getFunction(VARIANT RHS);
            
    /**
     * <p>id(0x383)</p>
     */
    @ComProperty(name = "Function", dispId = 0x383)
    com.sun.jna.platform.win32.WinNT.HRESULT setFunction(XlConsolidationFunction RHS);
            
    /**
     * <p>id(0x2d3)</p>
     */
    @ComProperty(name = "GroupLevel", dispId = 0x2d3)
    com.sun.jna.platform.win32.WinNT.HRESULT getGroupLevel(VARIANT RHS);
            
    /**
     * <p>id(0x2d8)</p>
     */
    @ComProperty(name = "HiddenItems", dispId = 0x2d8)
    com.sun.jna.platform.win32.WinNT.HRESULT getHiddenItems(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2cf)</p>
     */
    @ComProperty(name = "LabelRange", dispId = 0x2cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getLabelRange(VARIANT RHS);
            
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
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormat(String RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(XlPivotFieldOrientation RHS);
            
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
     * <p>id(0x2dc)</p>
     */
    @ComProperty(name = "ParentField", dispId = 0x2dc)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentField(VARIANT RHS);
            
    /**
     * <p>id(0x2d9)</p>
     */
    @ComProperty(name = "ParentItems", dispId = 0x2d9)
    com.sun.jna.platform.win32.WinNT.HRESULT getParentItems(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2e1)</p>
     */
    @ComMethod(name = "PivotItems", dispId = 0x2e1)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotItems(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT getPosition(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT setPosition(Object RHS);
            
    /**
     * <p>id(0x2d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceName(VARIANT RHS);
            
    /**
     * <p>id(0x2dd)</p>
     */
    @ComProperty(name = "Subtotals", dispId = 0x2dd)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubtotals(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2dd)</p>
     */
    @ComProperty(name = "Subtotals", dispId = 0x2dd)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubtotals(Object Index,
            Object RHS);
            
    /**
     * <p>id(0x2de)</p>
     */
    @ComProperty(name = "BaseField", dispId = 0x2de)
    com.sun.jna.platform.win32.WinNT.HRESULT getBaseField(VARIANT RHS);
            
    /**
     * <p>id(0x2de)</p>
     */
    @ComProperty(name = "BaseField", dispId = 0x2de)
    com.sun.jna.platform.win32.WinNT.HRESULT setBaseField(Object RHS);
            
    /**
     * <p>id(0x2df)</p>
     */
    @ComProperty(name = "BaseItem", dispId = 0x2df)
    com.sun.jna.platform.win32.WinNT.HRESULT getBaseItem(VARIANT RHS);
            
    /**
     * <p>id(0x2df)</p>
     */
    @ComProperty(name = "BaseItem", dispId = 0x2df)
    com.sun.jna.platform.win32.WinNT.HRESULT setBaseItem(Object RHS);
            
    /**
     * <p>id(0x2d4)</p>
     */
    @ComProperty(name = "TotalLevels", dispId = 0x2d4)
    com.sun.jna.platform.win32.WinNT.HRESULT getTotalLevels(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(String RHS);
            
    /**
     * <p>id(0x2d7)</p>
     */
    @ComProperty(name = "VisibleItems", dispId = 0x2d7)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleItems(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x5e3)</p>
     */
    @ComMethod(name = "CalculatedItems", dispId = 0x5e3)
    com.sun.jna.platform.win32.WinNT.HRESULT CalculatedItems(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x5e4)</p>
     */
    @ComProperty(name = "DragToColumn", dispId = 0x5e4)
    com.sun.jna.platform.win32.WinNT.HRESULT getDragToColumn(VARIANT RHS);
            
    /**
     * <p>id(0x5e4)</p>
     */
    @ComProperty(name = "DragToColumn", dispId = 0x5e4)
    com.sun.jna.platform.win32.WinNT.HRESULT setDragToColumn(Boolean RHS);
            
    /**
     * <p>id(0x5e5)</p>
     */
    @ComProperty(name = "DragToHide", dispId = 0x5e5)
    com.sun.jna.platform.win32.WinNT.HRESULT getDragToHide(VARIANT RHS);
            
    /**
     * <p>id(0x5e5)</p>
     */
    @ComProperty(name = "DragToHide", dispId = 0x5e5)
    com.sun.jna.platform.win32.WinNT.HRESULT setDragToHide(Boolean RHS);
            
    /**
     * <p>id(0x5e6)</p>
     */
    @ComProperty(name = "DragToPage", dispId = 0x5e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getDragToPage(VARIANT RHS);
            
    /**
     * <p>id(0x5e6)</p>
     */
    @ComProperty(name = "DragToPage", dispId = 0x5e6)
    com.sun.jna.platform.win32.WinNT.HRESULT setDragToPage(Boolean RHS);
            
    /**
     * <p>id(0x5e7)</p>
     */
    @ComProperty(name = "DragToRow", dispId = 0x5e7)
    com.sun.jna.platform.win32.WinNT.HRESULT getDragToRow(VARIANT RHS);
            
    /**
     * <p>id(0x5e7)</p>
     */
    @ComProperty(name = "DragToRow", dispId = 0x5e7)
    com.sun.jna.platform.win32.WinNT.HRESULT setDragToRow(Boolean RHS);
            
    /**
     * <p>id(0x734)</p>
     */
    @ComProperty(name = "DragToData", dispId = 0x734)
    com.sun.jna.platform.win32.WinNT.HRESULT getDragToData(VARIANT RHS);
            
    /**
     * <p>id(0x734)</p>
     */
    @ComProperty(name = "DragToData", dispId = 0x734)
    com.sun.jna.platform.win32.WinNT.HRESULT setDragToData(Boolean RHS);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormula(String RHS);
            
    /**
     * <p>id(0x5e8)</p>
     */
    @ComProperty(name = "IsCalculated", dispId = 0x5e8)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsCalculated(VARIANT RHS);
            
    /**
     * <p>id(0x174)</p>
     */
    @ComProperty(name = "MemoryUsed", dispId = 0x174)
    com.sun.jna.platform.win32.WinNT.HRESULT getMemoryUsed(VARIANT RHS);
            
    /**
     * <p>id(0x5e9)</p>
     */
    @ComProperty(name = "ServerBased", dispId = 0x5e9)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerBased(VARIANT RHS);
            
    /**
     * <p>id(0x5e9)</p>
     */
    @ComProperty(name = "ServerBased", dispId = 0x5e9)
    com.sun.jna.platform.win32.WinNT.HRESULT setServerBased(Boolean RHS);
            
    /**
     * <p>id(0xa13)</p>
     */
    @ComMethod(name = "_AutoSort", dispId = 0xa13)
    com.sun.jna.platform.win32.WinNT.HRESULT _AutoSort(Integer Order,
            String Field);
            
    /**
     * <p>id(0x5eb)</p>
     */
    @ComMethod(name = "AutoShow", dispId = 0x5eb)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoShow(Integer Type,
            Integer Range,
            Integer Count,
            String Field);
            
    /**
     * <p>id(0x5ec)</p>
     */
    @ComProperty(name = "AutoSortOrder", dispId = 0x5ec)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoSortOrder(VARIANT RHS);
            
    /**
     * <p>id(0x5ed)</p>
     */
    @ComProperty(name = "AutoSortField", dispId = 0x5ed)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoSortField(VARIANT RHS);
            
    /**
     * <p>id(0x5ee)</p>
     */
    @ComProperty(name = "AutoShowType", dispId = 0x5ee)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoShowType(VARIANT RHS);
            
    /**
     * <p>id(0x5ef)</p>
     */
    @ComProperty(name = "AutoShowRange", dispId = 0x5ef)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoShowRange(VARIANT RHS);
            
    /**
     * <p>id(0x5f0)</p>
     */
    @ComProperty(name = "AutoShowCount", dispId = 0x5f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoShowCount(VARIANT RHS);
            
    /**
     * <p>id(0x5f1)</p>
     */
    @ComProperty(name = "AutoShowField", dispId = 0x5f1)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoShowField(VARIANT RHS);
            
    /**
     * <p>id(0x735)</p>
     */
    @ComProperty(name = "LayoutBlankLine", dispId = 0x735)
    com.sun.jna.platform.win32.WinNT.HRESULT getLayoutBlankLine(VARIANT RHS);
            
    /**
     * <p>id(0x735)</p>
     */
    @ComProperty(name = "LayoutBlankLine", dispId = 0x735)
    com.sun.jna.platform.win32.WinNT.HRESULT setLayoutBlankLine(Boolean RHS);
            
    /**
     * <p>id(0x736)</p>
     */
    @ComProperty(name = "LayoutSubtotalLocation", dispId = 0x736)
    com.sun.jna.platform.win32.WinNT.HRESULT getLayoutSubtotalLocation(VARIANT RHS);
            
    /**
     * <p>id(0x736)</p>
     */
    @ComProperty(name = "LayoutSubtotalLocation", dispId = 0x736)
    com.sun.jna.platform.win32.WinNT.HRESULT setLayoutSubtotalLocation(XlSubtototalLocationType RHS);
            
    /**
     * <p>id(0x737)</p>
     */
    @ComProperty(name = "LayoutPageBreak", dispId = 0x737)
    com.sun.jna.platform.win32.WinNT.HRESULT getLayoutPageBreak(VARIANT RHS);
            
    /**
     * <p>id(0x737)</p>
     */
    @ComProperty(name = "LayoutPageBreak", dispId = 0x737)
    com.sun.jna.platform.win32.WinNT.HRESULT setLayoutPageBreak(Boolean RHS);
            
    /**
     * <p>id(0x738)</p>
     */
    @ComProperty(name = "LayoutForm", dispId = 0x738)
    com.sun.jna.platform.win32.WinNT.HRESULT getLayoutForm(VARIANT RHS);
            
    /**
     * <p>id(0x738)</p>
     */
    @ComProperty(name = "LayoutForm", dispId = 0x738)
    com.sun.jna.platform.win32.WinNT.HRESULT setLayoutForm(XlLayoutFormType RHS);
            
    /**
     * <p>id(0x739)</p>
     */
    @ComProperty(name = "SubtotalName", dispId = 0x739)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubtotalName(VARIANT RHS);
            
    /**
     * <p>id(0x739)</p>
     */
    @ComProperty(name = "SubtotalName", dispId = 0x739)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubtotalName(String RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x73a)</p>
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    com.sun.jna.platform.win32.WinNT.HRESULT getDrilledDown(VARIANT RHS);
            
    /**
     * <p>id(0x73a)</p>
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    com.sun.jna.platform.win32.WinNT.HRESULT setDrilledDown(Boolean RHS);
            
    /**
     * <p>id(0x73b)</p>
     */
    @ComProperty(name = "CubeField", dispId = 0x73b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCubeField(VARIANT RHS);
            
    /**
     * <p>id(0x73c)</p>
     */
    @ComProperty(name = "CurrentPageName", dispId = 0x73c)
    com.sun.jna.platform.win32.WinNT.HRESULT getCurrentPageName(VARIANT RHS);
            
    /**
     * <p>id(0x73c)</p>
     */
    @ComProperty(name = "CurrentPageName", dispId = 0x73c)
    com.sun.jna.platform.win32.WinNT.HRESULT setCurrentPageName(String RHS);
            
    /**
     * <p>id(0x824)</p>
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    com.sun.jna.platform.win32.WinNT.HRESULT getStandardFormula(VARIANT RHS);
            
    /**
     * <p>id(0x824)</p>
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    com.sun.jna.platform.win32.WinNT.HRESULT setStandardFormula(String RHS);
            
    /**
     * <p>id(0x85b)</p>
     */
    @ComProperty(name = "HiddenItemsList", dispId = 0x85b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHiddenItemsList(VARIANT RHS);
            
    /**
     * <p>id(0x85b)</p>
     */
    @ComProperty(name = "HiddenItemsList", dispId = 0x85b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHiddenItemsList(Object RHS);
            
    /**
     * <p>id(0x85c)</p>
     */
    @ComProperty(name = "DatabaseSort", dispId = 0x85c)
    com.sun.jna.platform.win32.WinNT.HRESULT getDatabaseSort(VARIANT RHS);
            
    /**
     * <p>id(0x85c)</p>
     */
    @ComProperty(name = "DatabaseSort", dispId = 0x85c)
    com.sun.jna.platform.win32.WinNT.HRESULT setDatabaseSort(Boolean RHS);
            
    /**
     * <p>id(0x85d)</p>
     */
    @ComProperty(name = "IsMemberProperty", dispId = 0x85d)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsMemberProperty(VARIANT RHS);
            
    /**
     * <p>id(0x85e)</p>
     */
    @ComProperty(name = "PropertyParentField", dispId = 0x85e)
    com.sun.jna.platform.win32.WinNT.HRESULT getPropertyParentField(VARIANT RHS);
            
    /**
     * <p>id(0x85f)</p>
     */
    @ComProperty(name = "PropertyOrder", dispId = 0x85f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPropertyOrder(VARIANT RHS);
            
    /**
     * <p>id(0x85f)</p>
     */
    @ComProperty(name = "PropertyOrder", dispId = 0x85f)
    com.sun.jna.platform.win32.WinNT.HRESULT setPropertyOrder(Integer RHS);
            
    /**
     * <p>id(0x860)</p>
     */
    @ComProperty(name = "EnableItemSelection", dispId = 0x860)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableItemSelection(VARIANT RHS);
            
    /**
     * <p>id(0x860)</p>
     */
    @ComProperty(name = "EnableItemSelection", dispId = 0x860)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableItemSelection(Boolean RHS);
            
    /**
     * <p>id(0x861)</p>
     */
    @ComProperty(name = "CurrentPageList", dispId = 0x861)
    com.sun.jna.platform.win32.WinNT.HRESULT getCurrentPageList(VARIANT RHS);
            
    /**
     * <p>id(0x861)</p>
     */
    @ComProperty(name = "CurrentPageList", dispId = 0x861)
    com.sun.jna.platform.win32.WinNT.HRESULT setCurrentPageList(Object RHS);
            
    /**
     * <p>id(0x862)</p>
     */
    @ComMethod(name = "AddPageItem", dispId = 0x862)
    com.sun.jna.platform.win32.WinNT.HRESULT AddPageItem(String Item,
            Object ClearList);
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    com.sun.jna.platform.win32.WinNT.HRESULT getHidden(VARIANT RHS);
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    com.sun.jna.platform.win32.WinNT.HRESULT setHidden(Boolean RHS);
            
    /**
     * <p>id(0xa14)</p>
     */
    @ComMethod(name = "DrillTo", dispId = 0xa14)
    com.sun.jna.platform.win32.WinNT.HRESULT DrillTo(String Field);
            
    /**
     * <p>id(0xa15)</p>
     */
    @ComProperty(name = "UseMemberPropertyAsCaption", dispId = 0xa15)
    com.sun.jna.platform.win32.WinNT.HRESULT getUseMemberPropertyAsCaption(VARIANT RHS);
            
    /**
     * <p>id(0xa15)</p>
     */
    @ComProperty(name = "UseMemberPropertyAsCaption", dispId = 0xa15)
    com.sun.jna.platform.win32.WinNT.HRESULT setUseMemberPropertyAsCaption(Boolean RHS);
            
    /**
     * <p>id(0xa16)</p>
     */
    @ComProperty(name = "MemberPropertyCaption", dispId = 0xa16)
    com.sun.jna.platform.win32.WinNT.HRESULT getMemberPropertyCaption(VARIANT RHS);
            
    /**
     * <p>id(0xa16)</p>
     */
    @ComProperty(name = "MemberPropertyCaption", dispId = 0xa16)
    com.sun.jna.platform.win32.WinNT.HRESULT setMemberPropertyCaption(String RHS);
            
    /**
     * <p>id(0xa17)</p>
     */
    @ComProperty(name = "DisplayAsTooltip", dispId = 0xa17)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayAsTooltip(VARIANT RHS);
            
    /**
     * <p>id(0xa17)</p>
     */
    @ComProperty(name = "DisplayAsTooltip", dispId = 0xa17)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayAsTooltip(Boolean RHS);
            
    /**
     * <p>id(0xa18)</p>
     */
    @ComProperty(name = "DisplayInReport", dispId = 0xa18)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayInReport(VARIANT RHS);
            
    /**
     * <p>id(0xa18)</p>
     */
    @ComProperty(name = "DisplayInReport", dispId = 0xa18)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayInReport(Boolean RHS);
            
    /**
     * <p>id(0xa19)</p>
     */
    @ComProperty(name = "DisplayAsCaption", dispId = 0xa19)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayAsCaption(VARIANT RHS);
            
    /**
     * <p>id(0xa1a)</p>
     */
    @ComProperty(name = "LayoutCompactRow", dispId = 0xa1a)
    com.sun.jna.platform.win32.WinNT.HRESULT getLayoutCompactRow(VARIANT RHS);
            
    /**
     * <p>id(0xa1a)</p>
     */
    @ComProperty(name = "LayoutCompactRow", dispId = 0xa1a)
    com.sun.jna.platform.win32.WinNT.HRESULT setLayoutCompactRow(Boolean RHS);
            
    /**
     * <p>id(0xa1b)</p>
     */
    @ComProperty(name = "IncludeNewItemsInFilter", dispId = 0xa1b)
    com.sun.jna.platform.win32.WinNT.HRESULT getIncludeNewItemsInFilter(VARIANT RHS);
            
    /**
     * <p>id(0xa1b)</p>
     */
    @ComProperty(name = "IncludeNewItemsInFilter", dispId = 0xa1b)
    com.sun.jna.platform.win32.WinNT.HRESULT setIncludeNewItemsInFilter(Boolean RHS);
            
    /**
     * <p>id(0xa1c)</p>
     */
    @ComProperty(name = "VisibleItemsList", dispId = 0xa1c)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisibleItemsList(VARIANT RHS);
            
    /**
     * <p>id(0xa1c)</p>
     */
    @ComProperty(name = "VisibleItemsList", dispId = 0xa1c)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisibleItemsList(Object RHS);
            
    /**
     * <p>id(0xa1d)</p>
     */
    @ComProperty(name = "PivotFilters", dispId = 0xa1d)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotFilters(VARIANT RHS);
            
    /**
     * <p>id(0xa1e)</p>
     */
    @ComProperty(name = "AutoSortPivotLine", dispId = 0xa1e)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoSortPivotLine(VARIANT RHS);
            
    /**
     * <p>id(0xa1f)</p>
     */
    @ComProperty(name = "AutoSortCustomSubtotal", dispId = 0xa1f)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoSortCustomSubtotal(VARIANT RHS);
            
    /**
     * <p>id(0xa20)</p>
     */
    @ComProperty(name = "ShowingInAxis", dispId = 0xa20)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowingInAxis(VARIANT RHS);
            
    /**
     * <p>id(0x888)</p>
     */
    @ComProperty(name = "EnableMultiplePageItems", dispId = 0x888)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableMultiplePageItems(VARIANT RHS);
            
    /**
     * <p>id(0x888)</p>
     */
    @ComProperty(name = "EnableMultiplePageItems", dispId = 0x888)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableMultiplePageItems(Boolean RHS);
            
    /**
     * <p>id(0xa21)</p>
     */
    @ComProperty(name = "AllItemsVisible", dispId = 0xa21)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllItemsVisible(VARIANT RHS);
            
    /**
     * <p>id(0xa22)</p>
     */
    @ComMethod(name = "ClearManualFilter", dispId = 0xa22)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearManualFilter();
            
    /**
     * <p>id(0xa01)</p>
     */
    @ComMethod(name = "ClearAllFilters", dispId = 0xa01)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearAllFilters();
            
    /**
     * <p>id(0xa23)</p>
     */
    @ComMethod(name = "ClearValueFilters", dispId = 0xa23)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearValueFilters();
            
    /**
     * <p>id(0xa24)</p>
     */
    @ComMethod(name = "ClearLabelFilters", dispId = 0xa24)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearLabelFilters();
            
    /**
     * <p>id(0x5ea)</p>
     */
    @ComMethod(name = "AutoSort", dispId = 0x5ea)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoSort(Integer Order,
            String Field,
            Object PivotLine,
            Object CustomSubtotal);
            
    /**
     * <p>id(0xa27)</p>
     */
    @ComProperty(name = "SourceCaption", dispId = 0xa27)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceCaption(VARIANT RHS);
            
    /**
     * <p>id(0x249)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowDetail(VARIANT RHS);
            
    /**
     * <p>id(0x249)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowDetail(Boolean RHS);
            
    /**
     * <p>id(0xb45)</p>
     */
    @ComProperty(name = "RepeatLabels", dispId = 0xb45)
    com.sun.jna.platform.win32.WinNT.HRESULT getRepeatLabels(VARIANT RHS);
            
    /**
     * <p>id(0xb45)</p>
     */
    @ComProperty(name = "RepeatLabels", dispId = 0xb45)
    com.sun.jna.platform.win32.WinNT.HRESULT setRepeatLabels(Boolean RHS);
            
    
}