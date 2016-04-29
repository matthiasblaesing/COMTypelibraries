
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020927-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020927-0000-0000-C000-000000000046}")
public interface TextInput {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Valid", dispId = 0x0)
    Boolean getValid();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Default", dispId = 0x1)
    String get_Default();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Default", dispId = 0x1)
    void set_Default(String param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Type", dispId = 0x2)
    WdTextFormFieldType getType();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Format", dispId = 0x3)
    String getFormat();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Width", dispId = 0x4)
    Integer getWidth();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Width", dispId = 0x4)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x65)
    void Clear();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "EditType", dispId = 0x66)
    void EditType(WdTextFormFieldType Type,
            Object Default,
            Object Format,
            Object Enabled);
            
    
}