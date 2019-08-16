
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209B0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209B0-0000-0000-C000-000000000046}")
public interface Find extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Forward", dispId = 0xa)
    Boolean getForward();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Forward", dispId = 0xa)
    void setForward(Boolean param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Font", dispId = 0xb)
    Font getFont();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Font}
     */
    @ComProperty(name = "Font", dispId = 0xb)
    void setFont(Font param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Found", dispId = 0xc)
    Boolean getFound();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "MatchAllWordForms", dispId = 0xd)
    Boolean getMatchAllWordForms();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchAllWordForms", dispId = 0xd)
    void setMatchAllWordForms(Boolean param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "MatchCase", dispId = 0xe)
    Boolean getMatchCase();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchCase", dispId = 0xe)
    void setMatchCase(Boolean param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "MatchWildcards", dispId = 0xf)
    Boolean getMatchWildcards();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchWildcards", dispId = 0xf)
    void setMatchWildcards(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "MatchSoundsLike", dispId = 0x10)
    Boolean getMatchSoundsLike();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchSoundsLike", dispId = 0x10)
    void setMatchSoundsLike(Boolean param0);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "MatchWholeWord", dispId = 0x11)
    Boolean getMatchWholeWord();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchWholeWord", dispId = 0x11)
    void setMatchWholeWord(Boolean param0);
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "MatchFuzzy", dispId = 0x28)
    Boolean getMatchFuzzy();
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzy", dispId = 0x28)
    void setMatchFuzzy(Boolean param0);
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "MatchByte", dispId = 0x29)
    Boolean getMatchByte();
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchByte", dispId = 0x29)
    void setMatchByte(Boolean param0);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0x12)
    ParagraphFormat getParagraphFormat();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code ParagraphFormat}
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0x12)
    void setParagraphFormat(ParagraphFormat param0);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Style", dispId = 0x13)
    Object getStyle();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0x13)
    void setStyle(Object param0);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Text", dispId = 0x16)
    String getText();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x16)
    void setText(String param0);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x17)
    WdLanguageID getLanguageID();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageID", dispId = 0x17)
    void setLanguageID(WdLanguageID param0);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Highlight", dispId = 0x18)
    Integer getHighlight();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Highlight", dispId = 0x18)
    void setHighlight(Integer param0);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Replacement", dispId = 0x19)
    Replacement getReplacement();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "Frame", dispId = 0x1a)
    Frame getFrame();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Wrap", dispId = 0x1b)
    WdFindWrap getWrap();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code WdFindWrap}
     */
    @ComProperty(name = "Wrap", dispId = 0x1b)
    void setWrap(WdFindWrap param0);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "Format", dispId = 0x1c)
    Boolean getFormat();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Format", dispId = 0x1c)
    void setFormat(Boolean param0);
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x1d)
    WdLanguageID getLanguageIDFarEast();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x1d)
    void setLanguageIDFarEast(WdLanguageID param0);
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "LanguageIDOther", dispId = 0x3c)
    WdLanguageID getLanguageIDOther();
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageIDOther", dispId = 0x3c)
    void setLanguageIDOther(WdLanguageID param0);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "CorrectHangulEndings", dispId = 0x3d)
    Boolean getCorrectHangulEndings();
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CorrectHangulEndings", dispId = 0x3d)
    void setCorrectHangulEndings(Boolean param0);
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(51)</p>
     * @param FindText [in, optional] {@code Object}
     * @param MatchCase [in, optional] {@code Object}
     * @param MatchWholeWord [in, optional] {@code Object}
     * @param MatchWildcards [in, optional] {@code Object}
     * @param MatchSoundsLike [in, optional] {@code Object}
     * @param MatchAllWordForms [in, optional] {@code Object}
     * @param Forward [in, optional] {@code Object}
     * @param Wrap [in, optional] {@code Object}
     * @param Format [in, optional] {@code Object}
     * @param ReplaceWith [in, optional] {@code Object}
     * @param Replace [in, optional] {@code Object}
     */
    @ComMethod(name = "ExecuteOld", dispId = 0x1e)
    Boolean ExecuteOld(Object FindText,
            Object MatchCase,
            Object MatchWholeWord,
            Object MatchWildcards,
            Object MatchSoundsLike,
            Object MatchAllWordForms,
            Object Forward,
            Object Wrap,
            Object Format,
            Object ReplaceWith,
            Object Replace);
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(52)</p>
     */
    @ComMethod(name = "ClearFormatting", dispId = 0x1f)
    void ClearFormatting();
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(53)</p>
     */
    @ComMethod(name = "SetAllFuzzyOptions", dispId = 0x20)
    void SetAllFuzzyOptions();
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(54)</p>
     */
    @ComMethod(name = "ClearAllFuzzyOptions", dispId = 0x21)
    void ClearAllFuzzyOptions();
            
    /**
     * <p>id(0x1bc)</p>
     * <p>vtableId(55)</p>
     * @param FindText [in, optional] {@code Object}
     * @param MatchCase [in, optional] {@code Object}
     * @param MatchWholeWord [in, optional] {@code Object}
     * @param MatchWildcards [in, optional] {@code Object}
     * @param MatchSoundsLike [in, optional] {@code Object}
     * @param MatchAllWordForms [in, optional] {@code Object}
     * @param Forward [in, optional] {@code Object}
     * @param Wrap [in, optional] {@code Object}
     * @param Format [in, optional] {@code Object}
     * @param ReplaceWith [in, optional] {@code Object}
     * @param Replace [in, optional] {@code Object}
     * @param MatchKashida [in, optional] {@code Object}
     * @param MatchDiacritics [in, optional] {@code Object}
     * @param MatchAlefHamza [in, optional] {@code Object}
     * @param MatchControl [in, optional] {@code Object}
     */
    @ComMethod(name = "Execute", dispId = 0x1bc)
    Boolean Execute(Object FindText,
            Object MatchCase,
            Object MatchWholeWord,
            Object MatchWildcards,
            Object MatchSoundsLike,
            Object MatchAllWordForms,
            Object Forward,
            Object Wrap,
            Object Format,
            Object ReplaceWith,
            Object Replace,
            Object MatchKashida,
            Object MatchDiacritics,
            Object MatchAlefHamza,
            Object MatchControl);
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x22)
    Integer getNoProofing();
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "NoProofing", dispId = 0x22)
    void setNoProofing(Integer param0);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "MatchKashida", dispId = 0x64)
    Boolean getMatchKashida();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchKashida", dispId = 0x64)
    void setMatchKashida(Boolean param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "MatchDiacritics", dispId = 0x65)
    Boolean getMatchDiacritics();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchDiacritics", dispId = 0x65)
    void setMatchDiacritics(Boolean param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "MatchAlefHamza", dispId = 0x66)
    Boolean getMatchAlefHamza();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchAlefHamza", dispId = 0x66)
    void setMatchAlefHamza(Boolean param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "MatchControl", dispId = 0x67)
    Boolean getMatchControl();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchControl", dispId = 0x67)
    void setMatchControl(Boolean param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "MatchPhrase", dispId = 0x68)
    Boolean getMatchPhrase();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchPhrase", dispId = 0x68)
    void setMatchPhrase(Boolean param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "MatchPrefix", dispId = 0x69)
    Boolean getMatchPrefix();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchPrefix", dispId = 0x69)
    void setMatchPrefix(Boolean param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "MatchSuffix", dispId = 0x6a)
    Boolean getMatchSuffix();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchSuffix", dispId = 0x6a)
    void setMatchSuffix(Boolean param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "IgnoreSpace", dispId = 0x6b)
    Boolean getIgnoreSpace();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IgnoreSpace", dispId = 0x6b)
    void setIgnoreSpace(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "IgnorePunct", dispId = 0x6c)
    Boolean getIgnorePunct();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(75)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IgnorePunct", dispId = 0x6c)
    void setIgnorePunct(Boolean param0);
            
    /**
     * <p>id(0x1bd)</p>
     * <p>vtableId(76)</p>
     * @param FindText [in] {@code Object}
     * @param HighlightColor [in, optional] {@code Object}
     * @param TextColor [in, optional] {@code Object}
     * @param MatchCase [in, optional] {@code Object}
     * @param MatchWholeWord [in, optional] {@code Object}
     * @param MatchPrefix [in, optional] {@code Object}
     * @param MatchSuffix [in, optional] {@code Object}
     * @param MatchPhrase [in, optional] {@code Object}
     * @param MatchWildcards [in, optional] {@code Object}
     * @param MatchSoundsLike [in, optional] {@code Object}
     * @param MatchAllWordForms [in, optional] {@code Object}
     * @param MatchByte [in, optional] {@code Object}
     * @param MatchFuzzy [in, optional] {@code Object}
     * @param MatchKashida [in, optional] {@code Object}
     * @param MatchDiacritics [in, optional] {@code Object}
     * @param MatchAlefHamza [in, optional] {@code Object}
     * @param MatchControl [in, optional] {@code Object}
     * @param IgnoreSpace [in, optional] {@code Object}
     * @param IgnorePunct [in, optional] {@code Object}
     * @param HanjaPhoneticHangul [in, optional] {@code Object}
     */
    @ComMethod(name = "HitHighlight", dispId = 0x1bd)
    Boolean HitHighlight(Object FindText,
            Object HighlightColor,
            Object TextColor,
            Object MatchCase,
            Object MatchWholeWord,
            Object MatchPrefix,
            Object MatchSuffix,
            Object MatchPhrase,
            Object MatchWildcards,
            Object MatchSoundsLike,
            Object MatchAllWordForms,
            Object MatchByte,
            Object MatchFuzzy,
            Object MatchKashida,
            Object MatchDiacritics,
            Object MatchAlefHamza,
            Object MatchControl,
            Object IgnoreSpace,
            Object IgnorePunct,
            Object HanjaPhoneticHangul);
            
    /**
     * <p>id(0x1be)</p>
     * <p>vtableId(77)</p>
     */
    @ComMethod(name = "ClearHitHighlight", dispId = 0x1be)
    Boolean ClearHitHighlight();
            
    /**
     * <p>id(0x1bf)</p>
     * <p>vtableId(78)</p>
     * @param FindText [in, optional] {@code Object}
     * @param MatchCase [in, optional] {@code Object}
     * @param MatchWholeWord [in, optional] {@code Object}
     * @param MatchWildcards [in, optional] {@code Object}
     * @param MatchSoundsLike [in, optional] {@code Object}
     * @param MatchAllWordForms [in, optional] {@code Object}
     * @param Forward [in, optional] {@code Object}
     * @param Wrap [in, optional] {@code Object}
     * @param Format [in, optional] {@code Object}
     * @param ReplaceWith [in, optional] {@code Object}
     * @param Replace [in, optional] {@code Object}
     * @param MatchKashida [in, optional] {@code Object}
     * @param MatchDiacritics [in, optional] {@code Object}
     * @param MatchAlefHamza [in, optional] {@code Object}
     * @param MatchControl [in, optional] {@code Object}
     * @param MatchPrefix [in, optional] {@code Object}
     * @param MatchSuffix [in, optional] {@code Object}
     * @param MatchPhrase [in, optional] {@code Object}
     * @param IgnoreSpace [in, optional] {@code Object}
     * @param IgnorePunct [in, optional] {@code Object}
     */
    @ComMethod(name = "Execute2007", dispId = 0x1bf)
    Boolean Execute2007(Object FindText,
            Object MatchCase,
            Object MatchWholeWord,
            Object MatchWildcards,
            Object MatchSoundsLike,
            Object MatchAllWordForms,
            Object Forward,
            Object Wrap,
            Object Format,
            Object ReplaceWith,
            Object Replace,
            Object MatchKashida,
            Object MatchDiacritics,
            Object MatchAlefHamza,
            Object MatchControl,
            Object MatchPrefix,
            Object MatchSuffix,
            Object MatchPhrase,
            Object IgnoreSpace,
            Object IgnorePunct);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "HanjaPhoneticHangul", dispId = 0x6d)
    Boolean getHanjaPhoneticHangul();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HanjaPhoneticHangul", dispId = 0x6d)
    void setHanjaPhoneticHangul(Boolean param0);
            
    
}