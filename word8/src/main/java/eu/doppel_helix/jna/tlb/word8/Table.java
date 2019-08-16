
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020951-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020951-0000-0000-C000-000000000046}")
public interface Table extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Range", dispId = 0x0)
    Range getRange();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
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
     * <p>id(0x64)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Columns", dispId = 0x64)
    Columns getColumns();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Rows", dispId = 0x65)
    Rows getRows();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x68)
    Shading getShading();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Uniform", dispId = 0x69)
    Boolean getUniform();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "AutoFormatType", dispId = 0x6a)
    Integer getAutoFormatType();
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Select", dispId = 0xc8)
    void Select();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x9)
    void Delete();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(20)</p>
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
     * @param CaseSensitive [in, optional] {@code Object}
     * @param LanguageID [in, optional] {@code Object}
     */
    @ComMethod(name = "SortOld", dispId = 0xa)
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
            Object CaseSensitive,
            Object LanguageID);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "SortAscending", dispId = 0xc)
    void SortAscending();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "SortDescending", dispId = 0xd)
    void SortDescending();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(23)</p>
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
    @ComMethod(name = "AutoFormat", dispId = 0xe)
    void AutoFormat(Object Format,
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
     * <p>id(0xf)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "UpdateAutoFormat", dispId = 0xf)
    void UpdateAutoFormat();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(25)</p>
     * @param Separator [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertToTextOld", dispId = 0x10)
    Range ConvertToTextOld(Object Separator);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(26)</p>
     * @param Row [in] {@code Integer}
     * @param Column [in] {@code Integer}
     */
    @ComMethod(name = "Cell", dispId = 0x11)
    Cell Cell(Integer Row,
            Integer Column);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(27)</p>
     * @param BeforeRow [in] {@code Object}
     */
    @ComMethod(name = "Split", dispId = 0x12)
    Table Split(Object BeforeRow);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(28)</p>
     * @param Separator [in, optional] {@code Object}
     * @param NestedTables [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertToText", dispId = 0x13)
    Range ConvertToText(Object Separator,
            Object NestedTables);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(29)</p>
     * @param Behavior [in] {@code WdAutoFitBehavior}
     */
    @ComMethod(name = "AutoFitBehavior", dispId = 0x14)
    void AutoFitBehavior(WdAutoFitBehavior Behavior);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(30)</p>
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
     * @param CaseSensitive [in, optional] {@code Object}
     * @param BidiSort [in, optional] {@code Object}
     * @param IgnoreThe [in, optional] {@code Object}
     * @param IgnoreKashida [in, optional] {@code Object}
     * @param IgnoreDiacritics [in, optional] {@code Object}
     * @param IgnoreHe [in, optional] {@code Object}
     * @param LanguageID [in, optional] {@code Object}
     */
    @ComMethod(name = "Sort", dispId = 0x17)
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
            Object CaseSensitive,
            Object BidiSort,
            Object IgnoreThe,
            Object IgnoreKashida,
            Object IgnoreDiacritics,
            Object IgnoreHe,
            Object LanguageID);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Tables", dispId = 0x6b)
    Tables getTables();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x6c)
    Integer getNestingLevel();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "AllowPageBreaks", dispId = 0x6d)
    Boolean getAllowPageBreaks();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowPageBreaks", dispId = 0x6d)
    void setAllowPageBreaks(Boolean param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "AllowAutoFit", dispId = 0x6e)
    Boolean getAllowAutoFit();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowAutoFit", dispId = 0x6e)
    void setAllowAutoFit(Boolean param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x6f)
    Float getPreferredWidth();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x6f)
    void setPreferredWidth(Float param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x70)
    WdPreferredWidthType getPreferredWidthType();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code WdPreferredWidthType}
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x70)
    void setPreferredWidthType(WdPreferredWidthType param0);
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x71)
    Float getTopPadding();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TopPadding", dispId = 0x71)
    void setTopPadding(Float param0);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x72)
    Float getBottomPadding();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BottomPadding", dispId = 0x72)
    void setBottomPadding(Float param0);
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x73)
    Float getLeftPadding();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LeftPadding", dispId = 0x73)
    void setLeftPadding(Float param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x74)
    Float getRightPadding();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "RightPadding", dispId = 0x74)
    void setRightPadding(Float param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "Spacing", dispId = 0x75)
    Float getSpacing();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Spacing", dispId = 0x75)
    void setSpacing(Float param0);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "TableDirection", dispId = 0x76)
    WdTableDirection getTableDirection();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code WdTableDirection}
     */
    @ComProperty(name = "TableDirection", dispId = 0x76)
    void setTableDirection(WdTableDirection param0);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "ID", dispId = 0x77)
    String getID();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ID", dispId = 0x77)
    void setID(String param0);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "Style", dispId = 0xc9)
    Object getStyle();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0xc9)
    void setStyle(Object param0);
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "ApplyStyleHeadingRows", dispId = 0xca)
    Boolean getApplyStyleHeadingRows();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyStyleHeadingRows", dispId = 0xca)
    void setApplyStyleHeadingRows(Boolean param0);
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "ApplyStyleLastRow", dispId = 0xcb)
    Boolean getApplyStyleLastRow();
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyStyleLastRow", dispId = 0xcb)
    void setApplyStyleLastRow(Boolean param0);
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "ApplyStyleFirstColumn", dispId = 0xcc)
    Boolean getApplyStyleFirstColumn();
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyStyleFirstColumn", dispId = 0xcc)
    void setApplyStyleFirstColumn(Boolean param0);
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "ApplyStyleLastColumn", dispId = 0xcd)
    Boolean getApplyStyleLastColumn();
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyStyleLastColumn", dispId = 0xcd)
    void setApplyStyleLastColumn(Boolean param0);
            
    /**
     * <p>id(0xce)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "ApplyStyleRowBands", dispId = 0xce)
    Boolean getApplyStyleRowBands();
            
    /**
     * <p>id(0xce)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyStyleRowBands", dispId = 0xce)
    void setApplyStyleRowBands(Boolean param0);
            
    /**
     * <p>id(0xcf)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "ApplyStyleColumnBands", dispId = 0xcf)
    Boolean getApplyStyleColumnBands();
            
    /**
     * <p>id(0xcf)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyStyleColumnBands", dispId = 0xcf)
    void setApplyStyleColumnBands(Boolean param0);
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(69)</p>
     * @param StyleName [in] {@code String}
     */
    @ComMethod(name = "ApplyStyleDirectFormatting", dispId = 0xd0)
    void ApplyStyleDirectFormatting(String StyleName);
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "Title", dispId = 0xd1)
    String getTitle();
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0xd1)
    void setTitle(String param0);
            
    /**
     * <p>id(0xd2)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "Descr", dispId = 0xd2)
    String getDescr();
            
    /**
     * <p>id(0xd2)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Descr", dispId = 0xd2)
    void setDescr(String param0);
            
    
}