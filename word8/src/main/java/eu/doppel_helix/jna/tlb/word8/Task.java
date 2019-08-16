
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020982-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020982-0000-0000-C000-000000000046}")
public interface Task extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Left", dispId = 0x1)
    Integer getLeft();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Left", dispId = 0x1)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Top", dispId = 0x2)
    Integer getTop();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Top", dispId = 0x2)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Width", dispId = 0x3)
    Integer getWidth();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x3)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Height", dispId = 0x4)
    Integer getHeight();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x4)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x5)
    WdWindowState getWindowState();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code WdWindowState}
     */
    @ComProperty(name = "WindowState", dispId = 0x5)
    void setWindowState(WdWindowState param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6)
    Boolean getVisible();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x6)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(23)</p>
     * @param Wait [in, optional] {@code Object}
     */
    @ComMethod(name = "Activate", dispId = 0xa)
    void Activate(Object Wait);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "Close", dispId = 0xb)
    void Close();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(25)</p>
     * @param Left [in] {@code Integer}
     * @param Top [in] {@code Integer}
     */
    @ComMethod(name = "Move", dispId = 0xc)
    void Move(Integer Left,
            Integer Top);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(26)</p>
     * @param Width [in] {@code Integer}
     * @param Height [in] {@code Integer}
     */
    @ComMethod(name = "Resize", dispId = 0xd)
    void Resize(Integer Width,
            Integer Height);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(27)</p>
     * @param Message [in] {@code Integer}
     * @param wParam [in] {@code Integer}
     * @param lParam [in] {@code Integer}
     */
    @ComMethod(name = "SendWindowMessage", dispId = 0xe)
    void SendWindowMessage(Integer Message,
            Integer wParam,
            Integer lParam);
            
    
}