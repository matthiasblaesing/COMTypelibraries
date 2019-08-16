
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002094C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002094C-0000-0000-C000-000000000046}")
public interface Rows extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "AllowBreakAcrossPages", dispId = 0x3)
    Integer getAllowBreakAcrossPages();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AllowBreakAcrossPages", dispId = 0x3)
    void setAllowBreakAcrossPages(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x4)
    WdRowAlignment getAlignment();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code WdRowAlignment}
     */
    @ComProperty(name = "Alignment", dispId = 0x4)
    void setAlignment(WdRowAlignment param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "HeadingFormat", dispId = 0x5)
    Integer getHeadingFormat();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HeadingFormat", dispId = 0x5)
    void setHeadingFormat(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "SpaceBetweenColumns", dispId = 0x6)
    Float getSpaceBetweenColumns();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "SpaceBetweenColumns", dispId = 0x6)
    void setSpaceBetweenColumns(Float param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7)
    Float getHeight();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x7)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "HeightRule", dispId = 0x8)
    WdRowHeightRule getHeightRule();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code WdRowHeightRule}
     */
    @ComProperty(name = "HeightRule", dispId = 0x8)
    void setHeightRule(WdRowHeightRule param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "LeftIndent", dispId = 0x9)
    Float getLeftIndent();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "LeftIndent", dispId = 0x9)
    void setLeftIndent(Float param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "First", dispId = 0xa)
    Row getFirst();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Last", dispId = 0xb)
    Row getLast();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x66)
    Shading getShading();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(31)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Row Item(Integer Index);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(32)</p>
     * @param BeforeRow [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x64)
    Row Add(Object BeforeRow);
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Select", dispId = 0xc7)
    void Select();
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc8)
    void Delete();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(35)</p>
     * @param LeftIndent [in] {@code Float}
     * @param RulerStyle [in] {@code WdRulerStyle}
     */
    @ComMethod(name = "SetLeftIndent", dispId = 0xca)
    void SetLeftIndent(Float LeftIndent,
            WdRulerStyle RulerStyle);
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(36)</p>
     * @param RowHeight [in] {@code Float}
     * @param HeightRule [in] {@code WdRowHeightRule}
     */
    @ComMethod(name = "SetHeight", dispId = 0xcb)
    void SetHeight(Float RowHeight,
            WdRowHeightRule HeightRule);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(37)</p>
     * @param Separator [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertToTextOld", dispId = 0x10)
    Range ConvertToTextOld(Object Separator);
            
    /**
     * <p>id(0xce)</p>
     * <p>vtableId(38)</p>
     */
    @ComMethod(name = "DistributeHeight", dispId = 0xce)
    void DistributeHeight();
            
    /**
     * <p>id(0xd2)</p>
     * <p>vtableId(39)</p>
     * @param Separator [in, optional] {@code Object}
     * @param NestedTables [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertToText", dispId = 0xd2)
    Range ConvertToText(Object Separator,
            Object NestedTables);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "WrapAroundText", dispId = 0xc)
    Integer getWrapAroundText();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "WrapAroundText", dispId = 0xc)
    void setWrapAroundText(Integer param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "DistanceTop", dispId = 0xd)
    Float getDistanceTop();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "DistanceTop", dispId = 0xd)
    void setDistanceTop(Float param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "DistanceBottom", dispId = 0xe)
    Float getDistanceBottom();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "DistanceBottom", dispId = 0xe)
    void setDistanceBottom(Float param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "DistanceLeft", dispId = 0x14)
    Float getDistanceLeft();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "DistanceLeft", dispId = 0x14)
    void setDistanceLeft(Float param0);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "DistanceRight", dispId = 0x15)
    Float getDistanceRight();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "DistanceRight", dispId = 0x15)
    void setDistanceRight(Float param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "HorizontalPosition", dispId = 0xf)
    Float getHorizontalPosition();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "HorizontalPosition", dispId = 0xf)
    void setHorizontalPosition(Float param0);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "VerticalPosition", dispId = 0x11)
    Float getVerticalPosition();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "VerticalPosition", dispId = 0x11)
    void setVerticalPosition(Float param0);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "RelativeHorizontalPosition", dispId = 0x12)
    WdRelativeHorizontalPosition getRelativeHorizontalPosition();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code WdRelativeHorizontalPosition}
     */
    @ComProperty(name = "RelativeHorizontalPosition", dispId = 0x12)
    void setRelativeHorizontalPosition(WdRelativeHorizontalPosition param0);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "RelativeVerticalPosition", dispId = 0x13)
    WdRelativeVerticalPosition getRelativeVerticalPosition();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code WdRelativeVerticalPosition}
     */
    @ComProperty(name = "RelativeVerticalPosition", dispId = 0x13)
    void setRelativeVerticalPosition(WdRelativeVerticalPosition param0);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "AllowOverlap", dispId = 0x16)
    Integer getAllowOverlap();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AllowOverlap", dispId = 0x16)
    void setAllowOverlap(Integer param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x67)
    Integer getNestingLevel();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "TableDirection", dispId = 0x68)
    WdTableDirection getTableDirection();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code WdTableDirection}
     */
    @ComProperty(name = "TableDirection", dispId = 0x68)
    void setTableDirection(WdTableDirection param0);
            
    
}