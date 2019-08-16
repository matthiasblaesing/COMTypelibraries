
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024424-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024424-0000-0000-C000-000000000046}")
public interface FormatConditions extends IUnknown, IRawDispatchHandle, IDispatch {
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
    com.sun.jna.platform.win32.COM.util.IDispatch Item(Object Index);
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(12)</p>
     * @param Type [in] {@code XlFormatConditionType}
     * @param Operator [in, optional] {@code Object}
     * @param Formula1 [in, optional] {@code Object}
     * @param Formula2 [in, optional] {@code Object}
     * @param String [in, optional] {@code Object}
     * @param TextOperator [in, optional] {@code Object}
     * @param DateOperator [in, optional] {@code Object}
     * @param ScopeType [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    com.sun.jna.platform.win32.COM.util.IDispatch Add(XlFormatConditionType Type,
            Object Operator,
            Object Formula1,
            Object Formula2,
            Object String,
            Object TextOperator,
            Object DateOperator,
            Object ScopeType);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.COM.util.IDispatch get_Default(Object Index);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0xa38)</p>
     * <p>vtableId(16)</p>
     * @param ColorScaleType [in] {@code Integer}
     */
    @ComMethod(name = "AddColorScale", dispId = 0xa38)
    com.sun.jna.platform.win32.COM.util.IDispatch AddColorScale(Integer ColorScaleType);
            
    /**
     * <p>id(0xa3a)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "AddDatabar", dispId = 0xa3a)
    com.sun.jna.platform.win32.COM.util.IDispatch AddDatabar();
            
    /**
     * <p>id(0xa3b)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "AddIconSetCondition", dispId = 0xa3b)
    com.sun.jna.platform.win32.COM.util.IDispatch AddIconSetCondition();
            
    /**
     * <p>id(0xa3c)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "AddTop10", dispId = 0xa3c)
    com.sun.jna.platform.win32.COM.util.IDispatch AddTop10();
            
    /**
     * <p>id(0xa3d)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "AddAboveAverage", dispId = 0xa3d)
    com.sun.jna.platform.win32.COM.util.IDispatch AddAboveAverage();
            
    /**
     * <p>id(0xa3e)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "AddUniqueValues", dispId = 0xa3e)
    com.sun.jna.platform.win32.COM.util.IDispatch AddUniqueValues();
            
    
}