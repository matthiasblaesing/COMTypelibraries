
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244CD-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244CD-0000-0000-C000-000000000046}")
public interface ProtectedViewWindow extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x4a8)</p>
     */
    @ComProperty(name = "EnableResize", dispId = 0x4a8)
    Boolean getEnableResize();
            
    /**
     * <p>id(0x4a8)</p>
     */
    @ComProperty(name = "EnableResize", dispId = 0x4a8)
    void setEnableResize(Boolean param0);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    Boolean getVisible();
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x2d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    String getSourceName();
            
    /**
     * <p>id(0xbb1)</p>
     */
    @ComProperty(name = "SourcePath", dispId = 0xbb1)
    String getSourcePath();
            
    /**
     * <p>id(0x18c)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x18c)
    XlProtectedViewWindowState getWindowState();
            
    /**
     * <p>id(0x18c)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x18c)
    void setWindowState(XlProtectedViewWindowState param0);
            
    /**
     * <p>id(0x2f0)</p>
     */
    @ComProperty(name = "Workbook", dispId = 0x2f0)
    Workbook getWorkbook();
            
    /**
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    void Activate();
            
    /**
     * <p>id(0x115)</p>
     */
    @ComMethod(name = "Close", dispId = 0x115)
    Boolean Close();
            
    /**
     * <p>id(0x232)</p>
     */
    @ComMethod(name = "Edit", dispId = 0x232)
    Workbook Edit(Object WriteResPassword,
            Object UpdateLinks);
            
    
}