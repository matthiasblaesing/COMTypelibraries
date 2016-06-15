
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
     */
    @ComProperty(name = "AppointmentTimeField", dispId = 0xfc2f)
    OlAppointmentTimeField getAppointmentTimeField();
            
    /**
     * <p>id(0xfc2f)</p>
     */
    @ComProperty(name = "AppointmentTimeField", dispId = 0xfc2f)
    void setAppointmentTimeField(OlAppointmentTimeField param0);
            
    /**
     * <p>id(0xfffffe08)</p>
     */
    @ComProperty(name = "BorderStyle", dispId = 0xfffffe08)
    OlBorderStyle getBorderStyle();
            
    /**
     * <p>id(0xfffffe08)</p>
     */
    @ComProperty(name = "BorderStyle", dispId = 0xfffffe08)
    void setBorderStyle(OlBorderStyle param0);
            
    /**
     * <p>id(0xfffffdfe)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    Boolean getEnabled();
            
    /**
     * <p>id(0xfffffdfe)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Locked", dispId = 0xa)
    Boolean getLocked();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Locked", dispId = 0xa)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0xfffffdf6)</p>
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    eu.doppel_helix.jna.tlb.stdole2.Picture getMouseIcon();
            
    /**
     * <p>id(0xfffffdf6)</p>
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    void setMouseIcon(eu.doppel_helix.jna.tlb.stdole2.Picture param0);
            
    /**
     * <p>id(0xfffffdf7)</p>
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    OlMousePointer getMousePointer();
            
    /**
     * <p>id(0xfffffdf7)</p>
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    void setMousePointer(OlMousePointer param0);
            
    /**
     * <p>id(0xfc30)</p>
     */
    @ComProperty(name = "SelectedTimeZoneIndex", dispId = 0xfc30)
    Integer getSelectedTimeZoneIndex();
            
    /**
     * <p>id(0xfc30)</p>
     */
    @ComProperty(name = "SelectedTimeZoneIndex", dispId = 0xfc30)
    void setSelectedTimeZoneIndex(Integer param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComMethod(name = "DropDown", dispId = 0x3e9)
    void DropDown();
            
    
}