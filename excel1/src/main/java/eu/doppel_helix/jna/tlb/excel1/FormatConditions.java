
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024424-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024424-0000-0000-C000-000000000046}")
public interface FormatConditions {
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
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.COM.util.IDispatch Item(Object Index);
            
    /**
     * <p>id(0xb5)</p>
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
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.COM.util.IDispatch get_Default(Object Index);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0xa38)</p>
     */
    @ComMethod(name = "AddColorScale", dispId = 0xa38)
    com.sun.jna.platform.win32.COM.util.IDispatch AddColorScale(Integer ColorScaleType);
            
    /**
     * <p>id(0xa3a)</p>
     */
    @ComMethod(name = "AddDatabar", dispId = 0xa3a)
    com.sun.jna.platform.win32.COM.util.IDispatch AddDatabar();
            
    /**
     * <p>id(0xa3b)</p>
     */
    @ComMethod(name = "AddIconSetCondition", dispId = 0xa3b)
    com.sun.jna.platform.win32.COM.util.IDispatch AddIconSetCondition();
            
    /**
     * <p>id(0xa3c)</p>
     */
    @ComMethod(name = "AddTop10", dispId = 0xa3c)
    com.sun.jna.platform.win32.COM.util.IDispatch AddTop10();
            
    /**
     * <p>id(0xa3d)</p>
     */
    @ComMethod(name = "AddAboveAverage", dispId = 0xa3d)
    com.sun.jna.platform.win32.COM.util.IDispatch AddAboveAverage();
            
    /**
     * <p>id(0xa3e)</p>
     */
    @ComMethod(name = "AddUniqueValues", dispId = 0xa3e)
    com.sun.jna.platform.win32.COM.util.IDispatch AddUniqueValues();
            
    
}