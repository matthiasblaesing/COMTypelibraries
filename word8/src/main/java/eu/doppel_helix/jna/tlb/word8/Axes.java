
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({354AB591-A217-48B4-99E4-14F58F15667D})</p>
 */
@ComInterface(iid="{354AB591-A217-48B4-99E4-14F58F15667D}")
public interface Axes extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60020000)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param Type [in] {@code XlAxisType}
     * @param AxisGroup [in, optional] {@code XlAxisGroup}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Axis Item(XlAxisType Type,
            XlAxisGroup AxisGroup);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param Type [in] {@code XlAxisType}
     * @param AxisGroup [in, optional] {@code XlAxisGroup}
     */
    @ComMethod(name = "_Default", dispId = 0x60020005)
    Axis _Default(XlAxisType Type,
            XlAxisGroup AxisGroup);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}