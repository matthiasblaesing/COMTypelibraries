
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x2)
    MsoTriState getBold();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "Bold", dispId = 0x2)
    void setBold(MsoTriState param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x3)
    MsoTriState getItalic();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "Italic", dispId = 0x3)
    void setItalic(MsoTriState param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Strike", dispId = 0x4)
    MsoTextStrike getStrike();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code MsoTextStrike}
     */
    @ComProperty(name = "Strike", dispId = 0x4)
    void setStrike(MsoTextStrike param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Caps", dispId = 0x5)
    MsoTextCaps getCaps();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code MsoTextCaps}
     */
    @ComProperty(name = "Caps", dispId = 0x5)
    void setCaps(MsoTextCaps param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "AutorotateNumbers", dispId = 0x6)
    MsoTriState getAutorotateNumbers();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "AutorotateNumbers", dispId = 0x6)
    void setAutorotateNumbers(MsoTriState param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "BaselineOffset", dispId = 0x7)
    Float getBaselineOffset();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BaselineOffset", dispId = 0x7)
    void setBaselineOffset(Float param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Kerning", dispId = 0x8)
    Float getKerning();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Kerning", dispId = 0x8)
    void setKerning(Float param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Size", dispId = 0x9)
    Float getSize();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Size", dispId = 0x9)
    void setSize(Float param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Spacing", dispId = 0xa)
    Float getSpacing();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Spacing", dispId = 0xa)
    void setSpacing(Float param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "UnderlineStyle", dispId = 0xb)
    MsoTextUnderlineType getUnderlineStyle();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code MsoTextUnderlineType}
     */
    @ComProperty(name = "UnderlineStyle", dispId = 0xb)
    void setUnderlineStyle(MsoTextUnderlineType param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Allcaps", dispId = 0xc)
    MsoTriState getAllcaps();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "Allcaps", dispId = 0xc)
    void setAllcaps(MsoTriState param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "DoubleStrikeThrough", dispId = 0xd)
    MsoTriState getDoubleStrikeThrough();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "DoubleStrikeThrough", dispId = 0xd)
    void setDoubleStrikeThrough(MsoTriState param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Equalize", dispId = 0xe)
    MsoTriState getEqualize();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "Equalize", dispId = 0xe)
    void setEqualize(MsoTriState param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Fill", dispId = 0xf)
    FillFormat getFill();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Glow", dispId = 0x10)
    GlowFormat getGlow();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Reflection", dispId = 0x11)
    ReflectionFormat getReflection();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Line", dispId = 0x12)
    LineFormat getLine();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x13)
    ShadowFormat getShadow();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Highlight", dispId = 0x14)
    ColorFormat getHighlight();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "UnderlineColor", dispId = 0x15)
    ColorFormat getUnderlineColor();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "Smallcaps", dispId = 0x16)
    MsoTriState getSmallcaps();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "Smallcaps", dispId = 0x16)
    void setSmallcaps(MsoTriState param0);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "SoftEdgeFormat", dispId = 0x17)
    MsoSoftEdgeType getSoftEdgeFormat();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code MsoSoftEdgeType}
     */
    @ComProperty(name = "SoftEdgeFormat", dispId = 0x17)
    void setSoftEdgeFormat(MsoSoftEdgeType param0);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "StrikeThrough", dispId = 0x18)
    MsoTriState getStrikeThrough();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "StrikeThrough", dispId = 0x18)
    void setStrikeThrough(MsoTriState param0);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "Subscript", dispId = 0x19)
    MsoTriState getSubscript();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "Subscript", dispId = 0x19)
    void setSubscript(MsoTriState param0);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "Superscript", dispId = 0x1a)
    MsoTriState getSuperscript();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "Superscript", dispId = 0x1a)
    void setSuperscript(MsoTriState param0);
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "WordArtformat", dispId = 0x1b)
    MsoPresetTextEffect getWordArtformat();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code MsoPresetTextEffect}
     */
    @ComProperty(name = "WordArtformat", dispId = 0x1b)
    void setWordArtformat(MsoPresetTextEffect param0);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "Embeddable", dispId = 0x1c)
    MsoTriState getEmbeddable();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "Embedded", dispId = 0x1d)
    MsoTriState getEmbedded();
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1e)
    String getName();
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x1e)
    void setName(String param0);
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "NameAscii", dispId = 0x1f)
    String getNameAscii();
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NameAscii", dispId = 0x1f)
    void setNameAscii(String param0);
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "NameComplexScript", dispId = 0x20)
    String getNameComplexScript();
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NameComplexScript", dispId = 0x20)
    void setNameComplexScript(String param0);
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "NameFarEast", dispId = 0x21)
    String getNameFarEast();
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NameFarEast", dispId = 0x21)
    void setNameFarEast(String param0);
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "NameOther", dispId = 0x22)
    String getNameOther();
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NameOther", dispId = 0x22)
    void setNameOther(String param0);
            
    
}