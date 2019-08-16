
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C2-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C2-0001-0000-C000-000000000046}")
public interface IDisplayFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x1b3)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorders(VARIANT RHS);
            
    /**
     * <p>id(0x25b)</p>
     * <p>vtableId(11)</p>
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     * @param RHS [out] {@code Characters}
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCharacters(Object Start,
            Object Length,
            VARIANT RHS);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Font}
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0x104)
    com.sun.jna.platform.win32.WinNT.HRESULT getStyle(VARIANT RHS);
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    com.sun.jna.platform.win32.WinNT.HRESULT getAddIndent(VARIANT RHS);
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "FormulaHidden", dispId = 0x106)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaHidden(VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "IndentLevel", dispId = 0xc9)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndentLevel(VARIANT RHS);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Interior}
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0xd0)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "MergeCells", dispId = 0xd0)
    com.sun.jna.platform.win32.WinNT.HRESULT getMergeCells(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(21)</p>
     * @param lcidIn [in] {@code Integer}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(Integer lcidIn,
            VARIANT RHS);
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormatLocal(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadingOrder(VARIANT RHS);
            
    /**
     * <p>id(0xd1)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "ShrinkToFit", dispId = 0xd1)
    com.sun.jna.platform.win32.WinNT.HRESULT getShrinkToFit(VARIANT RHS);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x114)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "WrapText", dispId = 0x114)
    com.sun.jna.platform.win32.WinNT.HRESULT getWrapText(VARIANT RHS);
            
    
}