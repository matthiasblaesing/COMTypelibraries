
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    Boolean getAddIndent();
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    void setAddIndent(Boolean param0);
            
    /**
     * <p>id(0x229)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "BuiltIn", dispId = 0x229)
    Boolean getBuiltIn();
            
    /**
     * <p>id(0x1b3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    Borders getBorders();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    Boolean getFormulaHidden();
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    void setFormulaHidden(Boolean param0);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    XlHAlign getHorizontalAlignment();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code XlHAlign}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    void setHorizontalAlignment(XlHAlign param0);
            
    /**
     * <p>id(0x19d)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "IncludeAlignment", dispId = 0x19d)
    Boolean getIncludeAlignment();
            
    /**
     * <p>id(0x19d)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeAlignment", dispId = 0x19d)
    void setIncludeAlignment(Boolean param0);
            
    /**
     * <p>id(0x19e)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "IncludeBorder", dispId = 0x19e)
    Boolean getIncludeBorder();
            
    /**
     * <p>id(0x19e)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeBorder", dispId = 0x19e)
    void setIncludeBorder(Boolean param0);
            
    /**
     * <p>id(0x19f)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "IncludeFont", dispId = 0x19f)
    Boolean getIncludeFont();
            
    /**
     * <p>id(0x19f)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeFont", dispId = 0x19f)
    void setIncludeFont(Boolean param0);
            
    /**
     * <p>id(0x1a0)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "IncludeNumber", dispId = 0x1a0)
    Boolean getIncludeNumber();
            
    /**
     * <p>id(0x1a0)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeNumber", dispId = 0x1a0)
    void setIncludeNumber(Boolean param0);
            
    /**
     * <p>id(0x1a1)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "IncludePatterns", dispId = 0x1a1)
    Boolean getIncludePatterns();
            
    /**
     * <p>id(0x1a1)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludePatterns", dispId = 0x1a1)
    void setIncludePatterns(Boolean param0);
            
    /**
     * <p>id(0x1a2)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "IncludeProtection", dispId = 0x1a2)
    Boolean getIncludeProtection();
            
    /**
     * <p>id(0x1a2)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeProtection", dispId = 0x1a2)
    void setIncludeProtection(Boolean param0);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    Integer getIndentLevel();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    void setIndentLevel(Integer param0);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Boolean getLocked();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    Object getMergeCells();
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    void setMergeCells(Object param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x3a9)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "NameLocal", dispId = 0x3a9)
    String getNameLocal();
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    String getNumberFormat();
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    void setNumberFormat(String param0);
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    String getNumberFormatLocal();
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    void setNumberFormatLocal(String param0);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    XlOrientation getOrientation();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code XlOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(XlOrientation param0);
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    Boolean getShrinkToFit();
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    void setShrinkToFit(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    XlVAlign getVerticalAlignment();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code XlVAlign}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    void setVerticalAlignment(XlVAlign param0);
            
    /**
     * <p>id(0x114)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    Boolean getWrapText();
            
    /**
     * <p>id(0x114)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    void setWrapText(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    void setReadingOrder(Integer param0);
            
    
}