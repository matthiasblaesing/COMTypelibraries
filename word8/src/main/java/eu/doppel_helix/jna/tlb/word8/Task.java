
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020982-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020982-0000-0000-C000-000000000046}")
public interface Task {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Left", dispId = 0x1)
    Integer getLeft();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Left", dispId = 0x1)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Top", dispId = 0x2)
    Integer getTop();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Top", dispId = 0x2)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Width", dispId = 0x3)
    Integer getWidth();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Width", dispId = 0x3)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Height", dispId = 0x4)
    Integer getHeight();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Height", dispId = 0x4)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x5)
    WdWindowState getWindowState();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x5)
    void setWindowState(WdWindowState param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6)
    Boolean getVisible();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "Activate", dispId = 0xa)
    void Activate(Object Wait);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "Close", dispId = 0xb)
    void Close();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "Move", dispId = 0xc)
    void Move(Integer Left,
            Integer Top);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "Resize", dispId = 0xd)
    void Resize(Integer Width,
            Integer Height);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "SendWindowMessage", dispId = 0xe)
    void SendWindowMessage(Integer Message,
            Integer wParam,
            Integer lParam);
            
    
}