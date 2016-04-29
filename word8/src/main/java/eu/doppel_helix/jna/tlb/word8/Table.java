
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020951-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020951-0000-0000-C000-000000000046}")
public interface Table {
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Range", dispId = 0x0)
    Range getRange();
            
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
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Columns", dispId = 0x64)
    Columns getColumns();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Rows", dispId = 0x65)
    Rows getRows();
            
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
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x68)
    Shading getShading();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Uniform", dispId = 0x69)
    Boolean getUniform();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "AutoFormatType", dispId = 0x6a)
    Integer getAutoFormatType();
            
    /**
     * <p>id(0xc8)</p>
     */
    @ComMethod(name = "Select", dispId = 0xc8)
    void Select();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x9)
    void Delete();
            
    /**
     * <p>id(0xa)</p>
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
     */
    @ComMethod(name = "SortAscending", dispId = 0xc)
    void SortAscending();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "SortDescending", dispId = 0xd)
    void SortDescending();
            
    /**
     * <p>id(0xe)</p>
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
     */
    @ComMethod(name = "UpdateAutoFormat", dispId = 0xf)
    void UpdateAutoFormat();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "ConvertToTextOld", dispId = 0x10)
    Range ConvertToTextOld(Object Separator);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComMethod(name = "Cell", dispId = 0x11)
    Cell Cell(Integer Row,
            Integer Column);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "Split", dispId = 0x12)
    Table Split(Object BeforeRow);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComMethod(name = "ConvertToText", dispId = 0x13)
    Range ConvertToText(Object Separator,
            Object NestedTables);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComMethod(name = "AutoFitBehavior", dispId = 0x14)
    void AutoFitBehavior(WdAutoFitBehavior Behavior);
            
    /**
     * <p>id(0x17)</p>
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
     */
    @ComProperty(name = "Tables", dispId = 0x6b)
    Tables getTables();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x6c)
    Integer getNestingLevel();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "AllowPageBreaks", dispId = 0x6d)
    Boolean getAllowPageBreaks();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "AllowPageBreaks", dispId = 0x6d)
    void setAllowPageBreaks(Boolean param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "AllowAutoFit", dispId = 0x6e)
    Boolean getAllowAutoFit();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "AllowAutoFit", dispId = 0x6e)
    void setAllowAutoFit(Boolean param0);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x6f)
    Float getPreferredWidth();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x6f)
    void setPreferredWidth(Float param0);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x70)
    WdPreferredWidthType getPreferredWidthType();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x70)
    void setPreferredWidthType(WdPreferredWidthType param0);
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x71)
    Float getTopPadding();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x71)
    void setTopPadding(Float param0);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x72)
    Float getBottomPadding();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x72)
    void setBottomPadding(Float param0);
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x73)
    Float getLeftPadding();
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x73)
    void setLeftPadding(Float param0);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x74)
    Float getRightPadding();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x74)
    void setRightPadding(Float param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "Spacing", dispId = 0x75)
    Float getSpacing();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "Spacing", dispId = 0x75)
    void setSpacing(Float param0);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "TableDirection", dispId = 0x76)
    WdTableDirection getTableDirection();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "TableDirection", dispId = 0x76)
    void setTableDirection(WdTableDirection param0);
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "ID", dispId = 0x77)
    String getID();
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "ID", dispId = 0x77)
    void setID(String param0);
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "Style", dispId = 0xc9)
    Object getStyle();
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "Style", dispId = 0xc9)
    void setStyle(Object param0);
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "ApplyStyleHeadingRows", dispId = 0xca)
    Boolean getApplyStyleHeadingRows();
            
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "ApplyStyleHeadingRows", dispId = 0xca)
    void setApplyStyleHeadingRows(Boolean param0);
            
    /**
     * <p>id(0xcb)</p>
     */
    @ComProperty(name = "ApplyStyleLastRow", dispId = 0xcb)
    Boolean getApplyStyleLastRow();
            
    /**
     * <p>id(0xcb)</p>
     */
    @ComProperty(name = "ApplyStyleLastRow", dispId = 0xcb)
    void setApplyStyleLastRow(Boolean param0);
            
    /**
     * <p>id(0xcc)</p>
     */
    @ComProperty(name = "ApplyStyleFirstColumn", dispId = 0xcc)
    Boolean getApplyStyleFirstColumn();
            
    /**
     * <p>id(0xcc)</p>
     */
    @ComProperty(name = "ApplyStyleFirstColumn", dispId = 0xcc)
    void setApplyStyleFirstColumn(Boolean param0);
            
    /**
     * <p>id(0xcd)</p>
     */
    @ComProperty(name = "ApplyStyleLastColumn", dispId = 0xcd)
    Boolean getApplyStyleLastColumn();
            
    /**
     * <p>id(0xcd)</p>
     */
    @ComProperty(name = "ApplyStyleLastColumn", dispId = 0xcd)
    void setApplyStyleLastColumn(Boolean param0);
            
    /**
     * <p>id(0xce)</p>
     */
    @ComProperty(name = "ApplyStyleRowBands", dispId = 0xce)
    Boolean getApplyStyleRowBands();
            
    /**
     * <p>id(0xce)</p>
     */
    @ComProperty(name = "ApplyStyleRowBands", dispId = 0xce)
    void setApplyStyleRowBands(Boolean param0);
            
    /**
     * <p>id(0xcf)</p>
     */
    @ComProperty(name = "ApplyStyleColumnBands", dispId = 0xcf)
    Boolean getApplyStyleColumnBands();
            
    /**
     * <p>id(0xcf)</p>
     */
    @ComProperty(name = "ApplyStyleColumnBands", dispId = 0xcf)
    void setApplyStyleColumnBands(Boolean param0);
            
    /**
     * <p>id(0xd0)</p>
     */
    @ComMethod(name = "ApplyStyleDirectFormatting", dispId = 0xd0)
    void ApplyStyleDirectFormatting(String StyleName);
            
    /**
     * <p>id(0xd1)</p>
     */
    @ComProperty(name = "Title", dispId = 0xd1)
    String getTitle();
            
    /**
     * <p>id(0xd1)</p>
     */
    @ComProperty(name = "Title", dispId = 0xd1)
    void setTitle(String param0);
            
    /**
     * <p>id(0xd2)</p>
     */
    @ComProperty(name = "Descr", dispId = 0xd2)
    String getDescr();
            
    /**
     * <p>id(0xd2)</p>
     */
    @ComProperty(name = "Descr", dispId = 0xd2)
    void setDescr(String param0);
            
    
}