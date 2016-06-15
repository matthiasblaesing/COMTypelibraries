
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020956-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020956-0000-0000-C000-000000000046}")
public interface DropCap extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Position", dispId = 0xa)
    WdDropPosition getPosition();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Position", dispId = 0xa)
    void setPosition(WdDropPosition param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "FontName", dispId = 0xb)
    String getFontName();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "FontName", dispId = 0xb)
    void setFontName(String param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "LinesToDrop", dispId = 0xc)
    Integer getLinesToDrop();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "LinesToDrop", dispId = 0xc)
    void setLinesToDrop(Integer param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "DistanceFromText", dispId = 0xd)
    Float getDistanceFromText();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "DistanceFromText", dispId = 0xd)
    void setDistanceFromText(Float param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x64)
    void Clear();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Enable", dispId = 0x65)
    void Enable();
            
    
}