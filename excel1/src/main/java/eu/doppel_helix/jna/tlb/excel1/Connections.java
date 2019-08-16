
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024486-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024486-0000-0000-C000-000000000046}")
public interface Connections extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x76)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xa8c)</p>
     * <p>vtableId(11)</p>
     * @param Filename [in] {@code String}
     */
    @ComMethod(name = "_AddFromFile", dispId = 0xa8c)
    WorkbookConnection _AddFromFile(String Filename);
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(12)</p>
     * @param Name [in] {@code String}
     * @param Description [in] {@code String}
     * @param ConnectionString [in] {@code Object}
     * @param CommandText [in] {@code Object}
     * @param lCmdtype [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    WorkbookConnection Add(String Name,
            String Description,
            Object ConnectionString,
            Object CommandText,
            Object lCmdtype);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    WorkbookConnection Item(Object Index);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    WorkbookConnection get_Default(Object Index);
            
    /**
     * <p>id(0xbee)</p>
     * <p>vtableId(16)</p>
     * @param Name [in] {@code String}
     * @param Description [in] {@code String}
     * @param ConnectionString [in] {@code Object}
     * @param CommandText [in] {@code Object}
     * @param lCmdtype [in, optional] {@code Object}
     * @param CreateModelConnection [in, optional] {@code Object}
     * @param ImportRelationships [in, optional] {@code Object}
     */
    @ComMethod(name = "Add2", dispId = 0xbee)
    WorkbookConnection Add2(String Name,
            String Description,
            Object ConnectionString,
            Object CommandText,
            Object lCmdtype,
            Object CreateModelConnection,
            Object ImportRelationships);
            
    /**
     * <p>id(0xc23)</p>
     * <p>vtableId(17)</p>
     * @param Filename [in] {@code String}
     * @param CreateModelConnection [in, optional] {@code Object}
     * @param ImportRelationships [in, optional] {@code Object}
     */
    @ComMethod(name = "AddFromFile", dispId = 0xc23)
    WorkbookConnection AddFromFile(String Filename,
            Object CreateModelConnection,
            Object ImportRelationships);
            
    
}