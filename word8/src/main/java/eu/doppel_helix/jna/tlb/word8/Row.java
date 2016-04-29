
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020950-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020950-0000-0000-C000-000000000046}")
public interface Row {
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
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "AllowBreakAcrossPages", dispId = 0x3)
    Integer getAllowBreakAcrossPages();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "AllowBreakAcrossPages", dispId = 0x3)
    void setAllowBreakAcrossPages(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x4)
    WdRowAlignment getAlignment();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x4)
    void setAlignment(WdRowAlignment param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "HeadingFormat", dispId = 0x5)
    Integer getHeadingFormat();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "HeadingFormat", dispId = 0x5)
    void setHeadingFormat(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "SpaceBetweenColumns", dispId = 0x6)
    Float getSpaceBetweenColumns();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "SpaceBetweenColumns", dispId = 0x6)
    void setSpaceBetweenColumns(Float param0);
            
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
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "LeftIndent", dispId = 0x9)
    Float getLeftIndent();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "LeftIndent", dispId = 0x9)
    void setLeftIndent(Float param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "IsLast", dispId = 0xa)
    Boolean getIsLast();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "IsFirst", dispId = 0xb)
    Boolean getIsFirst();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Index", dispId = 0xc)
    Integer getIndex();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Cells", dispId = 0x64)
    Cells getCells();
            
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
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x67)
    Shading getShading();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Next", dispId = 0x68)
    Row getNext();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x69)
    Row getPrevious();
            
    /**
     * <p>id(0xffff)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0xc8)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc8)
    void Delete();
            
    /**
     * <p>id(0xca)</p>
     */
    @ComMethod(name = "SetLeftIndent", dispId = 0xca)
    void SetLeftIndent(Float LeftIndent,
            WdRulerStyle RulerStyle);
            
    /**
     * <p>id(0xcb)</p>
     */
    @ComMethod(name = "SetHeight", dispId = 0xcb)
    void SetHeight(Float RowHeight,
            WdRowHeightRule HeightRule);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "ConvertToTextOld", dispId = 0x10)
    Range ConvertToTextOld(Object Separator);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "ConvertToText", dispId = 0x12)
    Range ConvertToText(Object Separator,
            Object NestedTables);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x6a)
    Integer getNestingLevel();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "ID", dispId = 0x6b)
    String getID();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "ID", dispId = 0x6b)
    void setID(String param0);
            
    
}