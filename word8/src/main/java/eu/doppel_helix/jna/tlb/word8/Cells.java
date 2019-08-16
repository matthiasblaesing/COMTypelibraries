
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002094A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002094A-0000-0000-C000-000000000046}")
public interface Cells extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6)
    Float getWidth();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x6)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7)
    Float getHeight();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x7)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "HeightRule", dispId = 0x8)
    WdRowHeightRule getHeightRule();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code WdRowHeightRule}
     */
    @ComProperty(name = "HeightRule", dispId = 0x8)
    void setHeightRule(WdRowHeightRule param0);
            
    /**
     * <p>id(0x450)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x450)
    WdCellVerticalAlignment getVerticalAlignment();
            
    /**
     * <p>id(0x450)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code WdCellVerticalAlignment}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x450)
    void setVerticalAlignment(WdCellVerticalAlignment param0);
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    Borders getBorders();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x44c)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x65)
    Shading getShading();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(23)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Cell Item(Integer Index);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(24)</p>
     * @param BeforeCell [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x4)
    Cell Add(Object BeforeCell);
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(25)</p>
     * @param ShiftCells [in, optional] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0xc8)
    void Delete(Object ShiftCells);
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(26)</p>
     * @param ColumnWidth [in] {@code Float}
     * @param RulerStyle [in] {@code WdRulerStyle}
     */
    @ComMethod(name = "SetWidth", dispId = 0xca)
    void SetWidth(Float ColumnWidth,
            WdRulerStyle RulerStyle);
            
    /**
     * <p>id(0xcb)</p>
     * <p>vtableId(27)</p>
     * @param RowHeight [in] {@code Object}
     * @param HeightRule [in] {@code WdRowHeightRule}
     */
    @ComMethod(name = "SetHeight", dispId = 0xcb)
    void SetHeight(Object RowHeight,
            WdRowHeightRule HeightRule);
            
    /**
     * <p>id(0xcc)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "Merge", dispId = 0xcc)
    void Merge();
            
    /**
     * <p>id(0xcd)</p>
     * <p>vtableId(29)</p>
     * @param NumRows [in, optional] {@code Object}
     * @param NumColumns [in, optional] {@code Object}
     * @param MergeBeforeSplit [in, optional] {@code Object}
     */
    @ComMethod(name = "Split", dispId = 0xcd)
    void Split(Object NumRows,
            Object NumColumns,
            Object MergeBeforeSplit);
            
    /**
     * <p>id(0xce)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "DistributeHeight", dispId = 0xce)
    void DistributeHeight();
            
    /**
     * <p>id(0xcf)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "DistributeWidth", dispId = 0xcf)
    void DistributeWidth();
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "AutoFit", dispId = 0xd0)
    void AutoFit();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x66)
    Integer getNestingLevel();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x67)
    Float getPreferredWidth();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x67)
    void setPreferredWidth(Float param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x68)
    WdPreferredWidthType getPreferredWidthType();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code WdPreferredWidthType}
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x68)
    void setPreferredWidthType(WdPreferredWidthType param0);
            
    
}