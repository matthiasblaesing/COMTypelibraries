
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063070-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063070-0000-0000-C000-000000000046}")
public interface _OutlookBarPane extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2100)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Contents", dispId = 0x2100)
    OutlookBarStorage getContents();
            
    /**
     * <p>id(0x2101)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "CurrentGroup", dispId = 0x2101)
    OutlookBarGroup getCurrentGroup();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x2103)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x2103)
    Boolean getVisible();
            
    /**
     * <p>id(0x2103)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x2103)
    void setVisible(Boolean param0);
            
    
}