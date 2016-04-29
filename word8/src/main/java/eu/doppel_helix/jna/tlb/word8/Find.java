
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209B0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209B0-0000-0000-C000-000000000046}")
public interface Find {
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
    @ComProperty(name = "Forward", dispId = 0xa)
    Boolean getForward();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Forward", dispId = 0xa)
    void setForward(Boolean param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "Font", dispId = 0xb)
    Font getFont();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "Font", dispId = 0xb)
    void setFont(Font param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Found", dispId = 0xc)
    Boolean getFound();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "MatchAllWordForms", dispId = 0xd)
    Boolean getMatchAllWordForms();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "MatchAllWordForms", dispId = 0xd)
    void setMatchAllWordForms(Boolean param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "MatchCase", dispId = 0xe)
    Boolean getMatchCase();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "MatchCase", dispId = 0xe)
    void setMatchCase(Boolean param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "MatchWildcards", dispId = 0xf)
    Boolean getMatchWildcards();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "MatchWildcards", dispId = 0xf)
    void setMatchWildcards(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "MatchSoundsLike", dispId = 0x10)
    Boolean getMatchSoundsLike();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "MatchSoundsLike", dispId = 0x10)
    void setMatchSoundsLike(Boolean param0);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "MatchWholeWord", dispId = 0x11)
    Boolean getMatchWholeWord();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "MatchWholeWord", dispId = 0x11)
    void setMatchWholeWord(Boolean param0);
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "MatchFuzzy", dispId = 0x28)
    Boolean getMatchFuzzy();
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "MatchFuzzy", dispId = 0x28)
    void setMatchFuzzy(Boolean param0);
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "MatchByte", dispId = 0x29)
    Boolean getMatchByte();
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "MatchByte", dispId = 0x29)
    void setMatchByte(Boolean param0);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0x12)
    ParagraphFormat getParagraphFormat();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0x12)
    void setParagraphFormat(ParagraphFormat param0);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Style", dispId = 0x13)
    Object getStyle();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Style", dispId = 0x13)
    void setStyle(Object param0);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "Text", dispId = 0x16)
    String getText();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "Text", dispId = 0x16)
    void setText(String param0);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x17)
    WdLanguageID getLanguageID();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x17)
    void setLanguageID(WdLanguageID param0);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "Highlight", dispId = 0x18)
    Integer getHighlight();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "Highlight", dispId = 0x18)
    void setHighlight(Integer param0);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "Replacement", dispId = 0x19)
    Replacement getReplacement();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "Frame", dispId = 0x1a)
    Frame getFrame();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "Wrap", dispId = 0x1b)
    WdFindWrap getWrap();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "Wrap", dispId = 0x1b)
    void setWrap(WdFindWrap param0);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "Format", dispId = 0x1c)
    Boolean getFormat();
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "Format", dispId = 0x1c)
    void setFormat(Boolean param0);
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x1d)
    WdLanguageID getLanguageIDFarEast();
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x1d)
    void setLanguageIDFarEast(WdLanguageID param0);
            
    /**
     * <p>id(0x3c)</p>
     */
    @ComProperty(name = "LanguageIDOther", dispId = 0x3c)
    WdLanguageID getLanguageIDOther();
            
    /**
     * <p>id(0x3c)</p>
     */
    @ComProperty(name = "LanguageIDOther", dispId = 0x3c)
    void setLanguageIDOther(WdLanguageID param0);
            
    /**
     * <p>id(0x3d)</p>
     */
    @ComProperty(name = "CorrectHangulEndings", dispId = 0x3d)
    Boolean getCorrectHangulEndings();
            
    /**
     * <p>id(0x3d)</p>
     */
    @ComProperty(name = "CorrectHangulEndings", dispId = 0x3d)
    void setCorrectHangulEndings(Boolean param0);
            
    /**
     * <p>id(0x1e)</p>
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
     */
    @ComMethod(name = "ClearFormatting", dispId = 0x1f)
    void ClearFormatting();
            
    /**
     * <p>id(0x20)</p>
     */
    @ComMethod(name = "SetAllFuzzyOptions", dispId = 0x20)
    void SetAllFuzzyOptions();
            
    /**
     * <p>id(0x21)</p>
     */
    @ComMethod(name = "ClearAllFuzzyOptions", dispId = 0x21)
    void ClearAllFuzzyOptions();
            
    /**
     * <p>id(0x1bc)</p>
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
     */
    @ComProperty(name = "NoProofing", dispId = 0x22)
    Integer getNoProofing();
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x22)
    void setNoProofing(Integer param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "MatchKashida", dispId = 0x64)
    Boolean getMatchKashida();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "MatchKashida", dispId = 0x64)
    void setMatchKashida(Boolean param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "MatchDiacritics", dispId = 0x65)
    Boolean getMatchDiacritics();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "MatchDiacritics", dispId = 0x65)
    void setMatchDiacritics(Boolean param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "MatchAlefHamza", dispId = 0x66)
    Boolean getMatchAlefHamza();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "MatchAlefHamza", dispId = 0x66)
    void setMatchAlefHamza(Boolean param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "MatchControl", dispId = 0x67)
    Boolean getMatchControl();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "MatchControl", dispId = 0x67)
    void setMatchControl(Boolean param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "MatchPhrase", dispId = 0x68)
    Boolean getMatchPhrase();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "MatchPhrase", dispId = 0x68)
    void setMatchPhrase(Boolean param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "MatchPrefix", dispId = 0x69)
    Boolean getMatchPrefix();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "MatchPrefix", dispId = 0x69)
    void setMatchPrefix(Boolean param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "MatchSuffix", dispId = 0x6a)
    Boolean getMatchSuffix();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "MatchSuffix", dispId = 0x6a)
    void setMatchSuffix(Boolean param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "IgnoreSpace", dispId = 0x6b)
    Boolean getIgnoreSpace();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "IgnoreSpace", dispId = 0x6b)
    void setIgnoreSpace(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "IgnorePunct", dispId = 0x6c)
    Boolean getIgnorePunct();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "IgnorePunct", dispId = 0x6c)
    void setIgnorePunct(Boolean param0);
            
    /**
     * <p>id(0x1bd)</p>
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
     */
    @ComMethod(name = "ClearHitHighlight", dispId = 0x1be)
    Boolean ClearHitHighlight();
            
    /**
     * <p>id(0x1bf)</p>
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
     */
    @ComProperty(name = "HanjaPhoneticHangul", dispId = 0x6d)
    Boolean getHanjaPhoneticHangul();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "HanjaPhoneticHangul", dispId = 0x6d)
    void setHanjaPhoneticHangul(Boolean param0);
            
    
}