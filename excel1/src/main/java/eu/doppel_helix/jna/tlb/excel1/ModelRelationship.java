
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244D9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244D9-0000-0000-C000-000000000046}")
public interface ModelRelationship extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xc32)</p>
     */
    @ComProperty(name = "ForeignKeyTable", dispId = 0xc32)
    ModelTable getForeignKeyTable();
            
    /**
     * <p>id(0xc33)</p>
     */
    @ComProperty(name = "ForeignKeyColumn", dispId = 0xc33)
    ModelTableColumn getForeignKeyColumn();
            
    /**
     * <p>id(0xc34)</p>
     */
    @ComProperty(name = "PrimaryKeyTable", dispId = 0xc34)
    ModelTable getPrimaryKeyTable();
            
    /**
     * <p>id(0xc35)</p>
     */
    @ComProperty(name = "PrimaryKeyColumn", dispId = 0xc35)
    ModelTableColumn getPrimaryKeyColumn();
            
    /**
     * <p>id(0x908)</p>
     */
    @ComProperty(name = "Active", dispId = 0x908)
    Boolean getActive();
            
    /**
     * <p>id(0x908)</p>
     */
    @ComProperty(name = "Active", dispId = 0x908)
    void setActive(Boolean param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    
}