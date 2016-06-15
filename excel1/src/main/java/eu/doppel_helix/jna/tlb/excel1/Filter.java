
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024434-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024434-0000-0000-C000-000000000046}")
public interface Filter extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x652)</p>
     */
    @ComProperty(name = "On", dispId = 0x652)
    Boolean getOn();
            
    /**
     * <p>id(0x31c)</p>
     */
    @ComProperty(name = "Criteria1", dispId = 0x31c)
    Object getCriteria1();
            
    /**
     * <p>id(0xa51)</p>
     */
    @ComProperty(name = "_Operator", dispId = 0xa51)
    XlAutoFilterOperator get_Operator();
            
    /**
     * <p>id(0x31e)</p>
     */
    @ComProperty(name = "Criteria2", dispId = 0x31e)
    Object getCriteria2();
            
    /**
     * <p>id(0x31d)</p>
     */
    @ComProperty(name = "Operator", dispId = 0x31d)
    XlAutoFilterOperator getOperator();
            
    /**
     * <p>id(0x31d)</p>
     */
    @ComProperty(name = "Operator", dispId = 0x31d)
    void setOperator(XlAutoFilterOperator param0);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    
}