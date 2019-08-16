
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020950-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020950-0000-0000-C000-000000000046}")
public interface Row extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "AllowBreakAcrossPages", dispId = 0x3)
    Integer getAllowBreakAcrossPages();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AllowBreakAcrossPages", dispId = 0x3)
    void setAllowBreakAcrossPages(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x4)
    WdRowAlignment getAlignment();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code WdRowAlignment}
     */
    @ComProperty(name = "Alignment", dispId = 0x4)
    void setAlignment(WdRowAlignment param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "HeadingFormat", dispId = 0x5)
    Integer getHeadingFormat();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HeadingFormat", dispId = 0x5)
    void setHeadingFormat(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "SpaceBetweenColumns", dispId = 0x6)
    Float getSpaceBetweenColumns();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "SpaceBetweenColumns", dispId = 0x6)
    void setSpaceBetweenColumns(Float param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7)
    Float getHeight();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x7)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "HeightRule", dispId = 0x8)
    WdRowHeightRule getHeightRule();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code WdRowHeightRule}
     */
    @ComProperty(name = "HeightRule", dispId = 0x8)
    void setHeightRule(WdRowHeightRule param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "LeftIndent", dispId = 0x9)
    Float getLeftIndent();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LeftIndent", dispId = 0x9)
    void setLeftIndent(Float param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "IsLast", dispId = 0xa)
    Boolean getIsLast();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "IsFirst", dispId = 0xb)
    Boolean getIsFirst();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Index", dispId = 0xc)
    Integer getIndex();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Cells", dispId = 0x64)
    Cells getCells();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x67)
    Shading getShading();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Next", dispId = 0x68)
    Row getNext();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x69)
    Row getPrevious();
            
    /**
     * <p>id(0xffff)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc8)
    void Delete();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(36)</p>
     * @param LeftIndent [in] {@code Float}
     * @param RulerStyle [in] {@code WdRulerStyle}
     */
    @ComMethod(name = "SetLeftIndent", dispId = 0xca)
    void SetLeftIndent(Float LeftIndent,
            WdRulerStyle RulerStyle);
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(37)</p>
     * @param RowHeight [in] {@code Float}
     * @param HeightRule [in] {@code WdRowHeightRule}
     */
    @ComMethod(name = "SetHeight", dispId = 0xcb)
    void SetHeight(Float RowHeight,
            WdRowHeightRule HeightRule);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(38)</p>
     * @param Separator [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertToTextOld", dispId = 0x10)
    Range ConvertToTextOld(Object Separator);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(39)</p>
     * @param Separator [in, optional] {@code Object}
     * @param NestedTables [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertToText", dispId = 0x12)
    Range ConvertToText(Object Separator,
            Object NestedTables);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x6a)
    Integer getNestingLevel();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "ID", dispId = 0x6b)
    String getID();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ID", dispId = 0x6b)
    void setID(String param0);
            
    
}