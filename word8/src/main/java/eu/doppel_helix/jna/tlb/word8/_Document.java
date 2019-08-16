
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002096B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002096B-0000-0000-C000-000000000046}")
public interface _Document extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "BuiltInDocumentProperties", dispId = 0x3e8)
    com.sun.jna.platform.win32.COM.util.IDispatch getBuiltInDocumentProperties();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "CustomDocumentProperties", dispId = 0x2)
    com.sun.jna.platform.win32.COM.util.IDispatch getCustomDocumentProperties();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Path", dispId = 0x3)
    String getPath();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Bookmarks", dispId = 0x4)
    Bookmarks getBookmarks();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Tables", dispId = 0x6)
    Tables getTables();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Footnotes", dispId = 0x7)
    Footnotes getFootnotes();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Endnotes", dispId = 0x8)
    Endnotes getEndnotes();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x9)
    Comments getComments();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Type", dispId = 0xa)
    WdDocumentType getType();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "AutoHyphenation", dispId = 0xb)
    Boolean getAutoHyphenation();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoHyphenation", dispId = 0xb)
    void setAutoHyphenation(Boolean param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "HyphenateCaps", dispId = 0xc)
    Boolean getHyphenateCaps();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HyphenateCaps", dispId = 0xc)
    void setHyphenateCaps(Boolean param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "HyphenationZone", dispId = 0xd)
    Integer getHyphenationZone();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HyphenationZone", dispId = 0xd)
    void setHyphenationZone(Integer param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "ConsecutiveHyphensLimit", dispId = 0xe)
    Integer getConsecutiveHyphensLimit();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ConsecutiveHyphensLimit", dispId = 0xe)
    void setConsecutiveHyphensLimit(Integer param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Sections", dispId = 0xf)
    Sections getSections();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Paragraphs", dispId = 0x10)
    Paragraphs getParagraphs();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Words", dispId = 0x11)
    Words getWords();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Sentences", dispId = 0x12)
    Sentences getSentences();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x13)
    Characters getCharacters();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x14)
    Fields getFields();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "FormFields", dispId = 0x15)
    FormFields getFormFields();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Styles", dispId = 0x16)
    Styles getStyles();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Frames", dispId = 0x17)
    Frames getFrames();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "TablesOfFigures", dispId = 0x19)
    TablesOfFigures getTablesOfFigures();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Variables", dispId = 0x1a)
    Variables getVariables();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "MailMerge", dispId = 0x1b)
    MailMerge getMailMerge();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "Envelope", dispId = 0x1c)
    Envelope getEnvelope();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x1d)
    String getFullName();
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "Revisions", dispId = 0x1e)
    Revisions getRevisions();
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "TablesOfContents", dispId = 0x1f)
    TablesOfContents getTablesOfContents();
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "TablesOfAuthorities", dispId = 0x20)
    TablesOfAuthorities getTablesOfAuthorities();
            
    /**
     * <p>id(0x44d)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "PageSetup", dispId = 0x44d)
    PageSetup getPageSetup();
            
    /**
     * <p>id(0x44d)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code PageSetup}
     */
    @ComProperty(name = "PageSetup", dispId = 0x44d)
    void setPageSetup(PageSetup param0);
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "Windows", dispId = 0x22)
    Windows getWindows();
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "HasRoutingSlip", dispId = 0x23)
    Boolean getHasRoutingSlip();
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasRoutingSlip", dispId = 0x23)
    void setHasRoutingSlip(Boolean param0);
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "RoutingSlip", dispId = 0x24)
    RoutingSlip getRoutingSlip();
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "Routed", dispId = 0x25)
    Boolean getRouted();
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "TablesOfAuthoritiesCategories", dispId = 0x26)
    TablesOfAuthoritiesCategories getTablesOfAuthoritiesCategories();
            
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "Indexes", dispId = 0x27)
    Indexes getIndexes();
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "Saved", dispId = 0x28)
    Boolean getSaved();
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Saved", dispId = 0x28)
    void setSaved(Boolean param0);
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "Content", dispId = 0x29)
    Range getContent();
            
    /**
     * <p>id(0x2a)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "ActiveWindow", dispId = 0x2a)
    Window getActiveWindow();
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "Kind", dispId = 0x2b)
    WdDocumentKind getKind();
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code WdDocumentKind}
     */
    @ComProperty(name = "Kind", dispId = 0x2b)
    void setKind(WdDocumentKind param0);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x2c)
    Boolean getReadOnly();
            
    /**
     * <p>id(0x2d)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Subdocuments", dispId = 0x2d)
    Subdocuments getSubdocuments();
            
    /**
     * <p>id(0x2e)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "IsMasterDocument", dispId = 0x2e)
    Boolean getIsMasterDocument();
            
    /**
     * <p>id(0x30)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "DefaultTabStop", dispId = 0x30)
    Float getDefaultTabStop();
            
    /**
     * <p>id(0x30)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "DefaultTabStop", dispId = 0x30)
    void setDefaultTabStop(Float param0);
            
    /**
     * <p>id(0x32)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "EmbedTrueTypeFonts", dispId = 0x32)
    Boolean getEmbedTrueTypeFonts();
            
    /**
     * <p>id(0x32)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EmbedTrueTypeFonts", dispId = 0x32)
    void setEmbedTrueTypeFonts(Boolean param0);
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "SaveFormsData", dispId = 0x33)
    Boolean getSaveFormsData();
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SaveFormsData", dispId = 0x33)
    void setSaveFormsData(Boolean param0);
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "ReadOnlyRecommended", dispId = 0x34)
    Boolean getReadOnlyRecommended();
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReadOnlyRecommended", dispId = 0x34)
    void setReadOnlyRecommended(Boolean param0);
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "SaveSubsetFonts", dispId = 0x35)
    Boolean getSaveSubsetFonts();
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SaveSubsetFonts", dispId = 0x35)
    void setSaveSubsetFonts(Boolean param0);
            
    /**
     * <p>id(0x37)</p>
     * <p>vtableId(73)</p>
     * @param Type [in] {@code WdCompatibility}
     */
    @ComProperty(name = "Compatibility", dispId = 0x37)
    Boolean getCompatibility(WdCompatibility Type);
            
    /**
     * <p>id(0x37)</p>
     * <p>vtableId(74)</p>
     * @param Type [in] {@code WdCompatibility}
     * @param param1 [in] {@code Boolean}
     */
    @ComProperty(name = "Compatibility", dispId = 0x37)
    void setCompatibility(WdCompatibility Type,
            Boolean param1);
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "StoryRanges", dispId = 0x38)
    StoryRanges getStoryRanges();
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x39)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x3a)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "IsSubdocument", dispId = 0x3a)
    Boolean getIsSubdocument();
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "SaveFormat", dispId = 0x3b)
    Integer getSaveFormat();
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "ProtectionType", dispId = 0x3c)
    WdProtectionType getProtectionType();
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x3d)
    Hyperlinks getHyperlinks();
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "Shapes", dispId = 0x3e)
    Shapes getShapes();
            
    /**
     * <p>id(0x3f)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "ListTemplates", dispId = 0x3f)
    ListTemplates getListTemplates();
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "Lists", dispId = 0x40)
    Lists getLists();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "UpdateStylesOnOpen", dispId = 0x42)
    Boolean getUpdateStylesOnOpen();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(85)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UpdateStylesOnOpen", dispId = 0x42)
    void setUpdateStylesOnOpen(Boolean param0);
            
    /**
     * <p>id(0x43)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "AttachedTemplate", dispId = 0x43)
    Object getAttachedTemplate();
            
    /**
     * <p>id(0x43)</p>
     * <p>vtableId(87)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "AttachedTemplate", dispId = 0x43)
    void setAttachedTemplate(Object param0);
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "InlineShapes", dispId = 0x44)
    InlineShapes getInlineShapes();
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "Background", dispId = 0x45)
    Shape getBackground();
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code Shape}
     */
    @ComProperty(name = "Background", dispId = 0x45)
    void setBackground(Shape param0);
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "GrammarChecked", dispId = 0x46)
    Boolean getGrammarChecked();
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "GrammarChecked", dispId = 0x46)
    void setGrammarChecked(Boolean param0);
            
    /**
     * <p>id(0x47)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "SpellingChecked", dispId = 0x47)
    Boolean getSpellingChecked();
            
    /**
     * <p>id(0x47)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SpellingChecked", dispId = 0x47)
    void setSpellingChecked(Boolean param0);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "ShowGrammaticalErrors", dispId = 0x48)
    Boolean getShowGrammaticalErrors();
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(96)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowGrammaticalErrors", dispId = 0x48)
    void setShowGrammaticalErrors(Boolean param0);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "ShowSpellingErrors", dispId = 0x49)
    Boolean getShowSpellingErrors();
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowSpellingErrors", dispId = 0x49)
    void setShowSpellingErrors(Boolean param0);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "Versions", dispId = 0x4b)
    Versions getVersions();
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(100)</p>
     */
    @ComProperty(name = "ShowSummary", dispId = 0x4c)
    Boolean getShowSummary();
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(101)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowSummary", dispId = 0x4c)
    void setShowSummary(Boolean param0);
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(102)</p>
     */
    @ComProperty(name = "SummaryViewMode", dispId = 0x4d)
    WdSummaryMode getSummaryViewMode();
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(103)</p>
     * @param param0 [in] {@code WdSummaryMode}
     */
    @ComProperty(name = "SummaryViewMode", dispId = 0x4d)
    void setSummaryViewMode(WdSummaryMode param0);
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(104)</p>
     */
    @ComProperty(name = "SummaryLength", dispId = 0x4e)
    Integer getSummaryLength();
            
    /**
     * <p>id(0x4e)</p>
     * <p>vtableId(105)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SummaryLength", dispId = 0x4e)
    void setSummaryLength(Integer param0);
            
    /**
     * <p>id(0x4f)</p>
     * <p>vtableId(106)</p>
     */
    @ComProperty(name = "PrintFractionalWidths", dispId = 0x4f)
    Boolean getPrintFractionalWidths();
            
    /**
     * <p>id(0x4f)</p>
     * <p>vtableId(107)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintFractionalWidths", dispId = 0x4f)
    void setPrintFractionalWidths(Boolean param0);
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(108)</p>
     */
    @ComProperty(name = "PrintPostScriptOverText", dispId = 0x50)
    Boolean getPrintPostScriptOverText();
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(109)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintPostScriptOverText", dispId = 0x50)
    void setPrintPostScriptOverText(Boolean param0);
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(110)</p>
     */
    @ComProperty(name = "Container", dispId = 0x52)
    com.sun.jna.platform.win32.COM.util.IDispatch getContainer();
            
    /**
     * <p>id(0x53)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "PrintFormsData", dispId = 0x53)
    Boolean getPrintFormsData();
            
    /**
     * <p>id(0x53)</p>
     * <p>vtableId(112)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintFormsData", dispId = 0x53)
    void setPrintFormsData(Boolean param0);
            
    /**
     * <p>id(0x54)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "ListParagraphs", dispId = 0x54)
    ListParagraphs getListParagraphs();
            
    /**
     * <p>id(0x55)</p>
     * <p>vtableId(114)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Password", dispId = 0x55)
    void setPassword(String param0);
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(115)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "WritePassword", dispId = 0x56)
    void setWritePassword(String param0);
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(116)</p>
     */
    @ComProperty(name = "HasPassword", dispId = 0x57)
    Boolean getHasPassword();
            
    /**
     * <p>id(0x58)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "WriteReserved", dispId = 0x58)
    Boolean getWriteReserved();
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(118)</p>
     * @param LanguageID [in] {@code Object}
     */
    @ComProperty(name = "ActiveWritingStyle", dispId = 0x5a)
    String getActiveWritingStyle(Object LanguageID);
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(119)</p>
     * @param LanguageID [in] {@code Object}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "ActiveWritingStyle", dispId = 0x5a)
    void setActiveWritingStyle(Object LanguageID,
            String param1);
            
    /**
     * <p>id(0x5c)</p>
     * <p>vtableId(120)</p>
     */
    @ComProperty(name = "UserControl", dispId = 0x5c)
    Boolean getUserControl();
            
    /**
     * <p>id(0x5c)</p>
     * <p>vtableId(121)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UserControl", dispId = 0x5c)
    void setUserControl(Boolean param0);
            
    /**
     * <p>id(0x5d)</p>
     * <p>vtableId(122)</p>
     */
    @ComProperty(name = "HasMailer", dispId = 0x5d)
    Boolean getHasMailer();
            
    /**
     * <p>id(0x5d)</p>
     * <p>vtableId(123)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasMailer", dispId = 0x5d)
    void setHasMailer(Boolean param0);
            
    /**
     * <p>id(0x5e)</p>
     * <p>vtableId(124)</p>
     */
    @ComProperty(name = "Mailer", dispId = 0x5e)
    Mailer getMailer();
            
    /**
     * <p>id(0x60)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "ReadabilityStatistics", dispId = 0x60)
    ReadabilityStatistics getReadabilityStatistics();
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(126)</p>
     */
    @ComProperty(name = "GrammaticalErrors", dispId = 0x61)
    ProofreadingErrors getGrammaticalErrors();
            
    /**
     * <p>id(0x62)</p>
     * <p>vtableId(127)</p>
     */
    @ComProperty(name = "SpellingErrors", dispId = 0x62)
    ProofreadingErrors getSpellingErrors();
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(128)</p>
     */
    @ComProperty(name = "VBProject", dispId = 0x63)
    eu.doppel_helix.jna.tlb.vbide5.VBProject getVBProject();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "FormsDesign", dispId = 0x64)
    Boolean getFormsDesign();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(130)</p>
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    String get_CodeName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(131)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    void set_CodeName(String param0);
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(132)</p>
     */
    @ComProperty(name = "CodeName", dispId = 0x106)
    String getCodeName();
            
    /**
     * <p>id(0x12c)</p>
     * <p>vtableId(133)</p>
     */
    @ComProperty(name = "SnapToGrid", dispId = 0x12c)
    Boolean getSnapToGrid();
            
    /**
     * <p>id(0x12c)</p>
     * <p>vtableId(134)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SnapToGrid", dispId = 0x12c)
    void setSnapToGrid(Boolean param0);
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(135)</p>
     */
    @ComProperty(name = "SnapToShapes", dispId = 0x12d)
    Boolean getSnapToShapes();
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(136)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SnapToShapes", dispId = 0x12d)
    void setSnapToShapes(Boolean param0);
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(137)</p>
     */
    @ComProperty(name = "GridDistanceHorizontal", dispId = 0x12e)
    Float getGridDistanceHorizontal();
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(138)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridDistanceHorizontal", dispId = 0x12e)
    void setGridDistanceHorizontal(Float param0);
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(139)</p>
     */
    @ComProperty(name = "GridDistanceVertical", dispId = 0x12f)
    Float getGridDistanceVertical();
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(140)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridDistanceVertical", dispId = 0x12f)
    void setGridDistanceVertical(Float param0);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(141)</p>
     */
    @ComProperty(name = "GridOriginHorizontal", dispId = 0x130)
    Float getGridOriginHorizontal();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(142)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridOriginHorizontal", dispId = 0x130)
    void setGridOriginHorizontal(Float param0);
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(143)</p>
     */
    @ComProperty(name = "GridOriginVertical", dispId = 0x131)
    Float getGridOriginVertical();
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(144)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridOriginVertical", dispId = 0x131)
    void setGridOriginVertical(Float param0);
            
    /**
     * <p>id(0x132)</p>
     * <p>vtableId(145)</p>
     */
    @ComProperty(name = "GridSpaceBetweenHorizontalLines", dispId = 0x132)
    Integer getGridSpaceBetweenHorizontalLines();
            
    /**
     * <p>id(0x132)</p>
     * <p>vtableId(146)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GridSpaceBetweenHorizontalLines", dispId = 0x132)
    void setGridSpaceBetweenHorizontalLines(Integer param0);
            
    /**
     * <p>id(0x133)</p>
     * <p>vtableId(147)</p>
     */
    @ComProperty(name = "GridSpaceBetweenVerticalLines", dispId = 0x133)
    Integer getGridSpaceBetweenVerticalLines();
            
    /**
     * <p>id(0x133)</p>
     * <p>vtableId(148)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GridSpaceBetweenVerticalLines", dispId = 0x133)
    void setGridSpaceBetweenVerticalLines(Integer param0);
            
    /**
     * <p>id(0x134)</p>
     * <p>vtableId(149)</p>
     */
    @ComProperty(name = "GridOriginFromMargin", dispId = 0x134)
    Boolean getGridOriginFromMargin();
            
    /**
     * <p>id(0x134)</p>
     * <p>vtableId(150)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "GridOriginFromMargin", dispId = 0x134)
    void setGridOriginFromMargin(Boolean param0);
            
    /**
     * <p>id(0x135)</p>
     * <p>vtableId(151)</p>
     */
    @ComProperty(name = "KerningByAlgorithm", dispId = 0x135)
    Boolean getKerningByAlgorithm();
            
    /**
     * <p>id(0x135)</p>
     * <p>vtableId(152)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "KerningByAlgorithm", dispId = 0x135)
    void setKerningByAlgorithm(Boolean param0);
            
    /**
     * <p>id(0x136)</p>
     * <p>vtableId(153)</p>
     */
    @ComProperty(name = "JustificationMode", dispId = 0x136)
    WdJustificationMode getJustificationMode();
            
    /**
     * <p>id(0x136)</p>
     * <p>vtableId(154)</p>
     * @param param0 [in] {@code WdJustificationMode}
     */
    @ComProperty(name = "JustificationMode", dispId = 0x136)
    void setJustificationMode(WdJustificationMode param0);
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(155)</p>
     */
    @ComProperty(name = "FarEastLineBreakLevel", dispId = 0x137)
    WdFarEastLineBreakLevel getFarEastLineBreakLevel();
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(156)</p>
     * @param param0 [in] {@code WdFarEastLineBreakLevel}
     */
    @ComProperty(name = "FarEastLineBreakLevel", dispId = 0x137)
    void setFarEastLineBreakLevel(WdFarEastLineBreakLevel param0);
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(157)</p>
     */
    @ComProperty(name = "NoLineBreakBefore", dispId = 0x138)
    String getNoLineBreakBefore();
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(158)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NoLineBreakBefore", dispId = 0x138)
    void setNoLineBreakBefore(String param0);
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(159)</p>
     */
    @ComProperty(name = "NoLineBreakAfter", dispId = 0x139)
    String getNoLineBreakAfter();
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(160)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NoLineBreakAfter", dispId = 0x139)
    void setNoLineBreakAfter(String param0);
            
    /**
     * <p>id(0x13a)</p>
     * <p>vtableId(161)</p>
     */
    @ComProperty(name = "TrackRevisions", dispId = 0x13a)
    Boolean getTrackRevisions();
            
    /**
     * <p>id(0x13a)</p>
     * <p>vtableId(162)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TrackRevisions", dispId = 0x13a)
    void setTrackRevisions(Boolean param0);
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(163)</p>
     */
    @ComProperty(name = "PrintRevisions", dispId = 0x13b)
    Boolean getPrintRevisions();
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(164)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintRevisions", dispId = 0x13b)
    void setPrintRevisions(Boolean param0);
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(165)</p>
     */
    @ComProperty(name = "ShowRevisions", dispId = 0x13c)
    Boolean getShowRevisions();
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(166)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowRevisions", dispId = 0x13c)
    void setShowRevisions(Boolean param0);
            
    /**
     * <p>id(0x451)</p>
     * <p>vtableId(167)</p>
     * @param SaveChanges [in, optional] {@code Object}
     * @param OriginalFormat [in, optional] {@code Object}
     * @param RouteDocument [in, optional] {@code Object}
     */
    @ComMethod(name = "Close", dispId = 0x451)
    void Close(Object SaveChanges,
            Object OriginalFormat,
            Object RouteDocument);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(168)</p>
     * @param FileName [in, optional] {@code Object}
     * @param FileFormat [in, optional] {@code Object}
     * @param LockComments [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param AddToRecentFiles [in, optional] {@code Object}
     * @param WritePassword [in, optional] {@code Object}
     * @param ReadOnlyRecommended [in, optional] {@code Object}
     * @param EmbedTrueTypeFonts [in, optional] {@code Object}
     * @param SaveNativePictureFormat [in, optional] {@code Object}
     * @param SaveFormsData [in, optional] {@code Object}
     * @param SaveAsAOCELetter [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveAs2000", dispId = 0x66)
    void SaveAs2000(Object FileName,
            Object FileFormat,
            Object LockComments,
            Object Password,
            Object AddToRecentFiles,
            Object WritePassword,
            Object ReadOnlyRecommended,
            Object EmbedTrueTypeFonts,
            Object SaveNativePictureFormat,
            Object SaveFormsData,
            Object SaveAsAOCELetter);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(169)</p>
     */
    @ComMethod(name = "Repaginate", dispId = 0x67)
    void Repaginate();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(170)</p>
     */
    @ComMethod(name = "FitToPages", dispId = 0x68)
    void FitToPages();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(171)</p>
     */
    @ComMethod(name = "ManualHyphenation", dispId = 0x69)
    void ManualHyphenation();
            
    /**
     * <p>id(0xffff)</p>
     * <p>vtableId(172)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(173)</p>
     */
    @ComMethod(name = "DataForm", dispId = 0x6a)
    void DataForm();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(174)</p>
     */
    @ComMethod(name = "Route", dispId = 0x6b)
    void Route();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(175)</p>
     */
    @ComMethod(name = "Save", dispId = 0x6c)
    void Save();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(176)</p>
     * @param Background [in, optional] {@code Object}
     * @param Append [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
     * @param OutputFileName [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Item [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Pages [in, optional] {@code Object}
     * @param PageType [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param ActivePrinterMacGX [in, optional] {@code Object}
     * @param ManualDuplexPrint [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOutOld", dispId = 0x6d)
    void PrintOutOld(Object Background,
            Object Append,
            Object Range,
            Object OutputFileName,
            Object From,
            Object To,
            Object Item,
            Object Copies,
            Object Pages,
            Object PageType,
            Object PrintToFile,
            Object Collate,
            Object ActivePrinterMacGX,
            Object ManualDuplexPrint);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(177)</p>
     */
    @ComMethod(name = "SendMail", dispId = 0x6e)
    void SendMail();
            
    /**
     * <p>id(0x7d0)</p>
     * <p>vtableId(178)</p>
     * @param Start [in, optional] {@code Object}
     * @param End [in, optional] {@code Object}
     */
    @ComMethod(name = "Range", dispId = 0x7d0)
    Range Range(Object Start,
            Object End);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(179)</p>
     * @param Which [in] {@code WdAutoMacros}
     */
    @ComMethod(name = "RunAutoMacro", dispId = 0x70)
    void RunAutoMacro(WdAutoMacros Which);
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(180)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x71)
    void Activate();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(181)</p>
     */
    @ComMethod(name = "PrintPreview", dispId = 0x72)
    void PrintPreview();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(182)</p>
     * @param What [in, optional] {@code Object}
     * @param Which [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     * @param Name [in, optional] {@code Object}
     */
    @ComMethod(name = "GoTo", dispId = 0x73)
    Range GoTo(Object What,
            Object Which,
            Object Count,
            Object Name);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(183)</p>
     * @param Times [in, optional] {@code Object}
     */
    @ComMethod(name = "Undo", dispId = 0x74)
    Boolean Undo(Object Times);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(184)</p>
     * @param Times [in, optional] {@code Object}
     */
    @ComMethod(name = "Redo", dispId = 0x75)
    Boolean Redo(Object Times);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(185)</p>
     * @param Statistic [in] {@code WdStatistic}
     * @param IncludeFootnotesAndEndnotes [in, optional] {@code Object}
     */
    @ComMethod(name = "ComputeStatistics", dispId = 0x76)
    Integer ComputeStatistics(WdStatistic Statistic,
            Object IncludeFootnotesAndEndnotes);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(186)</p>
     */
    @ComMethod(name = "MakeCompatibilityDefault", dispId = 0x77)
    void MakeCompatibilityDefault();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(187)</p>
     * @param Type [in] {@code WdProtectionType}
     * @param NoReset [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     */
    @ComMethod(name = "Protect2002", dispId = 0x78)
    void Protect2002(WdProtectionType Type,
            Object NoReset,
            Object Password);
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(188)</p>
     * @param Password [in, optional] {@code Object}
     */
    @ComMethod(name = "Unprotect", dispId = 0x79)
    void Unprotect(Object Password);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(189)</p>
     * @param Type [in] {@code WdEditionType}
     * @param Option [in] {@code WdEditionOption}
     * @param Name [in] {@code String}
     * @param Format [in, optional] {@code Object}
     */
    @ComMethod(name = "EditionOptions", dispId = 0x7a)
    void EditionOptions(WdEditionType Type,
            WdEditionOption Option,
            String Name,
            Object Format);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(190)</p>
     * @param LetterContent [in, optional] {@code Object}
     * @param WizardMode [in, optional] {@code Object}
     */
    @ComMethod(name = "RunLetterWizard", dispId = 0x7b)
    void RunLetterWizard(Object LetterContent,
            Object WizardMode);
            
    /**
     * <p>id(0x7c)</p>
     * <p>vtableId(191)</p>
     */
    @ComMethod(name = "GetLetterContent", dispId = 0x7c)
    LetterContent GetLetterContent();
            
    /**
     * <p>id(0x7d)</p>
     * <p>vtableId(192)</p>
     * @param LetterContent [in] {@code Object}
     */
    @ComMethod(name = "SetLetterContent", dispId = 0x7d)
    void SetLetterContent(Object LetterContent);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(193)</p>
     * @param Template [in] {@code String}
     */
    @ComMethod(name = "CopyStylesFromTemplate", dispId = 0x7e)
    void CopyStylesFromTemplate(String Template);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(194)</p>
     */
    @ComMethod(name = "UpdateStyles", dispId = 0x7f)
    void UpdateStyles();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(195)</p>
     */
    @ComMethod(name = "CheckGrammar", dispId = 0x83)
    void CheckGrammar();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(196)</p>
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param AlwaysSuggest [in, optional] {@code Object}
     * @param CustomDictionary2 [in, optional] {@code Object}
     * @param CustomDictionary3 [in, optional] {@code Object}
     * @param CustomDictionary4 [in, optional] {@code Object}
     * @param CustomDictionary5 [in, optional] {@code Object}
     * @param CustomDictionary6 [in, optional] {@code Object}
     * @param CustomDictionary7 [in, optional] {@code Object}
     * @param CustomDictionary8 [in, optional] {@code Object}
     * @param CustomDictionary9 [in, optional] {@code Object}
     * @param CustomDictionary10 [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x84)
    void CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object CustomDictionary2,
            Object CustomDictionary3,
            Object CustomDictionary4,
            Object CustomDictionary5,
            Object CustomDictionary6,
            Object CustomDictionary7,
            Object CustomDictionary8,
            Object CustomDictionary9,
            Object CustomDictionary10);
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(197)</p>
     * @param Address [in, optional] {@code Object}
     * @param SubAddress [in, optional] {@code Object}
     * @param NewWindow [in, optional] {@code Object}
     * @param AddHistory [in, optional] {@code Object}
     * @param ExtraInfo [in, optional] {@code Object}
     * @param Method [in, optional] {@code Object}
     * @param HeaderInfo [in, optional] {@code Object}
     */
    @ComMethod(name = "FollowHyperlink", dispId = 0x87)
    void FollowHyperlink(Object Address,
            Object SubAddress,
            Object NewWindow,
            Object AddHistory,
            Object ExtraInfo,
            Object Method,
            Object HeaderInfo);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(198)</p>
     */
    @ComMethod(name = "AddToFavorites", dispId = 0x88)
    void AddToFavorites();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(199)</p>
     */
    @ComMethod(name = "Reload", dispId = 0x89)
    void Reload();
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(200)</p>
     * @param Length [in, optional] {@code Object}
     * @param Mode [in, optional] {@code Object}
     * @param UpdateProperties [in, optional] {@code Object}
     */
    @ComMethod(name = "AutoSummarize", dispId = 0x8a)
    Range AutoSummarize(Object Length,
            Object Mode,
            Object UpdateProperties);
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(201)</p>
     * @param NumberType [in, optional] {@code Object}
     */
    @ComMethod(name = "RemoveNumbers", dispId = 0x8c)
    void RemoveNumbers(Object NumberType);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(202)</p>
     * @param NumberType [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertNumbersToText", dispId = 0x8d)
    void ConvertNumbersToText(Object NumberType);
            
    /**
     * <p>id(0x8e)</p>
     * <p>vtableId(203)</p>
     * @param NumberType [in, optional] {@code Object}
     * @param Level [in, optional] {@code Object}
     */
    @ComMethod(name = "CountNumberedItems", dispId = 0x8e)
    Integer CountNumberedItems(Object NumberType,
            Object Level);
            
    /**
     * <p>id(0x8f)</p>
     * <p>vtableId(204)</p>
     */
    @ComMethod(name = "Post", dispId = 0x8f)
    void Post();
            
    /**
     * <p>id(0x90)</p>
     * <p>vtableId(205)</p>
     */
    @ComMethod(name = "ToggleFormsDesign", dispId = 0x90)
    void ToggleFormsDesign();
            
    /**
     * <p>id(0x91)</p>
     * <p>vtableId(206)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "Compare2000", dispId = 0x91)
    void Compare2000(String Name);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(207)</p>
     */
    @ComMethod(name = "UpdateSummaryProperties", dispId = 0x92)
    void UpdateSummaryProperties();
            
    /**
     * <p>id(0x93)</p>
     * <p>vtableId(208)</p>
     * @param ReferenceType [in] {@code Object}
     */
    @ComMethod(name = "GetCrossReferenceItems", dispId = 0x93)
    Object GetCrossReferenceItems(Object ReferenceType);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(209)</p>
     */
    @ComMethod(name = "AutoFormat", dispId = 0x94)
    void AutoFormat();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(210)</p>
     */
    @ComMethod(name = "ViewCode", dispId = 0x95)
    void ViewCode();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(211)</p>
     */
    @ComMethod(name = "ViewPropertyBrowser", dispId = 0x96)
    void ViewPropertyBrowser();
            
    /**
     * <p>id(0xfa)</p>
     * <p>vtableId(212)</p>
     */
    @ComMethod(name = "ForwardMailer", dispId = 0xfa)
    void ForwardMailer();
            
    /**
     * <p>id(0xfb)</p>
     * <p>vtableId(213)</p>
     */
    @ComMethod(name = "Reply", dispId = 0xfb)
    void Reply();
            
    /**
     * <p>id(0xfc)</p>
     * <p>vtableId(214)</p>
     */
    @ComMethod(name = "ReplyAll", dispId = 0xfc)
    void ReplyAll();
            
    /**
     * <p>id(0xfd)</p>
     * <p>vtableId(215)</p>
     * @param FileFormat [in, optional] {@code Object}
     * @param Priority [in, optional] {@code Object}
     */
    @ComMethod(name = "SendMailer", dispId = 0xfd)
    void SendMailer(Object FileFormat,
            Object Priority);
            
    /**
     * <p>id(0xfe)</p>
     * <p>vtableId(216)</p>
     */
    @ComMethod(name = "UndoClear", dispId = 0xfe)
    void UndoClear();
            
    /**
     * <p>id(0xff)</p>
     * <p>vtableId(217)</p>
     */
    @ComMethod(name = "PresentIt", dispId = 0xff)
    void PresentIt();
            
    /**
     * <p>id(0x100)</p>
     * <p>vtableId(218)</p>
     * @param Address [in] {@code String}
     * @param Subject [in, optional] {@code Object}
     */
    @ComMethod(name = "SendFax", dispId = 0x100)
    void SendFax(String Address,
            Object Subject);
            
    /**
     * <p>id(0x101)</p>
     * <p>vtableId(219)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "Merge2000", dispId = 0x101)
    void Merge2000(String FileName);
            
    /**
     * <p>id(0x102)</p>
     * <p>vtableId(220)</p>
     */
    @ComMethod(name = "ClosePrintPreview", dispId = 0x102)
    void ClosePrintPreview();
            
    /**
     * <p>id(0x103)</p>
     * <p>vtableId(221)</p>
     */
    @ComMethod(name = "CheckConsistency", dispId = 0x103)
    void CheckConsistency();
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(222)</p>
     * @param DateFormat [in] {@code String}
     * @param IncludeHeaderFooter [in] {@code Boolean}
     * @param PageDesign [in] {@code String}
     * @param LetterStyle [in] {@code WdLetterStyle}
     * @param Letterhead [in] {@code Boolean}
     * @param LetterheadLocation [in] {@code WdLetterheadLocation}
     * @param LetterheadSize [in] {@code Float}
     * @param RecipientName [in] {@code String}
     * @param RecipientAddress [in] {@code String}
     * @param Salutation [in] {@code String}
     * @param SalutationType [in] {@code WdSalutationType}
     * @param RecipientReference [in] {@code String}
     * @param MailingInstructions [in] {@code String}
     * @param AttentionLine [in] {@code String}
     * @param Subject [in] {@code String}
     * @param CCList [in] {@code String}
     * @param ReturnAddress [in] {@code String}
     * @param SenderName [in] {@code String}
     * @param Closing [in] {@code String}
     * @param SenderCompany [in] {@code String}
     * @param SenderJobTitle [in] {@code String}
     * @param SenderInitials [in] {@code String}
     * @param EnclosureNumber [in] {@code Integer}
     * @param InfoBlock [in, optional] {@code Object}
     * @param RecipientCode [in, optional] {@code Object}
     * @param RecipientGender [in, optional] {@code Object}
     * @param ReturnAddressShortForm [in, optional] {@code Object}
     * @param SenderCity [in, optional] {@code Object}
     * @param SenderCode [in, optional] {@code Object}
     * @param SenderGender [in, optional] {@code Object}
     * @param SenderReference [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateLetterContent", dispId = 0x104)
    LetterContent CreateLetterContent(String DateFormat,
            Boolean IncludeHeaderFooter,
            String PageDesign,
            WdLetterStyle LetterStyle,
            Boolean Letterhead,
            WdLetterheadLocation LetterheadLocation,
            Float LetterheadSize,
            String RecipientName,
            String RecipientAddress,
            String Salutation,
            WdSalutationType SalutationType,
            String RecipientReference,
            String MailingInstructions,
            String AttentionLine,
            String Subject,
            String CCList,
            String ReturnAddress,
            String SenderName,
            String Closing,
            String SenderCompany,
            String SenderJobTitle,
            String SenderInitials,
            Integer EnclosureNumber,
            Object InfoBlock,
            Object RecipientCode,
            Object RecipientGender,
            Object ReturnAddressShortForm,
            Object SenderCity,
            Object SenderCode,
            Object SenderGender,
            Object SenderReference);
            
    /**
     * <p>id(0x13d)</p>
     * <p>vtableId(223)</p>
     */
    @ComMethod(name = "AcceptAllRevisions", dispId = 0x13d)
    void AcceptAllRevisions();
            
    /**
     * <p>id(0x13e)</p>
     * <p>vtableId(224)</p>
     */
    @ComMethod(name = "RejectAllRevisions", dispId = 0x13e)
    void RejectAllRevisions();
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(225)</p>
     */
    @ComMethod(name = "DetectLanguage", dispId = 0x97)
    void DetectLanguage();
            
    /**
     * <p>id(0x142)</p>
     * <p>vtableId(226)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "ApplyTheme", dispId = 0x142)
    void ApplyTheme(String Name);
            
    /**
     * <p>id(0x143)</p>
     * <p>vtableId(227)</p>
     */
    @ComMethod(name = "RemoveTheme", dispId = 0x143)
    void RemoveTheme();
            
    /**
     * <p>id(0x145)</p>
     * <p>vtableId(228)</p>
     */
    @ComMethod(name = "WebPagePreview", dispId = 0x145)
    void WebPagePreview();
            
    /**
     * <p>id(0x14b)</p>
     * <p>vtableId(229)</p>
     * @param Encoding [in] {@code eu.doppel_helix.jna.tlb.office2.MsoEncoding}
     */
    @ComMethod(name = "ReloadAs", dispId = 0x14b)
    void ReloadAs(eu.doppel_helix.jna.tlb.office2.MsoEncoding Encoding);
            
    /**
     * <p>id(0x21c)</p>
     * <p>vtableId(230)</p>
     */
    @ComProperty(name = "ActiveTheme", dispId = 0x21c)
    String getActiveTheme();
            
    /**
     * <p>id(0x21d)</p>
     * <p>vtableId(231)</p>
     */
    @ComProperty(name = "ActiveThemeDisplayName", dispId = 0x21d)
    String getActiveThemeDisplayName();
            
    /**
     * <p>id(0x13f)</p>
     * <p>vtableId(232)</p>
     */
    @ComProperty(name = "Email", dispId = 0x13f)
    Email getEmail();
            
    /**
     * <p>id(0x140)</p>
     * <p>vtableId(233)</p>
     */
    @ComProperty(name = "Scripts", dispId = 0x140)
    eu.doppel_helix.jna.tlb.office2.Scripts getScripts();
            
    /**
     * <p>id(0x141)</p>
     * <p>vtableId(234)</p>
     */
    @ComProperty(name = "LanguageDetected", dispId = 0x141)
    Boolean getLanguageDetected();
            
    /**
     * <p>id(0x141)</p>
     * <p>vtableId(235)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LanguageDetected", dispId = 0x141)
    void setLanguageDetected(Boolean param0);
            
    /**
     * <p>id(0x146)</p>
     * <p>vtableId(236)</p>
     */
    @ComProperty(name = "FarEastLineBreakLanguage", dispId = 0x146)
    WdFarEastLineBreakLanguageID getFarEastLineBreakLanguage();
            
    /**
     * <p>id(0x146)</p>
     * <p>vtableId(237)</p>
     * @param param0 [in] {@code WdFarEastLineBreakLanguageID}
     */
    @ComProperty(name = "FarEastLineBreakLanguage", dispId = 0x146)
    void setFarEastLineBreakLanguage(WdFarEastLineBreakLanguageID param0);
            
    /**
     * <p>id(0x147)</p>
     * <p>vtableId(238)</p>
     */
    @ComProperty(name = "Frameset", dispId = 0x147)
    Frameset getFrameset();
            
    /**
     * <p>id(0x148)</p>
     * <p>vtableId(239)</p>
     */
    @ComProperty(name = "ClickAndTypeParagraphStyle", dispId = 0x148)
    Object getClickAndTypeParagraphStyle();
            
    /**
     * <p>id(0x148)</p>
     * <p>vtableId(240)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ClickAndTypeParagraphStyle", dispId = 0x148)
    void setClickAndTypeParagraphStyle(Object param0);
            
    /**
     * <p>id(0x149)</p>
     * <p>vtableId(241)</p>
     */
    @ComProperty(name = "HTMLProject", dispId = 0x149)
    eu.doppel_helix.jna.tlb.office2.HTMLProject getHTMLProject();
            
    /**
     * <p>id(0x14a)</p>
     * <p>vtableId(242)</p>
     */
    @ComProperty(name = "WebOptions", dispId = 0x14a)
    WebOptions getWebOptions();
            
    /**
     * <p>id(0x14c)</p>
     * <p>vtableId(243)</p>
     */
    @ComProperty(name = "OpenEncoding", dispId = 0x14c)
    eu.doppel_helix.jna.tlb.office2.MsoEncoding getOpenEncoding();
            
    /**
     * <p>id(0x14d)</p>
     * <p>vtableId(244)</p>
     */
    @ComProperty(name = "SaveEncoding", dispId = 0x14d)
    eu.doppel_helix.jna.tlb.office2.MsoEncoding getSaveEncoding();
            
    /**
     * <p>id(0x14d)</p>
     * <p>vtableId(245)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoEncoding}
     */
    @ComProperty(name = "SaveEncoding", dispId = 0x14d)
    void setSaveEncoding(eu.doppel_helix.jna.tlb.office2.MsoEncoding param0);
            
    /**
     * <p>id(0x14e)</p>
     * <p>vtableId(246)</p>
     */
    @ComProperty(name = "OptimizeForWord97", dispId = 0x14e)
    Boolean getOptimizeForWord97();
            
    /**
     * <p>id(0x14e)</p>
     * <p>vtableId(247)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OptimizeForWord97", dispId = 0x14e)
    void setOptimizeForWord97(Boolean param0);
            
    /**
     * <p>id(0x14f)</p>
     * <p>vtableId(248)</p>
     */
    @ComProperty(name = "VBASigned", dispId = 0x14f)
    Boolean getVBASigned();
            
    /**
     * <p>id(0x1bc)</p>
     * <p>vtableId(249)</p>
     * @param Background [in, optional] {@code Object}
     * @param Append [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
     * @param OutputFileName [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Item [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Pages [in, optional] {@code Object}
     * @param PageType [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param ActivePrinterMacGX [in, optional] {@code Object}
     * @param ManualDuplexPrint [in, optional] {@code Object}
     * @param PrintZoomColumn [in, optional] {@code Object}
     * @param PrintZoomRow [in, optional] {@code Object}
     * @param PrintZoomPaperWidth [in, optional] {@code Object}
     * @param PrintZoomPaperHeight [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOut2000", dispId = 0x1bc)
    void PrintOut2000(Object Background,
            Object Append,
            Object Range,
            Object OutputFileName,
            Object From,
            Object To,
            Object Item,
            Object Copies,
            Object Pages,
            Object PageType,
            Object PrintToFile,
            Object Collate,
            Object ActivePrinterMacGX,
            Object ManualDuplexPrint,
            Object PrintZoomColumn,
            Object PrintZoomRow,
            Object PrintZoomPaperWidth,
            Object PrintZoomPaperHeight);
            
    /**
     * <p>id(0x1bd)</p>
     * <p>vtableId(250)</p>
     * @param s [in] {@code String}
     */
    @ComMethod(name = "sblt", dispId = 0x1bd)
    void sblt(String s);
            
    /**
     * <p>id(0x1bf)</p>
     * <p>vtableId(251)</p>
     * @param CodePageOrigin [in] {@code Integer}
     */
    @ComMethod(name = "ConvertVietDoc", dispId = 0x1bf)
    void ConvertVietDoc(Integer CodePageOrigin);
            
    /**
     * <p>id(0x1be)</p>
     * <p>vtableId(252)</p>
     * @param Background [in, optional] {@code Object}
     * @param Append [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
     * @param OutputFileName [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Item [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Pages [in, optional] {@code Object}
     * @param PageType [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param ActivePrinterMacGX [in, optional] {@code Object}
     * @param ManualDuplexPrint [in, optional] {@code Object}
     * @param PrintZoomColumn [in, optional] {@code Object}
     * @param PrintZoomRow [in, optional] {@code Object}
     * @param PrintZoomPaperWidth [in, optional] {@code Object}
     * @param PrintZoomPaperHeight [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOut", dispId = 0x1be)
    void PrintOut(Object Background,
            Object Append,
            Object Range,
            Object OutputFileName,
            Object From,
            Object To,
            Object Item,
            Object Copies,
            Object Pages,
            Object PageType,
            Object PrintToFile,
            Object Collate,
            Object ActivePrinterMacGX,
            Object ManualDuplexPrint,
            Object PrintZoomColumn,
            Object PrintZoomRow,
            Object PrintZoomPaperWidth,
            Object PrintZoomPaperHeight);
            
    /**
     * <p>id(0x150)</p>
     * <p>vtableId(253)</p>
     */
    @ComProperty(name = "MailEnvelope", dispId = 0x150)
    eu.doppel_helix.jna.tlb.office2.MsoEnvelope getMailEnvelope();
            
    /**
     * <p>id(0x151)</p>
     * <p>vtableId(254)</p>
     */
    @ComProperty(name = "DisableFeatures", dispId = 0x151)
    Boolean getDisableFeatures();
            
    /**
     * <p>id(0x151)</p>
     * <p>vtableId(255)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisableFeatures", dispId = 0x151)
    void setDisableFeatures(Boolean param0);
            
    /**
     * <p>id(0x152)</p>
     * <p>vtableId(256)</p>
     */
    @ComProperty(name = "DoNotEmbedSystemFonts", dispId = 0x152)
    Boolean getDoNotEmbedSystemFonts();
            
    /**
     * <p>id(0x152)</p>
     * <p>vtableId(257)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DoNotEmbedSystemFonts", dispId = 0x152)
    void setDoNotEmbedSystemFonts(Boolean param0);
            
    /**
     * <p>id(0x153)</p>
     * <p>vtableId(258)</p>
     */
    @ComProperty(name = "Signatures", dispId = 0x153)
    eu.doppel_helix.jna.tlb.office2.SignatureSet getSignatures();
            
    /**
     * <p>id(0x154)</p>
     * <p>vtableId(259)</p>
     */
    @ComProperty(name = "DefaultTargetFrame", dispId = 0x154)
    String getDefaultTargetFrame();
            
    /**
     * <p>id(0x154)</p>
     * <p>vtableId(260)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultTargetFrame", dispId = 0x154)
    void setDefaultTargetFrame(String param0);
            
    /**
     * <p>id(0x156)</p>
     * <p>vtableId(261)</p>
     */
    @ComProperty(name = "HTMLDivisions", dispId = 0x156)
    HTMLDivisions getHTMLDivisions();
            
    /**
     * <p>id(0x157)</p>
     * <p>vtableId(262)</p>
     */
    @ComProperty(name = "DisableFeaturesIntroducedAfter", dispId = 0x157)
    WdDisableFeaturesIntroducedAfter getDisableFeaturesIntroducedAfter();
            
    /**
     * <p>id(0x157)</p>
     * <p>vtableId(263)</p>
     * @param param0 [in] {@code WdDisableFeaturesIntroducedAfter}
     */
    @ComProperty(name = "DisableFeaturesIntroducedAfter", dispId = 0x157)
    void setDisableFeaturesIntroducedAfter(WdDisableFeaturesIntroducedAfter param0);
            
    /**
     * <p>id(0x158)</p>
     * <p>vtableId(264)</p>
     */
    @ComProperty(name = "RemovePersonalInformation", dispId = 0x158)
    Boolean getRemovePersonalInformation();
            
    /**
     * <p>id(0x158)</p>
     * <p>vtableId(265)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RemovePersonalInformation", dispId = 0x158)
    void setRemovePersonalInformation(Boolean param0);
            
    /**
     * <p>id(0x15a)</p>
     * <p>vtableId(266)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x15a)
    SmartTags getSmartTags();
            
    /**
     * <p>id(0x159)</p>
     * <p>vtableId(267)</p>
     * @param Name [in] {@code String}
     * @param AuthorName [in, optional] {@code Object}
     * @param CompareTarget [in, optional] {@code Object}
     * @param DetectFormatChanges [in, optional] {@code Object}
     * @param IgnoreAllComparisonWarnings [in, optional] {@code Object}
     * @param AddToRecentFiles [in, optional] {@code Object}
     */
    @ComMethod(name = "Compare2002", dispId = 0x159)
    void Compare2002(String Name,
            Object AuthorName,
            Object CompareTarget,
            Object DetectFormatChanges,
            Object IgnoreAllComparisonWarnings,
            Object AddToRecentFiles);
            
    /**
     * <p>id(0x15d)</p>
     * <p>vtableId(268)</p>
     * @param SaveChanges [in, optional] {@code Boolean}
     * @param Comments [in, optional] {@code Object}
     * @param MakePublic [in, optional] {@code Boolean}
     */
    @ComMethod(name = "CheckIn", dispId = 0x15d)
    void CheckIn(Boolean SaveChanges,
            Object Comments,
            Boolean MakePublic);
            
    /**
     * <p>id(0x15f)</p>
     * <p>vtableId(269)</p>
     */
    @ComMethod(name = "CanCheckin", dispId = 0x15f)
    Boolean CanCheckin();
            
    /**
     * <p>id(0x16a)</p>
     * <p>vtableId(270)</p>
     * @param FileName [in] {@code String}
     * @param MergeTarget [in, optional] {@code Object}
     * @param DetectFormatChanges [in, optional] {@code Object}
     * @param UseFormattingFrom [in, optional] {@code Object}
     * @param AddToRecentFiles [in, optional] {@code Object}
     */
    @ComMethod(name = "Merge", dispId = 0x16a)
    void Merge(String FileName,
            Object MergeTarget,
            Object DetectFormatChanges,
            Object UseFormattingFrom,
            Object AddToRecentFiles);
            
    /**
     * <p>id(0x15b)</p>
     * <p>vtableId(271)</p>
     */
    @ComProperty(name = "EmbedSmartTags", dispId = 0x15b)
    Boolean getEmbedSmartTags();
            
    /**
     * <p>id(0x15b)</p>
     * <p>vtableId(272)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EmbedSmartTags", dispId = 0x15b)
    void setEmbedSmartTags(Boolean param0);
            
    /**
     * <p>id(0x15c)</p>
     * <p>vtableId(273)</p>
     */
    @ComProperty(name = "SmartTagsAsXMLProps", dispId = 0x15c)
    Boolean getSmartTagsAsXMLProps();
            
    /**
     * <p>id(0x15c)</p>
     * <p>vtableId(274)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SmartTagsAsXMLProps", dispId = 0x15c)
    void setSmartTagsAsXMLProps(Boolean param0);
            
    /**
     * <p>id(0x165)</p>
     * <p>vtableId(275)</p>
     */
    @ComProperty(name = "TextEncoding", dispId = 0x165)
    eu.doppel_helix.jna.tlb.office2.MsoEncoding getTextEncoding();
            
    /**
     * <p>id(0x165)</p>
     * <p>vtableId(276)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoEncoding}
     */
    @ComProperty(name = "TextEncoding", dispId = 0x165)
    void setTextEncoding(eu.doppel_helix.jna.tlb.office2.MsoEncoding param0);
            
    /**
     * <p>id(0x166)</p>
     * <p>vtableId(277)</p>
     */
    @ComProperty(name = "TextLineEnding", dispId = 0x166)
    WdLineEndingType getTextLineEnding();
            
    /**
     * <p>id(0x166)</p>
     * <p>vtableId(278)</p>
     * @param param0 [in] {@code WdLineEndingType}
     */
    @ComProperty(name = "TextLineEnding", dispId = 0x166)
    void setTextLineEnding(WdLineEndingType param0);
            
    /**
     * <p>id(0x161)</p>
     * <p>vtableId(279)</p>
     * @param Recipients [in, optional] {@code Object}
     * @param Subject [in, optional] {@code Object}
     * @param ShowMessage [in, optional] {@code Object}
     * @param IncludeAttachment [in, optional] {@code Object}
     */
    @ComMethod(name = "SendForReview", dispId = 0x161)
    void SendForReview(Object Recipients,
            Object Subject,
            Object ShowMessage,
            Object IncludeAttachment);
            
    /**
     * <p>id(0x162)</p>
     * <p>vtableId(280)</p>
     * @param ShowMessage [in, optional] {@code Object}
     */
    @ComMethod(name = "ReplyWithChanges", dispId = 0x162)
    void ReplyWithChanges(Object ShowMessage);
            
    /**
     * <p>id(0x164)</p>
     * <p>vtableId(281)</p>
     */
    @ComMethod(name = "EndReview", dispId = 0x164)
    void EndReview();
            
    /**
     * <p>id(0x168)</p>
     * <p>vtableId(282)</p>
     */
    @ComProperty(name = "StyleSheets", dispId = 0x168)
    StyleSheets getStyleSheets();
            
    /**
     * <p>id(0x16d)</p>
     * <p>vtableId(283)</p>
     */
    @ComProperty(name = "DefaultTableStyle", dispId = 0x16d)
    Object getDefaultTableStyle();
            
    /**
     * <p>id(0x16f)</p>
     * <p>vtableId(284)</p>
     */
    @ComProperty(name = "PasswordEncryptionProvider", dispId = 0x16f)
    String getPasswordEncryptionProvider();
            
    /**
     * <p>id(0x170)</p>
     * <p>vtableId(285)</p>
     */
    @ComProperty(name = "PasswordEncryptionAlgorithm", dispId = 0x170)
    String getPasswordEncryptionAlgorithm();
            
    /**
     * <p>id(0x171)</p>
     * <p>vtableId(286)</p>
     */
    @ComProperty(name = "PasswordEncryptionKeyLength", dispId = 0x171)
    Integer getPasswordEncryptionKeyLength();
            
    /**
     * <p>id(0x172)</p>
     * <p>vtableId(287)</p>
     */
    @ComProperty(name = "PasswordEncryptionFileProperties", dispId = 0x172)
    Boolean getPasswordEncryptionFileProperties();
            
    /**
     * <p>id(0x169)</p>
     * <p>vtableId(288)</p>
     * @param PasswordEncryptionProvider [in] {@code String}
     * @param PasswordEncryptionAlgorithm [in] {@code String}
     * @param PasswordEncryptionKeyLength [in] {@code Integer}
     * @param PasswordEncryptionFileProperties [in, optional] {@code Object}
     */
    @ComMethod(name = "SetPasswordEncryptionOptions", dispId = 0x169)
    void SetPasswordEncryptionOptions(String PasswordEncryptionProvider,
            String PasswordEncryptionAlgorithm,
            Integer PasswordEncryptionKeyLength,
            Object PasswordEncryptionFileProperties);
            
    /**
     * <p>id(0x16b)</p>
     * <p>vtableId(289)</p>
     */
    @ComMethod(name = "RecheckSmartTags", dispId = 0x16b)
    void RecheckSmartTags();
            
    /**
     * <p>id(0x16c)</p>
     * <p>vtableId(290)</p>
     */
    @ComMethod(name = "RemoveSmartTags", dispId = 0x16c)
    void RemoveSmartTags();
            
    /**
     * <p>id(0x16e)</p>
     * <p>vtableId(291)</p>
     * @param Style [in] {@code Object}
     * @param SetInTemplate [in] {@code Boolean}
     */
    @ComMethod(name = "SetDefaultTableStyle", dispId = 0x16e)
    void SetDefaultTableStyle(Object Style,
            Boolean SetInTemplate);
            
    /**
     * <p>id(0x173)</p>
     * <p>vtableId(292)</p>
     */
    @ComMethod(name = "DeleteAllComments", dispId = 0x173)
    void DeleteAllComments();
            
    /**
     * <p>id(0x174)</p>
     * <p>vtableId(293)</p>
     */
    @ComMethod(name = "AcceptAllRevisionsShown", dispId = 0x174)
    void AcceptAllRevisionsShown();
            
    /**
     * <p>id(0x175)</p>
     * <p>vtableId(294)</p>
     */
    @ComMethod(name = "RejectAllRevisionsShown", dispId = 0x175)
    void RejectAllRevisionsShown();
            
    /**
     * <p>id(0x176)</p>
     * <p>vtableId(295)</p>
     */
    @ComMethod(name = "DeleteAllCommentsShown", dispId = 0x176)
    void DeleteAllCommentsShown();
            
    /**
     * <p>id(0x177)</p>
     * <p>vtableId(296)</p>
     */
    @ComMethod(name = "ResetFormFields", dispId = 0x177)
    void ResetFormFields();
            
    /**
     * <p>id(0x178)</p>
     * <p>vtableId(297)</p>
     * @param FileName [in, optional] {@code Object}
     * @param FileFormat [in, optional] {@code Object}
     * @param LockComments [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param AddToRecentFiles [in, optional] {@code Object}
     * @param WritePassword [in, optional] {@code Object}
     * @param ReadOnlyRecommended [in, optional] {@code Object}
     * @param EmbedTrueTypeFonts [in, optional] {@code Object}
     * @param SaveNativePictureFormat [in, optional] {@code Object}
     * @param SaveFormsData [in, optional] {@code Object}
     * @param SaveAsAOCELetter [in, optional] {@code Object}
     * @param Encoding [in, optional] {@code Object}
     * @param InsertLineBreaks [in, optional] {@code Object}
     * @param AllowSubstitutions [in, optional] {@code Object}
     * @param LineEnding [in, optional] {@code Object}
     * @param AddBiDiMarks [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveAs", dispId = 0x178)
    void SaveAs(Object FileName,
            Object FileFormat,
            Object LockComments,
            Object Password,
            Object AddToRecentFiles,
            Object WritePassword,
            Object ReadOnlyRecommended,
            Object EmbedTrueTypeFonts,
            Object SaveNativePictureFormat,
            Object SaveFormsData,
            Object SaveAsAOCELetter,
            Object Encoding,
            Object InsertLineBreaks,
            Object AllowSubstitutions,
            Object LineEnding,
            Object AddBiDiMarks);
            
    /**
     * <p>id(0x179)</p>
     * <p>vtableId(298)</p>
     */
    @ComProperty(name = "EmbedLinguisticData", dispId = 0x179)
    Boolean getEmbedLinguisticData();
            
    /**
     * <p>id(0x179)</p>
     * <p>vtableId(299)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EmbedLinguisticData", dispId = 0x179)
    void setEmbedLinguisticData(Boolean param0);
            
    /**
     * <p>id(0x1c0)</p>
     * <p>vtableId(300)</p>
     */
    @ComProperty(name = "FormattingShowFont", dispId = 0x1c0)
    Boolean getFormattingShowFont();
            
    /**
     * <p>id(0x1c0)</p>
     * <p>vtableId(301)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FormattingShowFont", dispId = 0x1c0)
    void setFormattingShowFont(Boolean param0);
            
    /**
     * <p>id(0x1c1)</p>
     * <p>vtableId(302)</p>
     */
    @ComProperty(name = "FormattingShowClear", dispId = 0x1c1)
    Boolean getFormattingShowClear();
            
    /**
     * <p>id(0x1c1)</p>
     * <p>vtableId(303)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FormattingShowClear", dispId = 0x1c1)
    void setFormattingShowClear(Boolean param0);
            
    /**
     * <p>id(0x1c2)</p>
     * <p>vtableId(304)</p>
     */
    @ComProperty(name = "FormattingShowParagraph", dispId = 0x1c2)
    Boolean getFormattingShowParagraph();
            
    /**
     * <p>id(0x1c2)</p>
     * <p>vtableId(305)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FormattingShowParagraph", dispId = 0x1c2)
    void setFormattingShowParagraph(Boolean param0);
            
    /**
     * <p>id(0x1c3)</p>
     * <p>vtableId(306)</p>
     */
    @ComProperty(name = "FormattingShowNumbering", dispId = 0x1c3)
    Boolean getFormattingShowNumbering();
            
    /**
     * <p>id(0x1c3)</p>
     * <p>vtableId(307)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FormattingShowNumbering", dispId = 0x1c3)
    void setFormattingShowNumbering(Boolean param0);
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(308)</p>
     */
    @ComProperty(name = "FormattingShowFilter", dispId = 0x1c4)
    WdShowFilter getFormattingShowFilter();
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(309)</p>
     * @param param0 [in] {@code WdShowFilter}
     */
    @ComProperty(name = "FormattingShowFilter", dispId = 0x1c4)
    void setFormattingShowFilter(WdShowFilter param0);
            
    /**
     * <p>id(0x17a)</p>
     * <p>vtableId(310)</p>
     */
    @ComMethod(name = "CheckNewSmartTags", dispId = 0x17a)
    void CheckNewSmartTags();
            
    /**
     * <p>id(0x1c5)</p>
     * <p>vtableId(311)</p>
     */
    @ComProperty(name = "Permission", dispId = 0x1c5)
    eu.doppel_helix.jna.tlb.office2.Permission getPermission();
            
    /**
     * <p>id(0x1cc)</p>
     * <p>vtableId(312)</p>
     */
    @ComProperty(name = "XMLNodes", dispId = 0x1cc)
    XMLNodes getXMLNodes();
            
    /**
     * <p>id(0x1cd)</p>
     * <p>vtableId(313)</p>
     */
    @ComProperty(name = "XMLSchemaReferences", dispId = 0x1cd)
    XMLSchemaReferences getXMLSchemaReferences();
            
    /**
     * <p>id(0x1ce)</p>
     * <p>vtableId(314)</p>
     */
    @ComProperty(name = "SmartDocument", dispId = 0x1ce)
    eu.doppel_helix.jna.tlb.office2.SmartDocument getSmartDocument();
            
    /**
     * <p>id(0x1cf)</p>
     * <p>vtableId(315)</p>
     */
    @ComProperty(name = "SharedWorkspace", dispId = 0x1cf)
    eu.doppel_helix.jna.tlb.office2.SharedWorkspace getSharedWorkspace();
            
    /**
     * <p>id(0x1d2)</p>
     * <p>vtableId(316)</p>
     */
    @ComProperty(name = "Sync", dispId = 0x1d2)
    eu.doppel_helix.jna.tlb.office2.Sync getSync();
            
    /**
     * <p>id(0x1d7)</p>
     * <p>vtableId(317)</p>
     */
    @ComProperty(name = "EnforceStyle", dispId = 0x1d7)
    Boolean getEnforceStyle();
            
    /**
     * <p>id(0x1d7)</p>
     * <p>vtableId(318)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnforceStyle", dispId = 0x1d7)
    void setEnforceStyle(Boolean param0);
            
    /**
     * <p>id(0x1d8)</p>
     * <p>vtableId(319)</p>
     */
    @ComProperty(name = "AutoFormatOverride", dispId = 0x1d8)
    Boolean getAutoFormatOverride();
            
    /**
     * <p>id(0x1d8)</p>
     * <p>vtableId(320)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatOverride", dispId = 0x1d8)
    void setAutoFormatOverride(Boolean param0);
            
    /**
     * <p>id(0x1d9)</p>
     * <p>vtableId(321)</p>
     */
    @ComProperty(name = "XMLSaveDataOnly", dispId = 0x1d9)
    Boolean getXMLSaveDataOnly();
            
    /**
     * <p>id(0x1d9)</p>
     * <p>vtableId(322)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "XMLSaveDataOnly", dispId = 0x1d9)
    void setXMLSaveDataOnly(Boolean param0);
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(323)</p>
     */
    @ComProperty(name = "XMLHideNamespaces", dispId = 0x1dd)
    Boolean getXMLHideNamespaces();
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(324)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "XMLHideNamespaces", dispId = 0x1dd)
    void setXMLHideNamespaces(Boolean param0);
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(325)</p>
     */
    @ComProperty(name = "XMLShowAdvancedErrors", dispId = 0x1de)
    Boolean getXMLShowAdvancedErrors();
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(326)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "XMLShowAdvancedErrors", dispId = 0x1de)
    void setXMLShowAdvancedErrors(Boolean param0);
            
    /**
     * <p>id(0x1da)</p>
     * <p>vtableId(327)</p>
     */
    @ComProperty(name = "XMLUseXSLTWhenSaving", dispId = 0x1da)
    Boolean getXMLUseXSLTWhenSaving();
            
    /**
     * <p>id(0x1da)</p>
     * <p>vtableId(328)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "XMLUseXSLTWhenSaving", dispId = 0x1da)
    void setXMLUseXSLTWhenSaving(Boolean param0);
            
    /**
     * <p>id(0x1db)</p>
     * <p>vtableId(329)</p>
     */
    @ComProperty(name = "XMLSaveThroughXSLT", dispId = 0x1db)
    String getXMLSaveThroughXSLT();
            
    /**
     * <p>id(0x1db)</p>
     * <p>vtableId(330)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "XMLSaveThroughXSLT", dispId = 0x1db)
    void setXMLSaveThroughXSLT(String param0);
            
    /**
     * <p>id(0x1dc)</p>
     * <p>vtableId(331)</p>
     */
    @ComProperty(name = "DocumentLibraryVersions", dispId = 0x1dc)
    eu.doppel_helix.jna.tlb.office2.DocumentLibraryVersions getDocumentLibraryVersions();
            
    /**
     * <p>id(0x1e1)</p>
     * <p>vtableId(332)</p>
     */
    @ComProperty(name = "ReadingModeLayoutFrozen", dispId = 0x1e1)
    Boolean getReadingModeLayoutFrozen();
            
    /**
     * <p>id(0x1e1)</p>
     * <p>vtableId(333)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReadingModeLayoutFrozen", dispId = 0x1e1)
    void setReadingModeLayoutFrozen(Boolean param0);
            
    /**
     * <p>id(0x1e4)</p>
     * <p>vtableId(334)</p>
     */
    @ComProperty(name = "RemoveDateAndTime", dispId = 0x1e4)
    Boolean getRemoveDateAndTime();
            
    /**
     * <p>id(0x1e4)</p>
     * <p>vtableId(335)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RemoveDateAndTime", dispId = 0x1e4)
    void setRemoveDateAndTime(Boolean param0);
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(336)</p>
     * @param Recipients [in, optional] {@code Object}
     * @param Subject [in, optional] {@code Object}
     * @param ShowMessage [in, optional] {@code Object}
     */
    @ComMethod(name = "SendFaxOverInternet", dispId = 0x1d0)
    void SendFaxOverInternet(Object Recipients,
            Object Subject,
            Object ShowMessage);
            
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(337)</p>
     * @param Path [in] {@code String}
     * @param DataOnly [in, optional] {@code Boolean}
     */
    @ComMethod(name = "TransformDocument", dispId = 0x1f4)
    void TransformDocument(String Path,
            Boolean DataOnly);
            
    /**
     * <p>id(0x1d3)</p>
     * <p>vtableId(338)</p>
     * @param Type [in] {@code WdProtectionType}
     * @param NoReset [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param UseIRM [in, optional] {@code Object}
     * @param EnforceStyleLock [in, optional] {@code Object}
     */
    @ComMethod(name = "Protect", dispId = 0x1d3)
    void Protect(WdProtectionType Type,
            Object NoReset,
            Object Password,
            Object UseIRM,
            Object EnforceStyleLock);
            
    /**
     * <p>id(0x1d4)</p>
     * <p>vtableId(339)</p>
     * @param EditorID [in, optional] {@code Object}
     */
    @ComMethod(name = "SelectAllEditableRanges", dispId = 0x1d4)
    void SelectAllEditableRanges(Object EditorID);
            
    /**
     * <p>id(0x1d5)</p>
     * <p>vtableId(340)</p>
     * @param EditorID [in, optional] {@code Object}
     */
    @ComMethod(name = "DeleteAllEditableRanges", dispId = 0x1d5)
    void DeleteAllEditableRanges(Object EditorID);
            
    /**
     * <p>id(0x1df)</p>
     * <p>vtableId(341)</p>
     */
    @ComMethod(name = "DeleteAllInkAnnotations", dispId = 0x1df)
    void DeleteAllInkAnnotations();
            
    /**
     * <p>id(0x1e2)</p>
     * <p>vtableId(342)</p>
     * @param RichFormat [in] {@code Boolean}
     * @param Url [in] {@code String}
     * @param Title [in] {@code String}
     * @param Description [in] {@code String}
     * @param ID [in] {@code String}
     */
    @ComMethod(name = "AddDocumentWorkspaceHeader", dispId = 0x1e2)
    void AddDocumentWorkspaceHeader(Boolean RichFormat,
            String Url,
            String Title,
            String Description,
            String ID);
            
    /**
     * <p>id(0x1e3)</p>
     * <p>vtableId(343)</p>
     * @param ID [in] {@code String}
     */
    @ComMethod(name = "RemoveDocumentWorkspaceHeader", dispId = 0x1e3)
    void RemoveDocumentWorkspaceHeader(String ID);
            
    /**
     * <p>id(0x1e5)</p>
     * <p>vtableId(344)</p>
     * @param Name [in] {@code String}
     * @param AuthorName [in, optional] {@code Object}
     * @param CompareTarget [in, optional] {@code Object}
     * @param DetectFormatChanges [in, optional] {@code Object}
     * @param IgnoreAllComparisonWarnings [in, optional] {@code Object}
     * @param AddToRecentFiles [in, optional] {@code Object}
     * @param RemovePersonalInformation [in, optional] {@code Object}
     * @param RemoveDateAndTime [in, optional] {@code Object}
     */
    @ComMethod(name = "Compare", dispId = 0x1e5)
    void Compare(String Name,
            Object AuthorName,
            Object CompareTarget,
            Object DetectFormatChanges,
            Object IgnoreAllComparisonWarnings,
            Object AddToRecentFiles,
            Object RemovePersonalInformation,
            Object RemoveDateAndTime);
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(345)</p>
     */
    @ComMethod(name = "RemoveLockedStyles", dispId = 0x1e7)
    void RemoveLockedStyles();
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(346)</p>
     */
    @ComProperty(name = "ChildNodeSuggestions", dispId = 0x1e6)
    XMLChildNodeSuggestions getChildNodeSuggestions();
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(347)</p>
     * @param XPath [in] {@code String}
     * @param PrefixMapping [in, optional] {@code String}
     * @param FastSearchSkippingTextNodes [in, optional] {@code Boolean}
     */
    @ComMethod(name = "SelectSingleNode", dispId = 0x1e8)
    XMLNode SelectSingleNode(String XPath,
            String PrefixMapping,
            Boolean FastSearchSkippingTextNodes);
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(348)</p>
     * @param XPath [in] {@code String}
     * @param PrefixMapping [in, optional] {@code String}
     * @param FastSearchSkippingTextNodes [in, optional] {@code Boolean}
     */
    @ComMethod(name = "SelectNodes", dispId = 0x1e9)
    XMLNodes SelectNodes(String XPath,
            String PrefixMapping,
            Boolean FastSearchSkippingTextNodes);
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(349)</p>
     */
    @ComProperty(name = "XMLSchemaViolations", dispId = 0x1ea)
    XMLNodes getXMLSchemaViolations();
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(350)</p>
     */
    @ComProperty(name = "ReadingLayoutSizeX", dispId = 0x1eb)
    Integer getReadingLayoutSizeX();
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(351)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ReadingLayoutSizeX", dispId = 0x1eb)
    void setReadingLayoutSizeX(Integer param0);
            
    /**
     * <p>id(0x1ec)</p>
     * <p>vtableId(352)</p>
     */
    @ComProperty(name = "ReadingLayoutSizeY", dispId = 0x1ec)
    Integer getReadingLayoutSizeY();
            
    /**
     * <p>id(0x1ec)</p>
     * <p>vtableId(353)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ReadingLayoutSizeY", dispId = 0x1ec)
    void setReadingLayoutSizeY(Integer param0);
            
    /**
     * <p>id(0x1ed)</p>
     * <p>vtableId(354)</p>
     */
    @ComProperty(name = "StyleSortMethod", dispId = 0x1ed)
    WdStyleSort getStyleSortMethod();
            
    /**
     * <p>id(0x1ed)</p>
     * <p>vtableId(355)</p>
     * @param param0 [in] {@code WdStyleSort}
     */
    @ComProperty(name = "StyleSortMethod", dispId = 0x1ed)
    void setStyleSortMethod(WdStyleSort param0);
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(356)</p>
     */
    @ComProperty(name = "ContentTypeProperties", dispId = 0x1f0)
    eu.doppel_helix.jna.tlb.office2.MetaProperties getContentTypeProperties();
            
    /**
     * <p>id(0x1f3)</p>
     * <p>vtableId(357)</p>
     */
    @ComProperty(name = "TrackMoves", dispId = 0x1f3)
    Boolean getTrackMoves();
            
    /**
     * <p>id(0x1f3)</p>
     * <p>vtableId(358)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TrackMoves", dispId = 0x1f3)
    void setTrackMoves(Boolean param0);
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(359)</p>
     */
    @ComProperty(name = "TrackFormatting", dispId = 0x1f6)
    Boolean getTrackFormatting();
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(360)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TrackFormatting", dispId = 0x1f6)
    void setTrackFormatting(Boolean param0);
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(361)</p>
     */
    @ComProperty(name = "Dummy1", dispId = 0x1f7)
    void getDummy1();
            
    /**
     * <p>id(0x1f8)</p>
     * <p>vtableId(362)</p>
     */
    @ComProperty(name = "OMaths", dispId = 0x1f8)
    OMaths getOMaths();
            
    /**
     * <p>id(0x1ef)</p>
     * <p>vtableId(363)</p>
     * @param RemoveDocInfoType [in] {@code WdRemoveDocInfoType}
     */
    @ComMethod(name = "RemoveDocumentInformation", dispId = 0x1ef)
    void RemoveDocumentInformation(WdRemoveDocInfoType RemoveDocInfoType);
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(364)</p>
     * @param SaveChanges [in, optional] {@code Boolean}
     * @param Comments [in, optional] {@code Object}
     * @param MakePublic [in, optional] {@code Boolean}
     * @param VersionType [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckInWithVersion", dispId = 0x1f5)
    void CheckInWithVersion(Boolean SaveChanges,
            Object Comments,
            Boolean MakePublic,
            Object VersionType);
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(365)</p>
     */
    @ComMethod(name = "Dummy2", dispId = 0x1f9)
    void Dummy2();
            
    /**
     * <p>id(0x1fa)</p>
     * <p>vtableId(366)</p>
     */
    @ComProperty(name = "Dummy3", dispId = 0x1fa)
    void getDummy3();
            
    /**
     * <p>id(0x1fb)</p>
     * <p>vtableId(367)</p>
     */
    @ComProperty(name = "ServerPolicy", dispId = 0x1fb)
    eu.doppel_helix.jna.tlb.office2.ServerPolicy getServerPolicy();
            
    /**
     * <p>id(0x1fc)</p>
     * <p>vtableId(368)</p>
     */
    @ComProperty(name = "ContentControls", dispId = 0x1fc)
    ContentControls getContentControls();
            
    /**
     * <p>id(0x1fe)</p>
     * <p>vtableId(369)</p>
     */
    @ComProperty(name = "DocumentInspectors", dispId = 0x1fe)
    eu.doppel_helix.jna.tlb.office2.DocumentInspectors getDocumentInspectors();
            
    /**
     * <p>id(0x1fd)</p>
     * <p>vtableId(370)</p>
     */
    @ComMethod(name = "LockServerFile", dispId = 0x1fd)
    void LockServerFile();
            
    /**
     * <p>id(0x1ff)</p>
     * <p>vtableId(371)</p>
     */
    @ComMethod(name = "GetWorkflowTasks", dispId = 0x1ff)
    eu.doppel_helix.jna.tlb.office2.WorkflowTasks GetWorkflowTasks();
            
    /**
     * <p>id(0x200)</p>
     * <p>vtableId(372)</p>
     */
    @ComMethod(name = "GetWorkflowTemplates", dispId = 0x200)
    eu.doppel_helix.jna.tlb.office2.WorkflowTemplates GetWorkflowTemplates();
            
    /**
     * <p>id(0x202)</p>
     * <p>vtableId(373)</p>
     */
    @ComMethod(name = "Dummy4", dispId = 0x202)
    void Dummy4();
            
    /**
     * <p>id(0x203)</p>
     * <p>vtableId(374)</p>
     * @param SkipIfAbsent [in] {@code Boolean}
     * @param Url [in] {@code String}
     * @param Title [in] {@code String}
     * @param Description [in] {@code String}
     * @param ID [in] {@code String}
     */
    @ComMethod(name = "AddMeetingWorkspaceHeader", dispId = 0x203)
    void AddMeetingWorkspaceHeader(Boolean SkipIfAbsent,
            String Url,
            String Title,
            String Description,
            String ID);
            
    /**
     * <p>id(0x204)</p>
     * <p>vtableId(375)</p>
     */
    @ComProperty(name = "Bibliography", dispId = 0x204)
    Bibliography getBibliography();
            
    /**
     * <p>id(0x205)</p>
     * <p>vtableId(376)</p>
     */
    @ComProperty(name = "LockTheme", dispId = 0x205)
    Boolean getLockTheme();
            
    /**
     * <p>id(0x205)</p>
     * <p>vtableId(377)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LockTheme", dispId = 0x205)
    void setLockTheme(Boolean param0);
            
    /**
     * <p>id(0x206)</p>
     * <p>vtableId(378)</p>
     */
    @ComProperty(name = "LockQuickStyleSet", dispId = 0x206)
    Boolean getLockQuickStyleSet();
            
    /**
     * <p>id(0x206)</p>
     * <p>vtableId(379)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LockQuickStyleSet", dispId = 0x206)
    void setLockQuickStyleSet(Boolean param0);
            
    /**
     * <p>id(0x207)</p>
     * <p>vtableId(380)</p>
     */
    @ComProperty(name = "OriginalDocumentTitle", dispId = 0x207)
    String getOriginalDocumentTitle();
            
    /**
     * <p>id(0x208)</p>
     * <p>vtableId(381)</p>
     */
    @ComProperty(name = "RevisedDocumentTitle", dispId = 0x208)
    String getRevisedDocumentTitle();
            
    /**
     * <p>id(0x209)</p>
     * <p>vtableId(382)</p>
     */
    @ComProperty(name = "CustomXMLParts", dispId = 0x209)
    eu.doppel_helix.jna.tlb.office2.CustomXMLParts getCustomXMLParts();
            
    /**
     * <p>id(0x20a)</p>
     * <p>vtableId(383)</p>
     */
    @ComProperty(name = "FormattingShowNextLevel", dispId = 0x20a)
    Boolean getFormattingShowNextLevel();
            
    /**
     * <p>id(0x20a)</p>
     * <p>vtableId(384)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FormattingShowNextLevel", dispId = 0x20a)
    void setFormattingShowNextLevel(Boolean param0);
            
    /**
     * <p>id(0x20b)</p>
     * <p>vtableId(385)</p>
     */
    @ComProperty(name = "FormattingShowUserStyleName", dispId = 0x20b)
    Boolean getFormattingShowUserStyleName();
            
    /**
     * <p>id(0x20b)</p>
     * <p>vtableId(386)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FormattingShowUserStyleName", dispId = 0x20b)
    void setFormattingShowUserStyleName(Boolean param0);
            
    /**
     * <p>id(0x20c)</p>
     * <p>vtableId(387)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "SaveAsQuickStyleSet", dispId = 0x20c)
    void SaveAsQuickStyleSet(String FileName);
            
    /**
     * <p>id(0x20d)</p>
     * <p>vtableId(388)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "ApplyQuickStyleSet", dispId = 0x20d)
    void ApplyQuickStyleSet(String Name);
            
    /**
     * <p>id(0x20e)</p>
     * <p>vtableId(389)</p>
     */
    @ComProperty(name = "Research", dispId = 0x20e)
    Research getResearch();
            
    /**
     * <p>id(0x20f)</p>
     * <p>vtableId(390)</p>
     */
    @ComProperty(name = "Final", dispId = 0x20f)
    Boolean get_Final();
            
    /**
     * <p>id(0x20f)</p>
     * <p>vtableId(391)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Final", dispId = 0x20f)
    void set_Final(Boolean param0);
            
    /**
     * <p>id(0x210)</p>
     * <p>vtableId(392)</p>
     */
    @ComProperty(name = "OMathBreakBin", dispId = 0x210)
    WdOMathBreakBin getOMathBreakBin();
            
    /**
     * <p>id(0x210)</p>
     * <p>vtableId(393)</p>
     * @param param0 [in] {@code WdOMathBreakBin}
     */
    @ComProperty(name = "OMathBreakBin", dispId = 0x210)
    void setOMathBreakBin(WdOMathBreakBin param0);
            
    /**
     * <p>id(0x211)</p>
     * <p>vtableId(394)</p>
     */
    @ComProperty(name = "OMathBreakSub", dispId = 0x211)
    WdOMathBreakSub getOMathBreakSub();
            
    /**
     * <p>id(0x211)</p>
     * <p>vtableId(395)</p>
     * @param param0 [in] {@code WdOMathBreakSub}
     */
    @ComProperty(name = "OMathBreakSub", dispId = 0x211)
    void setOMathBreakSub(WdOMathBreakSub param0);
            
    /**
     * <p>id(0x212)</p>
     * <p>vtableId(396)</p>
     */
    @ComProperty(name = "OMathJc", dispId = 0x212)
    WdOMathJc getOMathJc();
            
    /**
     * <p>id(0x212)</p>
     * <p>vtableId(397)</p>
     * @param param0 [in] {@code WdOMathJc}
     */
    @ComProperty(name = "OMathJc", dispId = 0x212)
    void setOMathJc(WdOMathJc param0);
            
    /**
     * <p>id(0x213)</p>
     * <p>vtableId(398)</p>
     */
    @ComProperty(name = "OMathLeftMargin", dispId = 0x213)
    Float getOMathLeftMargin();
            
    /**
     * <p>id(0x213)</p>
     * <p>vtableId(399)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "OMathLeftMargin", dispId = 0x213)
    void setOMathLeftMargin(Float param0);
            
    /**
     * <p>id(0x214)</p>
     * <p>vtableId(400)</p>
     */
    @ComProperty(name = "OMathRightMargin", dispId = 0x214)
    Float getOMathRightMargin();
            
    /**
     * <p>id(0x214)</p>
     * <p>vtableId(401)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "OMathRightMargin", dispId = 0x214)
    void setOMathRightMargin(Float param0);
            
    /**
     * <p>id(0x217)</p>
     * <p>vtableId(402)</p>
     */
    @ComProperty(name = "OMathWrap", dispId = 0x217)
    Float getOMathWrap();
            
    /**
     * <p>id(0x217)</p>
     * <p>vtableId(403)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "OMathWrap", dispId = 0x217)
    void setOMathWrap(Float param0);
            
    /**
     * <p>id(0x218)</p>
     * <p>vtableId(404)</p>
     */
    @ComProperty(name = "OMathIntSubSupLim", dispId = 0x218)
    Boolean getOMathIntSubSupLim();
            
    /**
     * <p>id(0x218)</p>
     * <p>vtableId(405)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OMathIntSubSupLim", dispId = 0x218)
    void setOMathIntSubSupLim(Boolean param0);
            
    /**
     * <p>id(0x219)</p>
     * <p>vtableId(406)</p>
     */
    @ComProperty(name = "OMathNarySupSubLim", dispId = 0x219)
    Boolean getOMathNarySupSubLim();
            
    /**
     * <p>id(0x219)</p>
     * <p>vtableId(407)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OMathNarySupSubLim", dispId = 0x219)
    void setOMathNarySupSubLim(Boolean param0);
            
    /**
     * <p>id(0x21b)</p>
     * <p>vtableId(408)</p>
     */
    @ComProperty(name = "OMathSmallFrac", dispId = 0x21b)
    Boolean getOMathSmallFrac();
            
    /**
     * <p>id(0x21b)</p>
     * <p>vtableId(409)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OMathSmallFrac", dispId = 0x21b)
    void setOMathSmallFrac(Boolean param0);
            
    /**
     * <p>id(0x21e)</p>
     * <p>vtableId(410)</p>
     */
    @ComProperty(name = "WordOpenXML", dispId = 0x21e)
    String getWordOpenXML();
            
    /**
     * <p>id(0x221)</p>
     * <p>vtableId(411)</p>
     */
    @ComProperty(name = "DocumentTheme", dispId = 0x221)
    eu.doppel_helix.jna.tlb.office2.OfficeTheme getDocumentTheme();
            
    /**
     * <p>id(0x222)</p>
     * <p>vtableId(412)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "ApplyDocumentTheme", dispId = 0x222)
    void ApplyDocumentTheme(String FileName);
            
    /**
     * <p>id(0x224)</p>
     * <p>vtableId(413)</p>
     */
    @ComProperty(name = "HasVBProject", dispId = 0x224)
    Boolean getHasVBProject();
            
    /**
     * <p>id(0x225)</p>
     * <p>vtableId(414)</p>
     * @param Node [in] {@code eu.doppel_helix.jna.tlb.office2.CustomXMLNode}
     */
    @ComMethod(name = "SelectLinkedControls", dispId = 0x225)
    ContentControls SelectLinkedControls(eu.doppel_helix.jna.tlb.office2.CustomXMLNode Node);
            
    /**
     * <p>id(0x226)</p>
     * <p>vtableId(415)</p>
     * @param Stream [in, optional] {@code eu.doppel_helix.jna.tlb.office2.CustomXMLPart}
     */
    @ComMethod(name = "SelectUnlinkedControls", dispId = 0x226)
    ContentControls SelectUnlinkedControls(eu.doppel_helix.jna.tlb.office2.CustomXMLPart Stream);
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(416)</p>
     * @param Title [in] {@code String}
     */
    @ComMethod(name = "SelectContentControlsByTitle", dispId = 0x227)
    ContentControls SelectContentControlsByTitle(String Title);
            
    /**
     * <p>id(0x228)</p>
     * <p>vtableId(417)</p>
     * @param OutputFileName [in] {@code String}
     * @param ExportFormat [in] {@code WdExportFormat}
     * @param OpenAfterExport [in, optional] {@code Boolean}
     * @param OptimizeFor [in, optional] {@code WdExportOptimizeFor}
     * @param Range [in, optional] {@code WdExportRange}
     * @param From [in, optional] {@code Integer}
     * @param To [in, optional] {@code Integer}
     * @param Item [in, optional] {@code WdExportItem}
     * @param IncludeDocProps [in, optional] {@code Boolean}
     * @param KeepIRM [in, optional] {@code Boolean}
     * @param CreateBookmarks [in, optional] {@code WdExportCreateBookmarks}
     * @param DocStructureTags [in, optional] {@code Boolean}
     * @param BitmapMissingFonts [in, optional] {@code Boolean}
     * @param UseISO19005_1 [in, optional] {@code Boolean}
     * @param FixedFormatExtClassPtr [in, optional] {@code Object}
     */
    @ComMethod(name = "ExportAsFixedFormat", dispId = 0x228)
    void ExportAsFixedFormat(String OutputFileName,
            WdExportFormat ExportFormat,
            Boolean OpenAfterExport,
            WdExportOptimizeFor OptimizeFor,
            WdExportRange Range,
            Integer From,
            Integer To,
            WdExportItem Item,
            Boolean IncludeDocProps,
            Boolean KeepIRM,
            WdExportCreateBookmarks CreateBookmarks,
            Boolean DocStructureTags,
            Boolean BitmapMissingFonts,
            Boolean UseISO19005_1,
            Object FixedFormatExtClassPtr);
            
    /**
     * <p>id(0x229)</p>
     * <p>vtableId(418)</p>
     */
    @ComMethod(name = "FreezeLayout", dispId = 0x229)
    void FreezeLayout();
            
    /**
     * <p>id(0x22a)</p>
     * <p>vtableId(419)</p>
     */
    @ComMethod(name = "UnfreezeLayout", dispId = 0x22a)
    void UnfreezeLayout();
            
    /**
     * <p>id(0x22b)</p>
     * <p>vtableId(420)</p>
     */
    @ComProperty(name = "OMathFontName", dispId = 0x22b)
    String getOMathFontName();
            
    /**
     * <p>id(0x22b)</p>
     * <p>vtableId(421)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OMathFontName", dispId = 0x22b)
    void setOMathFontName(String param0);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(422)</p>
     */
    @ComMethod(name = "DowngradeDocument", dispId = 0x22e)
    void DowngradeDocument();
            
    /**
     * <p>id(0x22f)</p>
     * <p>vtableId(423)</p>
     */
    @ComProperty(name = "EncryptionProvider", dispId = 0x22f)
    String getEncryptionProvider();
            
    /**
     * <p>id(0x22f)</p>
     * <p>vtableId(424)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EncryptionProvider", dispId = 0x22f)
    void setEncryptionProvider(String param0);
            
    /**
     * <p>id(0x230)</p>
     * <p>vtableId(425)</p>
     */
    @ComProperty(name = "UseMathDefaults", dispId = 0x230)
    Boolean getUseMathDefaults();
            
    /**
     * <p>id(0x230)</p>
     * <p>vtableId(426)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseMathDefaults", dispId = 0x230)
    void setUseMathDefaults(Boolean param0);
            
    /**
     * <p>id(0x233)</p>
     * <p>vtableId(427)</p>
     */
    @ComProperty(name = "CurrentRsid", dispId = 0x233)
    Integer getCurrentRsid();
            
    /**
     * <p>id(0x231)</p>
     * <p>vtableId(428)</p>
     */
    @ComMethod(name = "Convert", dispId = 0x231)
    void Convert();
            
    /**
     * <p>id(0x232)</p>
     * <p>vtableId(429)</p>
     * @param Tag [in] {@code String}
     */
    @ComMethod(name = "SelectContentControlsByTag", dispId = 0x232)
    ContentControls SelectContentControlsByTag(String Tag);
            
    /**
     * <p>id(0x28a)</p>
     * <p>vtableId(430)</p>
     */
    @ComMethod(name = "ConvertAutoHyphens", dispId = 0x28a)
    void ConvertAutoHyphens();
            
    /**
     * <p>id(0x234)</p>
     * <p>vtableId(431)</p>
     */
    @ComProperty(name = "DocID", dispId = 0x234)
    Integer getDocID();
            
    /**
     * <p>id(0x236)</p>
     * <p>vtableId(432)</p>
     * @param Style [in] {@code Object}
     */
    @ComMethod(name = "ApplyQuickStyleSet2", dispId = 0x236)
    void ApplyQuickStyleSet2(Object Style);
            
    /**
     * <p>id(0x237)</p>
     * <p>vtableId(433)</p>
     */
    @ComProperty(name = "CompatibilityMode", dispId = 0x237)
    Integer getCompatibilityMode();
            
    /**
     * <p>id(0x238)</p>
     * <p>vtableId(434)</p>
     * @param FileName [in, optional] {@code Object}
     * @param FileFormat [in, optional] {@code Object}
     * @param LockComments [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param AddToRecentFiles [in, optional] {@code Object}
     * @param WritePassword [in, optional] {@code Object}
     * @param ReadOnlyRecommended [in, optional] {@code Object}
     * @param EmbedTrueTypeFonts [in, optional] {@code Object}
     * @param SaveNativePictureFormat [in, optional] {@code Object}
     * @param SaveFormsData [in, optional] {@code Object}
     * @param SaveAsAOCELetter [in, optional] {@code Object}
     * @param Encoding [in, optional] {@code Object}
     * @param InsertLineBreaks [in, optional] {@code Object}
     * @param AllowSubstitutions [in, optional] {@code Object}
     * @param LineEnding [in, optional] {@code Object}
     * @param AddBiDiMarks [in, optional] {@code Object}
     * @param CompatibilityMode [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveAs2", dispId = 0x238)
    void SaveAs2(Object FileName,
            Object FileFormat,
            Object LockComments,
            Object Password,
            Object AddToRecentFiles,
            Object WritePassword,
            Object ReadOnlyRecommended,
            Object EmbedTrueTypeFonts,
            Object SaveNativePictureFormat,
            Object SaveFormsData,
            Object SaveAsAOCELetter,
            Object Encoding,
            Object InsertLineBreaks,
            Object AllowSubstitutions,
            Object LineEnding,
            Object AddBiDiMarks,
            Object CompatibilityMode);
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(435)</p>
     */
    @ComProperty(name = "CoAuthoring", dispId = 0x258)
    CoAuthoring getCoAuthoring();
            
    /**
     * <p>id(0x23b)</p>
     * <p>vtableId(436)</p>
     * @param Mode [in] {@code Integer}
     */
    @ComMethod(name = "SetCompatibilityMode", dispId = 0x23b)
    void SetCompatibilityMode(Integer Mode);
            
    /**
     * <p>id(0x262)</p>
     * <p>vtableId(437)</p>
     */
    @ComProperty(name = "Broadcast", dispId = 0x262)
    Broadcast getBroadcast();
            
    /**
     * <p>id(0x23c)</p>
     * <p>vtableId(438)</p>
     */
    @ComMethod(name = "ReturnToLastReadPosition", dispId = 0x23c)
    Integer ReturnToLastReadPosition();
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(439)</p>
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0x26a)
    Boolean getChartDataPointTrack();
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(440)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0x26a)
    void setChartDataPointTrack(Boolean param0);
            
    /**
     * <p>id(0x26b)</p>
     * <p>vtableId(441)</p>
     */
    @ComProperty(name = "IsInAutosave", dispId = 0x26b)
    Boolean getIsInAutosave();
            
    /**
     * <p>id(0x26d)</p>
     * <p>vtableId(442)</p>
     * @param FileName [in, optional] {@code Object}
     * @param FileFormat [in, optional] {@code Object}
     * @param LockComments [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param AddToRecentFiles [in, optional] {@code Object}
     * @param WritePassword [in, optional] {@code Object}
     * @param ReadOnlyRecommended [in, optional] {@code Object}
     * @param EmbedTrueTypeFonts [in, optional] {@code Object}
     * @param SaveNativePictureFormat [in, optional] {@code Object}
     * @param SaveFormsData [in, optional] {@code Object}
     * @param SaveAsAOCELetter [in, optional] {@code Object}
     * @param Encoding [in, optional] {@code Object}
     * @param InsertLineBreaks [in, optional] {@code Object}
     * @param AllowSubstitutions [in, optional] {@code Object}
     * @param LineEnding [in, optional] {@code Object}
     * @param AddBiDiMarks [in, optional] {@code Object}
     * @param CompatibilityMode [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveCopyAs", dispId = 0x26d)
    void SaveCopyAs(Object FileName,
            Object FileFormat,
            Object LockComments,
            Object Password,
            Object AddToRecentFiles,
            Object WritePassword,
            Object ReadOnlyRecommended,
            Object EmbedTrueTypeFonts,
            Object SaveNativePictureFormat,
            Object SaveFormsData,
            Object SaveAsAOCELetter,
            Object Encoding,
            Object InsertLineBreaks,
            Object AllowSubstitutions,
            Object LineEnding,
            Object AddBiDiMarks,
            Object CompatibilityMode);
            
    
}