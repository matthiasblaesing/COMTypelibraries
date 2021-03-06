
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B6-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B6-0000-0000-C000-000000000046}")
public interface SparklineGroups extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xb5)</p>
     * <p>vtableId(10)</p>
     * @param Type [in] {@code XlSparkType}
     * @param SourceData [in] {@code String}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    SparklineGroup Add(XlSparkType Type,
            String SourceData);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    SparklineGroup getItem(Object Index);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    SparklineGroup get_Default(Object Index);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x6f)
    void Clear();
            
    /**
     * <p>id(0xb83)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "ClearGroups", dispId = 0xb83)
    void ClearGroups();
            
    /**
     * <p>id(0x2e)</p>
     * <p>vtableId(17)</p>
     * @param Location [in] {@code Range}
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    void Group(Range Location);
            
    /**
     * <p>id(0xf4)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0xf4)
    void Ungroup();
            
    
}