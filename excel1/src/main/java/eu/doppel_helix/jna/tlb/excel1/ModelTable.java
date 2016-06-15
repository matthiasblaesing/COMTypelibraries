
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244D7-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244D7-0000-0000-C000-000000000046}")
public interface ModelTable extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x2d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    String getSourceName();
            
    /**
     * <p>id(0xc2f)</p>
     */
    @ComProperty(name = "ModelTableColumns", dispId = 0xc2f)
    ModelTableColumns getModelTableColumns();
            
    /**
     * <p>id(0xc30)</p>
     */
    @ComProperty(name = "SourceWorkbookConnection", dispId = 0xc30)
    WorkbookConnection getSourceWorkbookConnection();
            
    /**
     * <p>id(0x10007)</p>
     */
    @ComMethod(name = "_Dummy7", dispId = 0x10007)
    void _Dummy7();
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    void Refresh();
            
    /**
     * <p>id(0x5c6)</p>
     */
    @ComProperty(name = "RecordCount", dispId = 0x5c6)
    Integer getRecordCount();
            
    
}