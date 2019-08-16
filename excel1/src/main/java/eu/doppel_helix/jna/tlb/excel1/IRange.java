
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
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate(VARIANT RHS);
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    com.sun.jna.platform.win32.WinNT.HRESULT getAddIndent(VARIANT RHS);
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(12)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    com.sun.jna.platform.win32.WinNT.HRESULT setAddIndent(Object RHS);
            
    /**
     * <p>id(0xec)</p>
     * <p>vtableId(13)</p>
     * @param RowAbsolute [in, optional] {@code Object}
     * @param ColumnAbsolute [in, optional] {@code Object}
     * @param ReferenceStyle [in, optional] {@code XlReferenceStyle}
     * @param External [in, optional] {@code Object}
     * @param RelativeTo [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code String}
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
     * <p>vtableId(14)</p>
     * @param RowAbsolute [in, optional] {@code Object}
     * @param ColumnAbsolute [in, optional] {@code Object}
     * @param ReferenceStyle [in, optional] {@code XlReferenceStyle}
     * @param External [in, optional] {@code Object}
     * @param RelativeTo [in, optional] {@code Object}
     * @param RHS [out] {@code String}
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
     * <p>vtableId(15)</p>
     * @param Action [in] {@code XlFilterAction}
     * @param CriteriaRange [in, optional] {@code Object}
     * @param CopyToRange [in, optional] {@code Object}
     * @param Unique [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "AdvancedFilter", dispId = 0x36c)
    com.sun.jna.platform.win32.WinNT.HRESULT AdvancedFilter(XlFilterAction Action,
            Object CriteriaRange,
            Object CopyToRange,
            Object Unique,
            VARIANT RHS);
            
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
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ApplyOutlineStyles", dispId = 0x1c0)
    com.sun.jna.platform.win32.WinNT.HRESULT ApplyOutlineStyles(VARIANT RHS);
            
    /**
     * <p>id(0x238)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Areas}
     */
    @ComProperty(name = "Areas", dispId = 0x238)
    com.sun.jna.platform.win32.WinNT.HRESULT getAreas(VARIANT RHS);
            
    /**
     * <p>id(0x4a1)</p>
     * <p>vtableId(19)</p>
     * @param String [in] {@code String}
     * @param RHS [out] {@code String}
     */
    @ComMethod(name = "AutoComplete", dispId = 0x4a1)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoComplete(String String,
            VARIANT RHS);
            
    /**
     * <p>id(0x1c1)</p>
     * <p>vtableId(20)</p>
     * @param Destination [in] {@code Range}
     * @param Type [in, optional] {@code XlAutoFillType}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "AutoFill", dispId = 0x1c1)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoFill(Range Destination,
            XlAutoFillType Type,
            VARIANT RHS);
            
    /**
     * <p>id(0x319)</p>
     * <p>vtableId(21)</p>
     * @param Field [in, optional] {@code Object}
     * @param Criteria1 [in, optional] {@code Object}
     * @param Operator [in, optional] {@code XlAutoFilterOperator}
     * @param Criteria2 [in, optional] {@code Object}
     * @param VisibleDropDown [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "AutoFit", dispId = 0xed)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoFit(VARIANT RHS);
            
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
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "AutoOutline", dispId = 0x40c)
    com.sun.jna.platform.win32.WinNT.HRESULT AutoOutline(VARIANT RHS);
            
    /**
     * <p>id(0x42b)</p>
     * <p>vtableId(25)</p>
     * @param LineStyle [in, optional] {@code Object}
     * @param Weight [in, optional] {@code XlBorderWeight}
     * @param ColorIndex [in, optional] {@code XlColorIndex}
     * @param Color [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "_BorderAround", dispId = 0x42b)
    com.sun.jna.platform.win32.WinNT.HRESULT _BorderAround(Object LineStyle,
            XlBorderWeight Weight,
            XlColorIndex ColorIndex,
            Object Color,
            VARIANT RHS);
            
    /**
     * <p>id(0x1b3)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorders(VARIANT RHS);
            
    /**
     * <p>id(0x117)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Calculate", dispId = 0x117)
    com.sun.jna.platform.win32.WinNT.HRESULT Calculate(VARIANT RHS);
            
    /**
     * <p>id(0xee)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Cells", dispId = 0xee)
    com.sun.jna.platform.win32.WinNT.HRESULT getCells(VARIANT RHS);
            
    /**
     * <p>id(0x25b)</p>
     * <p>vtableId(29)</p>
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     * @param RHS [out] {@code Characters}
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCharacters(Object Start,
            Object Length,
            VARIANT RHS);
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(30)</p>
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param AlwaysSuggest [in, optional] {@code Object}
     * @param SpellLang [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    com.sun.jna.platform.win32.WinNT.HRESULT CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang,
            VARIANT RHS);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Clear", dispId = 0x6f)
    com.sun.jna.platform.win32.WinNT.HRESULT Clear(VARIANT RHS);
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ClearContents", dispId = 0x71)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearContents(VARIANT RHS);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(33)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearFormats(VARIANT RHS);
            
    /**
     * <p>id(0xef)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ClearNotes", dispId = 0xef)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearNotes(VARIANT RHS);
            
    /**
     * <p>id(0x40d)</p>
     * <p>vtableId(35)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ClearOutline", dispId = 0x40d)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearOutline(VARIANT RHS);
            
    /**
     * <p>id(0xf0)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Column", dispId = 0xf0)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumn(VARIANT RHS);
            
    /**
     * <p>id(0x1fe)</p>
     * <p>vtableId(37)</p>
     * @param Comparison [in] {@code Object}
     * @param RHS [out] {@code Range}
     */
    @ComMethod(name = "ColumnDifferences", dispId = 0x1fe)
    com.sun.jna.platform.win32.WinNT.HRESULT ColumnDifferences(Object Comparison,
            VARIANT RHS);
            
    /**
     * <p>id(0xf1)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Columns", dispId = 0xf1)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumns(VARIANT RHS);
            
    /**
     * <p>id(0xf2)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    com.sun.jna.platform.win32.WinNT.HRESULT getColumnWidth(VARIANT RHS);
            
    /**
     * <p>id(0xf2)</p>
     * <p>vtableId(40)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    com.sun.jna.platform.win32.WinNT.HRESULT setColumnWidth(Object RHS);
            
    /**
     * <p>id(0x1e2)</p>
     * <p>vtableId(41)</p>
     * @param Sources [in, optional] {@code Object}
     * @param Function [in, optional] {@code Object}
     * @param TopRow [in, optional] {@code Object}
     * @param LeftColumn [in, optional] {@code Object}
     * @param CreateLinks [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(42)</p>
     * @param Destination [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(Object Destination,
            VARIANT RHS);
            
    /**
     * <p>id(0x480)</p>
     * <p>vtableId(43)</p>
     * @param Data [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param MaxRows [in, optional] {@code Object}
     * @param MaxColumns [in, optional] {@code Object}
     * @param RHS [out] {@code Integer}
     */
    @ComMethod(name = "CopyFromRecordset", dispId = 0x480)
    com.sun.jna.platform.win32.WinNT.HRESULT CopyFromRecordset(com.sun.jna.platform.win32.COM.util.IUnknown Data,
            Object MaxRows,
            Object MaxColumns,
            VARIANT RHS);
            
    /**
     * <p>id(0xd5)</p>
     * <p>vtableId(44)</p>
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param Format [in, optional] {@code XlCopyPictureFormat}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    com.sun.jna.platform.win32.WinNT.HRESULT CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format,
            VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(45)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(46)</p>
     * @param Top [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Bottom [in, optional] {@code Object}
     * @param Right [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "CreateNames", dispId = 0x1c9)
    com.sun.jna.platform.win32.WinNT.HRESULT CreateNames(Object Top,
            Object Left,
            Object Bottom,
            Object Right,
            VARIANT RHS);
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(47)</p>
     * @param Edition [in, optional] {@code Object}
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param ContainsPICT [in, optional] {@code Object}
     * @param ContainsBIFF [in, optional] {@code Object}
     * @param ContainsRTF [in, optional] {@code Object}
     * @param ContainsVALU [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "CurrentArray", dispId = 0x1f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getCurrentArray(VARIANT RHS);
            
    /**
     * <p>id(0xf3)</p>
     * <p>vtableId(49)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "CurrentRegion", dispId = 0xf3)
    com.sun.jna.platform.win32.WinNT.HRESULT getCurrentRegion(VARIANT RHS);
            
    /**
     * <p>id(0x235)</p>
     * <p>vtableId(50)</p>
     * @param Destination [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    com.sun.jna.platform.win32.WinNT.HRESULT Cut(Object Destination,
            VARIANT RHS);
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(51)</p>
     * @param Rowcol [in, optional] {@code Object}
     * @param Type [in, optional] {@code XlDataSeriesType}
     * @param Date [in, optional] {@code XlDataSeriesDate}
     * @param Step [in, optional] {@code Object}
     * @param Stop [in, optional] {@code Object}
     * @param Trend [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(52)</p>
     * @param RowIndex [in, optional] {@code Object}
     * @param ColumnIndex [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Object RowIndex,
            Object ColumnIndex,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(53)</p>
     * @param RowIndex [in, optional] {@code Object}
     * @param ColumnIndex [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT set_Default(Object RowIndex,
            Object ColumnIndex,
            Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(54)</p>
     * @param Shift [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(Object Shift,
            VARIANT RHS);
            
    /**
     * <p>id(0x21f)</p>
     * <p>vtableId(55)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Dependents", dispId = 0x21f)
    com.sun.jna.platform.win32.WinNT.HRESULT getDependents(VARIANT RHS);
            
    /**
     * <p>id(0xf5)</p>
     * <p>vtableId(56)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "DialogBox", dispId = 0xf5)
    com.sun.jna.platform.win32.WinNT.HRESULT DialogBox(VARIANT RHS);
            
    /**
     * <p>id(0x221)</p>
     * <p>vtableId(57)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "DirectDependents", dispId = 0x221)
    com.sun.jna.platform.win32.WinNT.HRESULT getDirectDependents(VARIANT RHS);
            
    /**
     * <p>id(0x222)</p>
     * <p>vtableId(58)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "DirectPrecedents", dispId = 0x222)
    com.sun.jna.platform.win32.WinNT.HRESULT getDirectPrecedents(VARIANT RHS);
            
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
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(60)</p>
     * @param Direction [in] {@code XlDirection}
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "End", dispId = 0x1f4)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnd(XlDirection Direction,
            VARIANT RHS);
            
    /**
     * <p>id(0xf6)</p>
     * <p>vtableId(61)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "EntireColumn", dispId = 0xf6)
    com.sun.jna.platform.win32.WinNT.HRESULT getEntireColumn(VARIANT RHS);
            
    /**
     * <p>id(0xf7)</p>
     * <p>vtableId(62)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "EntireRow", dispId = 0xf7)
    com.sun.jna.platform.win32.WinNT.HRESULT getEntireRow(VARIANT RHS);
            
    /**
     * <p>id(0xf8)</p>
     * <p>vtableId(63)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "FillDown", dispId = 0xf8)
    com.sun.jna.platform.win32.WinNT.HRESULT FillDown(VARIANT RHS);
            
    /**
     * <p>id(0xf9)</p>
     * <p>vtableId(64)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "FillLeft", dispId = 0xf9)
    com.sun.jna.platform.win32.WinNT.HRESULT FillLeft(VARIANT RHS);
            
    /**
     * <p>id(0xfa)</p>
     * <p>vtableId(65)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "FillRight", dispId = 0xfa)
    com.sun.jna.platform.win32.WinNT.HRESULT FillRight(VARIANT RHS);
            
    /**
     * <p>id(0xfb)</p>
     * <p>vtableId(66)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "FillUp", dispId = 0xfb)
    com.sun.jna.platform.win32.WinNT.HRESULT FillUp(VARIANT RHS);
            
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
     * @param RHS [out] {@code Range}
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
     * <p>vtableId(68)</p>
     * @param After [in, optional] {@code Object}
     * @param RHS [out] {@code Range}
     */
    @ComMethod(name = "FindNext", dispId = 0x18f)
    com.sun.jna.platform.win32.WinNT.HRESULT FindNext(Object After,
            VARIANT RHS);
            
    /**
     * <p>id(0x190)</p>
     * <p>vtableId(69)</p>
     * @param After [in, optional] {@code Object}
     * @param RHS [out] {@code Range}
     */
    @ComMethod(name = "FindPrevious", dispId = 0x190)
    com.sun.jna.platform.win32.WinNT.HRESULT FindPrevious(Object After,
            VARIANT RHS);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(70)</p>
     * @param RHS [out] {@code Font}
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(71)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(72)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormula(Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x24a)</p>
     * <p>vtableId(73)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "FormulaArray", dispId = 0x24a)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaArray(VARIANT RHS);
            
    /**
     * <p>id(0x24a)</p>
     * <p>vtableId(74)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "FormulaArray", dispId = 0x24a)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaArray(Object RHS);
            
    /**
     * <p>id(0x564)</p>
     * <p>vtableId(75)</p>
     * @param RHS [out] {@code XlFormulaLabel}
     */
    @ComProperty(name = "FormulaLabel", dispId = 0x564)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaLabel(VARIANT RHS);
            
    /**
     * <p>id(0x564)</p>
     * <p>vtableId(76)</p>
     * @param RHS [in] {@code XlFormulaLabel}
     */
    @ComProperty(name = "FormulaLabel", dispId = 0x564)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaLabel(XlFormulaLabel RHS);
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(77)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaHidden(VARIANT RHS);
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(78)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaHidden(Object RHS);
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(79)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaLocal(VARIANT RHS);
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(80)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaLocal(Object RHS);
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(81)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaR1C1(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(82)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaR1C1(Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(83)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaR1C1Local(VARIANT RHS);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(84)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaR1C1Local(Object RHS);
            
    /**
     * <p>id(0x23b)</p>
     * <p>vtableId(85)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "FunctionWizard", dispId = 0x23b)
    com.sun.jna.platform.win32.WinNT.HRESULT FunctionWizard(VARIANT RHS);
            
    /**
     * <p>id(0x1d8)</p>
     * <p>vtableId(86)</p>
     * @param Goal [in] {@code Object}
     * @param ChangingCell [in] {@code Range}
     * @param RHS [out] {@code Boolean}
     */
    @ComMethod(name = "GoalSeek", dispId = 0x1d8)
    com.sun.jna.platform.win32.WinNT.HRESULT GoalSeek(Object Goal,
            Range ChangingCell,
            VARIANT RHS);
            
    /**
     * <p>id(0x2e)</p>
     * <p>vtableId(87)</p>
     * @param Start [in, optional] {@code Object}
     * @param End [in, optional] {@code Object}
     * @param By [in, optional] {@code Object}
     * @param Periods [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    com.sun.jna.platform.win32.WinNT.HRESULT Group(Object Start,
            Object End,
            Object By,
            Object Periods,
            VARIANT RHS);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(88)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "HasArray", dispId = 0x10a)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasArray(VARIANT RHS);
            
    /**
     * <p>id(0x10b)</p>
     * <p>vtableId(89)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "HasFormula", dispId = 0x10b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasFormula(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(90)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(91)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    com.sun.jna.platform.win32.WinNT.HRESULT getHidden(VARIANT RHS);
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(92)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    com.sun.jna.platform.win32.WinNT.HRESULT setHidden(Object RHS);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(93)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(94)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT setHorizontalAlignment(Object RHS);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(95)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndentLevel(VARIANT RHS);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(96)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    com.sun.jna.platform.win32.WinNT.HRESULT setIndentLevel(Object RHS);
            
    /**
     * <p>id(0x565)</p>
     * <p>vtableId(97)</p>
     * @param InsertAmount [in] {@code Integer}
     */
    @ComMethod(name = "InsertIndent", dispId = 0x565)
    com.sun.jna.platform.win32.WinNT.HRESULT InsertIndent(Integer InsertAmount);
            
    /**
     * <p>id(0xfc)</p>
     * <p>vtableId(98)</p>
     * @param Shift [in, optional] {@code Object}
     * @param CopyOrigin [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Insert", dispId = 0xfc)
    com.sun.jna.platform.win32.WinNT.HRESULT Insert(Object Shift,
            Object CopyOrigin,
            VARIANT RHS);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(99)</p>
     * @param RHS [out] {@code Interior}
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(100)</p>
     * @param RowIndex [in] {@code Object}
     * @param ColumnIndex [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getItem(Object RowIndex,
            Object ColumnIndex,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(101)</p>
     * @param RowIndex [in] {@code Object}
     * @param ColumnIndex [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT setItem(Object RowIndex,
            Object ColumnIndex,
            Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x1ef)</p>
     * <p>vtableId(102)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Justify", dispId = 0x1ef)
    com.sun.jna.platform.win32.WinNT.HRESULT Justify(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(103)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x4a3)</p>
     * <p>vtableId(104)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ListHeaderRows", dispId = 0x4a3)
    com.sun.jna.platform.win32.WinNT.HRESULT getListHeaderRows(VARIANT RHS);
            
    /**
     * <p>id(0xfd)</p>
     * <p>vtableId(105)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ListNames", dispId = 0xfd)
    com.sun.jna.platform.win32.WinNT.HRESULT ListNames(VARIANT RHS);
            
    /**
     * <p>id(0x2b3)</p>
     * <p>vtableId(106)</p>
     * @param RHS [out] {@code XlLocationInTable}
     */
    @ComProperty(name = "LocationInTable", dispId = 0x2b3)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocationInTable(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(107)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(108)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocked(Object RHS);
            
    /**
     * <p>id(0x234)</p>
     * <p>vtableId(109)</p>
     * @param Across [in, optional] {@code Object}
     */
    @ComMethod(name = "Merge", dispId = 0x234)
    com.sun.jna.platform.win32.WinNT.HRESULT Merge(Object Across);
            
    /**
     * <p>id(0x568)</p>
     * <p>vtableId(110)</p>
     */
    @ComMethod(name = "UnMerge", dispId = 0x568)
    com.sun.jna.platform.win32.WinNT.HRESULT UnMerge();
            
    /**
     * <p>id(0x569)</p>
     * <p>vtableId(111)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "MergeArea", dispId = 0x569)
    com.sun.jna.platform.win32.WinNT.HRESULT getMergeArea(VARIANT RHS);
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(112)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    com.sun.jna.platform.win32.WinNT.HRESULT getMergeCells(VARIANT RHS);
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(113)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    com.sun.jna.platform.win32.WinNT.HRESULT setMergeCells(Object RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(114)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(115)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(Object RHS);
            
    /**
     * <p>id(0x408)</p>
     * <p>vtableId(116)</p>
     * @param TowardPrecedent [in, optional] {@code Object}
     * @param ArrowNumber [in, optional] {@code Object}
     * @param LinkNumber [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "NavigateArrow", dispId = 0x408)
    com.sun.jna.platform.win32.WinNT.HRESULT NavigateArrow(Object TowardPrecedent,
            Object ArrowNumber,
            Object LinkNumber,
            VARIANT RHS);
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(118)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Next", dispId = 0x1f6)
    com.sun.jna.platform.win32.WinNT.HRESULT getNext(VARIANT RHS);
            
    /**
     * <p>id(0x467)</p>
     * <p>vtableId(119)</p>
     * @param Text [in, optional] {@code Object}
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     * @param RHS [out] {@code String}
     */
    @ComMethod(name = "NoteText", dispId = 0x467)
    com.sun.jna.platform.win32.WinNT.HRESULT NoteText(Object Text,
            Object Start,
            Object Length,
            VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(120)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(121)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormat(Object RHS);
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(122)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormatLocal(VARIANT RHS);
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(123)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormatLocal(Object RHS);
            
    /**
     * <p>id(0xfe)</p>
     * <p>vtableId(124)</p>
     * @param RowOffset [in, optional] {@code Object}
     * @param ColumnOffset [in, optional] {@code Object}
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Offset", dispId = 0xfe)
    com.sun.jna.platform.win32.WinNT.HRESULT getOffset(Object RowOffset,
            Object ColumnOffset,
            VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(125)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(126)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(Object RHS);
            
    /**
     * <p>id(0x10f)</p>
     * <p>vtableId(127)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "OutlineLevel", dispId = 0x10f)
    com.sun.jna.platform.win32.WinNT.HRESULT getOutlineLevel(VARIANT RHS);
            
    /**
     * <p>id(0x10f)</p>
     * <p>vtableId(128)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "OutlineLevel", dispId = 0x10f)
    com.sun.jna.platform.win32.WinNT.HRESULT setOutlineLevel(Object RHS);
            
    /**
     * <p>id(0xff)</p>
     * <p>vtableId(129)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "PageBreak", dispId = 0xff)
    com.sun.jna.platform.win32.WinNT.HRESULT getPageBreak(VARIANT RHS);
            
    /**
     * <p>id(0xff)</p>
     * <p>vtableId(130)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "PageBreak", dispId = 0xff)
    com.sun.jna.platform.win32.WinNT.HRESULT setPageBreak(Integer RHS);
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(131)</p>
     * @param ParseLine [in, optional] {@code Object}
     * @param Destination [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Parse", dispId = 0x1dd)
    com.sun.jna.platform.win32.WinNT.HRESULT Parse(Object ParseLine,
            Object Destination,
            VARIANT RHS);
            
    /**
     * <p>id(0x403)</p>
     * <p>vtableId(132)</p>
     * @param Paste [in, optional] {@code XlPasteType}
     * @param Operation [in, optional] {@code XlPasteSpecialOperation}
     * @param SkipBlanks [in, optional] {@code Object}
     * @param Transpose [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "_PasteSpecial", dispId = 0x403)
    com.sun.jna.platform.win32.WinNT.HRESULT _PasteSpecial(XlPasteType Paste,
            XlPasteSpecialOperation Operation,
            Object SkipBlanks,
            Object Transpose,
            VARIANT RHS);
            
    /**
     * <p>id(0x2db)</p>
     * <p>vtableId(133)</p>
     * @param RHS [out] {@code PivotField}
     */
    @ComProperty(name = "PivotField", dispId = 0x2db)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotField(VARIANT RHS);
            
    /**
     * <p>id(0x2e4)</p>
     * <p>vtableId(134)</p>
     * @param RHS [out] {@code PivotItem}
     */
    @ComProperty(name = "PivotItem", dispId = 0x2e4)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotItem(VARIANT RHS);
            
    /**
     * <p>id(0x2cc)</p>
     * <p>vtableId(135)</p>
     * @param RHS [out] {@code PivotTable}
     */
    @ComProperty(name = "PivotTable", dispId = 0x2cc)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotTable(VARIANT RHS);
            
    /**
     * <p>id(0x220)</p>
     * <p>vtableId(136)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Precedents", dispId = 0x220)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrecedents(VARIANT RHS);
            
    /**
     * <p>id(0x1f8)</p>
     * <p>vtableId(137)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "PrefixCharacter", dispId = 0x1f8)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrefixCharacter(VARIANT RHS);
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(138)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Previous", dispId = 0x1f7)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrevious(VARIANT RHS);
            
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
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(140)</p>
     * @param EnableChanges [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    com.sun.jna.platform.win32.WinNT.HRESULT PrintPreview(Object EnableChanges,
            VARIANT RHS);
            
    /**
     * <p>id(0x56a)</p>
     * <p>vtableId(141)</p>
     * @param RHS [out] {@code QueryTable}
     */
    @ComProperty(name = "QueryTable", dispId = 0x56a)
    com.sun.jna.platform.win32.WinNT.HRESULT getQueryTable(VARIANT RHS);
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(142)</p>
     * @param Cell1 [in] {@code Object}
     * @param Cell2 [in, optional] {@code Object}
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(Object Cell1,
            Object Cell2,
            VARIANT RHS);
            
    /**
     * <p>id(0x373)</p>
     * <p>vtableId(143)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "RemoveSubtotal", dispId = 0x373)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveSubtotal(VARIANT RHS);
            
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
     * @param RHS [out] {@code Boolean}
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
     * <p>vtableId(145)</p>
     * @param RowSize [in, optional] {@code Object}
     * @param ColumnSize [in, optional] {@code Object}
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Resize", dispId = 0x100)
    com.sun.jna.platform.win32.WinNT.HRESULT getResize(Object RowSize,
            Object ColumnSize,
            VARIANT RHS);
            
    /**
     * <p>id(0x101)</p>
     * <p>vtableId(146)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Row", dispId = 0x101)
    com.sun.jna.platform.win32.WinNT.HRESULT getRow(VARIANT RHS);
            
    /**
     * <p>id(0x1ff)</p>
     * <p>vtableId(147)</p>
     * @param Comparison [in] {@code Object}
     * @param RHS [out] {@code Range}
     */
    @ComMethod(name = "RowDifferences", dispId = 0x1ff)
    com.sun.jna.platform.win32.WinNT.HRESULT RowDifferences(Object Comparison,
            VARIANT RHS);
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(148)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowHeight(VARIANT RHS);
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(149)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    com.sun.jna.platform.win32.WinNT.HRESULT setRowHeight(Object RHS);
            
    /**
     * <p>id(0x102)</p>
     * <p>vtableId(150)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Rows", dispId = 0x102)
    com.sun.jna.platform.win32.WinNT.HRESULT getRows(VARIANT RHS);
            
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
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(152)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(153)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Show", dispId = 0x1f0)
    com.sun.jna.platform.win32.WinNT.HRESULT Show(VARIANT RHS);
            
    /**
     * <p>id(0x36d)</p>
     * <p>vtableId(154)</p>
     * @param Remove [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ShowDependents", dispId = 0x36d)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowDependents(Object Remove,
            VARIANT RHS);
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(155)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowDetail(VARIANT RHS);
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(156)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowDetail(Object RHS);
            
    /**
     * <p>id(0x36e)</p>
     * <p>vtableId(157)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ShowErrors", dispId = 0x36e)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowErrors(VARIANT RHS);
            
    /**
     * <p>id(0x36f)</p>
     * <p>vtableId(158)</p>
     * @param Remove [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ShowPrecedents", dispId = 0x36f)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowPrecedents(Object Remove,
            VARIANT RHS);
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(159)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    com.sun.jna.platform.win32.WinNT.HRESULT getShrinkToFit(VARIANT RHS);
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(160)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    com.sun.jna.platform.win32.WinNT.HRESULT setShrinkToFit(Object RHS);
            
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
     * @param RHS [out] {@code Object}
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
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(163)</p>
     * @param RHS [out] {@code SoundNote}
     */
    @ComProperty(name = "SoundNote", dispId = 0x394)
    com.sun.jna.platform.win32.WinNT.HRESULT getSoundNote(VARIANT RHS);
            
    /**
     * <p>id(0x19a)</p>
     * <p>vtableId(164)</p>
     * @param Type [in] {@code XlCellType}
     * @param Value [in, optional] {@code Object}
     * @param RHS [out] {@code Range}
     */
    @ComMethod(name = "SpecialCells", dispId = 0x19a)
    com.sun.jna.platform.win32.WinNT.HRESULT SpecialCells(XlCellType Type,
            Object Value,
            VARIANT RHS);
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(165)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0x104)
    com.sun.jna.platform.win32.WinNT.HRESULT getStyle(VARIANT RHS);
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(166)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0x104)
    com.sun.jna.platform.win32.WinNT.HRESULT setStyle(Object RHS);
            
    /**
     * <p>id(0x1e1)</p>
     * <p>vtableId(167)</p>
     * @param Edition [in] {@code String}
     * @param Format [in, optional] {@code XlSubscribeToFormat}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "SubscribeTo", dispId = 0x1e1)
    com.sun.jna.platform.win32.WinNT.HRESULT SubscribeTo(String Edition,
            XlSubscribeToFormat Format,
            VARIANT RHS);
            
    /**
     * <p>id(0x372)</p>
     * <p>vtableId(168)</p>
     * @param GroupBy [in] {@code Integer}
     * @param Function [in] {@code XlConsolidationFunction}
     * @param TotalList [in] {@code Object}
     * @param Replace [in, optional] {@code Object}
     * @param PageBreaks [in, optional] {@code Object}
     * @param SummaryBelowData [in, optional] {@code XlSummaryRow}
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(169)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Summary", dispId = 0x111)
    com.sun.jna.platform.win32.WinNT.HRESULT getSummary(VARIANT RHS);
            
    /**
     * <p>id(0x1f1)</p>
     * <p>vtableId(170)</p>
     * @param RowInput [in, optional] {@code Object}
     * @param ColumnInput [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Table", dispId = 0x1f1)
    com.sun.jna.platform.win32.WinNT.HRESULT Table(Object RowInput,
            Object ColumnInput,
            VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(171)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getText(VARIANT RHS);
            
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
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(173)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0xf4)</p>
     * <p>vtableId(174)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Ungroup", dispId = 0xf4)
    com.sun.jna.platform.win32.WinNT.HRESULT Ungroup(VARIANT RHS);
            
    /**
     * <p>id(0x112)</p>
     * <p>vtableId(175)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "UseStandardHeight", dispId = 0x112)
    com.sun.jna.platform.win32.WinNT.HRESULT getUseStandardHeight(VARIANT RHS);
            
    /**
     * <p>id(0x112)</p>
     * <p>vtableId(176)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "UseStandardHeight", dispId = 0x112)
    com.sun.jna.platform.win32.WinNT.HRESULT setUseStandardHeight(Object RHS);
            
    /**
     * <p>id(0x113)</p>
     * <p>vtableId(177)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "UseStandardWidth", dispId = 0x113)
    com.sun.jna.platform.win32.WinNT.HRESULT getUseStandardWidth(VARIANT RHS);
            
    /**
     * <p>id(0x113)</p>
     * <p>vtableId(178)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "UseStandardWidth", dispId = 0x113)
    com.sun.jna.platform.win32.WinNT.HRESULT setUseStandardWidth(Object RHS);
            
    /**
     * <p>id(0x56b)</p>
     * <p>vtableId(179)</p>
     * @param RHS [out] {@code Validation}
     */
    @ComProperty(name = "Validation", dispId = 0x56b)
    com.sun.jna.platform.win32.WinNT.HRESULT getValidation(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(180)</p>
     * @param RangeValueDataType [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(Object RangeValueDataType,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(181)</p>
     * @param RangeValueDataType [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(Object RangeValueDataType,
            Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x56c)</p>
     * <p>vtableId(182)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Value2", dispId = 0x56c)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue2(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x56c)</p>
     * <p>vtableId(183)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Value2", dispId = 0x56c)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue2(Integer lcid,
            Object RHS);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(184)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(185)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT setVerticalAlignment(Object RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(186)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x15c)</p>
     * <p>vtableId(187)</p>
     * @param RHS [out] {@code Worksheet}
     */
    @ComProperty(name = "Worksheet", dispId = 0x15c)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorksheet(VARIANT RHS);
            
    /**
     * <p>id(0x114)</p>
     * <p>vtableId(188)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    com.sun.jna.platform.win32.WinNT.HRESULT getWrapText(VARIANT RHS);
            
    /**
     * <p>id(0x114)</p>
     * <p>vtableId(189)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    com.sun.jna.platform.win32.WinNT.HRESULT setWrapText(Object RHS);
            
    /**
     * <p>id(0x56d)</p>
     * <p>vtableId(190)</p>
     * @param Text [in, optional] {@code Object}
     * @param RHS [out] {@code Comment}
     */
    @ComMethod(name = "AddComment", dispId = 0x56d)
    com.sun.jna.platform.win32.WinNT.HRESULT AddComment(Object Text,
            VARIANT RHS);
            
    /**
     * <p>id(0x38e)</p>
     * <p>vtableId(191)</p>
     * @param RHS [out] {@code Comment}
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    com.sun.jna.platform.win32.WinNT.HRESULT getComment(VARIANT RHS);
            
    /**
     * <p>id(0x56e)</p>
     * <p>vtableId(192)</p>
     */
    @ComMethod(name = "ClearComments", dispId = 0x56e)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearComments();
            
    /**
     * <p>id(0x56f)</p>
     * <p>vtableId(193)</p>
     * @param RHS [out] {@code Phonetic}
     */
    @ComProperty(name = "Phonetic", dispId = 0x56f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPhonetic(VARIANT RHS);
            
    /**
     * <p>id(0x570)</p>
     * <p>vtableId(194)</p>
     * @param RHS [out] {@code FormatConditions}
     */
    @ComProperty(name = "FormatConditions", dispId = 0x570)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormatConditions(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(195)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadingOrder(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(196)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT setReadingOrder(Integer RHS);
            
    /**
     * <p>id(0x571)</p>
     * <p>vtableId(197)</p>
     * @param RHS [out] {@code Hyperlinks}
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x571)
    com.sun.jna.platform.win32.WinNT.HRESULT getHyperlinks(VARIANT RHS);
            
    /**
     * <p>id(0x713)</p>
     * <p>vtableId(198)</p>
     * @param RHS [out] {@code Phonetics}
     */
    @ComProperty(name = "Phonetics", dispId = 0x713)
    com.sun.jna.platform.win32.WinNT.HRESULT getPhonetics(VARIANT RHS);
            
    /**
     * <p>id(0x714)</p>
     * <p>vtableId(199)</p>
     */
    @ComMethod(name = "SetPhonetic", dispId = 0x714)
    com.sun.jna.platform.win32.WinNT.HRESULT SetPhonetic();
            
    /**
     * <p>id(0x715)</p>
     * <p>vtableId(200)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ID", dispId = 0x715)
    com.sun.jna.platform.win32.WinNT.HRESULT getID(VARIANT RHS);
            
    /**
     * <p>id(0x715)</p>
     * <p>vtableId(201)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "ID", dispId = 0x715)
    com.sun.jna.platform.win32.WinNT.HRESULT setID(String RHS);
            
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
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(203)</p>
     * @param RHS [out] {@code PivotCell}
     */
    @ComProperty(name = "PivotCell", dispId = 0x7dd)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotCell(VARIANT RHS);
            
    /**
     * <p>id(0x7de)</p>
     * <p>vtableId(204)</p>
     */
    @ComMethod(name = "Dirty", dispId = 0x7de)
    com.sun.jna.platform.win32.WinNT.HRESULT Dirty();
            
    /**
     * <p>id(0x7df)</p>
     * <p>vtableId(205)</p>
     * @param RHS [out] {@code Errors}
     */
    @ComProperty(name = "Errors", dispId = 0x7df)
    com.sun.jna.platform.win32.WinNT.HRESULT getErrors(VARIANT RHS);
            
    /**
     * <p>id(0x7e0)</p>
     * <p>vtableId(206)</p>
     * @param RHS [out] {@code SmartTags}
     */
    @ComProperty(name = "SmartTags", dispId = 0x7e0)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmartTags(VARIANT RHS);
            
    /**
     * <p>id(0x7e1)</p>
     * <p>vtableId(207)</p>
     * @param SpeakDirection [in, optional] {@code Object}
     * @param SpeakFormulas [in, optional] {@code Object}
     */
    @ComMethod(name = "Speak", dispId = 0x7e1)
    com.sun.jna.platform.win32.WinNT.HRESULT Speak(Object SpeakDirection,
            Object SpeakFormulas);
            
    /**
     * <p>id(0x788)</p>
     * <p>vtableId(208)</p>
     * @param Paste [in, optional] {@code XlPasteType}
     * @param Operation [in, optional] {@code XlPasteSpecialOperation}
     * @param SkipBlanks [in, optional] {@code Object}
     * @param Transpose [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "PasteSpecial", dispId = 0x788)
    com.sun.jna.platform.win32.WinNT.HRESULT PasteSpecial(XlPasteType Paste,
            XlPasteSpecialOperation Operation,
            Object SkipBlanks,
            Object Transpose,
            VARIANT RHS);
            
    /**
     * <p>id(0x7e4)</p>
     * <p>vtableId(209)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowEdit", dispId = 0x7e4)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowEdit(VARIANT RHS);
            
    /**
     * <p>id(0x8d1)</p>
     * <p>vtableId(210)</p>
     * @param RHS [out] {@code ListObject}
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getListObject(VARIANT RHS);
            
    /**
     * <p>id(0x8d2)</p>
     * <p>vtableId(211)</p>
     * @param RHS [out] {@code XPath}
     */
    @ComProperty(name = "XPath", dispId = 0x8d2)
    com.sun.jna.platform.win32.WinNT.HRESULT getXPath(VARIANT RHS);
            
    /**
     * <p>id(0x9bb)</p>
     * <p>vtableId(212)</p>
     * @param RHS [out] {@code Actions}
     */
    @ComProperty(name = "ServerActions", dispId = 0x9bb)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerActions(VARIANT RHS);
            
    /**
     * <p>id(0x9bc)</p>
     * <p>vtableId(213)</p>
     * @param Columns [in, optional] {@code Object}
     * @param Header [in, optional] {@code XlYesNoGuess}
     */
    @ComMethod(name = "RemoveDuplicates", dispId = 0x9bc)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveDuplicates(Object Columns,
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
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(215)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "MDX", dispId = 0x84b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMDX(VARIANT RHS);
            
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
     * <p>vtableId(217)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "CountLarge", dispId = 0x9c3)
    com.sun.jna.platform.win32.WinNT.HRESULT getCountLarge(VARIANT RHS);
            
    /**
     * <p>id(0x93c)</p>
     * <p>vtableId(218)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "CalculateRowMajorOrder", dispId = 0x93c)
    com.sun.jna.platform.win32.WinNT.HRESULT CalculateRowMajorOrder(VARIANT RHS);
            
    /**
     * <p>id(0xb25)</p>
     * <p>vtableId(219)</p>
     * @param RHS [out] {@code SparklineGroups}
     */
    @ComProperty(name = "SparklineGroups", dispId = 0xb25)
    com.sun.jna.platform.win32.WinNT.HRESULT getSparklineGroups(VARIANT RHS);
            
    /**
     * <p>id(0xb26)</p>
     * <p>vtableId(220)</p>
     */
    @ComMethod(name = "ClearHyperlinks", dispId = 0xb26)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearHyperlinks();
            
    /**
     * <p>id(0x29a)</p>
     * <p>vtableId(221)</p>
     * @param RHS [out] {@code DisplayFormat}
     */
    @ComProperty(name = "DisplayFormat", dispId = 0x29a)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayFormat(VARIANT RHS);
            
    /**
     * <p>id(0xad3)</p>
     * <p>vtableId(222)</p>
     * @param LineStyle [in, optional] {@code Object}
     * @param Weight [in, optional] {@code XlBorderWeight}
     * @param ColorIndex [in, optional] {@code XlColorIndex}
     * @param Color [in, optional] {@code Object}
     * @param ThemeColor [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
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
     * <p>vtableId(223)</p>
     */
    @ComMethod(name = "AllocateChanges", dispId = 0xb27)
    com.sun.jna.platform.win32.WinNT.HRESULT AllocateChanges();
            
    /**
     * <p>id(0xb28)</p>
     * <p>vtableId(224)</p>
     */
    @ComMethod(name = "DiscardChanges", dispId = 0xb28)
    com.sun.jna.platform.win32.WinNT.HRESULT DiscardChanges();
            
    /**
     * <p>id(0xbb4)</p>
     * <p>vtableId(225)</p>
     */
    @ComMethod(name = "FlashFill", dispId = 0xbb4)
    com.sun.jna.platform.win32.WinNT.HRESULT FlashFill();
            
    
}