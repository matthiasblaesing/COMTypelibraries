
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209DB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209DB-0000-0000-C000-000000000046}")
public interface EmailOptions extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "UseThemeStyle", dispId = 0x67)
    Boolean getUseThemeStyle();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseThemeStyle", dispId = 0x67)
    void setUseThemeStyle(Boolean param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "MarkCommentsWith", dispId = 0x6a)
    String getMarkCommentsWith();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MarkCommentsWith", dispId = 0x6a)
    void setMarkCommentsWith(String param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "MarkComments", dispId = 0x6b)
    Boolean getMarkComments();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MarkComments", dispId = 0x6b)
    void setMarkComments(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "EmailSignature", dispId = 0x6c)
    EmailSignature getEmailSignature();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ComposeStyle", dispId = 0x6d)
    Style getComposeStyle();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ReplyStyle", dispId = 0x6e)
    Style getReplyStyle();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "ThemeName", dispId = 0x72)
    String getThemeName();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ThemeName", dispId = 0x72)
    void setThemeName(String param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Dummy1", dispId = 0x6f)
    Boolean getDummy1();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Dummy2", dispId = 0x70)
    Boolean getDummy2();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "Dummy3", dispId = 0x71)
    void Dummy3();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "NewColorOnReply", dispId = 0x74)
    Boolean getNewColorOnReply();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NewColorOnReply", dispId = 0x74)
    void setNewColorOnReply(Boolean param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "PlainTextStyle", dispId = 0x75)
    Style getPlainTextStyle();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "UseThemeStyleOnReply", dispId = 0x76)
    Boolean getUseThemeStyleOnReply();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseThemeStyleOnReply", dispId = 0x76)
    void setUseThemeStyleOnReply(Boolean param0);
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyHeadings", dispId = 0x104)
    Boolean getAutoFormatAsYouTypeApplyHeadings();
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyHeadings", dispId = 0x104)
    void setAutoFormatAsYouTypeApplyHeadings(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBorders", dispId = 0x105)
    Boolean getAutoFormatAsYouTypeApplyBorders();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBorders", dispId = 0x105)
    void setAutoFormatAsYouTypeApplyBorders(Boolean param0);
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBulletedLists", dispId = 0x106)
    Boolean getAutoFormatAsYouTypeApplyBulletedLists();
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBulletedLists", dispId = 0x106)
    void setAutoFormatAsYouTypeApplyBulletedLists(Boolean param0);
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyNumberedLists", dispId = 0x107)
    Boolean getAutoFormatAsYouTypeApplyNumberedLists();
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyNumberedLists", dispId = 0x107)
    void setAutoFormatAsYouTypeApplyNumberedLists(Boolean param0);
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceQuotes", dispId = 0x108)
    Boolean getAutoFormatAsYouTypeReplaceQuotes();
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceQuotes", dispId = 0x108)
    void setAutoFormatAsYouTypeReplaceQuotes(Boolean param0);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceSymbols", dispId = 0x109)
    Boolean getAutoFormatAsYouTypeReplaceSymbols();
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceSymbols", dispId = 0x109)
    void setAutoFormatAsYouTypeReplaceSymbols(Boolean param0);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceOrdinals", dispId = 0x10a)
    Boolean getAutoFormatAsYouTypeReplaceOrdinals();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceOrdinals", dispId = 0x10a)
    void setAutoFormatAsYouTypeReplaceOrdinals(Boolean param0);
            
    /**
     * <p>id(0x10b)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFractions", dispId = 0x10b)
    Boolean getAutoFormatAsYouTypeReplaceFractions();
            
    /**
     * <p>id(0x10b)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFractions", dispId = 0x10b)
    void setAutoFormatAsYouTypeReplaceFractions(Boolean param0);
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplacePlainTextEmphasis", dispId = 0x10c)
    Boolean getAutoFormatAsYouTypeReplacePlainTextEmphasis();
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplacePlainTextEmphasis", dispId = 0x10c)
    void setAutoFormatAsYouTypeReplacePlainTextEmphasis(Boolean param0);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeFormatListItemBeginning", dispId = 0x10d)
    Boolean getAutoFormatAsYouTypeFormatListItemBeginning();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeFormatListItemBeginning", dispId = 0x10d)
    void setAutoFormatAsYouTypeFormatListItemBeginning(Boolean param0);
            
    /**
     * <p>id(0x10e)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeDefineStyles", dispId = 0x10e)
    Boolean getAutoFormatAsYouTypeDefineStyles();
            
    /**
     * <p>id(0x10e)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeDefineStyles", dispId = 0x10e)
    void setAutoFormatAsYouTypeDefineStyles(Boolean param0);
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceHyperlinks", dispId = 0x110)
    Boolean getAutoFormatAsYouTypeReplaceHyperlinks();
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceHyperlinks", dispId = 0x110)
    void setAutoFormatAsYouTypeReplaceHyperlinks(Boolean param0);
            
    /**
     * <p>id(0x122)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyTables", dispId = 0x122)
    Boolean getAutoFormatAsYouTypeApplyTables();
            
    /**
     * <p>id(0x122)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyTables", dispId = 0x122)
    void setAutoFormatAsYouTypeApplyTables(Boolean param0);
            
    /**
     * <p>id(0x129)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyFirstIndents", dispId = 0x129)
    Boolean getAutoFormatAsYouTypeApplyFirstIndents();
            
    /**
     * <p>id(0x129)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyFirstIndents", dispId = 0x129)
    void setAutoFormatAsYouTypeApplyFirstIndents(Boolean param0);
            
    /**
     * <p>id(0x12a)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyDates", dispId = 0x12a)
    Boolean getAutoFormatAsYouTypeApplyDates();
            
    /**
     * <p>id(0x12a)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyDates", dispId = 0x12a)
    void setAutoFormatAsYouTypeApplyDates(Boolean param0);
            
    /**
     * <p>id(0x12b)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyClosings", dispId = 0x12b)
    Boolean getAutoFormatAsYouTypeApplyClosings();
            
    /**
     * <p>id(0x12b)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyClosings", dispId = 0x12b)
    void setAutoFormatAsYouTypeApplyClosings(Boolean param0);
            
    /**
     * <p>id(0x12c)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeMatchParentheses", dispId = 0x12c)
    Boolean getAutoFormatAsYouTypeMatchParentheses();
            
    /**
     * <p>id(0x12c)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeMatchParentheses", dispId = 0x12c)
    void setAutoFormatAsYouTypeMatchParentheses(Boolean param0);
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFarEastDashes", dispId = 0x12d)
    Boolean getAutoFormatAsYouTypeReplaceFarEastDashes();
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFarEastDashes", dispId = 0x12d)
    void setAutoFormatAsYouTypeReplaceFarEastDashes(Boolean param0);
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeDeleteAutoSpaces", dispId = 0x12e)
    Boolean getAutoFormatAsYouTypeDeleteAutoSpaces();
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeDeleteAutoSpaces", dispId = 0x12e)
    void setAutoFormatAsYouTypeDeleteAutoSpaces(Boolean param0);
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertClosings", dispId = 0x12f)
    Boolean getAutoFormatAsYouTypeInsertClosings();
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertClosings", dispId = 0x12f)
    void setAutoFormatAsYouTypeInsertClosings(Boolean param0);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeAutoLetterWizard", dispId = 0x130)
    Boolean getAutoFormatAsYouTypeAutoLetterWizard();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeAutoLetterWizard", dispId = 0x130)
    void setAutoFormatAsYouTypeAutoLetterWizard(Boolean param0);
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertOvers", dispId = 0x131)
    Boolean getAutoFormatAsYouTypeInsertOvers();
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertOvers", dispId = 0x131)
    void setAutoFormatAsYouTypeInsertOvers(Boolean param0);
            
    /**
     * <p>id(0x132)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "RelyOnCSS", dispId = 0x132)
    Boolean getRelyOnCSS();
            
    /**
     * <p>id(0x132)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RelyOnCSS", dispId = 0x132)
    void setRelyOnCSS(Boolean param0);
            
    /**
     * <p>id(0x133)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "HTMLFidelity", dispId = 0x133)
    WdEmailHTMLFidelity getHTMLFidelity();
            
    /**
     * <p>id(0x133)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code WdEmailHTMLFidelity}
     */
    @ComProperty(name = "HTMLFidelity", dispId = 0x133)
    void setHTMLFidelity(WdEmailHTMLFidelity param0);
            
    /**
     * <p>id(0x134)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "EmbedSmartTag", dispId = 0x134)
    Boolean getEmbedSmartTag();
            
    /**
     * <p>id(0x134)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EmbedSmartTag", dispId = 0x134)
    void setEmbedSmartTag(Boolean param0);
            
    /**
     * <p>id(0x135)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "TabIndentKey", dispId = 0x135)
    Boolean getTabIndentKey();
            
    /**
     * <p>id(0x135)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TabIndentKey", dispId = 0x135)
    void setTabIndentKey(Boolean param0);
            
    
}