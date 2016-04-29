
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020975-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020975-0000-0000-C000-000000000046}")
public interface Selection {
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
    @ComProperty(name = "Type", dispId = 0x6)
    WdSelectionType getType();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "StoryType", dispId = 0x7)
    WdStoryType getStoryType();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Style", dispId = 0x8)
    Object getStyle();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Style", dispId = 0x8)
    void setStyle(Object param0);
            
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
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "Bookmarks", dispId = 0x4b)
    Bookmarks getBookmarks();
            
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
     * <p>id(0x9a)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x9a)
    WdLanguageID getLanguageIDFarEast();
            
    /**
     * <p>id(0x9a)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x9a)
    void setLanguageIDFarEast(WdLanguageID param0);
            
    /**
     * <p>id(0x9b)</p>
     */
    @ComProperty(name = "LanguageIDOther", dispId = 0x9b)
    WdLanguageID getLanguageIDOther();
            
    /**
     * <p>id(0x9b)</p>
     */
    @ComProperty(name = "LanguageIDOther", dispId = 0x9b)
    void setLanguageIDOther(WdLanguageID param0);
            
    /**
     * <p>id(0x9c)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x9c)
    Hyperlinks getHyperlinks();
            
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
     * <p>id(0x132)</p>
     */
    @ComProperty(name = "HeaderFooter", dispId = 0x132)
    HeaderFooter getHeaderFooter();
            
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
     * <p>id(0x190)</p>
     */
    @ComProperty(name = "Range", dispId = 0x190)
    Range getRange();
            
    /**
     * <p>id(0x191)</p>
     */
    @ComProperty(name = "Information", dispId = 0x191)
    Object getInformation(WdInformation Type);
            
    /**
     * <p>id(0x192)</p>
     */
    @ComProperty(name = "Flags", dispId = 0x192)
    WdSelectionFlags getFlags();
            
    /**
     * <p>id(0x192)</p>
     */
    @ComProperty(name = "Flags", dispId = 0x192)
    void setFlags(WdSelectionFlags param0);
            
    /**
     * <p>id(0x193)</p>
     */
    @ComProperty(name = "Active", dispId = 0x193)
    Boolean getActive();
            
    /**
     * <p>id(0x194)</p>
     */
    @ComProperty(name = "StartIsActive", dispId = 0x194)
    Boolean getStartIsActive();
            
    /**
     * <p>id(0x194)</p>
     */
    @ComProperty(name = "StartIsActive", dispId = 0x194)
    void setStartIsActive(Boolean param0);
            
    /**
     * <p>id(0x195)</p>
     */
    @ComProperty(name = "IPAtEndOfLine", dispId = 0x195)
    Boolean getIPAtEndOfLine();
            
    /**
     * <p>id(0x196)</p>
     */
    @ComProperty(name = "ExtendMode", dispId = 0x196)
    Boolean getExtendMode();
            
    /**
     * <p>id(0x196)</p>
     */
    @ComProperty(name = "ExtendMode", dispId = 0x196)
    void setExtendMode(Boolean param0);
            
    /**
     * <p>id(0x197)</p>
     */
    @ComProperty(name = "ColumnSelectMode", dispId = 0x197)
    Boolean getColumnSelectMode();
            
    /**
     * <p>id(0x197)</p>
     */
    @ComProperty(name = "ColumnSelectMode", dispId = 0x197)
    void setColumnSelectMode(Boolean param0);
            
    /**
     * <p>id(0x19a)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x19a)
    WdTextOrientation getOrientation();
            
    /**
     * <p>id(0x19a)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x19a)
    void setOrientation(WdTextOrientation param0);
            
    /**
     * <p>id(0x19b)</p>
     */
    @ComProperty(name = "InlineShapes", dispId = 0x19b)
    InlineShapes getInlineShapes();
            
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
     * <p>id(0x3eb)</p>
     */
    @ComProperty(name = "Document", dispId = 0x3eb)
    Document getDocument();
            
    /**
     * <p>id(0x3ec)</p>
     */
    @ComProperty(name = "ShapeRange", dispId = 0x3ec)
    ShapeRange getShapeRange();
            
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
    @ComMethod(name = "PreviousField", dispId = 0xb1)
    Field PreviousField();
            
    /**
     * <p>id(0xb2)</p>
     */
    @ComMethod(name = "NextField", dispId = 0xb2)
    Field NextField();
            
    /**
     * <p>id(0xd4)</p>
     */
    @ComMethod(name = "InsertParagraphBefore", dispId = 0xd4)
    void InsertParagraphBefore();
            
    /**
     * <p>id(0xd6)</p>
     */
    @ComMethod(name = "InsertCells", dispId = 0xd6)
    void InsertCells(Object ShiftCells);
            
    /**
     * <p>id(0x12c)</p>
     */
    @ComMethod(name = "Extend", dispId = 0x12c)
    void Extend(Object Character);
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComMethod(name = "Shrink", dispId = 0x12d)
    void Shrink();
            
    /**
     * <p>id(0x1f4)</p>
     */
    @ComMethod(name = "MoveLeft", dispId = 0x1f4)
    Integer MoveLeft(Object Unit,
            Object Count,
            Object Extend);
            
    /**
     * <p>id(0x1f5)</p>
     */
    @ComMethod(name = "MoveRight", dispId = 0x1f5)
    Integer MoveRight(Object Unit,
            Object Count,
            Object Extend);
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComMethod(name = "MoveUp", dispId = 0x1f6)
    Integer MoveUp(Object Unit,
            Object Count,
            Object Extend);
            
    /**
     * <p>id(0x1f7)</p>
     */
    @ComMethod(name = "MoveDown", dispId = 0x1f7)
    Integer MoveDown(Object Unit,
            Object Count,
            Object Extend);
            
    /**
     * <p>id(0x1f8)</p>
     */
    @ComMethod(name = "HomeKey", dispId = 0x1f8)
    Integer HomeKey(Object Unit,
            Object Extend);
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComMethod(name = "EndKey", dispId = 0x1f9)
    Integer EndKey(Object Unit,
            Object Extend);
            
    /**
     * <p>id(0x1fa)</p>
     */
    @ComMethod(name = "EscapeKey", dispId = 0x1fa)
    void EscapeKey();
            
    /**
     * <p>id(0x1fb)</p>
     */
    @ComMethod(name = "TypeText", dispId = 0x1fb)
    void TypeText(String Text);
            
    /**
     * <p>id(0x1fd)</p>
     */
    @ComMethod(name = "CopyFormat", dispId = 0x1fd)
    void CopyFormat();
            
    /**
     * <p>id(0x1fe)</p>
     */
    @ComMethod(name = "PasteFormat", dispId = 0x1fe)
    void PasteFormat();
            
    /**
     * <p>id(0x200)</p>
     */
    @ComMethod(name = "TypeParagraph", dispId = 0x200)
    void TypeParagraph();
            
    /**
     * <p>id(0x201)</p>
     */
    @ComMethod(name = "TypeBackspace", dispId = 0x201)
    void TypeBackspace();
            
    /**
     * <p>id(0x202)</p>
     */
    @ComMethod(name = "NextSubdocument", dispId = 0x202)
    void NextSubdocument();
            
    /**
     * <p>id(0x203)</p>
     */
    @ComMethod(name = "PreviousSubdocument", dispId = 0x203)
    void PreviousSubdocument();
            
    /**
     * <p>id(0x204)</p>
     */
    @ComMethod(name = "SelectColumn", dispId = 0x204)
    void SelectColumn();
            
    /**
     * <p>id(0x205)</p>
     */
    @ComMethod(name = "SelectCurrentFont", dispId = 0x205)
    void SelectCurrentFont();
            
    /**
     * <p>id(0x206)</p>
     */
    @ComMethod(name = "SelectCurrentAlignment", dispId = 0x206)
    void SelectCurrentAlignment();
            
    /**
     * <p>id(0x207)</p>
     */
    @ComMethod(name = "SelectCurrentSpacing", dispId = 0x207)
    void SelectCurrentSpacing();
            
    /**
     * <p>id(0x208)</p>
     */
    @ComMethod(name = "SelectCurrentIndent", dispId = 0x208)
    void SelectCurrentIndent();
            
    /**
     * <p>id(0x209)</p>
     */
    @ComMethod(name = "SelectCurrentTabs", dispId = 0x209)
    void SelectCurrentTabs();
            
    /**
     * <p>id(0x20a)</p>
     */
    @ComMethod(name = "SelectCurrentColor", dispId = 0x20a)
    void SelectCurrentColor();
            
    /**
     * <p>id(0x20b)</p>
     */
    @ComMethod(name = "CreateTextbox", dispId = 0x20b)
    void CreateTextbox();
            
    /**
     * <p>id(0x20c)</p>
     */
    @ComMethod(name = "WholeStory", dispId = 0x20c)
    void WholeStory();
            
    /**
     * <p>id(0x20d)</p>
     */
    @ComMethod(name = "SelectRow", dispId = 0x20d)
    void SelectRow();
            
    /**
     * <p>id(0x20e)</p>
     */
    @ComMethod(name = "SplitTable", dispId = 0x20e)
    void SplitTable();
            
    /**
     * <p>id(0x210)</p>
     */
    @ComMethod(name = "InsertRows", dispId = 0x210)
    void InsertRows(Object NumRows);
            
    /**
     * <p>id(0x211)</p>
     */
    @ComMethod(name = "InsertColumns", dispId = 0x211)
    void InsertColumns();
            
    /**
     * <p>id(0x212)</p>
     */
    @ComMethod(name = "InsertFormula", dispId = 0x212)
    void InsertFormula(Object Formula,
            Object NumberFormat);
            
    /**
     * <p>id(0x213)</p>
     */
    @ComMethod(name = "NextRevision", dispId = 0x213)
    Revision NextRevision(Object Wrap);
            
    /**
     * <p>id(0x214)</p>
     */
    @ComMethod(name = "PreviousRevision", dispId = 0x214)
    Revision PreviousRevision(Object Wrap);
            
    /**
     * <p>id(0x215)</p>
     */
    @ComMethod(name = "PasteAsNestedTable", dispId = 0x215)
    void PasteAsNestedTable();
            
    /**
     * <p>id(0x216)</p>
     */
    @ComMethod(name = "CreateAutoTextEntry", dispId = 0x216)
    AutoTextEntry CreateAutoTextEntry(String Name,
            String StyleName);
            
    /**
     * <p>id(0x217)</p>
     */
    @ComMethod(name = "DetectLanguage", dispId = 0x217)
    void DetectLanguage();
            
    /**
     * <p>id(0x218)</p>
     */
    @ComMethod(name = "SelectCell", dispId = 0x218)
    void SelectCell();
            
    /**
     * <p>id(0x219)</p>
     */
    @ComMethod(name = "InsertRowsBelow", dispId = 0x219)
    void InsertRowsBelow(Object NumRows);
            
    /**
     * <p>id(0x21a)</p>
     */
    @ComMethod(name = "InsertColumnsRight", dispId = 0x21a)
    void InsertColumnsRight();
            
    /**
     * <p>id(0x21b)</p>
     */
    @ComMethod(name = "InsertRowsAbove", dispId = 0x21b)
    void InsertRowsAbove(Object NumRows);
            
    /**
     * <p>id(0x258)</p>
     */
    @ComMethod(name = "RtlRun", dispId = 0x258)
    void RtlRun();
            
    /**
     * <p>id(0x259)</p>
     */
    @ComMethod(name = "LtrRun", dispId = 0x259)
    void LtrRun();
            
    /**
     * <p>id(0x25a)</p>
     */
    @ComMethod(name = "BoldRun", dispId = 0x25a)
    void BoldRun();
            
    /**
     * <p>id(0x25b)</p>
     */
    @ComMethod(name = "ItalicRun", dispId = 0x25b)
    void ItalicRun();
            
    /**
     * <p>id(0x25d)</p>
     */
    @ComMethod(name = "RtlPara", dispId = 0x25d)
    void RtlPara();
            
    /**
     * <p>id(0x25e)</p>
     */
    @ComMethod(name = "LtrPara", dispId = 0x25e)
    void LtrPara();
            
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
     * <p>id(0x1bd)</p>
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
     */
    @ComProperty(name = "NoProofing", dispId = 0x3ed)
    Integer getNoProofing();
            
    /**
     * <p>id(0x3ed)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x3ed)
    void setNoProofing(Integer param0);
            
    /**
     * <p>id(0x3ee)</p>
     */
    @ComProperty(name = "TopLevelTables", dispId = 0x3ee)
    Tables getTopLevelTables();
            
    /**
     * <p>id(0x3ef)</p>
     */
    @ComProperty(name = "LanguageDetected", dispId = 0x3ef)
    Boolean getLanguageDetected();
            
    /**
     * <p>id(0x3ef)</p>
     */
    @ComProperty(name = "LanguageDetected", dispId = 0x3ef)
    void setLanguageDetected(Boolean param0);
            
    /**
     * <p>id(0x3f0)</p>
     */
    @ComProperty(name = "FitTextWidth", dispId = 0x3f0)
    Float getFitTextWidth();
            
    /**
     * <p>id(0x3f0)</p>
     */
    @ComProperty(name = "FitTextWidth", dispId = 0x3f0)
    void setFitTextWidth(Float param0);
            
    /**
     * <p>id(0x3f1)</p>
     */
    @ComMethod(name = "ClearFormatting", dispId = 0x3f1)
    void ClearFormatting();
            
    /**
     * <p>id(0x3f2)</p>
     */
    @ComMethod(name = "PasteAppendTable", dispId = 0x3f2)
    void PasteAppendTable();
            
    /**
     * <p>id(0x3f3)</p>
     */
    @ComProperty(name = "HTMLDivisions", dispId = 0x3f3)
    HTMLDivisions getHTMLDivisions();
            
    /**
     * <p>id(0x3f7)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x3f7)
    SmartTags getSmartTags();
            
    /**
     * <p>id(0x3fd)</p>
     */
    @ComProperty(name = "ChildShapeRange", dispId = 0x3fd)
    ShapeRange getChildShapeRange();
            
    /**
     * <p>id(0x3fe)</p>
     */
    @ComProperty(name = "HasChildShapeRange", dispId = 0x3fe)
    Boolean getHasChildShapeRange();
            
    /**
     * <p>id(0x400)</p>
     */
    @ComProperty(name = "FootnoteOptions", dispId = 0x400)
    FootnoteOptions getFootnoteOptions();
            
    /**
     * <p>id(0x401)</p>
     */
    @ComProperty(name = "EndnoteOptions", dispId = 0x401)
    EndnoteOptions getEndnoteOptions();
            
    /**
     * <p>id(0x3f4)</p>
     */
    @ComMethod(name = "ToggleCharacterCode", dispId = 0x3f4)
    void ToggleCharacterCode();
            
    /**
     * <p>id(0x3f5)</p>
     */
    @ComMethod(name = "PasteAndFormat", dispId = 0x3f5)
    void PasteAndFormat(WdRecoveryType Type);
            
    /**
     * <p>id(0x3f6)</p>
     */
    @ComMethod(name = "PasteExcelTable", dispId = 0x3f6)
    void PasteExcelTable(Boolean LinkedToExcel,
            Boolean WordFormatting,
            Boolean RTF);
            
    /**
     * <p>id(0x3fb)</p>
     */
    @ComMethod(name = "ShrinkDiscontiguousSelection", dispId = 0x3fb)
    void ShrinkDiscontiguousSelection();
            
    /**
     * <p>id(0x3fc)</p>
     */
    @ComMethod(name = "InsertStyleSeparator", dispId = 0x3fc)
    void InsertStyleSeparator();
            
    /**
     * <p>id(0x3ff)</p>
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
     */
    @ComProperty(name = "XMLNodes", dispId = 0x136)
    XMLNodes getXMLNodes();
            
    /**
     * <p>id(0x137)</p>
     */
    @ComProperty(name = "XMLParentNode", dispId = 0x137)
    XMLNode getXMLParentNode();
            
    /**
     * <p>id(0x139)</p>
     */
    @ComProperty(name = "Editors", dispId = 0x139)
    Editors getEditors();
            
    /**
     * <p>id(0x13a)</p>
     */
    @ComProperty(name = "XML", dispId = 0x13a)
    String getXML(Boolean DataOnly);
            
    /**
     * <p>id(0x13b)</p>
     */
    @ComProperty(name = "EnhMetaFileBits", dispId = 0x13b)
    Object getEnhMetaFileBits();
            
    /**
     * <p>id(0x403)</p>
     */
    @ComMethod(name = "GoToEditableRange", dispId = 0x403)
    Range GoToEditableRange(Object EditorID);
            
    /**
     * <p>id(0x404)</p>
     */
    @ComMethod(name = "InsertXML", dispId = 0x404)
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
     * <p>id(0x13c)</p>
     */
    @ComProperty(name = "OMaths", dispId = 0x13c)
    OMaths getOMaths();
            
    /**
     * <p>id(0x13d)</p>
     */
    @ComProperty(name = "WordOpenXML", dispId = 0x13d)
    String getWordOpenXML();
            
    /**
     * <p>id(0x406)</p>
     */
    @ComMethod(name = "ClearParagraphStyle", dispId = 0x406)
    void ClearParagraphStyle();
            
    /**
     * <p>id(0x407)</p>
     */
    @ComMethod(name = "ClearCharacterAllFormatting", dispId = 0x407)
    void ClearCharacterAllFormatting();
            
    /**
     * <p>id(0x408)</p>
     */
    @ComMethod(name = "ClearCharacterStyle", dispId = 0x408)
    void ClearCharacterStyle();
            
    /**
     * <p>id(0x409)</p>
     */
    @ComMethod(name = "ClearCharacterDirectFormatting", dispId = 0x409)
    void ClearCharacterDirectFormatting();
            
    /**
     * <p>id(0x40a)</p>
     */
    @ComProperty(name = "ContentControls", dispId = 0x40a)
    ContentControls getContentControls();
            
    /**
     * <p>id(0x40b)</p>
     */
    @ComProperty(name = "ParentContentControl", dispId = 0x40b)
    ContentControl getParentContentControl();
            
    /**
     * <p>id(0x40c)</p>
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
     */
    @ComMethod(name = "ReadingModeGrowFont", dispId = 0x40d)
    void ReadingModeGrowFont();
            
    /**
     * <p>id(0x40e)</p>
     */
    @ComMethod(name = "ReadingModeShrinkFont", dispId = 0x40e)
    void ReadingModeShrinkFont();
            
    /**
     * <p>id(0x40f)</p>
     */
    @ComMethod(name = "ClearParagraphAllFormatting", dispId = 0x40f)
    void ClearParagraphAllFormatting();
            
    /**
     * <p>id(0x410)</p>
     */
    @ComMethod(name = "ClearParagraphDirectFormatting", dispId = 0x410)
    void ClearParagraphDirectFormatting();
            
    /**
     * <p>id(0x411)</p>
     */
    @ComMethod(name = "InsertNewPage", dispId = 0x411)
    void InsertNewPage();
            
    /**
     * <p>id(0x412)</p>
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