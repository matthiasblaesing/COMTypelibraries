
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CD100-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CD100-0000-0000-C000-000000000046}")
public interface WebComponent extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getShape();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "URL", dispId = 0x2)
    String getURL();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "URL", dispId = 0x2)
    void setURL(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "HTML", dispId = 0x3)
    String getHTML();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HTML", dispId = 0x3)
    void setHTML(String param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Name", dispId = 0x4)
    String getName();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x4)
    void setName(String param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Width", dispId = 0x5)
    Integer getWidth();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x5)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6)
    Integer getHeight();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x6)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     * @param PlaceHolderGraphic [in] {@code String}
     */
    @ComMethod(name = "SetPlaceHolderGraphic", dispId = 0x7)
    void SetPlaceHolderGraphic(String PlaceHolderGraphic);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Commit", dispId = 0x8)
    void Commit();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Revert", dispId = 0x9)
    void Revert();
            
    
}