
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002094E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002094E-0000-0000-C000-000000000046}")
public interface Cell {
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
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "RowIndex", dispId = 0x4)
    Integer getRowIndex();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "ColumnIndex", dispId = 0x5)
    Integer getColumnIndex();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6)
    Float getWidth();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7)
    Float getHeight();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "HeightRule", dispId = 0x8)
    WdRowHeightRule getHeightRule();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "HeightRule", dispId = 0x8)
    void setHeightRule(WdRowHeightRule param0);
            
    /**
     * <p>id(0x450)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x450)
    WdCellVerticalAlignment getVerticalAlignment();
            
    /**
     * <p>id(0x450)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x450)
    void setVerticalAlignment(WdCellVerticalAlignment param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Column", dispId = 0x65)
    Column getColumn();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Row", dispId = 0x66)
    Row getRow();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Next", dispId = 0x67)
    Cell getNext();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x68)
    Cell getPrevious();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x69)
    Shading getShading();
            
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
     * <p>id(0xffff)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0xc8)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc8)
    void Delete(Object ShiftCells);
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComMethod(name = "Formula", dispId = 0xc9)
    void Formula(Object Formula,
            Object NumFormat);
            
    /**
     * <p>id(0xca)</p>
     */
    @ComMethod(name = "SetWidth", dispId = 0xca)
    void SetWidth(Float ColumnWidth,
            WdRulerStyle RulerStyle);
            
    /**
     * <p>id(0xcb)</p>
     */
    @ComMethod(name = "SetHeight", dispId = 0xcb)
    void SetHeight(Object RowHeight,
            WdRowHeightRule HeightRule);
            
    /**
     * <p>id(0xcc)</p>
     */
    @ComMethod(name = "Merge", dispId = 0xcc)
    void Merge(Cell MergeTo);
            
    /**
     * <p>id(0xcd)</p>
     */
    @ComMethod(name = "Split", dispId = 0xcd)
    void Split(Object NumRows,
            Object NumColumns);
            
    /**
     * <p>id(0xce)</p>
     */
    @ComMethod(name = "AutoSum", dispId = 0xce)
    void AutoSum();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "Tables", dispId = 0x6a)
    Tables getTables();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x6b)
    Integer getNestingLevel();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x6c)
    Boolean getWordWrap();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x6c)
    void setWordWrap(Boolean param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x6d)
    Float getPreferredWidth();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x6d)
    void setPreferredWidth(Float param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "FitText", dispId = 0x6e)
    Boolean getFitText();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "FitText", dispId = 0x6e)
    void setFitText(Boolean param0);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x6f)
    Float getTopPadding();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "TopPadding", dispId = 0x6f)
    void setTopPadding(Float param0);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x70)
    Float getBottomPadding();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "BottomPadding", dispId = 0x70)
    void setBottomPadding(Float param0);
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x71)
    Float getLeftPadding();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "LeftPadding", dispId = 0x71)
    void setLeftPadding(Float param0);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x72)
    Float getRightPadding();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "RightPadding", dispId = 0x72)
    void setRightPadding(Float param0);
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "ID", dispId = 0x73)
    String getID();
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "ID", dispId = 0x73)
    void setID(String param0);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x74)
    WdPreferredWidthType getPreferredWidthType();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x74)
    void setPreferredWidthType(WdPreferredWidthType param0);
            
    
}