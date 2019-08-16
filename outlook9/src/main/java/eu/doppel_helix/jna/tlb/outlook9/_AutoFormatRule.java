
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063093-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063093-0000-0000-C000-000000000046}")
public interface _AutoFormatRule extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2102)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x2102)
    void setName(String param0);
            
    /**
     * <p>id(0xfa18)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Filter", dispId = 0xfa18)
    String getFilter();
            
    /**
     * <p>id(0xfa18)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Filter", dispId = 0xfa18)
    void setFilter(String param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x67)
    Boolean getEnabled();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x67)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0xfa17)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Font", dispId = 0xfa17)
    ViewFont getFont();
            
    /**
     * <p>id(0xfa17)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code ViewFont}
     */
    @ComProperty(name = "Font", dispId = 0xfa17)
    void setFont(ViewFont param0);
            
    /**
     * <p>id(0xfa3e)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Standard", dispId = 0xfa3e)
    Boolean getStandard();
            
    
}