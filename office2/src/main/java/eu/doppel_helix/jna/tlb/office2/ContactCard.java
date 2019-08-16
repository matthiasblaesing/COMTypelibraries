
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03F1-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03F1-0000-0000-C000-000000000046}")
public interface ContactCard extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "Close", dispId = 0x1)
    void Close();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param CardStyle [in] {@code MsoContactCardStyle}
     * @param RectangleLeft [in] {@code Integer}
     * @param RectangleRight [in] {@code Integer}
     * @param RectangleTop [in] {@code Integer}
     * @param RectangleBottom [in] {@code Integer}
     * @param HorizontalPosition [in] {@code Integer}
     * @param ShowWithDelay [in, optional] {@code Boolean}
     */
    @ComMethod(name = "Show", dispId = 0x2)
    void Show(MsoContactCardStyle CardStyle,
            Integer RectangleLeft,
            Integer RectangleRight,
            Integer RectangleTop,
            Integer RectangleBottom,
            Integer HorizontalPosition,
            Boolean ShowWithDelay);
            
    
}