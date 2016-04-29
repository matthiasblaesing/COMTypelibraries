
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006304D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006304D-0000-0000-C000-000000000046}")
public interface Exception {
    /**
     * <p>id(0xf000)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2001)</p>
     */
    @ComProperty(name = "AppointmentItem", dispId = 0x2001)
    AppointmentItem getAppointmentItem();
            
    /**
     * <p>id(0x2002)</p>
     */
    @ComProperty(name = "Deleted", dispId = 0x2002)
    Boolean getDeleted();
            
    /**
     * <p>id(0x2000)</p>
     */
    @ComProperty(name = "OriginalDate", dispId = 0x2000)
    java.util.Date getOriginalDate();
            
    /**
     * <p>id(0xfa09)</p>
     */
    @ComProperty(name = "ItemProperties", dispId = 0xfa09)
    ItemProperties getItemProperties();
            
    
}