
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209DB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209DB-0000-0000-C000-000000000046}")
public interface EmailOptions {
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "UseThemeStyle", dispId = 0x67)
    Boolean getUseThemeStyle();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "UseThemeStyle", dispId = 0x67)
    void setUseThemeStyle(Boolean param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "MarkCommentsWith", dispId = 0x6a)
    String getMarkCommentsWith();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "MarkCommentsWith", dispId = 0x6a)
    void setMarkCommentsWith(String param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "MarkComments", dispId = 0x6b)
    Boolean getMarkComments();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "MarkComments", dispId = 0x6b)
    void setMarkComments(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "EmailSignature", dispId = 0x6c)
    EmailSignature getEmailSignature();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "ComposeStyle", dispId = 0x6d)
    Style getComposeStyle();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "ReplyStyle", dispId = 0x6e)
    Style getReplyStyle();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "ThemeName", dispId = 0x72)
    String getThemeName();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "ThemeName", dispId = 0x72)
    void setThemeName(String param0);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "Dummy1", dispId = 0x6f)
    Boolean getDummy1();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "Dummy2", dispId = 0x70)
    Boolean getDummy2();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComMethod(name = "Dummy3", dispId = 0x71)
    void Dummy3();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "NewColorOnReply", dispId = 0x74)
    Boolean getNewColorOnReply();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "NewColorOnReply", dispId = 0x74)
    void setNewColorOnReply(Boolean param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "PlainTextStyle", dispId = 0x75)
    Style getPlainTextStyle();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "UseThemeStyleOnReply", dispId = 0x76)
    Boolean getUseThemeStyleOnReply();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "UseThemeStyleOnReply", dispId = 0x76)
    void setUseThemeStyleOnReply(Boolean param0);
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyHeadings", dispId = 0x104)
    Boolean getAutoFormatAsYouTypeApplyHeadings();
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyHeadings", dispId = 0x104)
    void setAutoFormatAsYouTypeApplyHeadings(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBorders", dispId = 0x105)
    Boolean getAutoFormatAsYouTypeApplyBorders();
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBorders", dispId = 0x105)
    void setAutoFormatAsYouTypeApplyBorders(Boolean param0);
            
    /**
     * <p>id(0x106)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBulletedLists", dispId = 0x106)
    Boolean getAutoFormatAsYouTypeApplyBulletedLists();
            
    /**
     * <p>id(0x106)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBulletedLists", dispId = 0x106)
    void setAutoFormatAsYouTypeApplyBulletedLists(Boolean param0);
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyNumberedLists", dispId = 0x107)
    Boolean getAutoFormatAsYouTypeApplyNumberedLists();
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyNumberedLists", dispId = 0x107)
    void setAutoFormatAsYouTypeApplyNumberedLists(Boolean param0);
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceQuotes", dispId = 0x108)
    Boolean getAutoFormatAsYouTypeReplaceQuotes();
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceQuotes", dispId = 0x108)
    void setAutoFormatAsYouTypeReplaceQuotes(Boolean param0);
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceSymbols", dispId = 0x109)
    Boolean getAutoFormatAsYouTypeReplaceSymbols();
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceSymbols", dispId = 0x109)
    void setAutoFormatAsYouTypeReplaceSymbols(Boolean param0);
            
    /**
     * <p>id(0x10a)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceOrdinals", dispId = 0x10a)
    Boolean getAutoFormatAsYouTypeReplaceOrdinals();
            
    /**
     * <p>id(0x10a)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceOrdinals", dispId = 0x10a)
    void setAutoFormatAsYouTypeReplaceOrdinals(Boolean param0);
            
    /**
     * <p>id(0x10b)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFractions", dispId = 0x10b)
    Boolean getAutoFormatAsYouTypeReplaceFractions();
            
    /**
     * <p>id(0x10b)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFractions", dispId = 0x10b)
    void setAutoFormatAsYouTypeReplaceFractions(Boolean param0);
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplacePlainTextEmphasis", dispId = 0x10c)
    Boolean getAutoFormatAsYouTypeReplacePlainTextEmphasis();
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplacePlainTextEmphasis", dispId = 0x10c)
    void setAutoFormatAsYouTypeReplacePlainTextEmphasis(Boolean param0);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeFormatListItemBeginning", dispId = 0x10d)
    Boolean getAutoFormatAsYouTypeFormatListItemBeginning();
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeFormatListItemBeginning", dispId = 0x10d)
    void setAutoFormatAsYouTypeFormatListItemBeginning(Boolean param0);
            
    /**
     * <p>id(0x10e)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeDefineStyles", dispId = 0x10e)
    Boolean getAutoFormatAsYouTypeDefineStyles();
            
    /**
     * <p>id(0x10e)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeDefineStyles", dispId = 0x10e)
    void setAutoFormatAsYouTypeDefineStyles(Boolean param0);
            
    /**
     * <p>id(0x110)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceHyperlinks", dispId = 0x110)
    Boolean getAutoFormatAsYouTypeReplaceHyperlinks();
            
    /**
     * <p>id(0x110)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceHyperlinks", dispId = 0x110)
    void setAutoFormatAsYouTypeReplaceHyperlinks(Boolean param0);
            
    /**
     * <p>id(0x122)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyTables", dispId = 0x122)
    Boolean getAutoFormatAsYouTypeApplyTables();
            
    /**
     * <p>id(0x122)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyTables", dispId = 0x122)
    void setAutoFormatAsYouTypeApplyTables(Boolean param0);
            
    /**
     * <p>id(0x129)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyFirstIndents", dispId = 0x129)
    Boolean getAutoFormatAsYouTypeApplyFirstIndents();
            
    /**
     * <p>id(0x129)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyFirstIndents", dispId = 0x129)
    void setAutoFormatAsYouTypeApplyFirstIndents(Boolean param0);
            
    /**
     * <p>id(0x12a)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyDates", dispId = 0x12a)
    Boolean getAutoFormatAsYouTypeApplyDates();
            
    /**
     * <p>id(0x12a)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyDates", dispId = 0x12a)
    void setAutoFormatAsYouTypeApplyDates(Boolean param0);
            
    /**
     * <p>id(0x12b)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyClosings", dispId = 0x12b)
    Boolean getAutoFormatAsYouTypeApplyClosings();
            
    /**
     * <p>id(0x12b)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyClosings", dispId = 0x12b)
    void setAutoFormatAsYouTypeApplyClosings(Boolean param0);
            
    /**
     * <p>id(0x12c)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeMatchParentheses", dispId = 0x12c)
    Boolean getAutoFormatAsYouTypeMatchParentheses();
            
    /**
     * <p>id(0x12c)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeMatchParentheses", dispId = 0x12c)
    void setAutoFormatAsYouTypeMatchParentheses(Boolean param0);
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFarEastDashes", dispId = 0x12d)
    Boolean getAutoFormatAsYouTypeReplaceFarEastDashes();
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFarEastDashes", dispId = 0x12d)
    void setAutoFormatAsYouTypeReplaceFarEastDashes(Boolean param0);
            
    /**
     * <p>id(0x12e)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeDeleteAutoSpaces", dispId = 0x12e)
    Boolean getAutoFormatAsYouTypeDeleteAutoSpaces();
            
    /**
     * <p>id(0x12e)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeDeleteAutoSpaces", dispId = 0x12e)
    void setAutoFormatAsYouTypeDeleteAutoSpaces(Boolean param0);
            
    /**
     * <p>id(0x12f)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertClosings", dispId = 0x12f)
    Boolean getAutoFormatAsYouTypeInsertClosings();
            
    /**
     * <p>id(0x12f)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertClosings", dispId = 0x12f)
    void setAutoFormatAsYouTypeInsertClosings(Boolean param0);
            
    /**
     * <p>id(0x130)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeAutoLetterWizard", dispId = 0x130)
    Boolean getAutoFormatAsYouTypeAutoLetterWizard();
            
    /**
     * <p>id(0x130)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeAutoLetterWizard", dispId = 0x130)
    void setAutoFormatAsYouTypeAutoLetterWizard(Boolean param0);
            
    /**
     * <p>id(0x131)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertOvers", dispId = 0x131)
    Boolean getAutoFormatAsYouTypeInsertOvers();
            
    /**
     * <p>id(0x131)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertOvers", dispId = 0x131)
    void setAutoFormatAsYouTypeInsertOvers(Boolean param0);
            
    /**
     * <p>id(0x132)</p>
     */
    @ComProperty(name = "RelyOnCSS", dispId = 0x132)
    Boolean getRelyOnCSS();
            
    /**
     * <p>id(0x132)</p>
     */
    @ComProperty(name = "RelyOnCSS", dispId = 0x132)
    void setRelyOnCSS(Boolean param0);
            
    /**
     * <p>id(0x133)</p>
     */
    @ComProperty(name = "HTMLFidelity", dispId = 0x133)
    WdEmailHTMLFidelity getHTMLFidelity();
            
    /**
     * <p>id(0x133)</p>
     */
    @ComProperty(name = "HTMLFidelity", dispId = 0x133)
    void setHTMLFidelity(WdEmailHTMLFidelity param0);
            
    /**
     * <p>id(0x134)</p>
     */
    @ComProperty(name = "EmbedSmartTag", dispId = 0x134)
    Boolean getEmbedSmartTag();
            
    /**
     * <p>id(0x134)</p>
     */
    @ComProperty(name = "EmbedSmartTag", dispId = 0x134)
    void setEmbedSmartTag(Boolean param0);
            
    /**
     * <p>id(0x135)</p>
     */
    @ComProperty(name = "TabIndentKey", dispId = 0x135)
    Boolean getTabIndentKey();
            
    /**
     * <p>id(0x135)</p>
     */
    @ComProperty(name = "TabIndentKey", dispId = 0x135)
    void setTabIndentKey(Boolean param0);
            
    
}