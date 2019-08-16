
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020975-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020975-0000-0000-C000-000000000046}")
public interface Selection extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Type", dispId = 0x6)
    WdSelectionType getType();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "StoryType", dispId = 0x7)
    WdStoryType getStoryType();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Style", dispId = 0x8)
    Object getStyle();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0x8)
    void setStyle(Object param0);
            
    /**
     * <p>id(0x32)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Tables", dispId = 0x32)
    Tables getTables();
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Words", dispId = 0x33)
    Words getWords();
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Sentences", dispId = 0x34)
    Sentences getSentences();
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x35)
    Characters getCharacters();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Footnotes", dispId = 0x36)
    Footnotes getFootnotes();
            
    /**
     * <p>id(0x37)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Endnotes", dispId = 0x37)
    Endnotes getEndnotes();
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x38)
    Comments getComments();
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Cells", dispId = 0x39)
    Cells getCells();
            
    /**
     * <p>id(0x3a)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Sections", dispId = 0x3a)
    Sections getSections();
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Paragraphs", dispId = 0x3b)
    Paragraphs getParagraphs();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x3d)
    Shading getShading();
            
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
     * <p>id(0x44d)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "PageSetup", dispId = 0x44d)
    PageSetup getPageSetup();
            
    /**
     * <p>id(0x44d)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code PageSetup}
     */
    @ComProperty(name = "PageSetup", dispId = 0x44d)
    void setPageSetup(PageSetup param0);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Bookmarks", dispId = 0x4b)
    Bookmarks getBookmarks();
            
    /**
     * <p>id(0x98)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "StoryLength", dispId = 0x98)
    Integer getStoryLength();
            
    /**
     * <p>id(0x99)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x99)
    WdLanguageID getLanguageID();
            
    /**
     * <p>id(0x99)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageID", dispId = 0x99)
    void setLanguageID(WdLanguageID param0);
            
    /**
     * <p>id(0x9a)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x9a)
    WdLanguageID getLanguageIDFarEast();
            
    /**
     * <p>id(0x9a)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x9a)
    void setLanguageIDFarEast(WdLanguageID param0);
            
    /**
     * <p>id(0x9b)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "LanguageIDOther", dispId = 0x9b)
    WdLanguageID getLanguageIDOther();
            
    /**
     * <p>id(0x9b)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageIDOther", dispId = 0x9b)
    void setLanguageIDOther(WdLanguageID param0);
            
    /**
     * <p>id(0x9c)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x9c)
    Hyperlinks getHyperlinks();
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "Columns", dispId = 0x12e)
    Columns getColumns();
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "Rows", dispId = 0x12f)
    Rows getRows();
            
    /**
     * <p>id(0x132)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "HeaderFooter", dispId = 0x132)
    HeaderFooter getHeaderFooter();
            
    /**
     * <p>id(0x133)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "IsEndOfRowMark", dispId = 0x133)
    Boolean getIsEndOfRowMark();
            
    /**
     * <p>id(0x134)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "BookmarkID", dispId = 0x134)
    Integer getBookmarkID();
            
    /**
     * <p>id(0x135)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "PreviousBookmarkID", dispId = 0x135)
    Integer getPreviousBookmarkID();
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "Find", dispId = 0x106)
    Find getFind();
            
    /**
     * <p>id(0x190)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Range", dispId = 0x190)
    Range getRange();
            
    /**
     * <p>id(0x191)</p>
     * <p>vtableId(58)</p>
     * @param Type [in] {@code WdInformation}
     */
    @ComProperty(name = "Information", dispId = 0x191)
    Object getInformation(WdInformation Type);
            
    /**
     * <p>id(0x192)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "Flags", dispId = 0x192)
    WdSelectionFlags getFlags();
            
    /**
     * <p>id(0x192)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code WdSelectionFlags}
     */
    @ComProperty(name = "Flags", dispId = 0x192)
    void setFlags(WdSelectionFlags param0);
            
    /**
     * <p>id(0x193)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Active", dispId = 0x193)
    Boolean getActive();
            
    /**
     * <p>id(0x194)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "StartIsActive", dispId = 0x194)
    Boolean getStartIsActive();
            
    /**
     * <p>id(0x194)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "StartIsActive", dispId = 0x194)
    void setStartIsActive(Boolean param0);
            
    /**
     * <p>id(0x195)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "IPAtEndOfLine", dispId = 0x195)
    Boolean getIPAtEndOfLine();
            
    /**
     * <p>id(0x196)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "ExtendMode", dispId = 0x196)
    Boolean getExtendMode();
            
    /**
     * <p>id(0x196)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ExtendMode", dispId = 0x196)
    void setExtendMode(Boolean param0);
            
    /**
     * <p>id(0x197)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "ColumnSelectMode", dispId = 0x197)
    Boolean getColumnSelectMode();
            
    /**
     * <p>id(0x197)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ColumnSelectMode", dispId = 0x197)
    void setColumnSelectMode(Boolean param0);
            
    /**
     * <p>id(0x19a)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x19a)
    WdTextOrientation getOrientation();
            
    /**
     * <p>id(0x19a)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code WdTextOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x19a)
    void setOrientation(WdTextOrientation param0);
            
    /**
     * <p>id(0x19b)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "InlineShapes", dispId = 0x19b)
    InlineShapes getInlineShapes();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "Document", dispId = 0x3eb)
    Document getDocument();
            
    /**
     * <p>id(0x3ec)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "ShapeRange", dispId = 0x3ec)
    ShapeRange getShapeRange();
            
    /**
     * <p>id(0xffff)</p>
     * <p>vtableId(77)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(78)</p>
     * @param Start [in] {@code Integer}
     * @param End [in] {@code Integer}
     */
    @ComMethod(name = "SetRange", dispId = 0x64)
    void SetRange(Integer Start,
            Integer End);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(79)</p>
     * @param Direction [in, optional] {@code Object}
     */
    @ComMethod(name = "Collapse", dispId = 0x65)
    void Collapse(Object Direction);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(80)</p>
     * @param Text [in] {@code String}
     */
    @ComMethod(name = "InsertBefore", dispId = 0x66)
    void InsertBefore(String Text);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(81)</p>
     * @param Text [in] {@code String}
     */
    @ComMethod(name = "InsertAfter", dispId = 0x68)
    void InsertAfter(String Text);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(82)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "Next", dispId = 0x69)
    Range Next(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(83)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "Previous", dispId = 0x6a)
    Range Previous(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(84)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Extend [in, optional] {@code Object}
     */
    @ComMethod(name = "StartOf", dispId = 0x6b)
    Integer StartOf(Object Unit,
            Object Extend);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(85)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Extend [in, optional] {@code Object}
     */
    @ComMethod(name = "EndOf", dispId = 0x6c)
    Integer EndOf(Object Unit,
            Object Extend);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(86)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "Move", dispId = 0x6d)
    Integer Move(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(87)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveStart", dispId = 0x6e)
    Integer MoveStart(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(88)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveEnd", dispId = 0x6f)
    Integer MoveEnd(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(89)</p>
     * @param Cset [in] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveWhile", dispId = 0x70)
    Integer MoveWhile(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(90)</p>
     * @param Cset [in] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveStartWhile", dispId = 0x71)
    Integer MoveStartWhile(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(91)</p>
     * @param Cset [in] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveEndWhile", dispId = 0x72)
    Integer MoveEndWhile(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(92)</p>
     * @param Cset [in] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveUntil", dispId = 0x73)
    Integer MoveUntil(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(93)</p>
     * @param Cset [in] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveStartUntil", dispId = 0x74)
    Integer MoveStartUntil(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(94)</p>
     * @param Cset [in] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveEndUntil", dispId = 0x75)
    Integer MoveEndUntil(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(95)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x77)
    void Cut();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(96)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x78)
    void Copy();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(97)</p>
     */
    @ComMethod(name = "Paste", dispId = 0x79)
    void Paste();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(98)</p>
     * @param Type [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertBreak", dispId = 0x7a)
    void InsertBreak(Object Type);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(99)</p>
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
     * <p>vtableId(100)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "InStory", dispId = 0x7d)
    Boolean InStory(Range Range);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(101)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "InRange", dispId = 0x7e)
    Boolean InRange(Range Range);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(102)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x7f)
    Integer Delete(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(103)</p>
     * @param Unit [in, optional] {@code Object}
     */
    @ComMethod(name = "Expand", dispId = 0x81)
    Integer Expand(Object Unit);
            
    /**
     * <p>id(0xa0)</p>
     * <p>vtableId(104)</p>
     */
    @ComMethod(name = "InsertParagraph", dispId = 0xa0)
    void InsertParagraph();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(105)</p>
     */
    @ComMethod(name = "InsertParagraphAfter", dispId = 0xa1)
    void InsertParagraphAfter();
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(106)</p>
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
     * <p>vtableId(107)</p>
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
     * <p>vtableId(108)</p>
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
     * <p>vtableId(109)</p>
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
     * <p>vtableId(110)</p>
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
     * <p>vtableId(111)</p>
     */
    @ComMethod(name = "CopyAsPicture", dispId = 0xa7)
    void CopyAsPicture();
            
    /**
     * <p>id(0xa8)</p>
     * <p>vtableId(112)</p>
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
     * <p>vtableId(113)</p>
     */
    @ComMethod(name = "SortAscending", dispId = 0xa9)
    void SortAscending();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(114)</p>
     */
    @ComMethod(name = "SortDescending", dispId = 0xaa)
    void SortDescending();
            
    /**
     * <p>id(0xab)</p>
     * <p>vtableId(115)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "IsEqual", dispId = 0xab)
    Boolean IsEqual(Range Range);
            
    /**
     * <p>id(0xac)</p>
     * <p>vtableId(116)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0xac)
    Float Calculate();
            
    /**
     * <p>id(0xad)</p>
     * <p>vtableId(117)</p>
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
     * <p>vtableId(118)</p>
     * @param What [in] {@code WdGoToItem}
     */
    @ComMethod(name = "GoToNext", dispId = 0xae)
    Range GoToNext(WdGoToItem What);
            
    /**
     * <p>id(0xaf)</p>
     * <p>vtableId(119)</p>
     * @param What [in] {@code WdGoToItem}
     */
    @ComMethod(name = "GoToPrevious", dispId = 0xaf)
    Range GoToPrevious(WdGoToItem What);
            
    /**
     * <p>id(0xb0)</p>
     * <p>vtableId(120)</p>
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
     * <p>vtableId(121)</p>
     */
    @ComMethod(name = "PreviousField", dispId = 0xb1)
    Field PreviousField();
            
    /**
     * <p>id(0xb2)</p>
     * <p>vtableId(122)</p>
     */
    @ComMethod(name = "NextField", dispId = 0xb2)
    Field NextField();
            
    /**
     * <p>id(0xd4)</p>
     * <p>vtableId(123)</p>
     */
    @ComMethod(name = "InsertParagraphBefore", dispId = 0xd4)
    void InsertParagraphBefore();
            
    /**
     * <p>id(0xd6)</p>
     * <p>vtableId(124)</p>
     * @param ShiftCells [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertCells", dispId = 0xd6)
    void InsertCells(Object ShiftCells);
            
    /**
     * <p>id(0x12c)</p>
     * <p>vtableId(125)</p>
     * @param Character [in, optional] {@code Object}
     */
    @ComMethod(name = "Extend", dispId = 0x12c)
    void Extend(Object Character);
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(126)</p>
     */
    @ComMethod(name = "Shrink", dispId = 0x12d)
    void Shrink();
            
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(127)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     * @param Extend [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveLeft", dispId = 0x1f4)
    Integer MoveLeft(Object Unit,
            Object Count,
            Object Extend);
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(128)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     * @param Extend [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveRight", dispId = 0x1f5)
    Integer MoveRight(Object Unit,
            Object Count,
            Object Extend);
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(129)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     * @param Extend [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveUp", dispId = 0x1f6)
    Integer MoveUp(Object Unit,
            Object Count,
            Object Extend);
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(130)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Count [in, optional] {@code Object}
     * @param Extend [in, optional] {@code Object}
     */
    @ComMethod(name = "MoveDown", dispId = 0x1f7)
    Integer MoveDown(Object Unit,
            Object Count,
            Object Extend);
            
    /**
     * <p>id(0x1f8)</p>
     * <p>vtableId(131)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Extend [in, optional] {@code Object}
     */
    @ComMethod(name = "HomeKey", dispId = 0x1f8)
    Integer HomeKey(Object Unit,
            Object Extend);
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(132)</p>
     * @param Unit [in, optional] {@code Object}
     * @param Extend [in, optional] {@code Object}
     */
    @ComMethod(name = "EndKey", dispId = 0x1f9)
    Integer EndKey(Object Unit,
            Object Extend);
            
    /**
     * <p>id(0x1fa)</p>
     * <p>vtableId(133)</p>
     */
    @ComMethod(name = "EscapeKey", dispId = 0x1fa)
    void EscapeKey();
            
    /**
     * <p>id(0x1fb)</p>
     * <p>vtableId(134)</p>
     * @param Text [in] {@code String}
     */
    @ComMethod(name = "TypeText", dispId = 0x1fb)
    void TypeText(String Text);
            
    /**
     * <p>id(0x1fd)</p>
     * <p>vtableId(135)</p>
     */
    @ComMethod(name = "CopyFormat", dispId = 0x1fd)
    void CopyFormat();
            
    /**
     * <p>id(0x1fe)</p>
     * <p>vtableId(136)</p>
     */
    @ComMethod(name = "PasteFormat", dispId = 0x1fe)
    void PasteFormat();
            
    /**
     * <p>id(0x200)</p>
     * <p>vtableId(137)</p>
     */
    @ComMethod(name = "TypeParagraph", dispId = 0x200)
    void TypeParagraph();
            
    /**
     * <p>id(0x201)</p>
     * <p>vtableId(138)</p>
     */
    @ComMethod(name = "TypeBackspace", dispId = 0x201)
    void TypeBackspace();
            
    /**
     * <p>id(0x202)</p>
     * <p>vtableId(139)</p>
     */
    @ComMethod(name = "NextSubdocument", dispId = 0x202)
    void NextSubdocument();
            
    /**
     * <p>id(0x203)</p>
     * <p>vtableId(140)</p>
     */
    @ComMethod(name = "PreviousSubdocument", dispId = 0x203)
    void PreviousSubdocument();
            
    /**
     * <p>id(0x204)</p>
     * <p>vtableId(141)</p>
     */
    @ComMethod(name = "SelectColumn", dispId = 0x204)
    void SelectColumn();
            
    /**
     * <p>id(0x205)</p>
     * <p>vtableId(142)</p>
     */
    @ComMethod(name = "SelectCurrentFont", dispId = 0x205)
    void SelectCurrentFont();
            
    /**
     * <p>id(0x206)</p>
     * <p>vtableId(143)</p>
     */
    @ComMethod(name = "SelectCurrentAlignment", dispId = 0x206)
    void SelectCurrentAlignment();
            
    /**
     * <p>id(0x207)</p>
     * <p>vtableId(144)</p>
     */
    @ComMethod(name = "SelectCurrentSpacing", dispId = 0x207)
    void SelectCurrentSpacing();
            
    /**
     * <p>id(0x208)</p>
     * <p>vtableId(145)</p>
     */
    @ComMethod(name = "SelectCurrentIndent", dispId = 0x208)
    void SelectCurrentIndent();
            
    /**
     * <p>id(0x209)</p>
     * <p>vtableId(146)</p>
     */
    @ComMethod(name = "SelectCurrentTabs", dispId = 0x209)
    void SelectCurrentTabs();
            
    /**
     * <p>id(0x20a)</p>
     * <p>vtableId(147)</p>
     */
    @ComMethod(name = "SelectCurrentColor", dispId = 0x20a)
    void SelectCurrentColor();
            
    /**
     * <p>id(0x20b)</p>
     * <p>vtableId(148)</p>
     */
    @ComMethod(name = "CreateTextbox", dispId = 0x20b)
    void CreateTextbox();
            
    /**
     * <p>id(0x20c)</p>
     * <p>vtableId(149)</p>
     */
    @ComMethod(name = "WholeStory", dispId = 0x20c)
    void WholeStory();
            
    /**
     * <p>id(0x20d)</p>
     * <p>vtableId(150)</p>
     */
    @ComMethod(name = "SelectRow", dispId = 0x20d)
    void SelectRow();
            
    /**
     * <p>id(0x20e)</p>
     * <p>vtableId(151)</p>
     */
    @ComMethod(name = "SplitTable", dispId = 0x20e)
    void SplitTable();
            
    /**
     * <p>id(0x210)</p>
     * <p>vtableId(152)</p>
     * @param NumRows [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertRows", dispId = 0x210)
    void InsertRows(Object NumRows);
            
    /**
     * <p>id(0x211)</p>
     * <p>vtableId(153)</p>
     */
    @ComMethod(name = "InsertColumns", dispId = 0x211)
    void InsertColumns();
            
    /**
     * <p>id(0x212)</p>
     * <p>vtableId(154)</p>
     * @param Formula [in, optional] {@code Object}
     * @param NumberFormat [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertFormula", dispId = 0x212)
    void InsertFormula(Object Formula,
            Object NumberFormat);
            
    /**
     * <p>id(0x213)</p>
     * <p>vtableId(155)</p>
     * @param Wrap [in, optional] {@code Object}
     */
    @ComMethod(name = "NextRevision", dispId = 0x213)
    Revision NextRevision(Object Wrap);
            
    /**
     * <p>id(0x214)</p>
     * <p>vtableId(156)</p>
     * @param Wrap [in, optional] {@code Object}
     */
    @ComMethod(name = "PreviousRevision", dispId = 0x214)
    Revision PreviousRevision(Object Wrap);
            
    /**
     * <p>id(0x215)</p>
     * <p>vtableId(157)</p>
     */
    @ComMethod(name = "PasteAsNestedTable", dispId = 0x215)
    void PasteAsNestedTable();
            
    /**
     * <p>id(0x216)</p>
     * <p>vtableId(158)</p>
     * @param Name [in] {@code String}
     * @param StyleName [in] {@code String}
     */
    @ComMethod(name = "CreateAutoTextEntry", dispId = 0x216)
    AutoTextEntry CreateAutoTextEntry(String Name,
            String StyleName);
            
    /**
     * <p>id(0x217)</p>
     * <p>vtableId(159)</p>
     */
    @ComMethod(name = "DetectLanguage", dispId = 0x217)
    void DetectLanguage();
            
    /**
     * <p>id(0x218)</p>
     * <p>vtableId(160)</p>
     */
    @ComMethod(name = "SelectCell", dispId = 0x218)
    void SelectCell();
            
    /**
     * <p>id(0x219)</p>
     * <p>vtableId(161)</p>
     * @param NumRows [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertRowsBelow", dispId = 0x219)
    void InsertRowsBelow(Object NumRows);
            
    /**
     * <p>id(0x21a)</p>
     * <p>vtableId(162)</p>
     */
    @ComMethod(name = "InsertColumnsRight", dispId = 0x21a)
    void InsertColumnsRight();
            
    /**
     * <p>id(0x21b)</p>
     * <p>vtableId(163)</p>
     * @param NumRows [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertRowsAbove", dispId = 0x21b)
    void InsertRowsAbove(Object NumRows);
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(164)</p>
     */
    @ComMethod(name = "RtlRun", dispId = 0x258)
    void RtlRun();
            
    /**
     * <p>id(0x259)</p>
     * <p>vtableId(165)</p>
     */
    @ComMethod(name = "LtrRun", dispId = 0x259)
    void LtrRun();
            
    /**
     * <p>id(0x25a)</p>
     * <p>vtableId(166)</p>
     */
    @ComMethod(name = "BoldRun", dispId = 0x25a)
    void BoldRun();
            
    /**
     * <p>id(0x25b)</p>
     * <p>vtableId(167)</p>
     */
    @ComMethod(name = "ItalicRun", dispId = 0x25b)
    void ItalicRun();
            
    /**
     * <p>id(0x25d)</p>
     * <p>vtableId(168)</p>
     */
    @ComMethod(name = "RtlPara", dispId = 0x25d)
    void RtlPara();
            
    /**
     * <p>id(0x25e)</p>
     * <p>vtableId(169)</p>
     */
    @ComMethod(name = "LtrPara", dispId = 0x25e)
    void LtrPara();
            
    /**
     * <p>id(0x1bc)</p>
     * <p>vtableId(170)</p>
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
     * <p>id(0x1bd)</p>
     * <p>vtableId(171)</p>
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
    @ComMethod(name = "Sort2000", dispId = 0x1bd)
    void Sort2000(Object ExcludeHeader,
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
     * <p>id(0x1c9)</p>
     * <p>vtableId(172)</p>
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
    @ComMethod(name = "ConvertToTable", dispId = 0x1c9)
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
     * <p>id(0x3ed)</p>
     * <p>vtableId(173)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x3ed)
    Integer getNoProofing();
            
    /**
     * <p>id(0x3ed)</p>
     * <p>vtableId(174)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "NoProofing", dispId = 0x3ed)
    void setNoProofing(Integer param0);
            
    /**
     * <p>id(0x3ee)</p>
     * <p>vtableId(175)</p>
     */
    @ComProperty(name = "TopLevelTables", dispId = 0x3ee)
    Tables getTopLevelTables();
            
    /**
     * <p>id(0x3ef)</p>
     * <p>vtableId(176)</p>
     */
    @ComProperty(name = "LanguageDetected", dispId = 0x3ef)
    Boolean getLanguageDetected();
            
    /**
     * <p>id(0x3ef)</p>
     * <p>vtableId(177)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LanguageDetected", dispId = 0x3ef)
    void setLanguageDetected(Boolean param0);
            
    /**
     * <p>id(0x3f0)</p>
     * <p>vtableId(178)</p>
     */
    @ComProperty(name = "FitTextWidth", dispId = 0x3f0)
    Float getFitTextWidth();
            
    /**
     * <p>id(0x3f0)</p>
     * <p>vtableId(179)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "FitTextWidth", dispId = 0x3f0)
    void setFitTextWidth(Float param0);
            
    /**
     * <p>id(0x3f1)</p>
     * <p>vtableId(180)</p>
     */
    @ComMethod(name = "ClearFormatting", dispId = 0x3f1)
    void ClearFormatting();
            
    /**
     * <p>id(0x3f2)</p>
     * <p>vtableId(181)</p>
     */
    @ComMethod(name = "PasteAppendTable", dispId = 0x3f2)
    void PasteAppendTable();
            
    /**
     * <p>id(0x3f3)</p>
     * <p>vtableId(182)</p>
     */
    @ComProperty(name = "HTMLDivisions", dispId = 0x3f3)
    HTMLDivisions getHTMLDivisions();
            
    /**
     * <p>id(0x3f7)</p>
     * <p>vtableId(183)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x3f7)
    SmartTags getSmartTags();
            
    /**
     * <p>id(0x3fd)</p>
     * <p>vtableId(184)</p>
     */
    @ComProperty(name = "ChildShapeRange", dispId = 0x3fd)
    ShapeRange getChildShapeRange();
            
    /**
     * <p>id(0x3fe)</p>
     * <p>vtableId(185)</p>
     */
    @ComProperty(name = "HasChildShapeRange", dispId = 0x3fe)
    Boolean getHasChildShapeRange();
            
    /**
     * <p>id(0x400)</p>
     * <p>vtableId(186)</p>
     */
    @ComProperty(name = "FootnoteOptions", dispId = 0x400)
    FootnoteOptions getFootnoteOptions();
            
    /**
     * <p>id(0x401)</p>
     * <p>vtableId(187)</p>
     */
    @ComProperty(name = "EndnoteOptions", dispId = 0x401)
    EndnoteOptions getEndnoteOptions();
            
    /**
     * <p>id(0x3f4)</p>
     * <p>vtableId(188)</p>
     */
    @ComMethod(name = "ToggleCharacterCode", dispId = 0x3f4)
    void ToggleCharacterCode();
            
    /**
     * <p>id(0x3f5)</p>
     * <p>vtableId(189)</p>
     * @param Type [in] {@code WdRecoveryType}
     */
    @ComMethod(name = "PasteAndFormat", dispId = 0x3f5)
    void PasteAndFormat(WdRecoveryType Type);
            
    /**
     * <p>id(0x3f6)</p>
     * <p>vtableId(190)</p>
     * @param LinkedToExcel [in] {@code Boolean}
     * @param WordFormatting [in] {@code Boolean}
     * @param RTF [in] {@code Boolean}
     */
    @ComMethod(name = "PasteExcelTable", dispId = 0x3f6)
    void PasteExcelTable(Boolean LinkedToExcel,
            Boolean WordFormatting,
            Boolean RTF);
            
    /**
     * <p>id(0x3fb)</p>
     * <p>vtableId(191)</p>
     */
    @ComMethod(name = "ShrinkDiscontiguousSelection", dispId = 0x3fb)
    void ShrinkDiscontiguousSelection();
            
    /**
     * <p>id(0x3fc)</p>
     * <p>vtableId(192)</p>
     */
    @ComMethod(name = "InsertStyleSeparator", dispId = 0x3fc)
    void InsertStyleSeparator();
            
    /**
     * <p>id(0x3ff)</p>
     * <p>vtableId(193)</p>
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
     * @param SubFieldNumber [in, optional] {@code Object}
     * @param SubFieldNumber2 [in, optional] {@code Object}
     * @param SubFieldNumber3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Sort", dispId = 0x3ff)
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
            Object LanguageID,
            Object SubFieldNumber,
            Object SubFieldNumber2,
            Object SubFieldNumber3);
            
    /**
     * <p>id(0x136)</p>
     * <p>vtableId(194)</p>
     */
    @ComProperty(name = "XMLNodes", dispId = 0x136)
    XMLNodes getXMLNodes();
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(195)</p>
     */
    @ComProperty(name = "XMLParentNode", dispId = 0x137)
    XMLNode getXMLParentNode();
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(196)</p>
     */
    @ComProperty(name = "Editors", dispId = 0x139)
    Editors getEditors();
            
    /**
     * <p>id(0x13a)</p>
     * <p>vtableId(197)</p>
     * @param DataOnly [in, optional] {@code Boolean}
     */
    @ComProperty(name = "XML", dispId = 0x13a)
    String getXML(Boolean DataOnly);
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(198)</p>
     */
    @ComProperty(name = "EnhMetaFileBits", dispId = 0x13b)
    Object getEnhMetaFileBits();
            
    /**
     * <p>id(0x403)</p>
     * <p>vtableId(199)</p>
     * @param EditorID [in, optional] {@code Object}
     */
    @ComMethod(name = "GoToEditableRange", dispId = 0x403)
    Range GoToEditableRange(Object EditorID);
            
    /**
     * <p>id(0x404)</p>
     * <p>vtableId(200)</p>
     * @param XML [in] {@code String}
     * @param Transform [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertXML", dispId = 0x404)
    void InsertXML(String XML,
            Object Transform);
            
    /**
     * <p>id(0x1a1)</p>
     * <p>vtableId(201)</p>
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
     * <p>vtableId(202)</p>
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
     * <p>id(0x13c)</p>
     * <p>vtableId(203)</p>
     */
    @ComProperty(name = "OMaths", dispId = 0x13c)
    OMaths getOMaths();
            
    /**
     * <p>id(0x13d)</p>
     * <p>vtableId(204)</p>
     */
    @ComProperty(name = "WordOpenXML", dispId = 0x13d)
    String getWordOpenXML();
            
    /**
     * <p>id(0x406)</p>
     * <p>vtableId(205)</p>
     */
    @ComMethod(name = "ClearParagraphStyle", dispId = 0x406)
    void ClearParagraphStyle();
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(206)</p>
     */
    @ComMethod(name = "ClearCharacterAllFormatting", dispId = 0x407)
    void ClearCharacterAllFormatting();
            
    /**
     * <p>id(0x408)</p>
     * <p>vtableId(207)</p>
     */
    @ComMethod(name = "ClearCharacterStyle", dispId = 0x408)
    void ClearCharacterStyle();
            
    /**
     * <p>id(0x409)</p>
     * <p>vtableId(208)</p>
     */
    @ComMethod(name = "ClearCharacterDirectFormatting", dispId = 0x409)
    void ClearCharacterDirectFormatting();
            
    /**
     * <p>id(0x40a)</p>
     * <p>vtableId(209)</p>
     */
    @ComProperty(name = "ContentControls", dispId = 0x40a)
    ContentControls getContentControls();
            
    /**
     * <p>id(0x40b)</p>
     * <p>vtableId(210)</p>
     */
    @ComProperty(name = "ParentContentControl", dispId = 0x40b)
    ContentControl getParentContentControl();
            
    /**
     * <p>id(0x40c)</p>
     * <p>vtableId(211)</p>
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
    @ComMethod(name = "ExportAsFixedFormat", dispId = 0x40c)
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
     * <p>id(0x40d)</p>
     * <p>vtableId(212)</p>
     */
    @ComMethod(name = "ReadingModeGrowFont", dispId = 0x40d)
    void ReadingModeGrowFont();
            
    /**
     * <p>id(0x40e)</p>
     * <p>vtableId(213)</p>
     */
    @ComMethod(name = "ReadingModeShrinkFont", dispId = 0x40e)
    void ReadingModeShrinkFont();
            
    /**
     * <p>id(0x40f)</p>
     * <p>vtableId(214)</p>
     */
    @ComMethod(name = "ClearParagraphAllFormatting", dispId = 0x40f)
    void ClearParagraphAllFormatting();
            
    /**
     * <p>id(0x410)</p>
     * <p>vtableId(215)</p>
     */
    @ComMethod(name = "ClearParagraphDirectFormatting", dispId = 0x410)
    void ClearParagraphDirectFormatting();
            
    /**
     * <p>id(0x411)</p>
     * <p>vtableId(216)</p>
     */
    @ComMethod(name = "InsertNewPage", dispId = 0x411)
    void InsertNewPage();
            
    /**
     * <p>id(0x412)</p>
     * <p>vtableId(217)</p>
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
    @ComMethod(name = "SortByHeadings", dispId = 0x412)
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