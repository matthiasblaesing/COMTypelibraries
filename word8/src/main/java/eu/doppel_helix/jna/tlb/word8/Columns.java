
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002094B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002094B-0000-0000-C000-000000000046}")
public interface Columns {
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
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "First", dispId = 0x64)
    Column getFirst();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Last", dispId = 0x65)
    Column getLast();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Width", dispId = 0x3)
    Float getWidth();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Width", dispId = 0x3)
    void setWidth(Float param0);
            
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
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Column Item(Integer Index);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Add", dispId = 0x5)
    Column Add(Object BeforeColumn);
            
    /**
     * <p>id(0xc7)</p>
     */
    @ComMethod(name = "Select", dispId = 0xc7)
    void Select();
            
    /**
     * <p>id(0xc8)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc8)
    void Delete();
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComMethod(name = "SetWidth", dispId = 0xc9)
    void SetWidth(Float ColumnWidth,
            WdRulerStyle RulerStyle);
            
    /**
     * <p>id(0xca)</p>
     */
    @ComMethod(name = "AutoFit", dispId = 0xca)
    void AutoFit();
            
    /**
     * <p>id(0xcb)</p>
     */
    @ComMethod(name = "DistributeWidth", dispId = 0xcb)
    void DistributeWidth();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "NestingLevel", dispId = 0x68)
    Integer getNestingLevel();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x69)
    Float getPreferredWidth();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "PreferredWidth", dispId = 0x69)
    void setPreferredWidth(Float param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x6a)
    WdPreferredWidthType getPreferredWidthType();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "PreferredWidthType", dispId = 0x6a)
    void setPreferredWidthType(WdPreferredWidthType param0);
            
    
}