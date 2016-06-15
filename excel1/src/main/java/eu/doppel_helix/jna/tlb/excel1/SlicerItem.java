
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C9-0000-0000-C000-000000000046}")
public interface SlicerItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
    SlicerCache getParent();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x2d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    Object getSourceName();
            
    /**
     * <p>id(0x864)</p>
     */
    @ComProperty(name = "SourceNameStandard", dispId = 0x864)
    String getSourceNameStandard();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x463)</p>
     */
    @ComProperty(name = "Selected", dispId = 0x463)
    Boolean getSelected();
            
    /**
     * <p>id(0x463)</p>
     */
    @ComProperty(name = "Selected", dispId = 0x463)
    void setSelected(Boolean param0);
            
    /**
     * <p>id(0xbad)</p>
     */
    @ComProperty(name = "HasData", dispId = 0xbad)
    Boolean getHasData();
            
    
}