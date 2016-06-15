
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020846-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020846-0000-0000-C000-000000000046}")
public interface Range extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    Object Activate();
            
    /**
     * <p>id(0x427)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    Object getAddIndent();
            
    /**
     * <p>id(0x427)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    void setAddIndent(Object param0);
            
    /**
     * <p>id(0xec)</p>
     */
    @ComProperty(name = "Address", dispId = 0xec)
    String getAddress(Object RowAbsolute,
            Object ColumnAbsolute,
            XlReferenceStyle ReferenceStyle,
            Object External,
            Object RelativeTo);
            
    /**
     * <p>id(0x1b5)</p>
     */
    @ComProperty(name = "AddressLocal", dispId = 0x1b5)
    String getAddressLocal(Object RowAbsolute,
            Object ColumnAbsolute,
            XlReferenceStyle ReferenceStyle,
            Object External,
            Object RelativeTo);
            
    /**
     * <p>id(0x36c)</p>
     */
    @ComMethod(name = "AdvancedFilter", dispId = 0x36c)
    Object AdvancedFilter(XlFilterAction Action,
            Object CriteriaRange,
            Object CopyToRange,
            Object Unique);
            
    /**
     * <p>id(0x1b9)</p>
     */
    @ComMethod(name = "ApplyNames", dispId = 0x1b9)
    Object ApplyNames(Object Names,
            Object IgnoreRelativeAbsolute,
            Object UseRowColumnNames,
            Object OmitColumn,
            Object OmitRow,
            XlApplyNamesOrder Order,
            Object AppendLast);
            
    /**
     * <p>id(0x1c0)</p>
     */
    @ComMethod(name = "ApplyOutlineStyles", dispId = 0x1c0)
    Object ApplyOutlineStyles();
            
    /**
     * <p>id(0x238)</p>
     */
    @ComProperty(name = "Areas", dispId = 0x238)
    Areas getAreas();
            
    /**
     * <p>id(0x4a1)</p>
     */
    @ComMethod(name = "AutoComplete", dispId = 0x4a1)
    String AutoComplete(String String);
            
    /**
     * <p>id(0x1c1)</p>
     */
    @ComMethod(name = "AutoFill", dispId = 0x1c1)
    Object AutoFill(Range Destination,
            XlAutoFillType Type);
            
    /**
     * <p>id(0x319)</p>
     */
    @ComMethod(name = "AutoFilter", dispId = 0x319)
    Object AutoFilter(Object Field,
            Object Criteria1,
            XlAutoFilterOperator Operator,
            Object Criteria2,
            Object VisibleDropDown);
            
    /**
     * <p>id(0xed)</p>
     */
    @ComMethod(name = "AutoFit", dispId = 0xed)
    Object AutoFit();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComMethod(name = "AutoFormat", dispId = 0x72)
    Object AutoFormat(XlRangeAutoFormat Format,
            Object Number,
            Object Font,
            Object Alignment,
            Object Border,
            Object Pattern,
            Object Width);
            
    /**
     * <p>id(0x40c)</p>
     */
    @ComMethod(name = "AutoOutline", dispId = 0x40c)
    Object AutoOutline();
            
    /**
     * <p>id(0x42b)</p>
     */
    @ComMethod(name = "_BorderAround", dispId = 0x42b)
    Object _BorderAround(Object LineStyle,
            XlBorderWeight Weight,
            XlColorIndex ColorIndex,
            Object Color);
            
    /**
     * <p>id(0x1b3)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    Borders getBorders();
            
    /**
     * <p>id(0x117)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0x117)
    Object Calculate();
            
    /**
     * <p>id(0xee)</p>
     */
    @ComProperty(name = "Cells", dispId = 0xee)
    Range getCells();
            
    /**
     * <p>id(0x25b)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    Characters getCharacters(Object Start,
            Object Length);
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    Object CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x6f)
    Object Clear();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComMethod(name = "ClearContents", dispId = 0x71)
    Object ClearContents();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    Object ClearFormats();
            
    /**
     * <p>id(0xef)</p>
     */
    @ComMethod(name = "ClearNotes", dispId = 0xef)
    Object ClearNotes();
            
    /**
     * <p>id(0x40d)</p>
     */
    @ComMethod(name = "ClearOutline", dispId = 0x40d)
    Object ClearOutline();
            
    /**
     * <p>id(0xf0)</p>
     */
    @ComProperty(name = "Column", dispId = 0xf0)
    Integer getColumn();
            
    /**
     * <p>id(0x1fe)</p>
     */
    @ComMethod(name = "ColumnDifferences", dispId = 0x1fe)
    Range ColumnDifferences(Object Comparison);
            
    /**
     * <p>id(0xf1)</p>
     */
    @ComProperty(name = "Columns", dispId = 0xf1)
    Range getColumns();
            
    /**
     * <p>id(0xf2)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    Object getColumnWidth();
            
    /**
     * <p>id(0xf2)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    void setColumnWidth(Object param0);
            
    /**
     * <p>id(0x1e2)</p>
     */
    @ComMethod(name = "Consolidate", dispId = 0x1e2)
    Object Consolidate(Object Sources,
            Object Function,
            Object TopRow,
            Object LeftColumn,
            Object CreateLinks);
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    Object Copy(Object Destination);
            
    /**
     * <p>id(0x480)</p>
     */
    @ComMethod(name = "CopyFromRecordset", dispId = 0x480)
    Integer CopyFromRecordset(com.sun.jna.platform.win32.COM.util.IUnknown Data,
            Object MaxRows,
            Object MaxColumns);
            
    /**
     * <p>id(0xd5)</p>
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    Object CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0x1c9)</p>
     */
    @ComMethod(name = "CreateNames", dispId = 0x1c9)
    Object CreateNames(Object Top,
            Object Left,
            Object Bottom,
            Object Right);
            
    /**
     * <p>id(0x1ca)</p>
     */
    @ComMethod(name = "CreatePublisher", dispId = 0x1ca)
    Object CreatePublisher(Object Edition,
            XlPictureAppearance Appearance,
            Object ContainsPICT,
            Object ContainsBIFF,
            Object ContainsRTF,
            Object ContainsVALU);
            
    /**
     * <p>id(0x1f5)</p>
     */
    @ComProperty(name = "CurrentArray", dispId = 0x1f5)
    Range getCurrentArray();
            
    /**
     * <p>id(0xf3)</p>
     */
    @ComProperty(name = "CurrentRegion", dispId = 0xf3)
    Range getCurrentRegion();
            
    /**
     * <p>id(0x235)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    Object Cut(Object Destination);
            
    /**
     * <p>id(0x1d0)</p>
     */
    @ComMethod(name = "DataSeries", dispId = 0x1d0)
    Object DataSeries(Object Rowcol,
            XlDataSeriesType Type,
            XlDataSeriesDate Date,
            Object Step,
            Object Stop,
            Object Trend);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    Object get_Default(Object RowIndex,
            Object ColumnIndex);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(Object RowIndex,
            Object ColumnIndex,
            Object param2);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete(Object Shift);
            
    /**
     * <p>id(0x21f)</p>
     */
    @ComProperty(name = "Dependents", dispId = 0x21f)
    Range getDependents();
            
    /**
     * <p>id(0xf5)</p>
     */
    @ComMethod(name = "DialogBox", dispId = 0xf5)
    Object DialogBox();
            
    /**
     * <p>id(0x221)</p>
     */
    @ComProperty(name = "DirectDependents", dispId = 0x221)
    Range getDirectDependents();
            
    /**
     * <p>id(0x222)</p>
     */
    @ComProperty(name = "DirectPrecedents", dispId = 0x222)
    Range getDirectPrecedents();
            
    /**
     * <p>id(0x46b)</p>
     */
    @ComMethod(name = "EditionOptions", dispId = 0x46b)
    Object EditionOptions(XlEditionType Type,
            XlEditionOptionsOption Option,
            Object Name,
            Object Reference,
            XlPictureAppearance Appearance,
            XlPictureAppearance ChartSize,
            Object Format);
            
    /**
     * <p>id(0x1f4)</p>
     */
    @ComProperty(name = "End", dispId = 0x1f4)
    Range getEnd(XlDirection Direction);
            
    /**
     * <p>id(0xf6)</p>
     */
    @ComProperty(name = "EntireColumn", dispId = 0xf6)
    Range getEntireColumn();
            
    /**
     * <p>id(0xf7)</p>
     */
    @ComProperty(name = "EntireRow", dispId = 0xf7)
    Range getEntireRow();
            
    /**
     * <p>id(0xf8)</p>
     */
    @ComMethod(name = "FillDown", dispId = 0xf8)
    Object FillDown();
            
    /**
     * <p>id(0xf9)</p>
     */
    @ComMethod(name = "FillLeft", dispId = 0xf9)
    Object FillLeft();
            
    /**
     * <p>id(0xfa)</p>
     */
    @ComMethod(name = "FillRight", dispId = 0xfa)
    Object FillRight();
            
    /**
     * <p>id(0xfb)</p>
     */
    @ComMethod(name = "FillUp", dispId = 0xfb)
    Object FillUp();
            
    /**
     * <p>id(0x18e)</p>
     */
    @ComMethod(name = "Find", dispId = 0x18e)
    Range Find(Object What,
            Object After,
            Object LookIn,
            Object LookAt,
            Object SearchOrder,
            XlSearchDirection SearchDirection,
            Object MatchCase,
            Object MatchByte,
            Object SearchFormat);
            
    /**
     * <p>id(0x18f)</p>
     */
    @ComMethod(name = "FindNext", dispId = 0x18f)
    Range FindNext(Object After);
            
    /**
     * <p>id(0x190)</p>
     */
    @ComMethod(name = "FindPrevious", dispId = 0x190)
    Range FindPrevious(Object After);
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    Object getFormula();
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    void setFormula(Object param0);
            
    /**
     * <p>id(0x24a)</p>
     */
    @ComProperty(name = "FormulaArray", dispId = 0x24a)
    Object getFormulaArray();
            
    /**
     * <p>id(0x24a)</p>
     */
    @ComProperty(name = "FormulaArray", dispId = 0x24a)
    void setFormulaArray(Object param0);
            
    /**
     * <p>id(0x564)</p>
     */
    @ComProperty(name = "FormulaLabel", dispId = 0x564)
    XlFormulaLabel getFormulaLabel();
            
    /**
     * <p>id(0x564)</p>
     */
    @ComProperty(name = "FormulaLabel", dispId = 0x564)
    void setFormulaLabel(XlFormulaLabel param0);
            
    /**
     * <p>id(0x106)</p>
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    Object getFormulaHidden();
            
    /**
     * <p>id(0x106)</p>
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    void setFormulaHidden(Object param0);
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    Object getFormulaLocal();
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    void setFormulaLocal(Object param0);
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    Object getFormulaR1C1();
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    void setFormulaR1C1(Object param0);
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    Object getFormulaR1C1Local();
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    void setFormulaR1C1Local(Object param0);
            
    /**
     * <p>id(0x23b)</p>
     */
    @ComMethod(name = "FunctionWizard", dispId = 0x23b)
    Object FunctionWizard();
            
    /**
     * <p>id(0x1d8)</p>
     */
    @ComMethod(name = "GoalSeek", dispId = 0x1d8)
    Boolean GoalSeek(Object Goal,
            Range ChangingCell);
            
    /**
     * <p>id(0x2e)</p>
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    Object Group(Object Start,
            Object End,
            Object By,
            Object Periods);
            
    /**
     * <p>id(0x10a)</p>
     */
    @ComProperty(name = "HasArray", dispId = 0x10a)
    Object getHasArray();
            
    /**
     * <p>id(0x10b)</p>
     */
    @ComProperty(name = "HasFormula", dispId = 0x10b)
    Object getHasFormula();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Object getHeight();
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    Object getHidden();
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    void setHidden(Object param0);
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    Object getHorizontalAlignment();
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    void setHorizontalAlignment(Object param0);
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    Object getIndentLevel();
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    void setIndentLevel(Object param0);
            
    /**
     * <p>id(0x565)</p>
     */
    @ComMethod(name = "InsertIndent", dispId = 0x565)
    void InsertIndent(Integer InsertAmount);
            
    /**
     * <p>id(0xfc)</p>
     */
    @ComMethod(name = "Insert", dispId = 0xfc)
    Object Insert(Object Shift,
            Object CopyOrigin);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    Object getItem(Object RowIndex,
            Object ColumnIndex);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    void setItem(Object RowIndex,
            Object ColumnIndex,
            Object param2);
            
    /**
     * <p>id(0x1ef)</p>
     */
    @ComMethod(name = "Justify", dispId = 0x1ef)
    Object Justify();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Object getLeft();
            
    /**
     * <p>id(0x4a3)</p>
     */
    @ComProperty(name = "ListHeaderRows", dispId = 0x4a3)
    Integer getListHeaderRows();
            
    /**
     * <p>id(0xfd)</p>
     */
    @ComMethod(name = "ListNames", dispId = 0xfd)
    Object ListNames();
            
    /**
     * <p>id(0x2b3)</p>
     */
    @ComProperty(name = "LocationInTable", dispId = 0x2b3)
    XlLocationInTable getLocationInTable();
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Object getLocked();
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    void setLocked(Object param0);
            
    /**
     * <p>id(0x234)</p>
     */
    @ComMethod(name = "Merge", dispId = 0x234)
    void Merge(Object Across);
            
    /**
     * <p>id(0x568)</p>
     */
    @ComMethod(name = "UnMerge", dispId = 0x568)
    void UnMerge();
            
    /**
     * <p>id(0x569)</p>
     */
    @ComProperty(name = "MergeArea", dispId = 0x569)
    Range getMergeArea();
            
    /**
     * <p>id(0xd0)</p>
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    Object getMergeCells();
            
    /**
     * <p>id(0xd0)</p>
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    void setMergeCells(Object param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    Object getName();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(Object param0);
            
    /**
     * <p>id(0x408)</p>
     */
    @ComMethod(name = "NavigateArrow", dispId = 0x408)
    Object NavigateArrow(Object TowardPrecedent,
            Object ArrowNumber,
            Object LinkNumber);
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComProperty(name = "Next", dispId = 0x1f6)
    Range getNext();
            
    /**
     * <p>id(0x467)</p>
     */
    @ComMethod(name = "NoteText", dispId = 0x467)
    String NoteText(Object Text,
            Object Start,
            Object Length);
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    Object getNumberFormat();
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    void setNumberFormat(Object param0);
            
    /**
     * <p>id(0x449)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    Object getNumberFormatLocal();
            
    /**
     * <p>id(0x449)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    void setNumberFormatLocal(Object param0);
            
    /**
     * <p>id(0xfe)</p>
     */
    @ComProperty(name = "Offset", dispId = 0xfe)
    Range getOffset(Object RowOffset,
            Object ColumnOffset);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    Object getOrientation();
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(Object param0);
            
    /**
     * <p>id(0x10f)</p>
     */
    @ComProperty(name = "OutlineLevel", dispId = 0x10f)
    Object getOutlineLevel();
            
    /**
     * <p>id(0x10f)</p>
     */
    @ComProperty(name = "OutlineLevel", dispId = 0x10f)
    void setOutlineLevel(Object param0);
            
    /**
     * <p>id(0xff)</p>
     */
    @ComProperty(name = "PageBreak", dispId = 0xff)
    Integer getPageBreak();
            
    /**
     * <p>id(0xff)</p>
     */
    @ComProperty(name = "PageBreak", dispId = 0xff)
    void setPageBreak(Integer param0);
            
    /**
     * <p>id(0x1dd)</p>
     */
    @ComMethod(name = "Parse", dispId = 0x1dd)
    Object Parse(Object ParseLine,
            Object Destination);
            
    /**
     * <p>id(0x403)</p>
     */
    @ComMethod(name = "_PasteSpecial", dispId = 0x403)
    Object _PasteSpecial(XlPasteType Paste,
            XlPasteSpecialOperation Operation,
            Object SkipBlanks,
            Object Transpose);
            
    /**
     * <p>id(0x2db)</p>
     */
    @ComProperty(name = "PivotField", dispId = 0x2db)
    PivotField getPivotField();
            
    /**
     * <p>id(0x2e4)</p>
     */
    @ComProperty(name = "PivotItem", dispId = 0x2e4)
    PivotItem getPivotItem();
            
    /**
     * <p>id(0x2cc)</p>
     */
    @ComProperty(name = "PivotTable", dispId = 0x2cc)
    PivotTable getPivotTable();
            
    /**
     * <p>id(0x220)</p>
     */
    @ComProperty(name = "Precedents", dispId = 0x220)
    Range getPrecedents();
            
    /**
     * <p>id(0x1f8)</p>
     */
    @ComProperty(name = "PrefixCharacter", dispId = 0x1f8)
    Object getPrefixCharacter();
            
    /**
     * <p>id(0x1f7)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x1f7)
    Range getPrevious();
            
    /**
     * <p>id(0x389)</p>
     */
    @ComMethod(name = "__PrintOut", dispId = 0x389)
    Object __PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate);
            
    /**
     * <p>id(0x119)</p>
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    Object PrintPreview(Object EnableChanges);
            
    /**
     * <p>id(0x56a)</p>
     */
    @ComProperty(name = "QueryTable", dispId = 0x56a)
    QueryTable getQueryTable();
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange(Object Cell1,
            Object Cell2);
            
    /**
     * <p>id(0x373)</p>
     */
    @ComMethod(name = "RemoveSubtotal", dispId = 0x373)
    Object RemoveSubtotal();
            
    /**
     * <p>id(0xe2)</p>
     */
    @ComMethod(name = "Replace", dispId = 0xe2)
    Boolean Replace(Object What,
            Object Replacement,
            Object LookAt,
            Object SearchOrder,
            Object MatchCase,
            Object MatchByte,
            Object SearchFormat,
            Object ReplaceFormat);
            
    /**
     * <p>id(0x100)</p>
     */
    @ComProperty(name = "Resize", dispId = 0x100)
    Range getResize(Object RowSize,
            Object ColumnSize);
            
    /**
     * <p>id(0x101)</p>
     */
    @ComProperty(name = "Row", dispId = 0x101)
    Integer getRow();
            
    /**
     * <p>id(0x1ff)</p>
     */
    @ComMethod(name = "RowDifferences", dispId = 0x1ff)
    Range RowDifferences(Object Comparison);
            
    /**
     * <p>id(0x110)</p>
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    Object getRowHeight();
            
    /**
     * <p>id(0x110)</p>
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    void setRowHeight(Object param0);
            
    /**
     * <p>id(0x102)</p>
     */
    @ComProperty(name = "Rows", dispId = 0x102)
    Range getRows();
            
    /**
     * <p>id(0x103)</p>
     */
    @ComMethod(name = "Run", dispId = 0x103)
    Object Run(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x1f0)</p>
     */
    @ComMethod(name = "Show", dispId = 0x1f0)
    Object Show();
            
    /**
     * <p>id(0x36d)</p>
     */
    @ComMethod(name = "ShowDependents", dispId = 0x36d)
    Object ShowDependents(Object Remove);
            
    /**
     * <p>id(0x249)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    Object getShowDetail();
            
    /**
     * <p>id(0x249)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    void setShowDetail(Object param0);
            
    /**
     * <p>id(0x36e)</p>
     */
    @ComMethod(name = "ShowErrors", dispId = 0x36e)
    Object ShowErrors();
            
    /**
     * <p>id(0x36f)</p>
     */
    @ComMethod(name = "ShowPrecedents", dispId = 0x36f)
    Object ShowPrecedents(Object Remove);
            
    /**
     * <p>id(0xd1)</p>
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    Object getShrinkToFit();
            
    /**
     * <p>id(0xd1)</p>
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    void setShrinkToFit(Object param0);
            
    /**
     * <p>id(0x370)</p>
     */
    @ComMethod(name = "Sort", dispId = 0x370)
    Object Sort(Object Key1,
            XlSortOrder Order1,
            Object Key2,
            Object Type,
            XlSortOrder Order2,
            Object Key3,
            XlSortOrder Order3,
            XlYesNoGuess Header,
            Object OrderCustom,
            Object MatchCase,
            XlSortOrientation Orientation,
            XlSortMethod SortMethod,
            XlSortDataOption DataOption1,
            XlSortDataOption DataOption2,
            XlSortDataOption DataOption3);
            
    /**
     * <p>id(0x371)</p>
     */
    @ComMethod(name = "SortSpecial", dispId = 0x371)
    Object SortSpecial(XlSortMethod SortMethod,
            Object Key1,
            XlSortOrder Order1,
            Object Type,
            Object Key2,
            XlSortOrder Order2,
            Object Key3,
            XlSortOrder Order3,
            XlYesNoGuess Header,
            Object OrderCustom,
            Object MatchCase,
            XlSortOrientation Orientation,
            XlSortDataOption DataOption1,
            XlSortDataOption DataOption2,
            XlSortDataOption DataOption3);
            
    /**
     * <p>id(0x394)</p>
     */
    @ComProperty(name = "SoundNote", dispId = 0x394)
    SoundNote getSoundNote();
            
    /**
     * <p>id(0x19a)</p>
     */
    @ComMethod(name = "SpecialCells", dispId = 0x19a)
    Range SpecialCells(XlCellType Type,
            Object Value);
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "Style", dispId = 0x104)
    Object getStyle();
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "Style", dispId = 0x104)
    void setStyle(Object param0);
            
    /**
     * <p>id(0x1e1)</p>
     */
    @ComMethod(name = "SubscribeTo", dispId = 0x1e1)
    Object SubscribeTo(String Edition,
            XlSubscribeToFormat Format);
            
    /**
     * <p>id(0x372)</p>
     */
    @ComMethod(name = "Subtotal", dispId = 0x372)
    Object Subtotal(Integer GroupBy,
            XlConsolidationFunction Function,
            Object TotalList,
            Object Replace,
            Object PageBreaks,
            XlSummaryRow SummaryBelowData);
            
    /**
     * <p>id(0x111)</p>
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    Object getSummary();
            
    /**
     * <p>id(0x1f1)</p>
     */
    @ComMethod(name = "Table", dispId = 0x1f1)
    Object Table(Object RowInput,
            Object ColumnInput);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    Object getText();
            
    /**
     * <p>id(0x410)</p>
     */
    @ComMethod(name = "TextToColumns", dispId = 0x410)
    Object TextToColumns(Object Destination,
            XlTextParsingType DataType,
            XlTextQualifier TextQualifier,
            Object ConsecutiveDelimiter,
            Object Tab,
            Object Semicolon,
            Object Comma,
            Object Space,
            Object Other,
            Object OtherChar,
            Object FieldInfo,
            Object DecimalSeparator,
            Object ThousandsSeparator,
            Object TrailingMinusNumbers);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Object getTop();
            
    /**
     * <p>id(0xf4)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0xf4)
    Object Ungroup();
            
    /**
     * <p>id(0x112)</p>
     */
    @ComProperty(name = "UseStandardHeight", dispId = 0x112)
    Object getUseStandardHeight();
            
    /**
     * <p>id(0x112)</p>
     */
    @ComProperty(name = "UseStandardHeight", dispId = 0x112)
    void setUseStandardHeight(Object param0);
            
    /**
     * <p>id(0x113)</p>
     */
    @ComProperty(name = "UseStandardWidth", dispId = 0x113)
    Object getUseStandardWidth();
            
    /**
     * <p>id(0x113)</p>
     */
    @ComProperty(name = "UseStandardWidth", dispId = 0x113)
    void setUseStandardWidth(Object param0);
            
    /**
     * <p>id(0x56b)</p>
     */
    @ComProperty(name = "Validation", dispId = 0x56b)
    Validation getValidation();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    Object getValue(Object RangeValueDataType);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(Object RangeValueDataType,
            Object param1);
            
    /**
     * <p>id(0x56c)</p>
     */
    @ComProperty(name = "Value2", dispId = 0x56c)
    Object getValue2();
            
    /**
     * <p>id(0x56c)</p>
     */
    @ComProperty(name = "Value2", dispId = 0x56c)
    void setValue2(Object param0);
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    Object getVerticalAlignment();
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    void setVerticalAlignment(Object param0);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Object getWidth();
            
    /**
     * <p>id(0x15c)</p>
     */
    @ComProperty(name = "Worksheet", dispId = 0x15c)
    Worksheet getWorksheet();
            
    /**
     * <p>id(0x114)</p>
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    Object getWrapText();
            
    /**
     * <p>id(0x114)</p>
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    void setWrapText(Object param0);
            
    /**
     * <p>id(0x56d)</p>
     */
    @ComMethod(name = "AddComment", dispId = 0x56d)
    Comment AddComment(Object Text);
            
    /**
     * <p>id(0x38e)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    Comment getComment();
            
    /**
     * <p>id(0x56e)</p>
     */
    @ComMethod(name = "ClearComments", dispId = 0x56e)
    void ClearComments();
            
    /**
     * <p>id(0x56f)</p>
     */
    @ComProperty(name = "Phonetic", dispId = 0x56f)
    Phonetic getPhonetic();
            
    /**
     * <p>id(0x570)</p>
     */
    @ComProperty(name = "FormatConditions", dispId = 0x570)
    FormatConditions getFormatConditions();
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    void setReadingOrder(Integer param0);
            
    /**
     * <p>id(0x571)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x571)
    Hyperlinks getHyperlinks();
            
    /**
     * <p>id(0x713)</p>
     */
    @ComProperty(name = "Phonetics", dispId = 0x713)
    Phonetics getPhonetics();
            
    /**
     * <p>id(0x714)</p>
     */
    @ComMethod(name = "SetPhonetic", dispId = 0x714)
    void SetPhonetic();
            
    /**
     * <p>id(0x715)</p>
     */
    @ComProperty(name = "ID", dispId = 0x715)
    String getID();
            
    /**
     * <p>id(0x715)</p>
     */
    @ComProperty(name = "ID", dispId = 0x715)
    void setID(String param0);
            
    /**
     * <p>id(0x6ec)</p>
     */
    @ComMethod(name = "_PrintOut", dispId = 0x6ec)
    Object _PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName);
            
    /**
     * <p>id(0x7dd)</p>
     */
    @ComProperty(name = "PivotCell", dispId = 0x7dd)
    PivotCell getPivotCell();
            
    /**
     * <p>id(0x7de)</p>
     */
    @ComMethod(name = "Dirty", dispId = 0x7de)
    void Dirty();
            
    /**
     * <p>id(0x7df)</p>
     */
    @ComProperty(name = "Errors", dispId = 0x7df)
    Errors getErrors();
            
    /**
     * <p>id(0x7e0)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x7e0)
    SmartTags getSmartTags();
            
    /**
     * <p>id(0x7e1)</p>
     */
    @ComMethod(name = "Speak", dispId = 0x7e1)
    void Speak(Object SpeakDirection,
            Object SpeakFormulas);
            
    /**
     * <p>id(0x788)</p>
     */
    @ComMethod(name = "PasteSpecial", dispId = 0x788)
    Object PasteSpecial(XlPasteType Paste,
            XlPasteSpecialOperation Operation,
            Object SkipBlanks,
            Object Transpose);
            
    /**
     * <p>id(0x7e4)</p>
     */
    @ComProperty(name = "AllowEdit", dispId = 0x7e4)
    Boolean getAllowEdit();
            
    /**
     * <p>id(0x8d1)</p>
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    ListObject getListObject();
            
    /**
     * <p>id(0x8d2)</p>
     */
    @ComProperty(name = "XPath", dispId = 0x8d2)
    XPath getXPath();
            
    /**
     * <p>id(0x9bb)</p>
     */
    @ComProperty(name = "ServerActions", dispId = 0x9bb)
    Actions getServerActions();
            
    /**
     * <p>id(0x9bc)</p>
     */
    @ComMethod(name = "RemoveDuplicates", dispId = 0x9bc)
    void RemoveDuplicates(Object Columns,
            XlYesNoGuess Header);
            
    /**
     * <p>id(0x939)</p>
     */
    @ComMethod(name = "PrintOut", dispId = 0x939)
    Object PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName);
            
    /**
     * <p>id(0x84b)</p>
     */
    @ComProperty(name = "MDX", dispId = 0x84b)
    String getMDX();
            
    /**
     * <p>id(0x9bd)</p>
     */
    @ComMethod(name = "ExportAsFixedFormat", dispId = 0x9bd)
    void ExportAsFixedFormat(XlFixedFormatType Type,
            Object Filename,
            Object Quality,
            Object IncludeDocProperties,
            Object IgnorePrintAreas,
            Object From,
            Object To,
            Object OpenAfterPublish,
            Object FixedFormatExtClassPtr);
            
    /**
     * <p>id(0x9c3)</p>
     */
    @ComProperty(name = "CountLarge", dispId = 0x9c3)
    Object getCountLarge();
            
    /**
     * <p>id(0x93c)</p>
     */
    @ComMethod(name = "CalculateRowMajorOrder", dispId = 0x93c)
    Object CalculateRowMajorOrder();
            
    /**
     * <p>id(0xb25)</p>
     */
    @ComProperty(name = "SparklineGroups", dispId = 0xb25)
    SparklineGroups getSparklineGroups();
            
    /**
     * <p>id(0xb26)</p>
     */
    @ComMethod(name = "ClearHyperlinks", dispId = 0xb26)
    void ClearHyperlinks();
            
    /**
     * <p>id(0x29a)</p>
     */
    @ComProperty(name = "DisplayFormat", dispId = 0x29a)
    DisplayFormat getDisplayFormat();
            
    /**
     * <p>id(0xad3)</p>
     */
    @ComMethod(name = "BorderAround", dispId = 0xad3)
    Object BorderAround(Object LineStyle,
            XlBorderWeight Weight,
            XlColorIndex ColorIndex,
            Object Color,
            Object ThemeColor);
            
    /**
     * <p>id(0xb27)</p>
     */
    @ComMethod(name = "AllocateChanges", dispId = 0xb27)
    void AllocateChanges();
            
    /**
     * <p>id(0xb28)</p>
     */
    @ComMethod(name = "DiscardChanges", dispId = 0xb28)
    void DiscardChanges();
            
    /**
     * <p>id(0xbb4)</p>
     */
    @ComMethod(name = "FlashFill", dispId = 0xbb4)
    void FlashFill();
            
    
}