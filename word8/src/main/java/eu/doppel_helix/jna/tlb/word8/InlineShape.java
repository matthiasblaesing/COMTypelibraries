
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209A8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209A8-0000-0000-C000-000000000046}")
public interface InlineShape extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x44c)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Range", dispId = 0x2)
    Range getRange();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "LinkFormat", dispId = 0x3)
    LinkFormat getLinkFormat();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Field", dispId = 0x4)
    Field getField();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "OLEFormat", dispId = 0x5)
    OLEFormat getOLEFormat();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6)
    WdInlineShapeType getType();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Hyperlink", dispId = 0x7)
    Hyperlink getHyperlink();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8)
    Float getHeight();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x8)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Width", dispId = 0x9)
    Float getWidth();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x9)
    void setWidth(Float param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "ScaleHeight", dispId = 0xa)
    Float getScaleHeight();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ScaleHeight", dispId = 0xa)
    void setScaleHeight(Float param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "ScaleWidth", dispId = 0xb)
    Float getScaleWidth();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ScaleWidth", dispId = 0xb)
    void setScaleWidth(Float param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0xc)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getLockAspectRatio();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "LockAspectRatio", dispId = 0xc)
    void setLockAspectRatio(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Line", dispId = 0x70)
    LineFormat getLine();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x6b)
    FillFormat getFill();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "PictureFormat", dispId = 0x76)
    PictureFormat getPictureFormat();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code PictureFormat}
     */
    @ComProperty(name = "PictureFormat", dispId = 0x76)
    void setPictureFormat(PictureFormat param0);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x64)
    void Activate();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x65)
    void Reset();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x66)
    void Delete();
            
    /**
     * <p>id(0xffff)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(36)</p>
     */
    @ComMethod(name = "ConvertToShape", dispId = 0x68)
    Shape ConvertToShape();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "HorizontalLineFormat", dispId = 0x77)
    HorizontalLineFormat getHorizontalLineFormat();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Script", dispId = 0x7a)
    eu.doppel_helix.jna.tlb.office2.Script getScript();
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "OWSAnchor", dispId = 0x82)
    Integer getOWSAnchor();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "TextEffect", dispId = 0x78)
    TextEffectFormat getTextEffect();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code TextEffectFormat}
     */
    @ComProperty(name = "TextEffect", dispId = 0x78)
    void setTextEffect(TextEffectFormat param0);
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "AlternativeText", dispId = 0x83)
    String getAlternativeText();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AlternativeText", dispId = 0x83)
    void setAlternativeText(String param0);
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "IsPictureBullet", dispId = 0x84)
    Boolean getIsPictureBullet();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "GroupItems", dispId = 0x85)
    GroupShapes getGroupItems();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "HasChart", dispId = 0x94)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasChart();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "Chart", dispId = 0x95)
    Chart getChart();
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "SoftEdge", dispId = 0x98)
    SoftEdgeFormat getSoftEdge();
            
    /**
     * <p>id(0x99)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "Glow", dispId = 0x99)
    GlowFormat getGlow();
            
    /**
     * <p>id(0x9a)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "Reflection", dispId = 0x9a)
    ReflectionFormat getReflection();
            
    /**
     * <p>id(0x44d)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x44d)
    ShadowFormat getShadow();
            
    /**
     * <p>id(0x9b)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "HasSmartArt", dispId = 0x9b)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getHasSmartArt();
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "SmartArt", dispId = 0x9c)
    eu.doppel_helix.jna.tlb.office2.SmartArt getSmartArt();
            
    /**
     * <p>id(0x9e)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "Title", dispId = 0x9e)
    String getTitle();
            
    /**
     * <p>id(0x9e)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0x9e)
    void setTitle(String param0);
            
    /**
     * <p>id(0xcf)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "AnchorID", dispId = 0xcf)
    Integer getAnchorID();
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "EditID", dispId = 0xd0)
    Integer getEditID();
            
    
}