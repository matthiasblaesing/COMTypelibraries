
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00067367-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00067367-0000-0000-C000-000000000046}")
public interface _OlkTimeZoneControl extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfc2f)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "AppointmentTimeField", dispId = 0xfc2f)
    OlAppointmentTimeField getAppointmentTimeField();
            
    /**
     * <p>id(0xfc2f)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code OlAppointmentTimeField}
     */
    @ComProperty(name = "AppointmentTimeField", dispId = 0xfc2f)
    void setAppointmentTimeField(OlAppointmentTimeField param0);
            
    /**
     * <p>id(0xfffffe08)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "BorderStyle", dispId = 0xfffffe08)
    OlBorderStyle getBorderStyle();
            
    /**
     * <p>id(0xfffffe08)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code OlBorderStyle}
     */
    @ComProperty(name = "BorderStyle", dispId = 0xfffffe08)
    void setBorderStyle(OlBorderStyle param0);
            
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    Boolean getEnabled();
            
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Locked", dispId = 0xa)
    Boolean getLocked();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0xa)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0xfffffdf6)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    eu.doppel_helix.jna.tlb.stdole2.Picture getMouseIcon();
            
    /**
     * <p>id(0xfffffdf6)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.stdole2.Picture}
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    void setMouseIcon(eu.doppel_helix.jna.tlb.stdole2.Picture param0);
            
    /**
     * <p>id(0xfffffdf7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    OlMousePointer getMousePointer();
            
    /**
     * <p>id(0xfffffdf7)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code OlMousePointer}
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    void setMousePointer(OlMousePointer param0);
            
    /**
     * <p>id(0xfc30)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "SelectedTimeZoneIndex", dispId = 0xfc30)
    Integer getSelectedTimeZoneIndex();
            
    /**
     * <p>id(0xfc30)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SelectedTimeZoneIndex", dispId = 0xfc30)
    void setSelectedTimeZoneIndex(Integer param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "DropDown", dispId = 0x3e9)
    void DropDown();
            
    
}