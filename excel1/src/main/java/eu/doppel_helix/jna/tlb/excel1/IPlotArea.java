
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208CB-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208CB-0001-0000-C000-000000000046}")
public interface IPlotArea extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Border}
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearFormats(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Double RHS);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Interior}
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code ChartFillFormat}
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Double RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Double RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Double RHS);
            
    /**
     * <p>id(0xa5e)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "_InsideLeft", dispId = 0xa5e)
    com.sun.jna.platform.win32.WinNT.HRESULT get_InsideLeft(VARIANT RHS);
            
    /**
     * <p>id(0xa5f)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "_InsideTop", dispId = 0xa5f)
    com.sun.jna.platform.win32.WinNT.HRESULT get_InsideTop(VARIANT RHS);
            
    /**
     * <p>id(0xa60)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "_InsideWidth", dispId = 0xa60)
    com.sun.jna.platform.win32.WinNT.HRESULT get_InsideWidth(VARIANT RHS);
            
    /**
     * <p>id(0xa61)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "_InsideHeight", dispId = 0xa61)
    com.sun.jna.platform.win32.WinNT.HRESULT get_InsideHeight(VARIANT RHS);
            
    /**
     * <p>id(0x683)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "InsideLeft", dispId = 0x683)
    com.sun.jna.platform.win32.WinNT.HRESULT getInsideLeft(VARIANT RHS);
            
    /**
     * <p>id(0x683)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "InsideLeft", dispId = 0x683)
    com.sun.jna.platform.win32.WinNT.HRESULT setInsideLeft(Double RHS);
            
    /**
     * <p>id(0x684)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "InsideTop", dispId = 0x684)
    com.sun.jna.platform.win32.WinNT.HRESULT getInsideTop(VARIANT RHS);
            
    /**
     * <p>id(0x684)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "InsideTop", dispId = 0x684)
    com.sun.jna.platform.win32.WinNT.HRESULT setInsideTop(Double RHS);
            
    /**
     * <p>id(0x685)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "InsideWidth", dispId = 0x685)
    com.sun.jna.platform.win32.WinNT.HRESULT getInsideWidth(VARIANT RHS);
            
    /**
     * <p>id(0x685)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "InsideWidth", dispId = 0x685)
    com.sun.jna.platform.win32.WinNT.HRESULT setInsideWidth(Double RHS);
            
    /**
     * <p>id(0x686)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "InsideHeight", dispId = 0x686)
    com.sun.jna.platform.win32.WinNT.HRESULT getInsideHeight(VARIANT RHS);
            
    /**
     * <p>id(0x686)</p>
     * <p>vtableId(35)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "InsideHeight", dispId = 0x686)
    com.sun.jna.platform.win32.WinNT.HRESULT setInsideHeight(Double RHS);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code XlChartElementPosition}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT getPosition(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(37)</p>
     * @param RHS [in] {@code XlChartElementPosition}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT setPosition(XlChartElementPosition RHS);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code ChartFormat}
     */
    @ComProperty(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT RHS);
            
    
}