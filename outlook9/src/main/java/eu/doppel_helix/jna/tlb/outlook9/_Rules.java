
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630CC-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630CC-0000-0000-C000-000000000046}")
public interface _Rules extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x50)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x50)
    Integer getCount();
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x51)
    _Rule Item(Object Index);
            
    /**
     * <p>id(0xfb0a)</p>
     * <p>vtableId(13)</p>
     * @param Name [in] {@code String}
     * @param RuleType [in] {@code OlRuleType}
     */
    @ComMethod(name = "Create", dispId = 0xfb0a)
    Rule Create(String Name,
            OlRuleType RuleType);
            
    /**
     * <p>id(0xf048)</p>
     * <p>vtableId(14)</p>
     * @param ShowProgress [in, optional] {@code Object}
     */
    @ComMethod(name = "Save", dispId = 0xf048)
    void Save(Object ShowProgress);
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(15)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Remove", dispId = 0x52)
    void Remove(Object Index);
            
    /**
     * <p>id(0xfc15)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "IsRssRulesProcessingEnabled", dispId = 0xfc15)
    Boolean getIsRssRulesProcessingEnabled();
            
    /**
     * <p>id(0xfc15)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsRssRulesProcessingEnabled", dispId = 0xfc15)
    void setIsRssRulesProcessingEnabled(Boolean param0);
            
    
}