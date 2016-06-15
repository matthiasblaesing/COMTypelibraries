
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020852-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020852-0000-0000-C000-000000000046}")
public interface Style extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x427)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    Boolean getAddIndent();
            
    /**
     * <p>id(0x427)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    void setAddIndent(Boolean param0);
            
    /**
     * <p>id(0x229)</p>
     */
    @ComProperty(name = "BuiltIn", dispId = 0x229)
    Boolean getBuiltIn();
            
    /**
     * <p>id(0x1b3)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    Borders getBorders();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0x106)</p>
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    Boolean getFormulaHidden();
            
    /**
     * <p>id(0x106)</p>
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    void setFormulaHidden(Boolean param0);
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    XlHAlign getHorizontalAlignment();
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    void setHorizontalAlignment(XlHAlign param0);
            
    /**
     * <p>id(0x19d)</p>
     */
    @ComProperty(name = "IncludeAlignment", dispId = 0x19d)
    Boolean getIncludeAlignment();
            
    /**
     * <p>id(0x19d)</p>
     */
    @ComProperty(name = "IncludeAlignment", dispId = 0x19d)
    void setIncludeAlignment(Boolean param0);
            
    /**
     * <p>id(0x19e)</p>
     */
    @ComProperty(name = "IncludeBorder", dispId = 0x19e)
    Boolean getIncludeBorder();
            
    /**
     * <p>id(0x19e)</p>
     */
    @ComProperty(name = "IncludeBorder", dispId = 0x19e)
    void setIncludeBorder(Boolean param0);
            
    /**
     * <p>id(0x19f)</p>
     */
    @ComProperty(name = "IncludeFont", dispId = 0x19f)
    Boolean getIncludeFont();
            
    /**
     * <p>id(0x19f)</p>
     */
    @ComProperty(name = "IncludeFont", dispId = 0x19f)
    void setIncludeFont(Boolean param0);
            
    /**
     * <p>id(0x1a0)</p>
     */
    @ComProperty(name = "IncludeNumber", dispId = 0x1a0)
    Boolean getIncludeNumber();
            
    /**
     * <p>id(0x1a0)</p>
     */
    @ComProperty(name = "IncludeNumber", dispId = 0x1a0)
    void setIncludeNumber(Boolean param0);
            
    /**
     * <p>id(0x1a1)</p>
     */
    @ComProperty(name = "IncludePatterns", dispId = 0x1a1)
    Boolean getIncludePatterns();
            
    /**
     * <p>id(0x1a1)</p>
     */
    @ComProperty(name = "IncludePatterns", dispId = 0x1a1)
    void setIncludePatterns(Boolean param0);
            
    /**
     * <p>id(0x1a2)</p>
     */
    @ComProperty(name = "IncludeProtection", dispId = 0x1a2)
    Boolean getIncludeProtection();
            
    /**
     * <p>id(0x1a2)</p>
     */
    @ComProperty(name = "IncludeProtection", dispId = 0x1a2)
    void setIncludeProtection(Boolean param0);
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    Integer getIndentLevel();
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    void setIndentLevel(Integer param0);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Boolean getLocked();
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0xd0)</p>
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    Object getMergeCells();
            
    /**
     * <p>id(0xd0)</p>
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    void setMergeCells(Object param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x3a9)</p>
     */
    @ComProperty(name = "NameLocal", dispId = 0x3a9)
    String getNameLocal();
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    String getNumberFormat();
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    void setNumberFormat(String param0);
            
    /**
     * <p>id(0x449)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    String getNumberFormatLocal();
            
    /**
     * <p>id(0x449)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    void setNumberFormatLocal(String param0);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    XlOrientation getOrientation();
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(XlOrientation param0);
            
    /**
     * <p>id(0xd1)</p>
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    Boolean getShrinkToFit();
            
    /**
     * <p>id(0xd1)</p>
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    void setShrinkToFit(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    XlVAlign getVerticalAlignment();
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    void setVerticalAlignment(XlVAlign param0);
            
    /**
     * <p>id(0x114)</p>
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    Boolean getWrapText();
            
    /**
     * <p>id(0x114)</p>
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    void setWrapText(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    void setReadingOrder(Integer param0);
            
    
}