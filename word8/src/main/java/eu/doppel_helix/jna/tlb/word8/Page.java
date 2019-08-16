
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({352840A9-AF7D-4CA4-87FC-21C68FDAB3E4})</p>
 */
@ComInterface(iid="{352840A9-AF7D-4CA4-87FC-21C68FDAB3E4}")
public interface Page extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Left", dispId = 0x2)
    Integer getLeft();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Top", dispId = 0x3)
    Integer getTop();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Width", dispId = 0x4)
    Integer getWidth();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5)
    Integer getHeight();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Rectangles", dispId = 0x6)
    Rectangles getRectangles();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Breaks", dispId = 0x7)
    Breaks getBreaks();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "EnhMetaFileBits", dispId = 0x8)
    Object getEnhMetaFileBits();
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(17)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "SaveAsPNG", dispId = 0xc8)
    void SaveAsPNG(String FileName);
            
    
}