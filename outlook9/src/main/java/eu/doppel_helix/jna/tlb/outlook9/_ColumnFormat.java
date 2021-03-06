
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006309E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006309E-0000-0000-C000-000000000046}")
public interface _ColumnFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xfa1e)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Label", dispId = 0xfa1e)
    String getLabel();
            
    /**
     * <p>id(0xfa1e)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Label", dispId = 0xfa1e)
    void setLabel(String param0);
            
    /**
     * <p>id(0xfb8c)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FieldFormat", dispId = 0xfb8c)
    Integer getFieldFormat();
            
    /**
     * <p>id(0xfb8c)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "FieldFormat", dispId = 0xfb8c)
    void setFieldFormat(Integer param0);
            
    /**
     * <p>id(0x2117)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Width", dispId = 0x2117)
    Integer getWidth();
            
    /**
     * <p>id(0x2117)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x2117)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0xfa22)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Align", dispId = 0xfa22)
    OlAlign getAlign();
            
    /**
     * <p>id(0xfa22)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code OlAlign}
     */
    @ComProperty(name = "Align", dispId = 0xfa22)
    void setAlign(OlAlign param0);
            
    /**
     * <p>id(0xfb8e)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "FieldType", dispId = 0xfb8e)
    OlUserPropertyType getFieldType();
            
    
}