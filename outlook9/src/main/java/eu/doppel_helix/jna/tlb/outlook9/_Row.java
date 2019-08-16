
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630D3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630D3-0000-0000-C000-000000000046}")
public interface _Row extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xfb03)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "BinaryToString", dispId = 0xfb03)
    String BinaryToString(Object Index);
            
    /**
     * <p>id(0xfbce)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "GetValues", dispId = 0xfbce)
    Object GetValues();
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x51)
    Object Item(Object Index);
            
    /**
     * <p>id(0xfb01)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "LocalTimeToUTC", dispId = 0xfb01)
    java.util.Date LocalTimeToUTC(Object Index);
            
    /**
     * <p>id(0xfb00)</p>
     * <p>vtableId(15)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "UTCToLocalTime", dispId = 0xfb00)
    java.util.Date UTCToLocalTime(Object Index);
            
    
}