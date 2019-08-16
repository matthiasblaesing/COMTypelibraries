
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002443D-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002443D-0001-0000-C000-000000000046}")
public interface ITextFrame extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6d1)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "MarginBottom", dispId = 0x6d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarginBottom(VARIANT RHS);
            
    /**
     * <p>id(0x6d1)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "MarginBottom", dispId = 0x6d1)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarginBottom(Float RHS);
            
    /**
     * <p>id(0x6d2)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "MarginLeft", dispId = 0x6d2)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarginLeft(VARIANT RHS);
            
    /**
     * <p>id(0x6d2)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "MarginLeft", dispId = 0x6d2)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarginLeft(Float RHS);
            
    /**
     * <p>id(0x6d3)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "MarginRight", dispId = 0x6d3)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarginRight(VARIANT RHS);
            
    /**
     * <p>id(0x6d3)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "MarginRight", dispId = 0x6d3)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarginRight(Float RHS);
            
    /**
     * <p>id(0x6d4)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "MarginTop", dispId = 0x6d4)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarginTop(VARIANT RHS);
            
    /**
     * <p>id(0x6d4)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Float}
     */
    @ComProperty(name = "MarginTop", dispId = 0x6d4)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarginTop(Float RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTextOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTextOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation RHS);
            
    /**
     * <p>id(0x25b)</p>
     * <p>vtableId(20)</p>
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     * @param RHS [out] {@code Characters}
     */
    @ComMethod(name = "Characters", dispId = 0x25b)
    com.sun.jna.platform.win32.WinNT.HRESULT Characters(Object Start,
            Object Length,
            VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code XlHAlign}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code XlHAlign}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT setHorizontalAlignment(XlHAlign RHS);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code XlVAlign}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code XlVAlign}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT setVerticalAlignment(XlVAlign RHS);
            
    /**
     * <p>id(0x266)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoSize(VARIANT RHS);
            
    /**
     * <p>id(0x266)</p>
     * <p>vtableId(26)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoSize(Boolean RHS);
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadingOrder(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(28)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT setReadingOrder(Integer RHS);
            
    /**
     * <p>id(0x6d5)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AutoMargins", dispId = 0x6d5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoMargins(VARIANT RHS);
            
    /**
     * <p>id(0x6d5)</p>
     * <p>vtableId(30)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AutoMargins", dispId = 0x6d5)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoMargins(Boolean RHS);
            
    /**
     * <p>id(0xb6a)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code XlOartVerticalOverflow}
     */
    @ComProperty(name = "VerticalOverflow", dispId = 0xb6a)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalOverflow(VARIANT RHS);
            
    /**
     * <p>id(0xb6a)</p>
     * <p>vtableId(32)</p>
     * @param RHS [in] {@code XlOartVerticalOverflow}
     */
    @ComProperty(name = "VerticalOverflow", dispId = 0xb6a)
    com.sun.jna.platform.win32.WinNT.HRESULT setVerticalOverflow(XlOartVerticalOverflow RHS);
            
    /**
     * <p>id(0xb6b)</p>
     * <p>vtableId(33)</p>
     * @param RHS [out] {@code XlOartHorizontalOverflow}
     */
    @ComProperty(name = "HorizontalOverflow", dispId = 0xb6b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalOverflow(VARIANT RHS);
            
    /**
     * <p>id(0xb6b)</p>
     * <p>vtableId(34)</p>
     * @param RHS [in] {@code XlOartHorizontalOverflow}
     */
    @ComProperty(name = "HorizontalOverflow", dispId = 0xb6b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHorizontalOverflow(XlOartHorizontalOverflow RHS);
            
    
}