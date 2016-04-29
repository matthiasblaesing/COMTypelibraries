
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244E0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244E0-0000-0000-C000-000000000046}")
public interface TimelineViewState {
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
     * <p>id(0xc43)</p>
     */
    @ComProperty(name = "ShowHeader", dispId = 0xc43)
    Boolean getShowHeader();
            
    /**
     * <p>id(0xc43)</p>
     */
    @ComProperty(name = "ShowHeader", dispId = 0xc43)
    void setShowHeader(Boolean param0);
            
    /**
     * <p>id(0xc44)</p>
     */
    @ComProperty(name = "ShowSelectionLabel", dispId = 0xc44)
    Boolean getShowSelectionLabel();
            
    /**
     * <p>id(0xc44)</p>
     */
    @ComProperty(name = "ShowSelectionLabel", dispId = 0xc44)
    void setShowSelectionLabel(Boolean param0);
            
    /**
     * <p>id(0xc45)</p>
     */
    @ComProperty(name = "ShowTimeLevel", dispId = 0xc45)
    Boolean getShowTimeLevel();
            
    /**
     * <p>id(0xc45)</p>
     */
    @ComProperty(name = "ShowTimeLevel", dispId = 0xc45)
    void setShowTimeLevel(Boolean param0);
            
    /**
     * <p>id(0xc46)</p>
     */
    @ComProperty(name = "ShowHorizontalScrollbar", dispId = 0xc46)
    Boolean getShowHorizontalScrollbar();
            
    /**
     * <p>id(0xc46)</p>
     */
    @ComProperty(name = "ShowHorizontalScrollbar", dispId = 0xc46)
    void setShowHorizontalScrollbar(Boolean param0);
            
    /**
     * <p>id(0xba4)</p>
     */
    @ComProperty(name = "Level", dispId = 0xba4)
    XlTimelineLevel getLevel();
            
    /**
     * <p>id(0xba4)</p>
     */
    @ComProperty(name = "Level", dispId = 0xba4)
    void setLevel(XlTimelineLevel param0);
            
    
}