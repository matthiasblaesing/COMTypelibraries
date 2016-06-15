
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C0-0000-0000-C000-000000000046}")
public interface ValueChange extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xc0)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    Integer getOrder();
            
    /**
     * <p>id(0xb9b)</p>
     */
    @ComProperty(name = "VisibleInPivotTable", dispId = 0xb9b)
    Boolean getVisibleInPivotTable();
            
    /**
     * <p>id(0x7dd)</p>
     */
    @ComProperty(name = "PivotCell", dispId = 0x7dd)
    PivotCell getPivotCell();
            
    /**
     * <p>id(0xb9c)</p>
     */
    @ComProperty(name = "Tuple", dispId = 0xb9c)
    String getTuple();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    Double getValue();
            
    /**
     * <p>id(0xb3a)</p>
     */
    @ComProperty(name = "AllocationValue", dispId = 0xb3a)
    XlAllocationValue getAllocationValue();
            
    /**
     * <p>id(0xb3b)</p>
     */
    @ComProperty(name = "AllocationMethod", dispId = 0xb3b)
    XlAllocationMethod getAllocationMethod();
            
    /**
     * <p>id(0xb3c)</p>
     */
    @ComProperty(name = "AllocationWeightExpression", dispId = 0xb3c)
    String getAllocationWeightExpression();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    
}