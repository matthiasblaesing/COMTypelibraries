
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    Object Activate();
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    Object getAddIndent();
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    void setAddIndent(Object param0);
            
    /**
     * <p>id(0xec)</p>
     * <p>vtableId(13)</p>
     * @param RowAbsolute [in, optional] {@code Object}
     * @param ColumnAbsolute [in, optional] {@code Object}
     * @param ReferenceStyle [in, optional] {@code XlReferenceStyle}
     * @param External [in, optional] {@code Object}
     * @param RelativeTo [in, optional] {@code Object}
     */
    @ComProperty(name = "Address", dispId = 0xec)
    String getAddress(Object RowAbsolute,
            Object ColumnAbsolute,
            XlReferenceStyle ReferenceStyle,
            Object External,
            Object RelativeTo);
            
    /**
     * <p>id(0x1b5)</p>
     * <p>vtableId(14)</p>
     * @param RowAbsolute [in, optional] {@code Object}
     * @param ColumnAbsolute [in, optional] {@code Object}
     * @param ReferenceStyle [in, optional] {@code XlReferenceStyle}
     * @param External [in, optional] {@code Object}
     * @param RelativeTo [in, optional] {@code Object}
     */
    @ComProperty(name = "AddressLocal", dispId = 0x1b5)
    String getAddressLocal(Object RowAbsolute,
            Object ColumnAbsolute,
            XlReferenceStyle ReferenceStyle,
            Object External,
            Object RelativeTo);
            
    /**
     * <p>id(0x36c)</p>
     * <p>vtableId(15)</p>
     * @param Action [in] {@code XlFilterAction}
     * @param CriteriaRange [in, optional] {@code Object}
     * @param CopyToRange [in, optional] {@code Object}
     * @param Unique [in, optional] {@code Object}
     */
    @ComMethod(name = "AdvancedFilter", dispId = 0x36c)
    Object AdvancedFilter(XlFilterAction Action,
            Object CriteriaRange,
            Object CopyToRange,
            Object Unique);
            
    /**
     * <p>id(0x1b9)</p>
     * <p>vtableId(16)</p>
     * @param Names [in, optional] {@code Object}
     * @param IgnoreRelativeAbsolute [in, optional] {@code Object}
     * @param UseRowColumnNames [in, optional] {@code Object}
     * @param OmitColumn [in, optional] {@code Object}
     * @param OmitRow [in, optional] {@code Object}
     * @param Order [in, optional] {@code XlApplyNamesOrder}
     * @param AppendLast [in, optional] {@code Object}
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
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "ApplyOutlineStyles", dispId = 0x1c0)
    Object ApplyOutlineStyles();
            
    /**
     * <p>id(0x238)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Areas", dispId = 0x238)
    Areas getAreas();
            
    /**
     * <p>id(0x4a1)</p>
     * <p>vtableId(19)</p>
     * @param String [in] {@code String}
     */
    @ComMethod(name = "AutoComplete", dispId = 0x4a1)
    String AutoComplete(String String);
            
    /**
     * <p>id(0x1c1)</p>
     * <p>vtableId(20)</p>
     * @param Destination [in] {@code Range}
     * @param Type [in, optional] {@code XlAutoFillType}
     */
    @ComMethod(name = "AutoFill", dispId = 0x1c1)
    Object AutoFill(Range Destination,
            XlAutoFillType Type);
            
    /**
     * <p>id(0x319)</p>
     * <p>vtableId(21)</p>
     * @param Field [in, optional] {@code Object}
     * @param Criteria1 [in, optional] {@code Object}
     * @param Operator [in, optional] {@code XlAutoFilterOperator}
     * @param Criteria2 [in, optional] {@code Object}
     * @param VisibleDropDown [in, optional] {@code Object}
     */
    @ComMethod(name = "AutoFilter", dispId = 0x319)
    Object AutoFilter(Object Field,
            Object Criteria1,
            XlAutoFilterOperator Operator,
            Object Criteria2,
            Object VisibleDropDown);
            
    /**
     * <p>id(0xed)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "AutoFit", dispId = 0xed)
    Object AutoFit();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(23)</p>
     * @param Format [in, optional] {@code XlRangeAutoFormat}
     * @param Number [in, optional] {@code Object}
     * @param Font [in, optional] {@code Object}
     * @param Alignment [in, optional] {@code Object}
     * @param Border [in, optional] {@code Object}
     * @param Pattern [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
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
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "AutoOutline", dispId = 0x40c)
    Object AutoOutline();
            
    /**
     * <p>id(0x42b)</p>
     * <p>vtableId(25)</p>
     * @param LineStyle [in, optional] {@code Object}
     * @param Weight [in, optional] {@code XlBorderWeight}
     * @param ColorIndex [in, optional] {@code XlColorIndex}
     * @param Color [in, optional] {@code Object}
     */
    @ComMethod(name = "_BorderAround", dispId = 0x42b)
    Object _BorderAround(Object LineStyle,
            XlBorderWeight Weight,
            XlColorIndex ColorIndex,
            Object Color);
            
    /**
     * <p>id(0x1b3)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    Borders getBorders();
            
    /**
     * <p>id(0x117)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0x117)
    Object Calculate();
            
    /**
     * <p>id(0xee)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Cells", dispId = 0xee)
    Range getCells();
            
    /**
     * <p>id(0x25b)</p>
     * <p>vtableId(29)</p>
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    Characters getCharacters(Object Start,
            Object Length);
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(30)</p>
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param AlwaysSuggest [in, optional] {@code Object}
     * @param SpellLang [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    Object CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x6f)
    Object Clear();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "ClearContents", dispId = 0x71)
    Object ClearContents();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    Object ClearFormats();
            
    /**
     * <p>id(0xef)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "ClearNotes", dispId = 0xef)
    Object ClearNotes();
            
    /**
     * <p>id(0x40d)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "ClearOutline", dispId = 0x40d)
    Object ClearOutline();
            
    /**
     * <p>id(0xf0)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Column", dispId = 0xf0)
    Integer getColumn();
            
    /**
     * <p>id(0x1fe)</p>
     * <p>vtableId(37)</p>
     * @param Comparison [in] {@code Object}
     */
    @ComMethod(name = "ColumnDifferences", dispId = 0x1fe)
    Range ColumnDifferences(Object Comparison);
            
    /**
     * <p>id(0xf1)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Columns", dispId = 0xf1)
    Range getColumns();
            
    /**
     * <p>id(0xf2)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    Object getColumnWidth();
            
    /**
     * <p>id(0xf2)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    void setColumnWidth(Object param0);
            
    /**
     * <p>id(0x1e2)</p>
     * <p>vtableId(41)</p>
     * @param Sources [in, optional] {@code Object}
     * @param Function [in, optional] {@code Object}
     * @param TopRow [in, optional] {@code Object}
     * @param LeftColumn [in, optional] {@code Object}
     * @param CreateLinks [in, optional] {@code Object}
     */
    @ComMethod(name = "Consolidate", dispId = 0x1e2)
    Object Consolidate(Object Sources,
            Object Function,
            Object TopRow,
            Object LeftColumn,
            Object CreateLinks);
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(42)</p>
     * @param Destination [in, optional] {@code Object}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    Object Copy(Object Destination);
            
    /**
     * <p>id(0x480)</p>
     * <p>vtableId(43)</p>
     * @param Data [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param MaxRows [in, optional] {@code Object}
     * @param MaxColumns [in, optional] {@code Object}
     */
    @ComMethod(name = "CopyFromRecordset", dispId = 0x480)
    Integer CopyFromRecordset(com.sun.jna.platform.win32.COM.util.IUnknown Data,
            Object MaxRows,
            Object MaxColumns);
            
    /**
     * <p>id(0xd5)</p>
     * <p>vtableId(44)</p>
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param Format [in, optional] {@code XlCopyPictureFormat}
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    Object CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(46)</p>
     * @param Top [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Bottom [in, optional] {@code Object}
     * @param Right [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateNames", dispId = 0x1c9)
    Object CreateNames(Object Top,
            Object Left,
            Object Bottom,
            Object Right);
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(47)</p>
     * @param Edition [in, optional] {@code Object}
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param ContainsPICT [in, optional] {@code Object}
     * @param ContainsBIFF [in, optional] {@code Object}
     * @param ContainsRTF [in, optional] {@code Object}
     * @param ContainsVALU [in, optional] {@code Object}
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
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "CurrentArray", dispId = 0x1f5)
    Range getCurrentArray();
            
    /**
     * <p>id(0xf3)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "CurrentRegion", dispId = 0xf3)
    Range getCurrentRegion();
            
    /**
     * <p>id(0x235)</p>
     * <p>vtableId(50)</p>
     * @param Destination [in, optional] {@code Object}
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    Object Cut(Object Destination);
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(51)</p>
     * @param Rowcol [in, optional] {@code Object}
     * @param Type [in, optional] {@code XlDataSeriesType}
     * @param Date [in, optional] {@code XlDataSeriesDate}
     * @param Step [in, optional] {@code Object}
     * @param Stop [in, optional] {@code Object}
     * @param Trend [in, optional] {@code Object}
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
     * <p>vtableId(52)</p>
     * @param RowIndex [in, optional] {@code Object}
     * @param ColumnIndex [in, optional] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    Object get_Default(Object RowIndex,
            Object ColumnIndex);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(53)</p>
     * @param RowIndex [in, optional] {@code Object}
     * @param ColumnIndex [in, optional] {@code Object}
     * @param param2 [in] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(Object RowIndex,
            Object ColumnIndex,
            Object param2);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(54)</p>
     * @param Shift [in, optional] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete(Object Shift);
            
    /**
     * <p>id(0x21f)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "Dependents", dispId = 0x21f)
    Range getDependents();
            
    /**
     * <p>id(0xf5)</p>
     * <p>vtableId(56)</p>
     */
    @ComMethod(name = "DialogBox", dispId = 0xf5)
    Object DialogBox();
            
    /**
     * <p>id(0x221)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "DirectDependents", dispId = 0x221)
    Range getDirectDependents();
            
    /**
     * <p>id(0x222)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "DirectPrecedents", dispId = 0x222)
    Range getDirectPrecedents();
            
    /**
     * <p>id(0x46b)</p>
     * <p>vtableId(59)</p>
     * @param Type [in] {@code XlEditionType}
     * @param Option [in] {@code XlEditionOptionsOption}
     * @param Name [in, optional] {@code Object}
     * @param Reference [in, optional] {@code Object}
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param ChartSize [in, optional] {@code XlPictureAppearance}
     * @param Format [in, optional] {@code Object}
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
     * <p>vtableId(60)</p>
     * @param Direction [in] {@code XlDirection}
     */
    @ComProperty(name = "End", dispId = 0x1f4)
    Range getEnd(XlDirection Direction);
            
    /**
     * <p>id(0xf6)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "EntireColumn", dispId = 0xf6)
    Range getEntireColumn();
            
    /**
     * <p>id(0xf7)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "EntireRow", dispId = 0xf7)
    Range getEntireRow();
            
    /**
     * <p>id(0xf8)</p>
     * <p>vtableId(63)</p>
     */
    @ComMethod(name = "FillDown", dispId = 0xf8)
    Object FillDown();
            
    /**
     * <p>id(0xf9)</p>
     * <p>vtableId(64)</p>
     */
    @ComMethod(name = "FillLeft", dispId = 0xf9)
    Object FillLeft();
            
    /**
     * <p>id(0xfa)</p>
     * <p>vtableId(65)</p>
     */
    @ComMethod(name = "FillRight", dispId = 0xfa)
    Object FillRight();
            
    /**
     * <p>id(0xfb)</p>
     * <p>vtableId(66)</p>
     */
    @ComMethod(name = "FillUp", dispId = 0xfb)
    Object FillUp();
            
    /**
     * <p>id(0x18e)</p>
     * <p>vtableId(67)</p>
     * @param What [in] {@code Object}
     * @param After [in, optional] {@code Object}
     * @param LookIn [in, optional] {@code Object}
     * @param LookAt [in, optional] {@code Object}
     * @param SearchOrder [in, optional] {@code Object}
     * @param SearchDirection [in, optional] {@code XlSearchDirection}
     * @param MatchCase [in, optional] {@code Object}
     * @param MatchByte [in, optional] {@code Object}
     * @param SearchFormat [in, optional] {@code Object}
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
     * <p>vtableId(68)</p>
     * @param After [in, optional] {@code Object}
     */
    @ComMethod(name = "FindNext", dispId = 0x18f)
    Range FindNext(Object After);
            
    /**
     * <p>id(0x190)</p>
     * <p>vtableId(69)</p>
     * @param After [in, optional] {@code Object}
     */
    @ComMethod(name = "FindPrevious", dispId = 0x190)
    Range FindPrevious(Object After);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    Object getFormula();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    void setFormula(Object param0);
            
    /**
     * <p>id(0x24a)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "FormulaArray", dispId = 0x24a)
    Object getFormulaArray();
            
    /**
     * <p>id(0x24a)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "FormulaArray", dispId = 0x24a)
    void setFormulaArray(Object param0);
            
    /**
     * <p>id(0x564)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "FormulaLabel", dispId = 0x564)
    XlFormulaLabel getFormulaLabel();
            
    /**
     * <p>id(0x564)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code XlFormulaLabel}
     */
    @ComProperty(name = "FormulaLabel", dispId = 0x564)
    void setFormulaLabel(XlFormulaLabel param0);
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    Object getFormulaHidden();
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    void setFormulaHidden(Object param0);
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    Object getFormulaLocal();
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    void setFormulaLocal(Object param0);
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    Object getFormulaR1C1();
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    void setFormulaR1C1(Object param0);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    Object getFormulaR1C1Local();
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    void setFormulaR1C1Local(Object param0);
            
    /**
     * <p>id(0x23b)</p>
     * <p>vtableId(85)</p>
     */
    @ComMethod(name = "FunctionWizard", dispId = 0x23b)
    Object FunctionWizard();
            
    /**
     * <p>id(0x1d8)</p>
     * <p>vtableId(86)</p>
     * @param Goal [in] {@code Object}
     * @param ChangingCell [in] {@code Range}
     */
    @ComMethod(name = "GoalSeek", dispId = 0x1d8)
    Boolean GoalSeek(Object Goal,
            Range ChangingCell);
            
    /**
     * <p>id(0x2e)</p>
     * <p>vtableId(87)</p>
     * @param Start [in, optional] {@code Object}
     * @param End [in, optional] {@code Object}
     * @param By [in, optional] {@code Object}
     * @param Periods [in, optional] {@code Object}
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    Object Group(Object Start,
            Object End,
            Object By,
            Object Periods);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "HasArray", dispId = 0x10a)
    Object getHasArray();
            
    /**
     * <p>id(0x10b)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "HasFormula", dispId = 0x10b)
    Object getHasFormula();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Object getHeight();
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    Object getHidden();
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    void setHidden(Object param0);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    Object getHorizontalAlignment();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    void setHorizontalAlignment(Object param0);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    Object getIndentLevel();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(96)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    void setIndentLevel(Object param0);
            
    /**
     * <p>id(0x565)</p>
     * <p>vtableId(97)</p>
     * @param InsertAmount [in] {@code Integer}
     */
    @ComMethod(name = "InsertIndent", dispId = 0x565)
    void InsertIndent(Integer InsertAmount);
            
    /**
     * <p>id(0xfc)</p>
     * <p>vtableId(98)</p>
     * @param Shift [in, optional] {@code Object}
     * @param CopyOrigin [in, optional] {@code Object}
     */
    @ComMethod(name = "Insert", dispId = 0xfc)
    Object Insert(Object Shift,
            Object CopyOrigin);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(100)</p>
     * @param RowIndex [in] {@code Object}
     * @param ColumnIndex [in, optional] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    Object getItem(Object RowIndex,
            Object ColumnIndex);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(101)</p>
     * @param RowIndex [in] {@code Object}
     * @param ColumnIndex [in, optional] {@code Object}
     * @param param2 [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    void setItem(Object RowIndex,
            Object ColumnIndex,
            Object param2);
            
    /**
     * <p>id(0x1ef)</p>
     * <p>vtableId(102)</p>
     */
    @ComMethod(name = "Justify", dispId = 0x1ef)
    Object Justify();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Object getLeft();
            
    /**
     * <p>id(0x4a3)</p>
     * <p>vtableId(104)</p>
     */
    @ComProperty(name = "ListHeaderRows", dispId = 0x4a3)
    Integer getListHeaderRows();
            
    /**
     * <p>id(0xfd)</p>
     * <p>vtableId(105)</p>
     */
    @ComMethod(name = "ListNames", dispId = 0xfd)
    Object ListNames();
            
    /**
     * <p>id(0x2b3)</p>
     * <p>vtableId(106)</p>
     */
    @ComProperty(name = "LocationInTable", dispId = 0x2b3)
    XlLocationInTable getLocationInTable();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Object getLocked();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(108)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    void setLocked(Object param0);
            
    /**
     * <p>id(0x234)</p>
     * <p>vtableId(109)</p>
     * @param Across [in, optional] {@code Object}
     */
    @ComMethod(name = "Merge", dispId = 0x234)
    void Merge(Object Across);
            
    /**
     * <p>id(0x568)</p>
     * <p>vtableId(110)</p>
     */
    @ComMethod(name = "UnMerge", dispId = 0x568)
    void UnMerge();
            
    /**
     * <p>id(0x569)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "MergeArea", dispId = 0x569)
    Range getMergeArea();
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    Object getMergeCells();
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(113)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    void setMergeCells(Object param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(114)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    Object getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(115)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(Object param0);
            
    /**
     * <p>id(0x408)</p>
     * <p>vtableId(116)</p>
     * @param TowardPrecedent [in, optional] {@code Object}
     * @param ArrowNumber [in, optional] {@code Object}
     * @param LinkNumber [in, optional] {@code Object}
     */
    @ComMethod(name = "NavigateArrow", dispId = 0x408)
    Object NavigateArrow(Object TowardPrecedent,
            Object ArrowNumber,
            Object LinkNumber);
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(118)</p>
     */
    @ComProperty(name = "Next", dispId = 0x1f6)
    Range getNext();
            
    /**
     * <p>id(0x467)</p>
     * <p>vtableId(119)</p>
     * @param Text [in, optional] {@code Object}
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     */
    @ComMethod(name = "NoteText", dispId = 0x467)
    String NoteText(Object Text,
            Object Start,
            Object Length);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(120)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    Object getNumberFormat();
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(121)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    void setNumberFormat(Object param0);
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(122)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    Object getNumberFormatLocal();
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(123)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    void setNumberFormatLocal(Object param0);
            
    /**
     * <p>id(0xfe)</p>
     * <p>vtableId(124)</p>
     * @param RowOffset [in, optional] {@code Object}
     * @param ColumnOffset [in, optional] {@code Object}
     */
    @ComProperty(name = "Offset", dispId = 0xfe)
    Range getOffset(Object RowOffset,
            Object ColumnOffset);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    Object getOrientation();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(126)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(Object param0);
            
    /**
     * <p>id(0x10f)</p>
     * <p>vtableId(127)</p>
     */
    @ComProperty(name = "OutlineLevel", dispId = 0x10f)
    Object getOutlineLevel();
            
    /**
     * <p>id(0x10f)</p>
     * <p>vtableId(128)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "OutlineLevel", dispId = 0x10f)
    void setOutlineLevel(Object param0);
            
    /**
     * <p>id(0xff)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "PageBreak", dispId = 0xff)
    Integer getPageBreak();
            
    /**
     * <p>id(0xff)</p>
     * <p>vtableId(130)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PageBreak", dispId = 0xff)
    void setPageBreak(Integer param0);
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(131)</p>
     * @param ParseLine [in, optional] {@code Object}
     * @param Destination [in, optional] {@code Object}
     */
    @ComMethod(name = "Parse", dispId = 0x1dd)
    Object Parse(Object ParseLine,
            Object Destination);
            
    /**
     * <p>id(0x403)</p>
     * <p>vtableId(132)</p>
     * @param Paste [in, optional] {@code XlPasteType}
     * @param Operation [in, optional] {@code XlPasteSpecialOperation}
     * @param SkipBlanks [in, optional] {@code Object}
     * @param Transpose [in, optional] {@code Object}
     */
    @ComMethod(name = "_PasteSpecial", dispId = 0x403)
    Object _PasteSpecial(XlPasteType Paste,
            XlPasteSpecialOperation Operation,
            Object SkipBlanks,
            Object Transpose);
            
    /**
     * <p>id(0x2db)</p>
     * <p>vtableId(133)</p>
     */
    @ComProperty(name = "PivotField", dispId = 0x2db)
    PivotField getPivotField();
            
    /**
     * <p>id(0x2e4)</p>
     * <p>vtableId(134)</p>
     */
    @ComProperty(name = "PivotItem", dispId = 0x2e4)
    PivotItem getPivotItem();
            
    /**
     * <p>id(0x2cc)</p>
     * <p>vtableId(135)</p>
     */
    @ComProperty(name = "PivotTable", dispId = 0x2cc)
    PivotTable getPivotTable();
            
    /**
     * <p>id(0x220)</p>
     * <p>vtableId(136)</p>
     */
    @ComProperty(name = "Precedents", dispId = 0x220)
    Range getPrecedents();
            
    /**
     * <p>id(0x1f8)</p>
     * <p>vtableId(137)</p>
     */
    @ComProperty(name = "PrefixCharacter", dispId = 0x1f8)
    Object getPrefixCharacter();
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(138)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x1f7)
    Range getPrevious();
            
    /**
     * <p>id(0x389)</p>
     * <p>vtableId(139)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
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
     * <p>vtableId(140)</p>
     * @param EnableChanges [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    Object PrintPreview(Object EnableChanges);
            
    /**
     * <p>id(0x56a)</p>
     * <p>vtableId(141)</p>
     */
    @ComProperty(name = "QueryTable", dispId = 0x56a)
    QueryTable getQueryTable();
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(142)</p>
     * @param Cell1 [in] {@code Object}
     * @param Cell2 [in, optional] {@code Object}
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange(Object Cell1,
            Object Cell2);
            
    /**
     * <p>id(0x373)</p>
     * <p>vtableId(143)</p>
     */
    @ComMethod(name = "RemoveSubtotal", dispId = 0x373)
    Object RemoveSubtotal();
            
    /**
     * <p>id(0xe2)</p>
     * <p>vtableId(144)</p>
     * @param What [in] {@code Object}
     * @param Replacement [in] {@code Object}
     * @param LookAt [in, optional] {@code Object}
     * @param SearchOrder [in, optional] {@code Object}
     * @param MatchCase [in, optional] {@code Object}
     * @param MatchByte [in, optional] {@code Object}
     * @param SearchFormat [in, optional] {@code Object}
     * @param ReplaceFormat [in, optional] {@code Object}
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
     * <p>vtableId(145)</p>
     * @param RowSize [in, optional] {@code Object}
     * @param ColumnSize [in, optional] {@code Object}
     */
    @ComProperty(name = "Resize", dispId = 0x100)
    Range getResize(Object RowSize,
            Object ColumnSize);
            
    /**
     * <p>id(0x101)</p>
     * <p>vtableId(146)</p>
     */
    @ComProperty(name = "Row", dispId = 0x101)
    Integer getRow();
            
    /**
     * <p>id(0x1ff)</p>
     * <p>vtableId(147)</p>
     * @param Comparison [in] {@code Object}
     */
    @ComMethod(name = "RowDifferences", dispId = 0x1ff)
    Range RowDifferences(Object Comparison);
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(148)</p>
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    Object getRowHeight();
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(149)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    void setRowHeight(Object param0);
            
    /**
     * <p>id(0x102)</p>
     * <p>vtableId(150)</p>
     */
    @ComProperty(name = "Rows", dispId = 0x102)
    Range getRows();
            
    /**
     * <p>id(0x103)</p>
     * <p>vtableId(151)</p>
     * @param Arg1 [in, optional] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(152)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(153)</p>
     */
    @ComMethod(name = "Show", dispId = 0x1f0)
    Object Show();
            
    /**
     * <p>id(0x36d)</p>
     * <p>vtableId(154)</p>
     * @param Remove [in, optional] {@code Object}
     */
    @ComMethod(name = "ShowDependents", dispId = 0x36d)
    Object ShowDependents(Object Remove);
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(155)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    Object getShowDetail();
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(156)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    void setShowDetail(Object param0);
            
    /**
     * <p>id(0x36e)</p>
     * <p>vtableId(157)</p>
     */
    @ComMethod(name = "ShowErrors", dispId = 0x36e)
    Object ShowErrors();
            
    /**
     * <p>id(0x36f)</p>
     * <p>vtableId(158)</p>
     * @param Remove [in, optional] {@code Object}
     */
    @ComMethod(name = "ShowPrecedents", dispId = 0x36f)
    Object ShowPrecedents(Object Remove);
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(159)</p>
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    Object getShrinkToFit();
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(160)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    void setShrinkToFit(Object param0);
            
    /**
     * <p>id(0x370)</p>
     * <p>vtableId(161)</p>
     * @param Key1 [in, optional] {@code Object}
     * @param Order1 [in, optional] {@code XlSortOrder}
     * @param Key2 [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     * @param Order2 [in, optional] {@code XlSortOrder}
     * @param Key3 [in, optional] {@code Object}
     * @param Order3 [in, optional] {@code XlSortOrder}
     * @param Header [in, optional] {@code XlYesNoGuess}
     * @param OrderCustom [in, optional] {@code Object}
     * @param MatchCase [in, optional] {@code Object}
     * @param Orientation [in, optional] {@code XlSortOrientation}
     * @param SortMethod [in, optional] {@code XlSortMethod}
     * @param DataOption1 [in, optional] {@code XlSortDataOption}
     * @param DataOption2 [in, optional] {@code XlSortDataOption}
     * @param DataOption3 [in, optional] {@code XlSortDataOption}
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
     * <p>vtableId(162)</p>
     * @param SortMethod [in, optional] {@code XlSortMethod}
     * @param Key1 [in, optional] {@code Object}
     * @param Order1 [in, optional] {@code XlSortOrder}
     * @param Type [in, optional] {@code Object}
     * @param Key2 [in, optional] {@code Object}
     * @param Order2 [in, optional] {@code XlSortOrder}
     * @param Key3 [in, optional] {@code Object}
     * @param Order3 [in, optional] {@code XlSortOrder}
     * @param Header [in, optional] {@code XlYesNoGuess}
     * @param OrderCustom [in, optional] {@code Object}
     * @param MatchCase [in, optional] {@code Object}
     * @param Orientation [in, optional] {@code XlSortOrientation}
     * @param DataOption1 [in, optional] {@code XlSortDataOption}
     * @param DataOption2 [in, optional] {@code XlSortDataOption}
     * @param DataOption3 [in, optional] {@code XlSortDataOption}
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
     * <p>vtableId(163)</p>
     */
    @ComProperty(name = "SoundNote", dispId = 0x394)
    SoundNote getSoundNote();
            
    /**
     * <p>id(0x19a)</p>
     * <p>vtableId(164)</p>
     * @param Type [in] {@code XlCellType}
     * @param Value [in, optional] {@code Object}
     */
    @ComMethod(name = "SpecialCells", dispId = 0x19a)
    Range SpecialCells(XlCellType Type,
            Object Value);
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(165)</p>
     */
    @ComProperty(name = "Style", dispId = 0x104)
    Object getStyle();
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(166)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0x104)
    void setStyle(Object param0);
            
    /**
     * <p>id(0x1e1)</p>
     * <p>vtableId(167)</p>
     * @param Edition [in] {@code String}
     * @param Format [in, optional] {@code XlSubscribeToFormat}
     */
    @ComMethod(name = "SubscribeTo", dispId = 0x1e1)
    Object SubscribeTo(String Edition,
            XlSubscribeToFormat Format);
            
    /**
     * <p>id(0x372)</p>
     * <p>vtableId(168)</p>
     * @param GroupBy [in] {@code Integer}
     * @param Function [in] {@code XlConsolidationFunction}
     * @param TotalList [in] {@code Object}
     * @param Replace [in, optional] {@code Object}
     * @param PageBreaks [in, optional] {@code Object}
     * @param SummaryBelowData [in, optional] {@code XlSummaryRow}
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
     * <p>vtableId(169)</p>
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    Object getSummary();
            
    /**
     * <p>id(0x1f1)</p>
     * <p>vtableId(170)</p>
     * @param RowInput [in, optional] {@code Object}
     * @param ColumnInput [in, optional] {@code Object}
     */
    @ComMethod(name = "Table", dispId = 0x1f1)
    Object Table(Object RowInput,
            Object ColumnInput);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(171)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    Object getText();
            
    /**
     * <p>id(0x410)</p>
     * <p>vtableId(172)</p>
     * @param Destination [in, optional] {@code Object}
     * @param DataType [in, optional] {@code XlTextParsingType}
     * @param TextQualifier [in, optional] {@code XlTextQualifier}
     * @param ConsecutiveDelimiter [in, optional] {@code Object}
     * @param Tab [in, optional] {@code Object}
     * @param Semicolon [in, optional] {@code Object}
     * @param Comma [in, optional] {@code Object}
     * @param Space [in, optional] {@code Object}
     * @param Other [in, optional] {@code Object}
     * @param OtherChar [in, optional] {@code Object}
     * @param FieldInfo [in, optional] {@code Object}
     * @param DecimalSeparator [in, optional] {@code Object}
     * @param ThousandsSeparator [in, optional] {@code Object}
     * @param TrailingMinusNumbers [in, optional] {@code Object}
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
     * <p>vtableId(173)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Object getTop();
            
    /**
     * <p>id(0xf4)</p>
     * <p>vtableId(174)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0xf4)
    Object Ungroup();
            
    /**
     * <p>id(0x112)</p>
     * <p>vtableId(175)</p>
     */
    @ComProperty(name = "UseStandardHeight", dispId = 0x112)
    Object getUseStandardHeight();
            
    /**
     * <p>id(0x112)</p>
     * <p>vtableId(176)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "UseStandardHeight", dispId = 0x112)
    void setUseStandardHeight(Object param0);
            
    /**
     * <p>id(0x113)</p>
     * <p>vtableId(177)</p>
     */
    @ComProperty(name = "UseStandardWidth", dispId = 0x113)
    Object getUseStandardWidth();
            
    /**
     * <p>id(0x113)</p>
     * <p>vtableId(178)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "UseStandardWidth", dispId = 0x113)
    void setUseStandardWidth(Object param0);
            
    /**
     * <p>id(0x56b)</p>
     * <p>vtableId(179)</p>
     */
    @ComProperty(name = "Validation", dispId = 0x56b)
    Validation getValidation();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(180)</p>
     * @param RangeValueDataType [in, optional] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    Object getValue(Object RangeValueDataType);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(181)</p>
     * @param RangeValueDataType [in, optional] {@code Object}
     * @param param1 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(Object RangeValueDataType,
            Object param1);
            
    /**
     * <p>id(0x56c)</p>
     * <p>vtableId(182)</p>
     */
    @ComProperty(name = "Value2", dispId = 0x56c)
    Object getValue2();
            
    /**
     * <p>id(0x56c)</p>
     * <p>vtableId(183)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value2", dispId = 0x56c)
    void setValue2(Object param0);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(184)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    Object getVerticalAlignment();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(185)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    void setVerticalAlignment(Object param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(186)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Object getWidth();
            
    /**
     * <p>id(0x15c)</p>
     * <p>vtableId(187)</p>
     */
    @ComProperty(name = "Worksheet", dispId = 0x15c)
    Worksheet getWorksheet();
            
    /**
     * <p>id(0x114)</p>
     * <p>vtableId(188)</p>
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    Object getWrapText();
            
    /**
     * <p>id(0x114)</p>
     * <p>vtableId(189)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    void setWrapText(Object param0);
            
    /**
     * <p>id(0x56d)</p>
     * <p>vtableId(190)</p>
     * @param Text [in, optional] {@code Object}
     */
    @ComMethod(name = "AddComment", dispId = 0x56d)
    Comment AddComment(Object Text);
            
    /**
     * <p>id(0x38e)</p>
     * <p>vtableId(191)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    Comment getComment();
            
    /**
     * <p>id(0x56e)</p>
     * <p>vtableId(192)</p>
     */
    @ComMethod(name = "ClearComments", dispId = 0x56e)
    void ClearComments();
            
    /**
     * <p>id(0x56f)</p>
     * <p>vtableId(193)</p>
     */
    @ComProperty(name = "Phonetic", dispId = 0x56f)
    Phonetic getPhonetic();
            
    /**
     * <p>id(0x570)</p>
     * <p>vtableId(194)</p>
     */
    @ComProperty(name = "FormatConditions", dispId = 0x570)
    FormatConditions getFormatConditions();
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(195)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(196)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    void setReadingOrder(Integer param0);
            
    /**
     * <p>id(0x571)</p>
     * <p>vtableId(197)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x571)
    Hyperlinks getHyperlinks();
            
    /**
     * <p>id(0x713)</p>
     * <p>vtableId(198)</p>
     */
    @ComProperty(name = "Phonetics", dispId = 0x713)
    Phonetics getPhonetics();
            
    /**
     * <p>id(0x714)</p>
     * <p>vtableId(199)</p>
     */
    @ComMethod(name = "SetPhonetic", dispId = 0x714)
    void SetPhonetic();
            
    /**
     * <p>id(0x715)</p>
     * <p>vtableId(200)</p>
     */
    @ComProperty(name = "ID", dispId = 0x715)
    String getID();
            
    /**
     * <p>id(0x715)</p>
     * <p>vtableId(201)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ID", dispId = 0x715)
    void setID(String param0);
            
    /**
     * <p>id(0x6ec)</p>
     * <p>vtableId(202)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
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
     * <p>vtableId(203)</p>
     */
    @ComProperty(name = "PivotCell", dispId = 0x7dd)
    PivotCell getPivotCell();
            
    /**
     * <p>id(0x7de)</p>
     * <p>vtableId(204)</p>
     */
    @ComMethod(name = "Dirty", dispId = 0x7de)
    void Dirty();
            
    /**
     * <p>id(0x7df)</p>
     * <p>vtableId(205)</p>
     */
    @ComProperty(name = "Errors", dispId = 0x7df)
    Errors getErrors();
            
    /**
     * <p>id(0x7e0)</p>
     * <p>vtableId(206)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x7e0)
    SmartTags getSmartTags();
            
    /**
     * <p>id(0x7e1)</p>
     * <p>vtableId(207)</p>
     * @param SpeakDirection [in, optional] {@code Object}
     * @param SpeakFormulas [in, optional] {@code Object}
     */
    @ComMethod(name = "Speak", dispId = 0x7e1)
    void Speak(Object SpeakDirection,
            Object SpeakFormulas);
            
    /**
     * <p>id(0x788)</p>
     * <p>vtableId(208)</p>
     * @param Paste [in, optional] {@code XlPasteType}
     * @param Operation [in, optional] {@code XlPasteSpecialOperation}
     * @param SkipBlanks [in, optional] {@code Object}
     * @param Transpose [in, optional] {@code Object}
     */
    @ComMethod(name = "PasteSpecial", dispId = 0x788)
    Object PasteSpecial(XlPasteType Paste,
            XlPasteSpecialOperation Operation,
            Object SkipBlanks,
            Object Transpose);
            
    /**
     * <p>id(0x7e4)</p>
     * <p>vtableId(209)</p>
     */
    @ComProperty(name = "AllowEdit", dispId = 0x7e4)
    Boolean getAllowEdit();
            
    /**
     * <p>id(0x8d1)</p>
     * <p>vtableId(210)</p>
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    ListObject getListObject();
            
    /**
     * <p>id(0x8d2)</p>
     * <p>vtableId(211)</p>
     */
    @ComProperty(name = "XPath", dispId = 0x8d2)
    XPath getXPath();
            
    /**
     * <p>id(0x9bb)</p>
     * <p>vtableId(212)</p>
     */
    @ComProperty(name = "ServerActions", dispId = 0x9bb)
    Actions getServerActions();
            
    /**
     * <p>id(0x9bc)</p>
     * <p>vtableId(213)</p>
     * @param Columns [in, optional] {@code Object}
     * @param Header [in, optional] {@code XlYesNoGuess}
     */
    @ComMethod(name = "RemoveDuplicates", dispId = 0x9bc)
    void RemoveDuplicates(Object Columns,
            XlYesNoGuess Header);
            
    /**
     * <p>id(0x939)</p>
     * <p>vtableId(214)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
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
     * <p>vtableId(215)</p>
     */
    @ComProperty(name = "MDX", dispId = 0x84b)
    String getMDX();
            
    /**
     * <p>id(0x9bd)</p>
     * <p>vtableId(216)</p>
     * @param Type [in] {@code XlFixedFormatType}
     * @param Filename [in, optional] {@code Object}
     * @param Quality [in, optional] {@code Object}
     * @param IncludeDocProperties [in, optional] {@code Object}
     * @param IgnorePrintAreas [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param OpenAfterPublish [in, optional] {@code Object}
     * @param FixedFormatExtClassPtr [in, optional] {@code Object}
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
     * <p>vtableId(217)</p>
     */
    @ComProperty(name = "CountLarge", dispId = 0x9c3)
    Object getCountLarge();
            
    /**
     * <p>id(0x93c)</p>
     * <p>vtableId(218)</p>
     */
    @ComMethod(name = "CalculateRowMajorOrder", dispId = 0x93c)
    Object CalculateRowMajorOrder();
            
    /**
     * <p>id(0xb25)</p>
     * <p>vtableId(219)</p>
     */
    @ComProperty(name = "SparklineGroups", dispId = 0xb25)
    SparklineGroups getSparklineGroups();
            
    /**
     * <p>id(0xb26)</p>
     * <p>vtableId(220)</p>
     */
    @ComMethod(name = "ClearHyperlinks", dispId = 0xb26)
    void ClearHyperlinks();
            
    /**
     * <p>id(0x29a)</p>
     * <p>vtableId(221)</p>
     */
    @ComProperty(name = "DisplayFormat", dispId = 0x29a)
    DisplayFormat getDisplayFormat();
            
    /**
     * <p>id(0xad3)</p>
     * <p>vtableId(222)</p>
     * @param LineStyle [in, optional] {@code Object}
     * @param Weight [in, optional] {@code XlBorderWeight}
     * @param ColorIndex [in, optional] {@code XlColorIndex}
     * @param Color [in, optional] {@code Object}
     * @param ThemeColor [in, optional] {@code Object}
     */
    @ComMethod(name = "BorderAround", dispId = 0xad3)
    Object BorderAround(Object LineStyle,
            XlBorderWeight Weight,
            XlColorIndex ColorIndex,
            Object Color,
            Object ThemeColor);
            
    /**
     * <p>id(0xb27)</p>
     * <p>vtableId(223)</p>
     */
    @ComMethod(name = "AllocateChanges", dispId = 0xb27)
    void AllocateChanges();
            
    /**
     * <p>id(0xb28)</p>
     * <p>vtableId(224)</p>
     */
    @ComMethod(name = "DiscardChanges", dispId = 0xb28)
    void DiscardChanges();
            
    /**
     * <p>id(0xbb4)</p>
     * <p>vtableId(225)</p>
     */
    @ComMethod(name = "FlashFill", dispId = 0xbb4)
    void FlashFill();
            
    
}