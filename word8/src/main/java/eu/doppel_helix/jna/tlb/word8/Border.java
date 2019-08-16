
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
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x0)
    Boolean getVisible();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x0)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x1)
    WdColorIndex getColorIndex();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "ColorIndex", dispId = 0x1)
    void setColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Inside", dispId = 0x2)
    Boolean getInside();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "LineStyle", dispId = 0x3)
    WdLineStyle getLineStyle();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code WdLineStyle}
     */
    @ComProperty(name = "LineStyle", dispId = 0x3)
    void setLineStyle(WdLineStyle param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "LineWidth", dispId = 0x4)
    WdLineWidth getLineWidth();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code WdLineWidth}
     */
    @ComProperty(name = "LineWidth", dispId = 0x4)
    void setLineWidth(WdLineWidth param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "ArtStyle", dispId = 0x5)
    WdPageBorderArt getArtStyle();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code WdPageBorderArt}
     */
    @ComProperty(name = "ArtStyle", dispId = 0x5)
    void setArtStyle(WdPageBorderArt param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ArtWidth", dispId = 0x6)
    Integer getArtWidth();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ArtWidth", dispId = 0x6)
    void setArtWidth(Integer param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Color", dispId = 0x7)
    WdColor getColor();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code WdColor}
     */
    @ComProperty(name = "Color", dispId = 0x7)
    void setColor(WdColor param0);
            
    
}