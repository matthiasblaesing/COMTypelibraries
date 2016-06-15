
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
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
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
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x65)
    Shading getShading();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Cell Item(Integer Index);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "Add", dispId = 0x4)
    Cell Add(Object BeforeCell);
            
    /**
     * <p>id(0xc8)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc8)
    void Delete(Object ShiftCells);
            
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
    void Merge();
            
    /**
     * <p>id(0xcd)</p>
     */
    @ComMethod(name = "Split", dispId = 0xcd)
    void Split(Object NumRows,
            Object NumColumns,
            Object MergeBeforeSplit);
            
    /**
     * <p>id(0xce)</p>
     */
    @ComMethod(name = "DistributeHeight", dispId = 0xce)
    void DistributeHeight();
            
    /**
     * <p>id(0xcf)</p>
     */
    @ComMethod(name = "DistributeWidth", dispId = 0xcf)
    void DistributeWidth();
            
    /**
     * <p>id(0xd0)</p>
     */
    @ComMethod(name = "AutoFit", dispId = 0xd0)
    void AutoFit();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x66)
    Integer getNestingLevel();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x67)
    Float getPreferredWidth();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x67)
    void setPreferredWidth(Float param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x68)
    WdPreferredWidthType getPreferredWidthType();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x68)
    void setPreferredWidthType(WdPreferredWidthType param0);
            
    
}