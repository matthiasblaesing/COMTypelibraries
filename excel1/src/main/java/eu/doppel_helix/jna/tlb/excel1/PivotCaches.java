
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002441D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002441D-0000-0000-C000-000000000046}")
public interface PivotCaches extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xaa)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    PivotCache Item(Object Index);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    PivotCache get_Default(Object Index);
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(14)</p>
     * @param SourceType [in] {@code XlPivotTableSourceType}
     * @param SourceData [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    PivotCache Add(XlPivotTableSourceType SourceType,
            Object SourceData);
            
    /**
     * <p>id(0x768)</p>
     * <p>vtableId(15)</p>
     * @param SourceType [in] {@code XlPivotTableSourceType}
     * @param SourceData [in, optional] {@code Object}
     * @param Version [in, optional] {@code Object}
     */
    @ComMethod(name = "Create", dispId = 0x768)
    PivotCache Create(XlPivotTableSourceType SourceType,
            Object SourceData,
            Object Version);
            
    
}