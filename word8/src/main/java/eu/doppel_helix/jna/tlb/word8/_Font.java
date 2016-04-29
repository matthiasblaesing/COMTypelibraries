
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020952-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020952-0000-0000-C000-000000000046}")
public interface _Font {
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
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Duplicate", dispId = 0xa)
    Font getDuplicate();
            
    /**
     * <p>id(0x82)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x82)
    Integer getBold();
            
    /**
     * <p>id(0x82)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x82)
    void setBold(Integer param0);
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x83)
    Integer getItalic();
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x83)
    void setItalic(Integer param0);
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x84)
    Integer getHidden();
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x84)
    void setHidden(Integer param0);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "SmallCaps", dispId = 0x85)
    Integer getSmallCaps();
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "SmallCaps", dispId = 0x85)
    void setSmallCaps(Integer param0);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "AllCaps", dispId = 0x86)
    Integer getAllCaps();
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "AllCaps", dispId = 0x86)
    void setAllCaps(Integer param0);
            
    /**
     * <p>id(0x87)</p>
     */
    @ComProperty(name = "StrikeThrough", dispId = 0x87)
    Integer getStrikeThrough();
            
    /**
     * <p>id(0x87)</p>
     */
    @ComProperty(name = "StrikeThrough", dispId = 0x87)
    void setStrikeThrough(Integer param0);
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "DoubleStrikeThrough", dispId = 0x88)
    Integer getDoubleStrikeThrough();
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "DoubleStrikeThrough", dispId = 0x88)
    void setDoubleStrikeThrough(Integer param0);
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x89)
    WdColorIndex getColorIndex();
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x89)
    void setColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Subscript", dispId = 0x8a)
    Integer getSubscript();
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Subscript", dispId = 0x8a)
    void setSubscript(Integer param0);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Superscript", dispId = 0x8b)
    Integer getSuperscript();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Superscript", dispId = 0x8b)
    void setSuperscript(Integer param0);
            
    /**
     * <p>id(0x8c)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x8c)
    WdUnderline getUnderline();
            
    /**
     * <p>id(0x8c)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x8c)
    void setUnderline(WdUnderline param0);
            
    /**
     * <p>id(0x8d)</p>
     */
    @ComProperty(name = "Size", dispId = 0x8d)
    Float getSize();
            
    /**
     * <p>id(0x8d)</p>
     */
    @ComProperty(name = "Size", dispId = 0x8d)
    void setSize(Float param0);
            
    /**
     * <p>id(0x8e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x8e)
    String getName();
            
    /**
     * <p>id(0x8e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x8e)
    void setName(String param0);
            
    /**
     * <p>id(0x8f)</p>
     */
    @ComProperty(name = "Position", dispId = 0x8f)
    Integer getPosition();
            
    /**
     * <p>id(0x8f)</p>
     */
    @ComProperty(name = "Position", dispId = 0x8f)
    void setPosition(Integer param0);
            
    /**
     * <p>id(0x90)</p>
     */
    @ComProperty(name = "Spacing", dispId = 0x90)
    Float getSpacing();
            
    /**
     * <p>id(0x90)</p>
     */
    @ComProperty(name = "Spacing", dispId = 0x90)
    void setSpacing(Float param0);
            
    /**
     * <p>id(0x91)</p>
     */
    @ComProperty(name = "Scaling", dispId = 0x91)
    Integer getScaling();
            
    /**
     * <p>id(0x91)</p>
     */
    @ComProperty(name = "Scaling", dispId = 0x91)
    void setScaling(Integer param0);
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x92)
    Integer getShadow();
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x92)
    void setShadow(Integer param0);
            
    /**
     * <p>id(0x93)</p>
     */
    @ComProperty(name = "Outline", dispId = 0x93)
    Integer getOutline();
            
    /**
     * <p>id(0x93)</p>
     */
    @ComProperty(name = "Outline", dispId = 0x93)
    void setOutline(Integer param0);
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Emboss", dispId = 0x94)
    Integer getEmboss();
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Emboss", dispId = 0x94)
    void setEmboss(Integer param0);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Kerning", dispId = 0x95)
    Float getKerning();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Kerning", dispId = 0x95)
    void setKerning(Float param0);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Engrave", dispId = 0x96)
    Integer getEngrave();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Engrave", dispId = 0x96)
    void setEngrave(Integer param0);
            
    /**
     * <p>id(0x97)</p>
     */
    @ComProperty(name = "Animation", dispId = 0x97)
    WdAnimation getAnimation();
            
    /**
     * <p>id(0x97)</p>
     */
    @ComProperty(name = "Animation", dispId = 0x97)
    void setAnimation(WdAnimation param0);
            
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
     * <p>id(0x99)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x99)
    Shading getShading();
            
    /**
     * <p>id(0x9a)</p>
     */
    @ComProperty(name = "EmphasisMark", dispId = 0x9a)
    WdEmphasisMark getEmphasisMark();
            
    /**
     * <p>id(0x9a)</p>
     */
    @ComProperty(name = "EmphasisMark", dispId = 0x9a)
    void setEmphasisMark(WdEmphasisMark param0);
            
    /**
     * <p>id(0x9b)</p>
     */
    @ComProperty(name = "DisableCharacterSpaceGrid", dispId = 0x9b)
    Boolean getDisableCharacterSpaceGrid();
            
    /**
     * <p>id(0x9b)</p>
     */
    @ComProperty(name = "DisableCharacterSpaceGrid", dispId = 0x9b)
    void setDisableCharacterSpaceGrid(Boolean param0);
            
    /**
     * <p>id(0x9c)</p>
     */
    @ComProperty(name = "NameFarEast", dispId = 0x9c)
    String getNameFarEast();
            
    /**
     * <p>id(0x9c)</p>
     */
    @ComProperty(name = "NameFarEast", dispId = 0x9c)
    void setNameFarEast(String param0);
            
    /**
     * <p>id(0x9d)</p>
     */
    @ComProperty(name = "NameAscii", dispId = 0x9d)
    String getNameAscii();
            
    /**
     * <p>id(0x9d)</p>
     */
    @ComProperty(name = "NameAscii", dispId = 0x9d)
    void setNameAscii(String param0);
            
    /**
     * <p>id(0x9e)</p>
     */
    @ComProperty(name = "NameOther", dispId = 0x9e)
    String getNameOther();
            
    /**
     * <p>id(0x9e)</p>
     */
    @ComProperty(name = "NameOther", dispId = 0x9e)
    void setNameOther(String param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Grow", dispId = 0x64)
    void Grow();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Shrink", dispId = 0x65)
    void Shrink();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x66)
    void Reset();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "SetAsTemplateDefault", dispId = 0x67)
    void SetAsTemplateDefault();
            
    /**
     * <p>id(0x9f)</p>
     */
    @ComProperty(name = "Color", dispId = 0x9f)
    WdColor getColor();
            
    /**
     * <p>id(0x9f)</p>
     */
    @ComProperty(name = "Color", dispId = 0x9f)
    void setColor(WdColor param0);
            
    /**
     * <p>id(0xa0)</p>
     */
    @ComProperty(name = "BoldBi", dispId = 0xa0)
    Integer getBoldBi();
            
    /**
     * <p>id(0xa0)</p>
     */
    @ComProperty(name = "BoldBi", dispId = 0xa0)
    void setBoldBi(Integer param0);
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComProperty(name = "ItalicBi", dispId = 0xa1)
    Integer getItalicBi();
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComProperty(name = "ItalicBi", dispId = 0xa1)
    void setItalicBi(Integer param0);
            
    /**
     * <p>id(0xa2)</p>
     */
    @ComProperty(name = "SizeBi", dispId = 0xa2)
    Float getSizeBi();
            
    /**
     * <p>id(0xa2)</p>
     */
    @ComProperty(name = "SizeBi", dispId = 0xa2)
    void setSizeBi(Float param0);
            
    /**
     * <p>id(0xa3)</p>
     */
    @ComProperty(name = "NameBi", dispId = 0xa3)
    String getNameBi();
            
    /**
     * <p>id(0xa3)</p>
     */
    @ComProperty(name = "NameBi", dispId = 0xa3)
    void setNameBi(String param0);
            
    /**
     * <p>id(0xa4)</p>
     */
    @ComProperty(name = "ColorIndexBi", dispId = 0xa4)
    WdColorIndex getColorIndexBi();
            
    /**
     * <p>id(0xa4)</p>
     */
    @ComProperty(name = "ColorIndexBi", dispId = 0xa4)
    void setColorIndexBi(WdColorIndex param0);
            
    /**
     * <p>id(0xa5)</p>
     */
    @ComProperty(name = "DiacriticColor", dispId = 0xa5)
    WdColor getDiacriticColor();
            
    /**
     * <p>id(0xa5)</p>
     */
    @ComProperty(name = "DiacriticColor", dispId = 0xa5)
    void setDiacriticColor(WdColor param0);
            
    /**
     * <p>id(0xa6)</p>
     */
    @ComProperty(name = "UnderlineColor", dispId = 0xa6)
    WdColor getUnderlineColor();
            
    /**
     * <p>id(0xa6)</p>
     */
    @ComProperty(name = "UnderlineColor", dispId = 0xa6)
    void setUnderlineColor(WdColor param0);
            
    /**
     * <p>id(0xa7)</p>
     */
    @ComProperty(name = "Glow", dispId = 0xa7)
    GlowFormat getGlow();
            
    /**
     * <p>id(0xa7)</p>
     */
    @ComProperty(name = "Glow", dispId = 0xa7)
    void setGlow(GlowFormat param0);
            
    /**
     * <p>id(0xa8)</p>
     */
    @ComProperty(name = "Reflection", dispId = 0xa8)
    ReflectionFormat getReflection();
            
    /**
     * <p>id(0xa8)</p>
     */
    @ComProperty(name = "Reflection", dispId = 0xa8)
    void setReflection(ReflectionFormat param0);
            
    /**
     * <p>id(0xa9)</p>
     */
    @ComProperty(name = "TextShadow", dispId = 0xa9)
    ShadowFormat getTextShadow();
            
    /**
     * <p>id(0xa9)</p>
     */
    @ComProperty(name = "TextShadow", dispId = 0xa9)
    void setTextShadow(ShadowFormat param0);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Fill", dispId = 0xaa)
    FillFormat getFill();
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Fill", dispId = 0xaa)
    void setFill(FillFormat param0);
            
    /**
     * <p>id(0xab)</p>
     */
    @ComProperty(name = "Line", dispId = 0xab)
    LineFormat getLine();
            
    /**
     * <p>id(0xab)</p>
     */
    @ComProperty(name = "Line", dispId = 0xab)
    void setLine(LineFormat param0);
            
    /**
     * <p>id(0xac)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0xac)
    ThreeDFormat getThreeD();
            
    /**
     * <p>id(0xac)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0xac)
    void setThreeD(ThreeDFormat param0);
            
    /**
     * <p>id(0xad)</p>
     */
    @ComProperty(name = "TextColor", dispId = 0xad)
    ColorFormat getTextColor();
            
    /**
     * <p>id(0xae)</p>
     */
    @ComProperty(name = "Ligatures", dispId = 0xae)
    WdLigatures getLigatures();
            
    /**
     * <p>id(0xae)</p>
     */
    @ComProperty(name = "Ligatures", dispId = 0xae)
    void setLigatures(WdLigatures param0);
            
    /**
     * <p>id(0xaf)</p>
     */
    @ComProperty(name = "NumberForm", dispId = 0xaf)
    WdNumberForm getNumberForm();
            
    /**
     * <p>id(0xaf)</p>
     */
    @ComProperty(name = "NumberForm", dispId = 0xaf)
    void setNumberForm(WdNumberForm param0);
            
    /**
     * <p>id(0xb0)</p>
     */
    @ComProperty(name = "NumberSpacing", dispId = 0xb0)
    WdNumberSpacing getNumberSpacing();
            
    /**
     * <p>id(0xb0)</p>
     */
    @ComProperty(name = "NumberSpacing", dispId = 0xb0)
    void setNumberSpacing(WdNumberSpacing param0);
            
    /**
     * <p>id(0xb1)</p>
     */
    @ComProperty(name = "ContextualAlternates", dispId = 0xb1)
    Integer getContextualAlternates();
            
    /**
     * <p>id(0xb1)</p>
     */
    @ComProperty(name = "ContextualAlternates", dispId = 0xb1)
    void setContextualAlternates(Integer param0);
            
    /**
     * <p>id(0xb2)</p>
     */
    @ComProperty(name = "StylisticSet", dispId = 0xb2)
    WdStylisticSet getStylisticSet();
            
    /**
     * <p>id(0xb2)</p>
     */
    @ComProperty(name = "StylisticSet", dispId = 0xb2)
    void setStylisticSet(WdStylisticSet param0);
            
    
}