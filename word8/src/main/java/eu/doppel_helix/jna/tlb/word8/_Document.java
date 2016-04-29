
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002096B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002096B-0000-0000-C000-000000000046}")
public interface _Document {
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1)
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
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "BuiltInDocumentProperties", dispId = 0x3e8)
    com.sun.jna.platform.win32.COM.util.IDispatch getBuiltInDocumentProperties();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "CustomDocumentProperties", dispId = 0x2)
    com.sun.jna.platform.win32.COM.util.IDispatch getCustomDocumentProperties();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Path", dispId = 0x3)
    String getPath();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Bookmarks", dispId = 0x4)
    Bookmarks getBookmarks();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Tables", dispId = 0x6)
    Tables getTables();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Footnotes", dispId = 0x7)
    Footnotes getFootnotes();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Endnotes", dispId = 0x8)
    Endnotes getEndnotes();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x9)
    Comments getComments();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Type", dispId = 0xa)
    WdDocumentType getType();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "AutoHyphenation", dispId = 0xb)
    Boolean getAutoHyphenation();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "AutoHyphenation", dispId = 0xb)
    void setAutoHyphenation(Boolean param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "HyphenateCaps", dispId = 0xc)
    Boolean getHyphenateCaps();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "HyphenateCaps", dispId = 0xc)
    void setHyphenateCaps(Boolean param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "HyphenationZone", dispId = 0xd)
    Integer getHyphenationZone();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "HyphenationZone", dispId = 0xd)
    void setHyphenationZone(Integer param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "ConsecutiveHyphensLimit", dispId = 0xe)
    Integer getConsecutiveHyphensLimit();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "ConsecutiveHyphensLimit", dispId = 0xe)
    void setConsecutiveHyphensLimit(Integer param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "Sections", dispId = 0xf)
    Sections getSections();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "Paragraphs", dispId = 0x10)
    Paragraphs getParagraphs();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "Words", dispId = 0x11)
    Words getWords();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "Sentences", dispId = 0x12)
    Sentences getSentences();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x13)
    Characters getCharacters();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x14)
    Fields getFields();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "FormFields", dispId = 0x15)
    FormFields getFormFields();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "Styles", dispId = 0x16)
    Styles getStyles();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "Frames", dispId = 0x17)
    Frames getFrames();
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "TablesOfFigures", dispId = 0x19)
    TablesOfFigures getTablesOfFigures();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "Variables", dispId = 0x1a)
    Variables getVariables();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "MailMerge", dispId = 0x1b)
    MailMerge getMailMerge();
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "Envelope", dispId = 0x1c)
    Envelope getEnvelope();
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x1d)
    String getFullName();
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComProperty(name = "Revisions", dispId = 0x1e)
    Revisions getRevisions();
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "TablesOfContents", dispId = 0x1f)
    TablesOfContents getTablesOfContents();
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "TablesOfAuthorities", dispId = 0x20)
    TablesOfAuthorities getTablesOfAuthorities();
            
    /**
     * <p>id(0x44d)</p>
     */
    @ComProperty(name = "PageSetup", dispId = 0x44d)
    PageSetup getPageSetup();
            
    /**
     * <p>id(0x44d)</p>
     */
    @ComProperty(name = "PageSetup", dispId = 0x44d)
    void setPageSetup(PageSetup param0);
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "Windows", dispId = 0x22)
    Windows getWindows();
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "HasRoutingSlip", dispId = 0x23)
    Boolean getHasRoutingSlip();
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "HasRoutingSlip", dispId = 0x23)
    void setHasRoutingSlip(Boolean param0);
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "RoutingSlip", dispId = 0x24)
    RoutingSlip getRoutingSlip();
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "Routed", dispId = 0x25)
    Boolean getRouted();
            
    /**
     * <p>id(0x26)</p>
     */
    @ComProperty(name = "TablesOfAuthoritiesCategories", dispId = 0x26)
    TablesOfAuthoritiesCategories getTablesOfAuthoritiesCategories();
            
    /**
     * <p>id(0x27)</p>
     */
    @ComProperty(name = "Indexes", dispId = 0x27)
    Indexes getIndexes();
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "Saved", dispId = 0x28)
    Boolean getSaved();
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "Saved", dispId = 0x28)
    void setSaved(Boolean param0);
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "Content", dispId = 0x29)
    Range getContent();
            
    /**
     * <p>id(0x2a)</p>
     */
    @ComProperty(name = "ActiveWindow", dispId = 0x2a)
    Window getActiveWindow();
            
    /**
     * <p>id(0x2b)</p>
     */
    @ComProperty(name = "Kind", dispId = 0x2b)
    WdDocumentKind getKind();
            
    /**
     * <p>id(0x2b)</p>
     */
    @ComProperty(name = "Kind", dispId = 0x2b)
    void setKind(WdDocumentKind param0);
            
    /**
     * <p>id(0x2c)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x2c)
    Boolean getReadOnly();
            
    /**
     * <p>id(0x2d)</p>
     */
    @ComProperty(name = "Subdocuments", dispId = 0x2d)
    Subdocuments getSubdocuments();
            
    /**
     * <p>id(0x2e)</p>
     */
    @ComProperty(name = "IsMasterDocument", dispId = 0x2e)
    Boolean getIsMasterDocument();
            
    /**
     * <p>id(0x30)</p>
     */
    @ComProperty(name = "DefaultTabStop", dispId = 0x30)
    Float getDefaultTabStop();
            
    /**
     * <p>id(0x30)</p>
     */
    @ComProperty(name = "DefaultTabStop", dispId = 0x30)
    void setDefaultTabStop(Float param0);
            
    /**
     * <p>id(0x32)</p>
     */
    @ComProperty(name = "EmbedTrueTypeFonts", dispId = 0x32)
    Boolean getEmbedTrueTypeFonts();
            
    /**
     * <p>id(0x32)</p>
     */
    @ComProperty(name = "EmbedTrueTypeFonts", dispId = 0x32)
    void setEmbedTrueTypeFonts(Boolean param0);
            
    /**
     * <p>id(0x33)</p>
     */
    @ComProperty(name = "SaveFormsData", dispId = 0x33)
    Boolean getSaveFormsData();
            
    /**
     * <p>id(0x33)</p>
     */
    @ComProperty(name = "SaveFormsData", dispId = 0x33)
    void setSaveFormsData(Boolean param0);
            
    /**
     * <p>id(0x34)</p>
     */
    @ComProperty(name = "ReadOnlyRecommended", dispId = 0x34)
    Boolean getReadOnlyRecommended();
            
    /**
     * <p>id(0x34)</p>
     */
    @ComProperty(name = "ReadOnlyRecommended", dispId = 0x34)
    void setReadOnlyRecommended(Boolean param0);
            
    /**
     * <p>id(0x35)</p>
     */
    @ComProperty(name = "SaveSubsetFonts", dispId = 0x35)
    Boolean getSaveSubsetFonts();
            
    /**
     * <p>id(0x35)</p>
     */
    @ComProperty(name = "SaveSubsetFonts", dispId = 0x35)
    void setSaveSubsetFonts(Boolean param0);
            
    /**
     * <p>id(0x37)</p>
     */
    @ComProperty(name = "Compatibility", dispId = 0x37)
    Boolean getCompatibility(WdCompatibility Type);
            
    /**
     * <p>id(0x37)</p>
     */
    @ComProperty(name = "Compatibility", dispId = 0x37)
    void setCompatibility(WdCompatibility Type,
            Boolean param1);
            
    /**
     * <p>id(0x38)</p>
     */
    @ComProperty(name = "StoryRanges", dispId = 0x38)
    StoryRanges getStoryRanges();
            
    /**
     * <p>id(0x39)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x39)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x3a)</p>
     */
    @ComProperty(name = "IsSubdocument", dispId = 0x3a)
    Boolean getIsSubdocument();
            
    /**
     * <p>id(0x3b)</p>
     */
    @ComProperty(name = "SaveFormat", dispId = 0x3b)
    Integer getSaveFormat();
            
    /**
     * <p>id(0x3c)</p>
     */
    @ComProperty(name = "ProtectionType", dispId = 0x3c)
    WdProtectionType getProtectionType();
            
    /**
     * <p>id(0x3d)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x3d)
    Hyperlinks getHyperlinks();
            
    /**
     * <p>id(0x3e)</p>
     */
    @ComProperty(name = "Shapes", dispId = 0x3e)
    Shapes getShapes();
            
    /**
     * <p>id(0x3f)</p>
     */
    @ComProperty(name = "ListTemplates", dispId = 0x3f)
    ListTemplates getListTemplates();
            
    /**
     * <p>id(0x40)</p>
     */
    @ComProperty(name = "Lists", dispId = 0x40)
    Lists getLists();
            
    /**
     * <p>id(0x42)</p>
     */
    @ComProperty(name = "UpdateStylesOnOpen", dispId = 0x42)
    Boolean getUpdateStylesOnOpen();
            
    /**
     * <p>id(0x42)</p>
     */
    @ComProperty(name = "UpdateStylesOnOpen", dispId = 0x42)
    void setUpdateStylesOnOpen(Boolean param0);
            
    /**
     * <p>id(0x43)</p>
     */
    @ComProperty(name = "AttachedTemplate", dispId = 0x43)
    Object getAttachedTemplate();
            
    /**
     * <p>id(0x43)</p>
     */
    @ComProperty(name = "AttachedTemplate", dispId = 0x43)
    void setAttachedTemplate(Object param0);
            
    /**
     * <p>id(0x44)</p>
     */
    @ComProperty(name = "InlineShapes", dispId = 0x44)
    InlineShapes getInlineShapes();
            
    /**
     * <p>id(0x45)</p>
     */
    @ComProperty(name = "Background", dispId = 0x45)
    Shape getBackground();
            
    /**
     * <p>id(0x45)</p>
     */
    @ComProperty(name = "Background", dispId = 0x45)
    void setBackground(Shape param0);
            
    /**
     * <p>id(0x46)</p>
     */
    @ComProperty(name = "GrammarChecked", dispId = 0x46)
    Boolean getGrammarChecked();
            
    /**
     * <p>id(0x46)</p>
     */
    @ComProperty(name = "GrammarChecked", dispId = 0x46)
    void setGrammarChecked(Boolean param0);
            
    /**
     * <p>id(0x47)</p>
     */
    @ComProperty(name = "SpellingChecked", dispId = 0x47)
    Boolean getSpellingChecked();
            
    /**
     * <p>id(0x47)</p>
     */
    @ComProperty(name = "SpellingChecked", dispId = 0x47)
    void setSpellingChecked(Boolean param0);
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "ShowGrammaticalErrors", dispId = 0x48)
    Boolean getShowGrammaticalErrors();
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "ShowGrammaticalErrors", dispId = 0x48)
    void setShowGrammaticalErrors(Boolean param0);
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "ShowSpellingErrors", dispId = 0x49)
    Boolean getShowSpellingErrors();
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "ShowSpellingErrors", dispId = 0x49)
    void setShowSpellingErrors(Boolean param0);
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "Versions", dispId = 0x4b)
    Versions getVersions();
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "ShowSummary", dispId = 0x4c)
    Boolean getShowSummary();
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "ShowSummary", dispId = 0x4c)
    void setShowSummary(Boolean param0);
            
    /**
     * <p>id(0x4d)</p>
     */
    @ComProperty(name = "SummaryViewMode", dispId = 0x4d)
    WdSummaryMode getSummaryViewMode();
            
    /**
     * <p>id(0x4d)</p>
     */
    @ComProperty(name = "SummaryViewMode", dispId = 0x4d)
    void setSummaryViewMode(WdSummaryMode param0);
            
    /**
     * <p>id(0x4e)</p>
     */
    @ComProperty(name = "SummaryLength", dispId = 0x4e)
    Integer getSummaryLength();
            
    /**
     * <p>id(0x4e)</p>
     */
    @ComProperty(name = "SummaryLength", dispId = 0x4e)
    void setSummaryLength(Integer param0);
            
    /**
     * <p>id(0x4f)</p>
     */
    @ComProperty(name = "PrintFractionalWidths", dispId = 0x4f)
    Boolean getPrintFractionalWidths();
            
    /**
     * <p>id(0x4f)</p>
     */
    @ComProperty(name = "PrintFractionalWidths", dispId = 0x4f)
    void setPrintFractionalWidths(Boolean param0);
            
    /**
     * <p>id(0x50)</p>
     */
    @ComProperty(name = "PrintPostScriptOverText", dispId = 0x50)
    Boolean getPrintPostScriptOverText();
            
    /**
     * <p>id(0x50)</p>
     */
    @ComProperty(name = "PrintPostScriptOverText", dispId = 0x50)
    void setPrintPostScriptOverText(Boolean param0);
            
    /**
     * <p>id(0x52)</p>
     */
    @ComProperty(name = "Container", dispId = 0x52)
    com.sun.jna.platform.win32.COM.util.IDispatch getContainer();
            
    /**
     * <p>id(0x53)</p>
     */
    @ComProperty(name = "PrintFormsData", dispId = 0x53)
    Boolean getPrintFormsData();
            
    /**
     * <p>id(0x53)</p>
     */
    @ComProperty(name = "PrintFormsData", dispId = 0x53)
    void setPrintFormsData(Boolean param0);
            
    /**
     * <p>id(0x54)</p>
     */
    @ComProperty(name = "ListParagraphs", dispId = 0x54)
    ListParagraphs getListParagraphs();
            
    /**
     * <p>id(0x55)</p>
     */
    @ComProperty(name = "Password", dispId = 0x55)
    void setPassword(String param0);
            
    /**
     * <p>id(0x56)</p>
     */
    @ComProperty(name = "WritePassword", dispId = 0x56)
    void setWritePassword(String param0);
            
    /**
     * <p>id(0x57)</p>
     */
    @ComProperty(name = "HasPassword", dispId = 0x57)
    Boolean getHasPassword();
            
    /**
     * <p>id(0x58)</p>
     */
    @ComProperty(name = "WriteReserved", dispId = 0x58)
    Boolean getWriteReserved();
            
    /**
     * <p>id(0x5a)</p>
     */
    @ComProperty(name = "ActiveWritingStyle", dispId = 0x5a)
    String getActiveWritingStyle(Object LanguageID);
            
    /**
     * <p>id(0x5a)</p>
     */
    @ComProperty(name = "ActiveWritingStyle", dispId = 0x5a)
    void setActiveWritingStyle(Object LanguageID,
            String param1);
            
    /**
     * <p>id(0x5c)</p>
     */
    @ComProperty(name = "UserControl", dispId = 0x5c)
    Boolean getUserControl();
            
    /**
     * <p>id(0x5c)</p>
     */
    @ComProperty(name = "UserControl", dispId = 0x5c)
    void setUserControl(Boolean param0);
            
    /**
     * <p>id(0x5d)</p>
     */
    @ComProperty(name = "HasMailer", dispId = 0x5d)
    Boolean getHasMailer();
            
    /**
     * <p>id(0x5d)</p>
     */
    @ComProperty(name = "HasMailer", dispId = 0x5d)
    void setHasMailer(Boolean param0);
            
    /**
     * <p>id(0x5e)</p>
     */
    @ComProperty(name = "Mailer", dispId = 0x5e)
    Mailer getMailer();
            
    /**
     * <p>id(0x60)</p>
     */
    @ComProperty(name = "ReadabilityStatistics", dispId = 0x60)
    ReadabilityStatistics getReadabilityStatistics();
            
    /**
     * <p>id(0x61)</p>
     */
    @ComProperty(name = "GrammaticalErrors", dispId = 0x61)
    ProofreadingErrors getGrammaticalErrors();
            
    /**
     * <p>id(0x62)</p>
     */
    @ComProperty(name = "SpellingErrors", dispId = 0x62)
    ProofreadingErrors getSpellingErrors();
            
    /**
     * <p>id(0x63)</p>
     */
    @ComProperty(name = "VBProject", dispId = 0x63)
    eu.doppel_helix.jna.tlb.vbide5.VBProject getVBProject();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "FormsDesign", dispId = 0x64)
    Boolean getFormsDesign();
            
    /**
     * <p>id(0x80010000)</p>
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    String get_CodeName();
            
    /**
     * <p>id(0x80010000)</p>
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    void set_CodeName(String param0);
            
    /**
     * <p>id(0x106)</p>
     */
    @ComProperty(name = "CodeName", dispId = 0x106)
    String getCodeName();
            
    /**
     * <p>id(0x12c)</p>
     */
    @ComProperty(name = "SnapToGrid", dispId = 0x12c)
    Boolean getSnapToGrid();
            
    /**
     * <p>id(0x12c)</p>
     */
    @ComProperty(name = "SnapToGrid", dispId = 0x12c)
    void setSnapToGrid(Boolean param0);
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComProperty(name = "SnapToShapes", dispId = 0x12d)
    Boolean getSnapToShapes();
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComProperty(name = "SnapToShapes", dispId = 0x12d)
    void setSnapToShapes(Boolean param0);
            
    /**
     * <p>id(0x12e)</p>
     */
    @ComProperty(name = "GridDistanceHorizontal", dispId = 0x12e)
    Float getGridDistanceHorizontal();
            
    /**
     * <p>id(0x12e)</p>
     */
    @ComProperty(name = "GridDistanceHorizontal", dispId = 0x12e)
    void setGridDistanceHorizontal(Float param0);
            
    /**
     * <p>id(0x12f)</p>
     */
    @ComProperty(name = "GridDistanceVertical", dispId = 0x12f)
    Float getGridDistanceVertical();
            
    /**
     * <p>id(0x12f)</p>
     */
    @ComProperty(name = "GridDistanceVertical", dispId = 0x12f)
    void setGridDistanceVertical(Float param0);
            
    /**
     * <p>id(0x130)</p>
     */
    @ComProperty(name = "GridOriginHorizontal", dispId = 0x130)
    Float getGridOriginHorizontal();
            
    /**
     * <p>id(0x130)</p>
     */
    @ComProperty(name = "GridOriginHorizontal", dispId = 0x130)
    void setGridOriginHorizontal(Float param0);
            
    /**
     * <p>id(0x131)</p>
     */
    @ComProperty(name = "GridOriginVertical", dispId = 0x131)
    Float getGridOriginVertical();
            
    /**
     * <p>id(0x131)</p>
     */
    @ComProperty(name = "GridOriginVertical", dispId = 0x131)
    void setGridOriginVertical(Float param0);
            
    /**
     * <p>id(0x132)</p>
     */
    @ComProperty(name = "GridSpaceBetweenHorizontalLines", dispId = 0x132)
    Integer getGridSpaceBetweenHorizontalLines();
            
    /**
     * <p>id(0x132)</p>
     */
    @ComProperty(name = "GridSpaceBetweenHorizontalLines", dispId = 0x132)
    void setGridSpaceBetweenHorizontalLines(Integer param0);
            
    /**
     * <p>id(0x133)</p>
     */
    @ComProperty(name = "GridSpaceBetweenVerticalLines", dispId = 0x133)
    Integer getGridSpaceBetweenVerticalLines();
            
    /**
     * <p>id(0x133)</p>
     */
    @ComProperty(name = "GridSpaceBetweenVerticalLines", dispId = 0x133)
    void setGridSpaceBetweenVerticalLines(Integer param0);
            
    /**
     * <p>id(0x134)</p>
     */
    @ComProperty(name = "GridOriginFromMargin", dispId = 0x134)
    Boolean getGridOriginFromMargin();
            
    /**
     * <p>id(0x134)</p>
     */
    @ComProperty(name = "GridOriginFromMargin", dispId = 0x134)
    void setGridOriginFromMargin(Boolean param0);
            
    /**
     * <p>id(0x135)</p>
     */
    @ComProperty(name = "KerningByAlgorithm", dispId = 0x135)
    Boolean getKerningByAlgorithm();
            
    /**
     * <p>id(0x135)</p>
     */
    @ComProperty(name = "KerningByAlgorithm", dispId = 0x135)
    void setKerningByAlgorithm(Boolean param0);
            
    /**
     * <p>id(0x136)</p>
     */
    @ComProperty(name = "JustificationMode", dispId = 0x136)
    WdJustificationMode getJustificationMode();
            
    /**
     * <p>id(0x136)</p>
     */
    @ComProperty(name = "JustificationMode", dispId = 0x136)
    void setJustificationMode(WdJustificationMode param0);
            
    /**
     * <p>id(0x137)</p>
     */
    @ComProperty(name = "FarEastLineBreakLevel", dispId = 0x137)
    WdFarEastLineBreakLevel getFarEastLineBreakLevel();
            
    /**
     * <p>id(0x137)</p>
     */
    @ComProperty(name = "FarEastLineBreakLevel", dispId = 0x137)
    void setFarEastLineBreakLevel(WdFarEastLineBreakLevel param0);
            
    /**
     * <p>id(0x138)</p>
     */
    @ComProperty(name = "NoLineBreakBefore", dispId = 0x138)
    String getNoLineBreakBefore();
            
    /**
     * <p>id(0x138)</p>
     */
    @ComProperty(name = "NoLineBreakBefore", dispId = 0x138)
    void setNoLineBreakBefore(String param0);
            
    /**
     * <p>id(0x139)</p>
     */
    @ComProperty(name = "NoLineBreakAfter", dispId = 0x139)
    String getNoLineBreakAfter();
            
    /**
     * <p>id(0x139)</p>
     */
    @ComProperty(name = "NoLineBreakAfter", dispId = 0x139)
    void setNoLineBreakAfter(String param0);
            
    /**
     * <p>id(0x13a)</p>
     */
    @ComProperty(name = "TrackRevisions", dispId = 0x13a)
    Boolean getTrackRevisions();
            
    /**
     * <p>id(0x13a)</p>
     */
    @ComProperty(name = "TrackRevisions", dispId = 0x13a)
    void setTrackRevisions(Boolean param0);
            
    /**
     * <p>id(0x13b)</p>
     */
    @ComProperty(name = "PrintRevisions", dispId = 0x13b)
    Boolean getPrintRevisions();
            
    /**
     * <p>id(0x13b)</p>
     */
    @ComProperty(name = "PrintRevisions", dispId = 0x13b)
    void setPrintRevisions(Boolean param0);
            
    /**
     * <p>id(0x13c)</p>
     */
    @ComProperty(name = "ShowRevisions", dispId = 0x13c)
    Boolean getShowRevisions();
            
    /**
     * <p>id(0x13c)</p>
     */
    @ComProperty(name = "ShowRevisions", dispId = 0x13c)
    void setShowRevisions(Boolean param0);
            
    /**
     * <p>id(0x451)</p>
     */
    @ComMethod(name = "Close", dispId = 0x451)
    void Close(Object SaveChanges,
            Object OriginalFormat,
            Object RouteDocument);
            
    /**
     * <p>id(0x66)</p>
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
     */
    @ComMethod(name = "Repaginate", dispId = 0x67)
    void Repaginate();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "FitToPages", dispId = 0x68)
    void FitToPages();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "ManualHyphenation", dispId = 0x69)
    void ManualHyphenation();
            
    /**
     * <p>id(0xffff)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "DataForm", dispId = 0x6a)
    void DataForm();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComMethod(name = "Route", dispId = 0x6b)
    void Route();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComMethod(name = "Save", dispId = 0x6c)
    void Save();
            
    /**
     * <p>id(0x6d)</p>
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
     */
    @ComMethod(name = "SendMail", dispId = 0x6e)
    void SendMail();
            
    /**
     * <p>id(0x7d0)</p>
     */
    @ComMethod(name = "Range", dispId = 0x7d0)
    Range Range(Object Start,
            Object End);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "RunAutoMacro", dispId = 0x70)
    void RunAutoMacro(WdAutoMacros Which);
            
    /**
     * <p>id(0x71)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x71)
    void Activate();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComMethod(name = "PrintPreview", dispId = 0x72)
    void PrintPreview();
            
    /**
     * <p>id(0x73)</p>
     */
    @ComMethod(name = "GoTo", dispId = 0x73)
    Range GoTo(Object What,
            Object Which,
            Object Count,
            Object Name);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComMethod(name = "Undo", dispId = 0x74)
    Boolean Undo(Object Times);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Redo", dispId = 0x75)
    Boolean Redo(Object Times);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComMethod(name = "ComputeStatistics", dispId = 0x76)
    Integer ComputeStatistics(WdStatistic Statistic,
            Object IncludeFootnotesAndEndnotes);
            
    /**
     * <p>id(0x77)</p>
     */
    @ComMethod(name = "MakeCompatibilityDefault", dispId = 0x77)
    void MakeCompatibilityDefault();
            
    /**
     * <p>id(0x78)</p>
     */
    @ComMethod(name = "Protect2002", dispId = 0x78)
    void Protect2002(WdProtectionType Type,
            Object NoReset,
            Object Password);
            
    /**
     * <p>id(0x79)</p>
     */
    @ComMethod(name = "Unprotect", dispId = 0x79)
    void Unprotect(Object Password);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComMethod(name = "EditionOptions", dispId = 0x7a)
    void EditionOptions(WdEditionType Type,
            WdEditionOption Option,
            String Name,
            Object Format);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComMethod(name = "RunLetterWizard", dispId = 0x7b)
    void RunLetterWizard(Object LetterContent,
            Object WizardMode);
            
    /**
     * <p>id(0x7c)</p>
     */
    @ComMethod(name = "GetLetterContent", dispId = 0x7c)
    LetterContent GetLetterContent();
            
    /**
     * <p>id(0x7d)</p>
     */
    @ComMethod(name = "SetLetterContent", dispId = 0x7d)
    void SetLetterContent(Object LetterContent);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComMethod(name = "CopyStylesFromTemplate", dispId = 0x7e)
    void CopyStylesFromTemplate(String Template);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComMethod(name = "UpdateStyles", dispId = 0x7f)
    void UpdateStyles();
            
    /**
     * <p>id(0x83)</p>
     */
    @ComMethod(name = "CheckGrammar", dispId = 0x83)
    void CheckGrammar();
            
    /**
     * <p>id(0x84)</p>
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
     */
    @ComMethod(name = "AddToFavorites", dispId = 0x88)
    void AddToFavorites();
            
    /**
     * <p>id(0x89)</p>
     */
    @ComMethod(name = "Reload", dispId = 0x89)
    void Reload();
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComMethod(name = "AutoSummarize", dispId = 0x8a)
    Range AutoSummarize(Object Length,
            Object Mode,
            Object UpdateProperties);
            
    /**
     * <p>id(0x8c)</p>
     */
    @ComMethod(name = "RemoveNumbers", dispId = 0x8c)
    void RemoveNumbers(Object NumberType);
            
    /**
     * <p>id(0x8d)</p>
     */
    @ComMethod(name = "ConvertNumbersToText", dispId = 0x8d)
    void ConvertNumbersToText(Object NumberType);
            
    /**
     * <p>id(0x8e)</p>
     */
    @ComMethod(name = "CountNumberedItems", dispId = 0x8e)
    Integer CountNumberedItems(Object NumberType,
            Object Level);
            
    /**
     * <p>id(0x8f)</p>
     */
    @ComMethod(name = "Post", dispId = 0x8f)
    void Post();
            
    /**
     * <p>id(0x90)</p>
     */
    @ComMethod(name = "ToggleFormsDesign", dispId = 0x90)
    void ToggleFormsDesign();
            
    /**
     * <p>id(0x91)</p>
     */
    @ComMethod(name = "Compare2000", dispId = 0x91)
    void Compare2000(String Name);
            
    /**
     * <p>id(0x92)</p>
     */
    @ComMethod(name = "UpdateSummaryProperties", dispId = 0x92)
    void UpdateSummaryProperties();
            
    /**
     * <p>id(0x93)</p>
     */
    @ComMethod(name = "GetCrossReferenceItems", dispId = 0x93)
    Object GetCrossReferenceItems(Object ReferenceType);
            
    /**
     * <p>id(0x94)</p>
     */
    @ComMethod(name = "AutoFormat", dispId = 0x94)
    void AutoFormat();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComMethod(name = "ViewCode", dispId = 0x95)
    void ViewCode();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComMethod(name = "ViewPropertyBrowser", dispId = 0x96)
    void ViewPropertyBrowser();
            
    /**
     * <p>id(0xfa)</p>
     */
    @ComMethod(name = "ForwardMailer", dispId = 0xfa)
    void ForwardMailer();
            
    /**
     * <p>id(0xfb)</p>
     */
    @ComMethod(name = "Reply", dispId = 0xfb)
    void Reply();
            
    /**
     * <p>id(0xfc)</p>
     */
    @ComMethod(name = "ReplyAll", dispId = 0xfc)
    void ReplyAll();
            
    /**
     * <p>id(0xfd)</p>
     */
    @ComMethod(name = "SendMailer", dispId = 0xfd)
    void SendMailer(Object FileFormat,
            Object Priority);
            
    /**
     * <p>id(0xfe)</p>
     */
    @ComMethod(name = "UndoClear", dispId = 0xfe)
    void UndoClear();
            
    /**
     * <p>id(0xff)</p>
     */
    @ComMethod(name = "PresentIt", dispId = 0xff)
    void PresentIt();
            
    /**
     * <p>id(0x100)</p>
     */
    @ComMethod(name = "SendFax", dispId = 0x100)
    void SendFax(String Address,
            Object Subject);
            
    /**
     * <p>id(0x101)</p>
     */
    @ComMethod(name = "Merge2000", dispId = 0x101)
    void Merge2000(String FileName);
            
    /**
     * <p>id(0x102)</p>
     */
    @ComMethod(name = "ClosePrintPreview", dispId = 0x102)
    void ClosePrintPreview();
            
    /**
     * <p>id(0x103)</p>
     */
    @ComMethod(name = "CheckConsistency", dispId = 0x103)
    void CheckConsistency();
            
    /**
     * <p>id(0x104)</p>
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
     */
    @ComMethod(name = "AcceptAllRevisions", dispId = 0x13d)
    void AcceptAllRevisions();
            
    /**
     * <p>id(0x13e)</p>
     */
    @ComMethod(name = "RejectAllRevisions", dispId = 0x13e)
    void RejectAllRevisions();
            
    /**
     * <p>id(0x97)</p>
     */
    @ComMethod(name = "DetectLanguage", dispId = 0x97)
    void DetectLanguage();
            
    /**
     * <p>id(0x142)</p>
     */
    @ComMethod(name = "ApplyTheme", dispId = 0x142)
    void ApplyTheme(String Name);
            
    /**
     * <p>id(0x143)</p>
     */
    @ComMethod(name = "RemoveTheme", dispId = 0x143)
    void RemoveTheme();
            
    /**
     * <p>id(0x145)</p>
     */
    @ComMethod(name = "WebPagePreview", dispId = 0x145)
    void WebPagePreview();
            
    /**
     * <p>id(0x14b)</p>
     */
    @ComMethod(name = "ReloadAs", dispId = 0x14b)
    void ReloadAs(eu.doppel_helix.jna.tlb.office2.MsoEncoding Encoding);
            
    /**
     * <p>id(0x21c)</p>
     */
    @ComProperty(name = "ActiveTheme", dispId = 0x21c)
    String getActiveTheme();
            
    /**
     * <p>id(0x21d)</p>
     */
    @ComProperty(name = "ActiveThemeDisplayName", dispId = 0x21d)
    String getActiveThemeDisplayName();
            
    /**
     * <p>id(0x13f)</p>
     */
    @ComProperty(name = "Email", dispId = 0x13f)
    Email getEmail();
            
    /**
     * <p>id(0x140)</p>
     */
    @ComProperty(name = "Scripts", dispId = 0x140)
    eu.doppel_helix.jna.tlb.office2.Scripts getScripts();
            
    /**
     * <p>id(0x141)</p>
     */
    @ComProperty(name = "LanguageDetected", dispId = 0x141)
    Boolean getLanguageDetected();
            
    /**
     * <p>id(0x141)</p>
     */
    @ComProperty(name = "LanguageDetected", dispId = 0x141)
    void setLanguageDetected(Boolean param0);
            
    /**
     * <p>id(0x146)</p>
     */
    @ComProperty(name = "FarEastLineBreakLanguage", dispId = 0x146)
    WdFarEastLineBreakLanguageID getFarEastLineBreakLanguage();
            
    /**
     * <p>id(0x146)</p>
     */
    @ComProperty(name = "FarEastLineBreakLanguage", dispId = 0x146)
    void setFarEastLineBreakLanguage(WdFarEastLineBreakLanguageID param0);
            
    /**
     * <p>id(0x147)</p>
     */
    @ComProperty(name = "Frameset", dispId = 0x147)
    Frameset getFrameset();
            
    /**
     * <p>id(0x148)</p>
     */
    @ComProperty(name = "ClickAndTypeParagraphStyle", dispId = 0x148)
    Object getClickAndTypeParagraphStyle();
            
    /**
     * <p>id(0x148)</p>
     */
    @ComProperty(name = "ClickAndTypeParagraphStyle", dispId = 0x148)
    void setClickAndTypeParagraphStyle(Object param0);
            
    /**
     * <p>id(0x149)</p>
     */
    @ComProperty(name = "HTMLProject", dispId = 0x149)
    eu.doppel_helix.jna.tlb.office2.HTMLProject getHTMLProject();
            
    /**
     * <p>id(0x14a)</p>
     */
    @ComProperty(name = "WebOptions", dispId = 0x14a)
    WebOptions getWebOptions();
            
    /**
     * <p>id(0x14c)</p>
     */
    @ComProperty(name = "OpenEncoding", dispId = 0x14c)
    eu.doppel_helix.jna.tlb.office2.MsoEncoding getOpenEncoding();
            
    /**
     * <p>id(0x14d)</p>
     */
    @ComProperty(name = "SaveEncoding", dispId = 0x14d)
    eu.doppel_helix.jna.tlb.office2.MsoEncoding getSaveEncoding();
            
    /**
     * <p>id(0x14d)</p>
     */
    @ComProperty(name = "SaveEncoding", dispId = 0x14d)
    void setSaveEncoding(eu.doppel_helix.jna.tlb.office2.MsoEncoding param0);
            
    /**
     * <p>id(0x14e)</p>
     */
    @ComProperty(name = "OptimizeForWord97", dispId = 0x14e)
    Boolean getOptimizeForWord97();
            
    /**
     * <p>id(0x14e)</p>
     */
    @ComProperty(name = "OptimizeForWord97", dispId = 0x14e)
    void setOptimizeForWord97(Boolean param0);
            
    /**
     * <p>id(0x14f)</p>
     */
    @ComProperty(name = "VBASigned", dispId = 0x14f)
    Boolean getVBASigned();
            
    /**
     * <p>id(0x1bc)</p>
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
     */
    @ComMethod(name = "sblt", dispId = 0x1bd)
    void sblt(String s);
            
    /**
     * <p>id(0x1bf)</p>
     */
    @ComMethod(name = "ConvertVietDoc", dispId = 0x1bf)
    void ConvertVietDoc(Integer CodePageOrigin);
            
    /**
     * <p>id(0x1be)</p>
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
     */
    @ComProperty(name = "MailEnvelope", dispId = 0x150)
    eu.doppel_helix.jna.tlb.office2.MsoEnvelope getMailEnvelope();
            
    /**
     * <p>id(0x151)</p>
     */
    @ComProperty(name = "DisableFeatures", dispId = 0x151)
    Boolean getDisableFeatures();
            
    /**
     * <p>id(0x151)</p>
     */
    @ComProperty(name = "DisableFeatures", dispId = 0x151)
    void setDisableFeatures(Boolean param0);
            
    /**
     * <p>id(0x152)</p>
     */
    @ComProperty(name = "DoNotEmbedSystemFonts", dispId = 0x152)
    Boolean getDoNotEmbedSystemFonts();
            
    /**
     * <p>id(0x152)</p>
     */
    @ComProperty(name = "DoNotEmbedSystemFonts", dispId = 0x152)
    void setDoNotEmbedSystemFonts(Boolean param0);
            
    /**
     * <p>id(0x153)</p>
     */
    @ComProperty(name = "Signatures", dispId = 0x153)
    eu.doppel_helix.jna.tlb.office2.SignatureSet getSignatures();
            
    /**
     * <p>id(0x154)</p>
     */
    @ComProperty(name = "DefaultTargetFrame", dispId = 0x154)
    String getDefaultTargetFrame();
            
    /**
     * <p>id(0x154)</p>
     */
    @ComProperty(name = "DefaultTargetFrame", dispId = 0x154)
    void setDefaultTargetFrame(String param0);
            
    /**
     * <p>id(0x156)</p>
     */
    @ComProperty(name = "HTMLDivisions", dispId = 0x156)
    HTMLDivisions getHTMLDivisions();
            
    /**
     * <p>id(0x157)</p>
     */
    @ComProperty(name = "DisableFeaturesIntroducedAfter", dispId = 0x157)
    WdDisableFeaturesIntroducedAfter getDisableFeaturesIntroducedAfter();
            
    /**
     * <p>id(0x157)</p>
     */
    @ComProperty(name = "DisableFeaturesIntroducedAfter", dispId = 0x157)
    void setDisableFeaturesIntroducedAfter(WdDisableFeaturesIntroducedAfter param0);
            
    /**
     * <p>id(0x158)</p>
     */
    @ComProperty(name = "RemovePersonalInformation", dispId = 0x158)
    Boolean getRemovePersonalInformation();
            
    /**
     * <p>id(0x158)</p>
     */
    @ComProperty(name = "RemovePersonalInformation", dispId = 0x158)
    void setRemovePersonalInformation(Boolean param0);
            
    /**
     * <p>id(0x15a)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x15a)
    SmartTags getSmartTags();
            
    /**
     * <p>id(0x159)</p>
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
     */
    @ComMethod(name = "CheckIn", dispId = 0x15d)
    void CheckIn(Boolean SaveChanges,
            Object Comments,
            Boolean MakePublic);
            
    /**
     * <p>id(0x15f)</p>
     */
    @ComMethod(name = "CanCheckin", dispId = 0x15f)
    Boolean CanCheckin();
            
    /**
     * <p>id(0x16a)</p>
     */
    @ComMethod(name = "Merge", dispId = 0x16a)
    void Merge(String FileName,
            Object MergeTarget,
            Object DetectFormatChanges,
            Object UseFormattingFrom,
            Object AddToRecentFiles);
            
    /**
     * <p>id(0x15b)</p>
     */
    @ComProperty(name = "EmbedSmartTags", dispId = 0x15b)
    Boolean getEmbedSmartTags();
            
    /**
     * <p>id(0x15b)</p>
     */
    @ComProperty(name = "EmbedSmartTags", dispId = 0x15b)
    void setEmbedSmartTags(Boolean param0);
            
    /**
     * <p>id(0x15c)</p>
     */
    @ComProperty(name = "SmartTagsAsXMLProps", dispId = 0x15c)
    Boolean getSmartTagsAsXMLProps();
            
    /**
     * <p>id(0x15c)</p>
     */
    @ComProperty(name = "SmartTagsAsXMLProps", dispId = 0x15c)
    void setSmartTagsAsXMLProps(Boolean param0);
            
    /**
     * <p>id(0x165)</p>
     */
    @ComProperty(name = "TextEncoding", dispId = 0x165)
    eu.doppel_helix.jna.tlb.office2.MsoEncoding getTextEncoding();
            
    /**
     * <p>id(0x165)</p>
     */
    @ComProperty(name = "TextEncoding", dispId = 0x165)
    void setTextEncoding(eu.doppel_helix.jna.tlb.office2.MsoEncoding param0);
            
    /**
     * <p>id(0x166)</p>
     */
    @ComProperty(name = "TextLineEnding", dispId = 0x166)
    WdLineEndingType getTextLineEnding();
            
    /**
     * <p>id(0x166)</p>
     */
    @ComProperty(name = "TextLineEnding", dispId = 0x166)
    void setTextLineEnding(WdLineEndingType param0);
            
    /**
     * <p>id(0x161)</p>
     */
    @ComMethod(name = "SendForReview", dispId = 0x161)
    void SendForReview(Object Recipients,
            Object Subject,
            Object ShowMessage,
            Object IncludeAttachment);
            
    /**
     * <p>id(0x162)</p>
     */
    @ComMethod(name = "ReplyWithChanges", dispId = 0x162)
    void ReplyWithChanges(Object ShowMessage);
            
    /**
     * <p>id(0x164)</p>
     */
    @ComMethod(name = "EndReview", dispId = 0x164)
    void EndReview();
            
    /**
     * <p>id(0x168)</p>
     */
    @ComProperty(name = "StyleSheets", dispId = 0x168)
    StyleSheets getStyleSheets();
            
    /**
     * <p>id(0x16d)</p>
     */
    @ComProperty(name = "DefaultTableStyle", dispId = 0x16d)
    Object getDefaultTableStyle();
            
    /**
     * <p>id(0x16f)</p>
     */
    @ComProperty(name = "PasswordEncryptionProvider", dispId = 0x16f)
    String getPasswordEncryptionProvider();
            
    /**
     * <p>id(0x170)</p>
     */
    @ComProperty(name = "PasswordEncryptionAlgorithm", dispId = 0x170)
    String getPasswordEncryptionAlgorithm();
            
    /**
     * <p>id(0x171)</p>
     */
    @ComProperty(name = "PasswordEncryptionKeyLength", dispId = 0x171)
    Integer getPasswordEncryptionKeyLength();
            
    /**
     * <p>id(0x172)</p>
     */
    @ComProperty(name = "PasswordEncryptionFileProperties", dispId = 0x172)
    Boolean getPasswordEncryptionFileProperties();
            
    /**
     * <p>id(0x169)</p>
     */
    @ComMethod(name = "SetPasswordEncryptionOptions", dispId = 0x169)
    void SetPasswordEncryptionOptions(String PasswordEncryptionProvider,
            String PasswordEncryptionAlgorithm,
            Integer PasswordEncryptionKeyLength,
            Object PasswordEncryptionFileProperties);
            
    /**
     * <p>id(0x16b)</p>
     */
    @ComMethod(name = "RecheckSmartTags", dispId = 0x16b)
    void RecheckSmartTags();
            
    /**
     * <p>id(0x16c)</p>
     */
    @ComMethod(name = "RemoveSmartTags", dispId = 0x16c)
    void RemoveSmartTags();
            
    /**
     * <p>id(0x16e)</p>
     */
    @ComMethod(name = "SetDefaultTableStyle", dispId = 0x16e)
    void SetDefaultTableStyle(Object Style,
            Boolean SetInTemplate);
            
    /**
     * <p>id(0x173)</p>
     */
    @ComMethod(name = "DeleteAllComments", dispId = 0x173)
    void DeleteAllComments();
            
    /**
     * <p>id(0x174)</p>
     */
    @ComMethod(name = "AcceptAllRevisionsShown", dispId = 0x174)
    void AcceptAllRevisionsShown();
            
    /**
     * <p>id(0x175)</p>
     */
    @ComMethod(name = "RejectAllRevisionsShown", dispId = 0x175)
    void RejectAllRevisionsShown();
            
    /**
     * <p>id(0x176)</p>
     */
    @ComMethod(name = "DeleteAllCommentsShown", dispId = 0x176)
    void DeleteAllCommentsShown();
            
    /**
     * <p>id(0x177)</p>
     */
    @ComMethod(name = "ResetFormFields", dispId = 0x177)
    void ResetFormFields();
            
    /**
     * <p>id(0x178)</p>
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
     */
    @ComProperty(name = "EmbedLinguisticData", dispId = 0x179)
    Boolean getEmbedLinguisticData();
            
    /**
     * <p>id(0x179)</p>
     */
    @ComProperty(name = "EmbedLinguisticData", dispId = 0x179)
    void setEmbedLinguisticData(Boolean param0);
            
    /**
     * <p>id(0x1c0)</p>
     */
    @ComProperty(name = "FormattingShowFont", dispId = 0x1c0)
    Boolean getFormattingShowFont();
            
    /**
     * <p>id(0x1c0)</p>
     */
    @ComProperty(name = "FormattingShowFont", dispId = 0x1c0)
    void setFormattingShowFont(Boolean param0);
            
    /**
     * <p>id(0x1c1)</p>
     */
    @ComProperty(name = "FormattingShowClear", dispId = 0x1c1)
    Boolean getFormattingShowClear();
            
    /**
     * <p>id(0x1c1)</p>
     */
    @ComProperty(name = "FormattingShowClear", dispId = 0x1c1)
    void setFormattingShowClear(Boolean param0);
            
    /**
     * <p>id(0x1c2)</p>
     */
    @ComProperty(name = "FormattingShowParagraph", dispId = 0x1c2)
    Boolean getFormattingShowParagraph();
            
    /**
     * <p>id(0x1c2)</p>
     */
    @ComProperty(name = "FormattingShowParagraph", dispId = 0x1c2)
    void setFormattingShowParagraph(Boolean param0);
            
    /**
     * <p>id(0x1c3)</p>
     */
    @ComProperty(name = "FormattingShowNumbering", dispId = 0x1c3)
    Boolean getFormattingShowNumbering();
            
    /**
     * <p>id(0x1c3)</p>
     */
    @ComProperty(name = "FormattingShowNumbering", dispId = 0x1c3)
    void setFormattingShowNumbering(Boolean param0);
            
    /**
     * <p>id(0x1c4)</p>
     */
    @ComProperty(name = "FormattingShowFilter", dispId = 0x1c4)
    WdShowFilter getFormattingShowFilter();
            
    /**
     * <p>id(0x1c4)</p>
     */
    @ComProperty(name = "FormattingShowFilter", dispId = 0x1c4)
    void setFormattingShowFilter(WdShowFilter param0);
            
    /**
     * <p>id(0x17a)</p>
     */
    @ComMethod(name = "CheckNewSmartTags", dispId = 0x17a)
    void CheckNewSmartTags();
            
    /**
     * <p>id(0x1c5)</p>
     */
    @ComProperty(name = "Permission", dispId = 0x1c5)
    eu.doppel_helix.jna.tlb.office2.Permission getPermission();
            
    /**
     * <p>id(0x1cc)</p>
     */
    @ComProperty(name = "XMLNodes", dispId = 0x1cc)
    XMLNodes getXMLNodes();
            
    /**
     * <p>id(0x1cd)</p>
     */
    @ComProperty(name = "XMLSchemaReferences", dispId = 0x1cd)
    XMLSchemaReferences getXMLSchemaReferences();
            
    /**
     * <p>id(0x1ce)</p>
     */
    @ComProperty(name = "SmartDocument", dispId = 0x1ce)
    eu.doppel_helix.jna.tlb.office2.SmartDocument getSmartDocument();
            
    /**
     * <p>id(0x1cf)</p>
     */
    @ComProperty(name = "SharedWorkspace", dispId = 0x1cf)
    eu.doppel_helix.jna.tlb.office2.SharedWorkspace getSharedWorkspace();
            
    /**
     * <p>id(0x1d2)</p>
     */
    @ComProperty(name = "Sync", dispId = 0x1d2)
    eu.doppel_helix.jna.tlb.office2.Sync getSync();
            
    /**
     * <p>id(0x1d7)</p>
     */
    @ComProperty(name = "EnforceStyle", dispId = 0x1d7)
    Boolean getEnforceStyle();
            
    /**
     * <p>id(0x1d7)</p>
     */
    @ComProperty(name = "EnforceStyle", dispId = 0x1d7)
    void setEnforceStyle(Boolean param0);
            
    /**
     * <p>id(0x1d8)</p>
     */
    @ComProperty(name = "AutoFormatOverride", dispId = 0x1d8)
    Boolean getAutoFormatOverride();
            
    /**
     * <p>id(0x1d8)</p>
     */
    @ComProperty(name = "AutoFormatOverride", dispId = 0x1d8)
    void setAutoFormatOverride(Boolean param0);
            
    /**
     * <p>id(0x1d9)</p>
     */
    @ComProperty(name = "XMLSaveDataOnly", dispId = 0x1d9)
    Boolean getXMLSaveDataOnly();
            
    /**
     * <p>id(0x1d9)</p>
     */
    @ComProperty(name = "XMLSaveDataOnly", dispId = 0x1d9)
    void setXMLSaveDataOnly(Boolean param0);
            
    /**
     * <p>id(0x1dd)</p>
     */
    @ComProperty(name = "XMLHideNamespaces", dispId = 0x1dd)
    Boolean getXMLHideNamespaces();
            
    /**
     * <p>id(0x1dd)</p>
     */
    @ComProperty(name = "XMLHideNamespaces", dispId = 0x1dd)
    void setXMLHideNamespaces(Boolean param0);
            
    /**
     * <p>id(0x1de)</p>
     */
    @ComProperty(name = "XMLShowAdvancedErrors", dispId = 0x1de)
    Boolean getXMLShowAdvancedErrors();
            
    /**
     * <p>id(0x1de)</p>
     */
    @ComProperty(name = "XMLShowAdvancedErrors", dispId = 0x1de)
    void setXMLShowAdvancedErrors(Boolean param0);
            
    /**
     * <p>id(0x1da)</p>
     */
    @ComProperty(name = "XMLUseXSLTWhenSaving", dispId = 0x1da)
    Boolean getXMLUseXSLTWhenSaving();
            
    /**
     * <p>id(0x1da)</p>
     */
    @ComProperty(name = "XMLUseXSLTWhenSaving", dispId = 0x1da)
    void setXMLUseXSLTWhenSaving(Boolean param0);
            
    /**
     * <p>id(0x1db)</p>
     */
    @ComProperty(name = "XMLSaveThroughXSLT", dispId = 0x1db)
    String getXMLSaveThroughXSLT();
            
    /**
     * <p>id(0x1db)</p>
     */
    @ComProperty(name = "XMLSaveThroughXSLT", dispId = 0x1db)
    void setXMLSaveThroughXSLT(String param0);
            
    /**
     * <p>id(0x1dc)</p>
     */
    @ComProperty(name = "DocumentLibraryVersions", dispId = 0x1dc)
    eu.doppel_helix.jna.tlb.office2.DocumentLibraryVersions getDocumentLibraryVersions();
            
    /**
     * <p>id(0x1e1)</p>
     */
    @ComProperty(name = "ReadingModeLayoutFrozen", dispId = 0x1e1)
    Boolean getReadingModeLayoutFrozen();
            
    /**
     * <p>id(0x1e1)</p>
     */
    @ComProperty(name = "ReadingModeLayoutFrozen", dispId = 0x1e1)
    void setReadingModeLayoutFrozen(Boolean param0);
            
    /**
     * <p>id(0x1e4)</p>
     */
    @ComProperty(name = "RemoveDateAndTime", dispId = 0x1e4)
    Boolean getRemoveDateAndTime();
            
    /**
     * <p>id(0x1e4)</p>
     */
    @ComProperty(name = "RemoveDateAndTime", dispId = 0x1e4)
    void setRemoveDateAndTime(Boolean param0);
            
    /**
     * <p>id(0x1d0)</p>
     */
    @ComMethod(name = "SendFaxOverInternet", dispId = 0x1d0)
    void SendFaxOverInternet(Object Recipients,
            Object Subject,
            Object ShowMessage);
            
    /**
     * <p>id(0x1f4)</p>
     */
    @ComMethod(name = "TransformDocument", dispId = 0x1f4)
    void TransformDocument(String Path,
            Boolean DataOnly);
            
    /**
     * <p>id(0x1d3)</p>
     */
    @ComMethod(name = "Protect", dispId = 0x1d3)
    void Protect(WdProtectionType Type,
            Object NoReset,
            Object Password,
            Object UseIRM,
            Object EnforceStyleLock);
            
    /**
     * <p>id(0x1d4)</p>
     */
    @ComMethod(name = "SelectAllEditableRanges", dispId = 0x1d4)
    void SelectAllEditableRanges(Object EditorID);
            
    /**
     * <p>id(0x1d5)</p>
     */
    @ComMethod(name = "DeleteAllEditableRanges", dispId = 0x1d5)
    void DeleteAllEditableRanges(Object EditorID);
            
    /**
     * <p>id(0x1df)</p>
     */
    @ComMethod(name = "DeleteAllInkAnnotations", dispId = 0x1df)
    void DeleteAllInkAnnotations();
            
    /**
     * <p>id(0x1e2)</p>
     */
    @ComMethod(name = "AddDocumentWorkspaceHeader", dispId = 0x1e2)
    void AddDocumentWorkspaceHeader(Boolean RichFormat,
            String Url,
            String Title,
            String Description,
            String ID);
            
    /**
     * <p>id(0x1e3)</p>
     */
    @ComMethod(name = "RemoveDocumentWorkspaceHeader", dispId = 0x1e3)
    void RemoveDocumentWorkspaceHeader(String ID);
            
    /**
     * <p>id(0x1e5)</p>
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
     */
    @ComMethod(name = "RemoveLockedStyles", dispId = 0x1e7)
    void RemoveLockedStyles();
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "ChildNodeSuggestions", dispId = 0x1e6)
    XMLChildNodeSuggestions getChildNodeSuggestions();
            
    /**
     * <p>id(0x1e8)</p>
     */
    @ComMethod(name = "SelectSingleNode", dispId = 0x1e8)
    XMLNode SelectSingleNode(String XPath,
            String PrefixMapping,
            Boolean FastSearchSkippingTextNodes);
            
    /**
     * <p>id(0x1e9)</p>
     */
    @ComMethod(name = "SelectNodes", dispId = 0x1e9)
    XMLNodes SelectNodes(String XPath,
            String PrefixMapping,
            Boolean FastSearchSkippingTextNodes);
            
    /**
     * <p>id(0x1ea)</p>
     */
    @ComProperty(name = "XMLSchemaViolations", dispId = 0x1ea)
    XMLNodes getXMLSchemaViolations();
            
    /**
     * <p>id(0x1eb)</p>
     */
    @ComProperty(name = "ReadingLayoutSizeX", dispId = 0x1eb)
    Integer getReadingLayoutSizeX();
            
    /**
     * <p>id(0x1eb)</p>
     */
    @ComProperty(name = "ReadingLayoutSizeX", dispId = 0x1eb)
    void setReadingLayoutSizeX(Integer param0);
            
    /**
     * <p>id(0x1ec)</p>
     */
    @ComProperty(name = "ReadingLayoutSizeY", dispId = 0x1ec)
    Integer getReadingLayoutSizeY();
            
    /**
     * <p>id(0x1ec)</p>
     */
    @ComProperty(name = "ReadingLayoutSizeY", dispId = 0x1ec)
    void setReadingLayoutSizeY(Integer param0);
            
    /**
     * <p>id(0x1ed)</p>
     */
    @ComProperty(name = "StyleSortMethod", dispId = 0x1ed)
    WdStyleSort getStyleSortMethod();
            
    /**
     * <p>id(0x1ed)</p>
     */
    @ComProperty(name = "StyleSortMethod", dispId = 0x1ed)
    void setStyleSortMethod(WdStyleSort param0);
            
    /**
     * <p>id(0x1f0)</p>
     */
    @ComProperty(name = "ContentTypeProperties", dispId = 0x1f0)
    eu.doppel_helix.jna.tlb.office2.MetaProperties getContentTypeProperties();
            
    /**
     * <p>id(0x1f3)</p>
     */
    @ComProperty(name = "TrackMoves", dispId = 0x1f3)
    Boolean getTrackMoves();
            
    /**
     * <p>id(0x1f3)</p>
     */
    @ComProperty(name = "TrackMoves", dispId = 0x1f3)
    void setTrackMoves(Boolean param0);
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComProperty(name = "TrackFormatting", dispId = 0x1f6)
    Boolean getTrackFormatting();
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComProperty(name = "TrackFormatting", dispId = 0x1f6)
    void setTrackFormatting(Boolean param0);
            
    /**
     * <p>id(0x1f7)</p>
     */
    @ComProperty(name = "Dummy1", dispId = 0x1f7)
    void getDummy1();
            
    /**
     * <p>id(0x1f8)</p>
     */
    @ComProperty(name = "OMaths", dispId = 0x1f8)
    OMaths getOMaths();
            
    /**
     * <p>id(0x1ef)</p>
     */
    @ComMethod(name = "RemoveDocumentInformation", dispId = 0x1ef)
    void RemoveDocumentInformation(WdRemoveDocInfoType RemoveDocInfoType);
            
    /**
     * <p>id(0x1f5)</p>
     */
    @ComMethod(name = "CheckInWithVersion", dispId = 0x1f5)
    void CheckInWithVersion(Boolean SaveChanges,
            Object Comments,
            Boolean MakePublic,
            Object VersionType);
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComMethod(name = "Dummy2", dispId = 0x1f9)
    void Dummy2();
            
    /**
     * <p>id(0x1fa)</p>
     */
    @ComProperty(name = "Dummy3", dispId = 0x1fa)
    void getDummy3();
            
    /**
     * <p>id(0x1fb)</p>
     */
    @ComProperty(name = "ServerPolicy", dispId = 0x1fb)
    eu.doppel_helix.jna.tlb.office2.ServerPolicy getServerPolicy();
            
    /**
     * <p>id(0x1fc)</p>
     */
    @ComProperty(name = "ContentControls", dispId = 0x1fc)
    ContentControls getContentControls();
            
    /**
     * <p>id(0x1fe)</p>
     */
    @ComProperty(name = "DocumentInspectors", dispId = 0x1fe)
    eu.doppel_helix.jna.tlb.office2.DocumentInspectors getDocumentInspectors();
            
    /**
     * <p>id(0x1fd)</p>
     */
    @ComMethod(name = "LockServerFile", dispId = 0x1fd)
    void LockServerFile();
            
    /**
     * <p>id(0x1ff)</p>
     */
    @ComMethod(name = "GetWorkflowTasks", dispId = 0x1ff)
    eu.doppel_helix.jna.tlb.office2.WorkflowTasks GetWorkflowTasks();
            
    /**
     * <p>id(0x200)</p>
     */
    @ComMethod(name = "GetWorkflowTemplates", dispId = 0x200)
    eu.doppel_helix.jna.tlb.office2.WorkflowTemplates GetWorkflowTemplates();
            
    /**
     * <p>id(0x202)</p>
     */
    @ComMethod(name = "Dummy4", dispId = 0x202)
    void Dummy4();
            
    /**
     * <p>id(0x203)</p>
     */
    @ComMethod(name = "AddMeetingWorkspaceHeader", dispId = 0x203)
    void AddMeetingWorkspaceHeader(Boolean SkipIfAbsent,
            String Url,
            String Title,
            String Description,
            String ID);
            
    /**
     * <p>id(0x204)</p>
     */
    @ComProperty(name = "Bibliography", dispId = 0x204)
    Bibliography getBibliography();
            
    /**
     * <p>id(0x205)</p>
     */
    @ComProperty(name = "LockTheme", dispId = 0x205)
    Boolean getLockTheme();
            
    /**
     * <p>id(0x205)</p>
     */
    @ComProperty(name = "LockTheme", dispId = 0x205)
    void setLockTheme(Boolean param0);
            
    /**
     * <p>id(0x206)</p>
     */
    @ComProperty(name = "LockQuickStyleSet", dispId = 0x206)
    Boolean getLockQuickStyleSet();
            
    /**
     * <p>id(0x206)</p>
     */
    @ComProperty(name = "LockQuickStyleSet", dispId = 0x206)
    void setLockQuickStyleSet(Boolean param0);
            
    /**
     * <p>id(0x207)</p>
     */
    @ComProperty(name = "OriginalDocumentTitle", dispId = 0x207)
    String getOriginalDocumentTitle();
            
    /**
     * <p>id(0x208)</p>
     */
    @ComProperty(name = "RevisedDocumentTitle", dispId = 0x208)
    String getRevisedDocumentTitle();
            
    /**
     * <p>id(0x209)</p>
     */
    @ComProperty(name = "CustomXMLParts", dispId = 0x209)
    eu.doppel_helix.jna.tlb.office2.CustomXMLParts getCustomXMLParts();
            
    /**
     * <p>id(0x20a)</p>
     */
    @ComProperty(name = "FormattingShowNextLevel", dispId = 0x20a)
    Boolean getFormattingShowNextLevel();
            
    /**
     * <p>id(0x20a)</p>
     */
    @ComProperty(name = "FormattingShowNextLevel", dispId = 0x20a)
    void setFormattingShowNextLevel(Boolean param0);
            
    /**
     * <p>id(0x20b)</p>
     */
    @ComProperty(name = "FormattingShowUserStyleName", dispId = 0x20b)
    Boolean getFormattingShowUserStyleName();
            
    /**
     * <p>id(0x20b)</p>
     */
    @ComProperty(name = "FormattingShowUserStyleName", dispId = 0x20b)
    void setFormattingShowUserStyleName(Boolean param0);
            
    /**
     * <p>id(0x20c)</p>
     */
    @ComMethod(name = "SaveAsQuickStyleSet", dispId = 0x20c)
    void SaveAsQuickStyleSet(String FileName);
            
    /**
     * <p>id(0x20d)</p>
     */
    @ComMethod(name = "ApplyQuickStyleSet", dispId = 0x20d)
    void ApplyQuickStyleSet(String Name);
            
    /**
     * <p>id(0x20e)</p>
     */
    @ComProperty(name = "Research", dispId = 0x20e)
    Research getResearch();
            
    /**
     * <p>id(0x20f)</p>
     */
    @ComProperty(name = "Final", dispId = 0x20f)
    Boolean get_Final();
            
    /**
     * <p>id(0x20f)</p>
     */
    @ComProperty(name = "Final", dispId = 0x20f)
    void set_Final(Boolean param0);
            
    /**
     * <p>id(0x210)</p>
     */
    @ComProperty(name = "OMathBreakBin", dispId = 0x210)
    WdOMathBreakBin getOMathBreakBin();
            
    /**
     * <p>id(0x210)</p>
     */
    @ComProperty(name = "OMathBreakBin", dispId = 0x210)
    void setOMathBreakBin(WdOMathBreakBin param0);
            
    /**
     * <p>id(0x211)</p>
     */
    @ComProperty(name = "OMathBreakSub", dispId = 0x211)
    WdOMathBreakSub getOMathBreakSub();
            
    /**
     * <p>id(0x211)</p>
     */
    @ComProperty(name = "OMathBreakSub", dispId = 0x211)
    void setOMathBreakSub(WdOMathBreakSub param0);
            
    /**
     * <p>id(0x212)</p>
     */
    @ComProperty(name = "OMathJc", dispId = 0x212)
    WdOMathJc getOMathJc();
            
    /**
     * <p>id(0x212)</p>
     */
    @ComProperty(name = "OMathJc", dispId = 0x212)
    void setOMathJc(WdOMathJc param0);
            
    /**
     * <p>id(0x213)</p>
     */
    @ComProperty(name = "OMathLeftMargin", dispId = 0x213)
    Float getOMathLeftMargin();
            
    /**
     * <p>id(0x213)</p>
     */
    @ComProperty(name = "OMathLeftMargin", dispId = 0x213)
    void setOMathLeftMargin(Float param0);
            
    /**
     * <p>id(0x214)</p>
     */
    @ComProperty(name = "OMathRightMargin", dispId = 0x214)
    Float getOMathRightMargin();
            
    /**
     * <p>id(0x214)</p>
     */
    @ComProperty(name = "OMathRightMargin", dispId = 0x214)
    void setOMathRightMargin(Float param0);
            
    /**
     * <p>id(0x217)</p>
     */
    @ComProperty(name = "OMathWrap", dispId = 0x217)
    Float getOMathWrap();
            
    /**
     * <p>id(0x217)</p>
     */
    @ComProperty(name = "OMathWrap", dispId = 0x217)
    void setOMathWrap(Float param0);
            
    /**
     * <p>id(0x218)</p>
     */
    @ComProperty(name = "OMathIntSubSupLim", dispId = 0x218)
    Boolean getOMathIntSubSupLim();
            
    /**
     * <p>id(0x218)</p>
     */
    @ComProperty(name = "OMathIntSubSupLim", dispId = 0x218)
    void setOMathIntSubSupLim(Boolean param0);
            
    /**
     * <p>id(0x219)</p>
     */
    @ComProperty(name = "OMathNarySupSubLim", dispId = 0x219)
    Boolean getOMathNarySupSubLim();
            
    /**
     * <p>id(0x219)</p>
     */
    @ComProperty(name = "OMathNarySupSubLim", dispId = 0x219)
    void setOMathNarySupSubLim(Boolean param0);
            
    /**
     * <p>id(0x21b)</p>
     */
    @ComProperty(name = "OMathSmallFrac", dispId = 0x21b)
    Boolean getOMathSmallFrac();
            
    /**
     * <p>id(0x21b)</p>
     */
    @ComProperty(name = "OMathSmallFrac", dispId = 0x21b)
    void setOMathSmallFrac(Boolean param0);
            
    /**
     * <p>id(0x21e)</p>
     */
    @ComProperty(name = "WordOpenXML", dispId = 0x21e)
    String getWordOpenXML();
            
    /**
     * <p>id(0x221)</p>
     */
    @ComProperty(name = "DocumentTheme", dispId = 0x221)
    eu.doppel_helix.jna.tlb.office2.OfficeTheme getDocumentTheme();
            
    /**
     * <p>id(0x222)</p>
     */
    @ComMethod(name = "ApplyDocumentTheme", dispId = 0x222)
    void ApplyDocumentTheme(String FileName);
            
    /**
     * <p>id(0x224)</p>
     */
    @ComProperty(name = "HasVBProject", dispId = 0x224)
    Boolean getHasVBProject();
            
    /**
     * <p>id(0x225)</p>
     */
    @ComMethod(name = "SelectLinkedControls", dispId = 0x225)
    ContentControls SelectLinkedControls(eu.doppel_helix.jna.tlb.office2.CustomXMLNode Node);
            
    /**
     * <p>id(0x226)</p>
     */
    @ComMethod(name = "SelectUnlinkedControls", dispId = 0x226)
    ContentControls SelectUnlinkedControls(eu.doppel_helix.jna.tlb.office2.CustomXMLPart Stream);
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "SelectContentControlsByTitle", dispId = 0x227)
    ContentControls SelectContentControlsByTitle(String Title);
            
    /**
     * <p>id(0x228)</p>
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
     */
    @ComMethod(name = "FreezeLayout", dispId = 0x229)
    void FreezeLayout();
            
    /**
     * <p>id(0x22a)</p>
     */
    @ComMethod(name = "UnfreezeLayout", dispId = 0x22a)
    void UnfreezeLayout();
            
    /**
     * <p>id(0x22b)</p>
     */
    @ComProperty(name = "OMathFontName", dispId = 0x22b)
    String getOMathFontName();
            
    /**
     * <p>id(0x22b)</p>
     */
    @ComProperty(name = "OMathFontName", dispId = 0x22b)
    void setOMathFontName(String param0);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComMethod(name = "DowngradeDocument", dispId = 0x22e)
    void DowngradeDocument();
            
    /**
     * <p>id(0x22f)</p>
     */
    @ComProperty(name = "EncryptionProvider", dispId = 0x22f)
    String getEncryptionProvider();
            
    /**
     * <p>id(0x22f)</p>
     */
    @ComProperty(name = "EncryptionProvider", dispId = 0x22f)
    void setEncryptionProvider(String param0);
            
    /**
     * <p>id(0x230)</p>
     */
    @ComProperty(name = "UseMathDefaults", dispId = 0x230)
    Boolean getUseMathDefaults();
            
    /**
     * <p>id(0x230)</p>
     */
    @ComProperty(name = "UseMathDefaults", dispId = 0x230)
    void setUseMathDefaults(Boolean param0);
            
    /**
     * <p>id(0x233)</p>
     */
    @ComProperty(name = "CurrentRsid", dispId = 0x233)
    Integer getCurrentRsid();
            
    /**
     * <p>id(0x231)</p>
     */
    @ComMethod(name = "Convert", dispId = 0x231)
    void Convert();
            
    /**
     * <p>id(0x232)</p>
     */
    @ComMethod(name = "SelectContentControlsByTag", dispId = 0x232)
    ContentControls SelectContentControlsByTag(String Tag);
            
    /**
     * <p>id(0x28a)</p>
     */
    @ComMethod(name = "ConvertAutoHyphens", dispId = 0x28a)
    void ConvertAutoHyphens();
            
    /**
     * <p>id(0x234)</p>
     */
    @ComProperty(name = "DocID", dispId = 0x234)
    Integer getDocID();
            
    /**
     * <p>id(0x236)</p>
     */
    @ComMethod(name = "ApplyQuickStyleSet2", dispId = 0x236)
    void ApplyQuickStyleSet2(Object Style);
            
    /**
     * <p>id(0x237)</p>
     */
    @ComProperty(name = "CompatibilityMode", dispId = 0x237)
    Integer getCompatibilityMode();
            
    /**
     * <p>id(0x238)</p>
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
     */
    @ComProperty(name = "CoAuthoring", dispId = 0x258)
    CoAuthoring getCoAuthoring();
            
    /**
     * <p>id(0x23b)</p>
     */
    @ComMethod(name = "SetCompatibilityMode", dispId = 0x23b)
    void SetCompatibilityMode(Integer Mode);
            
    /**
     * <p>id(0x262)</p>
     */
    @ComProperty(name = "Broadcast", dispId = 0x262)
    Broadcast getBroadcast();
            
    /**
     * <p>id(0x23c)</p>
     */
    @ComMethod(name = "ReturnToLastReadPosition", dispId = 0x23c)
    Integer ReturnToLastReadPosition();
            
    /**
     * <p>id(0x26a)</p>
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0x26a)
    Boolean getChartDataPointTrack();
            
    /**
     * <p>id(0x26a)</p>
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0x26a)
    void setChartDataPointTrack(Boolean param0);
            
    /**
     * <p>id(0x26b)</p>
     */
    @ComProperty(name = "IsInAutosave", dispId = 0x26b)
    Boolean getIsInAutosave();
            
    /**
     * <p>id(0x26d)</p>
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