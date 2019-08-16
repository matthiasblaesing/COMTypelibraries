
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630D6-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630D6-0000-0000-C000-000000000046}")
public interface _MarkAsTaskRuleAction extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x67)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x67)
    Boolean getEnabled();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x67)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0xfb0f)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ActionType", dispId = 0xfb0f)
    OlRuleActionType getActionType();
            
    /**
     * <p>id(0xfb24)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "FlagTo", dispId = 0xfb24)
    String getFlagTo();
            
    /**
     * <p>id(0xfb24)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FlagTo", dispId = 0xfb24)
    void setFlagTo(String param0);
            
    /**
     * <p>id(0xfb25)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "MarkInterval", dispId = 0xfb25)
    OlMarkInterval getMarkInterval();
            
    /**
     * <p>id(0xfb25)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code OlMarkInterval}
     */
    @ComProperty(name = "MarkInterval", dispId = 0xfb25)
    void setMarkInterval(OlMarkInterval param0);
            
    
}