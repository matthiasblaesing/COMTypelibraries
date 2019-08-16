
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244AD-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244AD-0000-0000-C000-000000000046}")
public interface ColorStop extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x75)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Color", dispId = 0x63)
    Object getColor();
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Color", dispId = 0x63)
    void setColor(Object param0);
            
    /**
     * <p>id(0x93d)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ThemeColor", dispId = 0x93d)
    Integer getThemeColor();
            
    /**
     * <p>id(0x93d)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ThemeColor", dispId = 0x93d)
    void setThemeColor(Integer param0);
            
    /**
     * <p>id(0x93e)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "TintAndShade", dispId = 0x93e)
    Object getTintAndShade();
            
    /**
     * <p>id(0x93e)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "TintAndShade", dispId = 0x93e)
    void setTintAndShade(Object param0);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    Double getPosition();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    void setPosition(Double param0);
            
    
}