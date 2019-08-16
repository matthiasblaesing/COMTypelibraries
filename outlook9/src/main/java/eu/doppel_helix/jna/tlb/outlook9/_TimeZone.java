
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630FD-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630FD-0000-0000-C000-000000000046}")
public interface _TimeZone extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2102)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2102)
    String getName();
            
    /**
     * <p>id(0xfc2b)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DaylightDesignation", dispId = 0xfc2b)
    String getDaylightDesignation();
            
    /**
     * <p>id(0xfc2c)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "StandardDesignation", dispId = 0xfc2c)
    String getStandardDesignation();
            
    /**
     * <p>id(0xfc21)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Bias", dispId = 0xfc21)
    Integer getBias();
            
    /**
     * <p>id(0xfc22)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "StandardBias", dispId = 0xfc22)
    Integer getStandardBias();
            
    /**
     * <p>id(0xfc23)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "DaylightBias", dispId = 0xfc23)
    Integer getDaylightBias();
            
    /**
     * <p>id(0xfc24)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "StandardDate", dispId = 0xfc24)
    java.util.Date getStandardDate();
            
    /**
     * <p>id(0xfc25)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "DaylightDate", dispId = 0xfc25)
    java.util.Date getDaylightDate();
            
    /**
     * <p>id(0xfc32)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "ID", dispId = 0xfc32)
    String getID();
            
    
}