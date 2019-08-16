
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002095E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002095E-0000-0000-C000-000000000046}")
public interface Range extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Text", dispId = 0x0)
    String getText();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x0)
    void setText(String param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "FormattedText", dispId = 0x2)
    Range getFormattedText();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Range}
     */
    @ComProperty(name = "FormattedText", dispId = 0x2)
    void setFormattedText(Range param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Start", dispId = 0x3)
    Integer getStart();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Start", dispId = 0x3)
    void setStart(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "End", dispId = 0x4)
    Integer getEnd();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "End", dispId = 0x4)
    void setEnd(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Font", dispId = 0x5)
    Font getFont();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Font}
     */
    @ComProperty(name = "Font", dispId = 0x5)
    void setFont(Font param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Duplicate", dispId = 0x6)
    Range getDuplicate();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "StoryType", dispId = 0x7)
    WdStoryType getStoryType();
            
    /**
     * <p>id(0x32)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Tables", dispId = 0x32)
    Tables getTables();
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Words", dispId = 0x33)
    Words getWords();
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Sentences", dispId = 0x34)
    Sentences getSentences();
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x35)
    Characters getCharacters();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Footnotes", dispId = 0x36)
    Footnotes getFootnotes();
            
    /**
     * <p>id(0x37)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Endnotes", dispId = 0x37)
    Endnotes getEndnotes();
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x38)
    Comments getComments();
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Cells", dispId = 0x39)
    Cells getCells();
            
    /**
     * <p>id(0x3a)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Sections", dispId = 0x3a)
    Sections getSections();
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Paragraphs", dispId = 0x3b)
    Paragraphs getParagraphs();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x3d)
    Shading getShading();
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "TextRetrievalMode", dispId = 0x3e)
    TextRetrievalMode getTextRetrievalMode();
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code TextRetrievalMode}
     */
    @ComProperty(name = "TextRetrievalMode", dispId = 0x3e)
    void setTextRetrievalMode(TextRetrievalMode param0);
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x40)
    Fields getFields();
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "FormFields", dispId = 0x41)
    FormFields getFormFields();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Frames", dispId = 0x42)
    Frames getFrames();
            
    /**
     * <p>id(0x44e)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0x44e)
    ParagraphFormat getParagraphFormat();
            
    /**
     * <p>id(0x44e)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code ParagraphFormat}
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0x44e)
    void setParagraphFormat(ParagraphFormat param0);
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "ListFormat", dispId = 0x44)
    ListFormat getListFormat();
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "Bookmarks", dispId = 0x4b)
    Bookmarks getBookmarks();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x82)
    Integer getBold();
            
    /**
     * <p>id(0x82)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Bold", dispId = 0x82)
    void setBold(Integer param0);
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x83)
    Integer getItalic();
            
    /**
     * <p>id(0x83)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Italic", dispId = 0x83)
    void setItalic(Integer param0);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x8b)
    WdUnderline getUnderline();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code WdUnderline}
     */
    @ComProperty(name = "Underline", dispId = 0x8b)
    void setUnderline(WdUnderline param0);
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "EmphasisMark", dispId = 0x8c)
    WdEmphasisMark getEmphasisMark();
            
    /**
     * <p>id(0x8c)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code WdEmphasisMark}
     */
    @ComProperty(name = "EmphasisMark", dispId = 0x8c)
    void setEmphasisMark(WdEmphasisMark param0);
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "DisableCharacterSpaceGrid", dispId = 0x8d)
    Boolean getDisableCharacterSpaceGrid();
            
    /**
     * <p>id(0x8d)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisableCharacterSpaceGrid", dispId = 0x8d)
    void setDisableCharacterSpaceGrid(Boolean param0);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "Revisions", dispId = 0x96)
    Revisions getRevisions();
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "Style", dispId = 0x97)
    Object getStyle();
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0x97)
    void setStyle(Object param0);
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "StoryLength", dispId = 0x98)
    Integer getStoryLength();
            
    /**
     * <p>id(0x99)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x99)
    WdLanguageID getLanguageID();
            
    /**
     * <p>id(0x99)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageID", dispId = 0x99)
    void setLanguageID(WdLanguageID param0);
            
    /**
     * <p>id(0x9b)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "SynonymInfo", dispId = 0x9b)
    SynonymInfo getSynonymInfo();
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x9c)
    Hyperlinks getHyperlinks();
            
    /**
     * <p>id(0x9d)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "ListParagraphs", dispId = 0x9d)
    ListParagraphs getListParagraphs();
            
    /**
     * <p>id(0x9f)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "Subdocuments", dispId = 0x9f)
    Subdocuments getSubdocuments();
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "GrammarChecked", dispId = 0x104)
    Boolean getGrammarChecked();
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "GrammarChecked", dispId = 0x104)
    void setGrammarChecked(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "SpellingChecked", dispId = 0x105)
    Boolean getSpellingChecked();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SpellingChecked", dispId = 0x105)
    void setSpellingChecked(Boolean param0);
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "HighlightColorIndex", dispId = 0x12d)
    WdColorIndex getHighlightColorIndex();
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "HighlightColorIndex", dispId = 0x12d)
    void setHighlightColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "Columns", dispId = 0x12e)
    Columns getColumns();
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "Rows", dispId = 0x12f)
    Rows getRows();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "CanEdit", dispId = 0x130)
    Integer getCanEdit();
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "CanPaste", dispId = 0x131)
    Integer getCanPaste();
            
    /**
     * <p>id(0x133)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "IsEndOfRowMark", dispId = 0x133)
    Boolean getIsEndOfRowMark();
            
    /**
     * <p>id(0x134)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "BookmarkID", dispId = 0x134)
    Integer getBookmarkID();
            
    /**
     * <p>id(0x135)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "PreviousBookmarkID", dispId = 0x135)
    Integer getPreviousBookmarkID();
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "Find", dispId = 0x106)
    Find getFind();
            
    /**
     * <p>id(0x44d)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "PageSetup", dispId = 0x44d)
    PageSetup getPageSetup();
            
    /**
     * <p>id(0x44d)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code PageSetup}
     */
    @ComProperty(name = "PageSetup", dispId = 0x44d)
    void setPageSetup(PageSetup param0);
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "ShapeRange", dispId = 0x137)
    ShapeRange getShapeRange();
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "Case", dispId = 0x138)
    WdCharacterCase get_Case();
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code WdCharacterCase}
     */
    @ComProperty(name = "Case", dispId = 0x138)
    void set_Case(WdCharacterCase param0);
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(83)</p>
     * @param Type [in] {@code WdInformation}
     */
    @ComProperty(name = "Information", dispId = 0x139)
    Object getInformation(WdInformation Type);
            
    /**
     * <p>id(0x13a)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "ReadabilityStatistics", dispId = 0x13a)
    ReadabilityStatistics getReadabilityStatistics();
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "GrammaticalErrors", dispId = 0x13b)
    ProofreadingErrors getGrammaticalErrors();
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "SpellingErrors", dispId = 0x13c)
    ProofreadingErrors getSpellingErrors();
            
    /**
     * <p>id(0x13d)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x13d)
    WdTextOrientation getOrientation();
            
    /**
     * <p>id(0x13d)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code WdTextOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x13d)
    void setOrientation(WdTextOrientation param0);
            
    /**
     * <p>id(0x13f)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "InlineShapes", dispId = 0x13f)
    InlineShapes getInlineShapes();
            
    /**
     * <p>id(0x140)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "NextStoryRange", dispId = 0x140)
    Range getNextStoryRange();
            
    /**
     * <p>id(0x141)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x141)
    WdLanguageID getLanguageIDFarEast();
            
    /**
     * <p>id(0x141)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x141)
    void setLanguageIDFarEast(WdLanguageID param0);
            
    /**
     * <p>id(0x142)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "LanguageIDOther", dispId = 0x142)
    WdLanguageID getLanguageIDOther();
            
    /**
     * <p>id(0x142)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageIDOther", dispId = 0x142)
    void setLanguageIDOther(WdLanguageID param0);
            
    /**
     * <p>id(0xffff)</p>
     * <p>vtableId(95)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(96)</p>
     * @param Start [in] {@code Integer}
     * @param End [in] {@code Integer}
     */
    @ComMethod(name = "SetRange", dispId = 0x64)
    void SetRange(Integer Start,
            Integer End);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(97)</p>
     * @param Direction [in, optional] {@code Object}
     */
    @ComMethod(name = "Collapse", dispId = 0x65)
    void Collapse(Object Direction);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(98)</p>
     * @param Text [in] {@code String}
     */
    @ComMethod(name = "InsertBefore", dispId = 0x66)
    void InsertBefore(String Text);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(99)</p>
     * @param Text [in] {@code String}
     */
    @ComMethod(name = "InsertAfter", dispId = 0x68)
    void InsertAfter(String Text);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(100)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "Next", dispId = 0x69)
    Range Next(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(101)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "Previous", dispId = 0x6a)
    Range Previous(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(102)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Extend [in, optional] {@code Object}
     */
    @ComMethod(name = "StartOf", dispId = 0x6b)
    Integer StartOf(Object Unit,
            Object Extend);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(103)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Extend [in, optional] {@code Object}
     */
    @ComMethod(name = "EndOf", dispId = 0x6c)
    Integer EndOf(Object Unit,
            Object Extend);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(104)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "Move", dispId = 0x6d)
    Integer Move(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(105)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveStart", dispId = 0x6e)
    Integer MoveStart(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(106)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveEnd", dispId = 0x6f)
    Integer MoveEnd(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(107)</p>
     * @param Cset [in] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveWhile", dispId = 0x70)
    Integer MoveWhile(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(108)</p>
     * @param Cset [in] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveStartWhile", dispId = 0x71)
    Integer MoveStartWhile(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(109)</p>
     * @param Cset [in] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveEndWhile", dispId = 0x72)
    Integer MoveEndWhile(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(110)</p>
     * @param Cset [in] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveUntil", dispId = 0x73)
    Integer MoveUntil(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(111)</p>
     * @param Cset [in] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveStartUntil", dispId = 0x74)
    Integer MoveStartUntil(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(112)</p>
     * @param Cset [in] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveEndUntil", dispId = 0x75)
    Integer MoveEndUntil(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(113)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x77)
    void Cut();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(114)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x78)
    void Copy();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(115)</p>
     */
    @ComMethod(name = "Paste", dispId = 0x79)
    void Paste();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(116)</p>
     * @param Type [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertBreak", dispId = 0x7a)
    void InsertBreak(Object Type);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(117)</p>
     * @param FileName [in] {@code String}
     * @param Range [in, optional] {@code Object}
     * @param ConfirmConversions [in, optional] {@code Object}
     * @param Link [in, optional] {@code Object}
     * @param Attachment [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertFile", dispId = 0x7b)
    void InsertFile(String FileName,
            Object Range,
            Object ConfirmConversions,
            Object Link,
            Object Attachment);
            
    /**
     * <p>id(0x7d)</p>
     * <p>vtableId(118)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "InStory", dispId = 0x7d)
    Boolean InStory(Range Range);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(119)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "InRange", dispId = 0x7e)
    Boolean InRange(Range Range);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(120)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x7f)
    Integer Delete(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(121)</p>
     */
    @ComMethod(name = "WholeStory", dispId = 0x80)
    void WholeStory();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(122)</p>
     * @param Unit [in, optional] {@code Object}
     */
    @ComMethod(name = "Expand", dispId = 0x81)
    Integer Expand(Object Unit);
            
    /**
     * <p>id(0xa0)</p>
     * <p>vtableId(123)</p>
     */
    @ComMethod(name = "InsertParagraph", dispId = 0xa0)
    void InsertParagraph();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(124)</p>
     */
    @ComMethod(name = "InsertParagraphAfter", dispId = 0xa1)
    void InsertParagraphAfter();
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(125)</p>
     * @param Separator [in, optional] {@code Object}
     * @param NumRows [in, optional] {@code Object}
     * @param NumColumns [in, optional] {@code Object}
     * @param InitialColumnWidth [in, optional] {@code Object}
     * @param Format [in, optional] {@code Object}
     * @param ApplyBorders [in, optional] {@code Object}
     * @param ApplyShading [in, optional] {@code Object}
     * @param ApplyFont [in, optional] {@code Object}
     * @param ApplyColor [in, optional] {@code Object}
     * @param ApplyHeadingRows [in, optional] {@code Object}
     * @param ApplyLastRow [in, optional] {@code Object}
     * @param ApplyFirstColumn [in, optional] {@code Object}
     * @param ApplyLastColumn [in, optional] {@code Object}
     * @param AutoFit [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertToTableOld", dispId = 0xa2)
    Table ConvertToTableOld(Object Separator,
            Object NumRows,
            Object NumColumns,
            Object InitialColumnWidth,
            Object Format,
            Object ApplyBorders,
            Object ApplyShading,
            Object ApplyFont,
            Object ApplyColor,
            Object ApplyHeadingRows,
            Object ApplyLastRow,
            Object ApplyFirstColumn,
            Object ApplyLastColumn,
            Object AutoFit);
            
    /**
     * <p>id(0xa3)</p>
     * <p>vtableId(126)</p>
     * @param DateTimeFormat [in, optional] {@code Object}
     * @param InsertAsField [in, optional] {@code Object}
     * @param InsertAsFullWidth [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertDateTimeOld", dispId = 0xa3)
    void InsertDateTimeOld(Object DateTimeFormat,
            Object InsertAsField,
            Object InsertAsFullWidth);
            
    /**
     * <p>id(0xa4)</p>
     * <p>vtableId(127)</p>
     * @param CharacterNumber [in] {@code Integer}
     * @param Font [in, optional] {@code Object}
     * @param Unicode [in, optional] {@code Object}
     * @param Bias [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertSymbol", dispId = 0xa4)
    void InsertSymbol(Integer CharacterNumber,
            Object Font,
            Object Unicode,
            Object Bias);
            
    /**
     * <p>id(0xa5)</p>
     * <p>vtableId(128)</p>
     * @param ReferenceType [in] {@code Object}
     * @param ReferenceKind [in] {@code WdReferenceKind}
     * @param ReferenceItem [in] {@code Object}
     * @param InsertAsHyperlink [in, optional] {@code Object}
     * @param IncludePosition [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertCrossReference_2002", dispId = 0xa5)
    void InsertCrossReference_2002(Object ReferenceType,
            WdReferenceKind ReferenceKind,
            Object ReferenceItem,
            Object InsertAsHyperlink,
            Object IncludePosition);
            
    /**
     * <p>id(0xa6)</p>
     * <p>vtableId(129)</p>
     * @param Label [in] {@code Object}
     * @param Title [in, optional] {@code Object}
     * @param TitleAutoText [in, optional] {@code Object}
     * @param Position [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertCaptionXP", dispId = 0xa6)
    void InsertCaptionXP(Object Label,
            Object Title,
            Object TitleAutoText,
            Object Position);
            
    /**
     * <p>id(0xa7)</p>
     * <p>vtableId(130)</p>
     */
    @ComMethod(name = "CopyAsPicture", dispId = 0xa7)
    void CopyAsPicture();
            
    /**
     * <p>id(0xa8)</p>
     * <p>vtableId(131)</p>
     * @param ExcludeHeader [in, optional] {@code Object}
     * @param FieldNumber [in, optional] {@code Object}
     * @param SortFieldType [in, optional] {@code Object}
     * @param SortOrder [in, optional] {@code Object}
     * @param FieldNumber2 [in, optional] {@code Object}
     * @param SortFieldType2 [in, optional] {@code Object}
     * @param SortOrder2 [in, optional] {@code Object}
     * @param FieldNumber3 [in, optional] {@code Object}
     * @param SortFieldType3 [in, optional] {@code Object}
     * @param SortOrder3 [in, optional] {@code Object}
     * @param SortColumn [in, optional] {@code Object}
     * @param Separator [in, optional] {@code Object}
     * @param CaseSensitive [in, optional] {@code Object}
     * @param LanguageID [in, optional] {@code Object}
     */
    @ComMethod(name = "SortOld", dispId = 0xa8)
    void SortOld(Object ExcludeHeader,
            Object FieldNumber,
            Object SortFieldType,
            Object SortOrder,
            Object FieldNumber2,
            Object SortFieldType2,
            Object SortOrder2,
            Object FieldNumber3,
            Object SortFieldType3,
            Object SortOrder3,
            Object SortColumn,
            Object Separator,
            Object CaseSensitive,
            Object LanguageID);
            
    /**
     * <p>id(0xa9)</p>
     * <p>vtableId(132)</p>
     */
    @ComMethod(name = "SortAscending", dispId = 0xa9)
    void SortAscending();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(133)</p>
     */
    @ComMethod(name = "SortDescending", dispId = 0xaa)
    void SortDescending();
            
    /**
     * <p>id(0xab)</p>
     * <p>vtableId(134)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "IsEqual", dispId = 0xab)
    Boolean IsEqual(Range Range);
            
    /**
     * <p>id(0xac)</p>
     * <p>vtableId(135)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0xac)
    Float Calculate();
            
    /**
     * <p>id(0xad)</p>
     * <p>vtableId(136)</p>
     * @param What [in, optional] {@code Object}
     * @param Which [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     * @param Name [in, optional] {@code Object}
     */
    @ComMethod(name = "GoTo", dispId = 0xad)
    Range GoTo(Object What,
            Object Which,
            Object Count,
            Object Name);
            
    /**
     * <p>id(0xae)</p>
     * <p>vtableId(137)</p>
     * @param What [in] {@code WdGoToItem}
     */
    @ComMethod(name = "GoToNext", dispId = 0xae)
    Range GoToNext(WdGoToItem What);
            
    /**
     * <p>id(0xaf)</p>
     * <p>vtableId(138)</p>
     * @param What [in] {@code WdGoToItem}
     */
    @ComMethod(name = "GoToPrevious", dispId = 0xaf)
    Range GoToPrevious(WdGoToItem What);
            
    /**
     * <p>id(0xb0)</p>
     * <p>vtableId(139)</p>
     * @param IconIndex [in, optional] {@code Object}
     * @param Link [in, optional] {@code Object}
     * @param Placement [in, optional] {@code Object}
     * @param DisplayAsIcon [in, optional] {@code Object}
     * @param DataType [in, optional] {@code Object}
     * @param IconFileName [in, optional] {@code Object}
     * @param IconLabel [in, optional] {@code Object}
     */
    @ComMethod(name = "PasteSpecial", dispId = 0xb0)
    void PasteSpecial(Object IconIndex,
            Object Link,
            Object Placement,
            Object DisplayAsIcon,
            Object DataType,
            Object IconFileName,
            Object IconLabel);
            
    /**
     * <p>id(0xb1)</p>
     * <p>vtableId(140)</p>
     */
    @ComMethod(name = "LookupNameProperties", dispId = 0xb1)
    void LookupNameProperties();
            
    /**
     * <p>id(0xb2)</p>
     * <p>vtableId(141)</p>
     * @param Statistic [in] {@code WdStatistic}
     */
    @ComMethod(name = "ComputeStatistics", dispId = 0xb2)
    Integer ComputeStatistics(WdStatistic Statistic);
            
    /**
     * <p>id(0xb3)</p>
     * <p>vtableId(142)</p>
     * @param Direction [in] {@code Integer}
     */
    @ComMethod(name = "Relocate", dispId = 0xb3)
    void Relocate(Integer Direction);
            
    /**
     * <p>id(0xb4)</p>
     * <p>vtableId(143)</p>
     */
    @ComMethod(name = "CheckSynonyms", dispId = 0xb4)
    void CheckSynonyms();
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(144)</p>
     * @param Edition [in] {@code String}
     * @param Format [in, optional] {@code Object}
     */
    @ComMethod(name = "SubscribeTo", dispId = 0xb5)
    void SubscribeTo(String Edition,
            Object Format);
            
    /**
     * <p>id(0xb6)</p>
     * <p>vtableId(145)</p>
     * @param Edition [in, optional] {@code Object}
     * @param ContainsPICT [in, optional] {@code Object}
     * @param ContainsRTF [in, optional] {@code Object}
     * @param ContainsText [in, optional] {@code Object}
     */
    @ComMethod(name = "CreatePublisher", dispId = 0xb6)
    void CreatePublisher(Object Edition,
            Object ContainsPICT,
            Object ContainsRTF,
            Object ContainsText);
            
    /**
     * <p>id(0xb7)</p>
     * <p>vtableId(146)</p>
     */
    @ComMethod(name = "InsertAutoText", dispId = 0xb7)
    void InsertAutoText();
            
    /**
     * <p>id(0xc2)</p>
     * <p>vtableId(147)</p>
     * @param Format [in, optional] {@code Object}
     * @param Style [in, optional] {@code Object}
     * @param LinkToSource [in, optional] {@code Object}
     * @param Connection [in, optional] {@code Object}
     * @param SQLStatement [in, optional] {@code Object}
     * @param SQLStatement1 [in, optional] {@code Object}
     * @param PasswordDocument [in, optional] {@code Object}
     * @param PasswordTemplate [in, optional] {@code Object}
     * @param WritePasswordDocument [in, optional] {@code Object}
     * @param WritePasswordTemplate [in, optional] {@code Object}
     * @param DataSource [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param IncludeFields [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertDatabase", dispId = 0xc2)
    void InsertDatabase(Object Format,
            Object Style,
            Object LinkToSource,
            Object Connection,
            Object SQLStatement,
            Object SQLStatement1,
            Object PasswordDocument,
            Object PasswordTemplate,
            Object WritePasswordDocument,
            Object WritePasswordTemplate,
            Object DataSource,
            Object From,
            Object To,
            Object IncludeFields);
            
    /**
     * <p>id(0xc3)</p>
     * <p>vtableId(148)</p>
     */
    @ComMethod(name = "AutoFormat", dispId = 0xc3)
    void AutoFormat();
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(149)</p>
     */
    @ComMethod(name = "CheckGrammar", dispId = 0xcc)
    void CheckGrammar();
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(150)</p>
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
    @ComMethod(name = "CheckSpelling", dispId = 0xcd)
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
     * <p>id(0xd1)</p>
     * <p>vtableId(151)</p>
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param MainDictionary [in, optional] {@code Object}
     * @param SuggestionMode [in, optional] {@code Object}
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
    @ComMethod(name = "GetSpellingSuggestions", dispId = 0xd1)
    SpellingSuggestions GetSpellingSuggestions(Object CustomDictionary,
            Object IgnoreUppercase,
            Object MainDictionary,
            Object SuggestionMode,
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
     * <p>id(0xd4)</p>
     * <p>vtableId(152)</p>
     */
    @ComMethod(name = "InsertParagraphBefore", dispId = 0xd4)
    void InsertParagraphBefore();
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(153)</p>
     */
    @ComMethod(name = "NextSubdocument", dispId = 0xdb)
    void NextSubdocument();
            
    /**
     * <p>id(0xdc)</p>
     * <p>vtableId(154)</p>
     */
    @ComMethod(name = "PreviousSubdocument", dispId = 0xdc)
    void PreviousSubdocument();
            
    /**
     * <p>id(0xdd)</p>
     * <p>vtableId(155)</p>
     * @param ConversionsMode [in, optional] {@code Object}
     * @param FastConversion [in, optional] {@code Object}
     * @param CheckHangulEnding [in, optional] {@code Object}
     * @param EnableRecentOrdering [in, optional] {@code Object}
     * @param CustomDictionary [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertHangulAndHanja", dispId = 0xdd)
    void ConvertHangulAndHanja(Object ConversionsMode,
            Object FastConversion,
            Object CheckHangulEnding,
            Object EnableRecentOrdering,
            Object CustomDictionary);
            
    /**
     * <p>id(0xde)</p>
     * <p>vtableId(156)</p>
     */
    @ComMethod(name = "PasteAsNestedTable", dispId = 0xde)
    void PasteAsNestedTable();
            
    /**
     * <p>id(0xdf)</p>
     * <p>vtableId(157)</p>
     * @param Style [in] {@code Object}
     * @param Symbol [in, optional] {@code Object}
     * @param EnclosedText [in, optional] {@code Object}
     */
    @ComMethod(name = "ModifyEnclosure", dispId = 0xdf)
    void ModifyEnclosure(Object Style,
            Object Symbol,
            Object EnclosedText);
            
    /**
     * <p>id(0xe0)</p>
     * <p>vtableId(158)</p>
     * @param Text [in] {@code String}
     * @param Alignment [in, optional] {@code WdPhoneticGuideAlignmentType}
     * @param Raise [in, optional] {@code Integer}
     * @param FontSize [in, optional] {@code Integer}
     * @param FontName [in, optional] {@code String}
     */
    @ComMethod(name = "PhoneticGuide", dispId = 0xe0)
    void PhoneticGuide(String Text,
            WdPhoneticGuideAlignmentType Alignment,
            Integer Raise,
            Integer FontSize,
            String FontName);
            
    /**
     * <p>id(0x1bc)</p>
     * <p>vtableId(159)</p>
     * @param DateTimeFormat [in, optional] {@code Object}
     * @param InsertAsField [in, optional] {@code Object}
     * @param InsertAsFullWidth [in, optional] {@code Object}
     * @param DateLanguage [in, optional] {@code Object}
     * @param CalendarType [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertDateTime", dispId = 0x1bc)
    void InsertDateTime(Object DateTimeFormat,
            Object InsertAsField,
            Object InsertAsFullWidth,
            Object DateLanguage,
            Object CalendarType);
            
    /**
     * <p>id(0x1e4)</p>
     * <p>vtableId(160)</p>
     * @param ExcludeHeader [in, optional] {@code Object}
     * @param FieldNumber [in, optional] {@code Object}
     * @param SortFieldType [in, optional] {@code Object}
     * @param SortOrder [in, optional] {@code Object}
     * @param FieldNumber2 [in, optional] {@code Object}
     * @param SortFieldType2 [in, optional] {@code Object}
     * @param SortOrder2 [in, optional] {@code Object}
     * @param FieldNumber3 [in, optional] {@code Object}
     * @param SortFieldType3 [in, optional] {@code Object}
     * @param SortOrder3 [in, optional] {@code Object}
     * @param SortColumn [in, optional] {@code Object}
     * @param Separator [in, optional] {@code Object}
     * @param CaseSensitive [in, optional] {@code Object}
     * @param BidiSort [in, optional] {@code Object}
     * @param IgnoreThe [in, optional] {@code Object}
     * @param IgnoreKashida [in, optional] {@code Object}
     * @param IgnoreDiacritics [in, optional] {@code Object}
     * @param IgnoreHe [in, optional] {@code Object}
     * @param LanguageID [in, optional] {@code Object}
     */
    @ComMethod(name = "Sort", dispId = 0x1e4)
    void Sort(Object ExcludeHeader,
            Object FieldNumber,
            Object SortFieldType,
            Object SortOrder,
            Object FieldNumber2,
            Object SortFieldType2,
            Object SortOrder2,
            Object FieldNumber3,
            Object SortFieldType3,
            Object SortOrder3,
            Object SortColumn,
            Object Separator,
            Object CaseSensitive,
            Object BidiSort,
            Object IgnoreThe,
            Object IgnoreKashida,
            Object IgnoreDiacritics,
            Object IgnoreHe,
            Object LanguageID);
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(161)</p>
     */
    @ComMethod(name = "DetectLanguage", dispId = 0xcb)
    void DetectLanguage();
            
    /**
     * <p>id(0x1f2)</p>
     * <p>vtableId(162)</p>
     * @param Separator [in, optional] {@code Object}
     * @param NumRows [in, optional] {@code Object}
     * @param NumColumns [in, optional] {@code Object}
     * @param InitialColumnWidth [in, optional] {@code Object}
     * @param Format [in, optional] {@code Object}
     * @param ApplyBorders [in, optional] {@code Object}
     * @param ApplyShading [in, optional] {@code Object}
     * @param ApplyFont [in, optional] {@code Object}
     * @param ApplyColor [in, optional] {@code Object}
     * @param ApplyHeadingRows [in, optional] {@code Object}
     * @param ApplyLastRow [in, optional] {@code Object}
     * @param ApplyFirstColumn [in, optional] {@code Object}
     * @param ApplyLastColumn [in, optional] {@code Object}
     * @param AutoFit [in, optional] {@code Object}
     * @param AutoFitBehavior [in, optional] {@code Object}
     * @param DefaultTableBehavior [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertToTable", dispId = 0x1f2)
    Table ConvertToTable(Object Separator,
            Object NumRows,
            Object NumColumns,
            Object InitialColumnWidth,
            Object Format,
            Object ApplyBorders,
            Object ApplyShading,
            Object ApplyFont,
            Object ApplyColor,
            Object ApplyHeadingRows,
            Object ApplyLastRow,
            Object ApplyFirstColumn,
            Object ApplyLastColumn,
            Object AutoFit,
            Object AutoFitBehavior,
            Object DefaultTableBehavior);
            
    /**
     * <p>id(0x1f3)</p>
     * <p>vtableId(163)</p>
     * @param WdTCSCConverterDirection [in, optional] {@code WdTCSCConverterDirection}
     * @param CommonTerms [in, optional] {@code Boolean}
     * @param UseVariants [in, optional] {@code Boolean}
     */
    @ComMethod(name = "TCSCConverter", dispId = 0x1f3)
    void TCSCConverter(WdTCSCConverterDirection WdTCSCConverterDirection,
            Boolean CommonTerms,
            Boolean UseVariants);
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(164)</p>
     */
    @ComProperty(name = "LanguageDetected", dispId = 0x107)
    Boolean getLanguageDetected();
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(165)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LanguageDetected", dispId = 0x107)
    void setLanguageDetected(Boolean param0);
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(166)</p>
     */
    @ComProperty(name = "FitTextWidth", dispId = 0x108)
    Float getFitTextWidth();
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(167)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "FitTextWidth", dispId = 0x108)
    void setFitTextWidth(Float param0);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(168)</p>
     */
    @ComProperty(name = "HorizontalInVertical", dispId = 0x109)
    WdHorizontalInVerticalType getHorizontalInVertical();
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(169)</p>
     * @param param0 [in] {@code WdHorizontalInVerticalType}
     */
    @ComProperty(name = "HorizontalInVertical", dispId = 0x109)
    void setHorizontalInVertical(WdHorizontalInVerticalType param0);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(170)</p>
     */
    @ComProperty(name = "TwoLinesInOne", dispId = 0x10a)
    WdTwoLinesInOneType getTwoLinesInOne();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(171)</p>
     * @param param0 [in] {@code WdTwoLinesInOneType}
     */
    @ComProperty(name = "TwoLinesInOne", dispId = 0x10a)
    void setTwoLinesInOne(WdTwoLinesInOneType param0);
            
    /**
     * <p>id(0x10b)</p>
     * <p>vtableId(172)</p>
     */
    @ComProperty(name = "CombineCharacters", dispId = 0x10b)
    Boolean getCombineCharacters();
            
    /**
     * <p>id(0x10b)</p>
     * <p>vtableId(173)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CombineCharacters", dispId = 0x10b)
    void setCombineCharacters(Boolean param0);
            
    /**
     * <p>id(0x143)</p>
     * <p>vtableId(174)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x143)
    Integer getNoProofing();
            
    /**
     * <p>id(0x143)</p>
     * <p>vtableId(175)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "NoProofing", dispId = 0x143)
    void setNoProofing(Integer param0);
            
    /**
     * <p>id(0x144)</p>
     * <p>vtableId(176)</p>
     */
    @ComProperty(name = "TopLevelTables", dispId = 0x144)
    Tables getTopLevelTables();
            
    /**
     * <p>id(0x145)</p>
     * <p>vtableId(177)</p>
     */
    @ComProperty(name = "Scripts", dispId = 0x145)
    eu.doppel_helix.jna.tlb.office2.Scripts getScripts();
            
    /**
     * <p>id(0x146)</p>
     * <p>vtableId(178)</p>
     */
    @ComProperty(name = "CharacterWidth", dispId = 0x146)
    WdCharacterWidth getCharacterWidth();
            
    /**
     * <p>id(0x146)</p>
     * <p>vtableId(179)</p>
     * @param param0 [in] {@code WdCharacterWidth}
     */
    @ComProperty(name = "CharacterWidth", dispId = 0x146)
    void setCharacterWidth(WdCharacterWidth param0);
            
    /**
     * <p>id(0x147)</p>
     * <p>vtableId(180)</p>
     */
    @ComProperty(name = "Kana", dispId = 0x147)
    WdKana getKana();
            
    /**
     * <p>id(0x147)</p>
     * <p>vtableId(181)</p>
     * @param param0 [in] {@code WdKana}
     */
    @ComProperty(name = "Kana", dispId = 0x147)
    void setKana(WdKana param0);
            
    /**
     * <p>id(0x190)</p>
     * <p>vtableId(182)</p>
     */
    @ComProperty(name = "BoldBi", dispId = 0x190)
    Integer getBoldBi();
            
    /**
     * <p>id(0x190)</p>
     * <p>vtableId(183)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BoldBi", dispId = 0x190)
    void setBoldBi(Integer param0);
            
    /**
     * <p>id(0x191)</p>
     * <p>vtableId(184)</p>
     */
    @ComProperty(name = "ItalicBi", dispId = 0x191)
    Integer getItalicBi();
            
    /**
     * <p>id(0x191)</p>
     * <p>vtableId(185)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ItalicBi", dispId = 0x191)
    void setItalicBi(Integer param0);
            
    /**
     * <p>id(0x195)</p>
     * <p>vtableId(186)</p>
     */
    @ComProperty(name = "ID", dispId = 0x195)
    String getID();
            
    /**
     * <p>id(0x195)</p>
     * <p>vtableId(187)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ID", dispId = 0x195)
    void setID(String param0);
            
    /**
     * <p>id(0x196)</p>
     * <p>vtableId(188)</p>
     */
    @ComProperty(name = "HTMLDivisions", dispId = 0x196)
    HTMLDivisions getHTMLDivisions();
            
    /**
     * <p>id(0x197)</p>
     * <p>vtableId(189)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x197)
    SmartTags getSmartTags();
            
    /**
     * <p>id(0x198)</p>
     * <p>vtableId(190)</p>
     */
    @ComProperty(name = "ShowAll", dispId = 0x198)
    Boolean getShowAll();
            
    /**
     * <p>id(0x198)</p>
     * <p>vtableId(191)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAll", dispId = 0x198)
    void setShowAll(Boolean param0);
            
    /**
     * <p>id(0x199)</p>
     * <p>vtableId(192)</p>
     */
    @ComProperty(name = "Document", dispId = 0x199)
    Document getDocument();
            
    /**
     * <p>id(0x19a)</p>
     * <p>vtableId(193)</p>
     */
    @ComProperty(name = "FootnoteOptions", dispId = 0x19a)
    FootnoteOptions getFootnoteOptions();
            
    /**
     * <p>id(0x19b)</p>
     * <p>vtableId(194)</p>
     */
    @ComProperty(name = "EndnoteOptions", dispId = 0x19b)
    EndnoteOptions getEndnoteOptions();
            
    /**
     * <p>id(0x19c)</p>
     * <p>vtableId(195)</p>
     * @param Type [in] {@code WdRecoveryType}
     */
    @ComMethod(name = "PasteAndFormat", dispId = 0x19c)
    void PasteAndFormat(WdRecoveryType Type);
            
    /**
     * <p>id(0x19d)</p>
     * <p>vtableId(196)</p>
     * @param LinkedToExcel [in] {@code Boolean}
     * @param WordFormatting [in] {@code Boolean}
     * @param RTF [in] {@code Boolean}
     */
    @ComMethod(name = "PasteExcelTable", dispId = 0x19d)
    void PasteExcelTable(Boolean LinkedToExcel,
            Boolean WordFormatting,
            Boolean RTF);
            
    /**
     * <p>id(0x19e)</p>
     * <p>vtableId(197)</p>
     */
    @ComMethod(name = "PasteAppendTable", dispId = 0x19e)
    void PasteAppendTable();
            
    /**
     * <p>id(0x154)</p>
     * <p>vtableId(198)</p>
     */
    @ComProperty(name = "XMLNodes", dispId = 0x154)
    XMLNodes getXMLNodes();
            
    /**
     * <p>id(0x155)</p>
     * <p>vtableId(199)</p>
     */
    @ComProperty(name = "XMLParentNode", dispId = 0x155)
    XMLNode getXMLParentNode();
            
    /**
     * <p>id(0x157)</p>
     * <p>vtableId(200)</p>
     */
    @ComProperty(name = "Editors", dispId = 0x157)
    Editors getEditors();
            
    /**
     * <p>id(0x158)</p>
     * <p>vtableId(201)</p>
     * @param DataOnly [in, optional] {@code Boolean}
     */
    @ComProperty(name = "XML", dispId = 0x158)
    String getXML(Boolean DataOnly);
            
    /**
     * <p>id(0x159)</p>
     * <p>vtableId(202)</p>
     */
    @ComProperty(name = "EnhMetaFileBits", dispId = 0x159)
    Object getEnhMetaFileBits();
            
    /**
     * <p>id(0x19f)</p>
     * <p>vtableId(203)</p>
     * @param EditorID [in, optional] {@code Object}
     */
    @ComMethod(name = "GoToEditableRange", dispId = 0x19f)
    Range GoToEditableRange(Object EditorID);
            
    /**
     * <p>id(0x1a0)</p>
     * <p>vtableId(204)</p>
     * @param XML [in] {@code String}
     * @param Transform [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertXML", dispId = 0x1a0)
    void InsertXML(String XML,
            Object Transform);
            
    /**
     * <p>id(0x1a1)</p>
     * <p>vtableId(205)</p>
     * @param Label [in] {@code Object}
     * @param Title [in, optional] {@code Object}
     * @param TitleAutoText [in, optional] {@code Object}
     * @param Position [in, optional] {@code Object}
     * @param ExcludeLabel [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertCaption", dispId = 0x1a1)
    void InsertCaption(Object Label,
            Object Title,
            Object TitleAutoText,
            Object Position,
            Object ExcludeLabel);
            
    /**
     * <p>id(0x1a2)</p>
     * <p>vtableId(206)</p>
     * @param ReferenceType [in] {@code Object}
     * @param ReferenceKind [in] {@code WdReferenceKind}
     * @param ReferenceItem [in] {@code Object}
     * @param InsertAsHyperlink [in, optional] {@code Object}
     * @param IncludePosition [in, optional] {@code Object}
     * @param SeparateNumbers [in, optional] {@code Object}
     * @param SeparatorString [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertCrossReference", dispId = 0x1a2)
    void InsertCrossReference(Object ReferenceType,
            WdReferenceKind ReferenceKind,
            Object ReferenceItem,
            Object InsertAsHyperlink,
            Object IncludePosition,
            Object SeparateNumbers,
            Object SeparatorString);
            
    /**
     * <p>id(0x15a)</p>
     * <p>vtableId(207)</p>
     */
    @ComProperty(name = "OMaths", dispId = 0x15a)
    OMaths getOMaths();
            
    /**
     * <p>id(0x1a4)</p>
     * <p>vtableId(208)</p>
     */
    @ComProperty(name = "CharacterStyle", dispId = 0x1a4)
    Object getCharacterStyle();
            
    /**
     * <p>id(0x1a5)</p>
     * <p>vtableId(209)</p>
     */
    @ComProperty(name = "ParagraphStyle", dispId = 0x1a5)
    Object getParagraphStyle();
            
    /**
     * <p>id(0x1a6)</p>
     * <p>vtableId(210)</p>
     */
    @ComProperty(name = "ListStyle", dispId = 0x1a6)
    Object getListStyle();
            
    /**
     * <p>id(0x1a7)</p>
     * <p>vtableId(211)</p>
     */
    @ComProperty(name = "TableStyle", dispId = 0x1a7)
    Object getTableStyle();
            
    /**
     * <p>id(0x1a8)</p>
     * <p>vtableId(212)</p>
     */
    @ComProperty(name = "ContentControls", dispId = 0x1a8)
    ContentControls getContentControls();
            
    /**
     * <p>id(0x1a9)</p>
     * <p>vtableId(213)</p>
     * @param FileName [in] {@code String}
     * @param Format [in] {@code WdSaveFormat}
     */
    @ComMethod(name = "ExportFragment", dispId = 0x1a9)
    void ExportFragment(String FileName,
            WdSaveFormat Format);
            
    /**
     * <p>id(0x1aa)</p>
     * <p>vtableId(214)</p>
     */
    @ComProperty(name = "WordOpenXML", dispId = 0x1aa)
    String getWordOpenXML();
            
    /**
     * <p>id(0x1ab)</p>
     * <p>vtableId(215)</p>
     * @param Level [in] {@code Short}
     */
    @ComMethod(name = "SetListLevel", dispId = 0x1ab)
    void SetListLevel(Short Level);
            
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(216)</p>
     * @param Alignment [in] {@code Integer}
     * @param RelativeTo [in, optional] {@code Integer}
     */
    @ComMethod(name = "InsertAlignmentTab", dispId = 0x1f4)
    void InsertAlignmentTab(Integer Alignment,
            Integer RelativeTo);
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(217)</p>
     */
    @ComProperty(name = "ParentContentControl", dispId = 0x1f5)
    ContentControl getParentContentControl();
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(218)</p>
     * @param FileName [in] {@code String}
     * @param MatchDestination [in, optional] {@code Boolean}
     */
    @ComMethod(name = "ImportFragment", dispId = 0x1f6)
    void ImportFragment(String FileName,
            Boolean MatchDestination);
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(219)</p>
     * @param OutputFileName [in] {@code String}
     * @param ExportFormat [in] {@code WdExportFormat}
     * @param OpenAfterExport [in, optional] {@code Boolean}
     * @param OptimizeFor [in, optional] {@code WdExportOptimizeFor}
     * @param ExportCurrentPage [in, optional] {@code Boolean}
     * @param Item [in, optional] {@code WdExportItem}
     * @param IncludeDocProps [in, optional] {@code Boolean}
     * @param KeepIRM [in, optional] {@code Boolean}
     * @param CreateBookmarks [in, optional] {@code WdExportCreateBookmarks}
     * @param DocStructureTags [in, optional] {@code Boolean}
     * @param BitmapMissingFonts [in, optional] {@code Boolean}
     * @param UseISO19005_1 [in, optional] {@code Boolean}
     * @param FixedFormatExtClassPtr [in, optional] {@code Object}
     */
    @ComMethod(name = "ExportAsFixedFormat", dispId = 0x1f7)
    void ExportAsFixedFormat(String OutputFileName,
            WdExportFormat ExportFormat,
            Boolean OpenAfterExport,
            WdExportOptimizeFor OptimizeFor,
            Boolean ExportCurrentPage,
            WdExportItem Item,
            Boolean IncludeDocProps,
            Boolean KeepIRM,
            WdExportCreateBookmarks CreateBookmarks,
            Boolean DocStructureTags,
            Boolean BitmapMissingFonts,
            Boolean UseISO19005_1,
            Object FixedFormatExtClassPtr);
            
    /**
     * <p>id(0x1f8)</p>
     * <p>vtableId(220)</p>
     */
    @ComProperty(name = "Locks", dispId = 0x1f8)
    CoAuthLocks getLocks();
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(221)</p>
     */
    @ComProperty(name = "Updates", dispId = 0x1f9)
    CoAuthUpdates getUpdates();
            
    /**
     * <p>id(0x1fa)</p>
     * <p>vtableId(222)</p>
     */
    @ComProperty(name = "Conflicts", dispId = 0x1fa)
    Conflicts getConflicts();
            
    /**
     * <p>id(0x1fb)</p>
     * <p>vtableId(223)</p>
     */
    @ComProperty(name = "TextVisibleOnScreen", dispId = 0x1fb)
    Integer getTextVisibleOnScreen();
            
    /**
     * <p>id(0x1fc)</p>
     * <p>vtableId(224)</p>
     * @param SortFieldType [in, optional] {@code Object}
     * @param SortOrder [in, optional] {@code Object}
     * @param CaseSensitive [in, optional] {@code Object}
     * @param BidiSort [in, optional] {@code Object}
     * @param IgnoreThe [in, optional] {@code Object}
     * @param IgnoreKashida [in, optional] {@code Object}
     * @param IgnoreDiacritics [in, optional] {@code Object}
     * @param IgnoreHe [in, optional] {@code Object}
     * @param LanguageID [in, optional] {@code Object}
     */
    @ComMethod(name = "SortByHeadings", dispId = 0x1fc)
    void SortByHeadings(Object SortFieldType,
            Object SortOrder,
            Object CaseSensitive,
            Object BidiSort,
            Object IgnoreThe,
            Object IgnoreKashida,
            Object IgnoreDiacritics,
            Object IgnoreHe,
            Object LanguageID);
            
    
}