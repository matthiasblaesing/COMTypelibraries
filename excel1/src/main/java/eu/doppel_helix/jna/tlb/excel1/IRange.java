
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020846-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020846-0001-0000-C000-000000000046}")
public interface IRange extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate(VARIANT RHS);
            
    /**
     * <p>id(0x427)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    com.sun.jna.platform.win32.WinNT.HRESULT getAddIndent(VARIANT RHS);
            
    /**
     * <p>id(0x427)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    com.sun.jna.platform.win32.WinNT.HRESULT setAddIndent(Object RHS);
            
    /**
     * <p>id(0xec)</p>
     */
    @ComProperty(name = "Address", dispId = 0xec)
    com.sun.jna.platform.win32.WinNT.HRESULT getAddress(Object RowAbsolute,
            Object ColumnAbsolute,
            XlReferenceStyle ReferenceStyle,
            Object External,
            Object RelativeTo,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x1b5)</p>
     */
    @ComProperty(name = "AddressLocal", dispId = 0x1b5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAddressLocal(Object RowAbsolute,
            Object ColumnAbsolute,
            XlReferenceStyle ReferenceStyle,
            Object External,
            Object RelativeTo,
            VARIANT RHS);
            
    /**
     * <p>id(0x36c)</p>
     */
    @ComMethod(name = "AdvancedFilter", dispId = 0x36c)
    com.sun.jna.platform.win32.WinNT.HRESULT AdvancedFilter(XlFilterAction Action,
            Object CriteriaRange,
            Object CopyToRange,
            Object Unique,
            VARIANT RHS);
            
    /**
     * <p>id(0x1b9)</p>
     */
    @ComMethod(name = "ApplyNames", dispId = 0x1b9)
    com.sun.jna.platform.win32.WinNT.HRESULT ApplyNames(Object Names,
            Object IgnoreRelativeAbsolute,
            Object UseRowColumnNames,
            Object OmitColumn,
            Object OmitRow,
            XlApplyNamesOrder Order,
            Object AppendLast,
            VARIANT RHS);
            
    /**
     * <p>id(0x1c0)</p>
     */
    @ComMethod(name = "ApplyOutlineStyles", dispId = 0x1c0)
    com.sun.jna.platform.win32.WinNT.HRESULT ApplyOutlineStyles(VARIANT RHS);
            
    /**
     * <p>id(0x238)</p>
     */
    @ComProperty(name = "Areas", dispId = 0x238)
    com.sun.jna.platform.win32.WinNT.HRESULT getAreas(VARIANT RHS);
            
    /**
     * <p>id(0x4a1)</p>
     */
    @ComMethod(name = "AutoComplete", dispId = 0x4a1)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoComplete(String String,
            VARIANT RHS);
            
    /**
     * <p>id(0x1c1)</p>
     */
    @ComMethod(name = "AutoFill", dispId = 0x1c1)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoFill(Range Destination,
            XlAutoFillType Type,
            VARIANT RHS);
            
    /**
     * <p>id(0x319)</p>
     */
    @ComMethod(name = "AutoFilter", dispId = 0x319)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoFilter(Object Field,
            Object Criteria1,
            XlAutoFilterOperator Operator,
            Object Criteria2,
            Object VisibleDropDown,
            VARIANT RHS);
            
    /**
     * <p>id(0xed)</p>
     */
    @ComMethod(name = "AutoFit", dispId = 0xed)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoFit(VARIANT RHS);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComMethod(name = "AutoFormat", dispId = 0x72)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoFormat(XlRangeAutoFormat Format,
            Object Number,
            Object Font,
            Object Alignment,
            Object Border,
            Object Pattern,
            Object Width,
            VARIANT RHS);
            
    /**
     * <p>id(0x40c)</p>
     */
    @ComMethod(name = "AutoOutline", dispId = 0x40c)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoOutline(VARIANT RHS);
            
    /**
     * <p>id(0x42b)</p>
     */
    @ComMethod(name = "_BorderAround", dispId = 0x42b)
    com.sun.jna.platform.win32.WinNT.HRESULT _BorderAround(Object LineStyle,
            XlBorderWeight Weight,
            XlColorIndex ColorIndex,
            Object Color,
            VARIANT RHS);
            
    /**
     * <p>id(0x1b3)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorders(VARIANT RHS);
            
    /**
     * <p>id(0x117)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0x117)
    com.sun.jna.platform.win32.WinNT.HRESULT Calculate(VARIANT RHS);
            
    /**
     * <p>id(0xee)</p>
     */
    @ComProperty(name = "Cells", dispId = 0xee)
    com.sun.jna.platform.win32.WinNT.HRESULT getCells(VARIANT RHS);
            
    /**
     * <p>id(0x25b)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCharacters(Object Start,
            Object Length,
            VARIANT RHS);
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    com.sun.jna.platform.win32.WinNT.HRESULT CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang,
            VARIANT RHS);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x6f)
    com.sun.jna.platform.win32.WinNT.HRESULT Clear(VARIANT RHS);
            
    /**
     * <p>id(0x71)</p>
     */
    @ComMethod(name = "ClearContents", dispId = 0x71)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearContents(VARIANT RHS);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearFormats(VARIANT RHS);
            
    /**
     * <p>id(0xef)</p>
     */
    @ComMethod(name = "ClearNotes", dispId = 0xef)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearNotes(VARIANT RHS);
            
    /**
     * <p>id(0x40d)</p>
     */
    @ComMethod(name = "ClearOutline", dispId = 0x40d)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearOutline(VARIANT RHS);
            
    /**
     * <p>id(0xf0)</p>
     */
    @ComProperty(name = "Column", dispId = 0xf0)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumn(VARIANT RHS);
            
    /**
     * <p>id(0x1fe)</p>
     */
    @ComMethod(name = "ColumnDifferences", dispId = 0x1fe)
    com.sun.jna.platform.win32.WinNT.HRESULT ColumnDifferences(Object Comparison,
            VARIANT RHS);
            
    /**
     * <p>id(0xf1)</p>
     */
    @ComProperty(name = "Columns", dispId = 0xf1)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumns(VARIANT RHS);
            
    /**
     * <p>id(0xf2)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnWidth(VARIANT RHS);
            
    /**
     * <p>id(0xf2)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    com.sun.jna.platform.win32.WinNT.HRESULT setColumnWidth(Object RHS);
            
    /**
     * <p>id(0x1e2)</p>
     */
    @ComMethod(name = "Consolidate", dispId = 0x1e2)
    com.sun.jna.platform.win32.WinNT.HRESULT Consolidate(Object Sources,
            Object Function,
            Object TopRow,
            Object LeftColumn,
            Object CreateLinks,
            VARIANT RHS);
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(Object Destination,
            VARIANT RHS);
            
    /**
     * <p>id(0x480)</p>
     */
    @ComMethod(name = "CopyFromRecordset", dispId = 0x480)
    com.sun.jna.platform.win32.WinNT.HRESULT CopyFromRecordset(com.sun.jna.platform.win32.COM.util.IUnknown Data,
            Object MaxRows,
            Object MaxColumns,
            VARIANT RHS);
            
    /**
     * <p>id(0xd5)</p>
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    com.sun.jna.platform.win32.WinNT.HRESULT CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format,
            VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0x1c9)</p>
     */
    @ComMethod(name = "CreateNames", dispId = 0x1c9)
    com.sun.jna.platform.win32.WinNT.HRESULT CreateNames(Object Top,
            Object Left,
            Object Bottom,
            Object Right,
            VARIANT RHS);
            
    /**
     * <p>id(0x1ca)</p>
     */
    @ComMethod(name = "CreatePublisher", dispId = 0x1ca)
    com.sun.jna.platform.win32.WinNT.HRESULT CreatePublisher(Object Edition,
            XlPictureAppearance Appearance,
            Object ContainsPICT,
            Object ContainsBIFF,
            Object ContainsRTF,
            Object ContainsVALU,
            VARIANT RHS);
            
    /**
     * <p>id(0x1f5)</p>
     */
    @ComProperty(name = "CurrentArray", dispId = 0x1f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getCurrentArray(VARIANT RHS);
            
    /**
     * <p>id(0xf3)</p>
     */
    @ComProperty(name = "CurrentRegion", dispId = 0xf3)
    com.sun.jna.platform.win32.WinNT.HRESULT getCurrentRegion(VARIANT RHS);
            
    /**
     * <p>id(0x235)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    com.sun.jna.platform.win32.WinNT.HRESULT Cut(Object Destination,
            VARIANT RHS);
            
    /**
     * <p>id(0x1d0)</p>
     */
    @ComMethod(name = "DataSeries", dispId = 0x1d0)
    com.sun.jna.platform.win32.WinNT.HRESULT DataSeries(Object Rowcol,
            XlDataSeriesType Type,
            XlDataSeriesDate Date,
            Object Step,
            Object Stop,
            Object Trend,
            VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Object RowIndex,
            Object ColumnIndex,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT set_Default(Object RowIndex,
            Object ColumnIndex,
            Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(Object Shift,
            VARIANT RHS);
            
    /**
     * <p>id(0x21f)</p>
     */
    @ComProperty(name = "Dependents", dispId = 0x21f)
    com.sun.jna.platform.win32.WinNT.HRESULT getDependents(VARIANT RHS);
            
    /**
     * <p>id(0xf5)</p>
     */
    @ComMethod(name = "DialogBox", dispId = 0xf5)
    com.sun.jna.platform.win32.WinNT.HRESULT DialogBox(VARIANT RHS);
            
    /**
     * <p>id(0x221)</p>
     */
    @ComProperty(name = "DirectDependents", dispId = 0x221)
    com.sun.jna.platform.win32.WinNT.HRESULT getDirectDependents(VARIANT RHS);
            
    /**
     * <p>id(0x222)</p>
     */
    @ComProperty(name = "DirectPrecedents", dispId = 0x222)
    com.sun.jna.platform.win32.WinNT.HRESULT getDirectPrecedents(VARIANT RHS);
            
    /**
     * <p>id(0x46b)</p>
     */
    @ComMethod(name = "EditionOptions", dispId = 0x46b)
    com.sun.jna.platform.win32.WinNT.HRESULT EditionOptions(XlEditionType Type,
            XlEditionOptionsOption Option,
            Object Name,
            Object Reference,
            XlPictureAppearance Appearance,
            XlPictureAppearance ChartSize,
            Object Format,
            VARIANT RHS);
            
    /**
     * <p>id(0x1f4)</p>
     */
    @ComProperty(name = "End", dispId = 0x1f4)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnd(XlDirection Direction,
            VARIANT RHS);
            
    /**
     * <p>id(0xf6)</p>
     */
    @ComProperty(name = "EntireColumn", dispId = 0xf6)
    com.sun.jna.platform.win32.WinNT.HRESULT getEntireColumn(VARIANT RHS);
            
    /**
     * <p>id(0xf7)</p>
     */
    @ComProperty(name = "EntireRow", dispId = 0xf7)
    com.sun.jna.platform.win32.WinNT.HRESULT getEntireRow(VARIANT RHS);
            
    /**
     * <p>id(0xf8)</p>
     */
    @ComMethod(name = "FillDown", dispId = 0xf8)
    com.sun.jna.platform.win32.WinNT.HRESULT FillDown(VARIANT RHS);
            
    /**
     * <p>id(0xf9)</p>
     */
    @ComMethod(name = "FillLeft", dispId = 0xf9)
    com.sun.jna.platform.win32.WinNT.HRESULT FillLeft(VARIANT RHS);
            
    /**
     * <p>id(0xfa)</p>
     */
    @ComMethod(name = "FillRight", dispId = 0xfa)
    com.sun.jna.platform.win32.WinNT.HRESULT FillRight(VARIANT RHS);
            
    /**
     * <p>id(0xfb)</p>
     */
    @ComMethod(name = "FillUp", dispId = 0xfb)
    com.sun.jna.platform.win32.WinNT.HRESULT FillUp(VARIANT RHS);
            
    /**
     * <p>id(0x18e)</p>
     */
    @ComMethod(name = "Find", dispId = 0x18e)
    com.sun.jna.platform.win32.WinNT.HRESULT Find(Object What,
            Object After,
            Object LookIn,
            Object LookAt,
            Object SearchOrder,
            XlSearchDirection SearchDirection,
            Object MatchCase,
            Object MatchByte,
            Object SearchFormat,
            VARIANT RHS);
            
    /**
     * <p>id(0x18f)</p>
     */
    @ComMethod(name = "FindNext", dispId = 0x18f)
    com.sun.jna.platform.win32.WinNT.HRESULT FindNext(Object After,
            VARIANT RHS);
            
    /**
     * <p>id(0x190)</p>
     */
    @ComMethod(name = "FindPrevious", dispId = 0x190)
    com.sun.jna.platform.win32.WinNT.HRESULT FindPrevious(Object After,
            VARIANT RHS);
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormula(Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x24a)</p>
     */
    @ComProperty(name = "FormulaArray", dispId = 0x24a)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaArray(VARIANT RHS);
            
    /**
     * <p>id(0x24a)</p>
     */
    @ComProperty(name = "FormulaArray", dispId = 0x24a)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaArray(Object RHS);
            
    /**
     * <p>id(0x564)</p>
     */
    @ComProperty(name = "FormulaLabel", dispId = 0x564)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaLabel(VARIANT RHS);
            
    /**
     * <p>id(0x564)</p>
     */
    @ComProperty(name = "FormulaLabel", dispId = 0x564)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaLabel(XlFormulaLabel RHS);
            
    /**
     * <p>id(0x106)</p>
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaHidden(VARIANT RHS);
            
    /**
     * <p>id(0x106)</p>
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaHidden(Object RHS);
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaLocal(VARIANT RHS);
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaLocal(Object RHS);
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaR1C1(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaR1C1(Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaR1C1Local(VARIANT RHS);
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaR1C1Local(Object RHS);
            
    /**
     * <p>id(0x23b)</p>
     */
    @ComMethod(name = "FunctionWizard", dispId = 0x23b)
    com.sun.jna.platform.win32.WinNT.HRESULT FunctionWizard(VARIANT RHS);
            
    /**
     * <p>id(0x1d8)</p>
     */
    @ComMethod(name = "GoalSeek", dispId = 0x1d8)
    com.sun.jna.platform.win32.WinNT.HRESULT GoalSeek(Object Goal,
            Range ChangingCell,
            VARIANT RHS);
            
    /**
     * <p>id(0x2e)</p>
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    com.sun.jna.platform.win32.WinNT.HRESULT Group(Object Start,
            Object End,
            Object By,
            Object Periods,
            VARIANT RHS);
            
    /**
     * <p>id(0x10a)</p>
     */
    @ComProperty(name = "HasArray", dispId = 0x10a)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasArray(VARIANT RHS);
            
    /**
     * <p>id(0x10b)</p>
     */
    @ComProperty(name = "HasFormula", dispId = 0x10b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasFormula(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    com.sun.jna.platform.win32.WinNT.HRESULT getHidden(VARIANT RHS);
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    com.sun.jna.platform.win32.WinNT.HRESULT setHidden(Object RHS);
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT setHorizontalAlignment(Object RHS);
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndentLevel(VARIANT RHS);
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    com.sun.jna.platform.win32.WinNT.HRESULT setIndentLevel(Object RHS);
            
    /**
     * <p>id(0x565)</p>
     */
    @ComMethod(name = "InsertIndent", dispId = 0x565)
    com.sun.jna.platform.win32.WinNT.HRESULT InsertIndent(Integer InsertAmount);
            
    /**
     * <p>id(0xfc)</p>
     */
    @ComMethod(name = "Insert", dispId = 0xfc)
    com.sun.jna.platform.win32.WinNT.HRESULT Insert(Object Shift,
            Object CopyOrigin,
            VARIANT RHS);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getItem(Object RowIndex,
            Object ColumnIndex,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT setItem(Object RowIndex,
            Object ColumnIndex,
            Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x1ef)</p>
     */
    @ComMethod(name = "Justify", dispId = 0x1ef)
    com.sun.jna.platform.win32.WinNT.HRESULT Justify(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x4a3)</p>
     */
    @ComProperty(name = "ListHeaderRows", dispId = 0x4a3)
    com.sun.jna.platform.win32.WinNT.HRESULT getListHeaderRows(VARIANT RHS);
            
    /**
     * <p>id(0xfd)</p>
     */
    @ComMethod(name = "ListNames", dispId = 0xfd)
    com.sun.jna.platform.win32.WinNT.HRESULT ListNames(VARIANT RHS);
            
    /**
     * <p>id(0x2b3)</p>
     */
    @ComProperty(name = "LocationInTable", dispId = 0x2b3)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocationInTable(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocked(Object RHS);
            
    /**
     * <p>id(0x234)</p>
     */
    @ComMethod(name = "Merge", dispId = 0x234)
    com.sun.jna.platform.win32.WinNT.HRESULT Merge(Object Across);
            
    /**
     * <p>id(0x568)</p>
     */
    @ComMethod(name = "UnMerge", dispId = 0x568)
    com.sun.jna.platform.win32.WinNT.HRESULT UnMerge();
            
    /**
     * <p>id(0x569)</p>
     */
    @ComProperty(name = "MergeArea", dispId = 0x569)
    com.sun.jna.platform.win32.WinNT.HRESULT getMergeArea(VARIANT RHS);
            
    /**
     * <p>id(0xd0)</p>
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    com.sun.jna.platform.win32.WinNT.HRESULT getMergeCells(VARIANT RHS);
            
    /**
     * <p>id(0xd0)</p>
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    com.sun.jna.platform.win32.WinNT.HRESULT setMergeCells(Object RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(Object RHS);
            
    /**
     * <p>id(0x408)</p>
     */
    @ComMethod(name = "NavigateArrow", dispId = 0x408)
    com.sun.jna.platform.win32.WinNT.HRESULT NavigateArrow(Object TowardPrecedent,
            Object ArrowNumber,
            Object LinkNumber,
            VARIANT RHS);
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComProperty(name = "Next", dispId = 0x1f6)
    com.sun.jna.platform.win32.WinNT.HRESULT getNext(VARIANT RHS);
            
    /**
     * <p>id(0x467)</p>
     */
    @ComMethod(name = "NoteText", dispId = 0x467)
    com.sun.jna.platform.win32.WinNT.HRESULT NoteText(Object Text,
            Object Start,
            Object Length,
            VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormat(Object RHS);
            
    /**
     * <p>id(0x449)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormatLocal(VARIANT RHS);
            
    /**
     * <p>id(0x449)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormatLocal(Object RHS);
            
    /**
     * <p>id(0xfe)</p>
     */
    @ComProperty(name = "Offset", dispId = 0xfe)
    com.sun.jna.platform.win32.WinNT.HRESULT getOffset(Object RowOffset,
            Object ColumnOffset,
            VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(Object RHS);
            
    /**
     * <p>id(0x10f)</p>
     */
    @ComProperty(name = "OutlineLevel", dispId = 0x10f)
    com.sun.jna.platform.win32.WinNT.HRESULT getOutlineLevel(VARIANT RHS);
            
    /**
     * <p>id(0x10f)</p>
     */
    @ComProperty(name = "OutlineLevel", dispId = 0x10f)
    com.sun.jna.platform.win32.WinNT.HRESULT setOutlineLevel(Object RHS);
            
    /**
     * <p>id(0xff)</p>
     */
    @ComProperty(name = "PageBreak", dispId = 0xff)
    com.sun.jna.platform.win32.WinNT.HRESULT getPageBreak(VARIANT RHS);
            
    /**
     * <p>id(0xff)</p>
     */
    @ComProperty(name = "PageBreak", dispId = 0xff)
    com.sun.jna.platform.win32.WinNT.HRESULT setPageBreak(Integer RHS);
            
    /**
     * <p>id(0x1dd)</p>
     */
    @ComMethod(name = "Parse", dispId = 0x1dd)
    com.sun.jna.platform.win32.WinNT.HRESULT Parse(Object ParseLine,
            Object Destination,
            VARIANT RHS);
            
    /**
     * <p>id(0x403)</p>
     */
    @ComMethod(name = "_PasteSpecial", dispId = 0x403)
    com.sun.jna.platform.win32.WinNT.HRESULT _PasteSpecial(XlPasteType Paste,
            XlPasteSpecialOperation Operation,
            Object SkipBlanks,
            Object Transpose,
            VARIANT RHS);
            
    /**
     * <p>id(0x2db)</p>
     */
    @ComProperty(name = "PivotField", dispId = 0x2db)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotField(VARIANT RHS);
            
    /**
     * <p>id(0x2e4)</p>
     */
    @ComProperty(name = "PivotItem", dispId = 0x2e4)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotItem(VARIANT RHS);
            
    /**
     * <p>id(0x2cc)</p>
     */
    @ComProperty(name = "PivotTable", dispId = 0x2cc)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotTable(VARIANT RHS);
            
    /**
     * <p>id(0x220)</p>
     */
    @ComProperty(name = "Precedents", dispId = 0x220)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrecedents(VARIANT RHS);
            
    /**
     * <p>id(0x1f8)</p>
     */
    @ComProperty(name = "PrefixCharacter", dispId = 0x1f8)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrefixCharacter(VARIANT RHS);
            
    /**
     * <p>id(0x1f7)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x1f7)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrevious(VARIANT RHS);
            
    /**
     * <p>id(0x389)</p>
     */
    @ComMethod(name = "__PrintOut", dispId = 0x389)
    com.sun.jna.platform.win32.WinNT.HRESULT __PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            VARIANT RHS);
            
    /**
     * <p>id(0x119)</p>
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    com.sun.jna.platform.win32.WinNT.HRESULT PrintPreview(Object EnableChanges,
            VARIANT RHS);
            
    /**
     * <p>id(0x56a)</p>
     */
    @ComProperty(name = "QueryTable", dispId = 0x56a)
    com.sun.jna.platform.win32.WinNT.HRESULT getQueryTable(VARIANT RHS);
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(Object Cell1,
            Object Cell2,
            VARIANT RHS);
            
    /**
     * <p>id(0x373)</p>
     */
    @ComMethod(name = "RemoveSubtotal", dispId = 0x373)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveSubtotal(VARIANT RHS);
            
    /**
     * <p>id(0xe2)</p>
     */
    @ComMethod(name = "Replace", dispId = 0xe2)
    com.sun.jna.platform.win32.WinNT.HRESULT Replace(Object What,
            Object Replacement,
            Object LookAt,
            Object SearchOrder,
            Object MatchCase,
            Object MatchByte,
            Object SearchFormat,
            Object ReplaceFormat,
            VARIANT RHS);
            
    /**
     * <p>id(0x100)</p>
     */
    @ComProperty(name = "Resize", dispId = 0x100)
    com.sun.jna.platform.win32.WinNT.HRESULT getResize(Object RowSize,
            Object ColumnSize,
            VARIANT RHS);
            
    /**
     * <p>id(0x101)</p>
     */
    @ComProperty(name = "Row", dispId = 0x101)
    com.sun.jna.platform.win32.WinNT.HRESULT getRow(VARIANT RHS);
            
    /**
     * <p>id(0x1ff)</p>
     */
    @ComMethod(name = "RowDifferences", dispId = 0x1ff)
    com.sun.jna.platform.win32.WinNT.HRESULT RowDifferences(Object Comparison,
            VARIANT RHS);
            
    /**
     * <p>id(0x110)</p>
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowHeight(VARIANT RHS);
            
    /**
     * <p>id(0x110)</p>
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    com.sun.jna.platform.win32.WinNT.HRESULT setRowHeight(Object RHS);
            
    /**
     * <p>id(0x102)</p>
     */
    @ComProperty(name = "Rows", dispId = 0x102)
    com.sun.jna.platform.win32.WinNT.HRESULT getRows(VARIANT RHS);
            
    /**
     * <p>id(0x103)</p>
     */
    @ComMethod(name = "Run", dispId = 0x103)
    com.sun.jna.platform.win32.WinNT.HRESULT Run(Object Arg1,
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
            Object Arg30,
            VARIANT RHS);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0x1f0)</p>
     */
    @ComMethod(name = "Show", dispId = 0x1f0)
    com.sun.jna.platform.win32.WinNT.HRESULT Show(VARIANT RHS);
            
    /**
     * <p>id(0x36d)</p>
     */
    @ComMethod(name = "ShowDependents", dispId = 0x36d)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowDependents(Object Remove,
            VARIANT RHS);
            
    /**
     * <p>id(0x249)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowDetail(VARIANT RHS);
            
    /**
     * <p>id(0x249)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowDetail(Object RHS);
            
    /**
     * <p>id(0x36e)</p>
     */
    @ComMethod(name = "ShowErrors", dispId = 0x36e)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowErrors(VARIANT RHS);
            
    /**
     * <p>id(0x36f)</p>
     */
    @ComMethod(name = "ShowPrecedents", dispId = 0x36f)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowPrecedents(Object Remove,
            VARIANT RHS);
            
    /**
     * <p>id(0xd1)</p>
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    com.sun.jna.platform.win32.WinNT.HRESULT getShrinkToFit(VARIANT RHS);
            
    /**
     * <p>id(0xd1)</p>
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    com.sun.jna.platform.win32.WinNT.HRESULT setShrinkToFit(Object RHS);
            
    /**
     * <p>id(0x370)</p>
     */
    @ComMethod(name = "Sort", dispId = 0x370)
    com.sun.jna.platform.win32.WinNT.HRESULT Sort(Object Key1,
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
            XlSortDataOption DataOption3,
            VARIANT RHS);
            
    /**
     * <p>id(0x371)</p>
     */
    @ComMethod(name = "SortSpecial", dispId = 0x371)
    com.sun.jna.platform.win32.WinNT.HRESULT SortSpecial(XlSortMethod SortMethod,
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
            XlSortDataOption DataOption3,
            VARIANT RHS);
            
    /**
     * <p>id(0x394)</p>
     */
    @ComProperty(name = "SoundNote", dispId = 0x394)
    com.sun.jna.platform.win32.WinNT.HRESULT getSoundNote(VARIANT RHS);
            
    /**
     * <p>id(0x19a)</p>
     */
    @ComMethod(name = "SpecialCells", dispId = 0x19a)
    com.sun.jna.platform.win32.WinNT.HRESULT SpecialCells(XlCellType Type,
            Object Value,
            VARIANT RHS);
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "Style", dispId = 0x104)
    com.sun.jna.platform.win32.WinNT.HRESULT getStyle(VARIANT RHS);
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "Style", dispId = 0x104)
    com.sun.jna.platform.win32.WinNT.HRESULT setStyle(Object RHS);
            
    /**
     * <p>id(0x1e1)</p>
     */
    @ComMethod(name = "SubscribeTo", dispId = 0x1e1)
    com.sun.jna.platform.win32.WinNT.HRESULT SubscribeTo(String Edition,
            XlSubscribeToFormat Format,
            VARIANT RHS);
            
    /**
     * <p>id(0x372)</p>
     */
    @ComMethod(name = "Subtotal", dispId = 0x372)
    com.sun.jna.platform.win32.WinNT.HRESULT Subtotal(Integer GroupBy,
            XlConsolidationFunction Function,
            Object TotalList,
            Object Replace,
            Object PageBreaks,
            XlSummaryRow SummaryBelowData,
            VARIANT RHS);
            
    /**
     * <p>id(0x111)</p>
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    com.sun.jna.platform.win32.WinNT.HRESULT getSummary(VARIANT RHS);
            
    /**
     * <p>id(0x1f1)</p>
     */
    @ComMethod(name = "Table", dispId = 0x1f1)
    com.sun.jna.platform.win32.WinNT.HRESULT Table(Object RowInput,
            Object ColumnInput,
            VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getText(VARIANT RHS);
            
    /**
     * <p>id(0x410)</p>
     */
    @ComMethod(name = "TextToColumns", dispId = 0x410)
    com.sun.jna.platform.win32.WinNT.HRESULT TextToColumns(Object Destination,
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
            Object TrailingMinusNumbers,
            VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0xf4)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0xf4)
    com.sun.jna.platform.win32.WinNT.HRESULT Ungroup(VARIANT RHS);
            
    /**
     * <p>id(0x112)</p>
     */
    @ComProperty(name = "UseStandardHeight", dispId = 0x112)
    com.sun.jna.platform.win32.WinNT.HRESULT getUseStandardHeight(VARIANT RHS);
            
    /**
     * <p>id(0x112)</p>
     */
    @ComProperty(name = "UseStandardHeight", dispId = 0x112)
    com.sun.jna.platform.win32.WinNT.HRESULT setUseStandardHeight(Object RHS);
            
    /**
     * <p>id(0x113)</p>
     */
    @ComProperty(name = "UseStandardWidth", dispId = 0x113)
    com.sun.jna.platform.win32.WinNT.HRESULT getUseStandardWidth(VARIANT RHS);
            
    /**
     * <p>id(0x113)</p>
     */
    @ComProperty(name = "UseStandardWidth", dispId = 0x113)
    com.sun.jna.platform.win32.WinNT.HRESULT setUseStandardWidth(Object RHS);
            
    /**
     * <p>id(0x56b)</p>
     */
    @ComProperty(name = "Validation", dispId = 0x56b)
    com.sun.jna.platform.win32.WinNT.HRESULT getValidation(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(Object RangeValueDataType,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(Object RangeValueDataType,
            Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x56c)</p>
     */
    @ComProperty(name = "Value2", dispId = 0x56c)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue2(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x56c)</p>
     */
    @ComProperty(name = "Value2", dispId = 0x56c)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue2(Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT setVerticalAlignment(Object RHS);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x15c)</p>
     */
    @ComProperty(name = "Worksheet", dispId = 0x15c)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorksheet(VARIANT RHS);
            
    /**
     * <p>id(0x114)</p>
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    com.sun.jna.platform.win32.WinNT.HRESULT getWrapText(VARIANT RHS);
            
    /**
     * <p>id(0x114)</p>
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    com.sun.jna.platform.win32.WinNT.HRESULT setWrapText(Object RHS);
            
    /**
     * <p>id(0x56d)</p>
     */
    @ComMethod(name = "AddComment", dispId = 0x56d)
    com.sun.jna.platform.win32.WinNT.HRESULT AddComment(Object Text,
            VARIANT RHS);
            
    /**
     * <p>id(0x38e)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    com.sun.jna.platform.win32.WinNT.HRESULT getComment(VARIANT RHS);
            
    /**
     * <p>id(0x56e)</p>
     */
    @ComMethod(name = "ClearComments", dispId = 0x56e)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearComments();
            
    /**
     * <p>id(0x56f)</p>
     */
    @ComProperty(name = "Phonetic", dispId = 0x56f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPhonetic(VARIANT RHS);
            
    /**
     * <p>id(0x570)</p>
     */
    @ComProperty(name = "FormatConditions", dispId = 0x570)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormatConditions(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadingOrder(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT setReadingOrder(Integer RHS);
            
    /**
     * <p>id(0x571)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x571)
    com.sun.jna.platform.win32.WinNT.HRESULT getHyperlinks(VARIANT RHS);
            
    /**
     * <p>id(0x713)</p>
     */
    @ComProperty(name = "Phonetics", dispId = 0x713)
    com.sun.jna.platform.win32.WinNT.HRESULT getPhonetics(VARIANT RHS);
            
    /**
     * <p>id(0x714)</p>
     */
    @ComMethod(name = "SetPhonetic", dispId = 0x714)
    com.sun.jna.platform.win32.WinNT.HRESULT SetPhonetic();
            
    /**
     * <p>id(0x715)</p>
     */
    @ComProperty(name = "ID", dispId = 0x715)
    com.sun.jna.platform.win32.WinNT.HRESULT getID(VARIANT RHS);
            
    /**
     * <p>id(0x715)</p>
     */
    @ComProperty(name = "ID", dispId = 0x715)
    com.sun.jna.platform.win32.WinNT.HRESULT setID(String RHS);
            
    /**
     * <p>id(0x6ec)</p>
     */
    @ComMethod(name = "_PrintOut", dispId = 0x6ec)
    com.sun.jna.platform.win32.WinNT.HRESULT _PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName,
            VARIANT RHS);
            
    /**
     * <p>id(0x7dd)</p>
     */
    @ComProperty(name = "PivotCell", dispId = 0x7dd)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotCell(VARIANT RHS);
            
    /**
     * <p>id(0x7de)</p>
     */
    @ComMethod(name = "Dirty", dispId = 0x7de)
    com.sun.jna.platform.win32.WinNT.HRESULT Dirty();
            
    /**
     * <p>id(0x7df)</p>
     */
    @ComProperty(name = "Errors", dispId = 0x7df)
    com.sun.jna.platform.win32.WinNT.HRESULT getErrors(VARIANT RHS);
            
    /**
     * <p>id(0x7e0)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x7e0)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmartTags(VARIANT RHS);
            
    /**
     * <p>id(0x7e1)</p>
     */
    @ComMethod(name = "Speak", dispId = 0x7e1)
    com.sun.jna.platform.win32.WinNT.HRESULT Speak(Object SpeakDirection,
            Object SpeakFormulas);
            
    /**
     * <p>id(0x788)</p>
     */
    @ComMethod(name = "PasteSpecial", dispId = 0x788)
    com.sun.jna.platform.win32.WinNT.HRESULT PasteSpecial(XlPasteType Paste,
            XlPasteSpecialOperation Operation,
            Object SkipBlanks,
            Object Transpose,
            VARIANT RHS);
            
    /**
     * <p>id(0x7e4)</p>
     */
    @ComProperty(name = "AllowEdit", dispId = 0x7e4)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowEdit(VARIANT RHS);
            
    /**
     * <p>id(0x8d1)</p>
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getListObject(VARIANT RHS);
            
    /**
     * <p>id(0x8d2)</p>
     */
    @ComProperty(name = "XPath", dispId = 0x8d2)
    com.sun.jna.platform.win32.WinNT.HRESULT getXPath(VARIANT RHS);
            
    /**
     * <p>id(0x9bb)</p>
     */
    @ComProperty(name = "ServerActions", dispId = 0x9bb)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerActions(VARIANT RHS);
            
    /**
     * <p>id(0x9bc)</p>
     */
    @ComMethod(name = "RemoveDuplicates", dispId = 0x9bc)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveDuplicates(Object Columns,
            XlYesNoGuess Header);
            
    /**
     * <p>id(0x939)</p>
     */
    @ComMethod(name = "PrintOut", dispId = 0x939)
    com.sun.jna.platform.win32.WinNT.HRESULT PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName,
            VARIANT RHS);
            
    /**
     * <p>id(0x84b)</p>
     */
    @ComProperty(name = "MDX", dispId = 0x84b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMDX(VARIANT RHS);
            
    /**
     * <p>id(0x9bd)</p>
     */
    @ComMethod(name = "ExportAsFixedFormat", dispId = 0x9bd)
    com.sun.jna.platform.win32.WinNT.HRESULT ExportAsFixedFormat(XlFixedFormatType Type,
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
    com.sun.jna.platform.win32.WinNT.HRESULT getCountLarge(VARIANT RHS);
            
    /**
     * <p>id(0x93c)</p>
     */
    @ComMethod(name = "CalculateRowMajorOrder", dispId = 0x93c)
    com.sun.jna.platform.win32.WinNT.HRESULT CalculateRowMajorOrder(VARIANT RHS);
            
    /**
     * <p>id(0xb25)</p>
     */
    @ComProperty(name = "SparklineGroups", dispId = 0xb25)
    com.sun.jna.platform.win32.WinNT.HRESULT getSparklineGroups(VARIANT RHS);
            
    /**
     * <p>id(0xb26)</p>
     */
    @ComMethod(name = "ClearHyperlinks", dispId = 0xb26)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearHyperlinks();
            
    /**
     * <p>id(0x29a)</p>
     */
    @ComProperty(name = "DisplayFormat", dispId = 0x29a)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayFormat(VARIANT RHS);
            
    /**
     * <p>id(0xad3)</p>
     */
    @ComMethod(name = "BorderAround", dispId = 0xad3)
    com.sun.jna.platform.win32.WinNT.HRESULT BorderAround(Object LineStyle,
            XlBorderWeight Weight,
            XlColorIndex ColorIndex,
            Object Color,
            Object ThemeColor,
            VARIANT RHS);
            
    /**
     * <p>id(0xb27)</p>
     */
    @ComMethod(name = "AllocateChanges", dispId = 0xb27)
    com.sun.jna.platform.win32.WinNT.HRESULT AllocateChanges();
            
    /**
     * <p>id(0xb28)</p>
     */
    @ComMethod(name = "DiscardChanges", dispId = 0xb28)
    com.sun.jna.platform.win32.WinNT.HRESULT DiscardChanges();
            
    /**
     * <p>id(0xbb4)</p>
     */
    @ComMethod(name = "FlashFill", dispId = 0xbb4)
    com.sun.jna.platform.win32.WinNT.HRESULT FlashFill();
            
    
}