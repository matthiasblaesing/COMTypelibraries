
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024458-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024458-0001-0000-C000-000000000046}")
public interface IPivotCell {
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
     * <p>id(0x88d)</p>
     */
    @ComProperty(name = "PivotCellType", dispId = 0x88d)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotCellType(VARIANT RHS);
            
    /**
     * <p>id(0x2cc)</p>
     */
    @ComProperty(name = "PivotTable", dispId = 0x2cc)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotTable(VARIANT RHS);
            
    /**
     * <p>id(0x82b)</p>
     */
    @ComProperty(name = "DataField", dispId = 0x82b)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataField(VARIANT RHS);
            
    /**
     * <p>id(0x2db)</p>
     */
    @ComProperty(name = "PivotField", dispId = 0x2db)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotField(VARIANT RHS);
            
    /**
     * <p>id(0x2e4)</p>
     */
    @ComProperty(name = "PivotItem", dispId = 0x2e4)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotItem(VARIANT RHS);
            
    /**
     * <p>id(0x88e)</p>
     */
    @ComProperty(name = "RowItems", dispId = 0x88e)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowItems(VARIANT RHS);
            
    /**
     * <p>id(0x88f)</p>
     */
    @ComProperty(name = "ColumnItems", dispId = 0x88f)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnItems(VARIANT RHS);
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(VARIANT RHS);
            
    /**
     * <p>id(0x8f7)</p>
     */
    @ComProperty(name = "Dummy18", dispId = 0x8f7)
    com.sun.jna.platform.win32.WinNT.HRESULT getDummy18(VARIANT RHS);
            
    /**
     * <p>id(0x891)</p>
     */
    @ComProperty(name = "CustomSubtotalFunction", dispId = 0x891)
    com.sun.jna.platform.win32.WinNT.HRESULT getCustomSubtotalFunction(VARIANT RHS);
            
    /**
     * <p>id(0xa71)</p>
     */
    @ComProperty(name = "PivotRowLine", dispId = 0xa71)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotRowLine(VARIANT RHS);
            
    /**
     * <p>id(0xa72)</p>
     */
    @ComProperty(name = "PivotColumnLine", dispId = 0xa72)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotColumnLine(VARIANT RHS);
            
    /**
     * <p>id(0xb70)</p>
     */
    @ComMethod(name = "AllocateChange", dispId = 0xb70)
    com.sun.jna.platform.win32.WinNT.HRESULT AllocateChange();
            
    /**
     * <p>id(0xb71)</p>
     */
    @ComMethod(name = "DiscardChange", dispId = 0xb71)
    com.sun.jna.platform.win32.WinNT.HRESULT DiscardChange();
            
    /**
     * <p>id(0xb72)</p>
     */
    @ComProperty(name = "DataSourceValue", dispId = 0xb72)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataSourceValue(VARIANT RHS);
            
    /**
     * <p>id(0xb73)</p>
     */
    @ComProperty(name = "CellChanged", dispId = 0xb73)
    com.sun.jna.platform.win32.WinNT.HRESULT getCellChanged(VARIANT RHS);
            
    /**
     * <p>id(0x84b)</p>
     */
    @ComProperty(name = "MDX", dispId = 0x84b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMDX(VARIANT RHS);
            
    /**
     * <p>id(0x9bb)</p>
     */
    @ComProperty(name = "ServerActions", dispId = 0x9bb)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerActions(VARIANT RHS);
            
    
}