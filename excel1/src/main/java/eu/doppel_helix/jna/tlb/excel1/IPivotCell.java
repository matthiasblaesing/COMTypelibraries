
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024458-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024458-0001-0000-C000-000000000046}")
public interface IPivotCell extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x88d)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code XlPivotCellType}
     */
    @ComProperty(name = "PivotCellType", dispId = 0x88d)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotCellType(VARIANT RHS);
            
    /**
     * <p>id(0x2cc)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code PivotTable}
     */
    @ComProperty(name = "PivotTable", dispId = 0x2cc)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotTable(VARIANT RHS);
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code PivotField}
     */
    @ComProperty(name = "DataField", dispId = 0x82b)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataField(VARIANT RHS);
            
    /**
     * <p>id(0x2db)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code PivotField}
     */
    @ComProperty(name = "PivotField", dispId = 0x2db)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotField(VARIANT RHS);
            
    /**
     * <p>id(0x2e4)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code PivotItem}
     */
    @ComProperty(name = "PivotItem", dispId = 0x2e4)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotItem(VARIANT RHS);
            
    /**
     * <p>id(0x88e)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code PivotItemList}
     */
    @ComProperty(name = "RowItems", dispId = 0x88e)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowItems(VARIANT RHS);
            
    /**
     * <p>id(0x88f)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code PivotItemList}
     */
    @ComProperty(name = "ColumnItems", dispId = 0x88f)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnItems(VARIANT RHS);
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(VARIANT RHS);
            
    /**
     * <p>id(0x8f7)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Dummy18", dispId = 0x8f7)
    com.sun.jna.platform.win32.WinNT.HRESULT getDummy18(VARIANT RHS);
            
    /**
     * <p>id(0x891)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code XlConsolidationFunction}
     */
    @ComProperty(name = "CustomSubtotalFunction", dispId = 0x891)
    com.sun.jna.platform.win32.WinNT.HRESULT getCustomSubtotalFunction(VARIANT RHS);
            
    /**
     * <p>id(0xa71)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code PivotLine}
     */
    @ComProperty(name = "PivotRowLine", dispId = 0xa71)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotRowLine(VARIANT RHS);
            
    /**
     * <p>id(0xa72)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code PivotLine}
     */
    @ComProperty(name = "PivotColumnLine", dispId = 0xa72)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotColumnLine(VARIANT RHS);
            
    /**
     * <p>id(0xb70)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "AllocateChange", dispId = 0xb70)
    com.sun.jna.platform.win32.WinNT.HRESULT AllocateChange();
            
    /**
     * <p>id(0xb71)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "DiscardChange", dispId = 0xb71)
    com.sun.jna.platform.win32.WinNT.HRESULT DiscardChange();
            
    /**
     * <p>id(0xb72)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "DataSourceValue", dispId = 0xb72)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataSourceValue(VARIANT RHS);
            
    /**
     * <p>id(0xb73)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code XlCellChangedState}
     */
    @ComProperty(name = "CellChanged", dispId = 0xb73)
    com.sun.jna.platform.win32.WinNT.HRESULT getCellChanged(VARIANT RHS);
            
    /**
     * <p>id(0x84b)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "MDX", dispId = 0x84b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMDX(VARIANT RHS);
            
    /**
     * <p>id(0x9bb)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code Actions}
     */
    @ComProperty(name = "ServerActions", dispId = 0x9bb)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerActions(VARIANT RHS);
            
    
}