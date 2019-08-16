
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020953-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020953-0000-0000-C000-000000000046}")
public interface _ParagraphFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Duplicate", dispId = 0xa)
    ParagraphFormat getDuplicate();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Style", dispId = 0x64)
    Object getStyle();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0x64)
    void setStyle(Object param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x65)
    WdParagraphAlignment getAlignment();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code WdParagraphAlignment}
     */
    @ComProperty(name = "Alignment", dispId = 0x65)
    void setAlignment(WdParagraphAlignment param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "KeepTogether", dispId = 0x66)
    Integer getKeepTogether();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "KeepTogether", dispId = 0x66)
    void setKeepTogether(Integer param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "KeepWithNext", dispId = 0x67)
    Integer getKeepWithNext();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "KeepWithNext", dispId = 0x67)
    void setKeepWithNext(Integer param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "PageBreakBefore", dispId = 0x68)
    Integer getPageBreakBefore();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PageBreakBefore", dispId = 0x68)
    void setPageBreakBefore(Integer param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "NoLineNumber", dispId = 0x69)
    Integer getNoLineNumber();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "NoLineNumber", dispId = 0x69)
    void setNoLineNumber(Integer param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "RightIndent", dispId = 0x6a)
    Float getRightIndent();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "RightIndent", dispId = 0x6a)
    void setRightIndent(Float param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "LeftIndent", dispId = 0x6b)
    Float getLeftIndent();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LeftIndent", dispId = 0x6b)
    void setLeftIndent(Float param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "FirstLineIndent", dispId = 0x6c)
    Float getFirstLineIndent();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "FirstLineIndent", dispId = 0x6c)
    void setFirstLineIndent(Float param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "LineSpacing", dispId = 0x6d)
    Float getLineSpacing();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LineSpacing", dispId = 0x6d)
    void setLineSpacing(Float param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "LineSpacingRule", dispId = 0x6e)
    WdLineSpacing getLineSpacingRule();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code WdLineSpacing}
     */
    @ComProperty(name = "LineSpacingRule", dispId = 0x6e)
    void setLineSpacingRule(WdLineSpacing param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "SpaceBefore", dispId = 0x6f)
    Float getSpaceBefore();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "SpaceBefore", dispId = 0x6f)
    void setSpaceBefore(Float param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "SpaceAfter", dispId = 0x70)
    Float getSpaceAfter();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "SpaceAfter", dispId = 0x70)
    void setSpaceAfter(Float param0);
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Hyphenation", dispId = 0x71)
    Integer getHyphenation();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Hyphenation", dispId = 0x71)
    void setHyphenation(Integer param0);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "WidowControl", dispId = 0x72)
    Integer getWidowControl();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "WidowControl", dispId = 0x72)
    void setWidowControl(Integer param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "FarEastLineBreakControl", dispId = 0x75)
    Integer getFarEastLineBreakControl();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "FarEastLineBreakControl", dispId = 0x75)
    void setFarEastLineBreakControl(Integer param0);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x76)
    Integer getWordWrap();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "WordWrap", dispId = 0x76)
    void setWordWrap(Integer param0);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "HangingPunctuation", dispId = 0x77)
    Integer getHangingPunctuation();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HangingPunctuation", dispId = 0x77)
    void setHangingPunctuation(Integer param0);
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "HalfWidthPunctuationOnTopOfLine", dispId = 0x78)
    Integer getHalfWidthPunctuationOnTopOfLine();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HalfWidthPunctuationOnTopOfLine", dispId = 0x78)
    void setHalfWidthPunctuationOnTopOfLine(Integer param0);
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "AddSpaceBetweenFarEastAndAlpha", dispId = 0x79)
    Integer getAddSpaceBetweenFarEastAndAlpha();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AddSpaceBetweenFarEastAndAlpha", dispId = 0x79)
    void setAddSpaceBetweenFarEastAndAlpha(Integer param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "AddSpaceBetweenFarEastAndDigit", dispId = 0x7a)
    Integer getAddSpaceBetweenFarEastAndDigit();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AddSpaceBetweenFarEastAndDigit", dispId = 0x7a)
    void setAddSpaceBetweenFarEastAndDigit(Integer param0);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "BaseLineAlignment", dispId = 0x7b)
    WdBaselineAlignment getBaseLineAlignment();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code WdBaselineAlignment}
     */
    @ComProperty(name = "BaseLineAlignment", dispId = 0x7b)
    void setBaseLineAlignment(WdBaselineAlignment param0);
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "AutoAdjustRightIndent", dispId = 0x7c)
    Integer getAutoAdjustRightIndent();
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AutoAdjustRightIndent", dispId = 0x7c)
    void setAutoAdjustRightIndent(Integer param0);
            
    /**
     * <p>id(0x7d)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "DisableLineHeightGrid", dispId = 0x7d)
    Integer getDisableLineHeightGrid();
            
    /**
     * <p>id(0x7d)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DisableLineHeightGrid", dispId = 0x7d)
    void setDisableLineHeightGrid(Integer param0);
            
    /**
     * <p>id(0x44f)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "TabStops", dispId = 0x44f)
    TabStops getTabStops();
            
    /**
     * <p>id(0x44f)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code TabStops}
     */
    @ComProperty(name = "TabStops", dispId = 0x44f)
    void setTabStops(TabStops param0);
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x44d)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x44d)
    Shading getShading();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "OutlineLevel", dispId = 0xca)
    WdOutlineLevel getOutlineLevel();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code WdOutlineLevel}
     */
    @ComProperty(name = "OutlineLevel", dispId = 0xca)
    void setOutlineLevel(WdOutlineLevel param0);
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(66)</p>
     */
    @ComMethod(name = "CloseUp", dispId = 0x12d)
    void CloseUp();
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(67)</p>
     */
    @ComMethod(name = "OpenUp", dispId = 0x12e)
    void OpenUp();
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(68)</p>
     */
    @ComMethod(name = "OpenOrCloseUp", dispId = 0x12f)
    void OpenOrCloseUp();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(69)</p>
     * @param Count [in] {@code Short}
     */
    @ComMethod(name = "TabHangingIndent", dispId = 0x130)
    void TabHangingIndent(Short Count);
            
    /**
     * <p>id(0x132)</p>
     * <p>vtableId(70)</p>
     * @param Count [in] {@code Short}
     */
    @ComMethod(name = "TabIndent", dispId = 0x132)
    void TabIndent(Short Count);
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(71)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x138)
    void Reset();
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(72)</p>
     */
    @ComMethod(name = "Space1", dispId = 0x139)
    void Space1();
            
    /**
     * <p>id(0x13a)</p>
     * <p>vtableId(73)</p>
     */
    @ComMethod(name = "Space15", dispId = 0x13a)
    void Space15();
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(74)</p>
     */
    @ComMethod(name = "Space2", dispId = 0x13b)
    void Space2();
            
    /**
     * <p>id(0x140)</p>
     * <p>vtableId(75)</p>
     * @param Count [in] {@code Short}
     */
    @ComMethod(name = "IndentCharWidth", dispId = 0x140)
    void IndentCharWidth(Short Count);
            
    /**
     * <p>id(0x142)</p>
     * <p>vtableId(76)</p>
     * @param Count [in] {@code Short}
     */
    @ComMethod(name = "IndentFirstLineCharWidth", dispId = 0x142)
    void IndentFirstLineCharWidth(Short Count);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "CharacterUnitRightIndent", dispId = 0x7e)
    Float getCharacterUnitRightIndent();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CharacterUnitRightIndent", dispId = 0x7e)
    void setCharacterUnitRightIndent(Float param0);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "CharacterUnitLeftIndent", dispId = 0x7f)
    Float getCharacterUnitLeftIndent();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CharacterUnitLeftIndent", dispId = 0x7f)
    void setCharacterUnitLeftIndent(Float param0);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "CharacterUnitFirstLineIndent", dispId = 0x80)
    Float getCharacterUnitFirstLineIndent();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CharacterUnitFirstLineIndent", dispId = 0x80)
    void setCharacterUnitFirstLineIndent(Float param0);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "LineUnitBefore", dispId = 0x81)
    Float getLineUnitBefore();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LineUnitBefore", dispId = 0x81)
    void setLineUnitBefore(Float param0);
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "LineUnitAfter", dispId = 0x82)
    Float getLineUnitAfter();
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LineUnitAfter", dispId = 0x82)
    void setLineUnitAfter(Float param0);
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x83)
    WdReadingOrder getReadingOrder();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code WdReadingOrder}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x83)
    void setReadingOrder(WdReadingOrder param0);
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "SpaceBeforeAuto", dispId = 0x84)
    Integer getSpaceBeforeAuto();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SpaceBeforeAuto", dispId = 0x84)
    void setSpaceBeforeAuto(Integer param0);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "SpaceAfterAuto", dispId = 0x85)
    Integer getSpaceAfterAuto();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SpaceAfterAuto", dispId = 0x85)
    void setSpaceAfterAuto(Integer param0);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "MirrorIndents", dispId = 0x86)
    Integer getMirrorIndents();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MirrorIndents", dispId = 0x86)
    void setMirrorIndents(Integer param0);
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "TextboxTightWrap", dispId = 0x87)
    WdTextboxTightWrap getTextboxTightWrap();
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(96)</p>
     * @param param0 [in] {@code WdTextboxTightWrap}
     */
    @ComProperty(name = "TextboxTightWrap", dispId = 0x87)
    void setTextboxTightWrap(WdTextboxTightWrap param0);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "CollapsedByDefault", dispId = 0x88)
    Integer getCollapsedByDefault();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CollapsedByDefault", dispId = 0x88)
    void setCollapsedByDefault(Integer param0);
            
    
}