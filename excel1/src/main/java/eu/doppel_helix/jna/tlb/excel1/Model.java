
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244DB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244DB-0000-0000-C000-000000000046}")
public interface Model extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xc22)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ModelTables", dispId = 0xc22)
    ModelTables getModelTables();
            
    /**
     * <p>id(0xc36)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ModelRelationships", dispId = 0xc36)
    ModelRelationships getModelRelationships();
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    void Refresh();
            
    /**
     * <p>id(0xc37)</p>
     * <p>vtableId(13)</p>
     * @param ConnectionToDataSource [in] {@code WorkbookConnection}
     */
    @ComMethod(name = "AddConnection", dispId = 0xc37)
    WorkbookConnection AddConnection(WorkbookConnection ConnectionToDataSource);
            
    /**
     * <p>id(0xc39)</p>
     * <p>vtableId(14)</p>
     * @param ModelTable [in] {@code Object}
     */
    @ComMethod(name = "CreateModelWorkbookConnection", dispId = 0xc39)
    WorkbookConnection CreateModelWorkbookConnection(Object ModelTable);
            
    /**
     * <p>id(0xc3b)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "DataModelConnection", dispId = 0xc3b)
    WorkbookConnection getDataModelConnection();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xc3c)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "Initialize", dispId = 0xc3c)
    void Initialize();
            
    
}