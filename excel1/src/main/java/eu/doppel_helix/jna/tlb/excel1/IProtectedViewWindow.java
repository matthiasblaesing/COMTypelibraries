
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244CD-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244CD-0001-0000-C000-000000000046}")
public interface IProtectedViewWindow {
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x4a8)</p>
     */
    @ComProperty(name = "EnableResize", dispId = 0x4a8)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableResize(VARIANT RHS);
            
    /**
     * <p>id(0x4a8)</p>
     */
    @ComProperty(name = "EnableResize", dispId = 0x4a8)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableResize(Boolean RHS);
            
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
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x2d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceName(VARIANT RHS);
            
    /**
     * <p>id(0xbb1)</p>
     */
    @ComProperty(name = "SourcePath", dispId = 0xbb1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourcePath(VARIANT RHS);
            
    /**
     * <p>id(0x18c)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x18c)
    com.sun.jna.platform.win32.WinNT.HRESULT getWindowState(VARIANT RHS);
            
    /**
     * <p>id(0x18c)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x18c)
    com.sun.jna.platform.win32.WinNT.HRESULT setWindowState(XlProtectedViewWindowState RHS);
            
    /**
     * <p>id(0x2f0)</p>
     */
    @ComProperty(name = "Workbook", dispId = 0x2f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorkbook(VARIANT RHS);
            
    /**
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate();
            
    /**
     * <p>id(0x115)</p>
     */
    @ComMethod(name = "Close", dispId = 0x115)
    com.sun.jna.platform.win32.WinNT.HRESULT Close(VARIANT RHS);
            
    /**
     * <p>id(0x232)</p>
     */
    @ComMethod(name = "Edit", dispId = 0x232)
    com.sun.jna.platform.win32.WinNT.HRESULT Edit(Object WriteResPassword,
            Object UpdateLinks,
            VARIANT RHS);
            
    
}