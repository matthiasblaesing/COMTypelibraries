
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244E4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244E4-0000-0000-C000-000000000046}")
public interface ModelChanges extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xc49)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "TablesAdded", dispId = 0xc49)
    ModelTableNames getTablesAdded();
            
    /**
     * <p>id(0xc4a)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "TablesDeleted", dispId = 0xc4a)
    ModelTableNames getTablesDeleted();
            
    /**
     * <p>id(0xc4b)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "TablesModified", dispId = 0xc4b)
    ModelTableNames getTablesModified();
            
    /**
     * <p>id(0xc4c)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "TableNamesChanged", dispId = 0xc4c)
    ModelTableNameChanges getTableNamesChanged();
            
    /**
     * <p>id(0xc4d)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "RelationshipChange", dispId = 0xc4d)
    Boolean getRelationshipChange();
            
    /**
     * <p>id(0xc4e)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ColumnsAdded", dispId = 0xc4e)
    ModelColumnNames getColumnsAdded();
            
    /**
     * <p>id(0xc4f)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ColumnsDeleted", dispId = 0xc4f)
    ModelColumnNames getColumnsDeleted();
            
    /**
     * <p>id(0xc50)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ColumnsChanged", dispId = 0xc50)
    ModelColumnChanges getColumnsChanged();
            
    /**
     * <p>id(0xc51)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "MeasuresAdded", dispId = 0xc51)
    ModelMeasureNames getMeasuresAdded();
            
    /**
     * <p>id(0xc52)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "UnknownChange", dispId = 0xc52)
    Boolean getUnknownChange();
            
    /**
     * <p>id(0xde)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Source", dispId = 0xde)
    XlModelChangeSource getSource();
            
    
}