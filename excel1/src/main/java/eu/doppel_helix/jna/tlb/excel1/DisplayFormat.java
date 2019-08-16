
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C2-0000-0000-C000-000000000046}")
public interface DisplayFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1b3)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    Borders getBorders();
            
    /**
     * <p>id(0x25b)</p>
     * <p>vtableId(11)</p>
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    Characters getCharacters(Object Start,
            Object Length);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Style", dispId = 0x104)
    Object getStyle();
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    Object getAddIndent();
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    Object getFormulaHidden();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    Object getHorizontalAlignment();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    Object getIndentLevel();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Object getLocked();
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    Object getMergeCells();
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    Object getNumberFormat();
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    Object getNumberFormatLocal();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    Object getOrientation();
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    Integer getReadingOrder();
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    Object getShrinkToFit();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    Object getVerticalAlignment();
            
    /**
     * <p>id(0x114)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    Object getWrapText();
            
    
}