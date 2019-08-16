
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244BF-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244BF-0000-0000-C000-000000000046}")
public interface NegativeBarFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x893)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ColorType", dispId = 0x893)
    XlDataBarNegativeColorType getColorType();
            
    /**
     * <p>id(0x893)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code XlDataBarNegativeColorType}
     */
    @ComProperty(name = "ColorType", dispId = 0x893)
    void setColorType(XlDataBarNegativeColorType param0);
            
    /**
     * <p>id(0xb99)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "BorderColorType", dispId = 0xb99)
    XlDataBarNegativeColorType getBorderColorType();
            
    /**
     * <p>id(0xb99)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code XlDataBarNegativeColorType}
     */
    @ComProperty(name = "BorderColorType", dispId = 0xb99)
    void setBorderColorType(XlDataBarNegativeColorType param0);
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Color", dispId = 0x63)
    com.sun.jna.platform.win32.COM.util.IDispatch getColor();
            
    /**
     * <p>id(0xb9a)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "BorderColor", dispId = 0xb9a)
    com.sun.jna.platform.win32.COM.util.IDispatch getBorderColor();
            
    
}