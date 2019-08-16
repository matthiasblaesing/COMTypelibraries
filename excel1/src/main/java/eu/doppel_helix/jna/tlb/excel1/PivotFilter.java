
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024483-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024483-0000-0000-C000-000000000046}")
public interface PivotFilter extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xc0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    Integer getOrder();
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    void setOrder(Integer param0);
            
    /**
     * <p>id(0xa7e)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "FilterType", dispId = 0xa7e)
    XlPivotFilterType getFilterType();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xda)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Description", dispId = 0xda)
    String getDescription();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x908)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Active", dispId = 0x908)
    Boolean getActive();
            
    /**
     * <p>id(0x2db)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "PivotField", dispId = 0x2db)
    PivotField getPivotField();
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "DataField", dispId = 0x82b)
    PivotField getDataField();
            
    /**
     * <p>id(0xa7f)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "DataCubeField", dispId = 0xa7f)
    CubeField getDataCubeField();
            
    /**
     * <p>id(0xa80)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Value1", dispId = 0xa80)
    Object getValue1();
            
    /**
     * <p>id(0x56c)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Value2", dispId = 0x56c)
    Object getValue2();
            
    /**
     * <p>id(0xa81)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "MemberPropertyField", dispId = 0xa81)
    PivotField getMemberPropertyField();
            
    /**
     * <p>id(0xa82)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "IsMemberPropertyFilter", dispId = 0xa82)
    Boolean getIsMemberPropertyFilter();
            
    /**
     * <p>id(0xc1b)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "WholeDayFilter", dispId = 0xc1b)
    Boolean getWholeDayFilter();
            
    /**
     * <p>id(0xc1b)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WholeDayFilter", dispId = 0xc1b)
    void setWholeDayFilter(Boolean param0);
            
    
}