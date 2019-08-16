
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C033B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C033B-0000-0000-C000-000000000046}")
public interface _CustomTaskPane extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Title", dispId = 0x0)
    String getTitle();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Window", dispId = 0x2)
    com.sun.jna.platform.win32.COM.util.IDispatch getWindow();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x3)
    Boolean getVisible();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x3)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ContentControl", dispId = 0x4)
    com.sun.jna.platform.win32.COM.util.IDispatch getContentControl();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5)
    Integer getHeight();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x5)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6)
    Integer getWidth();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x6)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "DockPosition", dispId = 0x7)
    MsoCTPDockPosition getDockPosition();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code MsoCTPDockPosition}
     */
    @ComProperty(name = "DockPosition", dispId = 0x7)
    void setDockPosition(MsoCTPDockPosition param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "DockPositionRestrict", dispId = 0x8)
    MsoCTPDockPositionRestrict getDockPositionRestrict();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code MsoCTPDockPositionRestrict}
     */
    @ComProperty(name = "DockPositionRestrict", dispId = 0x8)
    void setDockPositionRestrict(MsoCTPDockPositionRestrict param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x9)
    void Delete();
            
    
}