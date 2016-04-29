
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024499-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024499-0000-0000-C000-000000000046}")
public interface IconCriterion {
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlConditionValueTypes getType();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(XlConditionValueTypes param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    Object getValue();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(Object param0);
            
    /**
     * <p>id(0x31d)</p>
     */
    @ComProperty(name = "Operator", dispId = 0x31d)
    Integer getOperator();
            
    /**
     * <p>id(0x31d)</p>
     */
    @ComProperty(name = "Operator", dispId = 0x31d)
    void setOperator(Integer param0);
            
    /**
     * <p>id(0xabb)</p>
     */
    @ComProperty(name = "Icon", dispId = 0xabb)
    XlIcon getIcon();
            
    /**
     * <p>id(0xabb)</p>
     */
    @ComProperty(name = "Icon", dispId = 0xabb)
    void setIcon(XlIcon param0);
            
    
}