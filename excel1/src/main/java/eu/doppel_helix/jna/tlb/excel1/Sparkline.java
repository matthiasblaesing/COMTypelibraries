
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B9-0000-0000-C000-000000000046}")
public interface Sparkline extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x575)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Location", dispId = 0x575)
    Range getLocation();
            
    /**
     * <p>id(0x2ae)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    String getSourceData();
            
    /**
     * <p>id(0x2ae)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    void setSourceData(String param0);
            
    /**
     * <p>id(0xb85)</p>
     * <p>vtableId(14)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "ModifyLocation", dispId = 0xb85)
    void ModifyLocation(Range Range);
            
    /**
     * <p>id(0xb86)</p>
     * <p>vtableId(15)</p>
     * @param Formula [in] {@code String}
     */
    @ComMethod(name = "ModifySourceData", dispId = 0xb86)
    void ModifySourceData(String Formula);
            
    
}