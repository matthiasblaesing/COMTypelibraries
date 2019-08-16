
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244BB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244BB-0000-0000-C000-000000000046}")
public interface SparkHorizontalAxis extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x43)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Axis", dispId = 0x43)
    SparkColor getAxis();
            
    /**
     * <p>id(0xb93)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "IsDateAxis", dispId = 0xb93)
    Boolean getIsDateAxis();
            
    /**
     * <p>id(0xb94)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "RightToLeftPlotOrder", dispId = 0xb94)
    Boolean getRightToLeftPlotOrder();
            
    /**
     * <p>id(0xb94)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RightToLeftPlotOrder", dispId = 0xb94)
    void setRightToLeftPlotOrder(Boolean param0);
            
    
}