
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Position", dispId = 0xa)
    WdDropPosition getPosition();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code WdDropPosition}
     */
    @ComProperty(name = "Position", dispId = 0xa)
    void setPosition(WdDropPosition param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "FontName", dispId = 0xb)
    String getFontName();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FontName", dispId = 0xb)
    void setFontName(String param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "LinesToDrop", dispId = 0xc)
    Integer getLinesToDrop();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LinesToDrop", dispId = 0xc)
    void setLinesToDrop(Integer param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "DistanceFromText", dispId = 0xd)
    Float getDistanceFromText();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "DistanceFromText", dispId = 0xd)
    void setDistanceFromText(Float param0);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x64)
    void Clear();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Enable", dispId = 0x65)
    void Enable();
            
    
}