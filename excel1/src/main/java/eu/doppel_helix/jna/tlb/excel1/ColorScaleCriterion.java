
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024495-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024495-0000-0000-C000-000000000046}")
public interface ColorScaleCriterion extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa9d)</p>
     */
    @ComProperty(name = "FormatColor", dispId = 0xa9d)
    FormatColor getFormatColor();
            
    
}