
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244DB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244DB-0000-0000-C000-000000000046}")
public interface Model {
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
     * <p>id(0xc22)</p>
     */
    @ComProperty(name = "ModelTables", dispId = 0xc22)
    ModelTables getModelTables();
            
    /**
     * <p>id(0xc36)</p>
     */
    @ComProperty(name = "ModelRelationships", dispId = 0xc36)
    ModelRelationships getModelRelationships();
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    void Refresh();
            
    /**
     * <p>id(0xc37)</p>
     */
    @ComMethod(name = "AddConnection", dispId = 0xc37)
    WorkbookConnection AddConnection(WorkbookConnection ConnectionToDataSource);
            
    /**
     * <p>id(0xc39)</p>
     */
    @ComMethod(name = "CreateModelWorkbookConnection", dispId = 0xc39)
    WorkbookConnection CreateModelWorkbookConnection(Object ModelTable);
            
    /**
     * <p>id(0xc3b)</p>
     */
    @ComProperty(name = "DataModelConnection", dispId = 0xc3b)
    WorkbookConnection getDataModelConnection();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xc3c)</p>
     */
    @ComMethod(name = "Initialize", dispId = 0xc3c)
    void Initialize();
            
    
}