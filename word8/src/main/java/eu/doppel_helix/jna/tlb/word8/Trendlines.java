
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({54B7061A-D56C-40E5-B85B-58146446C782})</p>
 */
@ComInterface(iid="{54B7061A-D56C-40E5-B85B-58146446C782}")
public interface Trendlines extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(8)</p>
     * @param Type [in, optional] {@code XlTrendlineType}
     * @param Order [in, optional] {@code Object}
     * @param Period [in, optional] {@code Object}
     * @param Forward [in, optional] {@code Object}
     * @param Backward [in, optional] {@code Object}
     * @param Intercept [in, optional] {@code Object}
     * @param DisplayEquation [in, optional] {@code Object}
     * @param DisplayRSquared [in, optional] {@code Object}
     * @param Name [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    Trendline Add(XlTrendlineType Type,
            Object Order,
            Object Period,
            Object Forward,
            Object Backward,
            Object Intercept,
            Object DisplayEquation,
            Object DisplayRSquared,
            Object Name);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Trendline Item(Object Index);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "_Default", dispId = 0x60020007)
    Trendline _Default(Object Index);
            
    
}