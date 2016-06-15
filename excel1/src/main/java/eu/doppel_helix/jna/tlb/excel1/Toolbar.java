
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002085C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002085C-0000-0000-C000-000000000046}")
public interface Toolbar extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x229)</p>
     */
    @ComProperty(name = "BuiltIn", dispId = 0x229)
    Boolean getBuiltIn();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Integer getHeight();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Integer getLeft();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    Integer getPosition();
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    void setPosition(Integer param0);
            
    /**
     * <p>id(0xb0)</p>
     */
    @ComProperty(name = "Protection", dispId = 0xb0)
    XlToolbarProtection getProtection();
            
    /**
     * <p>id(0xb0)</p>
     */
    @ComProperty(name = "Protection", dispId = 0xb0)
    void setProtection(XlToolbarProtection param0);
            
    /**
     * <p>id(0x22b)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x22b)
    void Reset();
            
    /**
     * <p>id(0x3c4)</p>
     */
    @ComProperty(name = "ToolbarButtons", dispId = 0x3c4)
    ToolbarButtons getToolbarButtons();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Integer getTop();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Integer param0);
            
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
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Integer getWidth();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Integer param0);
            
    
}