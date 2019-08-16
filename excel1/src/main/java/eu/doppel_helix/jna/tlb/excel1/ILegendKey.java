
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208BC-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208BC-0001-0000-C000-000000000046}")
public interface ILegendKey extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x80)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Border}
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearFormats(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Interior}
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code ChartFillFormat}
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    com.sun.jna.platform.win32.WinNT.HRESULT getInvertIfNegative(VARIANT RHS);
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    com.sun.jna.platform.win32.WinNT.HRESULT setInvertIfNegative(Boolean RHS);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerBackgroundColor(VARIANT RHS);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerBackgroundColor(Integer RHS);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerBackgroundColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerBackgroundColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerForegroundColor(VARIANT RHS);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerForegroundColor(Integer RHS);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerForegroundColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerForegroundColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerSize(VARIANT RHS);
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(26)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerSize(Integer RHS);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code XlMarkerStyle}
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerStyle(VARIANT RHS);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(28)</p>
     * @param RHS [in] {@code XlMarkerStyle}
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerStyle(XlMarkerStyle RHS);
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureType(VARIANT RHS);
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(30)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureType(Integer RHS);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureUnit(VARIANT RHS);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(32)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureUnit(Integer RHS);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(33)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0xa3)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Smooth", dispId = 0xa3)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmooth(VARIANT RHS);
            
    /**
     * <p>id(0xa3)</p>
     * <p>vtableId(35)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Smooth", dispId = 0xa3)
    com.sun.jna.platform.win32.WinNT.HRESULT setSmooth(Boolean RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(37)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(40)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(41)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT setShadow(Boolean RHS);
            
    /**
     * <p>id(0xa59)</p>
     * <p>vtableId(42)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureUnit2(VARIANT RHS);
            
    /**
     * <p>id(0xa59)</p>
     * <p>vtableId(43)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureUnit2(Double RHS);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code ChartFormat}
     */
    @ComProperty(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT RHS);
            
    
}