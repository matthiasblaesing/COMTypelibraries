
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
     * <p>id(0x88d)</p>
     */
    @ComProperty(name = "PivotCellType", dispId = 0x88d)
    XlPivotCellType getPivotCellType();
            
    /**
     * <p>id(0x2cc)</p>
     */
    @ComProperty(name = "PivotTable", dispId = 0x2cc)
    PivotTable getPivotTable();
            
    /**
     * <p>id(0x82b)</p>
     */
    @ComProperty(name = "DataField", dispId = 0x82b)
    PivotField getDataField();
            
    /**
     * <p>id(0x2db)</p>
     */
    @ComProperty(name = "PivotField", dispId = 0x2db)
    PivotField getPivotField();
            
    /**
     * <p>id(0x2e4)</p>
     */
    @ComProperty(name = "PivotItem", dispId = 0x2e4)
    PivotItem getPivotItem();
            
    /**
     * <p>id(0x88e)</p>
     */
    @ComProperty(name = "RowItems", dispId = 0x88e)
    PivotItemList getRowItems();
            
    /**
     * <p>id(0x88f)</p>
     */
    @ComProperty(name = "ColumnItems", dispId = 0x88f)
    PivotItemList getColumnItems();
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange();
            
    /**
     * <p>id(0x8f7)</p>
     */
    @ComProperty(name = "Dummy18", dispId = 0x8f7)
    String getDummy18();
            
    /**
     * <p>id(0x891)</p>
     */
    @ComProperty(name = "CustomSubtotalFunction", dispId = 0x891)
    XlConsolidationFunction getCustomSubtotalFunction();
            
    /**
     * <p>id(0xa71)</p>
     */
    @ComProperty(name = "PivotRowLine", dispId = 0xa71)
    PivotLine getPivotRowLine();
            
    /**
     * <p>id(0xa72)</p>
     */
    @ComProperty(name = "PivotColumnLine", dispId = 0xa72)
    PivotLine getPivotColumnLine();
            
    /**
     * <p>id(0xb70)</p>
     */
    @ComMethod(name = "AllocateChange", dispId = 0xb70)
    void AllocateChange();
            
    /**
     * <p>id(0xb71)</p>
     */
    @ComMethod(name = "DiscardChange", dispId = 0xb71)
    void DiscardChange();
            
    /**
     * <p>id(0xb72)</p>
     */
    @ComProperty(name = "DataSourceValue", dispId = 0xb72)
    Object getDataSourceValue();
            
    /**
     * <p>id(0xb73)</p>
     */
    @ComProperty(name = "CellChanged", dispId = 0xb73)
    XlCellChangedState getCellChanged();
            
    /**
     * <p>id(0x84b)</p>
     */
    @ComProperty(name = "MDX", dispId = 0x84b)
    String getMDX();
            
    /**
     * <p>id(0x9bb)</p>
     */
    @ComProperty(name = "ServerActions", dispId = 0x9bb)
    Actions getServerActions();
            
    
}