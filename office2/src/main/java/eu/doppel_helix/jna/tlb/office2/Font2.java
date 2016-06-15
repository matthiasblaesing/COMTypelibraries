
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C039A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C039A-0000-0000-C000-000000000046}")
public interface Font2 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x2)
    MsoTriState getBold();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x2)
    void setBold(MsoTriState param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x3)
    MsoTriState getItalic();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x3)
    void setItalic(MsoTriState param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Strike", dispId = 0x4)
    MsoTextStrike getStrike();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Strike", dispId = 0x4)
    void setStrike(MsoTextStrike param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Caps", dispId = 0x5)
    MsoTextCaps getCaps();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Caps", dispId = 0x5)
    void setCaps(MsoTextCaps param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "AutorotateNumbers", dispId = 0x6)
    MsoTriState getAutorotateNumbers();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "AutorotateNumbers", dispId = 0x6)
    void setAutorotateNumbers(MsoTriState param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "BaselineOffset", dispId = 0x7)
    Float getBaselineOffset();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "BaselineOffset", dispId = 0x7)
    void setBaselineOffset(Float param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Kerning", dispId = 0x8)
    Float getKerning();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Kerning", dispId = 0x8)
    void setKerning(Float param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Size", dispId = 0x9)
    Float getSize();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Size", dispId = 0x9)
    void setSize(Float param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Spacing", dispId = 0xa)
    Float getSpacing();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Spacing", dispId = 0xa)
    void setSpacing(Float param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "UnderlineStyle", dispId = 0xb)
    MsoTextUnderlineType getUnderlineStyle();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "UnderlineStyle", dispId = 0xb)
    void setUnderlineStyle(MsoTextUnderlineType param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Allcaps", dispId = 0xc)
    MsoTriState getAllcaps();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Allcaps", dispId = 0xc)
    void setAllcaps(MsoTriState param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "DoubleStrikeThrough", dispId = 0xd)
    MsoTriState getDoubleStrikeThrough();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "DoubleStrikeThrough", dispId = 0xd)
    void setDoubleStrikeThrough(MsoTriState param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "Equalize", dispId = 0xe)
    MsoTriState getEqualize();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "Equalize", dispId = 0xe)
    void setEqualize(MsoTriState param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "Fill", dispId = 0xf)
    FillFormat getFill();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "Glow", dispId = 0x10)
    GlowFormat getGlow();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "Reflection", dispId = 0x11)
    ReflectionFormat getReflection();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "Line", dispId = 0x12)
    LineFormat getLine();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x13)
    ShadowFormat getShadow();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "Highlight", dispId = 0x14)
    ColorFormat getHighlight();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "UnderlineColor", dispId = 0x15)
    ColorFormat getUnderlineColor();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "Smallcaps", dispId = 0x16)
    MsoTriState getSmallcaps();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "Smallcaps", dispId = 0x16)
    void setSmallcaps(MsoTriState param0);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "SoftEdgeFormat", dispId = 0x17)
    MsoSoftEdgeType getSoftEdgeFormat();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "SoftEdgeFormat", dispId = 0x17)
    void setSoftEdgeFormat(MsoSoftEdgeType param0);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "StrikeThrough", dispId = 0x18)
    MsoTriState getStrikeThrough();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "StrikeThrough", dispId = 0x18)
    void setStrikeThrough(MsoTriState param0);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "Subscript", dispId = 0x19)
    MsoTriState getSubscript();
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "Subscript", dispId = 0x19)
    void setSubscript(MsoTriState param0);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "Superscript", dispId = 0x1a)
    MsoTriState getSuperscript();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "Superscript", dispId = 0x1a)
    void setSuperscript(MsoTriState param0);
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "WordArtformat", dispId = 0x1b)
    MsoPresetTextEffect getWordArtformat();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "WordArtformat", dispId = 0x1b)
    void setWordArtformat(MsoPresetTextEffect param0);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "Embeddable", dispId = 0x1c)
    MsoTriState getEmbeddable();
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "Embedded", dispId = 0x1d)
    MsoTriState getEmbedded();
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1e)
    String getName();
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1e)
    void setName(String param0);
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "NameAscii", dispId = 0x1f)
    String getNameAscii();
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "NameAscii", dispId = 0x1f)
    void setNameAscii(String param0);
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "NameComplexScript", dispId = 0x20)
    String getNameComplexScript();
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "NameComplexScript", dispId = 0x20)
    void setNameComplexScript(String param0);
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "NameFarEast", dispId = 0x21)
    String getNameFarEast();
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "NameFarEast", dispId = 0x21)
    void setNameFarEast(String param0);
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "NameOther", dispId = 0x22)
    String getNameOther();
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "NameOther", dispId = 0x22)
    void setNameOther(String param0);
            
    
}