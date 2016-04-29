
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020974-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020974-0000-0000-C000-000000000046}")
public interface TextColumn {
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
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Width", dispId = 0x64)
    Float getWidth();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Width", dispId = 0x64)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "SpaceAfter", dispId = 0x65)
    Float getSpaceAfter();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "SpaceAfter", dispId = 0x65)
    void setSpaceAfter(Float param0);
            
    
}