
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020958-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020958-0000-0000-C000-000000000046}")
public interface Paragraphs {
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "First", dispId = 0x3)
    Paragraph getFirst();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Last", dispId = 0x4)
    Paragraph getLast();
            
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
     * <p>id(0x44e)</p>
     */
    @ComProperty(name = "Format", dispId = 0x44e)
    ParagraphFormat getFormat();
            
    /**
     * <p>id(0x44e)</p>
     */
    @ComProperty(name = "Format", dispId = 0x44e)
    void setFormat(ParagraphFormat param0);
            
    /**
     * <p>id(0x44f)</p>
     */
    @ComProperty(name = "TabStops", dispId = 0x44f)
    TabStops getTabStops();
            
    /**
     * <p>id(0x44f)</p>
     */
    @ComProperty(name = "TabStops", dispId = 0x44f)
    void setTabStops(TabStops param0);
            
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
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Style", dispId = 0x64)
    Object getStyle();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Style", dispId = 0x64)
    void setStyle(Object param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x65)
    WdParagraphAlignment getAlignment();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x65)
    void setAlignment(WdParagraphAlignment param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "KeepTogether", dispId = 0x66)
    Integer getKeepTogether();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "KeepTogether", dispId = 0x66)
    void setKeepTogether(Integer param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "KeepWithNext", dispId = 0x67)
    Integer getKeepWithNext();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "KeepWithNext", dispId = 0x67)
    void setKeepWithNext(Integer param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "PageBreakBefore", dispId = 0x68)
    Integer getPageBreakBefore();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "PageBreakBefore", dispId = 0x68)
    void setPageBreakBefore(Integer param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "NoLineNumber", dispId = 0x69)
    Integer getNoLineNumber();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "NoLineNumber", dispId = 0x69)
    void setNoLineNumber(Integer param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "RightIndent", dispId = 0x6a)
    Float getRightIndent();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "RightIndent", dispId = 0x6a)
    void setRightIndent(Float param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "LeftIndent", dispId = 0x6b)
    Float getLeftIndent();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "LeftIndent", dispId = 0x6b)
    void setLeftIndent(Float param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "FirstLineIndent", dispId = 0x6c)
    Float getFirstLineIndent();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "FirstLineIndent", dispId = 0x6c)
    void setFirstLineIndent(Float param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "LineSpacing", dispId = 0x6d)
    Float getLineSpacing();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "LineSpacing", dispId = 0x6d)
    void setLineSpacing(Float param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "LineSpacingRule", dispId = 0x6e)
    WdLineSpacing getLineSpacingRule();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "LineSpacingRule", dispId = 0x6e)
    void setLineSpacingRule(WdLineSpacing param0);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "SpaceBefore", dispId = 0x6f)
    Float getSpaceBefore();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "SpaceBefore", dispId = 0x6f)
    void setSpaceBefore(Float param0);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "SpaceAfter", dispId = 0x70)
    Float getSpaceAfter();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "SpaceAfter", dispId = 0x70)
    void setSpaceAfter(Float param0);
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "Hyphenation", dispId = 0x71)
    Integer getHyphenation();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "Hyphenation", dispId = 0x71)
    void setHyphenation(Integer param0);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "WidowControl", dispId = 0x72)
    Integer getWidowControl();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "WidowControl", dispId = 0x72)
    void setWidowControl(Integer param0);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x74)
    Shading getShading();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "FarEastLineBreakControl", dispId = 0x75)
    Integer getFarEastLineBreakControl();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "FarEastLineBreakControl", dispId = 0x75)
    void setFarEastLineBreakControl(Integer param0);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x76)
    Integer getWordWrap();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x76)
    void setWordWrap(Integer param0);
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "HangingPunctuation", dispId = 0x77)
    Integer getHangingPunctuation();
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "HangingPunctuation", dispId = 0x77)
    void setHangingPunctuation(Integer param0);
            
    /**
     * <p>id(0x78)</p>
     */
    @ComProperty(name = "HalfWidthPunctuationOnTopOfLine", dispId = 0x78)
    Integer getHalfWidthPunctuationOnTopOfLine();
            
    /**
     * <p>id(0x78)</p>
     */
    @ComProperty(name = "HalfWidthPunctuationOnTopOfLine", dispId = 0x78)
    void setHalfWidthPunctuationOnTopOfLine(Integer param0);
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "AddSpaceBetweenFarEastAndAlpha", dispId = 0x79)
    Integer getAddSpaceBetweenFarEastAndAlpha();
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "AddSpaceBetweenFarEastAndAlpha", dispId = 0x79)
    void setAddSpaceBetweenFarEastAndAlpha(Integer param0);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "AddSpaceBetweenFarEastAndDigit", dispId = 0x7a)
    Integer getAddSpaceBetweenFarEastAndDigit();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "AddSpaceBetweenFarEastAndDigit", dispId = 0x7a)
    void setAddSpaceBetweenFarEastAndDigit(Integer param0);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "BaseLineAlignment", dispId = 0x7b)
    WdBaselineAlignment getBaseLineAlignment();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "BaseLineAlignment", dispId = 0x7b)
    void setBaseLineAlignment(WdBaselineAlignment param0);
            
    /**
     * <p>id(0x7c)</p>
     */
    @ComProperty(name = "AutoAdjustRightIndent", dispId = 0x7c)
    Integer getAutoAdjustRightIndent();
            
    /**
     * <p>id(0x7c)</p>
     */
    @ComProperty(name = "AutoAdjustRightIndent", dispId = 0x7c)
    void setAutoAdjustRightIndent(Integer param0);
            
    /**
     * <p>id(0x7d)</p>
     */
    @ComProperty(name = "DisableLineHeightGrid", dispId = 0x7d)
    Integer getDisableLineHeightGrid();
            
    /**
     * <p>id(0x7d)</p>
     */
    @ComProperty(name = "DisableLineHeightGrid", dispId = 0x7d)
    void setDisableLineHeightGrid(Integer param0);
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "OutlineLevel", dispId = 0xca)
    WdOutlineLevel getOutlineLevel();
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "OutlineLevel", dispId = 0xca)
    void setOutlineLevel(WdOutlineLevel param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Paragraph Item(Integer Index);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Add", dispId = 0x5)
    Paragraph Add(Object Range);
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComMethod(name = "CloseUp", dispId = 0x12d)
    void CloseUp();
            
    /**
     * <p>id(0x12e)</p>
     */
    @ComMethod(name = "OpenUp", dispId = 0x12e)
    void OpenUp();
            
    /**
     * <p>id(0x12f)</p>
     */
    @ComMethod(name = "OpenOrCloseUp", dispId = 0x12f)
    void OpenOrCloseUp();
            
    /**
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "TabHangingIndent", dispId = 0x130)
    void TabHangingIndent(Short Count);
            
    /**
     * <p>id(0x132)</p>
     */
    @ComMethod(name = "TabIndent", dispId = 0x132)
    void TabIndent(Short Count);
            
    /**
     * <p>id(0x138)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x138)
    void Reset();
            
    /**
     * <p>id(0x139)</p>
     */
    @ComMethod(name = "Space1", dispId = 0x139)
    void Space1();
            
    /**
     * <p>id(0x13a)</p>
     */
    @ComMethod(name = "Space15", dispId = 0x13a)
    void Space15();
            
    /**
     * <p>id(0x13b)</p>
     */
    @ComMethod(name = "Space2", dispId = 0x13b)
    void Space2();
            
    /**
     * <p>id(0x140)</p>
     */
    @ComMethod(name = "IndentCharWidth", dispId = 0x140)
    void IndentCharWidth(Short Count);
            
    /**
     * <p>id(0x142)</p>
     */
    @ComMethod(name = "IndentFirstLineCharWidth", dispId = 0x142)
    void IndentFirstLineCharWidth(Short Count);
            
    /**
     * <p>id(0x144)</p>
     */
    @ComMethod(name = "OutlinePromote", dispId = 0x144)
    void OutlinePromote();
            
    /**
     * <p>id(0x145)</p>
     */
    @ComMethod(name = "OutlineDemote", dispId = 0x145)
    void OutlineDemote();
            
    /**
     * <p>id(0x146)</p>
     */
    @ComMethod(name = "OutlineDemoteToBody", dispId = 0x146)
    void OutlineDemoteToBody();
            
    /**
     * <p>id(0x14d)</p>
     */
    @ComMethod(name = "Indent", dispId = 0x14d)
    void Indent();
            
    /**
     * <p>id(0x14e)</p>
     */
    @ComMethod(name = "Outdent", dispId = 0x14e)
    void Outdent();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "CharacterUnitRightIndent", dispId = 0x7e)
    Float getCharacterUnitRightIndent();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "CharacterUnitRightIndent", dispId = 0x7e)
    void setCharacterUnitRightIndent(Float param0);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "CharacterUnitLeftIndent", dispId = 0x7f)
    Float getCharacterUnitLeftIndent();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "CharacterUnitLeftIndent", dispId = 0x7f)
    void setCharacterUnitLeftIndent(Float param0);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "CharacterUnitFirstLineIndent", dispId = 0x80)
    Float getCharacterUnitFirstLineIndent();
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "CharacterUnitFirstLineIndent", dispId = 0x80)
    void setCharacterUnitFirstLineIndent(Float param0);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "LineUnitBefore", dispId = 0x81)
    Float getLineUnitBefore();
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "LineUnitBefore", dispId = 0x81)
    void setLineUnitBefore(Float param0);
            
    /**
     * <p>id(0x82)</p>
     */
    @ComProperty(name = "LineUnitAfter", dispId = 0x82)
    Float getLineUnitAfter();
            
    /**
     * <p>id(0x82)</p>
     */
    @ComProperty(name = "LineUnitAfter", dispId = 0x82)
    void setLineUnitAfter(Float param0);
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x83)
    WdReadingOrder getReadingOrder();
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x83)
    void setReadingOrder(WdReadingOrder param0);
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "SpaceBeforeAuto", dispId = 0x84)
    Integer getSpaceBeforeAuto();
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "SpaceBeforeAuto", dispId = 0x84)
    void setSpaceBeforeAuto(Integer param0);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "SpaceAfterAuto", dispId = 0x85)
    Integer getSpaceAfterAuto();
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "SpaceAfterAuto", dispId = 0x85)
    void setSpaceAfterAuto(Integer param0);
            
    /**
     * <p>id(0x14f)</p>
     */
    @ComMethod(name = "IncreaseSpacing", dispId = 0x14f)
    void IncreaseSpacing();
            
    /**
     * <p>id(0x150)</p>
     */
    @ComMethod(name = "DecreaseSpacing", dispId = 0x150)
    void DecreaseSpacing();
            
    
}