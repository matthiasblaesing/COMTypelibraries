
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630CD-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630CD-0000-0000-C000-000000000046}")
public interface _Rule {
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
     * <p>id(0x2102)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2102)
    String getName();
            
    /**
     * <p>id(0x2102)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2102)
    void setName(String param0);
            
    /**
     * <p>id(0xfb0b)</p>
     */
    @ComProperty(name = "ExecutionOrder", dispId = 0xfb0b)
    Integer getExecutionOrder();
            
    /**
     * <p>id(0xfb0b)</p>
     */
    @ComProperty(name = "ExecutionOrder", dispId = 0xfb0b)
    void setExecutionOrder(Integer param0);
            
    /**
     * <p>id(0xfb0c)</p>
     */
    @ComProperty(name = "RuleType", dispId = 0xfb0c)
    OlRuleType getRuleType();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x67)
    Boolean getEnabled();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x67)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0xfb0d)</p>
     */
    @ComProperty(name = "IsLocalRule", dispId = 0xfb0d)
    Boolean getIsLocalRule();
            
    /**
     * <p>id(0xfb0e)</p>
     */
    @ComMethod(name = "Execute", dispId = 0xfb0e)
    void Execute(Object ShowProgress,
            Object Folder,
            Object IncludeSubfolders,
            Object RuleExecuteOption);
            
    /**
     * <p>id(0xfb10)</p>
     */
    @ComProperty(name = "Actions", dispId = 0xfb10)
    RuleActions getActions();
            
    /**
     * <p>id(0xfb29)</p>
     */
    @ComProperty(name = "Conditions", dispId = 0xfb29)
    RuleConditions getConditions();
            
    /**
     * <p>id(0xfb33)</p>
     */
    @ComProperty(name = "Exceptions", dispId = 0xfb33)
    RuleConditions getExceptions();
            
    
}