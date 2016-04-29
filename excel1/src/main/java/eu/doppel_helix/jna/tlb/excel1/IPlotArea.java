
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208CB-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208CB-0001-0000-C000-000000000046}")
public interface IPlotArea {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearFormats(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Double RHS);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x67f)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Double RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Double RHS);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Double RHS);
            
    /**
     * <p>id(0xa5e)</p>
     */
    @ComProperty(name = "_InsideLeft", dispId = 0xa5e)
    com.sun.jna.platform.win32.WinNT.HRESULT get_InsideLeft(VARIANT RHS);
            
    /**
     * <p>id(0xa5f)</p>
     */
    @ComProperty(name = "_InsideTop", dispId = 0xa5f)
    com.sun.jna.platform.win32.WinNT.HRESULT get_InsideTop(VARIANT RHS);
            
    /**
     * <p>id(0xa60)</p>
     */
    @ComProperty(name = "_InsideWidth", dispId = 0xa60)
    com.sun.jna.platform.win32.WinNT.HRESULT get_InsideWidth(VARIANT RHS);
            
    /**
     * <p>id(0xa61)</p>
     */
    @ComProperty(name = "_InsideHeight", dispId = 0xa61)
    com.sun.jna.platform.win32.WinNT.HRESULT get_InsideHeight(VARIANT RHS);
            
    /**
     * <p>id(0x683)</p>
     */
    @ComProperty(name = "InsideLeft", dispId = 0x683)
    com.sun.jna.platform.win32.WinNT.HRESULT getInsideLeft(VARIANT RHS);
            
    /**
     * <p>id(0x683)</p>
     */
    @ComProperty(name = "InsideLeft", dispId = 0x683)
    com.sun.jna.platform.win32.WinNT.HRESULT setInsideLeft(Double RHS);
            
    /**
     * <p>id(0x684)</p>
     */
    @ComProperty(name = "InsideTop", dispId = 0x684)
    com.sun.jna.platform.win32.WinNT.HRESULT getInsideTop(VARIANT RHS);
            
    /**
     * <p>id(0x684)</p>
     */
    @ComProperty(name = "InsideTop", dispId = 0x684)
    com.sun.jna.platform.win32.WinNT.HRESULT setInsideTop(Double RHS);
            
    /**
     * <p>id(0x685)</p>
     */
    @ComProperty(name = "InsideWidth", dispId = 0x685)
    com.sun.jna.platform.win32.WinNT.HRESULT getInsideWidth(VARIANT RHS);
            
    /**
     * <p>id(0x685)</p>
     */
    @ComProperty(name = "InsideWidth", dispId = 0x685)
    com.sun.jna.platform.win32.WinNT.HRESULT setInsideWidth(Double RHS);
            
    /**
     * <p>id(0x686)</p>
     */
    @ComProperty(name = "InsideHeight", dispId = 0x686)
    com.sun.jna.platform.win32.WinNT.HRESULT getInsideHeight(VARIANT RHS);
            
    /**
     * <p>id(0x686)</p>
     */
    @ComProperty(name = "InsideHeight", dispId = 0x686)
    com.sun.jna.platform.win32.WinNT.HRESULT setInsideHeight(Double RHS);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT getPosition(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT setPosition(XlChartElementPosition RHS);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT RHS);
            
    
}