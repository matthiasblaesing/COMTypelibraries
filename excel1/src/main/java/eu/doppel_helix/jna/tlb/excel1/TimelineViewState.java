
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244E0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244E0-0000-0000-C000-000000000046}")
public interface TimelineViewState extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xc43)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ShowHeader", dispId = 0xc43)
    Boolean getShowHeader();
            
    /**
     * <p>id(0xc43)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowHeader", dispId = 0xc43)
    void setShowHeader(Boolean param0);
            
    /**
     * <p>id(0xc44)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ShowSelectionLabel", dispId = 0xc44)
    Boolean getShowSelectionLabel();
            
    /**
     * <p>id(0xc44)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowSelectionLabel", dispId = 0xc44)
    void setShowSelectionLabel(Boolean param0);
            
    /**
     * <p>id(0xc45)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ShowTimeLevel", dispId = 0xc45)
    Boolean getShowTimeLevel();
            
    /**
     * <p>id(0xc45)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTimeLevel", dispId = 0xc45)
    void setShowTimeLevel(Boolean param0);
            
    /**
     * <p>id(0xc46)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ShowHorizontalScrollbar", dispId = 0xc46)
    Boolean getShowHorizontalScrollbar();
            
    /**
     * <p>id(0xc46)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowHorizontalScrollbar", dispId = 0xc46)
    void setShowHorizontalScrollbar(Boolean param0);
            
    /**
     * <p>id(0xba4)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Level", dispId = 0xba4)
    XlTimelineLevel getLevel();
            
    /**
     * <p>id(0xba4)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code XlTimelineLevel}
     */
    @ComProperty(name = "Level", dispId = 0xba4)
    void setLevel(XlTimelineLevel param0);
            
    
}