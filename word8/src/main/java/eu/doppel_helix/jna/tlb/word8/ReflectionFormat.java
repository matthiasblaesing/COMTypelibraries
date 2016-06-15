
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({F01943FF-1985-445E-8602-8FB8F39CCA75})</p>
 */
@ComInterface(iid="{F01943FF-1985-445E-8602-8FB8F39CCA75}")
public interface ReflectionFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Type", dispId = 0x1)
    eu.doppel_helix.jna.tlb.office2.MsoReflectionType getType();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Type", dispId = 0x1)
    void setType(eu.doppel_helix.jna.tlb.office2.MsoReflectionType param0);
            
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
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Transparency", dispId = 0x2)
    Float getTransparency();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Transparency", dispId = 0x2)
    void setTransparency(Float param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Size", dispId = 0x3)
    Float getSize();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Size", dispId = 0x3)
    void setSize(Float param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Offset", dispId = 0x4)
    Float getOffset();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Offset", dispId = 0x4)
    void setOffset(Float param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Blur", dispId = 0x5)
    Float getBlur();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Blur", dispId = 0x5)
    void setBlur(Float param0);
            
    
}