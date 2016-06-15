
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020936-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020936-0000-0000-C000-000000000046}")
public interface AutoTextEntry extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1)
    Integer getIndex();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2)
    String getName();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2)
    void setName(String param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "StyleName", dispId = 0x3)
    String getStyleName();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    String getValue();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(String param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x65)
    void Delete();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Insert", dispId = 0x66)
    Range Insert(Range Where,
            Object RichText);
            
    
}