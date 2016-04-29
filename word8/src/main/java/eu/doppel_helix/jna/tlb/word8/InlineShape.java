
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209A8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209A8-0000-0000-C000-000000000046}")
public interface InlineShape {
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
     * <p>id(0x44c)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Range", dispId = 0x2)
    Range getRange();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "LinkFormat", dispId = 0x3)
    LinkFormat getLinkFormat();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Field", dispId = 0x4)
    Field getField();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "OLEFormat", dispId = 0x5)
    OLEFormat getOLEFormat();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6)
    WdInlineShapeType getType();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Hyperlink", dispId = 0x7)
    Hyperlink getHyperlink();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8)
    Float getHeight();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Width", dispId = 0x9)
    Float getWidth();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Width", dispId = 0x9)
    void setWidth(Float param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "ScaleHeight", dispId = 0xa)
    Float getScaleHeight();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "ScaleHeight", dispId = 0xa)
    void setScaleHeight(Float param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "ScaleWidth", dispId = 0xb)
    Float getScaleWidth();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "ScaleWidth", dispId = 0xb)
    void setScaleWidth(Float param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0xc)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getLockAspectRatio();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0xc)
    void setLockAspectRatio(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "Line", dispId = 0x70)
    LineFormat getLine();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x6b)
    FillFormat getFill();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "PictureFormat", dispId = 0x76)
    PictureFormat getPictureFormat();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "PictureFormat", dispId = 0x76)
    void setPictureFormat(PictureFormat param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x64)
    void Activate();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x65)
    void Reset();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x66)
    void Delete();
            
    /**
     * <p>id(0xffff)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "ConvertToShape", dispId = 0x68)
    Shape ConvertToShape();
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "HorizontalLineFormat", dispId = 0x77)
    HorizontalLineFormat getHorizontalLineFormat();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Script", dispId = 0x7a)
    eu.doppel_helix.jna.tlb.office2.Script getScript();
            
    /**
     * <p>id(0x82)</p>
     */
    @ComProperty(name = "OWSAnchor", dispId = 0x82)
    Integer getOWSAnchor();
            
    /**
     * <p>id(0x78)</p>
     */
    @ComProperty(name = "TextEffect", dispId = 0x78)
    TextEffectFormat getTextEffect();
            
    /**
     * <p>id(0x78)</p>
     */
    @ComProperty(name = "TextEffect", dispId = 0x78)
    void setTextEffect(TextEffectFormat param0);
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x83)
    String getAlternativeText();
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x83)
    void setAlternativeText(String param0);
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "IsPictureBullet", dispId = 0x84)
    Boolean getIsPictureBullet();
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "GroupItems", dispId = 0x85)
    GroupShapes getGroupItems();
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "HasChart", dispId = 0x94)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasChart();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Chart", dispId = 0x95)
    Chart getChart();
            
    /**
     * <p>id(0x98)</p>
     */
    @ComProperty(name = "SoftEdge", dispId = 0x98)
    SoftEdgeFormat getSoftEdge();
            
    /**
     * <p>id(0x99)</p>
     */
    @ComProperty(name = "Glow", dispId = 0x99)
    GlowFormat getGlow();
            
    /**
     * <p>id(0x9a)</p>
     */
    @ComProperty(name = "Reflection", dispId = 0x9a)
    ReflectionFormat getReflection();
            
    /**
     * <p>id(0x44d)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x44d)
    ShadowFormat getShadow();
            
    /**
     * <p>id(0x9b)</p>
     */
    @ComProperty(name = "HasSmartArt", dispId = 0x9b)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasSmartArt();
            
    /**
     * <p>id(0x9c)</p>
     */
    @ComProperty(name = "SmartArt", dispId = 0x9c)
    eu.doppel_helix.jna.tlb.office2.SmartArt getSmartArt();
            
    /**
     * <p>id(0x9e)</p>
     */
    @ComProperty(name = "Title", dispId = 0x9e)
    String getTitle();
            
    /**
     * <p>id(0x9e)</p>
     */
    @ComProperty(name = "Title", dispId = 0x9e)
    void setTitle(String param0);
            
    /**
     * <p>id(0xcf)</p>
     */
    @ComProperty(name = "AnchorID", dispId = 0xcf)
    Integer getAnchorID();
            
    /**
     * <p>id(0xd0)</p>
     */
    @ComProperty(name = "EditID", dispId = 0xd0)
    Integer getEditID();
            
    
}