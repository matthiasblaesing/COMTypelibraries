
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024458-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024458-0000-0000-C000-000000000046}")
public interface PivotCell extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x88d)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "PivotCellType", dispId = 0x88d)
    XlPivotCellType getPivotCellType();
            
    /**
     * <p>id(0x2cc)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "PivotTable", dispId = 0x2cc)
    PivotTable getPivotTable();
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DataField", dispId = 0x82b)
    PivotField getDataField();
            
    /**
     * <p>id(0x2db)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "PivotField", dispId = 0x2db)
    PivotField getPivotField();
            
    /**
     * <p>id(0x2e4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "PivotItem", dispId = 0x2e4)
    PivotItem getPivotItem();
            
    /**
     * <p>id(0x88e)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "RowItems", dispId = 0x88e)
    PivotItemList getRowItems();
            
    /**
     * <p>id(0x88f)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ColumnItems", dispId = 0x88f)
    PivotItemList getColumnItems();
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange();
            
    /**
     * <p>id(0x8f7)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Dummy18", dispId = 0x8f7)
    String getDummy18();
            
    /**
     * <p>id(0x891)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "CustomSubtotalFunction", dispId = 0x891)
    XlConsolidationFunction getCustomSubtotalFunction();
            
    /**
     * <p>id(0xa71)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "PivotRowLine", dispId = 0xa71)
    PivotLine getPivotRowLine();
            
    /**
     * <p>id(0xa72)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "PivotColumnLine", dispId = 0xa72)
    PivotLine getPivotColumnLine();
            
    /**
     * <p>id(0xb70)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "AllocateChange", dispId = 0xb70)
    void AllocateChange();
            
    /**
     * <p>id(0xb71)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "DiscardChange", dispId = 0xb71)
    void DiscardChange();
            
    /**
     * <p>id(0xb72)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "DataSourceValue", dispId = 0xb72)
    Object getDataSourceValue();
            
    /**
     * <p>id(0xb73)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "CellChanged", dispId = 0xb73)
    XlCellChangedState getCellChanged();
            
    /**
     * <p>id(0x84b)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "MDX", dispId = 0x84b)
    String getMDX();
            
    /**
     * <p>id(0x9bb)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "ServerActions", dispId = 0x9bb)
    Actions getServerActions();
            
    
}