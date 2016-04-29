
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244E5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244E5-0000-0000-C000-000000000046}")
public interface ModelColumnName {
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
     * <p>id(0x2b0)</p>
     */
    @ComProperty(name = "TableName", dispId = 0x2b0)
    String getTableName();
            
    /**
     * <p>id(0xc54)</p>
     */
    @ComProperty(name = "ColumnName", dispId = 0xc54)
    String getColumnName();
            
    
}