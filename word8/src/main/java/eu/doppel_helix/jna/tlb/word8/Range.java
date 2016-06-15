
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
     */
    @ComProperty(name = "Text", dispId = 0x0)
    String getText();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Text", dispId = 0x0)
    void setText(String param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "FormattedText", dispId = 0x2)
    Range getFormattedText();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "FormattedText", dispId = 0x2)
    void setFormattedText(Range param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Start", dispId = 0x3)
    Integer getStart();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Start", dispId = 0x3)
    void setStart(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "End", dispId = 0x4)
    Integer getEnd();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "End", dispId = 0x4)
    void setEnd(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Font", dispId = 0x5)
    Font getFont();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Font", dispId = 0x5)
    void setFont(Font param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Duplicate", dispId = 0x6)
    Range getDuplicate();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "StoryType", dispId = 0x7)
    WdStoryType getStoryType();
            
    /**
     * <p>id(0x32)</p>
     */
    @ComProperty(name = "Tables", dispId = 0x32)
    Tables getTables();
            
    /**
     * <p>id(0x33)</p>
     */
    @ComProperty(name = "Words", dispId = 0x33)
    Words getWords();
            
    /**
     * <p>id(0x34)</p>
     */
    @ComProperty(name = "Sentences", dispId = 0x34)
    Sentences getSentences();
            
    /**
     * <p>id(0x35)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x35)
    Characters getCharacters();
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "Footnotes", dispId = 0x36)
    Footnotes getFootnotes();
            
    /**
     * <p>id(0x37)</p>
     */
    @ComProperty(name = "Endnotes", dispId = 0x37)
    Endnotes getEndnotes();
            
    /**
     * <p>id(0x38)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x38)
    Comments getComments();
            
    /**
     * <p>id(0x39)</p>
     */
    @ComProperty(name = "Cells", dispId = 0x39)
    Cells getCells();
            
    /**
     * <p>id(0x3a)</p>
     */
    @ComProperty(name = "Sections", dispId = 0x3a)
    Sections getSections();
            
    /**
     * <p>id(0x3b)</p>
     */
    @ComProperty(name = "Paragraphs", dispId = 0x3b)
    Paragraphs getParagraphs();
            
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
     * <p>id(0x3d)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x3d)
    Shading getShading();
            
    /**
     * <p>id(0x3e)</p>
     */
    @ComProperty(name = "TextRetrievalMode", dispId = 0x3e)
    TextRetrievalMode getTextRetrievalMode();
            
    /**
     * <p>id(0x3e)</p>
     */
    @ComProperty(name = "TextRetrievalMode", dispId = 0x3e)
    void setTextRetrievalMode(TextRetrievalMode param0);
            
    /**
     * <p>id(0x40)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x40)
    Fields getFields();
            
    /**
     * <p>id(0x41)</p>
     */
    @ComProperty(name = "FormFields", dispId = 0x41)
    FormFields getFormFields();
            
    /**
     * <p>id(0x42)</p>
     */
    @ComProperty(name = "Frames", dispId = 0x42)
    Frames getFrames();
            
    /**
     * <p>id(0x44e)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0x44e)
    ParagraphFormat getParagraphFormat();
            
    /**
     * <p>id(0x44e)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0x44e)
    void setParagraphFormat(ParagraphFormat param0);
            
    /**
     * <p>id(0x44)</p>
     */
    @ComProperty(name = "ListFormat", dispId = 0x44)
    ListFormat getListFormat();
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "Bookmarks", dispId = 0x4b)
    Bookmarks getBookmarks();
            
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
     * <p>id(0x82)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x82)
    Integer getBold();
            
    /**
     * <p>id(0x82)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x82)
    void setBold(Integer param0);
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x83)
    Integer getItalic();
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x83)
    void setItalic(Integer param0);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x8b)
    WdUnderline getUnderline();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x8b)
    void setUnderline(WdUnderline param0);
            
    /**
     * <p>id(0x8c)</p>
     */
    @ComProperty(name = "EmphasisMark", dispId = 0x8c)
    WdEmphasisMark getEmphasisMark();
            
    /**
     * <p>id(0x8c)</p>
     */
    @ComProperty(name = "EmphasisMark", dispId = 0x8c)
    void setEmphasisMark(WdEmphasisMark param0);
            
    /**
     * <p>id(0x8d)</p>
     */
    @ComProperty(name = "DisableCharacterSpaceGrid", dispId = 0x8d)
    Boolean getDisableCharacterSpaceGrid();
            
    /**
     * <p>id(0x8d)</p>
     */
    @ComProperty(name = "DisableCharacterSpaceGrid", dispId = 0x8d)
    void setDisableCharacterSpaceGrid(Boolean param0);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Revisions", dispId = 0x96)
    Revisions getRevisions();
            
    /**
     * <p>id(0x97)</p>
     */
    @ComProperty(name = "Style", dispId = 0x97)
    Object getStyle();
            
    /**
     * <p>id(0x97)</p>
     */
    @ComProperty(name = "Style", dispId = 0x97)
    void setStyle(Object param0);
            
    /**
     * <p>id(0x98)</p>
     */
    @ComProperty(name = "StoryLength", dispId = 0x98)
    Integer getStoryLength();
            
    /**
     * <p>id(0x99)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x99)
    WdLanguageID getLanguageID();
            
    /**
     * <p>id(0x99)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x99)
    void setLanguageID(WdLanguageID param0);
            
    /**
     * <p>id(0x9b)</p>
     */
    @ComProperty(name = "SynonymInfo", dispId = 0x9b)
    SynonymInfo getSynonymInfo();
            
    /**
     * <p>id(0x9c)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x9c)
    Hyperlinks getHyperlinks();
            
    /**
     * <p>id(0x9d)</p>
     */
    @ComProperty(name = "ListParagraphs", dispId = 0x9d)
    ListParagraphs getListParagraphs();
            
    /**
     * <p>id(0x9f)</p>
     */
    @ComProperty(name = "Subdocuments", dispId = 0x9f)
    Subdocuments getSubdocuments();
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "GrammarChecked", dispId = 0x104)
    Boolean getGrammarChecked();
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "GrammarChecked", dispId = 0x104)
    void setGrammarChecked(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "SpellingChecked", dispId = 0x105)
    Boolean getSpellingChecked();
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "SpellingChecked", dispId = 0x105)
    void setSpellingChecked(Boolean param0);
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComProperty(name = "HighlightColorIndex", dispId = 0x12d)
    WdColorIndex getHighlightColorIndex();
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComProperty(name = "HighlightColorIndex", dispId = 0x12d)
    void setHighlightColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x12e)</p>
     */
    @ComProperty(name = "Columns", dispId = 0x12e)
    Columns getColumns();
            
    /**
     * <p>id(0x12f)</p>
     */
    @ComProperty(name = "Rows", dispId = 0x12f)
    Rows getRows();
            
    /**
     * <p>id(0x130)</p>
     */
    @ComProperty(name = "CanEdit", dispId = 0x130)
    Integer getCanEdit();
            
    /**
     * <p>id(0x131)</p>
     */
    @ComProperty(name = "CanPaste", dispId = 0x131)
    Integer getCanPaste();
            
    /**
     * <p>id(0x133)</p>
     */
    @ComProperty(name = "IsEndOfRowMark", dispId = 0x133)
    Boolean getIsEndOfRowMark();
            
    /**
     * <p>id(0x134)</p>
     */
    @ComProperty(name = "BookmarkID", dispId = 0x134)
    Integer getBookmarkID();
            
    /**
     * <p>id(0x135)</p>
     */
    @ComProperty(name = "PreviousBookmarkID", dispId = 0x135)
    Integer getPreviousBookmarkID();
            
    /**
     * <p>id(0x106)</p>
     */
    @ComProperty(name = "Find", dispId = 0x106)
    Find getFind();
            
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
     * <p>id(0x137)</p>
     */
    @ComProperty(name = "ShapeRange", dispId = 0x137)
    ShapeRange getShapeRange();
            
    /**
     * <p>id(0x138)</p>
     */
    @ComProperty(name = "Case", dispId = 0x138)
    WdCharacterCase get_Case();
            
    /**
     * <p>id(0x138)</p>
     */
    @ComProperty(name = "Case", dispId = 0x138)
    void set_Case(WdCharacterCase param0);
            
    /**
     * <p>id(0x139)</p>
     */
    @ComProperty(name = "Information", dispId = 0x139)
    Object getInformation(WdInformation Type);
            
    /**
     * <p>id(0x13a)</p>
     */
    @ComProperty(name = "ReadabilityStatistics", dispId = 0x13a)
    ReadabilityStatistics getReadabilityStatistics();
            
    /**
     * <p>id(0x13b)</p>
     */
    @ComProperty(name = "GrammaticalErrors", dispId = 0x13b)
    ProofreadingErrors getGrammaticalErrors();
            
    /**
     * <p>id(0x13c)</p>
     */
    @ComProperty(name = "SpellingErrors", dispId = 0x13c)
    ProofreadingErrors getSpellingErrors();
            
    /**
     * <p>id(0x13d)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x13d)
    WdTextOrientation getOrientation();
            
    /**
     * <p>id(0x13d)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x13d)
    void setOrientation(WdTextOrientation param0);
            
    /**
     * <p>id(0x13f)</p>
     */
    @ComProperty(name = "InlineShapes", dispId = 0x13f)
    InlineShapes getInlineShapes();
            
    /**
     * <p>id(0x140)</p>
     */
    @ComProperty(name = "NextStoryRange", dispId = 0x140)
    Range getNextStoryRange();
            
    /**
     * <p>id(0x141)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x141)
    WdLanguageID getLanguageIDFarEast();
            
    /**
     * <p>id(0x141)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x141)
    void setLanguageIDFarEast(WdLanguageID param0);
            
    /**
     * <p>id(0x142)</p>
     */
    @ComProperty(name = "LanguageIDOther", dispId = 0x142)
    WdLanguageID getLanguageIDOther();
            
    /**
     * <p>id(0x142)</p>
     */
    @ComProperty(name = "LanguageIDOther", dispId = 0x142)
    void setLanguageIDOther(WdLanguageID param0);
            
    /**
     * <p>id(0xffff)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "SetRange", dispId = 0x64)
    void SetRange(Integer Start,
            Integer End);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Collapse", dispId = 0x65)
    void Collapse(Object Direction);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "InsertBefore", dispId = 0x66)
    void InsertBefore(String Text);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "InsertAfter", dispId = 0x68)
    void InsertAfter(String Text);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "Next", dispId = 0x69)
    Range Next(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "Previous", dispId = 0x6a)
    Range Previous(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComMethod(name = "StartOf", dispId = 0x6b)
    Integer StartOf(Object Unit,
            Object Extend);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComMethod(name = "EndOf", dispId = 0x6c)
    Integer EndOf(Object Unit,
            Object Extend);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComMethod(name = "Move", dispId = 0x6d)
    Integer Move(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComMethod(name = "MoveStart", dispId = 0x6e)
    Integer MoveStart(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComMethod(name = "MoveEnd", dispId = 0x6f)
    Integer MoveEnd(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "MoveWhile", dispId = 0x70)
    Integer MoveWhile(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x71)</p>
     */
    @ComMethod(name = "MoveStartWhile", dispId = 0x71)
    Integer MoveStartWhile(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComMethod(name = "MoveEndWhile", dispId = 0x72)
    Integer MoveEndWhile(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x73)</p>
     */
    @ComMethod(name = "MoveUntil", dispId = 0x73)
    Integer MoveUntil(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComMethod(name = "MoveStartUntil", dispId = 0x74)
    Integer MoveStartUntil(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "MoveEndUntil", dispId = 0x75)
    Integer MoveEndUntil(Object Cset,
            Object Count);
            
    /**
     * <p>id(0x77)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x77)
    void Cut();
            
    /**
     * <p>id(0x78)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x78)
    void Copy();
            
    /**
     * <p>id(0x79)</p>
     */
    @ComMethod(name = "Paste", dispId = 0x79)
    void Paste();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComMethod(name = "InsertBreak", dispId = 0x7a)
    void InsertBreak(Object Type);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComMethod(name = "InsertFile", dispId = 0x7b)
    void InsertFile(String FileName,
            Object Range,
            Object ConfirmConversions,
            Object Link,
            Object Attachment);
            
    /**
     * <p>id(0x7d)</p>
     */
    @ComMethod(name = "InStory", dispId = 0x7d)
    Boolean InStory(Range Range);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComMethod(name = "InRange", dispId = 0x7e)
    Boolean InRange(Range Range);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x7f)
    Integer Delete(Object Unit,
            Object Count);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComMethod(name = "WholeStory", dispId = 0x80)
    void WholeStory();
            
    /**
     * <p>id(0x81)</p>
     */
    @ComMethod(name = "Expand", dispId = 0x81)
    Integer Expand(Object Unit);
            
    /**
     * <p>id(0xa0)</p>
     */
    @ComMethod(name = "InsertParagraph", dispId = 0xa0)
    void InsertParagraph();
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComMethod(name = "InsertParagraphAfter", dispId = 0xa1)
    void InsertParagraphAfter();
            
    /**
     * <p>id(0xa2)</p>
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
     */
    @ComMethod(name = "InsertDateTimeOld", dispId = 0xa3)
    void InsertDateTimeOld(Object DateTimeFormat,
            Object InsertAsField,
            Object InsertAsFullWidth);
            
    /**
     * <p>id(0xa4)</p>
     */
    @ComMethod(name = "InsertSymbol", dispId = 0xa4)
    void InsertSymbol(Integer CharacterNumber,
            Object Font,
            Object Unicode,
            Object Bias);
            
    /**
     * <p>id(0xa5)</p>
     */
    @ComMethod(name = "InsertCrossReference_2002", dispId = 0xa5)
    void InsertCrossReference_2002(Object ReferenceType,
            WdReferenceKind ReferenceKind,
            Object ReferenceItem,
            Object InsertAsHyperlink,
            Object IncludePosition);
            
    /**
     * <p>id(0xa6)</p>
     */
    @ComMethod(name = "InsertCaptionXP", dispId = 0xa6)
    void InsertCaptionXP(Object Label,
            Object Title,
            Object TitleAutoText,
            Object Position);
            
    /**
     * <p>id(0xa7)</p>
     */
    @ComMethod(name = "CopyAsPicture", dispId = 0xa7)
    void CopyAsPicture();
            
    /**
     * <p>id(0xa8)</p>
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
     */
    @ComMethod(name = "SortAscending", dispId = 0xa9)
    void SortAscending();
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComMethod(name = "SortDescending", dispId = 0xaa)
    void SortDescending();
            
    /**
     * <p>id(0xab)</p>
     */
    @ComMethod(name = "IsEqual", dispId = 0xab)
    Boolean IsEqual(Range Range);
            
    /**
     * <p>id(0xac)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0xac)
    Float Calculate();
            
    /**
     * <p>id(0xad)</p>
     */
    @ComMethod(name = "GoTo", dispId = 0xad)
    Range GoTo(Object What,
            Object Which,
            Object Count,
            Object Name);
            
    /**
     * <p>id(0xae)</p>
     */
    @ComMethod(name = "GoToNext", dispId = 0xae)
    Range GoToNext(WdGoToItem What);
            
    /**
     * <p>id(0xaf)</p>
     */
    @ComMethod(name = "GoToPrevious", dispId = 0xaf)
    Range GoToPrevious(WdGoToItem What);
            
    /**
     * <p>id(0xb0)</p>
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
     */
    @ComMethod(name = "LookupNameProperties", dispId = 0xb1)
    void LookupNameProperties();
            
    /**
     * <p>id(0xb2)</p>
     */
    @ComMethod(name = "ComputeStatistics", dispId = 0xb2)
    Integer ComputeStatistics(WdStatistic Statistic);
            
    /**
     * <p>id(0xb3)</p>
     */
    @ComMethod(name = "Relocate", dispId = 0xb3)
    void Relocate(Integer Direction);
            
    /**
     * <p>id(0xb4)</p>
     */
    @ComMethod(name = "CheckSynonyms", dispId = 0xb4)
    void CheckSynonyms();
            
    /**
     * <p>id(0xb5)</p>
     */
    @ComMethod(name = "SubscribeTo", dispId = 0xb5)
    void SubscribeTo(String Edition,
            Object Format);
            
    /**
     * <p>id(0xb6)</p>
     */
    @ComMethod(name = "CreatePublisher", dispId = 0xb6)
    void CreatePublisher(Object Edition,
            Object ContainsPICT,
            Object ContainsRTF,
            Object ContainsText);
            
    /**
     * <p>id(0xb7)</p>
     */
    @ComMethod(name = "InsertAutoText", dispId = 0xb7)
    void InsertAutoText();
            
    /**
     * <p>id(0xc2)</p>
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
     */
    @ComMethod(name = "AutoFormat", dispId = 0xc3)
    void AutoFormat();
            
    /**
     * <p>id(0xcc)</p>
     */
    @ComMethod(name = "CheckGrammar", dispId = 0xcc)
    void CheckGrammar();
            
    /**
     * <p>id(0xcd)</p>
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
     */
    @ComMethod(name = "InsertParagraphBefore", dispId = 0xd4)
    void InsertParagraphBefore();
            
    /**
     * <p>id(0xdb)</p>
     */
    @ComMethod(name = "NextSubdocument", dispId = 0xdb)
    void NextSubdocument();
            
    /**
     * <p>id(0xdc)</p>
     */
    @ComMethod(name = "PreviousSubdocument", dispId = 0xdc)
    void PreviousSubdocument();
            
    /**
     * <p>id(0xdd)</p>
     */
    @ComMethod(name = "ConvertHangulAndHanja", dispId = 0xdd)
    void ConvertHangulAndHanja(Object ConversionsMode,
            Object FastConversion,
            Object CheckHangulEnding,
            Object EnableRecentOrdering,
            Object CustomDictionary);
            
    /**
     * <p>id(0xde)</p>
     */
    @ComMethod(name = "PasteAsNestedTable", dispId = 0xde)
    void PasteAsNestedTable();
            
    /**
     * <p>id(0xdf)</p>
     */
    @ComMethod(name = "ModifyEnclosure", dispId = 0xdf)
    void ModifyEnclosure(Object Style,
            Object Symbol,
            Object EnclosedText);
            
    /**
     * <p>id(0xe0)</p>
     */
    @ComMethod(name = "PhoneticGuide", dispId = 0xe0)
    void PhoneticGuide(String Text,
            WdPhoneticGuideAlignmentType Alignment,
            Integer Raise,
            Integer FontSize,
            String FontName);
            
    /**
     * <p>id(0x1bc)</p>
     */
    @ComMethod(name = "InsertDateTime", dispId = 0x1bc)
    void InsertDateTime(Object DateTimeFormat,
            Object InsertAsField,
            Object InsertAsFullWidth,
            Object DateLanguage,
            Object CalendarType);
            
    /**
     * <p>id(0x1e4)</p>
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
     */
    @ComMethod(name = "DetectLanguage", dispId = 0xcb)
    void DetectLanguage();
            
    /**
     * <p>id(0x1f2)</p>
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
     */
    @ComMethod(name = "TCSCConverter", dispId = 0x1f3)
    void TCSCConverter(WdTCSCConverterDirection WdTCSCConverterDirection,
            Boolean CommonTerms,
            Boolean UseVariants);
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "LanguageDetected", dispId = 0x107)
    Boolean getLanguageDetected();
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "LanguageDetected", dispId = 0x107)
    void setLanguageDetected(Boolean param0);
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "FitTextWidth", dispId = 0x108)
    Float getFitTextWidth();
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "FitTextWidth", dispId = 0x108)
    void setFitTextWidth(Float param0);
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "HorizontalInVertical", dispId = 0x109)
    WdHorizontalInVerticalType getHorizontalInVertical();
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "HorizontalInVertical", dispId = 0x109)
    void setHorizontalInVertical(WdHorizontalInVerticalType param0);
            
    /**
     * <p>id(0x10a)</p>
     */
    @ComProperty(name = "TwoLinesInOne", dispId = 0x10a)
    WdTwoLinesInOneType getTwoLinesInOne();
            
    /**
     * <p>id(0x10a)</p>
     */
    @ComProperty(name = "TwoLinesInOne", dispId = 0x10a)
    void setTwoLinesInOne(WdTwoLinesInOneType param0);
            
    /**
     * <p>id(0x10b)</p>
     */
    @ComProperty(name = "CombineCharacters", dispId = 0x10b)
    Boolean getCombineCharacters();
            
    /**
     * <p>id(0x10b)</p>
     */
    @ComProperty(name = "CombineCharacters", dispId = 0x10b)
    void setCombineCharacters(Boolean param0);
            
    /**
     * <p>id(0x143)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x143)
    Integer getNoProofing();
            
    /**
     * <p>id(0x143)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x143)
    void setNoProofing(Integer param0);
            
    /**
     * <p>id(0x144)</p>
     */
    @ComProperty(name = "TopLevelTables", dispId = 0x144)
    Tables getTopLevelTables();
            
    /**
     * <p>id(0x145)</p>
     */
    @ComProperty(name = "Scripts", dispId = 0x145)
    eu.doppel_helix.jna.tlb.office2.Scripts getScripts();
            
    /**
     * <p>id(0x146)</p>
     */
    @ComProperty(name = "CharacterWidth", dispId = 0x146)
    WdCharacterWidth getCharacterWidth();
            
    /**
     * <p>id(0x146)</p>
     */
    @ComProperty(name = "CharacterWidth", dispId = 0x146)
    void setCharacterWidth(WdCharacterWidth param0);
            
    /**
     * <p>id(0x147)</p>
     */
    @ComProperty(name = "Kana", dispId = 0x147)
    WdKana getKana();
            
    /**
     * <p>id(0x147)</p>
     */
    @ComProperty(name = "Kana", dispId = 0x147)
    void setKana(WdKana param0);
            
    /**
     * <p>id(0x190)</p>
     */
    @ComProperty(name = "BoldBi", dispId = 0x190)
    Integer getBoldBi();
            
    /**
     * <p>id(0x190)</p>
     */
    @ComProperty(name = "BoldBi", dispId = 0x190)
    void setBoldBi(Integer param0);
            
    /**
     * <p>id(0x191)</p>
     */
    @ComProperty(name = "ItalicBi", dispId = 0x191)
    Integer getItalicBi();
            
    /**
     * <p>id(0x191)</p>
     */
    @ComProperty(name = "ItalicBi", dispId = 0x191)
    void setItalicBi(Integer param0);
            
    /**
     * <p>id(0x195)</p>
     */
    @ComProperty(name = "ID", dispId = 0x195)
    String getID();
            
    /**
     * <p>id(0x195)</p>
     */
    @ComProperty(name = "ID", dispId = 0x195)
    void setID(String param0);
            
    /**
     * <p>id(0x196)</p>
     */
    @ComProperty(name = "HTMLDivisions", dispId = 0x196)
    HTMLDivisions getHTMLDivisions();
            
    /**
     * <p>id(0x197)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x197)
    SmartTags getSmartTags();
            
    /**
     * <p>id(0x198)</p>
     */
    @ComProperty(name = "ShowAll", dispId = 0x198)
    Boolean getShowAll();
            
    /**
     * <p>id(0x198)</p>
     */
    @ComProperty(name = "ShowAll", dispId = 0x198)
    void setShowAll(Boolean param0);
            
    /**
     * <p>id(0x199)</p>
     */
    @ComProperty(name = "Document", dispId = 0x199)
    Document getDocument();
            
    /**
     * <p>id(0x19a)</p>
     */
    @ComProperty(name = "FootnoteOptions", dispId = 0x19a)
    FootnoteOptions getFootnoteOptions();
            
    /**
     * <p>id(0x19b)</p>
     */
    @ComProperty(name = "EndnoteOptions", dispId = 0x19b)
    EndnoteOptions getEndnoteOptions();
            
    /**
     * <p>id(0x19c)</p>
     */
    @ComMethod(name = "PasteAndFormat", dispId = 0x19c)
    void PasteAndFormat(WdRecoveryType Type);
            
    /**
     * <p>id(0x19d)</p>
     */
    @ComMethod(name = "PasteExcelTable", dispId = 0x19d)
    void PasteExcelTable(Boolean LinkedToExcel,
            Boolean WordFormatting,
            Boolean RTF);
            
    /**
     * <p>id(0x19e)</p>
     */
    @ComMethod(name = "PasteAppendTable", dispId = 0x19e)
    void PasteAppendTable();
            
    /**
     * <p>id(0x154)</p>
     */
    @ComProperty(name = "XMLNodes", dispId = 0x154)
    XMLNodes getXMLNodes();
            
    /**
     * <p>id(0x155)</p>
     */
    @ComProperty(name = "XMLParentNode", dispId = 0x155)
    XMLNode getXMLParentNode();
            
    /**
     * <p>id(0x157)</p>
     */
    @ComProperty(name = "Editors", dispId = 0x157)
    Editors getEditors();
            
    /**
     * <p>id(0x158)</p>
     */
    @ComProperty(name = "XML", dispId = 0x158)
    String getXML(Boolean DataOnly);
            
    /**
     * <p>id(0x159)</p>
     */
    @ComProperty(name = "EnhMetaFileBits", dispId = 0x159)
    Object getEnhMetaFileBits();
            
    /**
     * <p>id(0x19f)</p>
     */
    @ComMethod(name = "GoToEditableRange", dispId = 0x19f)
    Range GoToEditableRange(Object EditorID);
            
    /**
     * <p>id(0x1a0)</p>
     */
    @ComMethod(name = "InsertXML", dispId = 0x1a0)
    void InsertXML(String XML,
            Object Transform);
            
    /**
     * <p>id(0x1a1)</p>
     */
    @ComMethod(name = "InsertCaption", dispId = 0x1a1)
    void InsertCaption(Object Label,
            Object Title,
            Object TitleAutoText,
            Object Position,
            Object ExcludeLabel);
            
    /**
     * <p>id(0x1a2)</p>
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
     */
    @ComProperty(name = "OMaths", dispId = 0x15a)
    OMaths getOMaths();
            
    /**
     * <p>id(0x1a4)</p>
     */
    @ComProperty(name = "CharacterStyle", dispId = 0x1a4)
    Object getCharacterStyle();
            
    /**
     * <p>id(0x1a5)</p>
     */
    @ComProperty(name = "ParagraphStyle", dispId = 0x1a5)
    Object getParagraphStyle();
            
    /**
     * <p>id(0x1a6)</p>
     */
    @ComProperty(name = "ListStyle", dispId = 0x1a6)
    Object getListStyle();
            
    /**
     * <p>id(0x1a7)</p>
     */
    @ComProperty(name = "TableStyle", dispId = 0x1a7)
    Object getTableStyle();
            
    /**
     * <p>id(0x1a8)</p>
     */
    @ComProperty(name = "ContentControls", dispId = 0x1a8)
    ContentControls getContentControls();
            
    /**
     * <p>id(0x1a9)</p>
     */
    @ComMethod(name = "ExportFragment", dispId = 0x1a9)
    void ExportFragment(String FileName,
            WdSaveFormat Format);
            
    /**
     * <p>id(0x1aa)</p>
     */
    @ComProperty(name = "WordOpenXML", dispId = 0x1aa)
    String getWordOpenXML();
            
    /**
     * <p>id(0x1ab)</p>
     */
    @ComMethod(name = "SetListLevel", dispId = 0x1ab)
    void SetListLevel(Short Level);
            
    /**
     * <p>id(0x1f4)</p>
     */
    @ComMethod(name = "InsertAlignmentTab", dispId = 0x1f4)
    void InsertAlignmentTab(Integer Alignment,
            Integer RelativeTo);
            
    /**
     * <p>id(0x1f5)</p>
     */
    @ComProperty(name = "ParentContentControl", dispId = 0x1f5)
    ContentControl getParentContentControl();
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComMethod(name = "ImportFragment", dispId = 0x1f6)
    void ImportFragment(String FileName,
            Boolean MatchDestination);
            
    /**
     * <p>id(0x1f7)</p>
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
     */
    @ComProperty(name = "Locks", dispId = 0x1f8)
    CoAuthLocks getLocks();
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComProperty(name = "Updates", dispId = 0x1f9)
    CoAuthUpdates getUpdates();
            
    /**
     * <p>id(0x1fa)</p>
     */
    @ComProperty(name = "Conflicts", dispId = 0x1fa)
    Conflicts getConflicts();
            
    /**
     * <p>id(0x1fb)</p>
     */
    @ComProperty(name = "TextVisibleOnScreen", dispId = 0x1fb)
    Integer getTextVisibleOnScreen();
            
    /**
     * <p>id(0x1fc)</p>
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