
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209A6-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209A6-0000-0000-C000-000000000046}")
public interface Zoom {
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
    @ComProperty(name = "Percentage", dispId = 0x0)
    Integer getPercentage();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Percentage", dispId = 0x0)
    void setPercentage(Integer param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "PageFit", dispId = 0x1)
    WdPageFit getPageFit();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "PageFit", dispId = 0x1)
    void setPageFit(WdPageFit param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "PageRows", dispId = 0x2)
    Integer getPageRows();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "PageRows", dispId = 0x2)
    void setPageRows(Integer param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "PageColumns", dispId = 0x3)
    Integer getPageColumns();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "PageColumns", dispId = 0x3)
    void setPageColumns(Integer param0);
            
    
}