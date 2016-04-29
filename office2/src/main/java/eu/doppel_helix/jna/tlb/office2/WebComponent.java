
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CD100-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CD100-0000-0000-C000-000000000046}")
public interface WebComponent {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getShape();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "URL", dispId = 0x2)
    String getURL();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "URL", dispId = 0x2)
    void setURL(String param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "HTML", dispId = 0x3)
    String getHTML();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "HTML", dispId = 0x3)
    void setHTML(String param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Name", dispId = 0x4)
    String getName();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Name", dispId = 0x4)
    void setName(String param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Width", dispId = 0x5)
    Integer getWidth();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Width", dispId = 0x5)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6)
    Integer getHeight();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "SetPlaceHolderGraphic", dispId = 0x7)
    void SetPlaceHolderGraphic(String PlaceHolderGraphic);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "Commit", dispId = 0x8)
    void Commit();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "Revert", dispId = 0x9)
    void Revert();
            
    
}