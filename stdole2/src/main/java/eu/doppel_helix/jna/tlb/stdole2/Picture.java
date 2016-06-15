
package eu.doppel_helix.jna.tlb.stdole2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({7BF80981-BF32-101A-8BBB-00AA00300CAB})</p>
 */
@ComInterface(iid="{7BF80981-BF32-101A-8BBB-00AA00300CAB}")
public interface Picture extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "Render", dispId = 0x6)
    void Render(Integer hdc,
            Integer x,
            Integer y,
            Integer cx,
            Integer cy,
            Integer xSrc,
            Integer ySrc,
            Integer cxSrc,
            Integer cySrc,
            Object prcWBounds);
            
    
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Handle", dispId = 0x0)
    Integer getHandle();

    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "hPal", dispId = 0x2)
    Integer getHPal();

    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "hPal", dispId = 0x2)
    void setHPal(Integer value);

    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3)
    Short getType();

    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Width", dispId = 0x4)
    Integer getWidth();

    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5)
    Integer getHeight();

}