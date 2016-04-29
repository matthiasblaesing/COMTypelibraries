
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063042-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063042-0000-0000-C000-000000000046}")
public interface UserProperty {
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
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x67)
    String getFormula();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x67)
    void setFormula(String param0);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "Name", dispId = 0x70)
    String getName();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6d)
    OlUserPropertyType getType();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "ValidationFormula", dispId = 0x68)
    String getValidationFormula();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "ValidationFormula", dispId = 0x68)
    void setValidationFormula(String param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "ValidationText", dispId = 0x69)
    String getValidationText();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "ValidationText", dispId = 0x69)
    void setValidationText(String param0);
            
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
     * <p>id(0x6c)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6c)
    void Delete();
            
    /**
     * <p>id(0xfa08)</p>
     */
    @ComProperty(name = "IsUserProperty", dispId = 0xfa08)
    Boolean getIsUserProperty();
            
    
}