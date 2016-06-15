
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002093B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002093B-0000-0000-C000-000000000046}")
public interface Border extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Visible", dispId = 0x0)
    Boolean getVisible();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x0)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x1)
    WdColorIndex getColorIndex();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x1)
    void setColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Inside", dispId = 0x2)
    Boolean getInside();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "LineStyle", dispId = 0x3)
    WdLineStyle getLineStyle();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "LineStyle", dispId = 0x3)
    void setLineStyle(WdLineStyle param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "LineWidth", dispId = 0x4)
    WdLineWidth getLineWidth();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "LineWidth", dispId = 0x4)
    void setLineWidth(WdLineWidth param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "ArtStyle", dispId = 0x5)
    WdPageBorderArt getArtStyle();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "ArtStyle", dispId = 0x5)
    void setArtStyle(WdPageBorderArt param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "ArtWidth", dispId = 0x6)
    Integer getArtWidth();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "ArtWidth", dispId = 0x6)
    void setArtWidth(Integer param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Color", dispId = 0x7)
    WdColor getColor();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Color", dispId = 0x7)
    void setColor(WdColor param0);
            
    
}