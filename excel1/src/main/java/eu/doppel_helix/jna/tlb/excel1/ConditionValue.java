
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024492-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024492-0000-0000-C000-000000000046}")
public interface ConditionValue extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x62d)</p>
     * <p>vtableId(10)</p>
     * @param newtype [in] {@code XlConditionValueTypes}
     * @param newvalue [in, optional] {@code Object}
     */
    @ComMethod(name = "Modify", dispId = 0x62d)
    void Modify(XlConditionValueTypes newtype,
            Object newvalue);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlConditionValueTypes getType();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    Object getValue();
            
    
}