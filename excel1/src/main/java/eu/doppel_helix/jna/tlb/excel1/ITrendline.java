
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208BE-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208BE-0001-0000-C000-000000000046}")
public interface ITrendline {
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
     * <p>id(0xb9)</p>
     */
    @ComProperty(name = "Backward", dispId = 0xb9)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackward(VARIANT RHS);
            
    /**
     * <p>id(0xb9)</p>
     */
    @ComProperty(name = "Backward", dispId = 0xb9)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackward(Integer RHS);
            
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
     * <p>id(0x9e)</p>
     */
    @ComProperty(name = "DataLabel", dispId = 0x9e)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataLabel(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0xbe)</p>
     */
    @ComProperty(name = "DisplayEquation", dispId = 0xbe)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayEquation(VARIANT RHS);
            
    /**
     * <p>id(0xbe)</p>
     */
    @ComProperty(name = "DisplayEquation", dispId = 0xbe)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayEquation(Boolean RHS);
            
    /**
     * <p>id(0xbd)</p>
     */
    @ComProperty(name = "DisplayRSquared", dispId = 0xbd)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayRSquared(VARIANT RHS);
            
    /**
     * <p>id(0xbd)</p>
     */
    @ComProperty(name = "DisplayRSquared", dispId = 0xbd)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayRSquared(Boolean RHS);
            
    /**
     * <p>id(0xbf)</p>
     */
    @ComProperty(name = "Forward", dispId = 0xbf)
    com.sun.jna.platform.win32.WinNT.HRESULT getForward(VARIANT RHS);
            
    /**
     * <p>id(0xbf)</p>
     */
    @ComProperty(name = "Forward", dispId = 0xbf)
    com.sun.jna.platform.win32.WinNT.HRESULT setForward(Integer RHS);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0xba)</p>
     */
    @ComProperty(name = "Intercept", dispId = 0xba)
    com.sun.jna.platform.win32.WinNT.HRESULT getIntercept(VARIANT RHS);
            
    /**
     * <p>id(0xba)</p>
     */
    @ComProperty(name = "Intercept", dispId = 0xba)
    com.sun.jna.platform.win32.WinNT.HRESULT setIntercept(Double RHS);
            
    /**
     * <p>id(0xbb)</p>
     */
    @ComProperty(name = "InterceptIsAuto", dispId = 0xbb)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterceptIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0xbb)</p>
     */
    @ComProperty(name = "InterceptIsAuto", dispId = 0xbb)
    com.sun.jna.platform.win32.WinNT.HRESULT setInterceptIsAuto(Boolean RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0xbc)</p>
     */
    @ComProperty(name = "NameIsAuto", dispId = 0xbc)
    com.sun.jna.platform.win32.WinNT.HRESULT getNameIsAuto(VARIANT RHS);
            
    /**
     * <p>id(0xbc)</p>
     */
    @ComProperty(name = "NameIsAuto", dispId = 0xbc)
    com.sun.jna.platform.win32.WinNT.HRESULT setNameIsAuto(Boolean RHS);
            
    /**
     * <p>id(0xc0)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrder(VARIANT RHS);
            
    /**
     * <p>id(0xc0)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrder(Integer RHS);
            
    /**
     * <p>id(0xb8)</p>
     */
    @ComProperty(name = "Period", dispId = 0xb8)
    com.sun.jna.platform.win32.WinNT.HRESULT getPeriod(VARIANT RHS);
            
    /**
     * <p>id(0xb8)</p>
     */
    @ComProperty(name = "Period", dispId = 0xb8)
    com.sun.jna.platform.win32.WinNT.HRESULT setPeriod(Integer RHS);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(XlTrendlineType RHS);
            
    /**
     * <p>id(0xa5a)</p>
     */
    @ComProperty(name = "Backward2", dispId = 0xa5a)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackward2(VARIANT RHS);
            
    /**
     * <p>id(0xa5a)</p>
     */
    @ComProperty(name = "Backward2", dispId = 0xa5a)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackward2(Double RHS);
            
    /**
     * <p>id(0xa5b)</p>
     */
    @ComProperty(name = "Forward2", dispId = 0xa5b)
    com.sun.jna.platform.win32.WinNT.HRESULT getForward2(VARIANT RHS);
            
    /**
     * <p>id(0xa5b)</p>
     */
    @ComProperty(name = "Forward2", dispId = 0xa5b)
    com.sun.jna.platform.win32.WinNT.HRESULT setForward2(Double RHS);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT RHS);
            
    
}