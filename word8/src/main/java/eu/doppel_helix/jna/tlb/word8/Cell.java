
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002094E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002094E-0000-0000-C000-000000000046}")
public interface Cell extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x4)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "RowIndex", dispId = 0x4)
    Integer getRowIndex();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ColumnIndex", dispId = 0x5)
    Integer getColumnIndex();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6)
    Float getWidth();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x6)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7)
    Float getHeight();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x7)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "HeightRule", dispId = 0x8)
    WdRowHeightRule getHeightRule();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code WdRowHeightRule}
     */
    @ComProperty(name = "HeightRule", dispId = 0x8)
    void setHeightRule(WdRowHeightRule param0);
            
    /**
     * <p>id(0x450)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x450)
    WdCellVerticalAlignment getVerticalAlignment();
            
    /**
     * <p>id(0x450)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code WdCellVerticalAlignment}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x450)
    void setVerticalAlignment(WdCellVerticalAlignment param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Column", dispId = 0x65)
    Column getColumn();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Row", dispId = 0x66)
    Row getRow();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Next", dispId = 0x67)
    Cell getNext();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x68)
    Cell getPrevious();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x69)
    Shading getShading();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0xffff)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(29)</p>
     * @param ShiftCells [in, optional] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0xc8)
    void Delete(Object ShiftCells);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(30)</p>
     * @param Formula [in, optional] {@code Object}
     * @param NumFormat [in, optional] {@code Object}
     */
    @ComMethod(name = "Formula", dispId = 0xc9)
    void Formula(Object Formula,
            Object NumFormat);
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(31)</p>
     * @param ColumnWidth [in] {@code Float}
     * @param RulerStyle [in] {@code WdRulerStyle}
     */
    @ComMethod(name = "SetWidth", dispId = 0xca)
    void SetWidth(Float ColumnWidth,
            WdRulerStyle RulerStyle);
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(32)</p>
     * @param RowHeight [in] {@code Object}
     * @param HeightRule [in] {@code WdRowHeightRule}
     */
    @ComMethod(name = "SetHeight", dispId = 0xcb)
    void SetHeight(Object RowHeight,
            WdRowHeightRule HeightRule);
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(33)</p>
     * @param MergeTo [in] {@code Cell}
     */
    @ComMethod(name = "Merge", dispId = 0xcc)
    void Merge(Cell MergeTo);
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(34)</p>
     * @param NumRows [in, optional] {@code Object}
     * @param NumColumns [in, optional] {@code Object}
     */
    @ComMethod(name = "Split", dispId = 0xcd)
    void Split(Object NumRows,
            Object NumColumns);
            
    /**
     * <p>id(0xce)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "AutoSum", dispId = 0xce)
    void AutoSum();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Tables", dispId = 0x6a)
    Tables getTables();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x6b)
    Integer getNestingLevel();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x6c)
    Boolean getWordWrap();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WordWrap", dispId = 0x6c)
    void setWordWrap(Boolean param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x6d)
    Float getPreferredWidth();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x6d)
    void setPreferredWidth(Float param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "FitText", dispId = 0x6e)
    Boolean getFitText();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FitText", dispId = 0x6e)
    void setFitText(Boolean param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x6f)
    Float getTopPadding();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TopPadding", dispId = 0x6f)
    void setTopPadding(Float param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x70)
    Float getBottomPadding();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "BottomPadding", dispId = 0x70)
    void setBottomPadding(Float param0);
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x71)
    Float getLeftPadding();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LeftPadding", dispId = 0x71)
    void setLeftPadding(Float param0);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x72)
    Float getRightPadding();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "RightPadding", dispId = 0x72)
    void setRightPadding(Float param0);
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "ID", dispId = 0x73)
    String getID();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ID", dispId = 0x73)
    void setID(String param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x74)
    WdPreferredWidthType getPreferredWidthType();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code WdPreferredWidthType}
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x74)
    void setPreferredWidthType(WdPreferredWidthType param0);
            
    
}