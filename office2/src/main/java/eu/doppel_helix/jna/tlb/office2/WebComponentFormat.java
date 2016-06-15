
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CD102-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CD102-0000-0000-C000-000000000046}")
public interface WebComponentFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "URL", dispId = 0x3)
    String getURL();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "URL", dispId = 0x3)
    void setURL(String param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "HTML", dispId = 0x4)
    String getHTML();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "HTML", dispId = 0x4)
    void setHTML(String param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Name", dispId = 0x5)
    String getName();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Name", dispId = 0x5)
    void setName(String param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6)
    Integer getWidth();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7)
    Integer getHeight();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "PreviewGraphic", dispId = 0x8)
    String getPreviewGraphic();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "PreviewGraphic", dispId = 0x8)
    void setPreviewGraphic(String param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "LaunchPropertiesWindow", dispId = 0x9)
    void LaunchPropertiesWindow();
            
    
}